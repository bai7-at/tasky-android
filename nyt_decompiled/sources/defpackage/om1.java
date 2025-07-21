package defpackage;

import androidx.compose.ui.node.DepthSortedSet;
import androidx.compose.ui.node.LayoutNode;

/* loaded from: classes.dex */
public final class om1 {
    private final DepthSortedSet a;
    private final DepthSortedSet b;

    public om1(boolean z) {
        this.a = new DepthSortedSet(z);
        this.b = new DepthSortedSet(z);
    }

    public final void c(LayoutNode layoutNode, boolean z) {
        if (z) {
            this.a.a(layoutNode);
        } else {
            if (this.a.b(layoutNode)) {
                return;
            }
            this.b.a(layoutNode);
        }
    }

    public final boolean d(LayoutNode layoutNode) {
        return this.a.b(layoutNode) || this.b.b(layoutNode);
    }

    public final boolean e(LayoutNode layoutNode, boolean z) {
        boolean b = this.a.b(layoutNode);
        return z ? b : b || this.b.b(layoutNode);
    }

    public final boolean f() {
        return this.b.d() && this.a.d();
    }

    public final boolean g(boolean z) {
        return (z ? this.a : this.b).d();
    }

    public final boolean h() {
        return !f();
    }

    public final boolean i(LayoutNode layoutNode) {
        return this.b.f(layoutNode) || this.a.f(layoutNode);
    }
}
