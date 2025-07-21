package androidx.compose.ui.semantics;

import defpackage.bj7;
import defpackage.c01;
import defpackage.cj7;
import defpackage.ov4;
import defpackage.ss2;
import defpackage.zq3;

/* loaded from: classes.dex */
public final class AppendedSemanticsElement extends ov4 implements cj7 {
    private final boolean b;
    private final ss2 c;

    public AppendedSemanticsElement(boolean z, ss2 ss2Var) {
        this.b = z;
        this.c = ss2Var;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AppendedSemanticsElement)) {
            return false;
        }
        AppendedSemanticsElement appendedSemanticsElement = (AppendedSemanticsElement) obj;
        return this.b == appendedSemanticsElement.b && zq3.c(this.c, appendedSemanticsElement.c);
    }

    @Override // defpackage.ov4
    public int hashCode() {
        return (Boolean.hashCode(this.b) * 31) + this.c.hashCode();
    }

    @Override // defpackage.cj7
    public bj7 s() {
        bj7 bj7Var = new bj7();
        bj7Var.w(this.b);
        this.c.invoke(bj7Var);
        return bj7Var;
    }

    @Override // defpackage.ov4
    /* renamed from: t, reason: merged with bridge method [inline-methods] */
    public c01 l() {
        return new c01(this.b, false, this.c);
    }

    public String toString() {
        return "AppendedSemanticsElement(mergeDescendants=" + this.b + ", properties=" + this.c + ')';
    }

    @Override // defpackage.ov4
    /* renamed from: v, reason: merged with bridge method [inline-methods] */
    public void r(c01 c01Var) {
        c01Var.e2(this.b);
        c01Var.f2(this.c);
    }
}
