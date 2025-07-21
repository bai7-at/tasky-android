package androidx.compose.ui.focus;

import androidx.compose.ui.Modifier;
import androidx.compose.ui.focus.d;
import androidx.compose.ui.node.LayoutNode;
import androidx.compose.ui.node.k;
import defpackage.a85;
import defpackage.b80;
import defpackage.rl1;
import defpackage.ss2;
import defpackage.ul1;
import defpackage.vy4;
import defpackage.zq3;

/* loaded from: classes.dex */
public abstract class a {
    public static final Object a(FocusTargetNode focusTargetNode, int i, ss2 ss2Var) {
        Modifier.c cVar;
        b80 k2;
        int c;
        k h0;
        int a = a85.a(1024);
        if (!focusTargetNode.c0().L1()) {
            throw new IllegalStateException("visitAncestors called on an unattached node");
        }
        Modifier.c I1 = focusTargetNode.c0().I1();
        LayoutNode k = rl1.k(focusTargetNode);
        loop0: while (true) {
            if (k == null) {
                cVar = null;
                break;
            }
            if ((k.h0().k().B1() & a) != 0) {
                while (I1 != null) {
                    if ((I1.G1() & a) != 0) {
                        cVar = I1;
                        vy4 vy4Var = null;
                        while (cVar != null) {
                            if (cVar instanceof FocusTargetNode) {
                                break loop0;
                            }
                            if ((cVar.G1() & a) != 0 && (cVar instanceof ul1)) {
                                int i2 = 0;
                                for (Modifier.c f2 = ((ul1) cVar).f2(); f2 != null; f2 = f2.C1()) {
                                    if ((f2.G1() & a) != 0) {
                                        i2++;
                                        if (i2 == 1) {
                                            cVar = f2;
                                        } else {
                                            if (vy4Var == null) {
                                                vy4Var = new vy4(new Modifier.c[16], 0);
                                            }
                                            if (cVar != null) {
                                                vy4Var.b(cVar);
                                                cVar = null;
                                            }
                                            vy4Var.b(f2);
                                        }
                                    }
                                }
                                if (i2 == 1) {
                                }
                            }
                            cVar = rl1.g(vy4Var);
                        }
                    }
                    I1 = I1.I1();
                }
            }
            k = k.k0();
            I1 = (k == null || (h0 = k.h0()) == null) ? null : h0.o();
        }
        FocusTargetNode focusTargetNode2 = (FocusTargetNode) cVar;
        if ((focusTargetNode2 != null && zq3.c(focusTargetNode2.k2(), focusTargetNode.k2())) || (k2 = focusTargetNode.k2()) == null) {
            return null;
        }
        d.a aVar = d.b;
        if (d.l(i, aVar.h())) {
            c = b80.b.a.a();
        } else if (d.l(i, aVar.a())) {
            c = b80.b.a.d();
        } else if (d.l(i, aVar.d())) {
            c = b80.b.a.e();
        } else if (d.l(i, aVar.g())) {
            c = b80.b.a.f();
        } else if (d.l(i, aVar.e())) {
            c = b80.b.a.b();
        } else {
            if (!d.l(i, aVar.f())) {
                throw new IllegalStateException("Unsupported direction for beyond bounds layout");
            }
            c = b80.b.a.c();
        }
        return k2.l(c, ss2Var);
    }
}
