package defpackage;

import androidx.compose.ui.node.LayoutNode;

/* loaded from: classes.dex */
public abstract class xz3 {
    public static final boolean a(LayoutNode layoutNode) {
        if (layoutNode.Y() != null) {
            LayoutNode k0 = layoutNode.k0();
            if ((k0 != null ? k0.Y() : null) == null || layoutNode.S().v()) {
                return true;
            }
        }
        return false;
    }
}
