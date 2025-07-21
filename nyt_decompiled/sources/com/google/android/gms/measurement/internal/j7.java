package com.google.android.gms.measurement.internal;

/* loaded from: classes3.dex */
final class j7 implements Runnable {
    final /* synthetic */ long a;
    final /* synthetic */ m7 b;

    j7(m7 m7Var, long j) {
        this.b = m7Var;
        this.a = j;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.b.a.x().j(this.a);
        this.b.e = null;
    }
}
