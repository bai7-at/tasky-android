package com.google.android.gms.internal.ads;

import defpackage.hke;
import defpackage.j64;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;

/* loaded from: classes3.dex */
public final class yb {
    private final boolean a;
    private final zzgaa b;

    /* synthetic */ yb(boolean z, zzgaa zzgaaVar, hke hkeVar) {
        this.a = z;
        this.b = zzgaaVar;
    }

    public final j64 a(Callable callable, Executor executor) {
        return new tb(this.b, this.a, executor, callable);
    }
}
