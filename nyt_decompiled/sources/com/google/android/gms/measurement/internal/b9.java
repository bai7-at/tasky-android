package com.google.android.gms.measurement.internal;

import android.os.Handler;
import android.os.Looper;
import defpackage.p8b;

/* loaded from: classes3.dex */
public final class b9 extends w3 {
    private Handler c;
    protected final a9 d;
    protected final z8 e;
    protected final x8 f;

    b9(a5 a5Var) {
        super(a5Var);
        this.d = new a9(this);
        this.e = new z8(this);
        this.f = new x8(this);
    }

    static /* bridge */ /* synthetic */ void m(b9 b9Var, long j) {
        b9Var.c();
        b9Var.r();
        b9Var.a.o().u().b("Activity paused, time", Long.valueOf(j));
        b9Var.f.a(j);
        if (b9Var.a.y().C()) {
            b9Var.e.b(j);
        }
    }

    static /* bridge */ /* synthetic */ void n(b9 b9Var, long j) {
        b9Var.c();
        b9Var.r();
        b9Var.a.o().u().b("Activity resumed, time", Long.valueOf(j));
        if (b9Var.a.y().C() || b9Var.a.E().q.b()) {
            b9Var.e.c(j);
        }
        b9Var.f.b();
        a9 a9Var = b9Var.d;
        a9Var.a.c();
        if (a9Var.a.a.k()) {
            a9Var.b(a9Var.a.a.p().currentTimeMillis(), false);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void r() {
        c();
        if (this.c == null) {
            this.c = new p8b(Looper.getMainLooper());
        }
    }

    @Override // com.google.android.gms.measurement.internal.w3
    protected final boolean j() {
        return false;
    }
}
