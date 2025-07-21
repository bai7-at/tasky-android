package com.google.android.gms.measurement.internal;

import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes3.dex */
final class n6 implements Runnable {
    final /* synthetic */ AtomicReference a;
    final /* synthetic */ String b;
    final /* synthetic */ String c;
    final /* synthetic */ boolean d;
    final /* synthetic */ z6 e;

    n6(z6 z6Var, AtomicReference atomicReference, String str, String str2, String str3, boolean z) {
        this.e = z6Var;
        this.a = atomicReference;
        this.b = str2;
        this.c = str3;
        this.d = z;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.e.a.K().V(this.a, null, this.b, this.c, this.d);
    }
}
