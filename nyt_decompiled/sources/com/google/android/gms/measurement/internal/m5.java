package com.google.android.gms.measurement.internal;

/* loaded from: classes3.dex */
final class m5 implements Runnable {
    final /* synthetic */ zzaw a;
    final /* synthetic */ String b;
    final /* synthetic */ t5 c;

    m5(t5 t5Var, zzaw zzawVar, String str) {
        this.c = t5Var;
        this.a = zzawVar;
        this.b = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        r9 r9Var;
        r9 r9Var2;
        r9Var = this.c.a;
        r9Var.a();
        r9Var2 = this.c.a;
        r9Var2.f(this.a, this.b);
    }
}
