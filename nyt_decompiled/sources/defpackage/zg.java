package defpackage;

import androidx.compose.foundation.layout.o;
import androidx.compose.runtime.b0;
import androidx.compose.ui.unit.LayoutDirection;

/* loaded from: classes.dex */
public final class zg implements o {
    private final int b;
    private final String c;
    private final sy4 d = b0.e(jl3.e, null, 2, null);
    private final sy4 e = b0.e(Boolean.TRUE, null, 2, null);

    public zg(int i, String str) {
        this.b = i;
        this.c = str;
    }

    private final void g(boolean z) {
        this.e.setValue(Boolean.valueOf(z));
    }

    @Override // androidx.compose.foundation.layout.o
    public int a(fm1 fm1Var) {
        return e().b;
    }

    @Override // androidx.compose.foundation.layout.o
    public int b(fm1 fm1Var, LayoutDirection layoutDirection) {
        return e().a;
    }

    @Override // androidx.compose.foundation.layout.o
    public int c(fm1 fm1Var) {
        return e().d;
    }

    @Override // androidx.compose.foundation.layout.o
    public int d(fm1 fm1Var, LayoutDirection layoutDirection) {
        return e().c;
    }

    public final jl3 e() {
        return (jl3) this.d.getValue();
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof zg) && this.b == ((zg) obj).b;
    }

    public final void f(jl3 jl3Var) {
        this.d.setValue(jl3Var);
    }

    public final void h(ch9 ch9Var, int i) {
        if (i == 0 || (i & this.b) != 0) {
            f(ch9Var.f(this.b));
            g(ch9Var.p(this.b));
        }
    }

    public int hashCode() {
        return this.b;
    }

    public String toString() {
        return this.c + '(' + e().a + ", " + e().b + ", " + e().c + ", " + e().d + ')';
    }
}
