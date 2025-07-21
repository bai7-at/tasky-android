package androidx.compose.animation;

import defpackage.gt2;
import defpackage.ov4;
import defpackage.ph2;
import defpackage.zq3;

/* loaded from: classes.dex */
final class SizeAnimationModifierElement extends ov4 {
    private final ph2 b;
    private final gt2 c;

    public SizeAnimationModifierElement(ph2 ph2Var, gt2 gt2Var) {
        this.b = ph2Var;
        this.c = gt2Var;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SizeAnimationModifierElement)) {
            return false;
        }
        SizeAnimationModifierElement sizeAnimationModifierElement = (SizeAnimationModifierElement) obj;
        return zq3.c(this.b, sizeAnimationModifierElement.b) && zq3.c(this.c, sizeAnimationModifierElement.c);
    }

    @Override // defpackage.ov4
    public int hashCode() {
        int hashCode = this.b.hashCode() * 31;
        gt2 gt2Var = this.c;
        return hashCode + (gt2Var == null ? 0 : gt2Var.hashCode());
    }

    @Override // defpackage.ov4
    /* renamed from: t, reason: merged with bridge method [inline-methods] */
    public SizeAnimationModifierNode l() {
        return new SizeAnimationModifierNode(this.b, this.c);
    }

    public String toString() {
        return "SizeAnimationModifierElement(animationSpec=" + this.b + ", finishedListener=" + this.c + ')';
    }

    @Override // defpackage.ov4
    /* renamed from: v, reason: merged with bridge method [inline-methods] */
    public void r(SizeAnimationModifierNode sizeAnimationModifierNode) {
        sizeAnimationModifierNode.j2(this.b);
        sizeAnimationModifierNode.k2(this.c);
    }
}
