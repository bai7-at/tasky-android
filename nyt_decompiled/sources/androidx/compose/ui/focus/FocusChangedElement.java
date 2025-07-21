package androidx.compose.ui.focus;

import defpackage.ov4;
import defpackage.ss2;
import defpackage.zq3;

/* loaded from: classes.dex */
final class FocusChangedElement extends ov4 {
    private final ss2 b;

    public FocusChangedElement(ss2 ss2Var) {
        this.b = ss2Var;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof FocusChangedElement) && zq3.c(this.b, ((FocusChangedElement) obj).b);
    }

    @Override // defpackage.ov4
    public int hashCode() {
        return this.b.hashCode();
    }

    @Override // defpackage.ov4
    /* renamed from: t, reason: merged with bridge method [inline-methods] */
    public c l() {
        return new c(this.b);
    }

    public String toString() {
        return "FocusChangedElement(onFocusChanged=" + this.b + ')';
    }

    @Override // defpackage.ov4
    /* renamed from: v, reason: merged with bridge method [inline-methods] */
    public void r(c cVar) {
        cVar.e2(this.b);
    }
}
