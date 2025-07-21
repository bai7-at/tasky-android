package com.google.android.gms.measurement.internal;

import android.content.ComponentName;
import android.content.Context;

/* loaded from: classes3.dex */
final class j8 implements Runnable {
    final /* synthetic */ l8 a;

    j8(l8 l8Var) {
        this.a = l8Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        m8 m8Var = this.a.c;
        Context zzau = m8Var.a.zzau();
        this.a.c.a.q();
        m8.L(m8Var, new ComponentName(zzau, "com.google.android.gms.measurement.AppMeasurementService"));
    }
}
