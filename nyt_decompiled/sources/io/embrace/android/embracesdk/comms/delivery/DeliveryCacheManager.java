package io.embrace.android.embracesdk.comms.delivery;

import defpackage.ss2;
import io.embrace.android.embracesdk.payload.EventMessage;
import io.embrace.android.embracesdk.payload.SessionMessage;
import io.embrace.android.embracesdk.session.orchestrator.SessionSnapshotType;
import java.util.List;

/* loaded from: classes5.dex */
public interface DeliveryCacheManager {

    public static final class DefaultImpls {
        public static /* synthetic */ void savePendingApiCalls$default(DeliveryCacheManager deliveryCacheManager, PendingApiCalls pendingApiCalls, boolean z, int i, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: savePendingApiCalls");
            }
            if ((i & 2) != 0) {
                z = false;
            }
            deliveryCacheManager.savePendingApiCalls(pendingApiCalls, z);
        }
    }

    void deleteCrash();

    void deletePayload(String str);

    void deleteSession(String str);

    List<CachedSession> getAllCachedSessionIds();

    EventMessage loadCrash();

    ss2 loadPayloadAsAction(String str);

    PendingApiCalls loadPendingApiCalls();

    ss2 loadSessionAsAction(String str);

    void saveCrash(EventMessage eventMessage);

    String savePayload(ss2 ss2Var);

    void savePendingApiCalls(PendingApiCalls pendingApiCalls, boolean z);

    void saveSession(SessionMessage sessionMessage, SessionSnapshotType sessionSnapshotType);

    void transformSession(String str, ss2 ss2Var);
}
