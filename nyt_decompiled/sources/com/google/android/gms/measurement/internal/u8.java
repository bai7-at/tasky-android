package com.google.android.gms.measurement.internal;

/* loaded from: classes3.dex */
final class u8 implements Runnable {
    final /* synthetic */ long a;
    final /* synthetic */ b9 b;

    u8(b9 b9Var, long j) {
        this.b = b9Var;
        this.a = j;
    }

    @Override // java.lang.Runnable
    public final void run() {
        b9.m(this.b, this.a);
    }
}
