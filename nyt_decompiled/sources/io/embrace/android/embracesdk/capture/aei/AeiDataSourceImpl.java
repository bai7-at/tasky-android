package io.embrace.android.embracesdk.capture.aei;

import android.app.ActivityManager;
import android.app.ApplicationExitInfo;
import defpackage.qs2;
import defpackage.ro2;
import defpackage.ss2;
import defpackage.tf0;
import defpackage.ww8;
import defpackage.yj0;
import defpackage.zj8;
import defpackage.zq3;
import io.embrace.android.embracesdk.Severity;
import io.embrace.android.embracesdk.arch.datasource.DataSourceImpl;
import io.embrace.android.embracesdk.arch.destination.LogEventData;
import io.embrace.android.embracesdk.arch.destination.LogEventMapper;
import io.embrace.android.embracesdk.arch.destination.LogWriter;
import io.embrace.android.embracesdk.arch.limits.UpToLimitStrategy;
import io.embrace.android.embracesdk.arch.schema.SchemaType;
import io.embrace.android.embracesdk.capture.metadata.MetadataService;
import io.embrace.android.embracesdk.capture.user.UserService;
import io.embrace.android.embracesdk.config.behavior.AppExitInfoBehavior;
import io.embrace.android.embracesdk.internal.utils.BuildVersionChecker;
import io.embrace.android.embracesdk.internal.utils.EncodingExtensionsKt;
import io.embrace.android.embracesdk.internal.utils.VersionChecker;
import io.embrace.android.embracesdk.logging.InternalEmbraceLogger;
import io.embrace.android.embracesdk.logging.ReportingLoggerAction;
import io.embrace.android.embracesdk.payload.AppExitInfoData;
import io.embrace.android.embracesdk.payload.AppInfo;
import io.embrace.android.embracesdk.payload.BlobMessage;
import io.embrace.android.embracesdk.payload.BlobSession;
import io.embrace.android.embracesdk.payload.DeviceInfo;
import io.embrace.android.embracesdk.prefs.PreferencesService;
import io.embrace.android.embracesdk.session.id.SessionIdTracker;
import io.embrace.android.embracesdk.worker.BackgroundWorker;
import io.embrace.android.embracesdk.worker.TaskPriority;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.Future;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.collections.b0;
import kotlin.collections.i;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.text.Regex;
import kotlin.text.h;

/* loaded from: classes5.dex */
public final class AeiDataSourceImpl extends DataSourceImpl<LogWriter> implements AeiDataSource, LogEventMapper<BlobMessage> {
    public static final Companion Companion = new Companion(null);
    private static final int SDK_AEI_SEND_LIMIT = 32;
    private final ActivityManager activityManager;
    private final AppExitInfoBehavior appExitInfoBehavior;
    private volatile Future<?> backgroundExecution;
    private final BackgroundWorker backgroundWorker;
    private final VersionChecker buildVersionChecker;
    private final AtomicBoolean isSessionApplicationExitInfoDataReady;
    private final InternalEmbraceLogger logger;
    private final MetadataService metadataService;
    private final PreferencesService preferencesService;
    private final List<AppExitInfoData> sessionApplicationExitInfoData;
    private final SessionIdTracker sessionIdTracker;
    private final UserService userService;

    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public /* synthetic */ AeiDataSourceImpl(BackgroundWorker backgroundWorker, AppExitInfoBehavior appExitInfoBehavior, ActivityManager activityManager, PreferencesService preferencesService, MetadataService metadataService, SessionIdTracker sessionIdTracker, UserService userService, LogWriter logWriter, InternalEmbraceLogger internalEmbraceLogger, VersionChecker versionChecker, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(backgroundWorker, appExitInfoBehavior, activityManager, preferencesService, metadataService, sessionIdTracker, userService, logWriter, internalEmbraceLogger, (i & 512) != 0 ? BuildVersionChecker.INSTANCE : versionChecker);
    }

    private final AppExitInfoData buildSessionAppExitInfoData(ApplicationExitInfo applicationExitInfo, String str, String str2) {
        byte[] processStateSummary;
        int importance;
        long pss;
        int reason;
        long rss;
        int status;
        long timestamp;
        String description;
        processStateSummary = applicationExitInfo.getProcessStateSummary();
        if (processStateSummary == null) {
            processStateSummary = new byte[0];
        }
        zq3.g(processStateSummary, "appExitInfo.processStateSummary ?: ByteArray(0)");
        String str3 = new String(processStateSummary, yj0.b);
        String sessionIdValidationError = getSessionIdValidationError(str3);
        importance = applicationExitInfo.getImportance();
        Integer valueOf = Integer.valueOf(importance);
        pss = applicationExitInfo.getPss();
        Long valueOf2 = Long.valueOf(pss);
        reason = applicationExitInfo.getReason();
        Integer valueOf3 = Integer.valueOf(reason);
        rss = applicationExitInfo.getRss();
        Long valueOf4 = Long.valueOf(rss);
        status = applicationExitInfo.getStatus();
        Integer valueOf5 = Integer.valueOf(status);
        timestamp = applicationExitInfo.getTimestamp();
        Long valueOf6 = Long.valueOf(timestamp);
        description = applicationExitInfo.getDescription();
        return new AppExitInfoData(str3, sessionIdValidationError, valueOf, valueOf2, valueOf3, valueOf4, valueOf5, valueOf6, str, description, str2);
    }

    private final AppExitInfoBehavior.CollectTracesResult collectExitInfoTrace(ApplicationExitInfo applicationExitInfo) {
        try {
            String readTraceAsString = readTraceAsString(applicationExitInfo);
            if (readTraceAsString == null) {
                this.logger.log("AEI - No info trace collected", InternalEmbraceLogger.Severity.DEBUG, null, true);
                return null;
            }
            int traceMaxLimit = this.appExitInfoBehavior.getTraceMaxLimit();
            if (readTraceAsString.length() <= traceMaxLimit) {
                return new AppExitInfoBehavior.CollectTracesResult.Success(readTraceAsString);
            }
            InternalEmbraceLogger internalEmbraceLogger = this.logger;
            String str = "AEI - Blob size was reduced. Current size is " + readTraceAsString.length() + " and the limit is " + traceMaxLimit;
            internalEmbraceLogger.log(str, InternalEmbraceLogger.Severity.INFO, new ReportingLoggerAction.NotAnException(str), false);
            return new AppExitInfoBehavior.CollectTracesResult.TooLarge(h.l1(readTraceAsString, traceMaxLimit));
        } catch (IOException e) {
            this.logger.log("AEI - IOException: " + e.getMessage(), InternalEmbraceLogger.Severity.WARNING, e, true);
            return new AppExitInfoBehavior.CollectTracesResult.TraceException("ioexception: " + e.getMessage());
        } catch (OutOfMemoryError e2) {
            this.logger.log("AEI - Out of Memory: " + e2.getMessage(), InternalEmbraceLogger.Severity.WARNING, e2, true);
            return new AppExitInfoBehavior.CollectTracesResult.TraceException("oom: " + e2.getMessage());
        } catch (Throwable th) {
            this.logger.log("AEI - An error occurred: " + th.getMessage(), InternalEmbraceLogger.Severity.WARNING, th, true);
            return new AppExitInfoBehavior.CollectTracesResult.TraceException("error: " + th.getMessage());
        }
    }

    private final String generateUniqueHash(ApplicationExitInfo applicationExitInfo) {
        long timestamp;
        int pid;
        StringBuilder sb = new StringBuilder();
        timestamp = applicationExitInfo.getTimestamp();
        sb.append(timestamp);
        sb.append('_');
        pid = applicationExitInfo.getPid();
        sb.append(pid);
        return sb.toString();
    }

    /* JADX WARN: Code restructure failed: missing block: B:3:0x000a, code lost:
    
        r0 = r1.getHistoricalProcessExitReasons(null, 0, r0);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final java.util.List<android.app.ApplicationExitInfo> getHistoricalProcessExitReasons() {
        /*
            r6 = this;
            io.embrace.android.embracesdk.config.behavior.AppExitInfoBehavior r0 = r6.appExitInfoBehavior
            int r0 = r0.appExitInfoMaxNum()
            android.app.ActivityManager r1 = r6.activityManager
            if (r1 == 0) goto L30
            r2 = 0
            r3 = 0
            java.util.List r0 = defpackage.qo2.a(r1, r2, r3, r0)
            if (r0 != 0) goto L13
            goto L30
        L13:
            int r1 = r0.size()
            r2 = 32
            if (r1 <= r2) goto L2f
            io.embrace.android.embracesdk.logging.InternalEmbraceLogger r6 = r6.logger
            io.embrace.android.embracesdk.logging.InternalEmbraceLogger$Severity r1 = io.embrace.android.embracesdk.logging.InternalEmbraceLogger.Severity.INFO
            io.embrace.android.embracesdk.logging.ReportingLoggerAction$NotAnException r4 = new io.embrace.android.embracesdk.logging.ReportingLoggerAction$NotAnException
            java.lang.String r5 = "AEI - size greater than 32"
            r4.<init>(r5)
            r6.log(r5, r1, r4, r3)
            java.lang.Iterable r0 = (java.lang.Iterable) r0
            java.util.List r0 = kotlin.collections.i.P0(r0, r2)
        L2f:
            return r0
        L30:
            java.util.List r6 = kotlin.collections.i.l()
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: io.embrace.android.embracesdk.capture.aei.AeiDataSourceImpl.getHistoricalProcessExitReasons():java.util.List");
    }

    private final String getSessionIdValidationError(String str) {
        if (str.length() == 0 || new Regex("^[0-9a-fA-F]{32}$").d(str)) {
            return "";
        }
        return "invalid session ID: " + str;
    }

    private final String getTrace(AppExitInfoBehavior.CollectTracesResult collectTracesResult) {
        if ((collectTracesResult instanceof AppExitInfoBehavior.CollectTracesResult.Success) || (collectTracesResult instanceof AppExitInfoBehavior.CollectTracesResult.TooLarge)) {
            return collectTracesResult.getResult();
        }
        return null;
    }

    private final String getTraceStatus(AppExitInfoBehavior.CollectTracesResult collectTracesResult) {
        if (collectTracesResult instanceof AppExitInfoBehavior.CollectTracesResult.Success) {
            return null;
        }
        return collectTracesResult instanceof AppExitInfoBehavior.CollectTracesResult.TooLarge ? "Trace was too large, sending truncated trace" : collectTracesResult.getResult();
    }

    private final List<ApplicationExitInfo> getUnsentExitReasons(List<ApplicationExitInfo> list) {
        List<ApplicationExitInfo> list2 = list;
        ArrayList arrayList = new ArrayList(i.w(list2, 10));
        Iterator<T> it2 = list2.iterator();
        while (it2.hasNext()) {
            arrayList.add(generateUniqueHash(ro2.a(it2.next())));
        }
        Set<String> c1 = i.c1(arrayList);
        Set<String> applicationExitInfoHistory = this.preferencesService.getApplicationExitInfoHistory();
        if (applicationExitInfoHistory == null) {
            applicationExitInfoHistory = b0.e();
        }
        Set O0 = i.O0(c1, applicationExitInfoHistory);
        this.preferencesService.setApplicationExitInfoHistory(c1);
        ArrayList arrayList2 = new ArrayList();
        for (Object obj : list2) {
            if (O0.contains(generateUniqueHash(ro2.a(obj)))) {
                arrayList2.add(obj);
            }
        }
        return arrayList2;
    }

    private final boolean isNdkProtobufFile(ApplicationExitInfo applicationExitInfo) {
        int reason;
        if (this.buildVersionChecker.isAtLeast(31)) {
            reason = applicationExitInfo.getReason();
            if (reason == 5) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void processApplicationExitInfo() {
        List<ApplicationExitInfo> unsentExitReasons = getUnsentExitReasons(getHistoricalProcessExitReasons());
        Iterator<T> it2 = unsentExitReasons.iterator();
        while (it2.hasNext()) {
            this.sessionApplicationExitInfoData.add(buildSessionAppExitInfoData(ro2.a(it2.next()), null, null));
        }
        this.isSessionApplicationExitInfoDataReady.set(true);
        processApplicationExitInfoBlobs(unsentExitReasons);
    }

    private final void processApplicationExitInfoBlobs(List<ApplicationExitInfo> list) {
        Iterator<T> it2 = list.iterator();
        while (it2.hasNext()) {
            ApplicationExitInfo a = ro2.a(it2.next());
            AppExitInfoBehavior.CollectTracesResult collectExitInfoTrace = collectExitInfoTrace(a);
            if (collectExitInfoTrace != null) {
                sendApplicationExitInfoWithTraces(i.e(buildSessionAppExitInfoData(a, getTrace(collectExitInfoTrace), getTraceStatus(collectExitInfoTrace))));
            }
        }
    }

    private final String readTraceAsString(ApplicationExitInfo applicationExitInfo) {
        InputStream traceInputStream;
        InputStream traceInputStream2;
        if (!isNdkProtobufFile(applicationExitInfo)) {
            traceInputStream = applicationExitInfo.getTraceInputStream();
            if (traceInputStream != null) {
                return zj8.f(new BufferedReader(new InputStreamReader(traceInputStream, yj0.b), 8192));
            }
            return null;
        }
        traceInputStream2 = applicationExitInfo.getTraceInputStream();
        byte[] c = traceInputStream2 != null ? tf0.c(traceInputStream2) : null;
        if (c != null) {
            return EncodingExtensionsKt.toUTF8String(c);
        }
        this.logger.log("AEI - No info trace collected", InternalEmbraceLogger.Severity.DEBUG, null, true);
        return null;
    }

    private final void sendApplicationExitInfoWithTraces(List<AppExitInfoData> list) {
        for (final AppExitInfoData appExitInfoData : list) {
            alterSessionSpan(new qs2() { // from class: io.embrace.android.embracesdk.capture.aei.AeiDataSourceImpl$sendApplicationExitInfoWithTraces$1$1
                public final boolean invoke() {
                    return true;
                }

                @Override // defpackage.qs2
                /* renamed from: invoke */
                public /* bridge */ /* synthetic */ Object mo865invoke() {
                    return Boolean.valueOf(invoke());
                }
            }, new ss2() { // from class: io.embrace.android.embracesdk.capture.aei.AeiDataSourceImpl$sendApplicationExitInfoWithTraces$$inlined$forEach$lambda$1

                /* renamed from: io.embrace.android.embracesdk.capture.aei.AeiDataSourceImpl$sendApplicationExitInfoWithTraces$$inlined$forEach$lambda$1$1, reason: invalid class name */
                static final /* synthetic */ class AnonymousClass1 extends FunctionReferenceImpl implements ss2 {
                    AnonymousClass1(AeiDataSourceImpl aeiDataSourceImpl) {
                        super(1, aeiDataSourceImpl, AeiDataSourceImpl.class, "toLogEventData", "toLogEventData(Lio/embrace/android/embracesdk/payload/BlobMessage;)Lio/embrace/android/embracesdk/arch/destination/LogEventData;", 0);
                    }

                    @Override // defpackage.ss2
                    public final LogEventData invoke(BlobMessage blobMessage) {
                        zq3.h(blobMessage, "p1");
                        return ((AeiDataSourceImpl) this.receiver).toLogEventData(blobMessage);
                    }
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(1);
                }

                @Override // defpackage.ss2
                public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                    invoke((LogWriter) obj);
                    return ww8.a;
                }

                public final void invoke(LogWriter logWriter) {
                    MetadataService metadataService;
                    MetadataService metadataService2;
                    SessionIdTracker sessionIdTracker;
                    UserService userService;
                    zq3.h(logWriter, "$receiver");
                    metadataService = this.metadataService;
                    AppInfo appInfo = metadataService.getAppInfo();
                    List e = i.e(AppExitInfoData.this);
                    metadataService2 = this.metadataService;
                    DeviceInfo deviceInfo = metadataService2.getDeviceInfo();
                    sessionIdTracker = this.sessionIdTracker;
                    BlobSession blobSession = new BlobSession(sessionIdTracker.getActiveSessionId());
                    userService = this.userService;
                    logWriter.addLog(new BlobMessage(appInfo, e, deviceInfo, blobSession, userService.getUserInfo(), 0, 32, null), new AnonymousClass1(this));
                }
            });
        }
    }

    @Override // io.embrace.android.embracesdk.arch.datasource.DataSourceImpl, io.embrace.android.embracesdk.arch.datasource.DataSource
    public void disableDataCapture() {
        try {
            Future<?> future = this.backgroundExecution;
            if (future != null) {
                future.cancel(true);
            }
            this.backgroundExecution = null;
        } catch (Throwable th) {
            this.logger.log("AEI - Failed to disable EmbraceApplicationExitInfoService work", InternalEmbraceLogger.Severity.WARNING, th, false);
        }
    }

    @Override // io.embrace.android.embracesdk.arch.datasource.DataSourceImpl, io.embrace.android.embracesdk.arch.datasource.DataSource
    public void enableDataCapture() {
        if (this.backgroundExecution != null) {
            return;
        }
        this.backgroundExecution = BackgroundWorker.submit$default(this.backgroundWorker, (TaskPriority) null, new Runnable() { // from class: io.embrace.android.embracesdk.capture.aei.AeiDataSourceImpl$enableDataCapture$1
            @Override // java.lang.Runnable
            public final void run() {
                InternalEmbraceLogger internalEmbraceLogger;
                try {
                    AeiDataSourceImpl.this.processApplicationExitInfo();
                } catch (Throwable th) {
                    internalEmbraceLogger = AeiDataSourceImpl.this.logger;
                    internalEmbraceLogger.log("AEI - Failed to process AEIs due to unexpected error", InternalEmbraceLogger.Severity.WARNING, th, true);
                }
            }
        }, 1, (Object) null);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AeiDataSourceImpl(BackgroundWorker backgroundWorker, AppExitInfoBehavior appExitInfoBehavior, ActivityManager activityManager, PreferencesService preferencesService, MetadataService metadataService, SessionIdTracker sessionIdTracker, UserService userService, LogWriter logWriter, InternalEmbraceLogger internalEmbraceLogger, VersionChecker versionChecker) {
        super(logWriter, internalEmbraceLogger, new UpToLimitStrategy(internalEmbraceLogger, new qs2() { // from class: io.embrace.android.embracesdk.capture.aei.AeiDataSourceImpl.1
            public final int invoke() {
                return 32;
            }

            @Override // defpackage.qs2
            /* renamed from: invoke, reason: collision with other method in class */
            public /* bridge */ /* synthetic */ Object mo865invoke() {
                return Integer.valueOf(invoke());
            }
        }));
        zq3.h(backgroundWorker, "backgroundWorker");
        zq3.h(appExitInfoBehavior, "appExitInfoBehavior");
        zq3.h(preferencesService, "preferencesService");
        zq3.h(metadataService, "metadataService");
        zq3.h(sessionIdTracker, "sessionIdTracker");
        zq3.h(userService, "userService");
        zq3.h(logWriter, "logWriter");
        zq3.h(internalEmbraceLogger, "logger");
        zq3.h(versionChecker, "buildVersionChecker");
        this.backgroundWorker = backgroundWorker;
        this.appExitInfoBehavior = appExitInfoBehavior;
        this.activityManager = activityManager;
        this.preferencesService = preferencesService;
        this.metadataService = metadataService;
        this.sessionIdTracker = sessionIdTracker;
        this.userService = userService;
        this.logger = internalEmbraceLogger;
        this.buildVersionChecker = versionChecker;
        this.sessionApplicationExitInfoData = new ArrayList();
        this.isSessionApplicationExitInfoDataReady = new AtomicBoolean(false);
    }

    @Override // io.embrace.android.embracesdk.arch.destination.LogEventMapper
    public LogEventData toLogEventData(BlobMessage blobMessage) {
        zq3.h(blobMessage, "obj");
        AppExitInfoData appExitInfoData = (AppExitInfoData) i.J0(blobMessage.getApplicationExits());
        SchemaType.AeiLog aeiLog = new SchemaType.AeiLog(appExitInfoData);
        Severity severity = Severity.INFO;
        String trace$embrace_android_sdk_release = appExitInfoData.getTrace$embrace_android_sdk_release();
        if (trace$embrace_android_sdk_release == null) {
            trace$embrace_android_sdk_release = "";
        }
        return new LogEventData(aeiLog, severity, trace$embrace_android_sdk_release);
    }
}
