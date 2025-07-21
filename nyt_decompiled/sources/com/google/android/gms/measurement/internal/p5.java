package com.google.android.gms.measurement.internal;

import java.util.concurrent.Callable;

/* loaded from: classes3.dex */
final class p5 implements Callable {
    final /* synthetic */ String a;
    final /* synthetic */ t5 b;

    p5(t5 t5Var, String str) {
        this.b = t5Var;
        this.a = str;
    }

    @Override // java.util.concurrent.Callable
    public final /* bridge */ /* synthetic */ Object call() {
        r9 r9Var;
        r9 r9Var2;
        r9Var = this.b.a;
        r9Var.a();
        r9Var2 = this.b.a;
        return r9Var2.U().b0(this.a);
    }
}
