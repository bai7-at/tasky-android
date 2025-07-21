package defpackage;

import androidx.compose.ui.node.LayoutNode;
import androidx.compose.ui.node.i;

/* loaded from: classes.dex */
public abstract class ub4 {
    public static final i a(i iVar) {
        LayoutNode I1 = iVar.I1();
        while (true) {
            LayoutNode k0 = I1.k0();
            if ((k0 != null ? k0.Y() : null) == null) {
                i g2 = I1.i0().g2();
                zq3.e(g2);
                return g2;
            }
            LayoutNode k02 = I1.k0();
            LayoutNode Y = k02 != null ? k02.Y() : null;
            zq3.e(Y);
            if (Y.K0()) {
                I1 = I1.k0();
                zq3.e(I1);
            } else {
                LayoutNode k03 = I1.k0();
                zq3.e(k03);
                I1 = k03.Y();
                zq3.e(I1);
            }
        }
    }
}
