package com.google.android.gms.measurement.internal;

/* loaded from: classes3.dex */
final class c5 implements Runnable {
    final /* synthetic */ zzac a;
    final /* synthetic */ zzq b;
    final /* synthetic */ t5 c;

    c5(t5 t5Var, zzac zzacVar, zzq zzqVar) {
        this.c = t5Var;
        this.a = zzacVar;
        this.b = zzqVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        r9 r9Var;
        r9 r9Var2;
        r9 r9Var3;
        r9Var = this.c.a;
        r9Var.a();
        if (this.a.zzc.t0() == null) {
            r9Var3 = this.c.a;
            r9Var3.r(this.a, this.b);
        } else {
            r9Var2 = this.c.a;
            r9Var2.x(this.a, this.b);
        }
    }
}
