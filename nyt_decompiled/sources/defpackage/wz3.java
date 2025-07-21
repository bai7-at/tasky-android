package defpackage;

import androidx.compose.ui.node.LayoutNode;
import androidx.compose.ui.node.m;

/* loaded from: classes.dex */
public abstract class wz3 {
    private static final fm1 a = hm1.b(1.0f, 0.0f, 2, null);

    public static final m b(LayoutNode layoutNode) {
        m j0 = layoutNode.j0();
        if (j0 != null) {
            return j0;
        }
        throw new IllegalStateException("LayoutNode should be attached to an owner");
    }
}
