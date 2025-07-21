package androidx.compose.ui.semantics;

import defpackage.bj7;
import defpackage.c01;
import defpackage.cj7;
import defpackage.ov4;
import defpackage.ss2;
import defpackage.zq3;

/* loaded from: classes.dex */
public final class ClearAndSetSemanticsElement extends ov4 implements cj7 {
    private final ss2 b;

    public ClearAndSetSemanticsElement(ss2 ss2Var) {
        this.b = ss2Var;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ClearAndSetSemanticsElement) && zq3.c(this.b, ((ClearAndSetSemanticsElement) obj).b);
    }

    @Override // defpackage.ov4
    public int hashCode() {
        return this.b.hashCode();
    }

    @Override // defpackage.cj7
    public bj7 s() {
        bj7 bj7Var = new bj7();
        bj7Var.w(false);
        bj7Var.v(true);
        this.b.invoke(bj7Var);
        return bj7Var;
    }

    @Override // defpackage.ov4
    /* renamed from: t, reason: merged with bridge method [inline-methods] */
    public c01 l() {
        return new c01(false, true, this.b);
    }

    public String toString() {
        return "ClearAndSetSemanticsElement(properties=" + this.b + ')';
    }

    @Override // defpackage.ov4
    /* renamed from: v, reason: merged with bridge method [inline-methods] */
    public void r(c01 c01Var) {
        c01Var.f2(this.b);
    }
}
