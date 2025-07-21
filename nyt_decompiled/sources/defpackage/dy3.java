package defpackage;

import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes4.dex */
public final class dy3 {
    private final fy3 a;
    private final oh3 b;
    private final boolean c;
    private final String d;

    public dy3(fy3 fy3Var, oh3 oh3Var, boolean z, String str) {
        zq3.h(fy3Var, "layoutType");
        zq3.h(oh3Var, "products");
        zq3.h(str, "terms");
        this.a = fy3Var;
        this.b = oh3Var;
        this.c = z;
        this.d = str;
    }

    public static /* synthetic */ dy3 b(dy3 dy3Var, fy3 fy3Var, oh3 oh3Var, boolean z, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            fy3Var = dy3Var.a;
        }
        if ((i & 2) != 0) {
            oh3Var = dy3Var.b;
        }
        if ((i & 4) != 0) {
            z = dy3Var.c;
        }
        if ((i & 8) != 0) {
            str = dy3Var.d;
        }
        return dy3Var.a(fy3Var, oh3Var, z, str);
    }

    public final dy3 a(fy3 fy3Var, oh3 oh3Var, boolean z, String str) {
        zq3.h(fy3Var, "layoutType");
        zq3.h(oh3Var, "products");
        zq3.h(str, "terms");
        return new dy3(fy3Var, oh3Var, z, str);
    }

    public final fy3 c() {
        return this.a;
    }

    public final oh3 d() {
        return this.b;
    }

    public final boolean e() {
        return this.c;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dy3)) {
            return false;
        }
        dy3 dy3Var = (dy3) obj;
        return zq3.c(this.a, dy3Var.a) && zq3.c(this.b, dy3Var.b) && this.c == dy3Var.c && zq3.c(this.d, dy3Var.d);
    }

    public final String f() {
        return this.d;
    }

    public int hashCode() {
        return (((((this.a.hashCode() * 31) + this.b.hashCode()) * 31) + Boolean.hashCode(this.c)) * 31) + this.d.hashCode();
    }

    public String toString() {
        return "LandingPageConfig(layoutType=" + this.a + ", products=" + this.b + ", showLogin=" + this.c + ", terms=" + this.d + ")";
    }

    public /* synthetic */ dy3(fy3 fy3Var, oh3 oh3Var, boolean z, String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(fy3Var, oh3Var, (i & 4) != 0 ? false : z, str);
    }
}
