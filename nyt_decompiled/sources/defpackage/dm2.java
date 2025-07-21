package defpackage;

import androidx.compose.ui.focus.FocusTargetNode;
import androidx.compose.ui.node.LayoutNode;
import androidx.compose.ui.node.NodeCoordinator;
import androidx.compose.ui.node.m;

/* loaded from: classes.dex */
public abstract class dm2 {
    /* JADX INFO: Access modifiers changed from: private */
    public static final em2 b(FocusTargetNode focusTargetNode) {
        LayoutNode f2;
        m j0;
        vl2 focusOwner;
        NodeCoordinator D1 = focusTargetNode.c0().D1();
        if (D1 == null || (f2 = D1.f2()) == null || (j0 = f2.j0()) == null || (focusOwner = j0.getFocusOwner()) == null) {
            return null;
        }
        return focusOwner.e();
    }

    public static final void c(FocusTargetNode focusTargetNode) {
        rl1.l(focusTargetNode).getFocusOwner().i(focusTargetNode);
    }

    public static final em2 d(FocusTargetNode focusTargetNode) {
        return rl1.l(focusTargetNode).getFocusOwner().e();
    }
}
