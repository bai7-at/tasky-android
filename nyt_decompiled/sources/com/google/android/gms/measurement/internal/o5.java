package com.google.android.gms.measurement.internal;

/* loaded from: classes3.dex */
final class o5 implements Runnable {
    final /* synthetic */ zzlo a;
    final /* synthetic */ zzq b;
    final /* synthetic */ t5 c;

    o5(t5 t5Var, zzlo zzloVar, zzq zzqVar) {
        this.c = t5Var;
        this.a = zzloVar;
        this.b = zzqVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        r9 r9Var;
        r9 r9Var2;
        r9 r9Var3;
        r9Var = this.c.a;
        r9Var.a();
        if (this.a.t0() == null) {
            r9Var3 = this.c.a;
            r9Var3.s(this.a, this.b);
        } else {
            r9Var2 = this.c.a;
            r9Var2.z(this.a, this.b);
        }
    }
}
