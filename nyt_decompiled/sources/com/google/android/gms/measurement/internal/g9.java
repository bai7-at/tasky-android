package com.google.android.gms.measurement.internal;

/* loaded from: classes3.dex */
abstract class g9 extends f9 {
    private boolean c;

    g9(r9 r9Var) {
        super(r9Var);
        this.b.m();
    }

    protected final void d() {
        if (!g()) {
            throw new IllegalStateException("Not initialized");
        }
    }

    public final void f() {
        if (this.c) {
            throw new IllegalStateException("Can't initialize twice");
        }
        h();
        this.b.h();
        this.c = true;
    }

    final boolean g() {
        return this.c;
    }

    protected abstract boolean h();
}
