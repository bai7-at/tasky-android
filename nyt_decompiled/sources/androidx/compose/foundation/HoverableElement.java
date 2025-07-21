package androidx.compose.foundation;

import defpackage.dy4;
import defpackage.ov4;
import defpackage.zq3;

/* loaded from: classes.dex */
final class HoverableElement extends ov4 {
    private final dy4 b;

    public HoverableElement(dy4 dy4Var) {
        this.b = dy4Var;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof HoverableElement) && zq3.c(((HoverableElement) obj).b, this.b);
    }

    @Override // defpackage.ov4
    public int hashCode() {
        return this.b.hashCode() * 31;
    }

    @Override // defpackage.ov4
    /* renamed from: t, reason: merged with bridge method [inline-methods] */
    public HoverableNode l() {
        return new HoverableNode(this.b);
    }

    @Override // defpackage.ov4
    /* renamed from: v, reason: merged with bridge method [inline-methods] */
    public void r(HoverableNode hoverableNode) {
        hoverableNode.h2(this.b);
    }
}
