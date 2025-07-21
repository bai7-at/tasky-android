package io.embrace.android.embracesdk.gating.v2;

import defpackage.zq3;
import io.embrace.android.embracesdk.internal.payload.Envelope;
import io.embrace.android.embracesdk.internal.payload.EnvelopeMetadata;
import io.embrace.android.embracesdk.internal.payload.SessionPayload;
import java.util.Set;

/* loaded from: classes5.dex */
public final class EnvelopeSanitizerFacade {
    private final Set<String> components;
    private final Envelope<SessionPayload> envelope;

    public EnvelopeSanitizerFacade(Envelope<SessionPayload> envelope, Set<String> set) {
        zq3.h(envelope, "envelope");
        zq3.h(set, "components");
        this.envelope = envelope;
        this.components = set;
    }

    public final Envelope<SessionPayload> sanitize() {
        Envelope<SessionPayload> envelope = this.envelope;
        EnvelopeMetadata metadata = envelope.getMetadata();
        if (metadata == null) {
            metadata = new EnvelopeMetadata(null, null, null, null, null, null, 63, null);
        }
        return Envelope.copy$default(envelope, null, new EnvelopeMetadataSanitizer(metadata, this.components).sanitize(), null, null, null, 29, null);
    }
}
