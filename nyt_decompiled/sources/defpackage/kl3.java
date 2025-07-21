package defpackage;

import androidx.compose.foundation.layout.o;
import androidx.compose.ui.unit.LayoutDirection;

/* loaded from: classes.dex */
final class kl3 implements ym5 {
    private final o a;
    private final fm1 b;

    public kl3(o oVar, fm1 fm1Var) {
        this.a = oVar;
        this.b = fm1Var;
    }

    @Override // defpackage.ym5
    public float a() {
        fm1 fm1Var = this.b;
        return fm1Var.v(this.a.c(fm1Var));
    }

    @Override // defpackage.ym5
    public float b(LayoutDirection layoutDirection) {
        fm1 fm1Var = this.b;
        return fm1Var.v(this.a.b(fm1Var, layoutDirection));
    }

    @Override // defpackage.ym5
    public float c(LayoutDirection layoutDirection) {
        fm1 fm1Var = this.b;
        return fm1Var.v(this.a.d(fm1Var, layoutDirection));
    }

    @Override // defpackage.ym5
    public float d() {
        fm1 fm1Var = this.b;
        return fm1Var.v(this.a.a(fm1Var));
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof kl3)) {
            return false;
        }
        kl3 kl3Var = (kl3) obj;
        return zq3.c(this.a, kl3Var.a) && zq3.c(this.b, kl3Var.b);
    }

    public int hashCode() {
        return (this.a.hashCode() * 31) + this.b.hashCode();
    }

    public String toString() {
        return "InsetsPaddingValues(insets=" + this.a + ", density=" + this.b + ')';
    }
}
