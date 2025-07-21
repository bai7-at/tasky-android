package defpackage;

import androidx.compose.foundation.layout.o;
import androidx.compose.ui.unit.LayoutDirection;

/* loaded from: classes.dex */
final class uw8 implements o {
    private final o b;
    private final o c;

    public uw8(o oVar, o oVar2) {
        this.b = oVar;
        this.c = oVar2;
    }

    @Override // androidx.compose.foundation.layout.o
    public int a(fm1 fm1Var) {
        return Math.max(this.b.a(fm1Var), this.c.a(fm1Var));
    }

    @Override // androidx.compose.foundation.layout.o
    public int b(fm1 fm1Var, LayoutDirection layoutDirection) {
        return Math.max(this.b.b(fm1Var, layoutDirection), this.c.b(fm1Var, layoutDirection));
    }

    @Override // androidx.compose.foundation.layout.o
    public int c(fm1 fm1Var) {
        return Math.max(this.b.c(fm1Var), this.c.c(fm1Var));
    }

    @Override // androidx.compose.foundation.layout.o
    public int d(fm1 fm1Var, LayoutDirection layoutDirection) {
        return Math.max(this.b.d(fm1Var, layoutDirection), this.c.d(fm1Var, layoutDirection));
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof uw8)) {
            return false;
        }
        uw8 uw8Var = (uw8) obj;
        return zq3.c(uw8Var.b, this.b) && zq3.c(uw8Var.c, this.c);
    }

    public int hashCode() {
        return this.b.hashCode() + (this.c.hashCode() * 31);
    }

    public String toString() {
        return '(' + this.b + " ∪ " + this.c + ')';
    }
}
