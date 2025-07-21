package com.google.android.gms.measurement.internal;

/* loaded from: classes3.dex */
final class t6 implements Runnable {
    final /* synthetic */ Boolean a;
    final /* synthetic */ z6 b;

    t6(z6 z6Var, Boolean bool) {
        this.b = z6Var;
        this.a = bool;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.b.Q(this.a, true);
    }
}
