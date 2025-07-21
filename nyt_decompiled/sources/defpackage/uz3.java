package defpackage;

import androidx.compose.ui.Modifier;
import androidx.compose.ui.node.NodeCoordinator;
import androidx.compose.ui.unit.LayoutDirection;
import defpackage.rh0;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes.dex */
public final class uz3 implements fv1, yv0 {
    private final rh0 a;
    private cv1 b;

    public uz3(rh0 rh0Var) {
        this.a = rh0Var;
    }

    @Override // defpackage.an2
    public long A(float f) {
        return this.a.A(f);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v0, types: [androidx.compose.ui.Modifier$c] */
    /* JADX WARN: Type inference failed for: r2v10 */
    /* JADX WARN: Type inference failed for: r2v11 */
    /* JADX WARN: Type inference failed for: r2v12 */
    /* JADX WARN: Type inference failed for: r2v2, types: [androidx.compose.ui.Modifier$c] */
    /* JADX WARN: Type inference failed for: r2v4 */
    /* JADX WARN: Type inference failed for: r2v5, types: [androidx.compose.ui.Modifier$c] */
    /* JADX WARN: Type inference failed for: r2v6, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v7 */
    /* JADX WARN: Type inference failed for: r2v8 */
    /* JADX WARN: Type inference failed for: r2v9 */
    /* JADX WARN: Type inference failed for: r4v0 */
    /* JADX WARN: Type inference failed for: r4v1 */
    /* JADX WARN: Type inference failed for: r4v10 */
    /* JADX WARN: Type inference failed for: r4v11 */
    /* JADX WARN: Type inference failed for: r4v2 */
    /* JADX WARN: Type inference failed for: r4v3, types: [vy4] */
    /* JADX WARN: Type inference failed for: r4v4 */
    /* JADX WARN: Type inference failed for: r4v5 */
    /* JADX WARN: Type inference failed for: r4v6, types: [vy4] */
    /* JADX WARN: Type inference failed for: r4v8 */
    /* JADX WARN: Type inference failed for: r4v9 */
    @Override // defpackage.yv0
    public void A1() {
        ul1 b;
        ph0 c = i1().c();
        cv1 cv1Var = this.b;
        zq3.e(cv1Var);
        b = vz3.b(cv1Var);
        if (b == 0) {
            NodeCoordinator h = rl1.h(cv1Var, a85.a(4));
            if (h.k2() == cv1Var.c0()) {
                h = h.l2();
                zq3.e(h);
            }
            h.G2(c);
            return;
        }
        int a = a85.a(4);
        ?? r4 = 0;
        while (b != 0) {
            if (b instanceof cv1) {
                f((cv1) b, c);
            } else if ((b.G1() & a) != 0 && (b instanceof ul1)) {
                Modifier.c f2 = b.f2();
                int i = 0;
                b = b;
                r4 = r4;
                while (f2 != null) {
                    if ((f2.G1() & a) != 0) {
                        i++;
                        r4 = r4;
                        if (i == 1) {
                            b = f2;
                        } else {
                            if (r4 == 0) {
                                r4 = new vy4(new Modifier.c[16], 0);
                            }
                            if (b != 0) {
                                r4.b(b);
                                b = 0;
                            }
                            r4.b(f2);
                        }
                    }
                    f2 = f2.C1();
                    b = b;
                    r4 = r4;
                }
                if (i == 1) {
                }
            }
            b = rl1.g(r4);
        }
    }

    @Override // defpackage.fm1
    public long B(long j) {
        return this.a.B(j);
    }

    @Override // defpackage.fv1
    public void D(long j, float f, long j2, float f2, gv1 gv1Var, qn0 qn0Var, int i) {
        this.a.D(j, f, j2, f2, gv1Var, qn0Var, i);
    }

    @Override // defpackage.an2
    public float F(long j) {
        return this.a.F(j);
    }

    @Override // defpackage.fv1
    public void G(long j, float f, float f2, boolean z, long j2, long j3, float f3, gv1 gv1Var, qn0 qn0Var, int i) {
        this.a.G(j, f, f2, z, j2, j3, f3, gv1Var, qn0Var, i);
    }

    @Override // defpackage.fv1
    public void N(yc0 yc0Var, long j, long j2, float f, int i, mp5 mp5Var, float f2, qn0 qn0Var, int i2) {
        this.a.N(yc0Var, j, j2, f, i, mp5Var, f2, qn0Var, i2);
    }

    @Override // defpackage.fv1
    public void O0(sf3 sf3Var, long j, long j2, long j3, long j4, float f, gv1 gv1Var, qn0 qn0Var, int i, int i2) {
        this.a.O0(sf3Var, j, j2, j3, j4, f, gv1Var, qn0Var, i, i2);
    }

    @Override // defpackage.fm1
    public long Q(float f) {
        return this.a.Q(f);
    }

    @Override // defpackage.fv1
    public void T0(ip5 ip5Var, long j, float f, gv1 gv1Var, qn0 qn0Var, int i) {
        this.a.T0(ip5Var, j, f, gv1Var, qn0Var, i);
    }

    @Override // defpackage.fm1
    public float X0(float f) {
        return this.a.X0(f);
    }

    @Override // defpackage.fv1
    public long b() {
        return this.a.b();
    }

    @Override // defpackage.an2
    public float c1() {
        return this.a.c1();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r15v0, types: [androidx.compose.ui.Modifier$c] */
    /* JADX WARN: Type inference failed for: r15v1, types: [androidx.compose.ui.Modifier$c] */
    /* JADX WARN: Type inference failed for: r15v10 */
    /* JADX WARN: Type inference failed for: r15v2 */
    /* JADX WARN: Type inference failed for: r15v3, types: [androidx.compose.ui.Modifier$c] */
    /* JADX WARN: Type inference failed for: r15v4, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r15v5 */
    /* JADX WARN: Type inference failed for: r15v6 */
    /* JADX WARN: Type inference failed for: r15v7 */
    /* JADX WARN: Type inference failed for: r15v8 */
    /* JADX WARN: Type inference failed for: r15v9 */
    /* JADX WARN: Type inference failed for: r2v0 */
    /* JADX WARN: Type inference failed for: r2v1 */
    /* JADX WARN: Type inference failed for: r2v10 */
    /* JADX WARN: Type inference failed for: r2v11 */
    /* JADX WARN: Type inference failed for: r2v2 */
    /* JADX WARN: Type inference failed for: r2v3, types: [vy4] */
    /* JADX WARN: Type inference failed for: r2v4 */
    /* JADX WARN: Type inference failed for: r2v5 */
    /* JADX WARN: Type inference failed for: r2v6, types: [vy4] */
    /* JADX WARN: Type inference failed for: r2v8 */
    /* JADX WARN: Type inference failed for: r2v9 */
    public final void d(ph0 ph0Var, long j, NodeCoordinator nodeCoordinator, Modifier.c cVar) {
        int a = a85.a(4);
        ?? r2 = 0;
        while (cVar != 0) {
            if (cVar instanceof cv1) {
                e(ph0Var, j, nodeCoordinator, cVar);
            } else if ((cVar.G1() & a) != 0 && (cVar instanceof ul1)) {
                Modifier.c f2 = cVar.f2();
                int i = 0;
                r2 = r2;
                cVar = cVar;
                while (f2 != null) {
                    if ((f2.G1() & a) != 0) {
                        i++;
                        r2 = r2;
                        if (i == 1) {
                            cVar = f2;
                        } else {
                            if (r2 == 0) {
                                r2 = new vy4(new Modifier.c[16], 0);
                            }
                            if (cVar != 0) {
                                r2.b(cVar);
                                cVar = 0;
                            }
                            r2.b(f2);
                        }
                    }
                    f2 = f2.C1();
                    r2 = r2;
                    cVar = cVar;
                }
                if (i == 1) {
                }
            }
            cVar = rl1.g(r2);
        }
    }

    public final void e(ph0 ph0Var, long j, NodeCoordinator nodeCoordinator, cv1 cv1Var) {
        cv1 cv1Var2 = this.b;
        this.b = cv1Var;
        rh0 rh0Var = this.a;
        LayoutDirection layoutDirection = nodeCoordinator.getLayoutDirection();
        rh0.a u = rh0Var.u();
        fm1 a = u.a();
        LayoutDirection b = u.b();
        ph0 c = u.c();
        long d = u.d();
        rh0.a u2 = rh0Var.u();
        u2.j(nodeCoordinator);
        u2.k(layoutDirection);
        u2.i(ph0Var);
        u2.l(j);
        ph0Var.t();
        cv1Var.w(this);
        ph0Var.k();
        rh0.a u3 = rh0Var.u();
        u3.j(a);
        u3.k(b);
        u3.i(c);
        u3.l(d);
        this.b = cv1Var2;
    }

    public final void f(cv1 cv1Var, ph0 ph0Var) {
        NodeCoordinator h = rl1.h(cv1Var, a85.a(4));
        h.f2().Z().e(ph0Var, in3.c(h.a()), h, cv1Var);
    }

    @Override // defpackage.fm1
    public float f1(float f) {
        return this.a.f1(f);
    }

    @Override // defpackage.fm1
    public float getDensity() {
        return this.a.getDensity();
    }

    @Override // defpackage.fv1
    public LayoutDirection getLayoutDirection() {
        return this.a.getLayoutDirection();
    }

    @Override // defpackage.fv1
    public zu1 i1() {
        return this.a.i1();
    }

    @Override // defpackage.fm1
    public int k1(long j) {
        return this.a.k1(j);
    }

    @Override // defpackage.fm1
    public int l0(float f) {
        return this.a.l0(f);
    }

    @Override // defpackage.fv1
    public void n1(long j, long j2, long j3, long j4, gv1 gv1Var, float f, qn0 qn0Var, int i) {
        this.a.n1(j, j2, j3, j4, gv1Var, f, qn0Var, i);
    }

    @Override // defpackage.fv1
    public void q0(yc0 yc0Var, long j, long j2, long j3, float f, gv1 gv1Var, qn0 qn0Var, int i) {
        this.a.q0(yc0Var, j, j2, j3, f, gv1Var, qn0Var, i);
    }

    @Override // defpackage.fv1
    public void q1(sf3 sf3Var, long j, float f, gv1 gv1Var, qn0 qn0Var, int i) {
        this.a.q1(sf3Var, j, f, gv1Var, qn0Var, i);
    }

    @Override // defpackage.fv1
    public void r1(ip5 ip5Var, yc0 yc0Var, float f, gv1 gv1Var, qn0 qn0Var, int i) {
        this.a.r1(ip5Var, yc0Var, f, gv1Var, qn0Var, i);
    }

    @Override // defpackage.fv1
    public void s1(long j, long j2, long j3, float f, gv1 gv1Var, qn0 qn0Var, int i) {
        this.a.s1(j, j2, j3, f, gv1Var, qn0Var, i);
    }

    @Override // defpackage.fm1
    public float t0(long j) {
        return this.a.t0(j);
    }

    @Override // defpackage.fv1
    public long t1() {
        return this.a.t1();
    }

    @Override // defpackage.fm1
    public float v(int i) {
        return this.a.v(i);
    }

    @Override // defpackage.fm1
    public long v1(long j) {
        return this.a.v1(j);
    }

    @Override // defpackage.fv1
    public void y0(long j, long j2, long j3, float f, int i, mp5 mp5Var, float f2, qn0 qn0Var, int i2) {
        this.a.y0(j, j2, j3, f, i, mp5Var, f2, qn0Var, i2);
    }

    @Override // defpackage.fv1
    public void z1(yc0 yc0Var, long j, long j2, float f, gv1 gv1Var, qn0 qn0Var, int i) {
        this.a.z1(yc0Var, j, j2, f, gv1Var, qn0Var, i);
    }

    public /* synthetic */ uz3(rh0 rh0Var, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? new rh0() : rh0Var);
    }
}
