package io.embrace.android.embracesdk.gating;

import io.embrace.android.embracesdk.internal.payload.Envelope;
import io.embrace.android.embracesdk.internal.payload.SessionPayload;
import io.embrace.android.embracesdk.payload.EventMessage;
import io.embrace.android.embracesdk.payload.SessionMessage;

/* loaded from: classes5.dex */
public interface GatingService {
    EventMessage gateEventMessage(EventMessage eventMessage);

    Envelope<SessionPayload> gateSessionEnvelope(SessionMessage sessionMessage, Envelope<SessionPayload> envelope);

    SessionMessage gateSessionMessage(SessionMessage sessionMessage);
}
