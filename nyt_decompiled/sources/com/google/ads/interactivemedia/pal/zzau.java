package com.google.ads.interactivemedia.pal;

import android.os.Handler;
import com.google.android.gms.internal.pal.zzagc;

/* loaded from: classes2.dex */
final class zzau implements Runnable {
    final /* synthetic */ Runnable zza;
    final /* synthetic */ zzav zzb;

    zzau(zzav zzavVar, Runnable runnable) {
        this.zzb = zzavVar;
        this.zza = runnable;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Handler handler;
        zzagc zzagcVar;
        r0.zzg.zza(7, ((zzar) this.zza).zza.zzk);
        zzav zzavVar = this.zzb;
        handler = zzavVar.zza;
        zzagcVar = zzavVar.zzb;
        handler.postDelayed(this, zzagcVar.zzd());
    }
}
