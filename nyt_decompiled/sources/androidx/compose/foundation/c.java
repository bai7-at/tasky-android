package androidx.compose.foundation;

import defpackage.dy4;
import defpackage.n27;
import defpackage.qs2;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes.dex */
final class c extends AbstractClickableNode {
    private final ClickableSemanticsNode B;
    private final ClickablePointerInputNode H;

    public /* synthetic */ c(dy4 dy4Var, boolean z, String str, n27 n27Var, qs2 qs2Var, DefaultConstructorMarker defaultConstructorMarker) {
        this(dy4Var, z, str, n27Var, qs2Var);
    }

    @Override // androidx.compose.foundation.AbstractClickableNode
    /* renamed from: o2, reason: merged with bridge method [inline-methods] */
    public ClickablePointerInputNode l2() {
        return this.H;
    }

    public ClickableSemanticsNode p2() {
        return this.B;
    }

    public final void q2(dy4 dy4Var, boolean z, String str, n27 n27Var, qs2 qs2Var) {
        n2(dy4Var, z, str, n27Var, qs2Var);
        p2().g2(z, str, n27Var, qs2Var, null, null);
        l2().r2(z, dy4Var, qs2Var);
    }

    private c(dy4 dy4Var, boolean z, String str, n27 n27Var, qs2 qs2Var) {
        super(dy4Var, z, str, n27Var, qs2Var, null);
        this.B = (ClickableSemanticsNode) e2(new ClickableSemanticsNode(z, str, n27Var, qs2Var, null, null, null));
        this.H = (ClickablePointerInputNode) e2(new ClickablePointerInputNode(z, dy4Var, qs2Var, m2()));
    }
}
