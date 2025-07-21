package com.google.ads.interactivemedia.v3.internal;

/* loaded from: classes2.dex */
final class zzjo implements zzpr {
    final /* synthetic */ zzjp zza;

    zzjo(zzjp zzjpVar) {
        this.zza = zzjpVar;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.zzpr
    public final void zza(int i, long j) {
        zzoy zzoyVar;
        zzoyVar = this.zza.zzd;
        zzoyVar.zzd(i, System.currentTimeMillis() - j);
    }

    @Override // com.google.ads.interactivemedia.v3.internal.zzpr
    public final void zzb(int i, long j, String str) {
        zzoy zzoyVar;
        zzoyVar = this.zza.zzd;
        zzoyVar.zze(i, System.currentTimeMillis() - j, str);
    }
}
