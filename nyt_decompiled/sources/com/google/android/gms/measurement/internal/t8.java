package com.google.android.gms.measurement.internal;

/* loaded from: classes3.dex */
final class t8 implements Runnable {
    final /* synthetic */ long a;
    final /* synthetic */ b9 b;

    t8(b9 b9Var, long j) {
        this.b = b9Var;
        this.a = j;
    }

    @Override // java.lang.Runnable
    public final void run() {
        b9.n(this.b, this.a);
    }
}
