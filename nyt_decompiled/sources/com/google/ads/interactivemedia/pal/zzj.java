package com.google.ads.interactivemedia.pal;

import com.google.android.gms.internal.pal.zzagc;

/* loaded from: classes2.dex */
final class zzj extends zzw {
    private final zzagc zza;
    private final zzagc zzb;
    private final zzagc zzc;
    private final zzagc zzd;
    private final zzagc zze;
    private final int zzf;

    /* synthetic */ zzj(zzagc zzagcVar, zzagc zzagcVar2, zzagc zzagcVar3, zzagc zzagcVar4, zzagc zzagcVar5, int i, zzi zziVar) {
        this.zza = zzagcVar;
        this.zzb = zzagcVar2;
        this.zzc = zzagcVar3;
        this.zzd = zzagcVar4;
        this.zze = zzagcVar5;
        this.zzf = i;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof zzw) {
            zzw zzwVar = (zzw) obj;
            if (this.zza.equals(zzwVar.zzc()) && this.zzb.equals(zzwVar.zzd()) && this.zzc.equals(zzwVar.zzb()) && this.zzd.equals(zzwVar.zzf()) && this.zze.equals(zzwVar.zze()) && this.zzf == zzwVar.zza()) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.zzf ^ ((((((((((this.zza.hashCode() ^ 1000003) * 1000003) ^ this.zzb.hashCode()) * 1000003) ^ this.zzc.hashCode()) * 1000003) ^ this.zzd.hashCode()) * 1000003) ^ this.zze.hashCode()) * 1000003);
    }

    public final String toString() {
        return "NonceTimingData{nonceLoaderInitTime=" + this.zza.toString() + ", nonceRequestTime=" + this.zzb.toString() + ", nonceLoadedTime=" + this.zzc.toString() + ", resourceFetchStartTime=" + this.zzd.toString() + ", resourceFetchEndTime=" + this.zze.toString() + ", nonceLength=" + this.zzf + "}";
    }

    @Override // com.google.ads.interactivemedia.pal.zzw
    final int zza() {
        return this.zzf;
    }

    @Override // com.google.ads.interactivemedia.pal.zzw
    final zzagc zzb() {
        return this.zzc;
    }

    @Override // com.google.ads.interactivemedia.pal.zzw
    final zzagc zzc() {
        return this.zza;
    }

    @Override // com.google.ads.interactivemedia.pal.zzw
    final zzagc zzd() {
        return this.zzb;
    }

    @Override // com.google.ads.interactivemedia.pal.zzw
    final zzagc zze() {
        return this.zze;
    }

    @Override // com.google.ads.interactivemedia.pal.zzw
    final zzagc zzf() {
        return this.zzd;
    }
}
