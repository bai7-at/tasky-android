package androidx.compose.ui.draw;

import defpackage.ov4;
import defpackage.ss2;
import defpackage.wu1;
import defpackage.zq3;

/* loaded from: classes.dex */
final class DrawBehindElement extends ov4 {
    private final ss2 b;

    public DrawBehindElement(ss2 ss2Var) {
        this.b = ss2Var;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof DrawBehindElement) && zq3.c(this.b, ((DrawBehindElement) obj).b);
    }

    @Override // defpackage.ov4
    public int hashCode() {
        return this.b.hashCode();
    }

    @Override // defpackage.ov4
    /* renamed from: t, reason: merged with bridge method [inline-methods] */
    public wu1 l() {
        return new wu1(this.b);
    }

    public String toString() {
        return "DrawBehindElement(onDraw=" + this.b + ')';
    }

    @Override // defpackage.ov4
    /* renamed from: v, reason: merged with bridge method [inline-methods] */
    public void r(wu1 wu1Var) {
        wu1Var.e2(this.b);
    }
}
