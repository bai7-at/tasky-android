package androidx.compose.foundation.lazy;

import androidx.compose.ui.Modifier;
import defpackage.cy4;
import defpackage.h04;
import defpackage.ow7;
import defpackage.ph2;

/* loaded from: classes.dex */
public final class a implements h04 {
    private cy4 a = ow7.a(Integer.MAX_VALUE);
    private cy4 b = ow7.a(Integer.MAX_VALUE);

    @Override // defpackage.h04
    public Modifier b(Modifier modifier, ph2 ph2Var) {
        return b.a(modifier, null, ph2Var);
    }

    @Override // defpackage.h04
    public Modifier c(Modifier modifier, float f) {
        return modifier.h(new ParentSizeElement(f, null, this.b, "fillParentMaxHeight", 2, null));
    }

    @Override // defpackage.h04
    public Modifier e(Modifier modifier, float f) {
        return modifier.h(new ParentSizeElement(f, this.a, null, "fillParentMaxWidth", 4, null));
    }

    public final void g(int i, int i2) {
        this.a.f(i);
        this.b.f(i2);
    }
}
