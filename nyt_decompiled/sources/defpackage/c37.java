package defpackage;

import androidx.compose.ui.unit.LayoutDirection;
import defpackage.el5;

/* loaded from: classes.dex */
public final class c37 extends e01 {
    public c37(i01 i01Var, i01 i01Var2, i01 i01Var3, i01 i01Var4) {
        super(i01Var, i01Var2, i01Var3, i01Var4);
    }

    @Override // defpackage.e01
    public el5 e(long j, float f, float f2, float f3, float f4, LayoutDirection layoutDirection) {
        if (f + f2 + f3 + f4 == 0.0f) {
            return new el5.b(du7.c(j));
        }
        kt6 c = du7.c(j);
        LayoutDirection layoutDirection2 = LayoutDirection.Ltr;
        return new el5.c(b37.c(c, g01.b(layoutDirection == layoutDirection2 ? f : f2, 0.0f, 2, null), g01.b(layoutDirection == layoutDirection2 ? f2 : f, 0.0f, 2, null), g01.b(layoutDirection == layoutDirection2 ? f3 : f4, 0.0f, 2, null), g01.b(layoutDirection == layoutDirection2 ? f4 : f3, 0.0f, 2, null)));
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c37)) {
            return false;
        }
        c37 c37Var = (c37) obj;
        return zq3.c(i(), c37Var.i()) && zq3.c(h(), c37Var.h()) && zq3.c(f(), c37Var.f()) && zq3.c(g(), c37Var.g());
    }

    public int hashCode() {
        return (((((i().hashCode() * 31) + h().hashCode()) * 31) + f().hashCode()) * 31) + g().hashCode();
    }

    @Override // defpackage.e01
    /* renamed from: j, reason: merged with bridge method [inline-methods] */
    public c37 c(i01 i01Var, i01 i01Var2, i01 i01Var3, i01 i01Var4) {
        return new c37(i01Var, i01Var2, i01Var3, i01Var4);
    }

    public String toString() {
        return "RoundedCornerShape(topStart = " + i() + ", topEnd = " + h() + ", bottomEnd = " + f() + ", bottomStart = " + g() + ')';
    }
}
