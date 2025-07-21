package androidx.compose.ui.input.pointer;

import defpackage.ov4;
import defpackage.px5;
import defpackage.zq3;

/* loaded from: classes.dex */
public final class PointerHoverIconModifierElement extends ov4 {
    private final px5 b;
    private final boolean c;

    public PointerHoverIconModifierElement(px5 px5Var, boolean z) {
        this.b = px5Var;
        this.c = z;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PointerHoverIconModifierElement)) {
            return false;
        }
        PointerHoverIconModifierElement pointerHoverIconModifierElement = (PointerHoverIconModifierElement) obj;
        return zq3.c(this.b, pointerHoverIconModifierElement.b) && this.c == pointerHoverIconModifierElement.c;
    }

    @Override // defpackage.ov4
    public int hashCode() {
        return (this.b.hashCode() * 31) + Boolean.hashCode(this.c);
    }

    @Override // defpackage.ov4
    /* renamed from: t, reason: merged with bridge method [inline-methods] */
    public PointerHoverIconModifierNode l() {
        return new PointerHoverIconModifierNode(this.b, this.c);
    }

    public String toString() {
        return "PointerHoverIconModifierElement(icon=" + this.b + ", overrideDescendants=" + this.c + ')';
    }

    @Override // defpackage.ov4
    /* renamed from: v, reason: merged with bridge method [inline-methods] */
    public void r(PointerHoverIconModifierNode pointerHoverIconModifierNode) {
        pointerHoverIconModifierNode.p2(this.b);
        pointerHoverIconModifierNode.q2(this.c);
    }
}
