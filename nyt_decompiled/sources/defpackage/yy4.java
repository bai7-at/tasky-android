package defpackage;

import androidx.compose.foundation.layout.o;
import androidx.compose.runtime.b0;
import androidx.compose.ui.unit.LayoutDirection;

/* loaded from: classes.dex */
public final class yy4 implements o {
    private final sy4 b;

    public yy4(o oVar) {
        this.b = b0.e(oVar, null, 2, null);
    }

    @Override // androidx.compose.foundation.layout.o
    public int a(fm1 fm1Var) {
        return e().a(fm1Var);
    }

    @Override // androidx.compose.foundation.layout.o
    public int b(fm1 fm1Var, LayoutDirection layoutDirection) {
        return e().b(fm1Var, layoutDirection);
    }

    @Override // androidx.compose.foundation.layout.o
    public int c(fm1 fm1Var) {
        return e().c(fm1Var);
    }

    @Override // androidx.compose.foundation.layout.o
    public int d(fm1 fm1Var, LayoutDirection layoutDirection) {
        return e().d(fm1Var, layoutDirection);
    }

    public final o e() {
        return (o) this.b.getValue();
    }

    public final void f(o oVar) {
        this.b.setValue(oVar);
    }
}
