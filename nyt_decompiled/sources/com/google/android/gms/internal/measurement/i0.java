package com.google.android.gms.internal.measurement;

import defpackage.eef;
import java.util.Collections;
import java.util.List;

/* loaded from: classes3.dex */
public final class i0 extends i2 implements eef {
    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    /* synthetic */ i0(com.google.android.gms.internal.measurement.a0 r1) {
        /*
            r0 = this;
            com.google.android.gms.internal.measurement.j0 r1 = com.google.android.gms.internal.measurement.j0.w()
            r0.<init>(r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.measurement.i0.<init>(com.google.android.gms.internal.measurement.a0):void");
    }

    public final String A() {
        return ((j0) this.b).y();
    }

    public final List B() {
        return Collections.unmodifiableList(((j0) this.b).z());
    }

    public final boolean D() {
        return ((j0) this.b).K();
    }

    public final int m() {
        return ((j0) this.b).s();
    }

    public final long n() {
        return ((j0) this.b).t();
    }

    public final long o() {
        return ((j0) this.b).u();
    }

    public final i0 p(Iterable iterable) {
        if (this.c) {
            l();
            this.c = false;
        }
        j0.C((j0) this.b, iterable);
        return this;
    }

    public final i0 q(m0 m0Var) {
        if (this.c) {
            l();
            this.c = false;
        }
        j0.B((j0) this.b, (n0) m0Var.i());
        return this;
    }

    public final i0 r(n0 n0Var) {
        if (this.c) {
            l();
            this.c = false;
        }
        j0.B((j0) this.b, n0Var);
        return this;
    }

    public final i0 s() {
        if (this.c) {
            l();
            this.c = false;
        }
        ((j0) this.b).zzf = j2.l();
        return this;
    }

    public final i0 t(int i) {
        if (this.c) {
            l();
            this.c = false;
        }
        j0.E((j0) this.b, i);
        return this;
    }

    public final i0 u(String str) {
        if (this.c) {
            l();
            this.c = false;
        }
        j0.F((j0) this.b, str);
        return this;
    }

    public final i0 v(int i, m0 m0Var) {
        if (this.c) {
            l();
            this.c = false;
        }
        j0.A((j0) this.b, i, (n0) m0Var.i());
        return this;
    }

    public final i0 w(int i, n0 n0Var) {
        if (this.c) {
            l();
            this.c = false;
        }
        j0.A((j0) this.b, i, n0Var);
        return this;
    }

    public final i0 x(long j) {
        if (this.c) {
            l();
            this.c = false;
        }
        j0.H((j0) this.b, j);
        return this;
    }

    public final i0 y(long j) {
        if (this.c) {
            l();
            this.c = false;
        }
        j0.G((j0) this.b, j);
        return this;
    }

    public final n0 z(int i) {
        return ((j0) this.b).x(i);
    }
}
