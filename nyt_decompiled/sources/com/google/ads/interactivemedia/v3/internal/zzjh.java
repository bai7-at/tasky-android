package com.google.ads.interactivemedia.v3.internal;

/* loaded from: classes2.dex */
final class zzjh implements Runnable {
    final /* synthetic */ zzji zza;

    zzjh(zzji zzjiVar) {
        this.zza = zzjiVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Object obj;
        boolean z;
        zzoy zzoyVar;
        Object obj2;
        obj = this.zza.zzo;
        synchronized (obj) {
            z = this.zza.zzp;
            if (z) {
                return;
            }
            this.zza.zzp = true;
            try {
                zzji.zzj(this.zza);
            } catch (Exception e) {
                zzoyVar = this.zza.zzh;
                zzoyVar.zzc(2023, -1L, e);
            }
            obj2 = this.zza.zzo;
            synchronized (obj2) {
                this.zza.zzp = false;
            }
        }
    }
}
