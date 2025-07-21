package defpackage;

import android.graphics.Outline;
import androidx.compose.ui.unit.LayoutDirection;
import defpackage.el5;
import defpackage.zt7;

/* loaded from: classes.dex */
public final class gl5 {
    private fm1 a;
    private boolean b = true;
    private final Outline c;
    private long d;
    private no7 e;
    private ip5 f;
    private ip5 g;
    private boolean h;
    private boolean i;
    private ip5 j;
    private a37 k;
    private float l;
    private long m;
    private long n;
    private boolean o;
    private LayoutDirection p;
    private ip5 q;
    private ip5 r;
    private el5 s;

    public gl5(fm1 fm1Var) {
        this.a = fm1Var;
        Outline outline = new Outline();
        outline.setAlpha(1.0f);
        this.c = outline;
        zt7.a aVar = zt7.b;
        this.d = aVar.b();
        this.e = qt6.a();
        this.m = fd5.b.c();
        this.n = aVar.b();
        this.p = LayoutDirection.Ltr;
    }

    private final boolean g(a37 a37Var, long j, long j2, float f) {
        return a37Var != null && b37.f(a37Var) && a37Var.e() == fd5.o(j) && a37Var.g() == fd5.p(j) && a37Var.f() == fd5.o(j) + zt7.i(j2) && a37Var.a() == fd5.p(j) + zt7.g(j2) && f01.d(a37Var.h()) == f;
    }

    private final void j() {
        if (this.h) {
            this.m = fd5.b.c();
            long j = this.d;
            this.n = j;
            this.l = 0.0f;
            this.g = null;
            this.h = false;
            this.i = false;
            if (!this.o || zt7.i(j) <= 0.0f || zt7.g(this.d) <= 0.0f) {
                this.c.setEmpty();
                return;
            }
            this.b = true;
            el5 a = this.e.a(this.d, this.p, this.a);
            this.s = a;
            if (a instanceof el5.b) {
                l(((el5.b) a).a());
            } else if (a instanceof el5.c) {
                m(((el5.c) a).a());
            } else if (a instanceof el5.a) {
                k(((el5.a) a).a());
            }
        }
    }

    private final void k(ip5 ip5Var) {
        Outline outline = this.c;
        if (!(ip5Var instanceof zf)) {
            throw new UnsupportedOperationException("Unable to obtain android.graphics.Path");
        }
        outline.setConvexPath(((zf) ip5Var).c());
        this.i = !this.c.canClip();
        this.g = ip5Var;
    }

    private final void l(kt6 kt6Var) {
        this.m = hd5.a(kt6Var.i(), kt6Var.l());
        this.n = du7.a(kt6Var.n(), kt6Var.h());
        this.c.setRect(dg4.d(kt6Var.i()), dg4.d(kt6Var.l()), dg4.d(kt6Var.j()), dg4.d(kt6Var.e()));
    }

    private final void m(a37 a37Var) {
        float d = f01.d(a37Var.h());
        this.m = hd5.a(a37Var.e(), a37Var.g());
        this.n = du7.a(a37Var.j(), a37Var.d());
        if (b37.f(a37Var)) {
            this.c.setRoundRect(dg4.d(a37Var.e()), dg4.d(a37Var.g()), dg4.d(a37Var.f()), dg4.d(a37Var.a()), d);
            this.l = d;
            return;
        }
        ip5 ip5Var = this.f;
        if (ip5Var == null) {
            ip5Var = cg.a();
            this.f = ip5Var;
        }
        ip5Var.a();
        ip5Var.D(a37Var);
        k(ip5Var);
    }

    public final void a(ph0 ph0Var) {
        ip5 c = c();
        if (c != null) {
            ph0.m(ph0Var, c, 0, 2, null);
            return;
        }
        float f = this.l;
        if (f <= 0.0f) {
            ph0.i(ph0Var, fd5.o(this.m), fd5.p(this.m), zt7.i(this.n) + fd5.o(this.m), zt7.g(this.n) + fd5.p(this.m), 0, 16, null);
            return;
        }
        ip5 ip5Var = this.j;
        a37 a37Var = this.k;
        if (ip5Var == null || !g(a37Var, this.m, this.n, f)) {
            a37 d = b37.d(fd5.o(this.m), fd5.p(this.m), fd5.o(this.m) + zt7.i(this.n), fd5.p(this.m) + zt7.g(this.n), g01.b(this.l, 0.0f, 2, null));
            if (ip5Var == null) {
                ip5Var = cg.a();
            } else {
                ip5Var.a();
            }
            ip5Var.D(d);
            this.k = d;
            this.j = ip5Var;
        }
        ph0.m(ph0Var, ip5Var, 0, 2, null);
    }

    public final boolean b() {
        return this.h;
    }

    public final ip5 c() {
        j();
        return this.g;
    }

    public final Outline d() {
        j();
        if (this.o && this.b) {
            return this.c;
        }
        return null;
    }

    public final boolean e() {
        return !this.i;
    }

    public final boolean f(long j) {
        el5 el5Var;
        if (this.o && (el5Var = this.s) != null) {
            return qo7.b(el5Var, fd5.o(j), fd5.p(j), this.q, this.r);
        }
        return true;
    }

    public final boolean h(no7 no7Var, float f, boolean z, float f2, LayoutDirection layoutDirection, fm1 fm1Var) {
        this.c.setAlpha(f);
        boolean c = zq3.c(this.e, no7Var);
        boolean z2 = !c;
        if (!c) {
            this.e = no7Var;
            this.h = true;
        }
        boolean z3 = z || f2 > 0.0f;
        if (this.o != z3) {
            this.o = z3;
            this.h = true;
        }
        if (this.p != layoutDirection) {
            this.p = layoutDirection;
            this.h = true;
        }
        if (!zq3.c(this.a, fm1Var)) {
            this.a = fm1Var;
            this.h = true;
        }
        return z2;
    }

    public final void i(long j) {
        if (zt7.f(this.d, j)) {
            return;
        }
        this.d = j;
        this.h = true;
    }
}
