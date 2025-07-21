package com.google.ads.interactivemedia.v3.internal;

import android.os.Handler;
import android.os.Looper;
import com.google.ads.interactivemedia.v3.api.player.VideoProgressUpdate;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes2.dex */
abstract class zzgh {
    private final List zzb = new ArrayList(1);
    private final Handler zza = new Handler(Looper.getMainLooper());

    zzgh(long j) {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void zzg() {
        VideoProgressUpdate zza = zza();
        Iterator it2 = this.zzb.iterator();
        while (it2.hasNext()) {
            ((zzgg) it2.next()).zza(zza);
        }
        this.zza.postDelayed(new Runnable() { // from class: com.google.ads.interactivemedia.v3.internal.zzgf
            @Override // java.lang.Runnable
            public final void run() {
                zzgh.this.zzg();
            }
        }, 200L);
    }

    abstract VideoProgressUpdate zza();

    final void zzc(zzgg zzggVar) {
        this.zzb.add(zzggVar);
    }

    final void zzd(zzgg zzggVar) {
        this.zzb.remove(zzggVar);
    }

    final void zze() {
        this.zza.removeCallbacksAndMessages(null);
        zzg();
    }

    final void zzf() {
        this.zza.removeCallbacksAndMessages(null);
    }
}
