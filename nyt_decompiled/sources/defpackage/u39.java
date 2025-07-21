package defpackage;

import androidx.compose.foundation.layout.o;
import androidx.compose.runtime.b0;
import androidx.compose.ui.unit.LayoutDirection;

/* loaded from: classes.dex */
public final class u39 implements o {
    private final String b;
    private final sy4 c;

    public u39(ll3 ll3Var, String str) {
        this.b = str;
        this.c = b0.e(ll3Var, null, 2, null);
    }

    @Override // androidx.compose.foundation.layout.o
    public int a(fm1 fm1Var) {
        return e().d();
    }

    @Override // androidx.compose.foundation.layout.o
    public int b(fm1 fm1Var, LayoutDirection layoutDirection) {
        return e().b();
    }

    @Override // androidx.compose.foundation.layout.o
    public int c(fm1 fm1Var) {
        return e().a();
    }

    @Override // androidx.compose.foundation.layout.o
    public int d(fm1 fm1Var, LayoutDirection layoutDirection) {
        return e().c();
    }

    public final ll3 e() {
        return (ll3) this.c.getValue();
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof u39) {
            return zq3.c(e(), ((u39) obj).e());
        }
        return false;
    }

    public final void f(ll3 ll3Var) {
        this.c.setValue(ll3Var);
    }

    public int hashCode() {
        return this.b.hashCode();
    }

    public String toString() {
        return this.b + "(left=" + e().b() + ", top=" + e().d() + ", right=" + e().c() + ", bottom=" + e().a() + ')';
    }
}
