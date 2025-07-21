package io.embrace.android.embracesdk.capture.envelope.session;

import defpackage.zq3;
import io.embrace.android.embracesdk.capture.envelope.metadata.EnvelopeMetadataSource;
import io.embrace.android.embracesdk.capture.envelope.resource.EnvelopeResourceSource;
import io.embrace.android.embracesdk.internal.payload.Envelope;
import io.embrace.android.embracesdk.internal.payload.SessionPayload;
import io.embrace.android.embracesdk.session.orchestrator.SessionSnapshotType;

/* loaded from: classes5.dex */
public final class SessionEnvelopeSourceImpl implements SessionEnvelopeSource {
    private final EnvelopeMetadataSource metadataSource;
    private final EnvelopeResourceSource resourceSource;
    private final SessionPayloadSource sessionPayloadSource;

    public SessionEnvelopeSourceImpl(EnvelopeMetadataSource envelopeMetadataSource, EnvelopeResourceSource envelopeResourceSource, SessionPayloadSource sessionPayloadSource) {
        zq3.h(envelopeMetadataSource, "metadataSource");
        zq3.h(envelopeResourceSource, "resourceSource");
        zq3.h(sessionPayloadSource, "sessionPayloadSource");
        this.metadataSource = envelopeMetadataSource;
        this.resourceSource = envelopeResourceSource;
        this.sessionPayloadSource = sessionPayloadSource;
    }

    @Override // io.embrace.android.embracesdk.capture.envelope.session.SessionEnvelopeSource
    public Envelope<SessionPayload> getEnvelope(SessionSnapshotType sessionSnapshotType) {
        zq3.h(sessionSnapshotType, "endType");
        return new Envelope<>(this.resourceSource.getEnvelopeResource(), this.metadataSource.getEnvelopeMetadata(), "0.1.0", "session", this.sessionPayloadSource.getSessionPayload(sessionSnapshotType));
    }
}
