package io.embrace.android.embracesdk.comms.delivery;

import com.facebook.AuthenticationTokenClaims;
import defpackage.ss2;
import defpackage.tp0;
import defpackage.ww8;
import defpackage.zq3;
import io.embrace.android.embracesdk.internal.Systrace;
import io.embrace.android.embracesdk.internal.utils.Uuid;
import io.embrace.android.embracesdk.logging.InternalEmbraceLogger;
import io.embrace.android.embracesdk.payload.EventMessage;
import io.embrace.android.embracesdk.payload.SessionMessage;
import io.embrace.android.embracesdk.payload.SessionMessageKt;
import io.embrace.android.embracesdk.session.orchestrator.SessionSnapshotType;
import io.embrace.android.embracesdk.worker.BackgroundWorker;
import io.embrace.android.embracesdk.worker.TaskPriority;
import java.io.Closeable;
import java.util.Comparator;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Result;
import kotlin.collections.i;
import kotlin.f;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes5.dex */
public final class EmbraceDeliveryCacheManager implements Closeable, DeliveryCacheManager {
    private static final String CRASH_FILE_NAME = "crash.json";
    public static final Companion Companion = new Companion(null);
    public static final int MAX_SESSIONS_CACHED = 64;
    private static final String PENDING_API_CALLS_FILE_NAME = "failed_api_calls.json";
    private final BackgroundWorker backgroundWorker;
    private final CacheService cacheService;
    private final Map<String, CachedSession> cachedSessions;
    private final InternalEmbraceLogger logger;

    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public EmbraceDeliveryCacheManager(CacheService cacheService, BackgroundWorker backgroundWorker, InternalEmbraceLogger internalEmbraceLogger) {
        zq3.h(cacheService, "cacheService");
        zq3.h(backgroundWorker, "backgroundWorker");
        zq3.h(internalEmbraceLogger, "logger");
        this.cacheService = cacheService;
        this.backgroundWorker = backgroundWorker;
        this.logger = internalEmbraceLogger;
        this.cachedSessions = new LinkedHashMap();
    }

    private final void deleteOldestSessions() {
        List<CachedSession> P0 = i.P0(i.N0(this.cachedSessions.values(), new Comparator<T>() { // from class: io.embrace.android.embracesdk.comms.delivery.EmbraceDeliveryCacheManager$deleteOldestSessions$$inlined$sortedBy$1
            /* JADX WARN: Multi-variable type inference failed */
            @Override // java.util.Comparator
            public final int compare(T t, T t2) {
                return tp0.d(Long.valueOf(((CachedSession) t).getTimestampMs()), Long.valueOf(((CachedSession) t2).getTimestampMs()));
            }
        }), this.cachedSessions.size() - 63);
        if (P0.isEmpty()) {
            return;
        }
        for (CachedSession cachedSession : P0) {
            String str = "Too many cached sessions. Purging session with file name " + cachedSession.getFilename();
            this.logger.log(str, InternalEmbraceLogger.Severity.WARNING, new SessionPurgeException(str), false);
            deleteSession(cachedSession.getSessionId());
        }
    }

    private final PendingApiCalls loadPendingApiCallsOldVersion() {
        Object b;
        try {
            Result.a aVar = Result.a;
            b = Result.b(this.cacheService.loadOldPendingApiCalls(PENDING_API_CALLS_FILE_NAME));
        } catch (Throwable th) {
            Result.a aVar2 = Result.a;
            b = Result.b(f.a(th));
        }
        if (!Result.h(b)) {
            return null;
        }
        PendingApiCalls pendingApiCalls = new PendingApiCalls(null, 1, null);
        if (Result.g(b)) {
            b = null;
        }
        List list = (List) b;
        if (list != null) {
            Iterator it2 = list.iterator();
            while (it2.hasNext()) {
                pendingApiCalls.add((PendingApiCall) it2.next());
            }
        }
        return pendingApiCalls;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void saveSessionBytes(final String str, final long j, boolean z, boolean z2, final boolean z3, final ss2 ss2Var) {
        if (z) {
            saveSessionBytesImpl(str, j, z3, ss2Var);
        } else {
            this.backgroundWorker.submit(z2 ? TaskPriority.LOW : TaskPriority.CRITICAL, new Runnable() { // from class: io.embrace.android.embracesdk.comms.delivery.EmbraceDeliveryCacheManager$saveSessionBytes$1
                @Override // java.lang.Runnable
                public final void run() {
                    EmbraceDeliveryCacheManager.this.saveSessionBytesImpl(str, j, z3, ss2Var);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void saveSessionBytesImpl(String str, long j, boolean z, ss2 ss2Var) {
        try {
            synchronized (this.cachedSessions) {
                try {
                    CachedSession cachedSession = this.cachedSessions.get(str);
                    if (cachedSession == null) {
                        cachedSession = CachedSession.Companion.create(str, j, z);
                    }
                    CachedSession cachedSession2 = cachedSession;
                    ss2Var.invoke(cachedSession2.getFilename());
                    if (!this.cachedSessions.containsKey(cachedSession2.getSessionId())) {
                        this.cachedSessions.put(cachedSession2.getSessionId(), cachedSession2);
                    }
                    ww8 ww8Var = ww8.a;
                } finally {
                }
            }
        } catch (Throwable th) {
            this.logger.log("Failed to cache current active session", InternalEmbraceLogger.Severity.ERROR, th, true);
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
    }

    @Override // io.embrace.android.embracesdk.comms.delivery.DeliveryCacheManager
    public void deleteCrash() {
        this.cacheService.deleteFile(CRASH_FILE_NAME);
    }

    @Override // io.embrace.android.embracesdk.comms.delivery.DeliveryCacheManager
    public void deletePayload(final String str) {
        zq3.h(str, AuthenticationTokenClaims.JSON_KEY_NAME);
        BackgroundWorker.submit$default(this.backgroundWorker, (TaskPriority) null, new Runnable() { // from class: io.embrace.android.embracesdk.comms.delivery.EmbraceDeliveryCacheManager$deletePayload$1
            @Override // java.lang.Runnable
            public final void run() {
                CacheService cacheService;
                cacheService = EmbraceDeliveryCacheManager.this.cacheService;
                cacheService.deleteFile(str);
            }
        }, 1, (Object) null);
    }

    @Override // io.embrace.android.embracesdk.comms.delivery.DeliveryCacheManager
    public void deleteSession(final String str) {
        zq3.h(str, "sessionId");
        final CachedSession cachedSession = this.cachedSessions.get(str);
        if (cachedSession != null) {
            BackgroundWorker.submit$default(this.backgroundWorker, (TaskPriority) null, new Runnable() { // from class: io.embrace.android.embracesdk.comms.delivery.EmbraceDeliveryCacheManager$deleteSession$$inlined$let$lambda$1
                @Override // java.lang.Runnable
                public final void run() {
                    InternalEmbraceLogger internalEmbraceLogger;
                    CacheService cacheService;
                    Map map;
                    try {
                        cacheService = this.cacheService;
                        cacheService.deleteFile(CachedSession.this.getFilename());
                        map = this.cachedSessions;
                        map.remove(str);
                    } catch (Exception unused) {
                        internalEmbraceLogger = this.logger;
                        internalEmbraceLogger.log("Could not remove session from cache: " + str, InternalEmbraceLogger.Severity.ERROR, null, false);
                    }
                }
            }, 1, (Object) null);
        }
    }

    @Override // io.embrace.android.embracesdk.comms.delivery.DeliveryCacheManager
    public List<CachedSession> getAllCachedSessionIds() {
        for (String str : this.cacheService.normalizeCacheAndGetSessionFileIds()) {
            CachedSession fromFilename = CachedSession.Companion.fromFilename(str);
            if (fromFilename != null) {
                this.cachedSessions.put(fromFilename.getSessionId(), fromFilename);
            } else {
                this.logger.log("Unrecognized cached file: " + str, InternalEmbraceLogger.Severity.ERROR, null, false);
            }
        }
        return i.X0(this.cachedSessions.values());
    }

    @Override // io.embrace.android.embracesdk.comms.delivery.DeliveryCacheManager
    public EventMessage loadCrash() {
        return (EventMessage) this.cacheService.loadObject(CRASH_FILE_NAME, EventMessage.class);
    }

    @Override // io.embrace.android.embracesdk.comms.delivery.DeliveryCacheManager
    public ss2 loadPayloadAsAction(String str) {
        zq3.h(str, AuthenticationTokenClaims.JSON_KEY_NAME);
        return this.cacheService.loadPayload(str);
    }

    @Override // io.embrace.android.embracesdk.comms.delivery.DeliveryCacheManager
    public PendingApiCalls loadPendingApiCalls() {
        Object b;
        try {
            Result.a aVar = Result.a;
            b = Result.b((PendingApiCalls) this.cacheService.loadObject(PENDING_API_CALLS_FILE_NAME, PendingApiCalls.class));
        } catch (Throwable th) {
            Result.a aVar2 = Result.a;
            b = Result.b(f.a(th));
        }
        if (Result.g(b)) {
            b = null;
        }
        PendingApiCalls pendingApiCalls = (PendingApiCalls) b;
        if (pendingApiCalls == null) {
            pendingApiCalls = loadPendingApiCallsOldVersion();
        }
        return pendingApiCalls == null ? new PendingApiCalls(null, 1, null) : pendingApiCalls;
    }

    @Override // io.embrace.android.embracesdk.comms.delivery.DeliveryCacheManager
    public ss2 loadSessionAsAction(String str) {
        zq3.h(str, "sessionId");
        CachedSession cachedSession = this.cachedSessions.get(str);
        if (cachedSession != null) {
            return loadPayloadAsAction(cachedSession.getFilename());
        }
        this.logger.log("Session " + str + " is not in cache", InternalEmbraceLogger.Severity.ERROR, null, false);
        return null;
    }

    @Override // io.embrace.android.embracesdk.comms.delivery.DeliveryCacheManager
    public void saveCrash(EventMessage eventMessage) {
        zq3.h(eventMessage, "crash");
        this.cacheService.cacheObject(CRASH_FILE_NAME, eventMessage, EventMessage.class);
    }

    @Override // io.embrace.android.embracesdk.comms.delivery.DeliveryCacheManager
    public String savePayload(final ss2 ss2Var) {
        zq3.h(ss2Var, "action");
        final String str = "payload_" + Uuid.getEmbUuid$default(null, 1, null);
        BackgroundWorker.submit$default(this.backgroundWorker, (TaskPriority) null, new Runnable() { // from class: io.embrace.android.embracesdk.comms.delivery.EmbraceDeliveryCacheManager$savePayload$1
            @Override // java.lang.Runnable
            public final void run() {
                CacheService cacheService;
                cacheService = EmbraceDeliveryCacheManager.this.cacheService;
                cacheService.cachePayload(str, ss2Var);
            }
        }, 1, (Object) null);
        return str;
    }

    @Override // io.embrace.android.embracesdk.comms.delivery.DeliveryCacheManager
    public void savePendingApiCalls(final PendingApiCalls pendingApiCalls, boolean z) {
        zq3.h(pendingApiCalls, "pendingApiCalls");
        if (z) {
            this.cacheService.cacheObject(PENDING_API_CALLS_FILE_NAME, pendingApiCalls, PendingApiCalls.class);
        } else {
            BackgroundWorker.submit$default(this.backgroundWorker, (TaskPriority) null, new Runnable() { // from class: io.embrace.android.embracesdk.comms.delivery.EmbraceDeliveryCacheManager$savePendingApiCalls$1
                @Override // java.lang.Runnable
                public final void run() {
                    CacheService cacheService;
                    cacheService = EmbraceDeliveryCacheManager.this.cacheService;
                    cacheService.cacheObject("failed_api_calls.json", pendingApiCalls, PendingApiCalls.class);
                }
            }, 1, (Object) null);
        }
    }

    @Override // io.embrace.android.embracesdk.comms.delivery.DeliveryCacheManager
    public void saveSession(final SessionMessage sessionMessage, SessionSnapshotType sessionSnapshotType) {
        zq3.h(sessionMessage, "sessionMessage");
        zq3.h(sessionSnapshotType, "snapshotType");
        try {
            if (this.cachedSessions.size() >= 64) {
                deleteOldestSessions();
            }
            saveSessionBytes(sessionMessage.getSession().getSessionId(), sessionMessage.getSession().getStartTime(), sessionSnapshotType == SessionSnapshotType.JVM_CRASH, sessionSnapshotType == SessionSnapshotType.PERIODIC_CACHE, SessionMessageKt.isV2Payload(sessionMessage), new ss2() { // from class: io.embrace.android.embracesdk.comms.delivery.EmbraceDeliveryCacheManager$saveSession$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(1);
                }

                @Override // defpackage.ss2
                public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                    invoke((String) obj);
                    return ww8.a;
                }

                public final void invoke(String str) {
                    CacheService cacheService;
                    zq3.h(str, "filename");
                    try {
                        Systrace.startSynchronous("serialize-session");
                        cacheService = EmbraceDeliveryCacheManager.this.cacheService;
                        cacheService.writeSession(str, sessionMessage);
                        ww8 ww8Var = ww8.a;
                    } finally {
                    }
                }
            });
        } catch (Throwable th) {
            this.logger.log("Save session failed", InternalEmbraceLogger.Severity.ERROR, th, true);
            throw th;
        }
    }

    @Override // io.embrace.android.embracesdk.comms.delivery.DeliveryCacheManager
    public void transformSession(String str, ss2 ss2Var) {
        String filename;
        zq3.h(str, "sessionId");
        zq3.h(ss2Var, "transformer");
        CachedSession cachedSession = this.cachedSessions.get(str);
        if (cachedSession == null || (filename = cachedSession.getFilename()) == null) {
            return;
        }
        this.cacheService.transformSession(filename, ss2Var);
    }
}
