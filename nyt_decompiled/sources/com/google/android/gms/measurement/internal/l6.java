package com.google.android.gms.measurement.internal;

import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes3.dex */
final class l6 implements Runnable {
    final /* synthetic */ AtomicReference a;
    final /* synthetic */ String b;
    final /* synthetic */ String c;
    final /* synthetic */ z6 d;

    l6(z6 z6Var, AtomicReference atomicReference, String str, String str2, String str3) {
        this.d = z6Var;
        this.a = atomicReference;
        this.b = str2;
        this.c = str3;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.d.a.K().T(this.a, null, this.b, this.c);
    }
}
