package com.google.ads.interactivemedia.pal;

import android.os.Handler;
import com.google.android.gms.internal.pal.zzagc;

/* loaded from: classes2.dex */
public final class zzav {
    private final Handler zza;
    private final zzagc zzb;
    private Runnable zzc;

    public zzav(Handler handler, zzagc zzagcVar) {
        this.zza = handler;
        this.zzb = zzagcVar;
    }

    protected final void finalize() throws Throwable {
        zzd();
        super.finalize();
    }

    public final void zzc(Runnable runnable) {
        if (this.zzc != null) {
            return;
        }
        zzau zzauVar = new zzau(this, runnable);
        this.zzc = zzauVar;
        this.zza.postDelayed(zzauVar, this.zzb.zzd());
    }

    public final void zzd() {
        Runnable runnable = this.zzc;
        if (runnable == null) {
            return;
        }
        this.zza.removeCallbacks(runnable);
        this.zzc = null;
    }
}
