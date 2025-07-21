package io.embrace.android.embracesdk.gating.v2;

import defpackage.zq3;
import io.embrace.android.embracesdk.gating.Sanitizable;
import io.embrace.android.embracesdk.gating.SessionGatingKeys;
import io.embrace.android.embracesdk.internal.payload.EnvelopeMetadata;
import java.util.Set;

/* loaded from: classes5.dex */
public final class EnvelopeMetadataSanitizer implements Sanitizable<EnvelopeMetadata> {
    private final Set<String> enabledComponents;
    private final EnvelopeMetadata metadata;

    public EnvelopeMetadataSanitizer(EnvelopeMetadata envelopeMetadata, Set<String> set) {
        zq3.h(envelopeMetadata, "metadata");
        zq3.h(set, "enabledComponents");
        this.metadata = envelopeMetadata;
        this.enabledComponents = set;
    }

    private final boolean shouldSendUserPersonas() {
        return this.enabledComponents.contains(SessionGatingKeys.USER_PERSONAS);
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // io.embrace.android.embracesdk.gating.Sanitizable
    public EnvelopeMetadata sanitize() {
        return !shouldSendUserPersonas() ? EnvelopeMetadata.copy$default(this.metadata, null, null, null, null, null, null, 55, null) : this.metadata;
    }
}
