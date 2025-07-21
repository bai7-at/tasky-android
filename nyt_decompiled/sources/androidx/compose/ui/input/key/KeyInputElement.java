package androidx.compose.ui.input.key;

import defpackage.ov4;
import defpackage.ss2;
import defpackage.zq3;

/* loaded from: classes.dex */
final class KeyInputElement extends ov4 {
    private final ss2 b;
    private final ss2 c;

    public KeyInputElement(ss2 ss2Var, ss2 ss2Var2) {
        this.b = ss2Var;
        this.c = ss2Var2;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof KeyInputElement)) {
            return false;
        }
        KeyInputElement keyInputElement = (KeyInputElement) obj;
        return zq3.c(this.b, keyInputElement.b) && zq3.c(this.c, keyInputElement.c);
    }

    @Override // defpackage.ov4
    public int hashCode() {
        ss2 ss2Var = this.b;
        int hashCode = (ss2Var == null ? 0 : ss2Var.hashCode()) * 31;
        ss2 ss2Var2 = this.c;
        return hashCode + (ss2Var2 != null ? ss2Var2.hashCode() : 0);
    }

    @Override // defpackage.ov4
    /* renamed from: t, reason: merged with bridge method [inline-methods] */
    public b l() {
        return new b(this.b, this.c);
    }

    public String toString() {
        return "KeyInputElement(onKeyEvent=" + this.b + ", onPreKeyEvent=" + this.c + ')';
    }

    @Override // defpackage.ov4
    /* renamed from: v, reason: merged with bridge method [inline-methods] */
    public void r(b bVar) {
        bVar.e2(this.b);
        bVar.f2(this.c);
    }
}
