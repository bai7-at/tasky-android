package defpackage;

import androidx.compose.ui.node.NodeCoordinator;

/* loaded from: classes.dex */
public abstract class ez3 {
    public static final kt6 a(cz3 cz3Var) {
        kt6 C;
        cz3 Y = cz3Var.Y();
        return (Y == null || (C = cz3.C(Y, cz3Var, false, 2, null)) == null) ? new kt6(0.0f, 0.0f, hn3.g(cz3Var.a()), hn3.f(cz3Var.a())) : C;
    }

    public static final kt6 b(cz3 cz3Var) {
        return cz3.C(d(cz3Var), cz3Var, false, 2, null);
    }

    public static final kt6 c(cz3 cz3Var) {
        cz3 d = d(cz3Var);
        kt6 b = b(cz3Var);
        float g = hn3.g(d.a());
        float f = hn3.f(d.a());
        float l = uo6.l(b.i(), 0.0f, g);
        float l2 = uo6.l(b.l(), 0.0f, f);
        float l3 = uo6.l(b.j(), 0.0f, g);
        float l4 = uo6.l(b.e(), 0.0f, f);
        if (l == l3 || l2 == l4) {
            return kt6.e.a();
        }
        long L = d.L(hd5.a(l, l2));
        long L2 = d.L(hd5.a(l3, l2));
        long L3 = d.L(hd5.a(l3, l4));
        long L4 = d.L(hd5.a(l, l4));
        return new kt6(tp0.i(fd5.o(L), fd5.o(L2), fd5.o(L4), fd5.o(L3)), tp0.i(fd5.p(L), fd5.p(L2), fd5.p(L4), fd5.p(L3)), tp0.h(fd5.o(L), fd5.o(L2), fd5.o(L4), fd5.o(L3)), tp0.h(fd5.p(L), fd5.p(L2), fd5.p(L4), fd5.p(L3)));
    }

    public static final cz3 d(cz3 cz3Var) {
        cz3 cz3Var2;
        cz3 Y = cz3Var.Y();
        while (true) {
            cz3 cz3Var3 = Y;
            cz3Var2 = cz3Var;
            cz3Var = cz3Var3;
            if (cz3Var == null) {
                break;
            }
            Y = cz3Var.Y();
        }
        NodeCoordinator nodeCoordinator = cz3Var2 instanceof NodeCoordinator ? (NodeCoordinator) cz3Var2 : null;
        if (nodeCoordinator == null) {
            return cz3Var2;
        }
        NodeCoordinator m2 = nodeCoordinator.m2();
        while (true) {
            NodeCoordinator nodeCoordinator2 = m2;
            NodeCoordinator nodeCoordinator3 = nodeCoordinator;
            nodeCoordinator = nodeCoordinator2;
            if (nodeCoordinator == null) {
                return nodeCoordinator3;
            }
            m2 = nodeCoordinator.m2();
        }
    }

    public static final long e(cz3 cz3Var) {
        return cz3Var.g0(fd5.b.c());
    }

    public static final long f(cz3 cz3Var) {
        return cz3Var.L(fd5.b.c());
    }
}
