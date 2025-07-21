package androidx.compose.ui.node;

import androidx.compose.ui.Modifier;
import androidx.compose.ui.input.pointer.SuspendPointerInputElement;
import androidx.compose.ui.node.NodeChainKt;
import defpackage.a85;
import defpackage.b85;
import defpackage.bg8;
import defpackage.hq1;
import defpackage.mz4;
import defpackage.ov4;
import defpackage.rl1;
import defpackage.vy4;
import defpackage.zq3;

/* loaded from: classes.dex */
public final class k {
    private final LayoutNode a;
    private final androidx.compose.ui.node.a b;
    private NodeCoordinator c;
    private final Modifier.c d;
    private Modifier.c e;
    private vy4 f;
    private vy4 g;
    private a h;

    private final class a implements hq1 {
        private Modifier.c a;
        private int b;
        private vy4 c;
        private vy4 d;
        private boolean e;

        public a(Modifier.c cVar, int i, vy4 vy4Var, vy4 vy4Var2, boolean z) {
            this.a = cVar;
            this.b = i;
            this.c = vy4Var;
            this.d = vy4Var2;
            this.e = z;
        }

        @Override // defpackage.hq1
        public void a(int i, int i2) {
            Modifier.c C1 = this.a.C1();
            zq3.e(C1);
            k.d(k.this);
            if ((a85.a(2) & C1.G1()) != 0) {
                NodeCoordinator D1 = C1.D1();
                zq3.e(D1);
                NodeCoordinator m2 = D1.m2();
                NodeCoordinator l2 = D1.l2();
                zq3.e(l2);
                if (m2 != null) {
                    m2.N2(l2);
                }
                l2.O2(m2);
                k.this.v(this.a, l2);
            }
            this.a = k.this.h(C1);
        }

        @Override // defpackage.hq1
        public boolean b(int i, int i2) {
            return NodeChainKt.d((Modifier.b) this.c.p()[this.b + i], (Modifier.b) this.d.p()[this.b + i2]) != 0;
        }

        @Override // defpackage.hq1
        public void c(int i) {
            int i2 = this.b + i;
            this.a = k.this.g((Modifier.b) this.d.p()[i2], this.a);
            k.d(k.this);
            if (!this.e) {
                this.a.X1(true);
                return;
            }
            Modifier.c C1 = this.a.C1();
            zq3.e(C1);
            NodeCoordinator D1 = C1.D1();
            zq3.e(D1);
            c d = rl1.d(this.a);
            if (d != null) {
                d dVar = new d(k.this.m(), d);
                this.a.d2(dVar);
                k.this.v(this.a, dVar);
                dVar.O2(D1.m2());
                dVar.N2(D1);
                D1.O2(dVar);
            } else {
                this.a.d2(D1);
            }
            this.a.M1();
            this.a.S1();
            b85.a(this.a);
        }

        @Override // defpackage.hq1
        public void d(int i, int i2) {
            Modifier.c C1 = this.a.C1();
            zq3.e(C1);
            this.a = C1;
            vy4 vy4Var = this.c;
            Modifier.b bVar = (Modifier.b) vy4Var.p()[this.b + i];
            vy4 vy4Var2 = this.d;
            Modifier.b bVar2 = (Modifier.b) vy4Var2.p()[this.b + i2];
            if (zq3.c(bVar, bVar2)) {
                k.d(k.this);
            } else {
                k.this.F(bVar, bVar2, this.a);
                k.d(k.this);
            }
        }

        public final void e(vy4 vy4Var) {
            this.d = vy4Var;
        }

        public final void f(vy4 vy4Var) {
            this.c = vy4Var;
        }

        public final void g(Modifier.c cVar) {
            this.a = cVar;
        }

        public final void h(int i) {
            this.b = i;
        }

        public final void i(boolean z) {
            this.e = z;
        }
    }

    public interface b {
    }

    public k(LayoutNode layoutNode) {
        this.a = layoutNode;
        androidx.compose.ui.node.a aVar = new androidx.compose.ui.node.a(layoutNode);
        this.b = aVar;
        this.c = aVar;
        bg8 k2 = aVar.k2();
        this.d = k2;
        this.e = k2;
    }

    private final void A(int i, vy4 vy4Var, vy4 vy4Var2, Modifier.c cVar, boolean z) {
        mz4.e(vy4Var.q() - i, vy4Var2.q() - i, j(cVar, i, vy4Var, vy4Var2, z));
        B();
    }

    private final void B() {
        NodeChainKt.a aVar;
        int i = 0;
        for (Modifier.c I1 = this.d.I1(); I1 != null; I1 = I1.I1()) {
            aVar = NodeChainKt.a;
            if (I1 == aVar) {
                return;
            }
            i |= I1.G1();
            I1.U1(i);
        }
    }

    private final Modifier.c D(Modifier.c cVar) {
        NodeChainKt.a aVar;
        NodeChainKt.a aVar2;
        NodeChainKt.a aVar3;
        NodeChainKt.a aVar4;
        NodeChainKt.a aVar5;
        NodeChainKt.a aVar6;
        aVar = NodeChainKt.a;
        if (cVar != aVar) {
            throw new IllegalStateException("trimChain called on already trimmed chain");
        }
        aVar2 = NodeChainKt.a;
        Modifier.c C1 = aVar2.C1();
        if (C1 == null) {
            C1 = this.d;
        }
        C1.a2(null);
        aVar3 = NodeChainKt.a;
        aVar3.W1(null);
        aVar4 = NodeChainKt.a;
        aVar4.U1(-1);
        aVar5 = NodeChainKt.a;
        aVar5.d2(null);
        aVar6 = NodeChainKt.a;
        if (C1 != aVar6) {
            return C1;
        }
        throw new IllegalStateException("trimChain did not update the head");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void F(Modifier.b bVar, Modifier.b bVar2, Modifier.c cVar) {
        if ((bVar instanceof ov4) && (bVar2 instanceof ov4)) {
            NodeChainKt.f((ov4) bVar2, cVar);
            if (cVar.L1()) {
                b85.e(cVar);
                return;
            } else {
                cVar.b2(true);
                return;
            }
        }
        if (!(cVar instanceof BackwardsCompatNode)) {
            throw new IllegalStateException("Unknown Modifier.Node type");
        }
        ((BackwardsCompatNode) cVar).i2(bVar2);
        if (cVar.L1()) {
            b85.e(cVar);
        } else {
            cVar.b2(true);
        }
    }

    public static final /* synthetic */ b d(k kVar) {
        kVar.getClass();
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Modifier.c g(Modifier.b bVar, Modifier.c cVar) {
        Modifier.c backwardsCompatNode;
        if (bVar instanceof ov4) {
            backwardsCompatNode = ((ov4) bVar).l();
            backwardsCompatNode.Y1(b85.h(backwardsCompatNode));
        } else {
            backwardsCompatNode = new BackwardsCompatNode(bVar);
        }
        if (backwardsCompatNode.L1()) {
            throw new IllegalStateException("A ModifierNodeElement cannot return an already attached node from create() ");
        }
        backwardsCompatNode.X1(true);
        return r(backwardsCompatNode, cVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Modifier.c h(Modifier.c cVar) {
        if (cVar.L1()) {
            b85.d(cVar);
            cVar.T1();
            cVar.N1();
        }
        return w(cVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final int i() {
        return this.e.B1();
    }

    private final a j(Modifier.c cVar, int i, vy4 vy4Var, vy4 vy4Var2, boolean z) {
        a aVar = this.h;
        if (aVar == null) {
            a aVar2 = new a(cVar, i, vy4Var, vy4Var2, z);
            this.h = aVar2;
            return aVar2;
        }
        aVar.g(cVar);
        aVar.h(i);
        aVar.f(vy4Var);
        aVar.e(vy4Var2);
        aVar.i(z);
        return aVar;
    }

    private final Modifier.c r(Modifier.c cVar, Modifier.c cVar2) {
        Modifier.c C1 = cVar2.C1();
        if (C1 != null) {
            C1.a2(cVar);
            cVar.W1(C1);
        }
        cVar2.W1(cVar);
        cVar.a2(cVar2);
        return cVar;
    }

    private final Modifier.c u() {
        NodeChainKt.a aVar;
        NodeChainKt.a aVar2;
        NodeChainKt.a aVar3;
        NodeChainKt.a aVar4;
        Modifier.c cVar = this.e;
        aVar = NodeChainKt.a;
        if (cVar == aVar) {
            throw new IllegalStateException("padChain called on already padded chain");
        }
        Modifier.c cVar2 = this.e;
        aVar2 = NodeChainKt.a;
        cVar2.a2(aVar2);
        aVar3 = NodeChainKt.a;
        aVar3.W1(cVar2);
        aVar4 = NodeChainKt.a;
        return aVar4;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void v(Modifier.c cVar, NodeCoordinator nodeCoordinator) {
        NodeChainKt.a aVar;
        for (Modifier.c I1 = cVar.I1(); I1 != null; I1 = I1.I1()) {
            aVar = NodeChainKt.a;
            if (I1 == aVar) {
                LayoutNode k0 = this.a.k0();
                nodeCoordinator.O2(k0 != null ? k0.N() : null);
                this.c = nodeCoordinator;
                return;
            } else {
                if ((a85.a(2) & I1.G1()) != 0) {
                    return;
                }
                I1.d2(nodeCoordinator);
            }
        }
    }

    private final Modifier.c w(Modifier.c cVar) {
        Modifier.c C1 = cVar.C1();
        Modifier.c I1 = cVar.I1();
        if (C1 != null) {
            C1.a2(I1);
            cVar.W1(null);
        }
        if (I1 != null) {
            I1.W1(C1);
            cVar.a2(null);
        }
        zq3.e(I1);
        return I1;
    }

    public final void C() {
        NodeCoordinator dVar;
        NodeCoordinator nodeCoordinator = this.b;
        for (Modifier.c I1 = this.d.I1(); I1 != null; I1 = I1.I1()) {
            c d = rl1.d(I1);
            if (d != null) {
                if (I1.D1() != null) {
                    NodeCoordinator D1 = I1.D1();
                    zq3.f(D1, "null cannot be cast to non-null type androidx.compose.ui.node.LayoutModifierNodeCoordinator");
                    dVar = (d) D1;
                    c c3 = dVar.c3();
                    dVar.e3(d);
                    if (c3 != I1) {
                        dVar.A2();
                    }
                } else {
                    dVar = new d(this.a, d);
                    I1.d2(dVar);
                }
                nodeCoordinator.O2(dVar);
                dVar.N2(nodeCoordinator);
                nodeCoordinator = dVar;
            } else {
                I1.d2(nodeCoordinator);
            }
        }
        LayoutNode k0 = this.a.k0();
        nodeCoordinator.O2(k0 != null ? k0.N() : null);
        this.c = nodeCoordinator;
    }

    /* JADX WARN: Removed duplicated region for block: B:35:0x010a  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0118  */
    /* JADX WARN: Removed duplicated region for block: B:40:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void E(androidx.compose.ui.Modifier r13) {
        /*
            Method dump skipped, instructions count: 284
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.node.k.E(androidx.compose.ui.Modifier):void");
    }

    public final Modifier.c k() {
        return this.e;
    }

    public final androidx.compose.ui.node.a l() {
        return this.b;
    }

    public final LayoutNode m() {
        return this.a;
    }

    public final NodeCoordinator n() {
        return this.c;
    }

    public final Modifier.c o() {
        return this.d;
    }

    public final boolean p(int i) {
        return (i() & i) != 0;
    }

    public final boolean q(int i) {
        return (i() & i) != 0;
    }

    public final void s() {
        for (Modifier.c k = k(); k != null; k = k.C1()) {
            k.M1();
        }
    }

    public final void t() {
        for (Modifier.c o = o(); o != null; o = o.I1()) {
            if (o.L1()) {
                o.N1();
            }
        }
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("[");
        if (this.e != this.d) {
            Modifier.c k = k();
            while (true) {
                if (k == null || k == o()) {
                    break;
                }
                sb.append(String.valueOf(k));
                if (k.C1() == this.d) {
                    sb.append("]");
                    break;
                }
                sb.append(",");
                k = k.C1();
            }
        } else {
            sb.append("]");
        }
        String sb2 = sb.toString();
        zq3.g(sb2, "StringBuilder().apply(builderAction).toString()");
        return sb2;
    }

    public final void x() {
        int q;
        for (Modifier.c o = o(); o != null; o = o.I1()) {
            if (o.L1()) {
                o.R1();
            }
        }
        vy4 vy4Var = this.f;
        if (vy4Var != null && (q = vy4Var.q()) > 0) {
            Object[] p = vy4Var.p();
            int i = 0;
            do {
                Modifier.b bVar = (Modifier.b) p[i];
                if (bVar instanceof SuspendPointerInputElement) {
                    vy4Var.B(i, new ForceUpdateElement((ov4) bVar));
                }
                i++;
            } while (i < q);
        }
        z();
        t();
    }

    public final void y() {
        for (Modifier.c k = k(); k != null; k = k.C1()) {
            k.S1();
            if (k.F1()) {
                b85.a(k);
            }
            if (k.K1()) {
                b85.e(k);
            }
            k.X1(false);
            k.b2(false);
        }
    }

    public final void z() {
        for (Modifier.c o = o(); o != null; o = o.I1()) {
            if (o.L1()) {
                o.T1();
            }
        }
    }
}
