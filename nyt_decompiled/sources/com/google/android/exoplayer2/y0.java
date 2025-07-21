package com.google.android.exoplayer2;

import com.google.android.exoplayer2.source.o;
import defpackage.a84;
import defpackage.hq8;
import defpackage.jq8;
import defpackage.ob;
import defpackage.p02;
import defpackage.q72;
import defpackage.ur;
import defpackage.wp8;
import defpackage.y77;

/* loaded from: classes2.dex */
final class y0 {
    public final com.google.android.exoplayer2.source.n a;
    public final Object b;
    public final y77[] c;
    public boolean d;
    public boolean e;
    public z0 f;
    public boolean g;
    private final boolean[] h;
    private final a2[] i;
    private final hq8 j;
    private final q1 k;
    private y0 l;
    private wp8 m;
    private jq8 n;
    private long o;

    public y0(a2[] a2VarArr, long j, hq8 hq8Var, ob obVar, q1 q1Var, z0 z0Var, jq8 jq8Var) {
        this.i = a2VarArr;
        this.o = j;
        this.j = hq8Var;
        this.k = q1Var;
        o.b bVar = z0Var.a;
        this.b = bVar.a;
        this.f = z0Var;
        this.m = wp8.d;
        this.n = jq8Var;
        this.c = new y77[a2VarArr.length];
        this.h = new boolean[a2VarArr.length];
        this.a = e(bVar, q1Var, obVar, z0Var.b, z0Var.d);
    }

    private void c(y77[] y77VarArr) {
        int i = 0;
        while (true) {
            a2[] a2VarArr = this.i;
            if (i >= a2VarArr.length) {
                return;
            }
            if (a2VarArr[i].f() == -2 && this.n.c(i)) {
                y77VarArr[i] = new p02();
            }
            i++;
        }
    }

    private static com.google.android.exoplayer2.source.n e(o.b bVar, q1 q1Var, ob obVar, long j, long j2) {
        com.google.android.exoplayer2.source.n h = q1Var.h(bVar, obVar, j);
        return j2 != -9223372036854775807L ? new com.google.android.exoplayer2.source.b(h, true, 0L, j2) : h;
    }

    private void f() {
        if (!r()) {
            return;
        }
        int i = 0;
        while (true) {
            jq8 jq8Var = this.n;
            if (i >= jq8Var.a) {
                return;
            }
            boolean c = jq8Var.c(i);
            q72 q72Var = this.n.c[i];
            if (c && q72Var != null) {
                q72Var.c();
            }
            i++;
        }
    }

    private void g(y77[] y77VarArr) {
        int i = 0;
        while (true) {
            a2[] a2VarArr = this.i;
            if (i >= a2VarArr.length) {
                return;
            }
            if (a2VarArr[i].f() == -2) {
                y77VarArr[i] = null;
            }
            i++;
        }
    }

    private void h() {
        if (!r()) {
            return;
        }
        int i = 0;
        while (true) {
            jq8 jq8Var = this.n;
            if (i >= jq8Var.a) {
                return;
            }
            boolean c = jq8Var.c(i);
            q72 q72Var = this.n.c[i];
            if (c && q72Var != null) {
                q72Var.d();
            }
            i++;
        }
    }

    private boolean r() {
        return this.l == null;
    }

    private static void u(q1 q1Var, com.google.android.exoplayer2.source.n nVar) {
        try {
            if (nVar instanceof com.google.android.exoplayer2.source.b) {
                q1Var.z(((com.google.android.exoplayer2.source.b) nVar).a);
            } else {
                q1Var.z(nVar);
            }
        } catch (RuntimeException e) {
            a84.e("MediaPeriodHolder", "Period release failed.", e);
        }
    }

    public void A() {
        com.google.android.exoplayer2.source.n nVar = this.a;
        if (nVar instanceof com.google.android.exoplayer2.source.b) {
            long j = this.f.d;
            if (j == -9223372036854775807L) {
                j = Long.MIN_VALUE;
            }
            ((com.google.android.exoplayer2.source.b) nVar).w(0L, j);
        }
    }

    public long a(jq8 jq8Var, long j, boolean z) {
        return b(jq8Var, j, z, new boolean[this.i.length]);
    }

    public long b(jq8 jq8Var, long j, boolean z, boolean[] zArr) {
        int i = 0;
        while (true) {
            boolean z2 = true;
            if (i >= jq8Var.a) {
                break;
            }
            boolean[] zArr2 = this.h;
            if (z || !jq8Var.b(this.n, i)) {
                z2 = false;
            }
            zArr2[i] = z2;
            i++;
        }
        g(this.c);
        f();
        this.n = jq8Var;
        h();
        long j2 = this.a.j(jq8Var.c, this.h, this.c, zArr, j);
        c(this.c);
        this.e = false;
        int i2 = 0;
        while (true) {
            y77[] y77VarArr = this.c;
            if (i2 >= y77VarArr.length) {
                return j2;
            }
            if (y77VarArr[i2] != null) {
                ur.g(jq8Var.c(i2));
                if (this.i[i2].f() != -2) {
                    this.e = true;
                }
            } else {
                ur.g(jq8Var.c[i2] == null);
            }
            i2++;
        }
    }

    public void d(long j) {
        ur.g(r());
        this.a.f(y(j));
    }

    public long i() {
        if (!this.d) {
            return this.f.b;
        }
        long h = this.e ? this.a.h() : Long.MIN_VALUE;
        return h == Long.MIN_VALUE ? this.f.e : h;
    }

    public y0 j() {
        return this.l;
    }

    public long k() {
        if (this.d) {
            return this.a.c();
        }
        return 0L;
    }

    public long l() {
        return this.o;
    }

    public long m() {
        return this.f.b + this.o;
    }

    public wp8 n() {
        return this.m;
    }

    public jq8 o() {
        return this.n;
    }

    public void p(float f, g2 g2Var) {
        this.d = true;
        this.m = this.a.t();
        jq8 v = v(f, g2Var);
        z0 z0Var = this.f;
        long j = z0Var.b;
        long j2 = z0Var.e;
        if (j2 != -9223372036854775807L && j >= j2) {
            j = Math.max(0L, j2 - 1);
        }
        long a = a(v, j, false);
        long j3 = this.o;
        z0 z0Var2 = this.f;
        this.o = j3 + (z0Var2.b - a);
        this.f = z0Var2.b(a);
    }

    public boolean q() {
        return this.d && (!this.e || this.a.h() == Long.MIN_VALUE);
    }

    public void s(long j) {
        ur.g(r());
        if (this.d) {
            this.a.i(y(j));
        }
    }

    public void t() {
        f();
        u(this.k, this.a);
    }

    public jq8 v(float f, g2 g2Var) {
        jq8 j = this.j.j(this.i, n(), this.f.a, g2Var);
        for (q72 q72Var : j.c) {
            if (q72Var != null) {
                q72Var.i(f);
            }
        }
        return j;
    }

    public void w(y0 y0Var) {
        if (y0Var == this.l) {
            return;
        }
        f();
        this.l = y0Var;
        h();
    }

    public void x(long j) {
        this.o = j;
    }

    public long y(long j) {
        return j - l();
    }

    public long z(long j) {
        return j + l();
    }
}
