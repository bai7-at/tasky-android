package defpackage;

/* loaded from: classes.dex */
public abstract class b37 {
    public static final a37 a(float f, float f2, float f3, float f4, float f5, float f6) {
        long a = g01.a(f5, f6);
        return new a37(f, f2, f3, f4, a, a, a, a, null);
    }

    public static final a37 b(kt6 kt6Var, float f, float f2) {
        return a(kt6Var.i(), kt6Var.l(), kt6Var.j(), kt6Var.e(), f, f2);
    }

    public static final a37 c(kt6 kt6Var, long j, long j2, long j3, long j4) {
        return new a37(kt6Var.i(), kt6Var.l(), kt6Var.j(), kt6Var.e(), j, j2, j3, j4, null);
    }

    public static final a37 d(float f, float f2, float f3, float f4, long j) {
        return a(f, f2, f3, f4, f01.d(j), f01.e(j));
    }

    public static final a37 e(kt6 kt6Var, long j) {
        return b(kt6Var, f01.d(j), f01.e(j));
    }

    public static final boolean f(a37 a37Var) {
        return f01.d(a37Var.h()) == f01.e(a37Var.h()) && f01.d(a37Var.h()) == f01.d(a37Var.i()) && f01.d(a37Var.h()) == f01.e(a37Var.i()) && f01.d(a37Var.h()) == f01.d(a37Var.c()) && f01.d(a37Var.h()) == f01.e(a37Var.c()) && f01.d(a37Var.h()) == f01.d(a37Var.b()) && f01.d(a37Var.h()) == f01.e(a37Var.b());
    }
}
