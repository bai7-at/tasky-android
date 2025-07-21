package com.google.android.gms.measurement.internal;

import android.content.ComponentName;

/* loaded from: classes3.dex */
final class g8 implements Runnable {
    final /* synthetic */ ComponentName a;
    final /* synthetic */ l8 b;

    g8(l8 l8Var, ComponentName componentName) {
        this.b = l8Var;
        this.a = componentName;
    }

    @Override // java.lang.Runnable
    public final void run() {
        m8.L(this.b.c, this.a);
    }
}
