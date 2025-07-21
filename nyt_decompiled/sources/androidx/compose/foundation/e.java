package androidx.compose.foundation;

import androidx.compose.ui.platform.q;
import defpackage.bv1;
import defpackage.ss2;
import defpackage.yv0;
import defpackage.zq3;

/* loaded from: classes.dex */
final class e extends q implements bv1 {
    private final AndroidEdgeEffectOverscrollEffect c;

    public e(AndroidEdgeEffectOverscrollEffect androidEdgeEffectOverscrollEffect, ss2 ss2Var) {
        super(ss2Var);
        this.c = androidEdgeEffectOverscrollEffect;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof e) {
            return zq3.c(this.c, ((e) obj).c);
        }
        return false;
    }

    public int hashCode() {
        return this.c.hashCode();
    }

    public String toString() {
        return "DrawOverscrollModifier(overscrollEffect=" + this.c + ')';
    }

    @Override // defpackage.bv1
    public void w(yv0 yv0Var) {
        yv0Var.A1();
        this.c.w(yv0Var);
    }
}
