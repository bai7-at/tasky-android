package androidx.compose.ui.layout;

import defpackage.ov4;
import defpackage.ss2;
import defpackage.zq3;

/* loaded from: classes.dex */
final class OnGloballyPositionedElement extends ov4 {
    private final ss2 b;

    public OnGloballyPositionedElement(ss2 ss2Var) {
        this.b = ss2Var;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof OnGloballyPositionedElement) {
            return zq3.c(this.b, ((OnGloballyPositionedElement) obj).b);
        }
        return false;
    }

    @Override // defpackage.ov4
    public int hashCode() {
        return this.b.hashCode();
    }

    @Override // defpackage.ov4
    /* renamed from: t, reason: merged with bridge method [inline-methods] */
    public i l() {
        return new i(this.b);
    }

    @Override // defpackage.ov4
    /* renamed from: v, reason: merged with bridge method [inline-methods] */
    public void r(i iVar) {
        iVar.e2(this.b);
    }
}
