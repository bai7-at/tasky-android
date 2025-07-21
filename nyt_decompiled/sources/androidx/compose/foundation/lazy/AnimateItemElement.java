package androidx.compose.foundation.lazy;

import defpackage.j04;
import defpackage.ov4;
import defpackage.ph2;
import defpackage.zq3;

/* loaded from: classes.dex */
final class AnimateItemElement extends ov4 {
    private final ph2 b;
    private final ph2 c;

    public AnimateItemElement(ph2 ph2Var, ph2 ph2Var2) {
        this.b = ph2Var;
        this.c = ph2Var2;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AnimateItemElement)) {
            return false;
        }
        AnimateItemElement animateItemElement = (AnimateItemElement) obj;
        return zq3.c(this.b, animateItemElement.b) && zq3.c(this.c, animateItemElement.c);
    }

    @Override // defpackage.ov4
    public int hashCode() {
        ph2 ph2Var = this.b;
        int hashCode = (ph2Var == null ? 0 : ph2Var.hashCode()) * 31;
        ph2 ph2Var2 = this.c;
        return hashCode + (ph2Var2 != null ? ph2Var2.hashCode() : 0);
    }

    @Override // defpackage.ov4
    /* renamed from: t, reason: merged with bridge method [inline-methods] */
    public j04 l() {
        return new j04(this.b, this.c);
    }

    public String toString() {
        return "AnimateItemElement(appearanceSpec=" + this.b + ", placementSpec=" + this.c + ')';
    }

    @Override // defpackage.ov4
    /* renamed from: v, reason: merged with bridge method [inline-methods] */
    public void r(j04 j04Var) {
        j04Var.g2(this.b);
        j04Var.h2(this.c);
    }
}
