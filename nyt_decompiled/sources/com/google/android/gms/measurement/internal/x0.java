package com.google.android.gms.measurement.internal;

/* loaded from: classes3.dex */
final class x0 implements Runnable {
    final /* synthetic */ long a;
    final /* synthetic */ y1 b;

    x0(y1 y1Var, long j) {
        this.b = y1Var;
        this.a = j;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.b.m(this.a);
    }
}
