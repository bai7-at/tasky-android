package com.google.android.gms.measurement.internal;

/* loaded from: classes3.dex */
final class r5 implements Runnable {
    final /* synthetic */ zzq a;
    final /* synthetic */ t5 b;

    r5(t5 t5Var, zzq zzqVar) {
        this.b = t5Var;
        this.a = zzqVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        r9 r9Var;
        r9 r9Var2;
        r9Var = this.b.a;
        r9Var.a();
        r9Var2 = this.b.a;
        r9Var2.l(this.a);
    }
}
