package com.google.ads.interactivemedia.v3.internal;

import java.util.concurrent.Callable;
import java.util.concurrent.Executors;
import java.util.concurrent.RunnableFuture;

/* loaded from: classes2.dex */
final class zzvz extends zzuu implements RunnableFuture {
    private volatile zzvp zza;

    zzvz(Callable callable) {
        this.zza = new zzvy(this, callable);
    }

    static zzvz zzp(Runnable runnable, Object obj) {
        return new zzvz(Executors.callable(runnable, obj));
    }

    @Override // java.util.concurrent.RunnableFuture, java.lang.Runnable
    public final void run() {
        zzvp zzvpVar = this.zza;
        if (zzvpVar != null) {
            zzvpVar.run();
        }
        this.zza = null;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.zzub
    protected final String zza() {
        zzvp zzvpVar = this.zza;
        if (zzvpVar == null) {
            return super.zza();
        }
        return "task=[" + zzvpVar.toString() + "]";
    }

    @Override // com.google.ads.interactivemedia.v3.internal.zzub
    protected final void zzb() {
        zzvp zzvpVar;
        if (zzo() && (zzvpVar = this.zza) != null) {
            zzvpVar.zzh();
        }
        this.zza = null;
    }
}
