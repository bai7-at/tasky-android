package com.google.android.gms.measurement.internal;

/* loaded from: classes3.dex */
final class g7 implements Runnable {
    final /* synthetic */ e7 a;
    final /* synthetic */ e7 b;
    final /* synthetic */ long c;
    final /* synthetic */ boolean d;
    final /* synthetic */ m7 e;

    g7(m7 m7Var, e7 e7Var, e7 e7Var2, long j, boolean z) {
        this.e = m7Var;
        this.a = e7Var;
        this.b = e7Var2;
        this.c = j;
        this.d = z;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.e.l(this.a, this.b, this.c, this.d, null);
    }
}
