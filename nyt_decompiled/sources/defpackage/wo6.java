package defpackage;

import defpackage.ym3;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes5.dex */
public abstract class wo6 extends vo6 {
    public static float c(float f, float f2) {
        return f < f2 ? f2 : f;
    }

    public static int d(int i, int i2) {
        return i < i2 ? i2 : i;
    }

    public static long e(long j, long j2) {
        return j < j2 ? j2 : j;
    }

    public static Comparable f(Comparable comparable, Comparable comparable2) {
        zq3.h(comparable, "<this>");
        zq3.h(comparable2, "minimumValue");
        return comparable.compareTo(comparable2) < 0 ? comparable2 : comparable;
    }

    public static double g(double d, double d2) {
        return d > d2 ? d2 : d;
    }

    public static float h(float f, float f2) {
        return f > f2 ? f2 : f;
    }

    public static int i(int i, int i2) {
        return i > i2 ? i2 : i;
    }

    public static long j(long j, long j2) {
        return j > j2 ? j2 : j;
    }

    public static double k(double d, double d2, double d3) {
        if (d2 <= d3) {
            return d < d2 ? d2 : d > d3 ? d3 : d;
        }
        throw new IllegalArgumentException("Cannot coerce value to an empty range: maximum " + d3 + " is less than minimum " + d2 + '.');
    }

    public static float l(float f, float f2, float f3) {
        if (f2 <= f3) {
            return f < f2 ? f2 : f > f3 ? f3 : f;
        }
        throw new IllegalArgumentException("Cannot coerce value to an empty range: maximum " + f3 + " is less than minimum " + f2 + '.');
    }

    public static int m(int i, int i2, int i3) {
        if (i2 <= i3) {
            return i < i2 ? i2 : i > i3 ? i3 : i;
        }
        throw new IllegalArgumentException("Cannot coerce value to an empty range: maximum " + i3 + " is less than minimum " + i2 + '.');
    }

    public static int n(int i, km0 km0Var) {
        zq3.h(km0Var, "range");
        if (km0Var instanceof jm0) {
            return ((Number) uo6.p(Integer.valueOf(i), (jm0) km0Var)).intValue();
        }
        if (!km0Var.isEmpty()) {
            return i < ((Number) km0Var.a()).intValue() ? ((Number) km0Var.a()).intValue() : i > ((Number) km0Var.f()).intValue() ? ((Number) km0Var.f()).intValue() : i;
        }
        throw new IllegalArgumentException("Cannot coerce value to an empty range: " + km0Var + '.');
    }

    public static long o(long j, long j2, long j3) {
        if (j2 <= j3) {
            return j < j2 ? j2 : j > j3 ? j3 : j;
        }
        throw new IllegalArgumentException("Cannot coerce value to an empty range: maximum " + j3 + " is less than minimum " + j2 + '.');
    }

    public static Comparable p(Comparable comparable, jm0 jm0Var) {
        zq3.h(comparable, "<this>");
        zq3.h(jm0Var, "range");
        if (!jm0Var.isEmpty()) {
            return (!jm0Var.c(comparable, jm0Var.a()) || jm0Var.c(jm0Var.a(), comparable)) ? (!jm0Var.c(jm0Var.f(), comparable) || jm0Var.c(comparable, jm0Var.f())) ? comparable : jm0Var.f() : jm0Var.a();
        }
        throw new IllegalArgumentException("Cannot coerce value to an empty range: " + jm0Var + '.');
    }

    public static Comparable q(Comparable comparable, Comparable comparable2, Comparable comparable3) {
        zq3.h(comparable, "<this>");
        if (comparable2 == null || comparable3 == null) {
            if (comparable2 != null && comparable.compareTo(comparable2) < 0) {
                return comparable2;
            }
            if (comparable3 != null && comparable.compareTo(comparable3) > 0) {
                return comparable3;
            }
        } else {
            if (comparable2.compareTo(comparable3) > 0) {
                throw new IllegalArgumentException("Cannot coerce value to an empty range: maximum " + comparable3 + " is less than minimum " + comparable2 + '.');
            }
            if (comparable.compareTo(comparable2) < 0) {
                return comparable2;
            }
            if (comparable.compareTo(comparable3) > 0) {
                return comparable3;
            }
        }
        return comparable;
    }

    public static ym3 r(int i, int i2) {
        return ym3.d.a(i, i2, -1);
    }

    public static ym3 s(ym3 ym3Var) {
        zq3.h(ym3Var, "<this>");
        return ym3.d.a(ym3Var.j(), ym3Var.g(), -ym3Var.n());
    }

    public static ym3 t(ym3 ym3Var, int i) {
        zq3.h(ym3Var, "<this>");
        vo6.a(i > 0, Integer.valueOf(i));
        ym3.a aVar = ym3.d;
        int g = ym3Var.g();
        int j = ym3Var.j();
        if (ym3Var.n() <= 0) {
            i = -i;
        }
        return aVar.a(g, j, i);
    }

    public static an3 u(int i, int i2) {
        return i2 <= Integer.MIN_VALUE ? an3.e.a() : new an3(i, i2 - 1);
    }

    public static hb4 v(long j, int i) {
        return new hb4(j, i - 1);
    }
}
