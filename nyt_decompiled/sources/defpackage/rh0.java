package defpackage;

import androidx.compose.ui.unit.LayoutDirection;
import defpackage.nn0;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes.dex */
public final class rh0 implements fv1 {
    private final a a = new a(null, null, null, 0, 15, null);
    private final zu1 b = new b();
    private ao5 c;
    private ao5 d;

    public static final class a {
        private fm1 a;
        private LayoutDirection b;
        private ph0 c;
        private long d;

        public /* synthetic */ a(fm1 fm1Var, LayoutDirection layoutDirection, ph0 ph0Var, long j, DefaultConstructorMarker defaultConstructorMarker) {
            this(fm1Var, layoutDirection, ph0Var, j);
        }

        public final fm1 a() {
            return this.a;
        }

        public final LayoutDirection b() {
            return this.b;
        }

        public final ph0 c() {
            return this.c;
        }

        public final long d() {
            return this.d;
        }

        public final ph0 e() {
            return this.c;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return zq3.c(this.a, aVar.a) && this.b == aVar.b && zq3.c(this.c, aVar.c) && zt7.f(this.d, aVar.d);
        }

        public final fm1 f() {
            return this.a;
        }

        public final LayoutDirection g() {
            return this.b;
        }

        public final long h() {
            return this.d;
        }

        public int hashCode() {
            return (((((this.a.hashCode() * 31) + this.b.hashCode()) * 31) + this.c.hashCode()) * 31) + zt7.j(this.d);
        }

        public final void i(ph0 ph0Var) {
            this.c = ph0Var;
        }

        public final void j(fm1 fm1Var) {
            this.a = fm1Var;
        }

        public final void k(LayoutDirection layoutDirection) {
            this.b = layoutDirection;
        }

        public final void l(long j) {
            this.d = j;
        }

        public String toString() {
            return "DrawParams(density=" + this.a + ", layoutDirection=" + this.b + ", canvas=" + this.c + ", size=" + ((Object) zt7.l(this.d)) + ')';
        }

        private a(fm1 fm1Var, LayoutDirection layoutDirection, ph0 ph0Var, long j) {
            this.a = fm1Var;
            this.b = layoutDirection;
            this.c = ph0Var;
            this.d = j;
        }

        public /* synthetic */ a(fm1 fm1Var, LayoutDirection layoutDirection, ph0 ph0Var, long j, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? av1.a() : fm1Var, (i & 2) != 0 ? LayoutDirection.Ltr : layoutDirection, (i & 4) != 0 ? new j02() : ph0Var, (i & 8) != 0 ? zt7.b.b() : j, null);
        }
    }

    public static final class b implements zu1 {
        private final iv1 a;

        b() {
            iv1 b;
            b = sh0.b(this);
            this.a = b;
        }

        @Override // defpackage.zu1
        public iv1 a() {
            return this.a;
        }

        @Override // defpackage.zu1
        public long b() {
            return rh0.this.u().h();
        }

        @Override // defpackage.zu1
        public ph0 c() {
            return rh0.this.u().e();
        }

        @Override // defpackage.zu1
        public void d(long j) {
            rh0.this.u().l(j);
        }
    }

    private final ao5 C(gv1 gv1Var) {
        if (zq3.c(gv1Var, qf2.a)) {
            return y();
        }
        if (!(gv1Var instanceof u48)) {
            throw new NoWhenBranchMatchedException();
        }
        ao5 z = z();
        u48 u48Var = (u48) gv1Var;
        if (z.x() != u48Var.f()) {
            z.w(u48Var.f());
        }
        if (!v48.e(z.i(), u48Var.b())) {
            z.d(u48Var.b());
        }
        if (z.o() != u48Var.d()) {
            z.s(u48Var.d());
        }
        if (!x48.e(z.n(), u48Var.c())) {
            z.j(u48Var.c());
        }
        z.l();
        u48Var.e();
        if (zq3.c(null, null)) {
            return z;
        }
        u48Var.e();
        z.g(null);
        return z;
    }

    private final ao5 d(long j, gv1 gv1Var, float f, qn0 qn0Var, int i, int i2) {
        ao5 C = C(gv1Var);
        long w = w(j, f);
        if (!nn0.t(C.b(), w)) {
            C.k(w);
        }
        if (C.r() != null) {
            C.q(null);
        }
        if (!zq3.c(C.f(), qn0Var)) {
            C.t(qn0Var);
        }
        if (!b90.E(C.m(), i)) {
            C.e(i);
        }
        if (!jh2.d(C.u(), i2)) {
            C.h(i2);
        }
        return C;
    }

    static /* synthetic */ ao5 e(rh0 rh0Var, long j, gv1 gv1Var, float f, qn0 qn0Var, int i, int i2, int i3, Object obj) {
        return rh0Var.d(j, gv1Var, f, qn0Var, i, (i3 & 32) != 0 ? fv1.p.b() : i2);
    }

    private final ao5 f(yc0 yc0Var, gv1 gv1Var, float f, qn0 qn0Var, int i, int i2) {
        ao5 C = C(gv1Var);
        if (yc0Var != null) {
            yc0Var.a(b(), C, f);
        } else {
            if (C.r() != null) {
                C.q(null);
            }
            long b2 = C.b();
            nn0.a aVar = nn0.b;
            if (!nn0.t(b2, aVar.a())) {
                C.k(aVar.a());
            }
            if (C.a() != f) {
                C.c(f);
            }
        }
        if (!zq3.c(C.f(), qn0Var)) {
            C.t(qn0Var);
        }
        if (!b90.E(C.m(), i)) {
            C.e(i);
        }
        if (!jh2.d(C.u(), i2)) {
            C.h(i2);
        }
        return C;
    }

    static /* synthetic */ ao5 i(rh0 rh0Var, yc0 yc0Var, gv1 gv1Var, float f, qn0 qn0Var, int i, int i2, int i3, Object obj) {
        if ((i3 & 32) != 0) {
            i2 = fv1.p.b();
        }
        return rh0Var.f(yc0Var, gv1Var, f, qn0Var, i, i2);
    }

    private final ao5 k(long j, float f, float f2, int i, int i2, mp5 mp5Var, float f3, qn0 qn0Var, int i3, int i4) {
        ao5 z = z();
        long w = w(j, f3);
        if (!nn0.t(z.b(), w)) {
            z.k(w);
        }
        if (z.r() != null) {
            z.q(null);
        }
        if (!zq3.c(z.f(), qn0Var)) {
            z.t(qn0Var);
        }
        if (!b90.E(z.m(), i3)) {
            z.e(i3);
        }
        if (z.x() != f) {
            z.w(f);
        }
        if (z.o() != f2) {
            z.s(f2);
        }
        if (!v48.e(z.i(), i)) {
            z.d(i);
        }
        if (!x48.e(z.n(), i2)) {
            z.j(i2);
        }
        z.l();
        if (!zq3.c(null, mp5Var)) {
            z.g(mp5Var);
        }
        if (!jh2.d(z.u(), i4)) {
            z.h(i4);
        }
        return z;
    }

    static /* synthetic */ ao5 l(rh0 rh0Var, long j, float f, float f2, int i, int i2, mp5 mp5Var, float f3, qn0 qn0Var, int i3, int i4, int i5, Object obj) {
        return rh0Var.k(j, f, f2, i, i2, mp5Var, f3, qn0Var, i3, (i5 & 512) != 0 ? fv1.p.b() : i4);
    }

    private final ao5 m(yc0 yc0Var, float f, float f2, int i, int i2, mp5 mp5Var, float f3, qn0 qn0Var, int i3, int i4) {
        ao5 z = z();
        if (yc0Var != null) {
            yc0Var.a(b(), z, f3);
        } else if (z.a() != f3) {
            z.c(f3);
        }
        if (!zq3.c(z.f(), qn0Var)) {
            z.t(qn0Var);
        }
        if (!b90.E(z.m(), i3)) {
            z.e(i3);
        }
        if (z.x() != f) {
            z.w(f);
        }
        if (z.o() != f2) {
            z.s(f2);
        }
        if (!v48.e(z.i(), i)) {
            z.d(i);
        }
        if (!x48.e(z.n(), i2)) {
            z.j(i2);
        }
        z.l();
        if (!zq3.c(null, mp5Var)) {
            z.g(mp5Var);
        }
        if (!jh2.d(z.u(), i4)) {
            z.h(i4);
        }
        return z;
    }

    static /* synthetic */ ao5 o(rh0 rh0Var, yc0 yc0Var, float f, float f2, int i, int i2, mp5 mp5Var, float f3, qn0 qn0Var, int i3, int i4, int i5, Object obj) {
        return rh0Var.m(yc0Var, f, f2, i, i2, mp5Var, f3, qn0Var, i3, (i5 & 512) != 0 ? fv1.p.b() : i4);
    }

    private final long w(long j, float f) {
        return f == 1.0f ? j : nn0.r(j, nn0.u(j) * f, 0.0f, 0.0f, 0.0f, 14, null);
    }

    private final ao5 y() {
        ao5 ao5Var = this.c;
        if (ao5Var != null) {
            return ao5Var;
        }
        ao5 a2 = uf.a();
        a2.v(eo5.a.a());
        this.c = a2;
        return a2;
    }

    private final ao5 z() {
        ao5 ao5Var = this.d;
        if (ao5Var != null) {
            return ao5Var;
        }
        ao5 a2 = uf.a();
        a2.v(eo5.a.b());
        this.d = a2;
        return a2;
    }

    @Override // defpackage.fv1
    public void D(long j, float f, long j2, float f2, gv1 gv1Var, qn0 qn0Var, int i) {
        this.a.e().x(j2, f, e(this, j, gv1Var, f2, qn0Var, i, 0, 32, null));
    }

    @Override // defpackage.fv1
    public void G(long j, float f, float f2, boolean z, long j2, long j3, float f3, gv1 gv1Var, qn0 qn0Var, int i) {
        this.a.e().j(fd5.o(j2), fd5.p(j2), fd5.o(j2) + zt7.i(j3), fd5.p(j2) + zt7.g(j3), f, f2, z, e(this, j, gv1Var, f3, qn0Var, i, 0, 32, null));
    }

    @Override // defpackage.fv1
    public void N(yc0 yc0Var, long j, long j2, float f, int i, mp5 mp5Var, float f2, qn0 qn0Var, int i2) {
        this.a.e().p(j, j2, o(this, yc0Var, f, 4.0f, i, x48.a.b(), mp5Var, f2, qn0Var, i2, 0, 512, null));
    }

    @Override // defpackage.fv1
    public void O0(sf3 sf3Var, long j, long j2, long j3, long j4, float f, gv1 gv1Var, qn0 qn0Var, int i, int i2) {
        this.a.e().g(sf3Var, j, j2, j3, j4, f(null, gv1Var, f, qn0Var, i, i2));
    }

    @Override // defpackage.fv1
    public void T0(ip5 ip5Var, long j, float f, gv1 gv1Var, qn0 qn0Var, int i) {
        this.a.e().r(ip5Var, e(this, j, gv1Var, f, qn0Var, i, 0, 32, null));
    }

    @Override // defpackage.an2
    public float c1() {
        return this.a.f().c1();
    }

    @Override // defpackage.fm1
    public float getDensity() {
        return this.a.f().getDensity();
    }

    @Override // defpackage.fv1
    public LayoutDirection getLayoutDirection() {
        return this.a.g();
    }

    @Override // defpackage.fv1
    public zu1 i1() {
        return this.b;
    }

    @Override // defpackage.fv1
    public void n1(long j, long j2, long j3, long j4, gv1 gv1Var, float f, qn0 qn0Var, int i) {
        this.a.e().q(fd5.o(j2), fd5.p(j2), fd5.o(j2) + zt7.i(j3), fd5.p(j2) + zt7.g(j3), f01.d(j4), f01.e(j4), e(this, j, gv1Var, f, qn0Var, i, 0, 32, null));
    }

    @Override // defpackage.fv1
    public void q0(yc0 yc0Var, long j, long j2, long j3, float f, gv1 gv1Var, qn0 qn0Var, int i) {
        this.a.e().q(fd5.o(j), fd5.p(j), fd5.o(j) + zt7.i(j2), fd5.p(j) + zt7.g(j2), f01.d(j3), f01.e(j3), i(this, yc0Var, gv1Var, f, qn0Var, i, 0, 32, null));
    }

    @Override // defpackage.fv1
    public void q1(sf3 sf3Var, long j, float f, gv1 gv1Var, qn0 qn0Var, int i) {
        this.a.e().l(sf3Var, j, i(this, null, gv1Var, f, qn0Var, i, 0, 32, null));
    }

    @Override // defpackage.fv1
    public void r1(ip5 ip5Var, yc0 yc0Var, float f, gv1 gv1Var, qn0 qn0Var, int i) {
        this.a.e().r(ip5Var, i(this, yc0Var, gv1Var, f, qn0Var, i, 0, 32, null));
    }

    @Override // defpackage.fv1
    public void s1(long j, long j2, long j3, float f, gv1 gv1Var, qn0 qn0Var, int i) {
        this.a.e().y(fd5.o(j2), fd5.p(j2), fd5.o(j2) + zt7.i(j3), fd5.p(j2) + zt7.g(j3), e(this, j, gv1Var, f, qn0Var, i, 0, 32, null));
    }

    public final a u() {
        return this.a;
    }

    @Override // defpackage.fv1
    public void y0(long j, long j2, long j3, float f, int i, mp5 mp5Var, float f2, qn0 qn0Var, int i2) {
        this.a.e().p(j2, j3, l(this, j, f, 4.0f, i, x48.a.b(), mp5Var, f2, qn0Var, i2, 0, 512, null));
    }

    @Override // defpackage.fv1
    public void z1(yc0 yc0Var, long j, long j2, float f, gv1 gv1Var, qn0 qn0Var, int i) {
        this.a.e().y(fd5.o(j), fd5.p(j), fd5.o(j) + zt7.i(j2), fd5.p(j) + zt7.g(j2), i(this, yc0Var, gv1Var, f, qn0Var, i, 0, 32, null));
    }
}
