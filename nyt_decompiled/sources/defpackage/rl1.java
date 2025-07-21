package defpackage;

import androidx.compose.ui.Modifier;
import androidx.compose.ui.node.LayoutNode;
import androidx.compose.ui.node.NodeCoordinator;
import androidx.compose.ui.node.c;
import androidx.compose.ui.node.m;
import androidx.compose.ui.unit.LayoutDirection;

/* loaded from: classes.dex */
public abstract class rl1 {
    /* JADX INFO: Access modifiers changed from: private */
    public static final void c(vy4 vy4Var, Modifier.c cVar) {
        vy4 s0 = k(cVar).s0();
        int q = s0.q();
        if (q > 0) {
            int i = q - 1;
            Object[] p = s0.p();
            do {
                vy4Var.b(((LayoutNode) p[i]).h0().k());
                i--;
            } while (i >= 0);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final c d(Modifier.c cVar) {
        if ((a85.a(2) & cVar.G1()) != 0) {
            if (cVar instanceof c) {
                return (c) cVar;
            }
            if (cVar instanceof ul1) {
                Modifier.c f2 = ((ul1) cVar).f2();
                while (f2 != 0) {
                    if (f2 instanceof c) {
                        return (c) f2;
                    }
                    f2 = (!(f2 instanceof ul1) || (a85.a(2) & f2.G1()) == 0) ? f2.C1() : ((ul1) f2).f2();
                }
            }
        }
        return null;
    }

    public static final boolean e(ql1 ql1Var, int i) {
        return (ql1Var.c0().B1() & i) != 0;
    }

    public static final boolean f(ql1 ql1Var) {
        return ql1Var.c0() == ql1Var;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Modifier.c g(vy4 vy4Var) {
        if (vy4Var == null || vy4Var.s()) {
            return null;
        }
        return (Modifier.c) vy4Var.y(vy4Var.q() - 1);
    }

    public static final NodeCoordinator h(ql1 ql1Var, int i) {
        NodeCoordinator D1 = ql1Var.c0().D1();
        zq3.e(D1);
        if (D1.k2() != ql1Var || !b85.i(i)) {
            return D1;
        }
        NodeCoordinator l2 = D1.l2();
        zq3.e(l2);
        return l2;
    }

    public static final fm1 i(ql1 ql1Var) {
        return k(ql1Var).I();
    }

    public static final LayoutDirection j(ql1 ql1Var) {
        return k(ql1Var).getLayoutDirection();
    }

    public static final LayoutNode k(ql1 ql1Var) {
        NodeCoordinator D1 = ql1Var.c0().D1();
        if (D1 != null) {
            return D1.f2();
        }
        throw new IllegalStateException("Cannot obtain node coordinator. Is the Modifier.Node attached?");
    }

    public static final m l(ql1 ql1Var) {
        m j0 = k(ql1Var).j0();
        if (j0 != null) {
            return j0;
        }
        throw new IllegalStateException("This node does not have an owner.");
    }
}
