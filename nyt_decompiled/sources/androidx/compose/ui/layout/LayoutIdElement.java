package androidx.compose.ui.layout;

import defpackage.gz3;
import defpackage.ov4;
import defpackage.zq3;

/* loaded from: classes.dex */
final class LayoutIdElement extends ov4 {
    private final Object b;

    public LayoutIdElement(Object obj) {
        this.b = obj;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof LayoutIdElement) && zq3.c(this.b, ((LayoutIdElement) obj).b);
    }

    @Override // defpackage.ov4
    public int hashCode() {
        return this.b.hashCode();
    }

    @Override // defpackage.ov4
    /* renamed from: t, reason: merged with bridge method [inline-methods] */
    public gz3 l() {
        return new gz3(this.b);
    }

    public String toString() {
        return "LayoutIdElement(layoutId=" + this.b + ')';
    }

    @Override // defpackage.ov4
    /* renamed from: v, reason: merged with bridge method [inline-methods] */
    public void r(gz3 gz3Var) {
        gz3Var.e2(this.b);
    }
}
