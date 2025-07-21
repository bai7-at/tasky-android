package defpackage;

import androidx.compose.ui.Modifier;
import androidx.compose.ui.node.LayoutNode;
import androidx.compose.ui.node.k;

/* loaded from: classes.dex */
public interface kv4 extends nv4, ql1 {
    default jv4 V() {
        return m02.a;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v10, types: [androidx.compose.ui.Modifier$c] */
    /* JADX WARN: Type inference failed for: r2v11, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v12 */
    /* JADX WARN: Type inference failed for: r2v13 */
    /* JADX WARN: Type inference failed for: r2v14 */
    /* JADX WARN: Type inference failed for: r2v15 */
    /* JADX WARN: Type inference failed for: r2v16 */
    /* JADX WARN: Type inference failed for: r2v17 */
    /* JADX WARN: Type inference failed for: r2v6 */
    /* JADX WARN: Type inference failed for: r2v7, types: [androidx.compose.ui.Modifier$c] */
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
    @Override // defpackage.nv4
    default Object l(gv4 gv4Var) {
        k h0;
        if (!c0().L1()) {
            throw new IllegalArgumentException("ModifierLocal accessed from an unattached node");
        }
        int a = a85.a(32);
        if (!c0().L1()) {
            throw new IllegalStateException("visitAncestors called on an unattached node");
        }
        Modifier.c I1 = c0().I1();
        LayoutNode k = rl1.k(this);
        while (k != null) {
            if ((k.h0().k().B1() & a) != 0) {
                while (I1 != null) {
                    if ((I1.G1() & a) != 0) {
                        ul1 ul1Var = I1;
                        ?? r4 = 0;
                        while (ul1Var != 0) {
                            if (ul1Var instanceof kv4) {
                                kv4 kv4Var = (kv4) ul1Var;
                                if (kv4Var.V().a(gv4Var)) {
                                    return kv4Var.V().b(gv4Var);
                                }
                            } else if ((ul1Var.G1() & a) != 0 && (ul1Var instanceof ul1)) {
                                Modifier.c f2 = ul1Var.f2();
                                int i = 0;
                                ul1Var = ul1Var;
                                r4 = r4;
                                while (f2 != null) {
                                    if ((f2.G1() & a) != 0) {
                                        i++;
                                        r4 = r4;
                                        if (i == 1) {
                                            ul1Var = f2;
                                        } else {
                                            if (r4 == 0) {
                                                r4 = new vy4(new Modifier.c[16], 0);
                                            }
                                            if (ul1Var != 0) {
                                                r4.b(ul1Var);
                                                ul1Var = 0;
                                            }
                                            r4.b(f2);
                                        }
                                    }
                                    f2 = f2.C1();
                                    ul1Var = ul1Var;
                                    r4 = r4;
                                }
                                if (i == 1) {
                                }
                            }
                            ul1Var = rl1.g(r4);
                        }
                    }
                    I1 = I1.I1();
                }
            }
            k = k.k0();
            I1 = (k == null || (h0 = k.h0()) == null) ? null : h0.o();
        }
        return gv4Var.a().mo865invoke();
    }
}
