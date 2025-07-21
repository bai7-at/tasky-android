package com.google.android.gms.measurement.internal;

/* loaded from: classes3.dex */
final class r8 implements Runnable {
    final /* synthetic */ r9 a;
    final /* synthetic */ Runnable b;

    r8(s8 s8Var, r9 r9Var, Runnable runnable) {
        this.a = r9Var;
        this.b = runnable;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.a.a();
        this.a.j0(this.b);
        this.a.A();
    }
}
