package androidx.compose.foundation;

import defpackage.ov4;
import defpackage.zq3;

/* loaded from: classes.dex */
public final class ScrollingLayoutElement extends ov4 {
    private final ScrollState b;
    private final boolean c;
    private final boolean d;

    public ScrollingLayoutElement(ScrollState scrollState, boolean z, boolean z2) {
        this.b = scrollState;
        this.c = z;
        this.d = z2;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof ScrollingLayoutElement)) {
            return false;
        }
        ScrollingLayoutElement scrollingLayoutElement = (ScrollingLayoutElement) obj;
        return zq3.c(this.b, scrollingLayoutElement.b) && this.c == scrollingLayoutElement.c && this.d == scrollingLayoutElement.d;
    }

    @Override // defpackage.ov4
    public int hashCode() {
        return (((this.b.hashCode() * 31) + Boolean.hashCode(this.c)) * 31) + Boolean.hashCode(this.d);
    }

    @Override // defpackage.ov4
    /* renamed from: t, reason: merged with bridge method [inline-methods] */
    public ScrollingLayoutNode l() {
        return new ScrollingLayoutNode(this.b, this.c, this.d);
    }

    @Override // defpackage.ov4
    /* renamed from: v, reason: merged with bridge method [inline-methods] */
    public void r(ScrollingLayoutNode scrollingLayoutNode) {
        scrollingLayoutNode.i2(this.b);
        scrollingLayoutNode.h2(this.c);
        scrollingLayoutNode.j2(this.d);
    }
}
