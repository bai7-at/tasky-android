package com.google.ads.interactivemedia.v3.internal;

import java.util.ArrayDeque;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* loaded from: classes2.dex */
public final class zzdc {
    private final BlockingQueue zza;
    private final ThreadPoolExecutor zzb;
    private final ArrayDeque zzc = new ArrayDeque();
    private zzdb zzd = null;

    public zzdc() {
        LinkedBlockingQueue linkedBlockingQueue = new LinkedBlockingQueue();
        this.zza = linkedBlockingQueue;
        this.zzb = new ThreadPoolExecutor(1, 1, 1L, TimeUnit.SECONDS, linkedBlockingQueue);
    }

    private final void zzc() {
        zzdb zzdbVar = (zzdb) this.zzc.poll();
        this.zzd = zzdbVar;
        if (zzdbVar != null) {
            zzdbVar.executeOnExecutor(this.zzb, new Object[0]);
        }
    }

    public final void zza(zzdb zzdbVar) {
        this.zzd = null;
        zzc();
    }

    public final void zzb(zzdb zzdbVar) {
        zzdbVar.zzb(this);
        this.zzc.add(zzdbVar);
        if (this.zzd == null) {
            zzc();
        }
    }
}
