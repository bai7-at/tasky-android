package androidx.compose.ui.node;

import androidx.compose.ui.node.LayoutNode;
import androidx.compose.ui.node.LayoutNodeLayoutDelegate;
import androidx.recyclerview.widget.RecyclerView;
import defpackage.ao5;
import defpackage.bg8;
import defpackage.eo5;
import defpackage.fb;
import defpackage.nn0;
import defpackage.ph0;
import defpackage.ss2;
import defpackage.uf;
import defpackage.vy4;
import defpackage.wz3;
import defpackage.zq3;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes.dex */
public final class a extends NodeCoordinator {
    public static final C0061a k0 = new C0061a(null);
    private static final ao5 l0;
    private final bg8 i0;
    private i j0;

    /* renamed from: androidx.compose.ui.node.a$a, reason: collision with other inner class name */
    public static final class C0061a {
        public /* synthetic */ C0061a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private C0061a() {
        }
    }

    private final class b extends i {
        public b() {
            super(a.this);
        }

        @Override // androidx.compose.ui.node.i, defpackage.xq3
        public int H(int i) {
            return I1().Q().i(i);
        }

        @Override // androidx.compose.ui.node.i
        protected void K1() {
            LayoutNodeLayoutDelegate.LookaheadPassDelegate X = I1().X();
            zq3.e(X);
            X.H1();
        }

        @Override // androidx.compose.ui.node.h
        public int R0(fb fbVar) {
            Integer num = (Integer) D1().k().get(fbVar);
            int intValue = num != null ? num.intValue() : RecyclerView.UNDEFINED_DURATION;
            F1().put(fbVar, Integer.valueOf(intValue));
            return intValue;
        }

        @Override // androidx.compose.ui.node.i, defpackage.xq3
        public int S(int i) {
            return I1().Q().j(i);
        }

        @Override // androidx.compose.ui.node.i, defpackage.xq3
        public int V(int i) {
            return I1().Q().e(i);
        }

        @Override // defpackage.qg4
        public androidx.compose.ui.layout.l W(long j) {
            Q0(j);
            vy4 s0 = I1().s0();
            int q = s0.q();
            if (q > 0) {
                Object[] p = s0.p();
                int i = 0;
                do {
                    LayoutNodeLayoutDelegate.LookaheadPassDelegate X = ((LayoutNode) p[i]).X();
                    zq3.e(X);
                    X.L1(LayoutNode.UsageByParent.NotUsed);
                    i++;
                } while (i < q);
            }
            P1(I1().c0().d(this, I1().D(), j));
            return this;
        }

        @Override // androidx.compose.ui.node.i, defpackage.xq3
        public int i(int i) {
            return I1().Q().d(i);
        }
    }

    static {
        ao5 a = uf.a();
        a.k(nn0.b.e());
        a.w(1.0f);
        a.v(eo5.a.b());
        l0 = a;
    }

    public a(LayoutNode layoutNode) {
        super(layoutNode);
        this.i0 = new bg8();
        k2().d2(this);
        this.j0 = layoutNode.Y() != null ? new b() : null;
    }

    @Override // androidx.compose.ui.node.NodeCoordinator
    public void G2(ph0 ph0Var) {
        m b2 = wz3.b(f2());
        vy4 r0 = f2().r0();
        int q = r0.q();
        if (q > 0) {
            Object[] p = r0.p();
            int i = 0;
            do {
                LayoutNode layoutNode = (LayoutNode) p[i];
                if (layoutNode.e()) {
                    layoutNode.A(ph0Var);
                }
                i++;
            } while (i < q);
        }
        if (b2.getShowLayoutBounds()) {
            U1(ph0Var, l0);
        }
    }

    @Override // defpackage.xq3
    public int H(int i) {
        return f2().Q().g(i);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.compose.ui.node.NodeCoordinator, androidx.compose.ui.layout.l
    public void L0(long j, float f, ss2 ss2Var) {
        super.L0(j, f, ss2Var);
        if (p1()) {
            return;
        }
        E2();
        f2().a0().M1();
    }

    @Override // androidx.compose.ui.node.h
    public int R0(fb fbVar) {
        i g2 = g2();
        if (g2 != null) {
            return g2.R0(fbVar);
        }
        Integer num = (Integer) a2().k().get(fbVar);
        return num != null ? num.intValue() : RecyclerView.UNDEFINED_DURATION;
    }

    @Override // defpackage.xq3
    public int S(int i) {
        return f2().Q().h(i);
    }

    @Override // defpackage.xq3
    public int V(int i) {
        return f2().Q().c(i);
    }

    @Override // defpackage.qg4
    public androidx.compose.ui.layout.l W(long j) {
        Q0(j);
        vy4 s0 = f2().s0();
        int q = s0.q();
        if (q > 0) {
            Object[] p = s0.p();
            int i = 0;
            do {
                ((LayoutNode) p[i]).a0().R1(LayoutNode.UsageByParent.NotUsed);
                i++;
            } while (i < q);
        }
        L2(f2().c0().d(this, f2().E(), j));
        D2();
        return this;
    }

    @Override // androidx.compose.ui.node.NodeCoordinator
    public void W1() {
        if (g2() == null) {
            c3(new b());
        }
    }

    @Override // androidx.compose.ui.node.NodeCoordinator
    /* renamed from: b3, reason: merged with bridge method [inline-methods] */
    public bg8 k2() {
        return this.i0;
    }

    protected void c3(i iVar) {
        this.j0 = iVar;
    }

    @Override // androidx.compose.ui.node.NodeCoordinator
    public i g2() {
        return this.j0;
    }

    @Override // defpackage.xq3
    public int i(int i) {
        return f2().Q().b(i);
    }

    /* JADX WARN: Removed duplicated region for block: B:27:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0037  */
    @Override // androidx.compose.ui.node.NodeCoordinator
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void u2(androidx.compose.ui.node.NodeCoordinator.d r16, long r17, defpackage.z83 r19, boolean r20, boolean r21) {
        /*
            r15 = this;
            r0 = r15
            r7 = r17
            androidx.compose.ui.node.LayoutNode r1 = r15.f2()
            r9 = r16
            boolean r1 = r9.d(r1)
            r2 = 1
            r3 = 0
            if (r1 == 0) goto L33
            boolean r1 = r15.a3(r7)
            if (r1 == 0) goto L1b
            r10 = r21
        L19:
            r3 = r2
            goto L35
        L1b:
            if (r20 == 0) goto L33
            long r4 = r15.h2()
            float r1 = r15.S1(r7, r4)
            boolean r4 = java.lang.Float.isInfinite(r1)
            if (r4 != 0) goto L33
            boolean r1 = java.lang.Float.isNaN(r1)
            if (r1 != 0) goto L33
            r10 = r3
            goto L19
        L33:
            r10 = r21
        L35:
            if (r3 == 0) goto L87
            int r11 = defpackage.z83.c(r19)
            androidx.compose.ui.node.LayoutNode r0 = r15.f2()
            vy4 r0 = r0.r0()
            int r1 = r0.q()
            if (r1 <= 0) goto L7c
            int r1 = r1 - r2
            java.lang.Object[] r12 = r0.p()
            r13 = r1
        L4f:
            r0 = r12[r13]
            r14 = r0
            androidx.compose.ui.node.LayoutNode r14 = (androidx.compose.ui.node.LayoutNode) r14
            boolean r0 = r14.e()
            if (r0 == 0) goto L7f
            r0 = r16
            r1 = r14
            r2 = r17
            r4 = r19
            r5 = r20
            r6 = r10
            r0.c(r1, r2, r4, r5, r6)
            boolean r0 = r19.t()
            if (r0 != 0) goto L6e
            goto L7f
        L6e:
            androidx.compose.ui.node.NodeCoordinator r0 = r14.i0()
            boolean r0 = r0.P2()
            if (r0 == 0) goto L7c
            r19.a()
            goto L7f
        L7c:
            r0 = r19
            goto L84
        L7f:
            int r13 = r13 + (-1)
            if (r13 >= 0) goto L4f
            goto L7c
        L84:
            defpackage.z83.g(r0, r11)
        L87:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.node.a.u2(androidx.compose.ui.node.NodeCoordinator$d, long, z83, boolean, boolean):void");
    }
}
