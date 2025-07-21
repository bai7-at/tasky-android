package defpackage;

import androidx.compose.foundation.layout.o;
import androidx.compose.ui.unit.LayoutDirection;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes.dex */
final class o44 implements o {
    private final o b;
    private final int c;

    public /* synthetic */ o44(o oVar, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(oVar, i);
    }

    @Override // androidx.compose.foundation.layout.o
    public int a(fm1 fm1Var) {
        if (vh9.j(this.c, vh9.a.f())) {
            return this.b.a(fm1Var);
        }
        return 0;
    }

    @Override // androidx.compose.foundation.layout.o
    public int b(fm1 fm1Var, LayoutDirection layoutDirection) {
        if (vh9.j(this.c, layoutDirection == LayoutDirection.Ltr ? vh9.a.a() : vh9.a.b())) {
            return this.b.b(fm1Var, layoutDirection);
        }
        return 0;
    }

    @Override // androidx.compose.foundation.layout.o
    public int c(fm1 fm1Var) {
        if (vh9.j(this.c, vh9.a.e())) {
            return this.b.c(fm1Var);
        }
        return 0;
    }

    @Override // androidx.compose.foundation.layout.o
    public int d(fm1 fm1Var, LayoutDirection layoutDirection) {
        if (vh9.j(this.c, layoutDirection == LayoutDirection.Ltr ? vh9.a.c() : vh9.a.d())) {
            return this.b.d(fm1Var, layoutDirection);
        }
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof o44)) {
            return false;
        }
        o44 o44Var = (o44) obj;
        return zq3.c(this.b, o44Var.b) && vh9.i(this.c, o44Var.c);
    }

    public int hashCode() {
        return (this.b.hashCode() * 31) + vh9.k(this.c);
    }

    public String toString() {
        return '(' + this.b + " only " + ((Object) vh9.m(this.c)) + ')';
    }

    private o44(o oVar, int i) {
        this.b = oVar;
        this.c = i;
    }
}
