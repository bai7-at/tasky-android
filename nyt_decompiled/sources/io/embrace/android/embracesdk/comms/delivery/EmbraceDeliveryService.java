package io.embrace.android.embracesdk.comms.delivery;

import androidx.recyclerview.widget.RecyclerView;
import com.amazonaws.event.ProgressEvent;
import com.amazonaws.services.s3.internal.Constants;
import com.amazonaws.services.s3.internal.crypto.JceEncryptionConstants;
import defpackage.gm0;
import defpackage.qs2;
import defpackage.ss2;
import defpackage.ww8;
import defpackage.zq3;
import io.embrace.android.embracesdk.comms.api.ApiService;
import io.embrace.android.embracesdk.internal.compression.ConditionalGzipOutputStream;
import io.embrace.android.embracesdk.internal.payload.Envelope;
import io.embrace.android.embracesdk.internal.payload.LogPayload;
import io.embrace.android.embracesdk.internal.serialization.PlatformSerializer;
import io.embrace.android.embracesdk.logging.InternalEmbraceLogger;
import io.embrace.android.embracesdk.ndk.NativeCrashService;
import io.embrace.android.embracesdk.payload.EventMessage;
import io.embrace.android.embracesdk.payload.NativeCrashData;
import io.embrace.android.embracesdk.payload.NetworkEvent;
import io.embrace.android.embracesdk.payload.Session;
import io.embrace.android.embracesdk.payload.SessionMessage;
import io.embrace.android.embracesdk.payload.SessionMessageKt;
import io.embrace.android.embracesdk.session.id.SessionIdTracker;
import io.embrace.android.embracesdk.session.orchestrator.SessionSnapshotType;
import io.embrace.android.embracesdk.worker.BackgroundWorker;
import io.embrace.android.embracesdk.worker.TaskPriority;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import kotlin.Result;
import kotlin.collections.i;
import kotlin.f;
import kotlin.jvm.internal.DefaultConstructorMarker;
import okhttp3.internal.http2.Http2;
import okhttp3.internal.http2.Http2Connection;

/* loaded from: classes5.dex */
public final class EmbraceDeliveryService implements DeliveryService {
    private static final long CRASH_TIMEOUT = 1;
    public static final Companion Companion = new Companion(null);
    private static final long SEND_SESSION_TIMEOUT = 1;
    private final ApiService apiService;
    private final BackgroundWorker backgroundWorker;
    private final DeliveryCacheManager cacheManager;
    private final InternalEmbraceLogger logger;
    private final PlatformSerializer serializer;

    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public EmbraceDeliveryService(DeliveryCacheManager deliveryCacheManager, ApiService apiService, BackgroundWorker backgroundWorker, PlatformSerializer platformSerializer, InternalEmbraceLogger internalEmbraceLogger) {
        zq3.h(deliveryCacheManager, "cacheManager");
        zq3.h(apiService, "apiService");
        zq3.h(backgroundWorker, "backgroundWorker");
        zq3.h(platformSerializer, "serializer");
        zq3.h(internalEmbraceLogger, "logger");
        this.cacheManager = deliveryCacheManager;
        this.apiService = apiService;
        this.backgroundWorker = backgroundWorker;
        this.serializer = platformSerializer;
        this.logger = internalEmbraceLogger;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void addCrashDataToCachedSession(final NativeCrashData nativeCrashData) {
        this.cacheManager.transformSession(nativeCrashData.getSessionId(), new ss2() { // from class: io.embrace.android.embracesdk.comms.delivery.EmbraceDeliveryService$addCrashDataToCachedSession$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // defpackage.ss2
            public final SessionMessage invoke(SessionMessage sessionMessage) {
                SessionMessage attachCrashToSession;
                zq3.h(sessionMessage, "sessionMessage");
                attachCrashToSession = EmbraceDeliveryService.this.attachCrashToSession(nativeCrashData, sessionMessage);
                return attachCrashToSession;
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final SessionMessage attachCrashToSession(NativeCrashData nativeCrashData, SessionMessage sessionMessage) {
        Session copy;
        SessionMessage copy2;
        copy = r1.copy((r51 & 1) != 0 ? r1.sessionId : null, (r51 & 2) != 0 ? r1.startTime : 0L, (r51 & 4) != 0 ? r1.number : 0, (r51 & 8) != 0 ? r1.messageType : null, (r51 & 16) != 0 ? r1.appState : null, (r51 & 32) != 0 ? r1.isColdStart : false, (r51 & 64) != 0 ? r1.endTime : null, (r51 & 128) != 0 ? r1.lastHeartbeatTime : null, (r51 & JceEncryptionConstants.SYMMETRIC_KEY_LENGTH) != 0 ? r1.terminationTime : null, (r51 & 512) != 0 ? r1.isEndedCleanly : null, (r51 & 1024) != 0 ? r1.isReceivedTermination : null, (r51 & ProgressEvent.PART_COMPLETED_EVENT_CODE) != 0 ? r1.eventIds : null, (r51 & ProgressEvent.PART_FAILED_EVENT_CODE) != 0 ? r1.infoLogIds : null, (r51 & 8192) != 0 ? r1.warningLogIds : null, (r51 & Http2.INITIAL_MAX_FRAME_SIZE) != 0 ? r1.errorLogIds : null, (r51 & 32768) != 0 ? r1.networkLogIds : null, (r51 & 65536) != 0 ? r1.infoLogsAttemptedToSend : null, (r51 & 131072) != 0 ? r1.warnLogsAttemptedToSend : null, (r51 & 262144) != 0 ? r1.errorLogsAttemptedToSend : null, (r51 & 524288) != 0 ? r1.exceptionError : null, (r51 & Constants.MB) != 0 ? r1.crashReportId : nativeCrashData.getNativeCrashId(), (r51 & 2097152) != 0 ? r1.endType : null, (r51 & 4194304) != 0 ? r1.startType : null, (r51 & 8388608) != 0 ? r1.orientations : null, (r51 & Http2Connection.OKHTTP_CLIENT_WINDOW_SIZE) != 0 ? r1.properties : null, (r51 & 33554432) != 0 ? r1.startupDuration : null, (r51 & 67108864) != 0 ? r1.startupThreshold : null, (r51 & 134217728) != 0 ? r1.sdkStartupDuration : null, (r51 & 268435456) != 0 ? r1.unhandledExceptions : null, (r51 & 536870912) != 0 ? r1.betaFeatures : null, (r51 & 1073741824) != 0 ? r1.symbols : null, (r51 & RecyclerView.UNDEFINED_DURATION) != 0 ? sessionMessage.getSession().webViewInfo : null);
        copy2 = sessionMessage.copy((r30 & 1) != 0 ? sessionMessage.session : copy, (r30 & 2) != 0 ? sessionMessage.userInfo : null, (r30 & 4) != 0 ? sessionMessage.appInfo : null, (r30 & 8) != 0 ? sessionMessage.deviceInfo : null, (r30 & 16) != 0 ? sessionMessage.performanceInfo : null, (r30 & 32) != 0 ? sessionMessage.breadcrumbs : null, (r30 & 64) != 0 ? sessionMessage.spans : null, (r30 & 128) != 0 ? sessionMessage.spanSnapshots : null, (r30 & JceEncryptionConstants.SYMMETRIC_KEY_LENGTH) != 0 ? sessionMessage.version : null, (r30 & 512) != 0 ? sessionMessage.resource : null, (r30 & 1024) != 0 ? sessionMessage.metadata : null, (r30 & ProgressEvent.PART_COMPLETED_EVENT_CODE) != 0 ? sessionMessage.newVersion : null, (r30 & ProgressEvent.PART_FAILED_EVENT_CODE) != 0 ? sessionMessage.f87type : null, (r30 & 8192) != 0 ? sessionMessage.data : null);
        return copy2;
    }

    private final void sendCachedCrash() {
        EventMessage loadCrash = this.cacheManager.loadCrash();
        if (loadCrash != null) {
            this.apiService.sendCrash(loadCrash);
        }
    }

    @Override // io.embrace.android.embracesdk.comms.delivery.DeliveryService
    public void saveLogs(Envelope<LogPayload> envelope) {
        zq3.h(envelope, "logEnvelope");
        this.apiService.saveLogEnvelope(envelope);
    }

    @Override // io.embrace.android.embracesdk.comms.delivery.DeliveryService
    public void sendCachedSessions(final qs2 qs2Var, final SessionIdTracker sessionIdTracker) {
        zq3.h(qs2Var, "nativeCrashServiceProvider");
        zq3.h(sessionIdTracker, "sessionIdTracker");
        sendCachedCrash();
        this.backgroundWorker.submit(TaskPriority.HIGH, new Runnable() { // from class: io.embrace.android.embracesdk.comms.delivery.EmbraceDeliveryService$sendCachedSessions$1
            @Override // java.lang.Runnable
            public final void run() {
                DeliveryCacheManager deliveryCacheManager;
                NativeCrashData andSendNativeCrash;
                DeliveryCacheManager deliveryCacheManager2;
                deliveryCacheManager = EmbraceDeliveryService.this.cacheManager;
                List<CachedSession> allCachedSessionIds = deliveryCacheManager.getAllCachedSessionIds();
                ArrayList arrayList = new ArrayList();
                for (Object obj : allCachedSessionIds) {
                    if (!zq3.c(((CachedSession) obj).getSessionId(), sessionIdTracker.getActiveSessionId())) {
                        arrayList.add(obj);
                    }
                }
                ArrayList<String> arrayList2 = new ArrayList(i.w(arrayList, 10));
                Iterator it2 = arrayList.iterator();
                while (it2.hasNext()) {
                    arrayList2.add(((CachedSession) it2.next()).getSessionId());
                }
                for (String str : arrayList2) {
                    deliveryCacheManager2 = EmbraceDeliveryService.this.cacheManager;
                    deliveryCacheManager2.transformSession(str, new ss2() { // from class: io.embrace.android.embracesdk.comms.delivery.EmbraceDeliveryService$sendCachedSessions$1$2$1
                        /* JADX WARN: Code restructure failed: missing block: B:9:0x0036, code lost:
                        
                            if (r0 == null) goto L10;
                         */
                        @Override // defpackage.ss2
                        /*
                            Code decompiled incorrectly, please refer to instructions dump.
                            To view partially-correct add '--show-bad-code' argument
                        */
                        public final io.embrace.android.embracesdk.payload.SessionMessage invoke(io.embrace.android.embracesdk.payload.SessionMessage r19) {
                            /*
                                r18 = this;
                                java.lang.String r0 = "sessionMessage"
                                r1 = r19
                                defpackage.zq3.h(r1, r0)
                                java.util.List r0 = r19.getSpans()
                                r2 = 10
                                if (r0 == 0) goto L38
                                java.lang.Iterable r0 = (java.lang.Iterable) r0
                                java.util.ArrayList r3 = new java.util.ArrayList
                                int r4 = kotlin.collections.i.w(r0, r2)
                                r3.<init>(r4)
                                java.util.Iterator r0 = r0.iterator()
                            L1e:
                                boolean r4 = r0.hasNext()
                                if (r4 == 0) goto L32
                                java.lang.Object r4 = r0.next()
                                io.embrace.android.embracesdk.internal.spans.EmbraceSpanData r4 = (io.embrace.android.embracesdk.internal.spans.EmbraceSpanData) r4
                                java.lang.String r4 = r4.getSpanId()
                                r3.add(r4)
                                goto L1e
                            L32:
                                java.util.Set r0 = kotlin.collections.i.c1(r3)
                                if (r0 != 0) goto L3c
                            L38:
                                java.util.Set r0 = kotlin.collections.b0.e()
                            L3c:
                                java.util.List r3 = r19.getSpanSnapshots()
                                if (r3 == 0) goto L9a
                                java.lang.Iterable r3 = (java.lang.Iterable) r3
                                java.util.ArrayList r4 = new java.util.ArrayList
                                r4.<init>()
                                java.util.Iterator r3 = r3.iterator()
                            L4d:
                                boolean r5 = r3.hasNext()
                                if (r5 == 0) goto L68
                                java.lang.Object r5 = r3.next()
                                r6 = r5
                                io.embrace.android.embracesdk.internal.spans.EmbraceSpanData r6 = (io.embrace.android.embracesdk.internal.spans.EmbraceSpanData) r6
                                java.lang.String r6 = r6.getSpanId()
                                boolean r6 = r0.contains(r6)
                                if (r6 != 0) goto L4d
                                r4.add(r5)
                                goto L4d
                            L68:
                                java.util.ArrayList r0 = new java.util.ArrayList
                                int r2 = kotlin.collections.i.w(r4, r2)
                                r0.<init>(r2)
                                java.util.Iterator r2 = r4.iterator()
                            L75:
                                boolean r3 = r2.hasNext()
                                if (r3 == 0) goto L9e
                                java.lang.Object r3 = r2.next()
                                io.embrace.android.embracesdk.internal.spans.EmbraceSpanData r3 = (io.embrace.android.embracesdk.internal.spans.EmbraceSpanData) r3
                                io.embrace.android.embracesdk.payload.Session r4 = r19.getSession()
                                java.lang.Long r4 = r4.getEndTime()
                                if (r4 == 0) goto L90
                                long r4 = r4.longValue()
                                goto L92
                            L90:
                                r4 = 0
                            L92:
                                io.embrace.android.embracesdk.internal.spans.EmbraceSpanData r3 = io.embrace.android.embracesdk.internal.payload.SpanMapperKt.toFailedSpan(r3, r4)
                                r0.add(r3)
                                goto L75
                            L9a:
                                java.util.List r0 = kotlin.collections.i.l()
                            L9e:
                                java.util.List r2 = r19.getSpans()
                                if (r2 != 0) goto La8
                                java.util.List r2 = kotlin.collections.i.l()
                            La8:
                                java.util.Collection r2 = (java.util.Collection) r2
                                java.lang.Iterable r0 = (java.lang.Iterable) r0
                                java.util.List r8 = kotlin.collections.i.F0(r2, r0)
                                java.util.List r9 = kotlin.collections.i.l()
                                r16 = 16191(0x3f3f, float:2.2688E-41)
                                r17 = 0
                                r2 = 0
                                r3 = 0
                                r4 = 0
                                r5 = 0
                                r6 = 0
                                r7 = 0
                                r10 = 0
                                r11 = 0
                                r12 = 0
                                r13 = 0
                                r14 = 0
                                r15 = 0
                                r1 = r19
                                io.embrace.android.embracesdk.payload.SessionMessage r0 = io.embrace.android.embracesdk.payload.SessionMessage.copy$default(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17)
                                return r0
                            */
                            throw new UnsupportedOperationException("Method not decompiled: io.embrace.android.embracesdk.comms.delivery.EmbraceDeliveryService$sendCachedSessions$1$2$1.invoke(io.embrace.android.embracesdk.payload.SessionMessage):io.embrace.android.embracesdk.payload.SessionMessage");
                        }
                    });
                }
                NativeCrashService nativeCrashService = (NativeCrashService) qs2Var.mo865invoke();
                if (nativeCrashService != null && (andSendNativeCrash = nativeCrashService.getAndSendNativeCrash()) != null) {
                    EmbraceDeliveryService.this.addCrashDataToCachedSession(andSendNativeCrash);
                }
                EmbraceDeliveryService.this.sendCachedSessions(arrayList);
            }
        });
    }

    @Override // io.embrace.android.embracesdk.comms.delivery.DeliveryService
    public void sendCrash(EventMessage eventMessage, boolean z) {
        zq3.h(eventMessage, "crash");
        try {
            Result.a aVar = Result.a;
            this.cacheManager.saveCrash(eventMessage);
            Future<?> sendCrash = this.apiService.sendCrash(eventMessage);
            if (z) {
                sendCrash.get(1L, TimeUnit.SECONDS);
            }
            Result.b(ww8.a);
        } catch (Throwable th) {
            Result.a aVar2 = Result.a;
            Result.b(f.a(th));
        }
    }

    @Override // io.embrace.android.embracesdk.comms.delivery.DeliveryService
    public void sendLog(EventMessage eventMessage) {
        zq3.h(eventMessage, "eventMessage");
        this.apiService.sendLog(eventMessage);
    }

    @Override // io.embrace.android.embracesdk.comms.delivery.DeliveryService
    public void sendLogs(Envelope<LogPayload> envelope) {
        zq3.h(envelope, "logEnvelope");
        this.apiService.sendLogEnvelope(envelope);
    }

    @Override // io.embrace.android.embracesdk.comms.delivery.DeliveryService
    public void sendMoment(EventMessage eventMessage) {
        zq3.h(eventMessage, "eventMessage");
        this.apiService.sendEvent(eventMessage);
    }

    @Override // io.embrace.android.embracesdk.comms.delivery.DeliveryService
    public void sendNetworkCall(NetworkEvent networkEvent) {
        zq3.h(networkEvent, "networkEvent");
        this.apiService.sendNetworkCall(networkEvent);
    }

    @Override // io.embrace.android.embracesdk.comms.delivery.DeliveryService
    public void sendSession(final SessionMessage sessionMessage, SessionSnapshotType sessionSnapshotType) {
        zq3.h(sessionMessage, "sessionMessage");
        zq3.h(sessionSnapshotType, "snapshotType");
        this.cacheManager.saveSession(sessionMessage, sessionSnapshotType);
        if (sessionSnapshotType == SessionSnapshotType.PERIODIC_CACHE) {
            return;
        }
        try {
            final String sessionId = sessionMessage.getSession().getSessionId();
            ss2 loadSessionAsAction = this.cacheManager.loadSessionAsAction(sessionId);
            if (loadSessionAsAction == null) {
                loadSessionAsAction = new ss2() { // from class: io.embrace.android.embracesdk.comms.delivery.EmbraceDeliveryService$sendSession$action$1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(1);
                    }

                    @Override // defpackage.ss2
                    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                        invoke((OutputStream) obj);
                        return ww8.a;
                    }

                    public final void invoke(OutputStream outputStream) {
                        PlatformSerializer platformSerializer;
                        zq3.h(outputStream, "stream");
                        ConditionalGzipOutputStream conditionalGzipOutputStream = new ConditionalGzipOutputStream(outputStream);
                        try {
                            platformSerializer = EmbraceDeliveryService.this.serializer;
                            platformSerializer.toJson((PlatformSerializer) sessionMessage, (Class<PlatformSerializer>) SessionMessage.class, (OutputStream) conditionalGzipOutputStream);
                            ww8 ww8Var = ww8.a;
                            gm0.a(conditionalGzipOutputStream, null);
                        } finally {
                        }
                    }
                };
            }
            Future<?> sendSession = this.apiService.sendSession(SessionMessageKt.isV2Payload(sessionMessage), loadSessionAsAction, new ss2() { // from class: io.embrace.android.embracesdk.comms.delivery.EmbraceDeliveryService$sendSession$future$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(1);
                }

                @Override // defpackage.ss2
                public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                    invoke(((Boolean) obj).booleanValue());
                    return ww8.a;
                }

                public final void invoke(boolean z) {
                    DeliveryCacheManager deliveryCacheManager;
                    InternalEmbraceLogger internalEmbraceLogger;
                    if (!z) {
                        String str = "Session deleted without request being sent: ID " + sessionId + ", timestamp " + sessionMessage.getSession().getStartTime();
                        internalEmbraceLogger = EmbraceDeliveryService.this.logger;
                        internalEmbraceLogger.log(str, InternalEmbraceLogger.Severity.WARNING, new SessionPurgeException(str), false);
                    }
                    deliveryCacheManager = EmbraceDeliveryService.this.cacheManager;
                    deliveryCacheManager.deleteSession(sessionId);
                }
            });
            if (sessionSnapshotType != SessionSnapshotType.JVM_CRASH || sendSession == null) {
                return;
            }
            sendSession.get(1L, TimeUnit.SECONDS);
        } catch (Exception unused) {
            this.logger.log("Failed to send session end message. Embrace will store the session message and attempt to deliver it at a future date.", InternalEmbraceLogger.Severity.INFO, null, true);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void sendCachedSessions(List<CachedSession> list) {
        for (final CachedSession cachedSession : list) {
            try {
                final String sessionId = cachedSession.getSessionId();
                ss2 loadSessionAsAction = this.cacheManager.loadSessionAsAction(sessionId);
                if (loadSessionAsAction != null) {
                    this.apiService.sendSession(false, loadSessionAsAction, new ss2() { // from class: io.embrace.android.embracesdk.comms.delivery.EmbraceDeliveryService$sendCachedSessions$$inlined$forEach$lambda$1
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(1);
                        }

                        @Override // defpackage.ss2
                        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                            invoke(((Boolean) obj).booleanValue());
                            return ww8.a;
                        }

                        public final void invoke(boolean z) {
                            DeliveryCacheManager deliveryCacheManager;
                            InternalEmbraceLogger internalEmbraceLogger;
                            if (!z) {
                                String str = "Cached session deleted without request being sent. File name: " + CachedSession.this.getFilename();
                                internalEmbraceLogger = this.logger;
                                internalEmbraceLogger.log(str, InternalEmbraceLogger.Severity.WARNING, new SessionPurgeException(str), false);
                            }
                            deliveryCacheManager = this.cacheManager;
                            deliveryCacheManager.deleteSession(sessionId);
                        }
                    });
                } else {
                    this.logger.log("Session " + sessionId + " not found", InternalEmbraceLogger.Severity.ERROR, null, false);
                }
            } catch (Throwable th) {
                this.logger.log("Could not send cached session", InternalEmbraceLogger.Severity.ERROR, th, true);
            }
        }
    }
}
