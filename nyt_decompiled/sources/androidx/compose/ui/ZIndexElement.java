package androidx.compose.ui;

import defpackage.ov4;

/* loaded from: classes.dex */
public final class ZIndexElement extends ov4 {
    private final float b;

    public ZIndexElement(float f) {
        this.b = f;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ZIndexElement) && Float.compare(this.b, ((ZIndexElement) obj).b) == 0;
    }

    @Override // defpackage.ov4
    public int hashCode() {
        return Float.hashCode(this.b);
    }

    @Override // defpackage.ov4
    /* renamed from: t, reason: merged with bridge method [inline-methods] */
    public ZIndexNode l() {
        return new ZIndexNode(this.b);
    }

    public String toString() {
        return "ZIndexElement(zIndex=" + this.b + ')';
    }

    @Override // defpackage.ov4
    /* renamed from: v, reason: merged with bridge method [inline-methods] */
    public void r(ZIndexNode zIndexNode) {
        zIndexNode.f2(this.b);
    }
}
