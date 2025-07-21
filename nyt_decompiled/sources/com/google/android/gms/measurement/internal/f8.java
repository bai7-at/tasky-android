package com.google.android.gms.measurement.internal;

import defpackage.shd;

/* loaded from: classes3.dex */
final class f8 implements Runnable {
    final /* synthetic */ shd a;
    final /* synthetic */ l8 b;

    f8(l8 l8Var, shd shdVar) {
        this.b = l8Var;
        this.a = shdVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        synchronized (this.b) {
            try {
                this.b.a = false;
                if (!this.b.c.y()) {
                    this.b.c.a.o().u().a("Connected to service");
                    this.b.c.w(this.a);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
