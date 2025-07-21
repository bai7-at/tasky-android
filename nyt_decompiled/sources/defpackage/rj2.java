package defpackage;

import androidx.compose.foundation.layout.o;
import androidx.compose.ui.unit.LayoutDirection;

/* loaded from: classes.dex */
final class rj2 implements o {
    private final int b;
    private final int c;
    private final int d;
    private final int e;

    public rj2(int i, int i2, int i3, int i4) {
        this.b = i;
        this.c = i2;
        this.d = i3;
        this.e = i4;
    }

    @Override // androidx.compose.foundation.layout.o
    public int a(fm1 fm1Var) {
        return this.c;
    }

    @Override // androidx.compose.foundation.layout.o
    public int b(fm1 fm1Var, LayoutDirection layoutDirection) {
        return this.b;
    }

    @Override // androidx.compose.foundation.layout.o
    public int c(fm1 fm1Var) {
        return this.e;
    }

    @Override // androidx.compose.foundation.layout.o
    public int d(fm1 fm1Var, LayoutDirection layoutDirection) {
        return this.d;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof rj2)) {
            return false;
        }
        rj2 rj2Var = (rj2) obj;
        return this.b == rj2Var.b && this.c == rj2Var.c && this.d == rj2Var.d && this.e == rj2Var.e;
    }

    public int hashCode() {
        return (((((this.b * 31) + this.c) * 31) + this.d) * 31) + this.e;
    }

    public String toString() {
        return "Insets(left=" + this.b + ", top=" + this.c + ", right=" + this.d + ", bottom=" + this.e + ')';
    }
}
