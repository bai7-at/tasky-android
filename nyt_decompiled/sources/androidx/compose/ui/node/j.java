package androidx.compose.ui.node;

import androidx.compose.ui.node.LayoutNode;
import androidx.compose.ui.node.m;
import defpackage.ef5;
import defpackage.fv0;
import defpackage.gb;
import defpackage.om1;
import defpackage.qs2;
import defpackage.vy4;
import defpackage.xz3;
import defpackage.zq3;
import kotlin.NoWhenBranchMatchedException;

/* loaded from: classes.dex */
public final class j {
    private final LayoutNode a;
    private final om1 b;
    private boolean c;
    private final ef5 d;
    private final vy4 e;
    private long f;
    private final vy4 g;
    private fv0 h;
    private final f i;

    public static final class a {
        private final LayoutNode a;
        private final boolean b;
        private final boolean c;

        public a(LayoutNode layoutNode, boolean z, boolean z2) {
            this.a = layoutNode;
            this.b = z;
            this.c = z2;
        }

        public final LayoutNode a() {
            return this.a;
        }

        public final boolean b() {
            return this.c;
        }

        public final boolean c() {
            return this.b;
        }
    }

    public /* synthetic */ class b {
        public static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[LayoutNode.LayoutState.values().length];
            try {
                iArr[LayoutNode.LayoutState.LookaheadMeasuring.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[LayoutNode.LayoutState.Measuring.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[LayoutNode.LayoutState.LookaheadLayingOut.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[LayoutNode.LayoutState.LayingOut.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[LayoutNode.LayoutState.Idle.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            a = iArr;
        }
    }

    public j(LayoutNode layoutNode) {
        this.a = layoutNode;
        m.a aVar = m.G;
        om1 om1Var = new om1(aVar.a());
        this.b = om1Var;
        this.d = new ef5();
        this.e = new vy4(new m.b[16], 0);
        this.f = 1L;
        vy4 vy4Var = new vy4(new a[16], 0);
        this.g = vy4Var;
        this.i = aVar.a() ? new f(layoutNode, om1Var, vy4Var.g()) : null;
    }

    public static /* synthetic */ boolean A(j jVar, LayoutNode layoutNode, boolean z, int i, Object obj) {
        if ((i & 2) != 0) {
            z = false;
        }
        return jVar.z(layoutNode, z);
    }

    public static /* synthetic */ boolean C(j jVar, LayoutNode layoutNode, boolean z, int i, Object obj) {
        if ((i & 2) != 0) {
            z = false;
        }
        return jVar.B(layoutNode, z);
    }

    public static /* synthetic */ boolean F(j jVar, LayoutNode layoutNode, boolean z, int i, Object obj) {
        if ((i & 2) != 0) {
            z = false;
        }
        return jVar.E(layoutNode, z);
    }

    public static /* synthetic */ boolean H(j jVar, LayoutNode layoutNode, boolean z, int i, Object obj) {
        if ((i & 2) != 0) {
            z = false;
        }
        return jVar.G(layoutNode, z);
    }

    private final void b() {
        vy4 vy4Var = this.e;
        int q = vy4Var.q();
        if (q > 0) {
            Object[] p = vy4Var.p();
            int i = 0;
            do {
                ((m.b) p[i]).i();
                i++;
            } while (i < q);
        }
        this.e.h();
    }

    public static /* synthetic */ void d(j jVar, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            z = false;
        }
        jVar.c(z);
    }

    private final boolean e(LayoutNode layoutNode, fv0 fv0Var) {
        if (layoutNode.Y() == null) {
            return false;
        }
        boolean L0 = fv0Var != null ? layoutNode.L0(fv0Var) : LayoutNode.N0(layoutNode, null, 1, null);
        LayoutNode k0 = layoutNode.k0();
        if (L0 && k0 != null) {
            if (k0.Y() == null) {
                H(this, k0, false, 2, null);
            } else if (layoutNode.e0() == LayoutNode.UsageByParent.InMeasureBlock) {
                C(this, k0, false, 2, null);
            } else if (layoutNode.e0() == LayoutNode.UsageByParent.InLayoutBlock) {
                A(this, k0, false, 2, null);
            }
        }
        return L0;
    }

    private final boolean f(LayoutNode layoutNode, fv0 fv0Var) {
        boolean Z0 = fv0Var != null ? layoutNode.Z0(fv0Var) : LayoutNode.a1(layoutNode, null, 1, null);
        LayoutNode k0 = layoutNode.k0();
        if (Z0 && k0 != null) {
            if (layoutNode.d0() == LayoutNode.UsageByParent.InMeasureBlock) {
                H(this, k0, false, 2, null);
            } else if (layoutNode.d0() == LayoutNode.UsageByParent.InLayoutBlock) {
                F(this, k0, false, 2, null);
            }
        }
        return Z0;
    }

    private final void h(LayoutNode layoutNode, boolean z) {
        vy4 s0 = layoutNode.s0();
        int q = s0.q();
        if (q > 0) {
            Object[] p = s0.p();
            int i = 0;
            do {
                LayoutNode layoutNode2 = (LayoutNode) p[i];
                if ((!z && m(layoutNode2)) || (z && n(layoutNode2))) {
                    if (xz3.a(layoutNode2) && !z) {
                        if (layoutNode2.W() && this.b.e(layoutNode2, true)) {
                            v(layoutNode2, true, false);
                        } else {
                            g(layoutNode2, true);
                        }
                    }
                    u(layoutNode2, z);
                    if (!s(layoutNode2, z)) {
                        h(layoutNode2, z);
                    }
                }
                i++;
            } while (i < q);
        }
        u(layoutNode, z);
    }

    private final boolean i(LayoutNode layoutNode) {
        return layoutNode.b0() && m(layoutNode);
    }

    private final boolean j(LayoutNode layoutNode) {
        return layoutNode.W() && n(layoutNode);
    }

    private final boolean m(LayoutNode layoutNode) {
        return layoutNode.d0() == LayoutNode.UsageByParent.InMeasureBlock || layoutNode.S().r().f().k();
    }

    private final boolean n(LayoutNode layoutNode) {
        AlignmentLines f;
        if (layoutNode.e0() == LayoutNode.UsageByParent.InMeasureBlock) {
            return true;
        }
        gb B = layoutNode.S().B();
        return (B == null || (f = B.f()) == null || !f.k()) ? false : true;
    }

    private final boolean s(LayoutNode layoutNode, boolean z) {
        return z ? layoutNode.W() : layoutNode.b0();
    }

    private final void u(LayoutNode layoutNode, boolean z) {
        if (s(layoutNode, z) && this.b.e(layoutNode, z)) {
            v(layoutNode, z, false);
        }
    }

    private final boolean v(LayoutNode layoutNode, boolean z, boolean z2) {
        fv0 fv0Var;
        boolean e;
        boolean f;
        LayoutNode k0;
        int i = 0;
        if (layoutNode.H0()) {
            return false;
        }
        if (!layoutNode.e() && !layoutNode.I0() && !i(layoutNode) && !zq3.c(layoutNode.J0(), Boolean.TRUE) && !j(layoutNode) && !layoutNode.B()) {
            return false;
        }
        if (layoutNode.W() || layoutNode.b0()) {
            if (layoutNode == this.a) {
                fv0Var = this.h;
                zq3.e(fv0Var);
            } else {
                fv0Var = null;
            }
            e = (layoutNode.W() && z) ? e(layoutNode, fv0Var) : false;
            f = f(layoutNode, fv0Var);
        } else {
            f = false;
            e = false;
        }
        if (z2) {
            if ((e || layoutNode.V()) && zq3.c(layoutNode.J0(), Boolean.TRUE) && z) {
                layoutNode.O0();
            }
            if (layoutNode.T() && (layoutNode == this.a || ((k0 = layoutNode.k0()) != null && k0.e() && layoutNode.I0()))) {
                if (layoutNode == this.a) {
                    layoutNode.X0(0, 0);
                } else {
                    layoutNode.d1();
                }
                this.d.d(layoutNode);
                f fVar = this.i;
                if (fVar != null) {
                    fVar.a();
                }
            }
        }
        if (this.g.t()) {
            vy4 vy4Var = this.g;
            int q = vy4Var.q();
            if (q > 0) {
                Object[] p = vy4Var.p();
                do {
                    a aVar = (a) p[i];
                    if (aVar.a().G0()) {
                        if (aVar.c()) {
                            B(aVar.a(), aVar.b());
                        } else {
                            G(aVar.a(), aVar.b());
                        }
                    }
                    i++;
                } while (i < q);
            }
            this.g.h();
        }
        return f;
    }

    static /* synthetic */ boolean w(j jVar, LayoutNode layoutNode, boolean z, boolean z2, int i, Object obj) {
        if ((i & 2) != 0) {
            z = true;
        }
        if ((i & 4) != 0) {
            z2 = true;
        }
        return jVar.v(layoutNode, z, z2);
    }

    private final void x(LayoutNode layoutNode) {
        vy4 s0 = layoutNode.s0();
        int q = s0.q();
        if (q > 0) {
            Object[] p = s0.p();
            int i = 0;
            do {
                LayoutNode layoutNode2 = (LayoutNode) p[i];
                if (m(layoutNode2)) {
                    if (xz3.a(layoutNode2)) {
                        y(layoutNode2, true);
                    } else {
                        x(layoutNode2);
                    }
                }
                i++;
            } while (i < q);
        }
    }

    private final void y(LayoutNode layoutNode, boolean z) {
        fv0 fv0Var;
        if (layoutNode == this.a) {
            fv0Var = this.h;
            zq3.e(fv0Var);
        } else {
            fv0Var = null;
        }
        if (z) {
            e(layoutNode, fv0Var);
        } else {
            f(layoutNode, fv0Var);
        }
    }

    public final boolean B(LayoutNode layoutNode, boolean z) {
        LayoutNode k0;
        LayoutNode k02;
        if (layoutNode.Y() == null) {
            throw new IllegalStateException("Error: requestLookaheadRemeasure cannot be called on a node outside LookaheadScope");
        }
        int i = b.a[layoutNode.U().ordinal()];
        if (i == 1) {
            return false;
        }
        if (i == 2 || i == 3 || i == 4) {
            this.g.b(new a(layoutNode, true, z));
            f fVar = this.i;
            if (fVar == null) {
                return false;
            }
            fVar.a();
            return false;
        }
        if (i != 5) {
            throw new NoWhenBranchMatchedException();
        }
        if (layoutNode.W() && !z) {
            return false;
        }
        layoutNode.R0();
        layoutNode.S0();
        if (layoutNode.H0()) {
            return false;
        }
        if ((zq3.c(layoutNode.J0(), Boolean.TRUE) || j(layoutNode)) && ((k0 = layoutNode.k0()) == null || !k0.W())) {
            this.b.c(layoutNode, true);
        } else if ((layoutNode.e() || i(layoutNode)) && ((k02 = layoutNode.k0()) == null || !k02.b0())) {
            this.b.c(layoutNode, false);
        }
        return !this.c;
    }

    public final void D(LayoutNode layoutNode) {
        this.d.d(layoutNode);
    }

    public final boolean E(LayoutNode layoutNode, boolean z) {
        LayoutNode k0;
        int i = b.a[layoutNode.U().ordinal()];
        if (i == 1 || i == 2 || i == 3 || i == 4) {
            f fVar = this.i;
            if (fVar != null) {
                fVar.a();
            }
        } else {
            if (i != 5) {
                throw new NoWhenBranchMatchedException();
            }
            if (!z && layoutNode.e() == layoutNode.I0() && (layoutNode.b0() || layoutNode.T())) {
                f fVar2 = this.i;
                if (fVar2 != null) {
                    fVar2.a();
                }
            } else {
                layoutNode.P0();
                if (!layoutNode.H0()) {
                    if (layoutNode.I0() && (((k0 = layoutNode.k0()) == null || !k0.T()) && (k0 == null || !k0.b0()))) {
                        this.b.c(layoutNode, false);
                    }
                    if (!this.c) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public final boolean G(LayoutNode layoutNode, boolean z) {
        LayoutNode k0;
        int i = b.a[layoutNode.U().ordinal()];
        if (i != 1 && i != 2) {
            if (i == 3 || i == 4) {
                this.g.b(new a(layoutNode, false, z));
                f fVar = this.i;
                if (fVar != null) {
                    fVar.a();
                }
            } else {
                if (i != 5) {
                    throw new NoWhenBranchMatchedException();
                }
                if (!layoutNode.b0() || z) {
                    layoutNode.S0();
                    if (!layoutNode.H0()) {
                        if ((layoutNode.e() || i(layoutNode)) && ((k0 = layoutNode.k0()) == null || !k0.b0())) {
                            this.b.c(layoutNode, false);
                        }
                        if (!this.c) {
                            return true;
                        }
                    }
                }
            }
        }
        return false;
    }

    public final void I(long j) {
        fv0 fv0Var = this.h;
        if (fv0Var == null ? false : fv0.g(fv0Var.t(), j)) {
            return;
        }
        if (this.c) {
            throw new IllegalArgumentException("updateRootConstraints called while measuring");
        }
        this.h = fv0.b(j);
        if (this.a.Y() != null) {
            this.a.R0();
        }
        this.a.S0();
        om1 om1Var = this.b;
        LayoutNode layoutNode = this.a;
        om1Var.c(layoutNode, layoutNode.Y() != null);
    }

    public final void c(boolean z) {
        if (z) {
            this.d.e(this.a);
        }
        this.d.a();
    }

    public final void g(LayoutNode layoutNode, boolean z) {
        if (this.b.g(z)) {
            return;
        }
        if (!this.c) {
            throw new IllegalStateException("forceMeasureTheSubtree should be executed during the measureAndLayout pass");
        }
        if (s(layoutNode, z)) {
            throw new IllegalArgumentException("node not yet measured");
        }
        h(layoutNode, z);
    }

    public final boolean k() {
        return this.b.h();
    }

    public final boolean l() {
        return this.d.c();
    }

    public final long o() {
        if (this.c) {
            return this.f;
        }
        throw new IllegalArgumentException("measureIteration should be only used during the measure/layout pass");
    }

    public final boolean p(qs2 qs2Var) {
        boolean z;
        DepthSortedSet depthSortedSet;
        if (!this.a.G0()) {
            throw new IllegalArgumentException("performMeasureAndLayout called with unattached root");
        }
        if (!this.a.e()) {
            throw new IllegalArgumentException("performMeasureAndLayout called with unplaced root");
        }
        if (this.c) {
            throw new IllegalArgumentException("performMeasureAndLayout called during measure layout");
        }
        boolean z2 = false;
        if (this.h != null) {
            this.c = true;
            try {
                if (this.b.h()) {
                    om1 om1Var = this.b;
                    z = false;
                    while (om1Var.h()) {
                        depthSortedSet = om1Var.a;
                        boolean d = depthSortedSet.d();
                        boolean z3 = !d;
                        LayoutNode e = (!d ? om1Var.a : om1Var.b).e();
                        boolean w = w(this, e, z3, false, 4, null);
                        if (e == this.a && w) {
                            z = true;
                        }
                    }
                    if (qs2Var != null) {
                        qs2Var.mo865invoke();
                    }
                } else {
                    z = false;
                }
                this.c = false;
                f fVar = this.i;
                if (fVar != null) {
                    fVar.a();
                }
                z2 = z;
            } catch (Throwable th) {
                this.c = false;
                throw th;
            }
        }
        b();
        return z2;
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x0073  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void q(androidx.compose.ui.node.LayoutNode r3, long r4) {
        /*
            r2 = this;
            boolean r0 = r3.H0()
            if (r0 == 0) goto L7
            return
        L7:
            androidx.compose.ui.node.LayoutNode r0 = r2.a
            boolean r0 = defpackage.zq3.c(r3, r0)
            if (r0 != 0) goto L96
            androidx.compose.ui.node.LayoutNode r0 = r2.a
            boolean r0 = r0.G0()
            if (r0 == 0) goto L8e
            androidx.compose.ui.node.LayoutNode r0 = r2.a
            boolean r0 = r0.e()
            if (r0 == 0) goto L86
            boolean r0 = r2.c
            if (r0 != 0) goto L7e
            fv0 r0 = r2.h
            if (r0 == 0) goto L7a
            r0 = 1
            r2.c = r0
            r0 = 0
            om1 r1 = r2.b     // Catch: java.lang.Throwable -> L48
            r1.i(r3)     // Catch: java.lang.Throwable -> L48
            fv0 r1 = defpackage.fv0.b(r4)     // Catch: java.lang.Throwable -> L48
            boolean r1 = r2.e(r3, r1)     // Catch: java.lang.Throwable -> L48
            fv0 r4 = defpackage.fv0.b(r4)     // Catch: java.lang.Throwable -> L48
            r2.f(r3, r4)     // Catch: java.lang.Throwable -> L48
            if (r1 != 0) goto L4a
            boolean r4 = r3.V()     // Catch: java.lang.Throwable -> L48
            if (r4 == 0) goto L59
            goto L4a
        L48:
            r3 = move-exception
            goto L77
        L4a:
            java.lang.Boolean r4 = r3.J0()     // Catch: java.lang.Throwable -> L48
            java.lang.Boolean r5 = java.lang.Boolean.TRUE     // Catch: java.lang.Throwable -> L48
            boolean r4 = defpackage.zq3.c(r4, r5)     // Catch: java.lang.Throwable -> L48
            if (r4 == 0) goto L59
            r3.O0()     // Catch: java.lang.Throwable -> L48
        L59:
            boolean r4 = r3.T()     // Catch: java.lang.Throwable -> L48
            if (r4 == 0) goto L6d
            boolean r4 = r3.e()     // Catch: java.lang.Throwable -> L48
            if (r4 == 0) goto L6d
            r3.d1()     // Catch: java.lang.Throwable -> L48
            ef5 r4 = r2.d     // Catch: java.lang.Throwable -> L48
            r4.d(r3)     // Catch: java.lang.Throwable -> L48
        L6d:
            r2.c = r0
            androidx.compose.ui.node.f r3 = r2.i
            if (r3 == 0) goto L7a
            r3.a()
            goto L7a
        L77:
            r2.c = r0
            throw r3
        L7a:
            r2.b()
            return
        L7e:
            java.lang.IllegalArgumentException r2 = new java.lang.IllegalArgumentException
            java.lang.String r3 = "performMeasureAndLayout called during measure layout"
            r2.<init>(r3)
            throw r2
        L86:
            java.lang.IllegalArgumentException r2 = new java.lang.IllegalArgumentException
            java.lang.String r3 = "performMeasureAndLayout called with unplaced root"
            r2.<init>(r3)
            throw r2
        L8e:
            java.lang.IllegalArgumentException r2 = new java.lang.IllegalArgumentException
            java.lang.String r3 = "performMeasureAndLayout called with unattached root"
            r2.<init>(r3)
            throw r2
        L96:
            java.lang.IllegalArgumentException r2 = new java.lang.IllegalArgumentException
            java.lang.String r3 = "measureAndLayout called on root"
            r2.<init>(r3)
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.node.j.q(androidx.compose.ui.node.LayoutNode, long):void");
    }

    public final void r() {
        if (this.b.h()) {
            if (!this.a.G0()) {
                throw new IllegalArgumentException("performMeasureAndLayout called with unattached root");
            }
            if (!this.a.e()) {
                throw new IllegalArgumentException("performMeasureAndLayout called with unplaced root");
            }
            if (this.c) {
                throw new IllegalArgumentException("performMeasureAndLayout called during measure layout");
            }
            if (this.h != null) {
                this.c = true;
                try {
                    if (!this.b.g(true)) {
                        if (this.a.Y() != null) {
                            y(this.a, true);
                        } else {
                            x(this.a);
                        }
                    }
                    y(this.a, false);
                    this.c = false;
                    f fVar = this.i;
                    if (fVar != null) {
                        fVar.a();
                    }
                } catch (Throwable th) {
                    this.c = false;
                    throw th;
                }
            }
        }
    }

    public final void t(LayoutNode layoutNode) {
        this.b.i(layoutNode);
    }

    public final boolean z(LayoutNode layoutNode, boolean z) {
        int i = b.a[layoutNode.U().ordinal()];
        if (i != 1) {
            if (i != 2) {
                if (i != 3) {
                    if (i != 4 && i != 5) {
                        throw new NoWhenBranchMatchedException();
                    }
                }
            }
            if ((layoutNode.W() || layoutNode.V()) && !z) {
                f fVar = this.i;
                if (fVar == null) {
                    return false;
                }
                fVar.a();
                return false;
            }
            layoutNode.Q0();
            layoutNode.P0();
            if (layoutNode.H0()) {
                return false;
            }
            LayoutNode k0 = layoutNode.k0();
            if (zq3.c(layoutNode.J0(), Boolean.TRUE) && ((k0 == null || !k0.W()) && (k0 == null || !k0.V()))) {
                this.b.c(layoutNode, true);
            } else if (layoutNode.e() && ((k0 == null || !k0.T()) && (k0 == null || !k0.b0()))) {
                this.b.c(layoutNode, false);
            }
            return !this.c;
        }
        f fVar2 = this.i;
        if (fVar2 == null) {
            return false;
        }
        fVar2.a();
        return false;
    }
}
