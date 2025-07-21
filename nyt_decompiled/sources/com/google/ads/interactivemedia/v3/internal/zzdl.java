package com.google.ads.interactivemedia.v3.internal;

import com.google.ads.interactivemedia.v3.api.AdError;
import com.google.ads.interactivemedia.v3.api.AdErrorEvent;

/* loaded from: classes2.dex */
public final class zzdl implements AdErrorEvent {
    private final AdError zza;
    private final Object zzb;

    zzdl(AdError adError) {
        this.zza = adError;
        this.zzb = null;
    }

    @Override // com.google.ads.interactivemedia.v3.api.AdErrorEvent
    public final AdError getError() {
        return this.zza;
    }

    @Override // com.google.ads.interactivemedia.v3.api.AdErrorEvent
    public final Object getUserRequestContext() {
        return this.zzb;
    }

    public final String toString() {
        return String.format("AdErrorEvent: [error=%s]", this.zza);
    }

    zzdl(AdError adError, Object obj) {
        this.zza = adError;
        this.zzb = obj;
    }
}
