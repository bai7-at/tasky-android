package com.google.android.gms.measurement.internal;

/* loaded from: classes3.dex */
final class d5 implements Runnable {
    final /* synthetic */ zzac a;
    final /* synthetic */ t5 b;

    d5(t5 t5Var, zzac zzacVar) {
        this.b = t5Var;
        this.a = zzacVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        r9 r9Var;
        r9 r9Var2;
        r9 r9Var3;
        r9Var = this.b.a;
        r9Var.a();
        if (this.a.zzc.t0() == null) {
            r9Var3 = this.b.a;
            r9Var3.n(this.a);
        } else {
            r9Var2 = this.b.a;
            r9Var2.w(this.a);
        }
    }
}
