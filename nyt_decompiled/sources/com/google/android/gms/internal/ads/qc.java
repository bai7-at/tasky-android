package com.google.android.gms.internal.ads;

import defpackage.zje;
import java.util.concurrent.Callable;
import java.util.concurrent.Executors;
import java.util.concurrent.RunnableFuture;

/* loaded from: classes3.dex */
final class qc extends ub implements RunnableFuture {
    private volatile zzgew h;

    qc(zje zjeVar) {
        this.h = new zzgfl(this, zjeVar);
    }

    static qc D(Runnable runnable, Object obj) {
        return new qc(Executors.callable(runnable, obj));
    }

    @Override // com.google.android.gms.internal.ads.eb
    protected final String d() {
        zzgew zzgewVar = this.h;
        if (zzgewVar == null) {
            return super.d();
        }
        return "task=[" + zzgewVar.toString() + "]";
    }

    @Override // com.google.android.gms.internal.ads.eb
    protected final void e() {
        zzgew zzgewVar;
        if (v() && (zzgewVar = this.h) != null) {
            zzgewVar.g();
        }
        this.h = null;
    }

    @Override // java.util.concurrent.RunnableFuture, java.lang.Runnable
    public final void run() {
        zzgew zzgewVar = this.h;
        if (zzgewVar != null) {
            zzgewVar.run();
        }
        this.h = null;
    }

    qc(Callable callable) {
        this.h = new zzgfm(this, callable);
    }
}
