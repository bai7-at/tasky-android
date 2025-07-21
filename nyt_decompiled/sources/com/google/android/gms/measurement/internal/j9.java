package com.google.android.gms.measurement.internal;

/* loaded from: classes3.dex */
final class j9 implements Runnable {
    final /* synthetic */ s9 a;
    final /* synthetic */ r9 b;

    j9(r9 r9Var, s9 s9Var) {
        this.b = r9Var;
        this.a = s9Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        r9.i0(this.b, this.a);
        this.b.v();
    }
}
