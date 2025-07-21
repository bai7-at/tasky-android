package com.google.android.gms.measurement.internal;

/* loaded from: classes3.dex */
abstract class v5 extends u5 {
    private boolean b;

    v5(a5 a5Var) {
        super(a5Var);
        this.a.d();
    }

    protected void d() {
    }

    protected abstract boolean f();

    protected final void g() {
        if (!j()) {
            throw new IllegalStateException("Not initialized");
        }
    }

    public final void h() {
        if (this.b) {
            throw new IllegalStateException("Can't initialize twice");
        }
        if (f()) {
            return;
        }
        this.a.b();
        this.b = true;
    }

    public final void i() {
        if (this.b) {
            throw new IllegalStateException("Can't initialize twice");
        }
        d();
        this.a.b();
        this.b = true;
    }

    final boolean j() {
        return this.b;
    }
}
