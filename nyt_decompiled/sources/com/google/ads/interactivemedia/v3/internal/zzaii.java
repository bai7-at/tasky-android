package com.google.ads.interactivemedia.v3.internal;

/* loaded from: classes2.dex */
final class zzaii {
    private final Object zza;
    private final int zzb;

    zzaii(Object obj) {
        this.zzb = System.identityHashCode(obj);
        this.zza = obj;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof zzaii)) {
            return false;
        }
        zzaii zzaiiVar = (zzaii) obj;
        return this.zzb == zzaiiVar.zzb && this.zza == zzaiiVar.zza;
    }

    public final int hashCode() {
        return this.zzb;
    }
}
