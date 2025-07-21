package defpackage;

import androidx.compose.foundation.layout.o;
import androidx.compose.ui.unit.LayoutDirection;

/* loaded from: classes.dex */
final class i62 implements o {
    private final o b;
    private final o c;

    public i62(o oVar, o oVar2) {
        this.b = oVar;
        this.c = oVar2;
    }

    @Override // androidx.compose.foundation.layout.o
    public int a(fm1 fm1Var) {
        return uo6.d(this.b.a(fm1Var) - this.c.a(fm1Var), 0);
    }

    @Override // androidx.compose.foundation.layout.o
    public int b(fm1 fm1Var, LayoutDirection layoutDirection) {
        return uo6.d(this.b.b(fm1Var, layoutDirection) - this.c.b(fm1Var, layoutDirection), 0);
    }

    @Override // androidx.compose.foundation.layout.o
    public int c(fm1 fm1Var) {
        return uo6.d(this.b.c(fm1Var) - this.c.c(fm1Var), 0);
    }

    @Override // androidx.compose.foundation.layout.o
    public int d(fm1 fm1Var, LayoutDirection layoutDirection) {
        return uo6.d(this.b.d(fm1Var, layoutDirection) - this.c.d(fm1Var, layoutDirection), 0);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof i62)) {
            return false;
        }
        i62 i62Var = (i62) obj;
        return zq3.c(i62Var.b, this.b) && zq3.c(i62Var.c, this.c);
    }

    public int hashCode() {
        return (this.b.hashCode() * 31) + this.c.hashCode();
    }

    public String toString() {
        return '(' + this.b + " - " + this.c + ')';
    }
}
