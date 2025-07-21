package androidx.compose.foundation.layout;

import defpackage.ov4;
import defpackage.ss2;
import defpackage.zq3;

/* loaded from: classes.dex */
final class OffsetPxElement extends ov4 {
    private final ss2 b;
    private final boolean c;
    private final ss2 d;

    public OffsetPxElement(ss2 ss2Var, boolean z, ss2 ss2Var2) {
        this.b = ss2Var;
        this.c = z;
        this.d = ss2Var2;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        OffsetPxElement offsetPxElement = obj instanceof OffsetPxElement ? (OffsetPxElement) obj : null;
        if (offsetPxElement == null) {
            return false;
        }
        return zq3.c(this.b, offsetPxElement.b) && this.c == offsetPxElement.c;
    }

    @Override // defpackage.ov4
    public int hashCode() {
        return (this.b.hashCode() * 31) + Boolean.hashCode(this.c);
    }

    @Override // defpackage.ov4
    /* renamed from: t, reason: merged with bridge method [inline-methods] */
    public OffsetPxNode l() {
        return new OffsetPxNode(this.b, this.c);
    }

    public String toString() {
        return "OffsetPxModifier(offset=" + this.b + ", rtlAware=" + this.c + ')';
    }

    @Override // defpackage.ov4
    /* renamed from: v, reason: merged with bridge method [inline-methods] */
    public void r(OffsetPxNode offsetPxNode) {
        offsetPxNode.g2(this.b);
        offsetPxNode.h2(this.c);
    }
}
