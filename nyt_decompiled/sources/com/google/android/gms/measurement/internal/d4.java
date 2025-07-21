package com.google.android.gms.measurement.internal;

/* loaded from: classes3.dex */
final class d4 implements Runnable {
    final /* synthetic */ boolean a;
    final /* synthetic */ e4 b;

    d4(e4 e4Var, boolean z) {
        this.b = e4Var;
        this.a = z;
    }

    @Override // java.lang.Runnable
    public final void run() {
        r9 r9Var;
        r9Var = this.b.a;
        r9Var.j(this.a);
    }
}
