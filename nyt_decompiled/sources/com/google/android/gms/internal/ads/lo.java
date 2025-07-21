package com.google.android.gms.internal.ads;

import android.util.Pair;
import defpackage.fyb;
import defpackage.kod;
import defpackage.l0c;
import defpackage.n1c;
import defpackage.qgf;
import defpackage.wad;
import defpackage.xzf;
import defpackage.zzf;

/* loaded from: classes3.dex */
final class lo {
    private final fyb a = new fyb();
    private final l0c b = new l0c();
    private final qgf c;
    private final kod d;
    private long e;
    private int f;
    private boolean g;
    private io h;
    private io i;
    private io j;
    private int k;
    private Object l;
    private long m;
    private final zn n;

    public lo(qgf qgfVar, kod kodVar, zn znVar) {
        this.c = qgfVar;
        this.d = kodVar;
        this.n = znVar;
    }

    private static zzf A(n1c n1cVar, Object obj, long j, long j2, l0c l0cVar, fyb fybVar) {
        n1cVar.n(obj, fybVar);
        n1cVar.e(fybVar.c, l0cVar, 0L);
        n1cVar.a(obj);
        fybVar.b();
        n1cVar.n(obj, fybVar);
        int d = fybVar.d(j);
        return d == -1 ? new zzf(obj, j2, fybVar.c(j)) : new zzf(obj, d, fybVar.e(d), j2);
    }

    private final void B() {
        final h9 h9Var = new h9();
        for (io ioVar = this.h; ioVar != null; ioVar = ioVar.g()) {
            h9Var.g(ioVar.f.a);
        }
        io ioVar2 = this.i;
        final zzf zzfVar = ioVar2 == null ? null : ioVar2.f.a;
        this.d.e(new Runnable() { // from class: com.google.android.gms.internal.ads.ko
            @Override // java.lang.Runnable
            public final void run() {
                lo.this.n(h9Var, zzfVar);
            }
        });
    }

    private final boolean C(n1c n1cVar, zzf zzfVar, boolean z) {
        int a = n1cVar.a(zzfVar.a);
        return !n1cVar.e(n1cVar.d(a, this.a, false).c, this.b, 0L).h && n1cVar.i(a, this.a, this.b, this.f, this.g) == -1 && z;
    }

    private final boolean a(n1c n1cVar, zzf zzfVar) {
        if (c(zzfVar)) {
            return n1cVar.e(n1cVar.n(zzfVar.a, this.a).c, this.b, 0L).o == n1cVar.a(zzfVar.a);
        }
        return false;
    }

    private final boolean b(n1c n1cVar) {
        io ioVar = this.h;
        if (ioVar == null) {
            return true;
        }
        int a = n1cVar.a(ioVar.b);
        while (true) {
            a = n1cVar.i(a, this.a, this.b, this.f, this.g);
            while (true) {
                ioVar.getClass();
                if (ioVar.g() == null || ioVar.f.g) {
                    break;
                }
                ioVar = ioVar.g();
            }
            io g = ioVar.g();
            if (a == -1 || g == null || n1cVar.a(g.b) != a) {
                break;
            }
            ioVar = g;
        }
        boolean q = q(ioVar);
        ioVar.f = k(n1cVar, ioVar.f);
        return !q;
    }

    private static final boolean c(zzf zzfVar) {
        return !zzfVar.b() && zzfVar.e == -1;
    }

    private final long v(n1c n1cVar, Object obj, int i) {
        n1cVar.n(obj, this.a);
        this.a.i(i);
        this.a.k(i);
        return 0L;
    }

    private final jo w(n1c n1cVar, io ioVar, long j) {
        long j2;
        jo joVar = ioVar.f;
        long e = (ioVar.e() + joVar.e) - j;
        if (joVar.g) {
            long j3 = 0;
            int i = n1cVar.i(n1cVar.a(joVar.a.a), this.a, this.b, this.f, this.g);
            if (i != -1) {
                int i2 = n1cVar.d(i, this.a, true).c;
                Object obj = this.a.b;
                obj.getClass();
                long j4 = joVar.a.d;
                if (n1cVar.e(i2, this.b, 0L).n == i) {
                    Pair m = n1cVar.m(this.b, this.a, i2, -9223372036854775807L, Math.max(0L, e));
                    if (m != null) {
                        obj = m.first;
                        long longValue = ((Long) m.second).longValue();
                        io g = ioVar.g();
                        if (g == null || !g.b.equals(obj)) {
                            j4 = this.e;
                            this.e = 1 + j4;
                        } else {
                            j4 = g.f.a.d;
                        }
                        j2 = longValue;
                        j3 = -9223372036854775807L;
                    }
                } else {
                    j2 = 0;
                }
                zzf A = A(n1cVar, obj, j2, j4, this.b, this.a);
                if (j3 != -9223372036854775807L && joVar.c != -9223372036854775807L) {
                    n1cVar.n(joVar.a.a, this.a).b();
                    this.a.g();
                }
                return x(n1cVar, A, j3, j2);
            }
        } else {
            zzf zzfVar = joVar.a;
            n1cVar.n(zzfVar.a, this.a);
            if (!zzfVar.b()) {
                int i3 = zzfVar.e;
                if (i3 != -1) {
                    this.a.m(i3);
                }
                fyb fybVar = this.a;
                int i4 = zzfVar.e;
                int e2 = fybVar.e(i4);
                fybVar.n(i4);
                if (e2 != this.a.a(zzfVar.e)) {
                    return y(n1cVar, zzfVar.a, zzfVar.e, e2, joVar.e, zzfVar.d);
                }
                v(n1cVar, zzfVar.a, zzfVar.e);
                return z(n1cVar, zzfVar.a, 0L, joVar.e, zzfVar.d);
            }
            int i5 = zzfVar.b;
            if (this.a.a(i5) != -1) {
                int f = this.a.f(i5, zzfVar.c);
                if (f < 0) {
                    return y(n1cVar, zzfVar.a, i5, f, joVar.c, zzfVar.d);
                }
                long j5 = joVar.c;
                if (j5 == -9223372036854775807L) {
                    l0c l0cVar = this.b;
                    fyb fybVar2 = this.a;
                    Pair m2 = n1cVar.m(l0cVar, fybVar2, fybVar2.c, -9223372036854775807L, Math.max(0L, e));
                    if (m2 != null) {
                        j5 = ((Long) m2.second).longValue();
                    }
                }
                v(n1cVar, zzfVar.a, zzfVar.b);
                return z(n1cVar, zzfVar.a, Math.max(0L, j5), joVar.c, zzfVar.d);
            }
        }
        return null;
    }

    private final jo x(n1c n1cVar, zzf zzfVar, long j, long j2) {
        n1cVar.n(zzfVar.a, this.a);
        return zzfVar.b() ? y(n1cVar, zzfVar.a, zzfVar.b, zzfVar.c, j, zzfVar.d) : z(n1cVar, zzfVar.a, j2, j, zzfVar.d);
    }

    private final jo y(n1c n1cVar, Object obj, int i, int i2, long j, long j2) {
        zzf zzfVar = new zzf(obj, i, i2, j2);
        long h = n1cVar.n(zzfVar.a, this.a).h(zzfVar.b, zzfVar.c);
        if (i2 == this.a.e(i)) {
            this.a.j();
        }
        this.a.n(zzfVar.b);
        return new jo(zzfVar, (h == -9223372036854775807L || h > 0) ? 0L : Math.max(0L, (-1) + h), j, -9223372036854775807L, h, false, false, false, false);
    }

    private final jo z(n1c n1cVar, Object obj, long j, long j2, long j3) {
        long j4;
        long j5;
        long j6;
        n1cVar.n(obj, this.a);
        int c = this.a.c(j);
        if (c != -1) {
            this.a.m(c);
        }
        if (c == -1) {
            this.a.b();
        } else {
            this.a.n(c);
        }
        zzf zzfVar = new zzf(obj, j3, c);
        boolean c2 = c(zzfVar);
        boolean a = a(n1cVar, zzfVar);
        boolean C = C(n1cVar, zzfVar, c2);
        if (c != -1) {
            this.a.n(c);
        }
        if (c != -1) {
            this.a.i(c);
            j4 = 0;
        } else {
            j4 = -9223372036854775807L;
        }
        if (j4 != -9223372036854775807L) {
            j6 = 0;
            j5 = 0;
        } else {
            j5 = this.a.d;
            j6 = j4;
        }
        return new jo(zzfVar, (j5 == -9223372036854775807L || j < j5) ? j : Math.max(0L, j5 - 1), j2, j6, j5, false, c2, a, C);
    }

    public final io d() {
        io ioVar = this.h;
        if (ioVar == null) {
            return null;
        }
        if (ioVar == this.i) {
            this.i = ioVar.g();
        }
        ioVar.n();
        int i = this.k - 1;
        this.k = i;
        if (i == 0) {
            this.j = null;
            io ioVar2 = this.h;
            this.l = ioVar2.b;
            this.m = ioVar2.f.a.d;
        }
        this.h = this.h.g();
        B();
        return this.h;
    }

    public final io e() {
        io ioVar = this.i;
        wad.b(ioVar);
        this.i = ioVar.g();
        B();
        io ioVar2 = this.i;
        wad.b(ioVar2);
        return ioVar2;
    }

    public final io f(jo joVar) {
        io ioVar = this.j;
        io U = fo.U(this.n.a, joVar, ioVar == null ? 1000000000000L : (ioVar.e() + ioVar.f.e) - joVar.b);
        io ioVar2 = this.j;
        if (ioVar2 != null) {
            ioVar2.o(U);
        } else {
            this.h = U;
            this.i = U;
        }
        this.l = null;
        this.j = U;
        this.k++;
        B();
        return U;
    }

    public final io g() {
        return this.j;
    }

    public final io h() {
        return this.h;
    }

    public final io i() {
        return this.i;
    }

    public final jo j(long j, xo xoVar) {
        io ioVar = this.j;
        return ioVar == null ? x(xoVar.a, xoVar.b, xoVar.c, xoVar.r) : w(xoVar.a, ioVar, j);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x005f  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0067  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final com.google.android.gms.internal.ads.jo k(defpackage.n1c r20, com.google.android.gms.internal.ads.jo r21) {
        /*
            r19 = this;
            r0 = r19
            r1 = r20
            r2 = r21
            zzf r3 = r2.a
            boolean r11 = c(r3)
            boolean r12 = r0.a(r1, r3)
            boolean r13 = r0.C(r1, r3, r11)
            zzf r4 = r2.a
            java.lang.Object r4 = r4.a
            fyb r5 = r0.a
            r1.n(r4, r5)
            boolean r1 = r3.b()
            r4 = -1
            r5 = 0
            r7 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            if (r1 != 0) goto L2f
            int r1 = r3.e
            if (r1 != r4) goto L31
        L2f:
            r9 = r7
            goto L37
        L31:
            fyb r9 = r0.a
            r9.i(r1)
            r9 = r5
        L37:
            boolean r1 = r3.b()
            if (r1 == 0) goto L4d
            fyb r1 = r0.a
            int r5 = r3.b
            int r6 = r3.c
            long r5 = r1.h(r5, r6)
        L47:
            r17 = r5
            r6 = r9
            r8 = r17
            goto L59
        L4d:
            int r1 = (r9 > r7 ? 1 : (r9 == r7 ? 0 : -1))
            if (r1 == 0) goto L54
            r8 = r5
            r6 = r8
            goto L59
        L54:
            fyb r1 = r0.a
            long r5 = r1.d
            goto L47
        L59:
            boolean r1 = r3.b()
            if (r1 == 0) goto L67
            fyb r0 = r0.a
            int r1 = r3.b
            r0.n(r1)
            goto L70
        L67:
            int r1 = r3.e
            if (r1 == r4) goto L70
            fyb r0 = r0.a
            r0.n(r1)
        L70:
            com.google.android.gms.internal.ads.jo r14 = new com.google.android.gms.internal.ads.jo
            long r4 = r2.b
            long r1 = r2.c
            r10 = 0
            r0 = r14
            r15 = r1
            r1 = r3
            r2 = r4
            r4 = r15
            r0.<init>(r1, r2, r4, r6, r8, r10, r11, r12, r13)
            return r14
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.lo.k(n1c, com.google.android.gms.internal.ads.jo):com.google.android.gms.internal.ads.jo");
    }

    public final zzf l(n1c n1cVar, Object obj, long j) {
        long j2;
        int a;
        int i = n1cVar.n(obj, this.a).c;
        Object obj2 = this.l;
        if (obj2 == null || (a = n1cVar.a(obj2)) == -1 || n1cVar.d(a, this.a, false).c != i) {
            io ioVar = this.h;
            while (true) {
                if (ioVar == null) {
                    io ioVar2 = this.h;
                    while (true) {
                        if (ioVar2 != null) {
                            int a2 = n1cVar.a(ioVar2.b);
                            if (a2 != -1 && n1cVar.d(a2, this.a, false).c == i) {
                                j2 = ioVar2.f.a.d;
                                break;
                            }
                            ioVar2 = ioVar2.g();
                        } else {
                            j2 = this.e;
                            this.e = 1 + j2;
                            if (this.h == null) {
                                this.l = obj;
                                this.m = j2;
                            }
                        }
                    }
                } else {
                    if (ioVar.b.equals(obj)) {
                        j2 = ioVar.f.a.d;
                        break;
                    }
                    ioVar = ioVar.g();
                }
            }
        } else {
            j2 = this.m;
        }
        long j3 = j2;
        n1cVar.n(obj, this.a);
        n1cVar.e(this.a.c, this.b, 0L);
        int a3 = n1cVar.a(obj);
        Object obj3 = obj;
        while (true) {
            l0c l0cVar = this.b;
            if (a3 < l0cVar.n) {
                return A(n1cVar, obj3, j, j3, l0cVar, this.a);
            }
            n1cVar.d(a3, this.a, true);
            this.a.b();
            fyb fybVar = this.a;
            if (fybVar.d(fybVar.d) != -1) {
                obj3 = this.a.b;
                obj3.getClass();
            }
            a3--;
        }
    }

    public final void m() {
        if (this.k == 0) {
            return;
        }
        io ioVar = this.h;
        wad.b(ioVar);
        this.l = ioVar.b;
        this.m = ioVar.f.a.d;
        while (ioVar != null) {
            ioVar.n();
            ioVar = ioVar.g();
        }
        this.h = null;
        this.j = null;
        this.i = null;
        this.k = 0;
        B();
    }

    final /* synthetic */ void n(h9 h9Var, zzf zzfVar) {
        this.c.F(h9Var.j(), zzfVar);
    }

    public final void o(long j) {
        io ioVar = this.j;
        if (ioVar != null) {
            ioVar.m(j);
        }
    }

    public final boolean p(xzf xzfVar) {
        io ioVar = this.j;
        return ioVar != null && ioVar.a == xzfVar;
    }

    public final boolean q(io ioVar) {
        wad.b(ioVar);
        boolean z = false;
        if (ioVar.equals(this.j)) {
            return false;
        }
        this.j = ioVar;
        while (ioVar.g() != null) {
            ioVar = ioVar.g();
            ioVar.getClass();
            if (ioVar == this.i) {
                this.i = this.h;
                z = true;
            }
            ioVar.n();
            this.k--;
        }
        io ioVar2 = this.j;
        ioVar2.getClass();
        ioVar2.o(null);
        B();
        return z;
    }

    public final boolean r() {
        io ioVar = this.j;
        if (ioVar == null) {
            return true;
        }
        if (ioVar.f.i || !ioVar.r() || this.j.f.e == -9223372036854775807L) {
            return false;
        }
        return this.k < 100;
    }

    public final boolean s(n1c n1cVar, long j, long j2) {
        jo joVar;
        boolean z;
        io ioVar = null;
        for (io ioVar2 = this.h; ioVar2 != null; ioVar2 = ioVar2.g()) {
            jo joVar2 = ioVar2.f;
            if (ioVar == null) {
                joVar = k(n1cVar, joVar2);
            } else {
                jo w = w(n1cVar, ioVar, j);
                if (w == null) {
                    return !q(ioVar);
                }
                if (joVar2.b != w.b || !joVar2.a.equals(w.a)) {
                    return !q(ioVar);
                }
                joVar = w;
            }
            ioVar2.f = joVar.a(joVar2.c);
            long j3 = joVar2.e;
            long j4 = joVar.e;
            if (j3 != -9223372036854775807L && j3 != j4) {
                ioVar2.q();
                long j5 = joVar.e;
                long e = j5 == -9223372036854775807L ? Long.MAX_VALUE : j5 + ioVar2.e();
                if (ioVar2 == this.i) {
                    boolean z2 = ioVar2.f.f;
                    if (j2 == Long.MIN_VALUE || j2 >= e) {
                        z = true;
                        return q(ioVar2) && !z;
                    }
                }
                z = false;
                if (q(ioVar2)) {
                }
            }
            ioVar = ioVar2;
        }
        return true;
    }

    public final boolean t(n1c n1cVar, int i) {
        this.f = i;
        return b(n1cVar);
    }

    public final boolean u(n1c n1cVar, boolean z) {
        this.g = z;
        return b(n1cVar);
    }
}
