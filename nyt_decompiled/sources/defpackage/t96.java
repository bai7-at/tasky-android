package defpackage;

import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes4.dex */
public final class t96 {
    private final ro0 a;
    private final long b;
    private final long c;
    private long d;
    private final long e;
    private final long f;
    private final long g;
    private final long h;
    private final long i;
    private final long j;
    private final long k;
    private final long l;
    private final long m;

    public /* synthetic */ t96(ro0 ro0Var, long j, long j2, long j3, long j4, long j5, long j6, long j7, long j8, long j9, long j10, long j11, long j12, DefaultConstructorMarker defaultConstructorMarker) {
        this(ro0Var, j, j2, j3, j4, j5, j6, j7, j8, j9, j10, j11, j12);
    }

    public final long a() {
        return this.f;
    }

    public final ro0 b() {
        return this.a;
    }

    public final long c() {
        return this.c;
    }

    public final long d() {
        return this.d;
    }

    public final long e() {
        return this.e;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof t96)) {
            return false;
        }
        t96 t96Var = (t96) obj;
        return zq3.c(this.a, t96Var.a) && nn0.t(this.b, t96Var.b) && nn0.t(this.c, t96Var.c) && nn0.t(this.d, t96Var.d) && nn0.t(this.e, t96Var.e) && nn0.t(this.f, t96Var.f) && nn0.t(this.g, t96Var.g) && nn0.t(this.h, t96Var.h) && nn0.t(this.i, t96Var.i) && nn0.t(this.j, t96Var.j) && nn0.t(this.k, t96Var.k) && nn0.t(this.l, t96Var.l) && nn0.t(this.m, t96Var.m);
    }

    public final long f() {
        return this.i;
    }

    public final long g() {
        return this.h;
    }

    public final long h() {
        return this.j;
    }

    public int hashCode() {
        return (((((((((((((((((((((((this.a.hashCode() * 31) + nn0.z(this.b)) * 31) + nn0.z(this.c)) * 31) + nn0.z(this.d)) * 31) + nn0.z(this.e)) * 31) + nn0.z(this.f)) * 31) + nn0.z(this.g)) * 31) + nn0.z(this.h)) * 31) + nn0.z(this.i)) * 31) + nn0.z(this.j)) * 31) + nn0.z(this.k)) * 31) + nn0.z(this.l)) * 31) + nn0.z(this.m);
    }

    public final long i() {
        return this.k;
    }

    public final long j() {
        return this.g;
    }

    public final long k() {
        return this.l;
    }

    public final long l() {
        return this.b;
    }

    public final long m() {
        return this.m;
    }

    public String toString() {
        return "PurrUIColors(customColors=" + this.a + ", tertiary=" + nn0.A(this.b) + ", dividerColor=" + nn0.A(this.c) + ", removeAccountText=" + nn0.A(this.d) + ", signalAccent=" + nn0.A(this.e) + ", contentTitle=" + nn0.A(this.f) + ", tcfTextColor=" + nn0.A(this.g) + ", tcfButtonTextColor=" + nn0.A(this.h) + ", tcfButtonBackgroundColor=" + nn0.A(this.i) + ", tcfCardBackgroundColor=" + nn0.A(this.j) + ", tcfCardBorderColor=" + nn0.A(this.k) + ", tcfWebViewProgressBarColor=" + nn0.A(this.l) + ", yourPrivacyOptedBackgroundColor=" + nn0.A(this.m) + ")";
    }

    private t96(ro0 ro0Var, long j, long j2, long j3, long j4, long j5, long j6, long j7, long j8, long j9, long j10, long j11, long j12) {
        zq3.h(ro0Var, "customColors");
        this.a = ro0Var;
        this.b = j;
        this.c = j2;
        this.d = j3;
        this.e = j4;
        this.f = j5;
        this.g = j6;
        this.h = j7;
        this.i = j8;
        this.j = j9;
        this.k = j10;
        this.l = j11;
        this.m = j12;
    }
}
