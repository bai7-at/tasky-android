package com.google.android.gms.measurement.internal;

/* loaded from: classes3.dex */
final class k8 implements Runnable {
    final /* synthetic */ l8 a;

    k8(l8 l8Var) {
        this.a = l8Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.a.c.d = null;
        this.a.c.C();
    }
}
