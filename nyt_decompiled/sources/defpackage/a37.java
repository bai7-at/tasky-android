package defpackage;

import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes.dex */
public final class a37 {
    public static final a i = new a(null);
    private static final a37 j = b37.d(0.0f, 0.0f, 0.0f, 0.0f, f01.a.a());
    private final float a;
    private final float b;
    private final float c;
    private final float d;
    private final long e;
    private final long f;
    private final long g;
    private final long h;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    public /* synthetic */ a37(float f, float f2, float f3, float f4, long j2, long j3, long j4, long j5, DefaultConstructorMarker defaultConstructorMarker) {
        this(f, f2, f3, f4, j2, j3, j4, j5);
    }

    public final float a() {
        return this.d;
    }

    public final long b() {
        return this.h;
    }

    public final long c() {
        return this.g;
    }

    public final float d() {
        return this.d - this.b;
    }

    public final float e() {
        return this.a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a37)) {
            return false;
        }
        a37 a37Var = (a37) obj;
        return Float.compare(this.a, a37Var.a) == 0 && Float.compare(this.b, a37Var.b) == 0 && Float.compare(this.c, a37Var.c) == 0 && Float.compare(this.d, a37Var.d) == 0 && f01.c(this.e, a37Var.e) && f01.c(this.f, a37Var.f) && f01.c(this.g, a37Var.g) && f01.c(this.h, a37Var.h);
    }

    public final float f() {
        return this.c;
    }

    public final float g() {
        return this.b;
    }

    public final long h() {
        return this.e;
    }

    public int hashCode() {
        return (((((((((((((Float.hashCode(this.a) * 31) + Float.hashCode(this.b)) * 31) + Float.hashCode(this.c)) * 31) + Float.hashCode(this.d)) * 31) + f01.f(this.e)) * 31) + f01.f(this.f)) * 31) + f01.f(this.g)) * 31) + f01.f(this.h);
    }

    public final long i() {
        return this.f;
    }

    public final float j() {
        return this.c - this.a;
    }

    public String toString() {
        long j2 = this.e;
        long j3 = this.f;
        long j4 = this.g;
        long j5 = this.h;
        String str = yx2.a(this.a, 1) + ", " + yx2.a(this.b, 1) + ", " + yx2.a(this.c, 1) + ", " + yx2.a(this.d, 1);
        if (!f01.c(j2, j3) || !f01.c(j3, j4) || !f01.c(j4, j5)) {
            return "RoundRect(rect=" + str + ", topLeft=" + ((Object) f01.g(j2)) + ", topRight=" + ((Object) f01.g(j3)) + ", bottomRight=" + ((Object) f01.g(j4)) + ", bottomLeft=" + ((Object) f01.g(j5)) + ')';
        }
        if (f01.d(j2) == f01.e(j2)) {
            return "RoundRect(rect=" + str + ", radius=" + yx2.a(f01.d(j2), 1) + ')';
        }
        return "RoundRect(rect=" + str + ", x=" + yx2.a(f01.d(j2), 1) + ", y=" + yx2.a(f01.e(j2), 1) + ')';
    }

    private a37(float f, float f2, float f3, float f4, long j2, long j3, long j4, long j5) {
        this.a = f;
        this.b = f2;
        this.c = f3;
        this.d = f4;
        this.e = j2;
        this.f = j3;
        this.g = j4;
        this.h = j5;
    }
}
