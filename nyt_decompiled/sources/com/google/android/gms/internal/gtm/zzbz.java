package com.google.android.gms.internal.gtm;

/* loaded from: classes3.dex */
final class zzbz implements Runnable {
    final /* synthetic */ zzcb zza;
    final /* synthetic */ zzey zzb;

    zzbz(zzcb zzcbVar, zzey zzeyVar, byte[] bArr) {
        this.zza = zzcbVar;
        this.zzb = zzeyVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (this.zza.zza.zzg()) {
            return;
        }
        this.zza.zza.zzF("Connected to service after a timeout");
        zzcc.zzi(this.zza.zza, this.zzb);
    }
}
