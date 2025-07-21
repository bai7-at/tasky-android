package defpackage;

import androidx.compose.foundation.layout.o;
import androidx.compose.ui.unit.LayoutDirection;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes.dex */
final class pj2 implements o {
    private final float b;
    private final float c;
    private final float d;
    private final float e;

    public /* synthetic */ pj2(float f, float f2, float f3, float f4, DefaultConstructorMarker defaultConstructorMarker) {
        this(f, f2, f3, f4);
    }

    @Override // androidx.compose.foundation.layout.o
    public int a(fm1 fm1Var) {
        return fm1Var.l0(this.c);
    }

    @Override // androidx.compose.foundation.layout.o
    public int b(fm1 fm1Var, LayoutDirection layoutDirection) {
        return fm1Var.l0(this.b);
    }

    @Override // androidx.compose.foundation.layout.o
    public int c(fm1 fm1Var) {
        return fm1Var.l0(this.e);
    }

    @Override // androidx.compose.foundation.layout.o
    public int d(fm1 fm1Var, LayoutDirection layoutDirection) {
        return fm1Var.l0(this.d);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof pj2)) {
            return false;
        }
        pj2 pj2Var = (pj2) obj;
        return bu1.j(this.b, pj2Var.b) && bu1.j(this.c, pj2Var.c) && bu1.j(this.d, pj2Var.d) && bu1.j(this.e, pj2Var.e);
    }

    public int hashCode() {
        return (((((bu1.k(this.b) * 31) + bu1.k(this.c)) * 31) + bu1.k(this.d)) * 31) + bu1.k(this.e);
    }

    public String toString() {
        return "Insets(left=" + ((Object) bu1.l(this.b)) + ", top=" + ((Object) bu1.l(this.c)) + ", right=" + ((Object) bu1.l(this.d)) + ", bottom=" + ((Object) bu1.l(this.e)) + ')';
    }

    private pj2(float f, float f2, float f3, float f4) {
        this.b = f;
        this.c = f2;
        this.d = f3;
        this.e = f4;
    }
}
