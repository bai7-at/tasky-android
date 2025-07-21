package androidx.compose.foundation.relocation;

import defpackage.ov4;
import defpackage.qc0;
import defpackage.zq3;

/* loaded from: classes.dex */
final class BringIntoViewRequesterElement extends ov4 {
    private final qc0 b;

    public BringIntoViewRequesterElement(qc0 qc0Var) {
        this.b = qc0Var;
    }

    public boolean equals(Object obj) {
        return this == obj || ((obj instanceof BringIntoViewRequesterElement) && zq3.c(this.b, ((BringIntoViewRequesterElement) obj).b));
    }

    @Override // defpackage.ov4
    public int hashCode() {
        return this.b.hashCode();
    }

    @Override // defpackage.ov4
    /* renamed from: t, reason: merged with bridge method [inline-methods] */
    public BringIntoViewRequesterNode l() {
        return new BringIntoViewRequesterNode(this.b);
    }

    @Override // defpackage.ov4
    /* renamed from: v, reason: merged with bridge method [inline-methods] */
    public void r(BringIntoViewRequesterNode bringIntoViewRequesterNode) {
        bringIntoViewRequesterNode.j2(this.b);
    }
}
