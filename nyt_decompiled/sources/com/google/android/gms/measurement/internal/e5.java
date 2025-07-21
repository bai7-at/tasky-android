package com.google.android.gms.measurement.internal;

import java.util.concurrent.Callable;

/* loaded from: classes3.dex */
final class e5 implements Callable {
    final /* synthetic */ String a;
    final /* synthetic */ String b;
    final /* synthetic */ String c;
    final /* synthetic */ t5 d;

    e5(t5 t5Var, String str, String str2, String str3) {
        this.d = t5Var;
        this.a = str;
        this.b = str2;
        this.c = str3;
    }

    @Override // java.util.concurrent.Callable
    public final /* bridge */ /* synthetic */ Object call() {
        r9 r9Var;
        r9 r9Var2;
        r9Var = this.d.a;
        r9Var.a();
        r9Var2 = this.d.a;
        return r9Var2.U().c0(this.a, this.b, this.c);
    }
}
