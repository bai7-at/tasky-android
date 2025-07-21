package androidx.compose.ui.focus;

import androidx.compose.ui.node.LayoutNode;
import defpackage.rl1;
import defpackage.vy4;
import defpackage.zq3;
import java.util.Comparator;

/* loaded from: classes.dex */
final class i implements Comparator {
    public static final i a = new i();

    private i() {
    }

    private final vy4 b(LayoutNode layoutNode) {
        vy4 vy4Var = new vy4(new LayoutNode[16], 0);
        while (layoutNode != null) {
            vy4Var.a(0, layoutNode);
            layoutNode = layoutNode.k0();
        }
        return vy4Var;
    }

    @Override // java.util.Comparator
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public int compare(FocusTargetNode focusTargetNode, FocusTargetNode focusTargetNode2) {
        if (focusTargetNode == null) {
            throw new IllegalArgumentException("compare requires non-null focus targets");
        }
        if (focusTargetNode2 == null) {
            throw new IllegalArgumentException("compare requires non-null focus targets");
        }
        int i = 0;
        if (!h.g(focusTargetNode) || !h.g(focusTargetNode2)) {
            if (h.g(focusTargetNode)) {
                return -1;
            }
            return h.g(focusTargetNode2) ? 1 : 0;
        }
        LayoutNode k = rl1.k(focusTargetNode);
        LayoutNode k2 = rl1.k(focusTargetNode2);
        if (zq3.c(k, k2)) {
            return 0;
        }
        vy4 b = b(k);
        vy4 b2 = b(k2);
        int min = Math.min(b.q() - 1, b2.q() - 1);
        if (min >= 0) {
            while (zq3.c(b.p()[i], b2.p()[i])) {
                if (i != min) {
                    i++;
                }
            }
            return zq3.j(((LayoutNode) b.p()[i]).l0(), ((LayoutNode) b2.p()[i]).l0());
        }
        throw new IllegalStateException("Could not find a common ancestor between the two FocusModifiers.");
    }
}
