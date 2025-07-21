package androidx.compose.ui.input.nestedscroll;

import defpackage.d35;
import defpackage.ov4;
import defpackage.zq3;

/* loaded from: classes.dex */
final class NestedScrollElement extends ov4 {
    private final d35 b;
    private final NestedScrollDispatcher c;

    public NestedScrollElement(d35 d35Var, NestedScrollDispatcher nestedScrollDispatcher) {
        this.b = d35Var;
        this.c = nestedScrollDispatcher;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof NestedScrollElement)) {
            return false;
        }
        NestedScrollElement nestedScrollElement = (NestedScrollElement) obj;
        return zq3.c(nestedScrollElement.b, this.b) && zq3.c(nestedScrollElement.c, this.c);
    }

    @Override // defpackage.ov4
    public int hashCode() {
        int hashCode = this.b.hashCode() * 31;
        NestedScrollDispatcher nestedScrollDispatcher = this.c;
        return hashCode + (nestedScrollDispatcher != null ? nestedScrollDispatcher.hashCode() : 0);
    }

    @Override // defpackage.ov4
    /* renamed from: t, reason: merged with bridge method [inline-methods] */
    public NestedScrollNode l() {
        return new NestedScrollNode(this.b, this.c);
    }

    @Override // defpackage.ov4
    /* renamed from: v, reason: merged with bridge method [inline-methods] */
    public void r(NestedScrollNode nestedScrollNode) {
        nestedScrollNode.l2(this.b, this.c);
    }
}
