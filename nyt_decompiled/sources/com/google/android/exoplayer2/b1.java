package com.google.android.exoplayer2;

import android.util.Pair;
import com.google.android.exoplayer2.g2;
import com.google.android.exoplayer2.source.o;
import com.google.common.collect.ImmutableList;
import defpackage.hq8;
import defpackage.jq8;
import defpackage.nc;
import defpackage.ob;
import defpackage.r63;
import defpackage.ur;

/* loaded from: classes2.dex */
final class b1 {
    private final g2.b a = new g2.b();
    private final g2.d b = new g2.d();
    private final nc c;
    private final r63 d;
    private long e;
    private int f;
    private boolean g;
    private y0 h;
    private y0 i;
    private y0 j;
    private int k;
    private Object l;
    private long m;

    public b1(nc ncVar, r63 r63Var) {
        this.c = ncVar;
        this.d = r63Var;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void A(ImmutableList.a aVar, o.b bVar) {
        this.c.g0(aVar.k(), bVar);
    }

    private void B() {
        final ImmutableList.a p = ImmutableList.p();
        for (y0 y0Var = this.h; y0Var != null; y0Var = y0Var.j()) {
            p.a(y0Var.f.a);
        }
        y0 y0Var2 = this.i;
        final o.b bVar = y0Var2 == null ? null : y0Var2.f.a;
        this.d.h(new Runnable() { // from class: com.google.android.exoplayer2.a1
            @Override // java.lang.Runnable
            public final void run() {
                b1.this.A(p, bVar);
            }
        });
    }

    private static o.b E(g2 g2Var, Object obj, long j, long j2, g2.d dVar, g2.b bVar) {
        g2Var.m(obj, bVar);
        g2Var.s(bVar.c, dVar);
        Object obj2 = obj;
        for (int g = g2Var.g(obj); z(bVar) && g <= dVar.s; g++) {
            g2Var.l(g, bVar, true);
            obj2 = ur.e(bVar.b);
        }
        g2Var.m(obj2, bVar);
        int i = bVar.i(j);
        return i == -1 ? new o.b(obj2, j2, bVar.h(j)) : new o.b(obj2, i, bVar.p(i), j2);
    }

    private long G(g2 g2Var, Object obj) {
        int g;
        int i = g2Var.m(obj, this.a).c;
        Object obj2 = this.l;
        if (obj2 != null && (g = g2Var.g(obj2)) != -1 && g2Var.k(g, this.a).c == i) {
            return this.m;
        }
        for (y0 y0Var = this.h; y0Var != null; y0Var = y0Var.j()) {
            if (y0Var.b.equals(obj)) {
                return y0Var.f.a.d;
            }
        }
        for (y0 y0Var2 = this.h; y0Var2 != null; y0Var2 = y0Var2.j()) {
            int g2 = g2Var.g(y0Var2.b);
            if (g2 != -1 && g2Var.k(g2, this.a).c == i) {
                return y0Var2.f.a.d;
            }
        }
        long j = this.e;
        this.e = 1 + j;
        if (this.h == null) {
            this.l = obj;
            this.m = j;
        }
        return j;
    }

    private boolean I(g2 g2Var) {
        y0 y0Var = this.h;
        if (y0Var == null) {
            return true;
        }
        int g = g2Var.g(y0Var.b);
        while (true) {
            g = g2Var.i(g, this.a, this.b, this.f, this.g);
            while (y0Var.j() != null && !y0Var.f.g) {
                y0Var = y0Var.j();
            }
            y0 j = y0Var.j();
            if (g == -1 || j == null || g2Var.g(j.b) != g) {
                break;
            }
            y0Var = j;
        }
        boolean D = D(y0Var);
        y0Var.f = t(g2Var, y0Var.f);
        return !D;
    }

    private boolean d(long j, long j2) {
        return j == -9223372036854775807L || j == j2;
    }

    private boolean e(z0 z0Var, z0 z0Var2) {
        return z0Var.b == z0Var2.b && z0Var.a.equals(z0Var2.a);
    }

    private z0 h(t1 t1Var) {
        return m(t1Var.a, t1Var.b, t1Var.c, t1Var.r);
    }

    private z0 i(g2 g2Var, y0 y0Var, long j) {
        long j2;
        long j3;
        long j4;
        long j5;
        long j6;
        z0 z0Var = y0Var.f;
        int i = g2Var.i(g2Var.g(z0Var.a.a), this.a, this.b, this.f, this.g);
        if (i == -1) {
            return null;
        }
        int i2 = g2Var.l(i, this.a, true).c;
        Object e = ur.e(this.a.b);
        long j7 = z0Var.a.d;
        if (g2Var.s(i2, this.b).r == i) {
            Pair p = g2Var.p(this.b, this.a, i2, -9223372036854775807L, Math.max(0L, j));
            if (p == null) {
                return null;
            }
            e = p.first;
            long longValue = ((Long) p.second).longValue();
            y0 j8 = y0Var.j();
            if (j8 == null || !j8.b.equals(e)) {
                j6 = this.e;
                this.e = 1 + j6;
            } else {
                j6 = j8.f.a.d;
            }
            j7 = j6;
            j2 = longValue;
            j3 = -9223372036854775807L;
        } else {
            j2 = 0;
            j3 = 0;
        }
        o.b E = E(g2Var, e, j2, j7, this.b, this.a);
        if (j3 != -9223372036854775807L && z0Var.c != -9223372036854775807L) {
            boolean u = u(z0Var.a.a, g2Var);
            if (E.b() && u) {
                j5 = z0Var.c;
                j4 = j2;
                return m(g2Var, E, j5, j4);
            }
            if (u) {
                j4 = z0Var.c;
                j5 = j3;
                return m(g2Var, E, j5, j4);
            }
        }
        j4 = j2;
        j5 = j3;
        return m(g2Var, E, j5, j4);
    }

    private z0 j(g2 g2Var, y0 y0Var, long j) {
        z0 z0Var = y0Var.f;
        long l = (y0Var.l() + z0Var.e) - j;
        return z0Var.g ? i(g2Var, y0Var, l) : k(g2Var, y0Var, l);
    }

    private z0 k(g2 g2Var, y0 y0Var, long j) {
        z0 z0Var = y0Var.f;
        o.b bVar = z0Var.a;
        g2Var.m(bVar.a, this.a);
        if (!bVar.b()) {
            int i = bVar.e;
            if (i != -1 && this.a.v(i)) {
                return i(g2Var, y0Var, j);
            }
            int p = this.a.p(bVar.e);
            boolean z = this.a.w(bVar.e) && this.a.l(bVar.e, p) == 3;
            if (p == this.a.e(bVar.e) || z) {
                return o(g2Var, bVar.a, p(g2Var, bVar.a, bVar.e), z0Var.e, bVar.d);
            }
            return n(g2Var, bVar.a, bVar.e, p, z0Var.e, bVar.d);
        }
        int i2 = bVar.b;
        int e = this.a.e(i2);
        if (e == -1) {
            return null;
        }
        int q = this.a.q(i2, bVar.c);
        if (q < e) {
            return n(g2Var, bVar.a, i2, q, z0Var.c, bVar.d);
        }
        long j2 = z0Var.c;
        if (j2 == -9223372036854775807L) {
            g2.d dVar = this.b;
            g2.b bVar2 = this.a;
            Pair p2 = g2Var.p(dVar, bVar2, bVar2.c, -9223372036854775807L, Math.max(0L, j));
            if (p2 == null) {
                return null;
            }
            j2 = ((Long) p2.second).longValue();
        }
        return o(g2Var, bVar.a, Math.max(p(g2Var, bVar.a, bVar.b), j2), z0Var.c, bVar.d);
    }

    private z0 m(g2 g2Var, o.b bVar, long j, long j2) {
        g2Var.m(bVar.a, this.a);
        return bVar.b() ? n(g2Var, bVar.a, bVar.b, bVar.c, j, bVar.d) : o(g2Var, bVar.a, j2, j, bVar.d);
    }

    private z0 n(g2 g2Var, Object obj, int i, int i2, long j, long j2) {
        o.b bVar = new o.b(obj, i, i2, j2);
        long f = g2Var.m(bVar.a, this.a).f(bVar.b, bVar.c);
        long k = i2 == this.a.p(i) ? this.a.k() : 0L;
        return new z0(bVar, (f == -9223372036854775807L || k < f) ? k : Math.max(0L, f - 1), j, -9223372036854775807L, f, this.a.w(bVar.b), false, false, false);
    }

    private z0 o(g2 g2Var, Object obj, long j, long j2, long j3) {
        boolean z;
        long j4;
        long j5;
        long j6;
        long j7;
        g2Var.m(obj, this.a);
        int h = this.a.h(j);
        boolean z2 = h != -1 && this.a.v(h);
        if (h == -1) {
            if (this.a.g() > 0) {
                g2.b bVar = this.a;
                if (bVar.w(bVar.t())) {
                    z = true;
                }
            }
            z = false;
        } else {
            if (this.a.w(h)) {
                long j8 = this.a.j(h);
                g2.b bVar2 = this.a;
                if (j8 == bVar2.d && bVar2.u(h)) {
                    z = true;
                    h = -1;
                }
            }
            z = false;
        }
        o.b bVar3 = new o.b(obj, j3, h);
        boolean v = v(bVar3);
        boolean x = x(g2Var, bVar3);
        boolean w = w(g2Var, bVar3, v);
        boolean z3 = (h == -1 || !this.a.w(h) || z2) ? false : true;
        if (h != -1 && !z2) {
            j5 = this.a.j(h);
        } else {
            if (!z) {
                j4 = -9223372036854775807L;
                j6 = (j4 != -9223372036854775807L || j4 == Long.MIN_VALUE) ? this.a.d : j4;
                if (j6 != -9223372036854775807L || j < j6) {
                    j7 = j;
                } else {
                    j7 = Math.max(0L, j6 - ((w || !z) ? 1 : 0));
                }
                return new z0(bVar3, j7, j2, j4, j6, z3, v, x, w);
            }
            j5 = this.a.d;
        }
        j4 = j5;
        if (j4 != -9223372036854775807L) {
        }
        if (j6 != -9223372036854775807L) {
        }
        j7 = j;
        return new z0(bVar3, j7, j2, j4, j6, z3, v, x, w);
    }

    private long p(g2 g2Var, Object obj, int i) {
        g2Var.m(obj, this.a);
        long j = this.a.j(i);
        return j == Long.MIN_VALUE ? this.a.d : j + this.a.n(i);
    }

    private boolean u(Object obj, g2 g2Var) {
        int g = g2Var.m(obj, this.a).g();
        int t = this.a.t();
        return g > 0 && this.a.w(t) && (g > 1 || this.a.j(t) != Long.MIN_VALUE);
    }

    private boolean v(o.b bVar) {
        return !bVar.b() && bVar.e == -1;
    }

    private boolean w(g2 g2Var, o.b bVar, boolean z) {
        int g = g2Var.g(bVar.a);
        return !g2Var.s(g2Var.k(g, this.a).c, this.b).i && g2Var.w(g, this.a, this.b, this.f, this.g) && z;
    }

    private boolean x(g2 g2Var, o.b bVar) {
        if (v(bVar)) {
            return g2Var.s(g2Var.m(bVar.a, this.a).c, this.b).s == g2Var.g(bVar.a);
        }
        return false;
    }

    private static boolean z(g2.b bVar) {
        int g = bVar.g();
        if (g == 0) {
            return false;
        }
        if ((g == 1 && bVar.v(0)) || !bVar.w(bVar.t())) {
            return false;
        }
        long j = 0;
        if (bVar.i(0L) != -1) {
            return false;
        }
        if (bVar.d == 0) {
            return true;
        }
        int i = g - (bVar.v(g + (-1)) ? 2 : 1);
        for (int i2 = 0; i2 <= i; i2++) {
            j += bVar.n(i2);
        }
        return bVar.d <= j;
    }

    public void C(long j) {
        y0 y0Var = this.j;
        if (y0Var != null) {
            y0Var.s(j);
        }
    }

    public boolean D(y0 y0Var) {
        boolean z = false;
        ur.g(y0Var != null);
        if (y0Var.equals(this.j)) {
            return false;
        }
        this.j = y0Var;
        while (y0Var.j() != null) {
            y0Var = y0Var.j();
            if (y0Var == this.i) {
                this.i = this.h;
                z = true;
            }
            y0Var.t();
            this.k--;
        }
        this.j.w(null);
        B();
        return z;
    }

    public o.b F(g2 g2Var, Object obj, long j) {
        long G = G(g2Var, obj);
        g2Var.m(obj, this.a);
        g2Var.s(this.a.c, this.b);
        boolean z = false;
        for (int g = g2Var.g(obj); g >= this.b.r; g--) {
            g2Var.l(g, this.a, true);
            boolean z2 = this.a.g() > 0;
            z |= z2;
            g2.b bVar = this.a;
            if (bVar.i(bVar.d) != -1) {
                obj = ur.e(this.a.b);
            }
            if (z && (!z2 || this.a.d != 0)) {
                break;
            }
        }
        return E(g2Var, obj, j, G, this.b, this.a);
    }

    public boolean H() {
        y0 y0Var = this.j;
        return y0Var == null || (!y0Var.f.i && y0Var.q() && this.j.f.e != -9223372036854775807L && this.k < 100);
    }

    public boolean J(g2 g2Var, long j, long j2) {
        z0 z0Var;
        y0 y0Var = this.h;
        y0 y0Var2 = null;
        while (y0Var != null) {
            z0 z0Var2 = y0Var.f;
            if (y0Var2 != null) {
                z0 j3 = j(g2Var, y0Var2, j);
                if (j3 != null && e(z0Var2, j3)) {
                    z0Var = j3;
                }
                return !D(y0Var2);
            }
            z0Var = t(g2Var, z0Var2);
            y0Var.f = z0Var.a(z0Var2.c);
            if (!d(z0Var2.e, z0Var.e)) {
                y0Var.A();
                long j4 = z0Var.e;
                return (D(y0Var) || (y0Var == this.i && !y0Var.f.f && ((j2 > Long.MIN_VALUE ? 1 : (j2 == Long.MIN_VALUE ? 0 : -1)) == 0 || (j2 > ((j4 > (-9223372036854775807L) ? 1 : (j4 == (-9223372036854775807L) ? 0 : -1)) == 0 ? Long.MAX_VALUE : y0Var.z(j4)) ? 1 : (j2 == ((j4 > (-9223372036854775807L) ? 1 : (j4 == (-9223372036854775807L) ? 0 : -1)) == 0 ? Long.MAX_VALUE : y0Var.z(j4)) ? 0 : -1)) >= 0))) ? false : true;
            }
            y0Var2 = y0Var;
            y0Var = y0Var.j();
        }
        return true;
    }

    public boolean K(g2 g2Var, int i) {
        this.f = i;
        return I(g2Var);
    }

    public boolean L(g2 g2Var, boolean z) {
        this.g = z;
        return I(g2Var);
    }

    public y0 b() {
        y0 y0Var = this.h;
        if (y0Var == null) {
            return null;
        }
        if (y0Var == this.i) {
            this.i = y0Var.j();
        }
        this.h.t();
        int i = this.k - 1;
        this.k = i;
        if (i == 0) {
            this.j = null;
            y0 y0Var2 = this.h;
            this.l = y0Var2.b;
            this.m = y0Var2.f.a.d;
        }
        this.h = this.h.j();
        B();
        return this.h;
    }

    public y0 c() {
        y0 y0Var = this.i;
        ur.g((y0Var == null || y0Var.j() == null) ? false : true);
        this.i = this.i.j();
        B();
        return this.i;
    }

    public void f() {
        if (this.k == 0) {
            return;
        }
        y0 y0Var = (y0) ur.i(this.h);
        this.l = y0Var.b;
        this.m = y0Var.f.a.d;
        while (y0Var != null) {
            y0Var.t();
            y0Var = y0Var.j();
        }
        this.h = null;
        this.j = null;
        this.i = null;
        this.k = 0;
        B();
    }

    public y0 g(a2[] a2VarArr, hq8 hq8Var, ob obVar, q1 q1Var, z0 z0Var, jq8 jq8Var) {
        y0 y0Var = this.j;
        y0 y0Var2 = new y0(a2VarArr, y0Var == null ? 1000000000000L : (y0Var.l() + this.j.f.e) - z0Var.b, hq8Var, obVar, q1Var, z0Var, jq8Var);
        y0 y0Var3 = this.j;
        if (y0Var3 != null) {
            y0Var3.w(y0Var2);
        } else {
            this.h = y0Var2;
            this.i = y0Var2;
        }
        this.l = null;
        this.j = y0Var2;
        this.k++;
        B();
        return y0Var2;
    }

    public y0 l() {
        return this.j;
    }

    public z0 q(long j, t1 t1Var) {
        y0 y0Var = this.j;
        return y0Var == null ? h(t1Var) : j(t1Var.a, y0Var, j);
    }

    public y0 r() {
        return this.h;
    }

    public y0 s() {
        return this.i;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x006c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public com.google.android.exoplayer2.z0 t(com.google.android.exoplayer2.g2 r19, com.google.android.exoplayer2.z0 r20) {
        /*
            r18 = this;
            r0 = r18
            r1 = r19
            r2 = r20
            com.google.android.exoplayer2.source.o$b r3 = r2.a
            boolean r11 = r0.v(r3)
            boolean r12 = r0.x(r1, r3)
            boolean r13 = r0.w(r1, r3, r11)
            com.google.android.exoplayer2.source.o$b r4 = r2.a
            java.lang.Object r4 = r4.a
            com.google.android.exoplayer2.g2$b r5 = r0.a
            r1.m(r4, r5)
            boolean r1 = r3.b()
            r4 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            r6 = -1
            if (r1 != 0) goto L35
            int r1 = r3.e
            if (r1 != r6) goto L2e
            goto L35
        L2e:
            com.google.android.exoplayer2.g2$b r7 = r0.a
            long r7 = r7.j(r1)
            goto L36
        L35:
            r7 = r4
        L36:
            boolean r1 = r3.b()
            if (r1 == 0) goto L48
            com.google.android.exoplayer2.g2$b r1 = r0.a
            int r4 = r3.b
            int r5 = r3.c
            long r4 = r1.f(r4, r5)
        L46:
            r9 = r4
            goto L5c
        L48:
            int r1 = (r7 > r4 ? 1 : (r7 == r4 ? 0 : -1))
            if (r1 == 0) goto L55
            r4 = -9223372036854775808
            int r1 = (r7 > r4 ? 1 : (r7 == r4 ? 0 : -1))
            if (r1 != 0) goto L53
            goto L55
        L53:
            r9 = r7
            goto L5c
        L55:
            com.google.android.exoplayer2.g2$b r1 = r0.a
            long r4 = r1.o()
            goto L46
        L5c:
            boolean r1 = r3.b()
            if (r1 == 0) goto L6c
            com.google.android.exoplayer2.g2$b r0 = r0.a
            int r1 = r3.b
            boolean r0 = r0.w(r1)
        L6a:
            r14 = r0
            goto L7c
        L6c:
            int r1 = r3.e
            if (r1 == r6) goto L7a
            com.google.android.exoplayer2.g2$b r0 = r0.a
            boolean r0 = r0.w(r1)
            if (r0 == 0) goto L7a
            r0 = 1
            goto L6a
        L7a:
            r0 = 0
            goto L6a
        L7c:
            com.google.android.exoplayer2.z0 r15 = new com.google.android.exoplayer2.z0
            long r4 = r2.b
            long r1 = r2.c
            r0 = r15
            r16 = r1
            r1 = r3
            r2 = r4
            r4 = r16
            r6 = r7
            r8 = r9
            r10 = r14
            r0.<init>(r1, r2, r4, r6, r8, r10, r11, r12, r13)
            return r15
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.exoplayer2.b1.t(com.google.android.exoplayer2.g2, com.google.android.exoplayer2.z0):com.google.android.exoplayer2.z0");
    }

    public boolean y(com.google.android.exoplayer2.source.n nVar) {
        y0 y0Var = this.j;
        return y0Var != null && y0Var.a == nVar;
    }
}
