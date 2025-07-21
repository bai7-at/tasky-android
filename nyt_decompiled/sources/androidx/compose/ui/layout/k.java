package androidx.compose.ui.layout;

import androidx.compose.ui.layout.l;
import androidx.compose.ui.unit.LayoutDirection;

/* loaded from: classes.dex */
final class k extends l.a {
    private final androidx.compose.ui.node.m a;

    public k(androidx.compose.ui.node.m mVar) {
        this.a = mVar;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.compose.ui.layout.l.a
    public LayoutDirection c() {
        return this.a.getLayoutDirection();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.compose.ui.layout.l.a
    public int d() {
        return this.a.getRoot().p0();
    }
}
