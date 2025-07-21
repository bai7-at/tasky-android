package io.embrace.android.embracesdk.internal.logs;

import defpackage.du8;
import defpackage.ss2;
import defpackage.zq3;
import io.embrace.android.embracesdk.Embrace;
import io.embrace.android.embracesdk.LogExceptionType;
import io.embrace.android.embracesdk.Severity;
import io.embrace.android.embracesdk.arch.destination.LogEventData;
import io.embrace.android.embracesdk.arch.destination.LogWriter;
import io.embrace.android.embracesdk.arch.schema.EmbType;
import io.embrace.android.embracesdk.arch.schema.SchemaType;
import io.embrace.android.embracesdk.arch.schema.TelemetryAttributes;
import io.embrace.android.embracesdk.config.ConfigService;
import io.embrace.android.embracesdk.internal.clock.Clock;
import io.embrace.android.embracesdk.internal.utils.Uuid;
import io.embrace.android.embracesdk.logging.InternalEmbraceLogger;
import io.embrace.android.embracesdk.opentelemetry.EmbraceAttributeKeysKt;
import io.embrace.android.embracesdk.opentelemetry.OpenTelemetryAttributeKeysKt;
import io.embrace.android.embracesdk.session.properties.EmbraceSessionProperties;
import io.embrace.android.embracesdk.worker.BackgroundWorker;
import io.embrace.android.embracesdk.worker.TaskPriority;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.collections.t;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.FunctionReferenceImpl;

/* loaded from: classes5.dex */
public final class EmbraceLogService implements LogService {
    public static final Companion Companion = new Companion(null);
    private static final int LOG_MESSAGE_UNITY_MAXIMUM_ALLOWED_LENGTH = 16384;
    private final Embrace.AppFramework appFramework;
    private final BackgroundWorker backgroundWorker;
    private final ConfigService configService;
    private final Map<Severity, LogCounter> logCounters;
    private final LogWriter logWriter;
    private final InternalEmbraceLogger logger;
    private final EmbraceSessionProperties sessionProperties;
    private int unhandledExceptionsCount;

    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public final /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[Severity.values().length];
            $EnumSwitchMapping$0 = iArr;
            iArr[Severity.INFO.ordinal()] = 1;
            iArr[Severity.WARNING.ordinal()] = 2;
        }
    }

    public EmbraceLogService(LogWriter logWriter, ConfigService configService, Embrace.AppFramework appFramework, EmbraceSessionProperties embraceSessionProperties, BackgroundWorker backgroundWorker, InternalEmbraceLogger internalEmbraceLogger, Clock clock) {
        zq3.h(logWriter, "logWriter");
        zq3.h(configService, "configService");
        zq3.h(appFramework, "appFramework");
        zq3.h(embraceSessionProperties, "sessionProperties");
        zq3.h(backgroundWorker, "backgroundWorker");
        zq3.h(internalEmbraceLogger, "logger");
        zq3.h(clock, "clock");
        this.logWriter = logWriter;
        this.configService = configService;
        this.appFramework = appFramework;
        this.sessionProperties = embraceSessionProperties;
        this.backgroundWorker = backgroundWorker;
        this.logger = internalEmbraceLogger;
        Severity severity = Severity.INFO;
        Pair a = du8.a(severity, new LogCounter(severity.name(), clock, new EmbraceLogService$logCounters$1(configService.getLogMessageBehavior()), internalEmbraceLogger));
        Severity severity2 = Severity.WARNING;
        Pair a2 = du8.a(severity2, new LogCounter(severity2.name(), clock, new EmbraceLogService$logCounters$2(configService.getLogMessageBehavior()), internalEmbraceLogger));
        Severity severity3 = Severity.ERROR;
        this.logCounters = t.m(a, a2, du8.a(severity3, new LogCounter(severity3.name(), clock, new EmbraceLogService$logCounters$3(configService.getLogMessageBehavior()), internalEmbraceLogger)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void addLogEventData(String str, Severity severity, TelemetryAttributes telemetryAttributes, ss2 ss2Var) {
        String attribute;
        if (shouldLogBeGated(severity) || (attribute = telemetryAttributes.getAttribute(OpenTelemetryAttributeKeysKt.getLogRecordUid())) == null || !((LogCounter) t.j(this.logCounters, severity)).addIfAllowed(attribute)) {
            return;
        }
        LogWriter.DefaultImpls.addLog$default(this.logWriter, new LogEventData((SchemaType) ss2Var.invoke(telemetryAttributes), severity, trimToMaxLength(str)), null, 2, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final TelemetryAttributes createTelemetryAttributes(Map<String, ? extends Object> map) {
        Map i;
        ConfigService configService = this.configService;
        EmbraceSessionProperties embraceSessionProperties = this.sessionProperties;
        if (map != null) {
            i = new LinkedHashMap(t.e(map.size()));
            Iterator<T> it2 = map.entrySet().iterator();
            while (it2.hasNext()) {
                Map.Entry entry = (Map.Entry) it2.next();
                i.put(entry.getKey(), entry.getValue().toString());
            }
        } else {
            i = t.i();
        }
        TelemetryAttributes telemetryAttributes = new TelemetryAttributes(configService, embraceSessionProperties, i);
        telemetryAttributes.setAttribute(OpenTelemetryAttributeKeysKt.getLogRecordUid(), Uuid.getEmbUuid$default(null, 1, null));
        return telemetryAttributes;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void populateLogExceptionAttributes(TelemetryAttributes telemetryAttributes, LogExceptionType logExceptionType, String str, String str2, String str3) {
        telemetryAttributes.setAttribute(EmbraceAttributeKeysKt.getEmbExceptionHandling(), logExceptionType.getValue$embrace_android_sdk_release());
        if (str2 != null) {
            telemetryAttributes.setAttribute(OpenTelemetryAttributeKeysKt.getExceptionType(), str2);
        }
        if (str3 != null) {
            telemetryAttributes.setAttribute(OpenTelemetryAttributeKeysKt.getExceptionMessage(), str3);
        }
        if (str != null) {
            telemetryAttributes.setAttribute(OpenTelemetryAttributeKeysKt.getExceptionStacktrace(), str);
        }
    }

    private final boolean shouldLogBeGated(Severity severity) {
        int i = WhenMappings.$EnumSwitchMapping$0[severity.ordinal()];
        if (i == 1) {
            return this.configService.getSessionBehavior().shouldGateInfoLog();
        }
        if (i != 2) {
            return false;
        }
        return this.configService.getSessionBehavior().shouldGateWarnLog();
    }

    private final String trimToMaxLength(String str) {
        int logMessageMaximumAllowedLength = this.appFramework == Embrace.AppFramework.UNITY ? 16384 : this.configService.getLogMessageBehavior().getLogMessageMaximumAllowedLength();
        if (str.length() <= logMessageMaximumAllowedLength) {
            return str;
        }
        int i = logMessageMaximumAllowedLength >= 3 ? logMessageMaximumAllowedLength - 3 : 125;
        this.logger.log("Truncating message to " + str.length() + " characters", InternalEmbraceLogger.Severity.WARNING, null, false);
        StringBuilder sb = new StringBuilder();
        String substring = str.substring(0, i);
        zq3.g(substring, "(this as java.lang.Strin…ing(startIndex, endIndex)");
        sb.append(substring);
        sb.append("...");
        return sb.toString();
    }

    @Override // io.embrace.android.embracesdk.session.MemoryCleanerListener
    public void cleanCollections() {
        Iterator<Map.Entry<Severity, LogCounter>> it2 = this.logCounters.entrySet().iterator();
        while (it2.hasNext()) {
            it2.next().getValue().clear();
        }
    }

    @Override // io.embrace.android.embracesdk.internal.logs.BaseLogService
    public List<String> findErrorLogIds(long j, long j2) {
        return ((LogCounter) t.j(this.logCounters, Severity.ERROR)).findLogIds(j, j2);
    }

    @Override // io.embrace.android.embracesdk.internal.logs.BaseLogService
    public List<String> findInfoLogIds(long j, long j2) {
        return ((LogCounter) t.j(this.logCounters, Severity.INFO)).findLogIds(j, j2);
    }

    @Override // io.embrace.android.embracesdk.internal.logs.BaseLogService
    public List<String> findWarningLogIds(long j, long j2) {
        return ((LogCounter) t.j(this.logCounters, Severity.WARNING)).findLogIds(j, j2);
    }

    @Override // io.embrace.android.embracesdk.internal.logs.BaseLogService
    public int getErrorLogsAttemptedToSend() {
        return ((LogCounter) t.j(this.logCounters, Severity.ERROR)).getCount();
    }

    @Override // io.embrace.android.embracesdk.internal.logs.BaseLogService
    public int getInfoLogsAttemptedToSend() {
        return ((LogCounter) t.j(this.logCounters, Severity.INFO)).getCount();
    }

    @Override // io.embrace.android.embracesdk.internal.logs.BaseLogService
    public int getUnhandledExceptionsSent() {
        return this.unhandledExceptionsCount;
    }

    @Override // io.embrace.android.embracesdk.internal.logs.BaseLogService
    public int getWarnLogsAttemptedToSend() {
        return ((LogCounter) t.j(this.logCounters, Severity.WARNING)).getCount();
    }

    @Override // io.embrace.android.embracesdk.internal.logs.LogService
    public void log(final String str, final Severity severity, final Map<String, ? extends Object> map) {
        zq3.h(str, "message");
        zq3.h(severity, "severity");
        BackgroundWorker.submit$default(this.backgroundWorker, (TaskPriority) null, new Runnable() { // from class: io.embrace.android.embracesdk.internal.logs.EmbraceLogService$log$1

            /* renamed from: io.embrace.android.embracesdk.internal.logs.EmbraceLogService$log$1$1, reason: invalid class name */
            static final /* synthetic */ class AnonymousClass1 extends FunctionReferenceImpl implements ss2 {
                public static final AnonymousClass1 INSTANCE = new AnonymousClass1();

                AnonymousClass1() {
                    super(1, SchemaType.Log.class, "<init>", "<init>(Lio/embrace/android/embracesdk/arch/schema/TelemetryAttributes;)V", 0);
                }

                @Override // defpackage.ss2
                public final SchemaType.Log invoke(TelemetryAttributes telemetryAttributes) {
                    zq3.h(telemetryAttributes, "p1");
                    return new SchemaType.Log(telemetryAttributes);
                }
            }

            @Override // java.lang.Runnable
            public final void run() {
                TelemetryAttributes createTelemetryAttributes;
                EmbraceLogService embraceLogService = EmbraceLogService.this;
                String str2 = str;
                Severity severity2 = severity;
                createTelemetryAttributes = embraceLogService.createTelemetryAttributes(map);
                embraceLogService.addLogEventData(str2, severity2, createTelemetryAttributes, AnonymousClass1.INSTANCE);
            }
        }, 1, (Object) null);
    }

    @Override // io.embrace.android.embracesdk.internal.logs.LogService
    public void logException(final String str, final Severity severity, final LogExceptionType logExceptionType, final Map<String, ? extends Object> map, final String str2, Embrace.AppFramework appFramework, final String str3, final String str4) {
        zq3.h(str, "message");
        zq3.h(severity, "severity");
        zq3.h(logExceptionType, "logExceptionType");
        zq3.h(appFramework, "framework");
        BackgroundWorker.submit$default(this.backgroundWorker, (TaskPriority) null, new Runnable() { // from class: io.embrace.android.embracesdk.internal.logs.EmbraceLogService$logException$1

            /* renamed from: io.embrace.android.embracesdk.internal.logs.EmbraceLogService$logException$1$1, reason: invalid class name */
            static final /* synthetic */ class AnonymousClass1 extends FunctionReferenceImpl implements ss2 {
                public static final AnonymousClass1 INSTANCE = new AnonymousClass1();

                AnonymousClass1() {
                    super(1, SchemaType.Exception.class, "<init>", "<init>(Lio/embrace/android/embracesdk/arch/schema/TelemetryAttributes;)V", 0);
                }

                @Override // defpackage.ss2
                public final SchemaType.Exception invoke(TelemetryAttributes telemetryAttributes) {
                    zq3.h(telemetryAttributes, "p1");
                    return new SchemaType.Exception(telemetryAttributes);
                }
            }

            @Override // java.lang.Runnable
            public final void run() {
                TelemetryAttributes createTelemetryAttributes;
                int i;
                if (logExceptionType == LogExceptionType.UNHANDLED) {
                    EmbraceLogService embraceLogService = EmbraceLogService.this;
                    i = embraceLogService.unhandledExceptionsCount;
                    embraceLogService.unhandledExceptionsCount = i + 1;
                }
                createTelemetryAttributes = EmbraceLogService.this.createTelemetryAttributes(map);
                EmbraceLogService.this.populateLogExceptionAttributes(createTelemetryAttributes, logExceptionType, str2, str3, str4);
                EmbraceLogService.this.addLogEventData(str, severity, createTelemetryAttributes, AnonymousClass1.INSTANCE);
            }
        }, 1, (Object) null);
    }

    @Override // io.embrace.android.embracesdk.internal.logs.LogService
    public void logFlutterException(final String str, final Severity severity, final LogExceptionType logExceptionType, final Map<String, ? extends Object> map, final String str2, final String str3, final String str4, final String str5, final String str6) {
        zq3.h(str, "message");
        zq3.h(severity, "severity");
        zq3.h(logExceptionType, "logExceptionType");
        BackgroundWorker.submit$default(this.backgroundWorker, (TaskPriority) null, new Runnable() { // from class: io.embrace.android.embracesdk.internal.logs.EmbraceLogService$logFlutterException$1

            /* renamed from: io.embrace.android.embracesdk.internal.logs.EmbraceLogService$logFlutterException$1$3, reason: invalid class name */
            static final /* synthetic */ class AnonymousClass3 extends FunctionReferenceImpl implements ss2 {
                public static final AnonymousClass3 INSTANCE = new AnonymousClass3();

                AnonymousClass3() {
                    super(1, SchemaType.FlutterException.class, "<init>", "<init>(Lio/embrace/android/embracesdk/arch/schema/TelemetryAttributes;)V", 0);
                }

                @Override // defpackage.ss2
                public final SchemaType.FlutterException invoke(TelemetryAttributes telemetryAttributes) {
                    zq3.h(telemetryAttributes, "p1");
                    return new SchemaType.FlutterException(telemetryAttributes);
                }
            }

            @Override // java.lang.Runnable
            public final void run() {
                TelemetryAttributes createTelemetryAttributes;
                int i;
                if (logExceptionType == LogExceptionType.UNHANDLED) {
                    EmbraceLogService embraceLogService = EmbraceLogService.this;
                    i = embraceLogService.unhandledExceptionsCount;
                    embraceLogService.unhandledExceptionsCount = i + 1;
                }
                createTelemetryAttributes = EmbraceLogService.this.createTelemetryAttributes(map);
                EmbraceLogService.this.populateLogExceptionAttributes(createTelemetryAttributes, logExceptionType, str2, str3, str4);
                String str7 = str5;
                if (str7 != null) {
                    createTelemetryAttributes.setAttribute(EmbType.System.FlutterException.INSTANCE.getEmbFlutterExceptionContext(), str7);
                }
                String str8 = str6;
                if (str8 != null) {
                    createTelemetryAttributes.setAttribute(EmbType.System.FlutterException.INSTANCE.getEmbFlutterExceptionLibrary(), str8);
                }
                EmbraceLogService.this.addLogEventData(str, severity, createTelemetryAttributes, AnonymousClass3.INSTANCE);
            }
        }, 1, (Object) null);
    }
}
