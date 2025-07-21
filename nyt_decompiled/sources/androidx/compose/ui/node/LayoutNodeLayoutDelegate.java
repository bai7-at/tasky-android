package androidx.compose.ui.node;

import androidx.compose.ui.layout.l;
import androidx.compose.ui.node.LayoutNode;
import androidx.compose.ui.node.LayoutNodeLayoutDelegate;
import androidx.recyclerview.widget.RecyclerView;
import defpackage.fb;
import defpackage.fv0;
import defpackage.gb;
import defpackage.hn3;
import defpackage.in3;
import defpackage.iv0;
import defpackage.qg4;
import defpackage.qs2;
import defpackage.ss2;
import defpackage.vm3;
import defpackage.vy4;
import defpackage.ww8;
import defpackage.wz3;
import defpackage.xz3;
import defpackage.zq3;
import java.util.List;
import java.util.Map;

/* loaded from: classes.dex */
public final class LayoutNodeLayoutDelegate {
    private final LayoutNode a;
    private boolean b;
    private boolean d;
    private boolean e;
    private boolean f;
    private boolean g;
    private boolean h;
    private boolean i;
    private int j;
    private int k;
    private boolean l;
    private boolean m;
    private int n;
    private LookaheadPassDelegate p;
    private LayoutNode.LayoutState c = LayoutNode.LayoutState.Idle;
    private final MeasurePassDelegate o = new MeasurePassDelegate();
    private long q = iv0.b(0, 0, 0, 0, 15, null);
    private final qs2 r = new qs2() { // from class: androidx.compose.ui.node.LayoutNodeLayoutDelegate$performMeasureBlock$1
        {
            super(0);
        }

        @Override // defpackage.qs2
        /* renamed from: invoke */
        public /* bridge */ /* synthetic */ Object mo865invoke() {
            m83invoke();
            return ww8.a;
        }

        /* renamed from: invoke, reason: collision with other method in class */
        public final void m83invoke() {
            long j;
            NodeCoordinator H = LayoutNodeLayoutDelegate.this.H();
            j = LayoutNodeLayoutDelegate.this.q;
            H.W(j);
        }
    };

    public final class LookaheadPassDelegate extends androidx.compose.ui.layout.l implements qg4, gb {
        private boolean L;
        private boolean f;
        private boolean j;
        private boolean k;
        private boolean l;
        private fv0 m;
        private float r;
        private ss2 s;
        private boolean t;
        private boolean y;
        private int g = Integer.MAX_VALUE;
        private int h = Integer.MAX_VALUE;
        private LayoutNode.UsageByParent i = LayoutNode.UsageByParent.NotUsed;
        private long n = vm3.b.a();
        private final AlignmentLines u = new g(this);
        private final vy4 w = new vy4(new LookaheadPassDelegate[16], 0);
        private boolean x = true;
        private boolean B = true;
        private Object H = h1().d();

        public /* synthetic */ class a {
            public static final /* synthetic */ int[] a;
            public static final /* synthetic */ int[] b;

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
                    iArr[LayoutNode.LayoutState.LayingOut.ordinal()] = 3;
                } catch (NoSuchFieldError unused3) {
                }
                try {
                    iArr[LayoutNode.LayoutState.LookaheadLayingOut.ordinal()] = 4;
                } catch (NoSuchFieldError unused4) {
                }
                a = iArr;
                int[] iArr2 = new int[LayoutNode.UsageByParent.values().length];
                try {
                    iArr2[LayoutNode.UsageByParent.InMeasureBlock.ordinal()] = 1;
                } catch (NoSuchFieldError unused5) {
                }
                try {
                    iArr2[LayoutNode.UsageByParent.InLayoutBlock.ordinal()] = 2;
                } catch (NoSuchFieldError unused6) {
                }
                b = iArr2;
            }
        }

        public LookaheadPassDelegate() {
        }

        private final void B1() {
            boolean e = e();
            N1(true);
            int i = 0;
            if (!e && LayoutNodeLayoutDelegate.this.D()) {
                LayoutNode.h1(LayoutNodeLayoutDelegate.this.a, true, false, 2, null);
            }
            vy4 s0 = LayoutNodeLayoutDelegate.this.a.s0();
            int q = s0.q();
            if (q > 0) {
                Object[] p = s0.p();
                do {
                    LayoutNode layoutNode = (LayoutNode) p[i];
                    if (layoutNode.l0() != Integer.MAX_VALUE) {
                        LookaheadPassDelegate X = layoutNode.X();
                        zq3.e(X);
                        X.B1();
                        layoutNode.m1(layoutNode);
                    }
                    i++;
                } while (i < q);
            }
        }

        private final void C1() {
            if (e()) {
                int i = 0;
                N1(false);
                vy4 s0 = LayoutNodeLayoutDelegate.this.a.s0();
                int q = s0.q();
                if (q > 0) {
                    Object[] p = s0.p();
                    do {
                        LookaheadPassDelegate E = ((LayoutNode) p[i]).S().E();
                        zq3.e(E);
                        E.C1();
                        i++;
                    } while (i < q);
                }
            }
        }

        private final void E1() {
            LayoutNode layoutNode = LayoutNodeLayoutDelegate.this.a;
            LayoutNodeLayoutDelegate layoutNodeLayoutDelegate = LayoutNodeLayoutDelegate.this;
            vy4 s0 = layoutNode.s0();
            int q = s0.q();
            if (q > 0) {
                Object[] p = s0.p();
                int i = 0;
                do {
                    LayoutNode layoutNode2 = (LayoutNode) p[i];
                    if (layoutNode2.W() && layoutNode2.e0() == LayoutNode.UsageByParent.InMeasureBlock) {
                        LookaheadPassDelegate E = layoutNode2.S().E();
                        zq3.e(E);
                        fv0 y = layoutNode2.S().y();
                        zq3.e(y);
                        if (E.I1(y.t())) {
                            LayoutNode.h1(layoutNodeLayoutDelegate.a, false, false, 3, null);
                        }
                    }
                    i++;
                } while (i < q);
            }
        }

        private final void F1() {
            LayoutNode.h1(LayoutNodeLayoutDelegate.this.a, false, false, 3, null);
            LayoutNode k0 = LayoutNodeLayoutDelegate.this.a.k0();
            if (k0 == null || LayoutNodeLayoutDelegate.this.a.R() != LayoutNode.UsageByParent.NotUsed) {
                return;
            }
            LayoutNode layoutNode = LayoutNodeLayoutDelegate.this.a;
            int i = a.a[k0.U().ordinal()];
            layoutNode.s1(i != 2 ? i != 3 ? k0.R() : LayoutNode.UsageByParent.InLayoutBlock : LayoutNode.UsageByParent.InMeasureBlock);
        }

        private final void O1(LayoutNode layoutNode) {
            LayoutNode.UsageByParent usageByParent;
            LayoutNode k0 = layoutNode.k0();
            if (k0 == null) {
                this.i = LayoutNode.UsageByParent.NotUsed;
                return;
            }
            if (this.i != LayoutNode.UsageByParent.NotUsed && !layoutNode.C()) {
                throw new IllegalStateException("measure() may not be called multiple times on the same Measurable. If you want to get the content size of the Measurable before calculating the final constraints, please use methods like minIntrinsicWidth()/maxIntrinsicWidth() and minIntrinsicHeight()/maxIntrinsicHeight()");
            }
            int i = a.a[k0.U().ordinal()];
            if (i == 1 || i == 2) {
                usageByParent = LayoutNode.UsageByParent.InMeasureBlock;
            } else {
                if (i != 3 && i != 4) {
                    throw new IllegalStateException("Measurable could be only measured from the parent's measure or layout block. Parents state is " + k0.U());
                }
                usageByParent = LayoutNode.UsageByParent.InLayoutBlock;
            }
            this.i = usageByParent;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final void U0() {
            vy4 s0 = LayoutNodeLayoutDelegate.this.a.s0();
            int q = s0.q();
            if (q > 0) {
                Object[] p = s0.p();
                int i = 0;
                do {
                    LookaheadPassDelegate E = ((LayoutNode) p[i]).S().E();
                    zq3.e(E);
                    int i2 = E.g;
                    int i3 = E.h;
                    if (i2 != i3 && i3 == Integer.MAX_VALUE) {
                        E.C1();
                    }
                    i++;
                } while (i < q);
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final void V0() {
            int i = 0;
            LayoutNodeLayoutDelegate.this.j = 0;
            vy4 s0 = LayoutNodeLayoutDelegate.this.a.s0();
            int q = s0.q();
            if (q > 0) {
                Object[] p = s0.p();
                do {
                    LookaheadPassDelegate E = ((LayoutNode) p[i]).S().E();
                    zq3.e(E);
                    E.g = E.h;
                    E.h = Integer.MAX_VALUE;
                    if (E.i == LayoutNode.UsageByParent.InLayoutBlock) {
                        E.i = LayoutNode.UsageByParent.NotUsed;
                    }
                    i++;
                } while (i < q);
            }
        }

        @Override // androidx.compose.ui.layout.l
        public int B0() {
            i g2 = LayoutNodeLayoutDelegate.this.H().g2();
            zq3.e(g2);
            return g2.B0();
        }

        public final void D1() {
            vy4 s0;
            int q;
            if (LayoutNodeLayoutDelegate.this.s() <= 0 || (q = (s0 = LayoutNodeLayoutDelegate.this.a.s0()).q()) <= 0) {
                return;
            }
            Object[] p = s0.p();
            int i = 0;
            do {
                LayoutNode layoutNode = (LayoutNode) p[i];
                LayoutNodeLayoutDelegate S = layoutNode.S();
                if ((S.u() || S.t()) && !S.z()) {
                    LayoutNode.f1(layoutNode, false, 1, null);
                }
                LookaheadPassDelegate E = S.E();
                if (E != null) {
                    E.D1();
                }
                i++;
            } while (i < q);
        }

        public final void G1() {
            this.h = Integer.MAX_VALUE;
            this.g = Integer.MAX_VALUE;
            N1(false);
        }

        @Override // defpackage.xq3
        public int H(int i) {
            F1();
            i g2 = LayoutNodeLayoutDelegate.this.H().g2();
            zq3.e(g2);
            return g2.H(i);
        }

        public final void H1() {
            this.L = true;
            LayoutNode k0 = LayoutNodeLayoutDelegate.this.a.k0();
            if (!e()) {
                B1();
                if (this.f && k0 != null) {
                    LayoutNode.f1(k0, false, 1, null);
                }
            }
            if (k0 == null) {
                this.h = 0;
            } else if (!this.f && (k0.U() == LayoutNode.LayoutState.LayingOut || k0.U() == LayoutNode.LayoutState.LookaheadLayingOut)) {
                if (this.h != Integer.MAX_VALUE) {
                    throw new IllegalStateException("Place was called on a node which was placed already");
                }
                this.h = k0.S().j;
                k0.S().j++;
            }
            w();
        }

        @Override // defpackage.gb
        public void I(ss2 ss2Var) {
            vy4 s0 = LayoutNodeLayoutDelegate.this.a.s0();
            int q = s0.q();
            if (q > 0) {
                Object[] p = s0.p();
                int i = 0;
                do {
                    gb B = ((LayoutNode) p[i]).S().B();
                    zq3.e(B);
                    ss2Var.invoke(B);
                    i++;
                } while (i < q);
            }
        }

        public final boolean I1(long j) {
            if (LayoutNodeLayoutDelegate.this.a.H0()) {
                throw new IllegalArgumentException("measure is called on a deactivated node");
            }
            LayoutNode k0 = LayoutNodeLayoutDelegate.this.a.k0();
            LayoutNodeLayoutDelegate.this.a.p1(LayoutNodeLayoutDelegate.this.a.C() || (k0 != null && k0.C()));
            if (!LayoutNodeLayoutDelegate.this.a.W()) {
                fv0 fv0Var = this.m;
                if (fv0Var == null ? false : fv0.g(fv0Var.t(), j)) {
                    m j0 = LayoutNodeLayoutDelegate.this.a.j0();
                    if (j0 != null) {
                        j0.i(LayoutNodeLayoutDelegate.this.a, true);
                    }
                    LayoutNodeLayoutDelegate.this.a.o1();
                    return false;
                }
            }
            this.m = fv0.b(j);
            Q0(j);
            f().s(false);
            I(new ss2() { // from class: androidx.compose.ui.node.LayoutNodeLayoutDelegate$LookaheadPassDelegate$remeasure$2
                public final void b(gb gbVar) {
                    gbVar.f().u(false);
                }

                @Override // defpackage.ss2
                public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                    b((gb) obj);
                    return ww8.a;
                }
            });
            long z0 = this.l ? z0() : in3.a(RecyclerView.UNDEFINED_DURATION, RecyclerView.UNDEFINED_DURATION);
            this.l = true;
            i g2 = LayoutNodeLayoutDelegate.this.H().g2();
            if (!(g2 != null)) {
                throw new IllegalStateException("Lookahead result from lookaheadRemeasure cannot be null");
            }
            LayoutNodeLayoutDelegate.this.Q(j);
            P0(in3.a(g2.F0(), g2.v0()));
            return (hn3.g(z0) == g2.F0() && hn3.f(z0) == g2.v0()) ? false : true;
        }

        public final void J1() {
            LayoutNode k0;
            try {
                this.f = true;
                if (!this.k) {
                    throw new IllegalStateException("replace() called on item that was not placed");
                }
                this.L = false;
                boolean e = e();
                L0(this.n, 0.0f, null);
                if (e && !this.L && (k0 = LayoutNodeLayoutDelegate.this.a.k0()) != null) {
                    LayoutNode.f1(k0, false, 1, null);
                }
            } finally {
                this.f = false;
            }
        }

        public final void K1(boolean z) {
            this.x = z;
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // androidx.compose.ui.layout.l
        public void L0(final long j, float f, ss2 ss2Var) {
            if (LayoutNodeLayoutDelegate.this.a.H0()) {
                throw new IllegalArgumentException("place is called on a deactivated node");
            }
            LayoutNodeLayoutDelegate.this.c = LayoutNode.LayoutState.LookaheadLayingOut;
            this.k = true;
            this.L = false;
            if (!vm3.i(j, this.n)) {
                if (LayoutNodeLayoutDelegate.this.t() || LayoutNodeLayoutDelegate.this.u()) {
                    LayoutNodeLayoutDelegate.this.h = true;
                }
                D1();
            }
            final m b = wz3.b(LayoutNodeLayoutDelegate.this.a);
            if (LayoutNodeLayoutDelegate.this.C() || !e()) {
                LayoutNodeLayoutDelegate.this.U(false);
                f().r(false);
                OwnerSnapshotObserver snapshotObserver = b.getSnapshotObserver();
                LayoutNode layoutNode = LayoutNodeLayoutDelegate.this.a;
                final LayoutNodeLayoutDelegate layoutNodeLayoutDelegate = LayoutNodeLayoutDelegate.this;
                OwnerSnapshotObserver.d(snapshotObserver, layoutNode, false, new qs2() { // from class: androidx.compose.ui.node.LayoutNodeLayoutDelegate$LookaheadPassDelegate$placeAt$2
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(0);
                    }

                    @Override // defpackage.qs2
                    /* renamed from: invoke */
                    public /* bridge */ /* synthetic */ Object mo865invoke() {
                        m79invoke();
                        return ww8.a;
                    }

                    /* renamed from: invoke, reason: collision with other method in class */
                    public final void m79invoke() {
                        i g2;
                        l.a aVar = null;
                        if (xz3.a(LayoutNodeLayoutDelegate.this.a)) {
                            NodeCoordinator m2 = LayoutNodeLayoutDelegate.this.H().m2();
                            if (m2 != null) {
                                aVar = m2.a1();
                            }
                        } else {
                            NodeCoordinator m22 = LayoutNodeLayoutDelegate.this.H().m2();
                            if (m22 != null && (g2 = m22.g2()) != null) {
                                aVar = g2.a1();
                            }
                        }
                        if (aVar == null) {
                            aVar = b.getPlacementScope();
                        }
                        LayoutNodeLayoutDelegate layoutNodeLayoutDelegate2 = LayoutNodeLayoutDelegate.this;
                        long j2 = j;
                        i g22 = layoutNodeLayoutDelegate2.H().g2();
                        zq3.e(g22);
                        l.a.h(aVar, g22, j2, 0.0f, 2, null);
                    }
                }, 2, null);
            } else {
                i g2 = LayoutNodeLayoutDelegate.this.H().g2();
                zq3.e(g2);
                g2.M1(j);
                H1();
            }
            this.n = j;
            this.r = f;
            this.s = ss2Var;
            LayoutNodeLayoutDelegate.this.c = LayoutNode.LayoutState.Idle;
        }

        public final void L1(LayoutNode.UsageByParent usageByParent) {
            this.i = usageByParent;
        }

        public final void M1(int i) {
            this.h = i;
        }

        public void N1(boolean z) {
            this.t = z;
        }

        @Override // defpackage.gb
        public NodeCoordinator O() {
            return LayoutNodeLayoutDelegate.this.a.N();
        }

        public final boolean P1() {
            if (d() == null) {
                i g2 = LayoutNodeLayoutDelegate.this.H().g2();
                zq3.e(g2);
                if (g2.d() == null) {
                    return false;
                }
            }
            if (!this.B) {
                return false;
            }
            this.B = false;
            i g22 = LayoutNodeLayoutDelegate.this.H().g2();
            zq3.e(g22);
            this.H = g22.d();
            return true;
        }

        @Override // defpackage.xq3
        public int S(int i) {
            F1();
            i g2 = LayoutNodeLayoutDelegate.this.H().g2();
            zq3.e(g2);
            return g2.S(i);
        }

        @Override // defpackage.xq3
        public int V(int i) {
            F1();
            i g2 = LayoutNodeLayoutDelegate.this.H().g2();
            zq3.e(g2);
            return g2.V(i);
        }

        /* JADX WARN: Code restructure failed: missing block: B:10:0x0029, code lost:
        
            if ((r0 != null ? r0.U() : null) == androidx.compose.ui.node.LayoutNode.LayoutState.LookaheadLayingOut) goto L13;
         */
        @Override // defpackage.qg4
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public androidx.compose.ui.layout.l W(long r4) {
            /*
                r3 = this;
                androidx.compose.ui.node.LayoutNodeLayoutDelegate r0 = androidx.compose.ui.node.LayoutNodeLayoutDelegate.this
                androidx.compose.ui.node.LayoutNode r0 = androidx.compose.ui.node.LayoutNodeLayoutDelegate.a(r0)
                androidx.compose.ui.node.LayoutNode r0 = r0.k0()
                r1 = 0
                if (r0 == 0) goto L12
                androidx.compose.ui.node.LayoutNode$LayoutState r0 = r0.U()
                goto L13
            L12:
                r0 = r1
            L13:
                androidx.compose.ui.node.LayoutNode$LayoutState r2 = androidx.compose.ui.node.LayoutNode.LayoutState.LookaheadMeasuring
                if (r0 == r2) goto L2b
                androidx.compose.ui.node.LayoutNodeLayoutDelegate r0 = androidx.compose.ui.node.LayoutNodeLayoutDelegate.this
                androidx.compose.ui.node.LayoutNode r0 = androidx.compose.ui.node.LayoutNodeLayoutDelegate.a(r0)
                androidx.compose.ui.node.LayoutNode r0 = r0.k0()
                if (r0 == 0) goto L27
                androidx.compose.ui.node.LayoutNode$LayoutState r1 = r0.U()
            L27:
                androidx.compose.ui.node.LayoutNode$LayoutState r0 = androidx.compose.ui.node.LayoutNode.LayoutState.LookaheadLayingOut
                if (r1 != r0) goto L31
            L2b:
                androidx.compose.ui.node.LayoutNodeLayoutDelegate r0 = androidx.compose.ui.node.LayoutNodeLayoutDelegate.this
                r1 = 0
                androidx.compose.ui.node.LayoutNodeLayoutDelegate.i(r0, r1)
            L31:
                androidx.compose.ui.node.LayoutNodeLayoutDelegate r0 = androidx.compose.ui.node.LayoutNodeLayoutDelegate.this
                androidx.compose.ui.node.LayoutNode r0 = androidx.compose.ui.node.LayoutNodeLayoutDelegate.a(r0)
                r3.O1(r0)
                androidx.compose.ui.node.LayoutNodeLayoutDelegate r0 = androidx.compose.ui.node.LayoutNodeLayoutDelegate.this
                androidx.compose.ui.node.LayoutNode r0 = androidx.compose.ui.node.LayoutNodeLayoutDelegate.a(r0)
                androidx.compose.ui.node.LayoutNode$UsageByParent r0 = r0.R()
                androidx.compose.ui.node.LayoutNode$UsageByParent r1 = androidx.compose.ui.node.LayoutNode.UsageByParent.NotUsed
                if (r0 != r1) goto L51
                androidx.compose.ui.node.LayoutNodeLayoutDelegate r0 = androidx.compose.ui.node.LayoutNodeLayoutDelegate.this
                androidx.compose.ui.node.LayoutNode r0 = androidx.compose.ui.node.LayoutNodeLayoutDelegate.a(r0)
                r0.u()
            L51:
                r3.I1(r4)
                return r3
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.node.LayoutNodeLayoutDelegate.LookaheadPassDelegate.W(long):androidx.compose.ui.layout.l");
        }

        public final List a1() {
            LayoutNodeLayoutDelegate.this.a.F();
            if (!this.x) {
                return this.w.g();
            }
            LayoutNode layoutNode = LayoutNodeLayoutDelegate.this.a;
            vy4 vy4Var = this.w;
            vy4 s0 = layoutNode.s0();
            int q = s0.q();
            if (q > 0) {
                Object[] p = s0.p();
                int i = 0;
                do {
                    LayoutNode layoutNode2 = (LayoutNode) p[i];
                    if (vy4Var.q() <= i) {
                        LookaheadPassDelegate E = layoutNode2.S().E();
                        zq3.e(E);
                        vy4Var.b(E);
                    } else {
                        LookaheadPassDelegate E2 = layoutNode2.S().E();
                        zq3.e(E2);
                        vy4Var.B(i, E2);
                    }
                    i++;
                } while (i < q);
            }
            vy4Var.z(layoutNode.F().size(), vy4Var.q());
            this.x = false;
            return this.w.g();
        }

        public final fv0 b1() {
            return this.m;
        }

        @Override // defpackage.tg4
        public int c0(fb fbVar) {
            LayoutNode k0 = LayoutNodeLayoutDelegate.this.a.k0();
            if ((k0 != null ? k0.U() : null) == LayoutNode.LayoutState.LookaheadMeasuring) {
                f().u(true);
            } else {
                LayoutNode k02 = LayoutNodeLayoutDelegate.this.a.k0();
                if ((k02 != null ? k02.U() : null) == LayoutNode.LayoutState.LookaheadLayingOut) {
                    f().t(true);
                }
            }
            this.j = true;
            i g2 = LayoutNodeLayoutDelegate.this.H().g2();
            zq3.e(g2);
            int c0 = g2.c0(fbVar);
            this.j = false;
            return c0;
        }

        @Override // defpackage.tg4, defpackage.xq3
        public Object d() {
            return this.H;
        }

        @Override // defpackage.gb
        public boolean e() {
            return this.t;
        }

        @Override // defpackage.gb
        public AlignmentLines f() {
            return this.u;
        }

        public final boolean g1() {
            return this.y;
        }

        @Override // defpackage.gb
        public void h0() {
            LayoutNode.h1(LayoutNodeLayoutDelegate.this.a, false, false, 3, null);
        }

        public final MeasurePassDelegate h1() {
            return LayoutNodeLayoutDelegate.this.F();
        }

        @Override // defpackage.xq3
        public int i(int i) {
            F1();
            i g2 = LayoutNodeLayoutDelegate.this.H().g2();
            zq3.e(g2);
            return g2.i(i);
        }

        @Override // defpackage.gb
        public Map k() {
            if (!this.j) {
                if (LayoutNodeLayoutDelegate.this.A() == LayoutNode.LayoutState.LookaheadMeasuring) {
                    f().s(true);
                    if (f().g()) {
                        LayoutNodeLayoutDelegate.this.M();
                    }
                } else {
                    f().r(true);
                }
            }
            i g2 = O().g2();
            if (g2 != null) {
                g2.w1(true);
            }
            w();
            i g22 = O().g2();
            if (g22 != null) {
                g22.w1(false);
            }
            return f().h();
        }

        @Override // defpackage.gb
        public gb l() {
            LayoutNodeLayoutDelegate S;
            LayoutNode k0 = LayoutNodeLayoutDelegate.this.a.k0();
            if (k0 == null || (S = k0.S()) == null) {
                return null;
            }
            return S.B();
        }

        public final LayoutNode.UsageByParent p1() {
            return this.i;
        }

        @Override // defpackage.gb
        public void requestLayout() {
            LayoutNode.f1(LayoutNodeLayoutDelegate.this.a, false, 1, null);
        }

        public final boolean u1() {
            return this.k;
        }

        @Override // defpackage.gb
        public void w() {
            this.y = true;
            f().o();
            if (LayoutNodeLayoutDelegate.this.C()) {
                E1();
            }
            final i g2 = O().g2();
            zq3.e(g2);
            if (LayoutNodeLayoutDelegate.this.i || (!this.j && !g2.h1() && LayoutNodeLayoutDelegate.this.C())) {
                LayoutNodeLayoutDelegate.this.h = false;
                LayoutNode.LayoutState A = LayoutNodeLayoutDelegate.this.A();
                LayoutNodeLayoutDelegate.this.c = LayoutNode.LayoutState.LookaheadLayingOut;
                m b = wz3.b(LayoutNodeLayoutDelegate.this.a);
                LayoutNodeLayoutDelegate.this.V(false);
                OwnerSnapshotObserver snapshotObserver = b.getSnapshotObserver();
                LayoutNode layoutNode = LayoutNodeLayoutDelegate.this.a;
                final LayoutNodeLayoutDelegate layoutNodeLayoutDelegate = LayoutNodeLayoutDelegate.this;
                OwnerSnapshotObserver.f(snapshotObserver, layoutNode, false, new qs2() { // from class: androidx.compose.ui.node.LayoutNodeLayoutDelegate$LookaheadPassDelegate$layoutChildren$1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(0);
                    }

                    @Override // defpackage.qs2
                    /* renamed from: invoke */
                    public /* bridge */ /* synthetic */ Object mo865invoke() {
                        m78invoke();
                        return ww8.a;
                    }

                    /* renamed from: invoke, reason: collision with other method in class */
                    public final void m78invoke() {
                        LayoutNodeLayoutDelegate.LookaheadPassDelegate.this.V0();
                        LayoutNodeLayoutDelegate.LookaheadPassDelegate.this.I(new ss2() { // from class: androidx.compose.ui.node.LayoutNodeLayoutDelegate$LookaheadPassDelegate$layoutChildren$1.1
                            public final void b(gb gbVar) {
                                gbVar.f().t(false);
                            }

                            @Override // defpackage.ss2
                            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                                b((gb) obj);
                                return ww8.a;
                            }
                        });
                        i g22 = LayoutNodeLayoutDelegate.LookaheadPassDelegate.this.O().g2();
                        if (g22 != null) {
                            boolean h1 = g22.h1();
                            List F = layoutNodeLayoutDelegate.a.F();
                            int size = F.size();
                            for (int i = 0; i < size; i++) {
                                i g23 = ((LayoutNode) F.get(i)).i0().g2();
                                if (g23 != null) {
                                    g23.w1(h1);
                                }
                            }
                        }
                        g2.V0().e();
                        i g24 = LayoutNodeLayoutDelegate.LookaheadPassDelegate.this.O().g2();
                        if (g24 != null) {
                            g24.h1();
                            List F2 = layoutNodeLayoutDelegate.a.F();
                            int size2 = F2.size();
                            for (int i2 = 0; i2 < size2; i2++) {
                                i g25 = ((LayoutNode) F2.get(i2)).i0().g2();
                                if (g25 != null) {
                                    g25.w1(false);
                                }
                            }
                        }
                        LayoutNodeLayoutDelegate.LookaheadPassDelegate.this.U0();
                        LayoutNodeLayoutDelegate.LookaheadPassDelegate.this.I(new ss2() { // from class: androidx.compose.ui.node.LayoutNodeLayoutDelegate$LookaheadPassDelegate$layoutChildren$1.4
                            public final void b(gb gbVar) {
                                gbVar.f().q(gbVar.f().l());
                            }

                            @Override // defpackage.ss2
                            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                                b((gb) obj);
                                return ww8.a;
                            }
                        });
                    }
                }, 2, null);
                LayoutNodeLayoutDelegate.this.c = A;
                if (LayoutNodeLayoutDelegate.this.u() && g2.h1()) {
                    requestLayout();
                }
                LayoutNodeLayoutDelegate.this.i = false;
            }
            if (f().l()) {
                f().q(true);
            }
            if (f().g() && f().k()) {
                f().n();
            }
            this.y = false;
        }

        public final void w1(boolean z) {
            LayoutNode k0;
            LayoutNode k02 = LayoutNodeLayoutDelegate.this.a.k0();
            LayoutNode.UsageByParent R = LayoutNodeLayoutDelegate.this.a.R();
            if (k02 == null || R == LayoutNode.UsageByParent.NotUsed) {
                return;
            }
            while (k02.R() == R && (k0 = k02.k0()) != null) {
                k02 = k0;
            }
            int i = a.b[R.ordinal()];
            if (i == 1) {
                if (k02.Y() != null) {
                    LayoutNode.h1(k02, z, false, 2, null);
                    return;
                } else {
                    LayoutNode.l1(k02, z, false, 2, null);
                    return;
                }
            }
            if (i != 2) {
                throw new IllegalStateException("Intrinsics isn't used by the parent");
            }
            if (k02.Y() != null) {
                k02.e1(z);
            } else {
                k02.i1(z);
            }
        }

        @Override // androidx.compose.ui.layout.l
        public int x0() {
            i g2 = LayoutNodeLayoutDelegate.this.H().g2();
            zq3.e(g2);
            return g2.x0();
        }

        public final void x1() {
            this.B = true;
        }
    }

    public final class MeasurePassDelegate extends androidx.compose.ui.layout.l implements qg4, gb {
        private boolean B;
        private boolean H;
        private final qs2 L;
        private float M;
        private boolean N;
        private ss2 Q;
        private long S;
        private float X;
        private final qs2 Y;
        private boolean f;
        private boolean i;
        private boolean j;
        private boolean l;
        private long m;
        private ss2 n;
        private float r;
        private boolean s;
        private Object t;
        private boolean u;
        private boolean w;
        private final AlignmentLines x;
        private final vy4 y;
        private int g = Integer.MAX_VALUE;
        private int h = Integer.MAX_VALUE;
        private LayoutNode.UsageByParent k = LayoutNode.UsageByParent.NotUsed;

        public /* synthetic */ class a {
            public static final /* synthetic */ int[] a;
            public static final /* synthetic */ int[] b;

            static {
                int[] iArr = new int[LayoutNode.LayoutState.values().length];
                try {
                    iArr[LayoutNode.LayoutState.Measuring.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[LayoutNode.LayoutState.LayingOut.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                a = iArr;
                int[] iArr2 = new int[LayoutNode.UsageByParent.values().length];
                try {
                    iArr2[LayoutNode.UsageByParent.InMeasureBlock.ordinal()] = 1;
                } catch (NoSuchFieldError unused3) {
                }
                try {
                    iArr2[LayoutNode.UsageByParent.InLayoutBlock.ordinal()] = 2;
                } catch (NoSuchFieldError unused4) {
                }
                b = iArr2;
            }
        }

        public MeasurePassDelegate() {
            vm3.a aVar = vm3.b;
            this.m = aVar.a();
            this.s = true;
            this.x = new e(this);
            this.y = new vy4(new MeasurePassDelegate[16], 0);
            this.B = true;
            this.L = new qs2() { // from class: androidx.compose.ui.node.LayoutNodeLayoutDelegate$MeasurePassDelegate$layoutChildrenBlock$1
                {
                    super(0);
                }

                @Override // defpackage.qs2
                /* renamed from: invoke */
                public /* bridge */ /* synthetic */ Object mo865invoke() {
                    m80invoke();
                    return ww8.a;
                }

                /* renamed from: invoke, reason: collision with other method in class */
                public final void m80invoke() {
                    LayoutNodeLayoutDelegate.MeasurePassDelegate.this.g1();
                    LayoutNodeLayoutDelegate.MeasurePassDelegate.this.I(new ss2() { // from class: androidx.compose.ui.node.LayoutNodeLayoutDelegate$MeasurePassDelegate$layoutChildrenBlock$1.1
                        public final void b(gb gbVar) {
                            gbVar.f().t(false);
                        }

                        @Override // defpackage.ss2
                        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                            b((gb) obj);
                            return ww8.a;
                        }
                    });
                    LayoutNodeLayoutDelegate.MeasurePassDelegate.this.O().V0().e();
                    LayoutNodeLayoutDelegate.MeasurePassDelegate.this.b1();
                    LayoutNodeLayoutDelegate.MeasurePassDelegate.this.I(new ss2() { // from class: androidx.compose.ui.node.LayoutNodeLayoutDelegate$MeasurePassDelegate$layoutChildrenBlock$1.2
                        public final void b(gb gbVar) {
                            gbVar.f().q(gbVar.f().l());
                        }

                        @Override // defpackage.ss2
                        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                            b((gb) obj);
                            return ww8.a;
                        }
                    });
                }
            };
            this.S = aVar.a();
            this.Y = new qs2() { // from class: androidx.compose.ui.node.LayoutNodeLayoutDelegate$MeasurePassDelegate$placeOuterCoordinatorBlock$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(0);
                }

                @Override // defpackage.qs2
                /* renamed from: invoke */
                public /* bridge */ /* synthetic */ Object mo865invoke() {
                    m81invoke();
                    return ww8.a;
                }

                /* renamed from: invoke, reason: collision with other method in class */
                public final void m81invoke() {
                    l.a placementScope;
                    ss2 ss2Var;
                    long j;
                    float f;
                    long j2;
                    float f2;
                    NodeCoordinator m2 = LayoutNodeLayoutDelegate.this.H().m2();
                    if (m2 == null || (placementScope = m2.a1()) == null) {
                        placementScope = wz3.b(LayoutNodeLayoutDelegate.this.a).getPlacementScope();
                    }
                    l.a aVar2 = placementScope;
                    LayoutNodeLayoutDelegate.MeasurePassDelegate measurePassDelegate = this;
                    LayoutNodeLayoutDelegate layoutNodeLayoutDelegate = LayoutNodeLayoutDelegate.this;
                    ss2Var = measurePassDelegate.Q;
                    if (ss2Var == null) {
                        NodeCoordinator H = layoutNodeLayoutDelegate.H();
                        j2 = measurePassDelegate.S;
                        f2 = measurePassDelegate.X;
                        aVar2.g(H, j2, f2);
                        return;
                    }
                    NodeCoordinator H2 = layoutNodeLayoutDelegate.H();
                    j = measurePassDelegate.S;
                    f = measurePassDelegate.X;
                    aVar2.s(H2, j, f, ss2Var);
                }
            };
        }

        private final void G1() {
            boolean e = e();
            S1(true);
            LayoutNode layoutNode = LayoutNodeLayoutDelegate.this.a;
            int i = 0;
            if (!e) {
                if (layoutNode.b0()) {
                    LayoutNode.l1(layoutNode, true, false, 2, null);
                } else if (layoutNode.W()) {
                    LayoutNode.h1(layoutNode, true, false, 2, null);
                }
            }
            NodeCoordinator l2 = layoutNode.N().l2();
            for (NodeCoordinator i0 = layoutNode.i0(); !zq3.c(i0, l2) && i0 != null; i0 = i0.l2()) {
                if (i0.c2()) {
                    i0.v2();
                }
            }
            vy4 s0 = layoutNode.s0();
            int q = s0.q();
            if (q > 0) {
                Object[] p = s0.p();
                do {
                    LayoutNode layoutNode2 = (LayoutNode) p[i];
                    if (layoutNode2.l0() != Integer.MAX_VALUE) {
                        layoutNode2.a0().G1();
                        layoutNode.m1(layoutNode2);
                    }
                    i++;
                } while (i < q);
            }
        }

        private final void H1() {
            if (e()) {
                int i = 0;
                S1(false);
                vy4 s0 = LayoutNodeLayoutDelegate.this.a.s0();
                int q = s0.q();
                if (q > 0) {
                    Object[] p = s0.p();
                    do {
                        ((LayoutNode) p[i]).a0().H1();
                        i++;
                    } while (i < q);
                }
            }
        }

        private final void J1() {
            LayoutNode layoutNode = LayoutNodeLayoutDelegate.this.a;
            LayoutNodeLayoutDelegate layoutNodeLayoutDelegate = LayoutNodeLayoutDelegate.this;
            vy4 s0 = layoutNode.s0();
            int q = s0.q();
            if (q > 0) {
                Object[] p = s0.p();
                int i = 0;
                do {
                    LayoutNode layoutNode2 = (LayoutNode) p[i];
                    if (layoutNode2.b0() && layoutNode2.d0() == LayoutNode.UsageByParent.InMeasureBlock && LayoutNode.a1(layoutNode2, null, 1, null)) {
                        LayoutNode.l1(layoutNodeLayoutDelegate.a, false, false, 3, null);
                    }
                    i++;
                } while (i < q);
            }
        }

        private final void K1() {
            LayoutNode.l1(LayoutNodeLayoutDelegate.this.a, false, false, 3, null);
            LayoutNode k0 = LayoutNodeLayoutDelegate.this.a.k0();
            if (k0 == null || LayoutNodeLayoutDelegate.this.a.R() != LayoutNode.UsageByParent.NotUsed) {
                return;
            }
            LayoutNode layoutNode = LayoutNodeLayoutDelegate.this.a;
            int i = a.a[k0.U().ordinal()];
            layoutNode.s1(i != 1 ? i != 2 ? k0.R() : LayoutNode.UsageByParent.InLayoutBlock : LayoutNode.UsageByParent.InMeasureBlock);
        }

        private final void N1(long j, float f, ss2 ss2Var) {
            if (LayoutNodeLayoutDelegate.this.a.H0()) {
                throw new IllegalArgumentException("place is called on a deactivated node");
            }
            LayoutNodeLayoutDelegate.this.c = LayoutNode.LayoutState.LayingOut;
            this.m = j;
            this.r = f;
            this.n = ss2Var;
            this.j = true;
            this.N = false;
            m b = wz3.b(LayoutNodeLayoutDelegate.this.a);
            if (LayoutNodeLayoutDelegate.this.z() || !e()) {
                f().r(false);
                LayoutNodeLayoutDelegate.this.U(false);
                this.Q = ss2Var;
                this.S = j;
                this.X = f;
                b.getSnapshotObserver().c(LayoutNodeLayoutDelegate.this.a, false, this.Y);
                this.Q = null;
            } else {
                LayoutNodeLayoutDelegate.this.H().I2(j, f, ss2Var);
                M1();
            }
            LayoutNodeLayoutDelegate.this.c = LayoutNode.LayoutState.Idle;
        }

        private final void T1(LayoutNode layoutNode) {
            LayoutNode.UsageByParent usageByParent;
            LayoutNode k0 = layoutNode.k0();
            if (k0 == null) {
                this.k = LayoutNode.UsageByParent.NotUsed;
                return;
            }
            if (this.k != LayoutNode.UsageByParent.NotUsed && !layoutNode.C()) {
                throw new IllegalStateException("measure() may not be called multiple times on the same Measurable. If you want to get the content size of the Measurable before calculating the final constraints, please use methods like minIntrinsicWidth()/maxIntrinsicWidth() and minIntrinsicHeight()/maxIntrinsicHeight()");
            }
            int i = a.a[k0.U().ordinal()];
            if (i == 1) {
                usageByParent = LayoutNode.UsageByParent.InMeasureBlock;
            } else {
                if (i != 2) {
                    throw new IllegalStateException("Measurable could be only measured from the parent's measure or layout block. Parents state is " + k0.U());
                }
                usageByParent = LayoutNode.UsageByParent.InLayoutBlock;
            }
            this.k = usageByParent;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final void b1() {
            LayoutNode layoutNode = LayoutNodeLayoutDelegate.this.a;
            vy4 s0 = layoutNode.s0();
            int q = s0.q();
            if (q > 0) {
                Object[] p = s0.p();
                int i = 0;
                do {
                    LayoutNode layoutNode2 = (LayoutNode) p[i];
                    if (layoutNode2.a0().g != layoutNode2.l0()) {
                        layoutNode.W0();
                        layoutNode.A0();
                        if (layoutNode2.l0() == Integer.MAX_VALUE) {
                            layoutNode2.a0().H1();
                        }
                    }
                    i++;
                } while (i < q);
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final void g1() {
            LayoutNodeLayoutDelegate.this.k = 0;
            vy4 s0 = LayoutNodeLayoutDelegate.this.a.s0();
            int q = s0.q();
            if (q > 0) {
                Object[] p = s0.p();
                int i = 0;
                do {
                    MeasurePassDelegate a0 = ((LayoutNode) p[i]).a0();
                    a0.g = a0.h;
                    a0.h = Integer.MAX_VALUE;
                    a0.w = false;
                    if (a0.k == LayoutNode.UsageByParent.InLayoutBlock) {
                        a0.k = LayoutNode.UsageByParent.NotUsed;
                    }
                    i++;
                } while (i < q);
            }
        }

        @Override // androidx.compose.ui.layout.l
        public int B0() {
            return LayoutNodeLayoutDelegate.this.H().B0();
        }

        public final float B1() {
            return this.M;
        }

        public final void C1(boolean z) {
            LayoutNode k0;
            LayoutNode k02 = LayoutNodeLayoutDelegate.this.a.k0();
            LayoutNode.UsageByParent R = LayoutNodeLayoutDelegate.this.a.R();
            if (k02 == null || R == LayoutNode.UsageByParent.NotUsed) {
                return;
            }
            while (k02.R() == R && (k0 = k02.k0()) != null) {
                k02 = k0;
            }
            int i = a.b[R.ordinal()];
            if (i == 1) {
                LayoutNode.l1(k02, z, false, 2, null);
            } else {
                if (i != 2) {
                    throw new IllegalStateException("Intrinsics isn't used by the parent");
                }
                k02.i1(z);
            }
        }

        public final void D1() {
            this.s = true;
        }

        public final boolean E1() {
            return this.w;
        }

        public final void F1() {
            LayoutNodeLayoutDelegate.this.b = true;
        }

        @Override // defpackage.xq3
        public int H(int i) {
            K1();
            return LayoutNodeLayoutDelegate.this.H().H(i);
        }

        @Override // defpackage.gb
        public void I(ss2 ss2Var) {
            vy4 s0 = LayoutNodeLayoutDelegate.this.a.s0();
            int q = s0.q();
            if (q > 0) {
                Object[] p = s0.p();
                int i = 0;
                do {
                    ss2Var.invoke(((LayoutNode) p[i]).S().r());
                    i++;
                } while (i < q);
            }
        }

        public final void I1() {
            vy4 s0;
            int q;
            if (LayoutNodeLayoutDelegate.this.s() <= 0 || (q = (s0 = LayoutNodeLayoutDelegate.this.a.s0()).q()) <= 0) {
                return;
            }
            Object[] p = s0.p();
            int i = 0;
            do {
                LayoutNode layoutNode = (LayoutNode) p[i];
                LayoutNodeLayoutDelegate S = layoutNode.S();
                if ((S.u() || S.t()) && !S.z()) {
                    LayoutNode.j1(layoutNode, false, 1, null);
                }
                S.F().I1();
                i++;
            } while (i < q);
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // androidx.compose.ui.layout.l
        public void L0(long j, float f, ss2 ss2Var) {
            l.a placementScope;
            this.w = true;
            if (!vm3.i(j, this.m)) {
                if (LayoutNodeLayoutDelegate.this.t() || LayoutNodeLayoutDelegate.this.u()) {
                    LayoutNodeLayoutDelegate.this.e = true;
                }
                I1();
            }
            if (xz3.a(LayoutNodeLayoutDelegate.this.a)) {
                NodeCoordinator m2 = LayoutNodeLayoutDelegate.this.H().m2();
                if (m2 == null || (placementScope = m2.a1()) == null) {
                    placementScope = wz3.b(LayoutNodeLayoutDelegate.this.a).getPlacementScope();
                }
                l.a aVar = placementScope;
                LayoutNodeLayoutDelegate layoutNodeLayoutDelegate = LayoutNodeLayoutDelegate.this;
                LookaheadPassDelegate E = layoutNodeLayoutDelegate.E();
                zq3.e(E);
                LayoutNode k0 = layoutNodeLayoutDelegate.a.k0();
                if (k0 != null) {
                    k0.S().j = 0;
                }
                E.M1(Integer.MAX_VALUE);
                l.a.f(aVar, E, vm3.j(j), vm3.k(j), 0.0f, 4, null);
            }
            LookaheadPassDelegate E2 = LayoutNodeLayoutDelegate.this.E();
            if ((E2 == null || E2.u1()) ? false : true) {
                throw new IllegalArgumentException("Error: Placement happened before lookahead.");
            }
            N1(j, f, ss2Var);
        }

        public final void L1() {
            this.h = Integer.MAX_VALUE;
            this.g = Integer.MAX_VALUE;
            S1(false);
        }

        public final void M1() {
            this.N = true;
            LayoutNode k0 = LayoutNodeLayoutDelegate.this.a.k0();
            float n2 = O().n2();
            LayoutNode layoutNode = LayoutNodeLayoutDelegate.this.a;
            NodeCoordinator i0 = layoutNode.i0();
            NodeCoordinator N = layoutNode.N();
            while (i0 != N) {
                zq3.f(i0, "null cannot be cast to non-null type androidx.compose.ui.node.LayoutModifierNodeCoordinator");
                d dVar = (d) i0;
                n2 += dVar.n2();
                i0 = dVar.l2();
            }
            if (n2 != this.M) {
                this.M = n2;
                if (k0 != null) {
                    k0.W0();
                }
                if (k0 != null) {
                    k0.A0();
                }
            }
            if (!e()) {
                if (k0 != null) {
                    k0.A0();
                }
                G1();
                if (this.f && k0 != null) {
                    LayoutNode.j1(k0, false, 1, null);
                }
            }
            if (k0 == null) {
                this.h = 0;
            } else if (!this.f && k0.U() == LayoutNode.LayoutState.LayingOut) {
                if (this.h != Integer.MAX_VALUE) {
                    throw new IllegalStateException("Place was called on a node which was placed already");
                }
                this.h = k0.S().k;
                k0.S().k++;
            }
            w();
        }

        @Override // defpackage.gb
        public NodeCoordinator O() {
            return LayoutNodeLayoutDelegate.this.a.N();
        }

        public final boolean O1(long j) {
            if (LayoutNodeLayoutDelegate.this.a.H0()) {
                throw new IllegalArgumentException("measure is called on a deactivated node");
            }
            m b = wz3.b(LayoutNodeLayoutDelegate.this.a);
            LayoutNode k0 = LayoutNodeLayoutDelegate.this.a.k0();
            boolean z = true;
            LayoutNodeLayoutDelegate.this.a.p1(LayoutNodeLayoutDelegate.this.a.C() || (k0 != null && k0.C()));
            if (!LayoutNodeLayoutDelegate.this.a.b0() && fv0.g(E0(), j)) {
                m.j(b, LayoutNodeLayoutDelegate.this.a, false, 2, null);
                LayoutNodeLayoutDelegate.this.a.o1();
                return false;
            }
            f().s(false);
            I(new ss2() { // from class: androidx.compose.ui.node.LayoutNodeLayoutDelegate$MeasurePassDelegate$remeasure$2
                public final void b(gb gbVar) {
                    gbVar.f().u(false);
                }

                @Override // defpackage.ss2
                public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                    b((gb) obj);
                    return ww8.a;
                }
            });
            this.i = true;
            long a2 = LayoutNodeLayoutDelegate.this.H().a();
            Q0(j);
            LayoutNodeLayoutDelegate.this.R(j);
            if (hn3.e(LayoutNodeLayoutDelegate.this.H().a(), a2) && LayoutNodeLayoutDelegate.this.H().F0() == F0() && LayoutNodeLayoutDelegate.this.H().v0() == v0()) {
                z = false;
            }
            P0(in3.a(LayoutNodeLayoutDelegate.this.H().F0(), LayoutNodeLayoutDelegate.this.H().v0()));
            return z;
        }

        public final void P1() {
            LayoutNode k0;
            try {
                this.f = true;
                if (!this.j) {
                    throw new IllegalStateException("replace called on unplaced item");
                }
                boolean e = e();
                N1(this.m, this.r, this.n);
                if (e && !this.N && (k0 = LayoutNodeLayoutDelegate.this.a.k0()) != null) {
                    LayoutNode.j1(k0, false, 1, null);
                }
            } finally {
                this.f = false;
            }
        }

        public final void Q1(boolean z) {
            this.B = z;
        }

        public final void R1(LayoutNode.UsageByParent usageByParent) {
            this.k = usageByParent;
        }

        @Override // defpackage.xq3
        public int S(int i) {
            K1();
            return LayoutNodeLayoutDelegate.this.H().S(i);
        }

        public void S1(boolean z) {
            this.u = z;
        }

        public final boolean U1() {
            if ((d() == null && LayoutNodeLayoutDelegate.this.H().d() == null) || !this.s) {
                return false;
            }
            this.s = false;
            this.t = LayoutNodeLayoutDelegate.this.H().d();
            return true;
        }

        @Override // defpackage.xq3
        public int V(int i) {
            K1();
            return LayoutNodeLayoutDelegate.this.H().V(i);
        }

        @Override // defpackage.qg4
        public androidx.compose.ui.layout.l W(long j) {
            LayoutNode.UsageByParent R = LayoutNodeLayoutDelegate.this.a.R();
            LayoutNode.UsageByParent usageByParent = LayoutNode.UsageByParent.NotUsed;
            if (R == usageByParent) {
                LayoutNodeLayoutDelegate.this.a.u();
            }
            if (xz3.a(LayoutNodeLayoutDelegate.this.a)) {
                LookaheadPassDelegate E = LayoutNodeLayoutDelegate.this.E();
                zq3.e(E);
                E.L1(usageByParent);
                E.W(j);
            }
            T1(LayoutNodeLayoutDelegate.this.a);
            O1(j);
            return this;
        }

        @Override // defpackage.tg4
        public int c0(fb fbVar) {
            LayoutNode k0 = LayoutNodeLayoutDelegate.this.a.k0();
            if ((k0 != null ? k0.U() : null) == LayoutNode.LayoutState.Measuring) {
                f().u(true);
            } else {
                LayoutNode k02 = LayoutNodeLayoutDelegate.this.a.k0();
                if ((k02 != null ? k02.U() : null) == LayoutNode.LayoutState.LayingOut) {
                    f().t(true);
                }
            }
            this.l = true;
            int c0 = LayoutNodeLayoutDelegate.this.H().c0(fbVar);
            this.l = false;
            return c0;
        }

        @Override // defpackage.tg4, defpackage.xq3
        public Object d() {
            return this.t;
        }

        @Override // defpackage.gb
        public boolean e() {
            return this.u;
        }

        @Override // defpackage.gb
        public AlignmentLines f() {
            return this.x;
        }

        @Override // defpackage.gb
        public void h0() {
            LayoutNode.l1(LayoutNodeLayoutDelegate.this.a, false, false, 3, null);
        }

        public final List h1() {
            LayoutNodeLayoutDelegate.this.a.z1();
            if (!this.B) {
                return this.y.g();
            }
            LayoutNode layoutNode = LayoutNodeLayoutDelegate.this.a;
            vy4 vy4Var = this.y;
            vy4 s0 = layoutNode.s0();
            int q = s0.q();
            if (q > 0) {
                Object[] p = s0.p();
                int i = 0;
                do {
                    LayoutNode layoutNode2 = (LayoutNode) p[i];
                    if (vy4Var.q() <= i) {
                        vy4Var.b(layoutNode2.S().F());
                    } else {
                        vy4Var.B(i, layoutNode2.S().F());
                    }
                    i++;
                } while (i < q);
            }
            vy4Var.z(layoutNode.F().size(), vy4Var.q());
            this.B = false;
            return this.y.g();
        }

        @Override // defpackage.xq3
        public int i(int i) {
            K1();
            return LayoutNodeLayoutDelegate.this.H().i(i);
        }

        @Override // defpackage.gb
        public Map k() {
            if (!this.l) {
                if (LayoutNodeLayoutDelegate.this.A() == LayoutNode.LayoutState.Measuring) {
                    f().s(true);
                    if (f().g()) {
                        LayoutNodeLayoutDelegate.this.L();
                    }
                } else {
                    f().r(true);
                }
            }
            O().w1(true);
            w();
            O().w1(false);
            return f().h();
        }

        @Override // defpackage.gb
        public gb l() {
            LayoutNodeLayoutDelegate S;
            LayoutNode k0 = LayoutNodeLayoutDelegate.this.a.k0();
            if (k0 == null || (S = k0.S()) == null) {
                return null;
            }
            return S.r();
        }

        public final fv0 p1() {
            if (this.i) {
                return fv0.b(E0());
            }
            return null;
        }

        @Override // defpackage.gb
        public void requestLayout() {
            LayoutNode.j1(LayoutNodeLayoutDelegate.this.a, false, 1, null);
        }

        public final boolean u1() {
            return this.H;
        }

        @Override // defpackage.gb
        public void w() {
            this.H = true;
            f().o();
            if (LayoutNodeLayoutDelegate.this.z()) {
                J1();
            }
            if (LayoutNodeLayoutDelegate.this.f || (!this.l && !O().h1() && LayoutNodeLayoutDelegate.this.z())) {
                LayoutNodeLayoutDelegate.this.e = false;
                LayoutNode.LayoutState A = LayoutNodeLayoutDelegate.this.A();
                LayoutNodeLayoutDelegate.this.c = LayoutNode.LayoutState.LayingOut;
                LayoutNodeLayoutDelegate.this.V(false);
                LayoutNode layoutNode = LayoutNodeLayoutDelegate.this.a;
                wz3.b(layoutNode).getSnapshotObserver().e(layoutNode, false, this.L);
                LayoutNodeLayoutDelegate.this.c = A;
                if (O().h1() && LayoutNodeLayoutDelegate.this.u()) {
                    requestLayout();
                }
                LayoutNodeLayoutDelegate.this.f = false;
            }
            if (f().l()) {
                f().q(true);
            }
            if (f().g() && f().k()) {
                f().n();
            }
            this.H = false;
        }

        public final LayoutNode.UsageByParent w1() {
            return this.k;
        }

        @Override // androidx.compose.ui.layout.l
        public int x0() {
            return LayoutNodeLayoutDelegate.this.H().x0();
        }

        public final int x1() {
            return this.h;
        }
    }

    public LayoutNodeLayoutDelegate(LayoutNode layoutNode) {
        this.a = layoutNode;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void Q(final long j) {
        this.c = LayoutNode.LayoutState.LookaheadMeasuring;
        this.g = false;
        OwnerSnapshotObserver.h(wz3.b(this.a).getSnapshotObserver(), this.a, false, new qs2() { // from class: androidx.compose.ui.node.LayoutNodeLayoutDelegate$performLookaheadMeasure$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // defpackage.qs2
            /* renamed from: invoke */
            public /* bridge */ /* synthetic */ Object mo865invoke() {
                m82invoke();
                return ww8.a;
            }

            /* renamed from: invoke, reason: collision with other method in class */
            public final void m82invoke() {
                i g2 = LayoutNodeLayoutDelegate.this.H().g2();
                zq3.e(g2);
                g2.W(j);
            }
        }, 2, null);
        M();
        if (xz3.a(this.a)) {
            L();
        } else {
            O();
        }
        this.c = LayoutNode.LayoutState.Idle;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void R(long j) {
        LayoutNode.LayoutState layoutState = this.c;
        LayoutNode.LayoutState layoutState2 = LayoutNode.LayoutState.Idle;
        if (layoutState != layoutState2) {
            throw new IllegalStateException("layout state is not idle before measure starts");
        }
        LayoutNode.LayoutState layoutState3 = LayoutNode.LayoutState.Measuring;
        this.c = layoutState3;
        this.d = false;
        this.q = j;
        wz3.b(this.a).getSnapshotObserver().g(this.a, false, this.r);
        if (this.c == layoutState3) {
            L();
            this.c = layoutState2;
        }
    }

    public final LayoutNode.LayoutState A() {
        return this.c;
    }

    public final gb B() {
        return this.p;
    }

    public final boolean C() {
        return this.h;
    }

    public final boolean D() {
        return this.g;
    }

    public final LookaheadPassDelegate E() {
        return this.p;
    }

    public final MeasurePassDelegate F() {
        return this.o;
    }

    public final boolean G() {
        return this.d;
    }

    public final NodeCoordinator H() {
        return this.a.h0().n();
    }

    public final int I() {
        return this.o.F0();
    }

    public final void J() {
        this.o.D1();
        LookaheadPassDelegate lookaheadPassDelegate = this.p;
        if (lookaheadPassDelegate != null) {
            lookaheadPassDelegate.x1();
        }
    }

    public final void K() {
        this.o.Q1(true);
        LookaheadPassDelegate lookaheadPassDelegate = this.p;
        if (lookaheadPassDelegate != null) {
            lookaheadPassDelegate.K1(true);
        }
    }

    public final void L() {
        this.e = true;
        this.f = true;
    }

    public final void M() {
        this.h = true;
        this.i = true;
    }

    public final void N() {
        this.g = true;
    }

    public final void O() {
        this.d = true;
    }

    public final void P() {
        LayoutNode.LayoutState U = this.a.U();
        if (U == LayoutNode.LayoutState.LayingOut || U == LayoutNode.LayoutState.LookaheadLayingOut) {
            if (this.o.u1()) {
                V(true);
            } else {
                U(true);
            }
        }
        if (U == LayoutNode.LayoutState.LookaheadLayingOut) {
            LookaheadPassDelegate lookaheadPassDelegate = this.p;
            if (lookaheadPassDelegate == null || !lookaheadPassDelegate.g1()) {
                U(true);
            } else {
                V(true);
            }
        }
    }

    public final void S() {
        AlignmentLines f;
        this.o.f().p();
        LookaheadPassDelegate lookaheadPassDelegate = this.p;
        if (lookaheadPassDelegate == null || (f = lookaheadPassDelegate.f()) == null) {
            return;
        }
        f.p();
    }

    public final void T(int i) {
        int i2 = this.n;
        this.n = i;
        if ((i2 == 0) != (i == 0)) {
            LayoutNode k0 = this.a.k0();
            LayoutNodeLayoutDelegate S = k0 != null ? k0.S() : null;
            if (S != null) {
                if (i == 0) {
                    S.T(S.n - 1);
                } else {
                    S.T(S.n + 1);
                }
            }
        }
    }

    public final void U(boolean z) {
        if (this.m != z) {
            this.m = z;
            if (z && !this.l) {
                T(this.n + 1);
            } else {
                if (z || this.l) {
                    return;
                }
                T(this.n - 1);
            }
        }
    }

    public final void V(boolean z) {
        if (this.l != z) {
            this.l = z;
            if (z && !this.m) {
                T(this.n + 1);
            } else {
                if (z || this.m) {
                    return;
                }
                T(this.n - 1);
            }
        }
    }

    public final void W() {
        LayoutNode k0;
        if (this.o.U1() && (k0 = this.a.k0()) != null) {
            LayoutNode.l1(k0, false, false, 3, null);
        }
        LookaheadPassDelegate lookaheadPassDelegate = this.p;
        if (lookaheadPassDelegate == null || !lookaheadPassDelegate.P1()) {
            return;
        }
        if (xz3.a(this.a)) {
            LayoutNode k02 = this.a.k0();
            if (k02 != null) {
                LayoutNode.l1(k02, false, false, 3, null);
                return;
            }
            return;
        }
        LayoutNode k03 = this.a.k0();
        if (k03 != null) {
            LayoutNode.h1(k03, false, false, 3, null);
        }
    }

    public final void q() {
        if (this.p == null) {
            this.p = new LookaheadPassDelegate();
        }
    }

    public final gb r() {
        return this.o;
    }

    public final int s() {
        return this.n;
    }

    public final boolean t() {
        return this.m;
    }

    public final boolean u() {
        return this.l;
    }

    public final boolean v() {
        return this.b;
    }

    public final int w() {
        return this.o.v0();
    }

    public final fv0 x() {
        return this.o.p1();
    }

    public final fv0 y() {
        LookaheadPassDelegate lookaheadPassDelegate = this.p;
        if (lookaheadPassDelegate != null) {
            return lookaheadPassDelegate.b1();
        }
        return null;
    }

    public final boolean z() {
        return this.e;
    }
}
