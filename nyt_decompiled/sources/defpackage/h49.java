package defpackage;

import android.graphics.drawable.Drawable;

/* loaded from: classes4.dex */
public final class h49 {
    private Integer a;
    private Integer b;
    private Integer c;
    private Integer d;
    private Drawable e;
    private Drawable f;
    private Drawable g;
    private Drawable h;
    private boolean i;
    private CharSequence j;
    private final Integer k;
    private final Integer l;
    private final Integer m;
    private Integer n;
    private Integer o;
    private Integer p;
    private Integer q;
    private Integer r;

    public h49(Integer num, Integer num2, Integer num3, Integer num4, Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4, boolean z, CharSequence charSequence, Integer num5, Integer num6, Integer num7, Integer num8, Integer num9, Integer num10, Integer num11, Integer num12) {
        zq3.h(charSequence, "contentDescription");
        this.a = num;
        this.b = num2;
        this.c = num3;
        this.d = num4;
        this.e = drawable;
        this.f = drawable2;
        this.g = drawable3;
        this.h = drawable4;
        this.i = z;
        this.j = charSequence;
        this.k = num5;
        this.l = num6;
        this.m = num7;
        this.n = num8;
        this.o = num9;
        this.p = num10;
        this.q = num11;
        this.r = num12;
    }

    public final void A(boolean z) {
        this.i = z;
    }

    public final Integer a() {
        return this.k;
    }

    public final Integer b() {
        return this.n;
    }

    public final CharSequence c() {
        return this.j;
    }

    public final Drawable d() {
        return this.g;
    }

    public final Integer e() {
        return this.c;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h49)) {
            return false;
        }
        h49 h49Var = (h49) obj;
        return zq3.c(this.a, h49Var.a) && zq3.c(this.b, h49Var.b) && zq3.c(this.c, h49Var.c) && zq3.c(this.d, h49Var.d) && zq3.c(this.e, h49Var.e) && zq3.c(this.f, h49Var.f) && zq3.c(this.g, h49Var.g) && zq3.c(this.h, h49Var.h) && this.i == h49Var.i && zq3.c(this.j, h49Var.j) && zq3.c(this.k, h49Var.k) && zq3.c(this.l, h49Var.l) && zq3.c(this.m, h49Var.m) && zq3.c(this.n, h49Var.n) && zq3.c(this.o, h49Var.o) && zq3.c(this.p, h49Var.p) && zq3.c(this.q, h49Var.q) && zq3.c(this.r, h49Var.r);
    }

    public final Drawable f() {
        return this.f;
    }

    public final Integer g() {
        return this.b;
    }

    public final Drawable h() {
        return this.e;
    }

    public int hashCode() {
        Integer num = this.a;
        int hashCode = (num == null ? 0 : num.hashCode()) * 31;
        Integer num2 = this.b;
        int hashCode2 = (hashCode + (num2 == null ? 0 : num2.hashCode())) * 31;
        Integer num3 = this.c;
        int hashCode3 = (hashCode2 + (num3 == null ? 0 : num3.hashCode())) * 31;
        Integer num4 = this.d;
        int hashCode4 = (hashCode3 + (num4 == null ? 0 : num4.hashCode())) * 31;
        Drawable drawable = this.e;
        int hashCode5 = (hashCode4 + (drawable == null ? 0 : drawable.hashCode())) * 31;
        Drawable drawable2 = this.f;
        int hashCode6 = (hashCode5 + (drawable2 == null ? 0 : drawable2.hashCode())) * 31;
        Drawable drawable3 = this.g;
        int hashCode7 = (hashCode6 + (drawable3 == null ? 0 : drawable3.hashCode())) * 31;
        Drawable drawable4 = this.h;
        int hashCode8 = (((((hashCode7 + (drawable4 == null ? 0 : drawable4.hashCode())) * 31) + Boolean.hashCode(this.i)) * 31) + this.j.hashCode()) * 31;
        Integer num5 = this.k;
        int hashCode9 = (hashCode8 + (num5 == null ? 0 : num5.hashCode())) * 31;
        Integer num6 = this.l;
        int hashCode10 = (hashCode9 + (num6 == null ? 0 : num6.hashCode())) * 31;
        Integer num7 = this.m;
        int hashCode11 = (hashCode10 + (num7 == null ? 0 : num7.hashCode())) * 31;
        Integer num8 = this.n;
        int hashCode12 = (hashCode11 + (num8 == null ? 0 : num8.hashCode())) * 31;
        Integer num9 = this.o;
        int hashCode13 = (hashCode12 + (num9 == null ? 0 : num9.hashCode())) * 31;
        Integer num10 = this.p;
        int hashCode14 = (hashCode13 + (num10 == null ? 0 : num10.hashCode())) * 31;
        Integer num11 = this.q;
        int hashCode15 = (hashCode14 + (num11 == null ? 0 : num11.hashCode())) * 31;
        Integer num12 = this.r;
        return hashCode15 + (num12 != null ? num12.hashCode() : 0);
    }

    public final Integer i() {
        return this.a;
    }

    public final Drawable j() {
        return this.h;
    }

    public final Integer k() {
        return this.d;
    }

    public final Integer l() {
        return this.q;
    }

    public final Integer m() {
        return this.m;
    }

    public final Integer n() {
        return this.l;
    }

    public final Integer o() {
        return this.r;
    }

    public final Integer p() {
        return this.o;
    }

    public final Integer q() {
        return this.p;
    }

    public final boolean r() {
        return this.i;
    }

    public final void s(Drawable drawable) {
        this.g = drawable;
    }

    public final void t(Integer num) {
        this.c = num;
    }

    public String toString() {
        Integer num = this.a;
        Integer num2 = this.b;
        Integer num3 = this.c;
        Integer num4 = this.d;
        Drawable drawable = this.e;
        Drawable drawable2 = this.f;
        Drawable drawable3 = this.g;
        Drawable drawable4 = this.h;
        boolean z = this.i;
        CharSequence charSequence = this.j;
        return "VectorTextViewParams(drawableStartRes=" + num + ", drawableEndRes=" + num2 + ", drawableBottomRes=" + num3 + ", drawableTopRes=" + num4 + ", drawableStart=" + drawable + ", drawableEnd=" + drawable2 + ", drawableBottom=" + drawable3 + ", drawableTop=" + drawable4 + ", isRtlLayout=" + z + ", contentDescription=" + ((Object) charSequence) + ", compoundDrawablePadding=" + this.k + ", iconWidth=" + this.l + ", iconHeight=" + this.m + ", compoundDrawablePaddingRes=" + this.n + ", tintColor=" + this.o + ", widthRes=" + this.p + ", heightRes=" + this.q + ", squareSizeRes=" + this.r + ")";
    }

    public final void u(Drawable drawable) {
        this.f = drawable;
    }

    public final void v(Integer num) {
        this.b = num;
    }

    public final void w(Drawable drawable) {
        this.e = drawable;
    }

    public final void x(Integer num) {
        this.a = num;
    }

    public final void y(Drawable drawable) {
        this.h = drawable;
    }

    public final void z(Integer num) {
        this.d = num;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public /* synthetic */ h49(java.lang.Integer r20, java.lang.Integer r21, java.lang.Integer r22, java.lang.Integer r23, android.graphics.drawable.Drawable r24, android.graphics.drawable.Drawable r25, android.graphics.drawable.Drawable r26, android.graphics.drawable.Drawable r27, boolean r28, java.lang.CharSequence r29, java.lang.Integer r30, java.lang.Integer r31, java.lang.Integer r32, java.lang.Integer r33, java.lang.Integer r34, java.lang.Integer r35, java.lang.Integer r36, java.lang.Integer r37, int r38, kotlin.jvm.internal.DefaultConstructorMarker r39) {
        /*
            Method dump skipped, instructions count: 198
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.h49.<init>(java.lang.Integer, java.lang.Integer, java.lang.Integer, java.lang.Integer, android.graphics.drawable.Drawable, android.graphics.drawable.Drawable, android.graphics.drawable.Drawable, android.graphics.drawable.Drawable, boolean, java.lang.CharSequence, java.lang.Integer, java.lang.Integer, java.lang.Integer, java.lang.Integer, java.lang.Integer, java.lang.Integer, java.lang.Integer, java.lang.Integer, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
    }
}
