package com.google.ads.interactivemedia.v3.internal;

/* loaded from: classes2.dex */
final class zzpe extends zzpa {
    private final String zza;
    private final boolean zzb;
    private final boolean zzc;

    /* synthetic */ zzpe(String str, boolean z, boolean z2, zzpd zzpdVar) {
        this.zza = str;
        this.zzb = z;
        this.zzc = z2;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof zzpa) {
            zzpa zzpaVar = (zzpa) obj;
            if (this.zza.equals(zzpaVar.zzb()) && this.zzb == zzpaVar.zzd() && this.zzc == zzpaVar.zzc()) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode = this.zza.hashCode() ^ 1000003;
        return (((hashCode * 1000003) ^ (true != this.zzb ? 1237 : 1231)) * 1000003) ^ (true != this.zzc ? 1237 : 1231);
    }

    public final String toString() {
        return "AdShield2Options{clientVersion=" + this.zza + ", shouldGetAdvertisingId=" + this.zzb + ", isGooglePlayServicesAvailable=" + this.zzc + "}";
    }

    @Override // com.google.ads.interactivemedia.v3.internal.zzpa
    public final String zzb() {
        return this.zza;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.zzpa
    public final boolean zzc() {
        return this.zzc;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.zzpa
    public final boolean zzd() {
        return this.zzb;
    }
}
