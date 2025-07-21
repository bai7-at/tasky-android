package com.google.android.gms.measurement.internal;

/* loaded from: classes3.dex */
final class w implements Runnable {
    final /* synthetic */ String a;
    final /* synthetic */ long b;
    final /* synthetic */ y1 c;

    w(y1 y1Var, String str, long j) {
        this.c = y1Var;
        this.a = str;
        this.b = j;
    }

    @Override // java.lang.Runnable
    public final void run() {
        y1.f(this.c, this.a, this.b);
    }
}
