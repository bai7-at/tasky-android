package defpackage;

import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes4.dex */
public final class w43 {
    private final ro0 a;
    private final long b;
    private final long c;
    private final long d;
    private final x43 e;
    private final x43 f;
    private final x43 g;
    private final long h;
    private final long i;
    private final long j;
    private final long k;
    private final long l;
    private final long m;

    public /* synthetic */ w43(ro0 ro0Var, long j, long j2, long j3, x43 x43Var, x43 x43Var2, x43 x43Var3, long j4, long j5, long j6, long j7, long j8, long j9, DefaultConstructorMarker defaultConstructorMarker) {
        this(ro0Var, j, j2, j3, x43Var, x43Var2, x43Var3, j4, j5, j6, j7, j8, j9);
    }

    public final long a() {
        return this.b;
    }

    public final long b() {
        return this.c;
    }

    public final long c() {
        return this.d;
    }

    public final x43 d() {
        return this.f;
    }

    public final x43 e() {
        return this.g;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof w43)) {
            return false;
        }
        w43 w43Var = (w43) obj;
        return zq3.c(this.a, w43Var.a) && nn0.t(this.b, w43Var.b) && nn0.t(this.c, w43Var.c) && nn0.t(this.d, w43Var.d) && zq3.c(this.e, w43Var.e) && zq3.c(this.f, w43Var.f) && zq3.c(this.g, w43Var.g) && nn0.t(this.h, w43Var.h) && nn0.t(this.i, w43Var.i) && nn0.t(this.j, w43Var.j) && nn0.t(this.k, w43Var.k) && nn0.t(this.l, w43Var.l) && nn0.t(this.m, w43Var.m);
    }

    public final x43 f() {
        return this.e;
    }

    public final long g() {
        return this.h;
    }

    public final ro0 h() {
        return this.a;
    }

    public int hashCode() {
        return (((((((((((((((((((((((this.a.hashCode() * 31) + nn0.z(this.b)) * 31) + nn0.z(this.c)) * 31) + nn0.z(this.d)) * 31) + this.e.hashCode()) * 31) + this.f.hashCode()) * 31) + this.g.hashCode()) * 31) + nn0.z(this.h)) * 31) + nn0.z(this.i)) * 31) + nn0.z(this.j)) * 31) + nn0.z(this.k)) * 31) + nn0.z(this.l)) * 31) + nn0.z(this.m);
    }

    public final long i() {
        return this.k;
    }

    public final long j() {
        return this.l;
    }

    public final long k() {
        return this.m;
    }

    public final long l() {
        return this.i;
    }

    public String toString() {
        return "GrowthUIColorPalette(material=" + this.a + ", background=" + nn0.A(this.b) + ", content=" + nn0.A(this.c) + ", contentSecondary=" + nn0.A(this.d) + ", ctaInactive=" + this.e + ", ctaActive=" + this.f + ", ctaBadge=" + this.g + ", headerContent=" + nn0.A(this.h) + ", terms=" + nn0.A(this.i) + ", termsLinks=" + nn0.A(this.j) + ", shadow=" + nn0.A(this.k) + ", strokeSecondary=" + nn0.A(this.l) + ", strokeTertiary=" + nn0.A(this.m) + ")";
    }

    private w43(ro0 ro0Var, long j, long j2, long j3, x43 x43Var, x43 x43Var2, x43 x43Var3, long j4, long j5, long j6, long j7, long j8, long j9) {
        zq3.h(ro0Var, "material");
        zq3.h(x43Var, "ctaInactive");
        zq3.h(x43Var2, "ctaActive");
        zq3.h(x43Var3, "ctaBadge");
        this.a = ro0Var;
        this.b = j;
        this.c = j2;
        this.d = j3;
        this.e = x43Var;
        this.f = x43Var2;
        this.g = x43Var3;
        this.h = j4;
        this.i = j5;
        this.j = j6;
        this.k = j7;
        this.l = j8;
        this.m = j9;
    }
}
