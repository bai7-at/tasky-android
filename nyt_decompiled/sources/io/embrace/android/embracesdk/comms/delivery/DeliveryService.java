package io.embrace.android.embracesdk.comms.delivery;

import defpackage.qs2;
import io.embrace.android.embracesdk.internal.payload.Envelope;
import io.embrace.android.embracesdk.internal.payload.LogPayload;
import io.embrace.android.embracesdk.payload.EventMessage;
import io.embrace.android.embracesdk.payload.NetworkEvent;
import io.embrace.android.embracesdk.payload.SessionMessage;
import io.embrace.android.embracesdk.session.id.SessionIdTracker;
import io.embrace.android.embracesdk.session.orchestrator.SessionSnapshotType;

/* loaded from: classes5.dex */
public interface DeliveryService {
    void saveLogs(Envelope<LogPayload> envelope);

    void sendCachedSessions(qs2 qs2Var, SessionIdTracker sessionIdTracker);

    void sendCrash(EventMessage eventMessage, boolean z);

    void sendLog(EventMessage eventMessage);

    void sendLogs(Envelope<LogPayload> envelope);

    void sendMoment(EventMessage eventMessage);

    void sendNetworkCall(NetworkEvent networkEvent);

    void sendSession(SessionMessage sessionMessage, SessionSnapshotType sessionSnapshotType);
}
