package androidx.compose.foundation;

import defpackage.dy4;
import defpackage.ov4;
import defpackage.zq3;

/* loaded from: classes.dex */
final class FocusableElement extends ov4 {
    private final dy4 b;

    public FocusableElement(dy4 dy4Var) {
        this.b = dy4Var;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof FocusableElement) && zq3.c(this.b, ((FocusableElement) obj).b);
    }

    @Override // defpackage.ov4
    public int hashCode() {
        dy4 dy4Var = this.b;
        if (dy4Var != null) {
            return dy4Var.hashCode();
        }
        return 0;
    }

    @Override // defpackage.ov4
    /* renamed from: t, reason: merged with bridge method [inline-methods] */
    public FocusableNode l() {
        return new FocusableNode(this.b);
    }

    @Override // defpackage.ov4
    /* renamed from: v, reason: merged with bridge method [inline-methods] */
    public void r(FocusableNode focusableNode) {
        focusableNode.k2(this.b);
    }
}
