package androidx.compose.ui.layout;

import androidx.compose.ui.layout.l;
import androidx.compose.ui.unit.LayoutDirection;

/* loaded from: classes.dex */
final class e extends l.a {
    private final androidx.compose.ui.node.h a;

    public e(androidx.compose.ui.node.h hVar) {
        this.a = hVar;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.compose.ui.layout.l.a
    public LayoutDirection c() {
        return this.a.getLayoutDirection();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.compose.ui.layout.l.a
    public int d() {
        return this.a.B0();
    }
}
