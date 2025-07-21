package com.google.android.gms.measurement.internal;

import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes3.dex */
final class h6 implements Runnable {
    final /* synthetic */ long a;
    final /* synthetic */ z6 b;

    h6(z6 z6Var, long j) {
        this.b = z6Var;
        this.a = j;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.b.z(this.a, true);
        this.b.a.K().R(new AtomicReference());
    }
}
