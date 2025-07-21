package com.google.android.gms.measurement.internal;

/* loaded from: classes3.dex */
final class k7 implements Runnable {
    final /* synthetic */ e7 a;
    final /* synthetic */ long b;
    final /* synthetic */ m7 c;

    k7(m7 m7Var, e7 e7Var, long j) {
        this.c = m7Var;
        this.a = e7Var;
        this.b = j;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.c.m(this.a, false, this.b);
        m7 m7Var = this.c;
        m7Var.e = null;
        m7Var.a.K().t(null);
    }
}
