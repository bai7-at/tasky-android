package androidx.compose.ui.layout;

import defpackage.it2;
import defpackage.ov4;
import defpackage.oz3;
import defpackage.zq3;

/* loaded from: classes.dex */
final class LayoutElement extends ov4 {
    private final it2 b;

    public LayoutElement(it2 it2Var) {
        this.b = it2Var;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof LayoutElement) && zq3.c(this.b, ((LayoutElement) obj).b);
    }

    @Override // defpackage.ov4
    public int hashCode() {
        return this.b.hashCode();
    }

    @Override // defpackage.ov4
    /* renamed from: t, reason: merged with bridge method [inline-methods] */
    public oz3 l() {
        return new oz3(this.b);
    }

    public String toString() {
        return "LayoutElement(measure=" + this.b + ')';
    }

    @Override // defpackage.ov4
    /* renamed from: v, reason: merged with bridge method [inline-methods] */
    public void r(oz3 oz3Var) {
        oz3Var.e2(this.b);
    }
}
