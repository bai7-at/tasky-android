package androidx.compose.ui.node;

import androidx.compose.ui.Modifier;
import defpackage.ao5;
import defpackage.eo5;
import defpackage.fb;
import defpackage.fv0;
import defpackage.nn0;
import defpackage.ph0;
import defpackage.pz3;
import defpackage.ss2;
import defpackage.uf;
import defpackage.wz3;
import defpackage.zq3;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes.dex */
public final class d extends NodeCoordinator {
    public static final a l0 = new a(null);
    private static final ao5 m0;
    private c i0;
    private fv0 j0;
    private i k0;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    private final class b extends i {
        public b() {
            super(d.this);
        }

        @Override // androidx.compose.ui.node.i, defpackage.xq3
        public int H(int i) {
            c c3 = d.this.c3();
            i g2 = d.this.d3().g2();
            zq3.e(g2);
            return c3.o(this, g2, i);
        }

        @Override // androidx.compose.ui.node.h
        public int R0(fb fbVar) {
            int b;
            b = pz3.b(this, fbVar);
            F1().put(fbVar, Integer.valueOf(b));
            return b;
        }

        @Override // androidx.compose.ui.node.i, defpackage.xq3
        public int S(int i) {
            c c3 = d.this.c3();
            i g2 = d.this.d3().g2();
            zq3.e(g2);
            return c3.f(this, g2, i);
        }

        @Override // androidx.compose.ui.node.i, defpackage.xq3
        public int V(int i) {
            c c3 = d.this.c3();
            i g2 = d.this.d3().g2();
            zq3.e(g2);
            return c3.u(this, g2, i);
        }

        @Override // defpackage.qg4
        public androidx.compose.ui.layout.l W(long j) {
            d dVar = d.this;
            Q0(j);
            dVar.j0 = fv0.b(j);
            c c3 = dVar.c3();
            i g2 = dVar.d3().g2();
            zq3.e(g2);
            P1(c3.d(this, g2, j));
            return this;
        }

        @Override // androidx.compose.ui.node.i, defpackage.xq3
        public int i(int i) {
            c c3 = d.this.c3();
            i g2 = d.this.d3().g2();
            zq3.e(g2);
            return c3.m(this, g2, i);
        }
    }

    static {
        ao5 a2 = uf.a();
        a2.k(nn0.b.b());
        a2.w(1.0f);
        a2.v(eo5.a.b());
        m0 = a2;
    }

    public d(LayoutNode layoutNode, c cVar) {
        super(layoutNode);
        this.i0 = cVar;
        this.k0 = layoutNode.Y() != null ? new b() : null;
    }

    @Override // androidx.compose.ui.node.NodeCoordinator
    public void G2(ph0 ph0Var) {
        d3().T1(ph0Var);
        if (wz3.b(f2()).getShowLayoutBounds()) {
            U1(ph0Var, m0);
        }
    }

    @Override // defpackage.xq3
    public int H(int i) {
        return this.i0.o(this, d3(), i);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.compose.ui.node.NodeCoordinator, androidx.compose.ui.layout.l
    public void L0(long j, float f, ss2 ss2Var) {
        super.L0(j, f, ss2Var);
        if (p1()) {
            return;
        }
        E2();
        V0().e();
    }

    @Override // androidx.compose.ui.node.h
    public int R0(fb fbVar) {
        int b2;
        i g2 = g2();
        if (g2 != null) {
            return g2.E1(fbVar);
        }
        b2 = pz3.b(this, fbVar);
        return b2;
    }

    @Override // defpackage.xq3
    public int S(int i) {
        return this.i0.f(this, d3(), i);
    }

    @Override // defpackage.xq3
    public int V(int i) {
        return this.i0.u(this, d3(), i);
    }

    @Override // defpackage.qg4
    public androidx.compose.ui.layout.l W(long j) {
        Q0(j);
        L2(c3().d(this, d3(), j));
        D2();
        return this;
    }

    @Override // androidx.compose.ui.node.NodeCoordinator
    public void W1() {
        if (g2() == null) {
            f3(new b());
        }
    }

    public final c c3() {
        return this.i0;
    }

    public final NodeCoordinator d3() {
        NodeCoordinator l2 = l2();
        zq3.e(l2);
        return l2;
    }

    public final void e3(c cVar) {
        this.i0 = cVar;
    }

    protected void f3(i iVar) {
        this.k0 = iVar;
    }

    @Override // androidx.compose.ui.node.NodeCoordinator
    public i g2() {
        return this.k0;
    }

    @Override // defpackage.xq3
    public int i(int i) {
        return this.i0.m(this, d3(), i);
    }

    @Override // androidx.compose.ui.node.NodeCoordinator
    public Modifier.c k2() {
        return this.i0.c0();
    }
}
