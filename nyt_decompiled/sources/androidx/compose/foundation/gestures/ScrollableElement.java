package androidx.compose.foundation.gestures;

import defpackage.dy4;
import defpackage.hm5;
import defpackage.ov4;
import defpackage.qk2;
import defpackage.tc7;
import defpackage.uc0;
import defpackage.zq3;

/* loaded from: classes.dex */
final class ScrollableElement extends ov4 {
    private final tc7 b;
    private final Orientation c;
    private final hm5 d;
    private final boolean e;
    private final boolean f;
    private final qk2 g;
    private final dy4 h;
    private final uc0 i;

    public ScrollableElement(tc7 tc7Var, Orientation orientation, hm5 hm5Var, boolean z, boolean z2, qk2 qk2Var, dy4 dy4Var, uc0 uc0Var) {
        this.b = tc7Var;
        this.c = orientation;
        this.d = hm5Var;
        this.e = z;
        this.f = z2;
        this.g = qk2Var;
        this.h = dy4Var;
        this.i = uc0Var;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ScrollableElement)) {
            return false;
        }
        ScrollableElement scrollableElement = (ScrollableElement) obj;
        return zq3.c(this.b, scrollableElement.b) && this.c == scrollableElement.c && zq3.c(this.d, scrollableElement.d) && this.e == scrollableElement.e && this.f == scrollableElement.f && zq3.c(this.g, scrollableElement.g) && zq3.c(this.h, scrollableElement.h) && zq3.c(this.i, scrollableElement.i);
    }

    @Override // defpackage.ov4
    public int hashCode() {
        int hashCode = ((this.b.hashCode() * 31) + this.c.hashCode()) * 31;
        hm5 hm5Var = this.d;
        int hashCode2 = (((((hashCode + (hm5Var != null ? hm5Var.hashCode() : 0)) * 31) + Boolean.hashCode(this.e)) * 31) + Boolean.hashCode(this.f)) * 31;
        qk2 qk2Var = this.g;
        int hashCode3 = (hashCode2 + (qk2Var != null ? qk2Var.hashCode() : 0)) * 31;
        dy4 dy4Var = this.h;
        return ((hashCode3 + (dy4Var != null ? dy4Var.hashCode() : 0)) * 31) + this.i.hashCode();
    }

    @Override // defpackage.ov4
    /* renamed from: t, reason: merged with bridge method [inline-methods] */
    public ScrollableNode l() {
        return new ScrollableNode(this.b, this.c, this.d, this.e, this.f, this.g, this.h, this.i);
    }

    @Override // defpackage.ov4
    /* renamed from: v, reason: merged with bridge method [inline-methods] */
    public void r(ScrollableNode scrollableNode) {
        scrollableNode.k2(this.b, this.c, this.d, this.e, this.f, this.g, this.h, this.i);
    }
}
