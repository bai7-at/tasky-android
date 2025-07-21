package defpackage;

import androidx.compose.ui.Modifier;
import androidx.compose.ui.node.LayoutNode;
import androidx.compose.ui.node.k;
import androidx.compose.ui.semantics.SemanticsNode;

/* loaded from: classes.dex */
public final class ij7 {
    private final LayoutNode a;

    public ij7(LayoutNode layoutNode) {
        this.a = layoutNode;
    }

    public final SemanticsNode a() {
        int i;
        k h0 = this.a.h0();
        int a = a85.a(8);
        i = h0.i();
        Object obj = null;
        if ((i & a) != 0) {
            Modifier.c k = h0.k();
            loop0: while (true) {
                if (k == null) {
                    break;
                }
                if ((k.G1() & a) != 0) {
                    Modifier.c cVar = k;
                    vy4 vy4Var = null;
                    while (cVar != null) {
                        if (cVar instanceof ej7) {
                            obj = cVar;
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
                if ((k.B1() & a) == 0) {
                    break;
                }
                k = k.C1();
            }
        }
        zq3.e(obj);
        return new SemanticsNode(((ej7) obj).c0(), false, this.a, new bj7());
    }
}
