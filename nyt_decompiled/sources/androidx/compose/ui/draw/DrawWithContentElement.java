package androidx.compose.ui.draw;

import defpackage.ov4;
import defpackage.ss2;
import defpackage.zq3;

/* loaded from: classes.dex */
final class DrawWithContentElement extends ov4 {
    private final ss2 b;

    public DrawWithContentElement(ss2 ss2Var) {
        this.b = ss2Var;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof DrawWithContentElement) && zq3.c(this.b, ((DrawWithContentElement) obj).b);
    }

    @Override // defpackage.ov4
    public int hashCode() {
        return this.b.hashCode();
    }

    @Override // defpackage.ov4
    /* renamed from: t, reason: merged with bridge method [inline-methods] */
    public b l() {
        return new b(this.b);
    }

    public String toString() {
        return "DrawWithContentElement(onDraw=" + this.b + ')';
    }

    @Override // defpackage.ov4
    /* renamed from: v, reason: merged with bridge method [inline-methods] */
    public void r(b bVar) {
        bVar.e2(this.b);
    }
}
