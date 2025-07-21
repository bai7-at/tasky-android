package defpackage;

import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes2.dex */
public final class nq1 {
    private final float a;
    private final float b;
    private final float c;
    private final float d;
    private final float e;
    private final float f;

    public /* synthetic */ nq1(float f, float f2, float f3, float f4, float f5, float f6, DefaultConstructorMarker defaultConstructorMarker) {
        this(f, f2, f3, f4, f5, f6);
    }

    public final float a() {
        return this.f;
    }

    public final float b() {
        return this.e;
    }

    public final float c() {
        return this.d;
    }

    public final float d() {
        return this.b;
    }

    public final float e() {
        return this.a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof nq1)) {
            return false;
        }
        nq1 nq1Var = (nq1) obj;
        return bu1.j(this.a, nq1Var.a) && bu1.j(this.b, nq1Var.b) && bu1.j(this.c, nq1Var.c) && bu1.j(this.d, nq1Var.d) && bu1.j(this.e, nq1Var.e) && bu1.j(this.f, nq1Var.f);
    }

    public int hashCode() {
        return (((((((((bu1.k(this.a) * 31) + bu1.k(this.b)) * 31) + bu1.k(this.c)) * 31) + bu1.k(this.d)) * 31) + bu1.k(this.e)) * 31) + bu1.k(this.f);
    }

    public String toString() {
        return "Dimens(defaultAdWidth=" + bu1.l(this.a) + ", defaultAdHeight=" + bu1.l(this.b) + ", adPadding=" + bu1.l(this.c) + ", adSlugTopPadding=" + bu1.l(this.d) + ", adSlugBottomPadding=" + bu1.l(this.e) + ", adBorderThickness=" + bu1.l(this.f) + ")";
    }

    private nq1(float f, float f2, float f3, float f4, float f5, float f6) {
        this.a = f;
        this.b = f2;
        this.c = f3;
        this.d = f4;
        this.e = f5;
        this.f = f6;
    }

    public /* synthetic */ nq1(float f, float f2, float f3, float f4, float f5, float f6, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? bu1.g(320) : f, (i & 2) != 0 ? bu1.g(250) : f2, (i & 4) != 0 ? bu1.g(32) : f3, (i & 8) != 0 ? bu1.g(16) : f4, (i & 16) != 0 ? bu1.g(12) : f5, (32 & i) != 0 ? bu1.g(1) : f6, null);
    }
}
