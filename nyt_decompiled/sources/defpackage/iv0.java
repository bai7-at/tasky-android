package defpackage;

/* loaded from: classes.dex */
public abstract class iv0 {
    public static final long a(int i, int i2, int i3, int i4) {
        if (i2 < i) {
            throw new IllegalArgumentException(("maxWidth(" + i2 + ") must be >= than minWidth(" + i + ')').toString());
        }
        if (i4 < i3) {
            throw new IllegalArgumentException(("maxHeight(" + i4 + ") must be >= than minHeight(" + i3 + ')').toString());
        }
        if (i >= 0 && i3 >= 0) {
            return fv0.b.b(i, i2, i3, i4);
        }
        throw new IllegalArgumentException(("minWidth(" + i + ") and minHeight(" + i3 + ") must be >= 0").toString());
    }

    public static /* synthetic */ long b(int i, int i2, int i3, int i4, int i5, Object obj) {
        if ((i5 & 1) != 0) {
            i = 0;
        }
        if ((i5 & 2) != 0) {
            i2 = Integer.MAX_VALUE;
        }
        if ((i5 & 4) != 0) {
            i3 = 0;
        }
        if ((i5 & 8) != 0) {
            i4 = Integer.MAX_VALUE;
        }
        return a(i, i2, i3, i4);
    }

    private static final int c(int i, int i2) {
        return i == Integer.MAX_VALUE ? i : uo6.d(i + i2, 0);
    }

    public static final long d(long j, long j2) {
        return in3.a(uo6.m(hn3.g(j2), fv0.p(j), fv0.n(j)), uo6.m(hn3.f(j2), fv0.o(j), fv0.m(j)));
    }

    public static final long e(long j, long j2) {
        return a(uo6.m(fv0.p(j2), fv0.p(j), fv0.n(j)), uo6.m(fv0.n(j2), fv0.p(j), fv0.n(j)), uo6.m(fv0.o(j2), fv0.o(j), fv0.m(j)), uo6.m(fv0.m(j2), fv0.o(j), fv0.m(j)));
    }

    public static final int f(long j, int i) {
        return uo6.m(i, fv0.o(j), fv0.m(j));
    }

    public static final int g(long j, int i) {
        return uo6.m(i, fv0.p(j), fv0.n(j));
    }

    public static final boolean h(long j, long j2) {
        int p = fv0.p(j);
        int n = fv0.n(j);
        int g = hn3.g(j2);
        if (p <= g && g <= n) {
            int o = fv0.o(j);
            int m = fv0.m(j);
            int f = hn3.f(j2);
            if (o <= f && f <= m) {
                return true;
            }
        }
        return false;
    }

    public static final long i(long j, int i, int i2) {
        return a(uo6.d(fv0.p(j) + i, 0), c(fv0.n(j), i), uo6.d(fv0.o(j) + i2, 0), c(fv0.m(j), i2));
    }

    public static /* synthetic */ long j(long j, int i, int i2, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            i = 0;
        }
        if ((i3 & 2) != 0) {
            i2 = 0;
        }
        return i(j, i, i2);
    }
}
