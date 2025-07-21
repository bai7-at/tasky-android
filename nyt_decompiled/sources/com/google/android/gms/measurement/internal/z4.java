package com.google.android.gms.measurement.internal;

/* loaded from: classes3.dex */
final class z4 implements Runnable {
    final /* synthetic */ y5 a;
    final /* synthetic */ a5 b;

    z4(a5 a5Var, y5 y5Var) {
        this.b = a5Var;
        this.a = y5Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        a5.a(this.b, this.a);
        this.b.i(this.a.g);
    }
}
