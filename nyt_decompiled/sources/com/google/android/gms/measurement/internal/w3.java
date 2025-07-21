package com.google.android.gms.measurement.internal;

/* loaded from: classes3.dex */
abstract class w3 extends z2 {
    private boolean b;

    w3(a5 a5Var) {
        super(a5Var);
        this.a.d();
    }

    protected final void d() {
        if (!i()) {
            throw new IllegalStateException("Not initialized");
        }
    }

    public final void f() {
        if (this.b) {
            throw new IllegalStateException("Can't initialize twice");
        }
        if (j()) {
            return;
        }
        this.a.b();
        this.b = true;
    }

    public final void g() {
        if (this.b) {
            throw new IllegalStateException("Can't initialize twice");
        }
        h();
        this.a.b();
        this.b = true;
    }

    protected void h() {
    }

    final boolean i() {
        return this.b;
    }

    protected abstract boolean j();
}
