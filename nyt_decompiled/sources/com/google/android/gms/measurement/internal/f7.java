package com.google.android.gms.measurement.internal;

import android.os.Bundle;

/* loaded from: classes3.dex */
final class f7 implements Runnable {
    final /* synthetic */ Bundle a;
    final /* synthetic */ e7 b;
    final /* synthetic */ e7 c;
    final /* synthetic */ long d;
    final /* synthetic */ m7 e;

    f7(m7 m7Var, Bundle bundle, e7 e7Var, e7 e7Var2, long j) {
        this.e = m7Var;
        this.a = bundle;
        this.b = e7Var;
        this.c = e7Var2;
        this.d = j;
    }

    @Override // java.lang.Runnable
    public final void run() {
        m7.w(this.e, this.a, this.b, this.c, this.d);
    }
}
