package com.google.android.gms.internal.ads;

import defpackage.j64;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;

/* loaded from: classes3.dex */
final class wb extends vb {
    private final j64 h;

    wb(j64 j64Var) {
        j64Var.getClass();
        this.h = j64Var;
    }

    @Override // com.google.android.gms.internal.ads.eb, defpackage.j64
    public final void a(Runnable runnable, Executor executor) {
        this.h.a(runnable, executor);
    }

    @Override // com.google.android.gms.internal.ads.eb, java.util.concurrent.Future
    public final boolean cancel(boolean z) {
        return this.h.cancel(z);
    }

    @Override // com.google.android.gms.internal.ads.eb, java.util.concurrent.Future
    public final Object get() {
        return this.h.get();
    }

    @Override // com.google.android.gms.internal.ads.eb, java.util.concurrent.Future
    public final boolean isCancelled() {
        return this.h.isCancelled();
    }

    @Override // com.google.android.gms.internal.ads.eb, java.util.concurrent.Future
    public final boolean isDone() {
        return this.h.isDone();
    }

    @Override // com.google.android.gms.internal.ads.eb
    public final String toString() {
        return this.h.toString();
    }

    @Override // com.google.android.gms.internal.ads.eb, java.util.concurrent.Future
    public final Object get(long j, TimeUnit timeUnit) {
        return this.h.get(j, timeUnit);
    }
}
