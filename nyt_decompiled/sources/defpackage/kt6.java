package defpackage;

import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes.dex */
public final class kt6 {
    public static final a e = new a(null);
    private static final kt6 f = new kt6(0.0f, 0.0f, 0.0f, 0.0f);
    private final float a;
    private final float b;
    private final float c;
    private final float d;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final kt6 a() {
            return kt6.f;
        }

        private a() {
        }
    }

    public kt6(float f2, float f3, float f4, float f5) {
        this.a = f2;
        this.b = f3;
        this.c = f4;
        this.d = f5;
    }

    public static /* synthetic */ kt6 d(kt6 kt6Var, float f2, float f3, float f4, float f5, int i, Object obj) {
        if ((i & 1) != 0) {
            f2 = kt6Var.a;
        }
        if ((i & 2) != 0) {
            f3 = kt6Var.b;
        }
        if ((i & 4) != 0) {
            f4 = kt6Var.c;
        }
        if ((i & 8) != 0) {
            f5 = kt6Var.d;
        }
        return kt6Var.c(f2, f3, f4, f5);
    }

    public final boolean b(long j) {
        return fd5.o(j) >= this.a && fd5.o(j) < this.c && fd5.p(j) >= this.b && fd5.p(j) < this.d;
    }

    public final kt6 c(float f2, float f3, float f4, float f5) {
        return new kt6(f2, f3, f4, f5);
    }

    public final float e() {
        return this.d;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof kt6)) {
            return false;
        }
        kt6 kt6Var = (kt6) obj;
        return Float.compare(this.a, kt6Var.a) == 0 && Float.compare(this.b, kt6Var.b) == 0 && Float.compare(this.c, kt6Var.c) == 0 && Float.compare(this.d, kt6Var.d) == 0;
    }

    public final long f() {
        return hd5.a(this.c, this.d);
    }

    public final long g() {
        return hd5.a(this.a + (n() / 2.0f), this.b + (h() / 2.0f));
    }

    public final float h() {
        return this.d - this.b;
    }

    public int hashCode() {
        return (((((Float.hashCode(this.a) * 31) + Float.hashCode(this.b)) * 31) + Float.hashCode(this.c)) * 31) + Float.hashCode(this.d);
    }

    public final float i() {
        return this.a;
    }

    public final float j() {
        return this.c;
    }

    public final long k() {
        return du7.a(n(), h());
    }

    public final float l() {
        return this.b;
    }

    public final long m() {
        return hd5.a(this.a, this.b);
    }

    public final float n() {
        return this.c - this.a;
    }

    public final kt6 o(float f2, float f3, float f4, float f5) {
        return new kt6(Math.max(this.a, f2), Math.max(this.b, f3), Math.min(this.c, f4), Math.min(this.d, f5));
    }

    public final kt6 p(kt6 kt6Var) {
        return new kt6(Math.max(this.a, kt6Var.a), Math.max(this.b, kt6Var.b), Math.min(this.c, kt6Var.c), Math.min(this.d, kt6Var.d));
    }

    public final boolean q() {
        return this.a >= this.c || this.b >= this.d;
    }

    public final boolean r(kt6 kt6Var) {
        return this.c > kt6Var.a && kt6Var.c > this.a && this.d > kt6Var.b && kt6Var.d > this.b;
    }

    public final kt6 s(float f2, float f3) {
        return new kt6(this.a + f2, this.b + f3, this.c + f2, this.d + f3);
    }

    public final kt6 t(long j) {
        return new kt6(this.a + fd5.o(j), this.b + fd5.p(j), this.c + fd5.o(j), this.d + fd5.p(j));
    }

    public String toString() {
        return "Rect.fromLTRB(" + yx2.a(this.a, 1) + ", " + yx2.a(this.b, 1) + ", " + yx2.a(this.c, 1) + ", " + yx2.a(this.d, 1) + ')';
    }
}
