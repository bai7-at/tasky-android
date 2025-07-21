package com.google.android.gms.internal.ads;

import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;

/* loaded from: classes3.dex */
abstract class zzgdz extends zzgew {
    private final Executor zza;
    final /* synthetic */ tb zzb;

    zzgdz(tb tbVar, Executor executor) {
        this.zzb = tbVar;
        executor.getClass();
        this.zza = executor;
    }

    @Override // com.google.android.gms.internal.ads.zzgew
    final void d(Throwable th) {
        this.zzb.s = null;
        if (th instanceof ExecutionException) {
            this.zzb.g(((ExecutionException) th).getCause());
        } else if (th instanceof CancellationException) {
            this.zzb.cancel(false);
        } else {
            this.zzb.g(th);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzgew
    final void e(Object obj) {
        this.zzb.s = null;
        h(obj);
    }

    @Override // com.google.android.gms.internal.ads.zzgew
    final boolean f() {
        return this.zzb.isDone();
    }

    abstract void h(Object obj);

    final void i() {
        try {
            this.zza.execute(this);
        } catch (RejectedExecutionException e) {
            this.zzb.g(e);
        }
    }
}
