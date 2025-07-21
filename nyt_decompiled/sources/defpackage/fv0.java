package defpackage;

import kotlin.jvm.internal.DefaultConstructorMarker;
import okhttp3.internal.http2.Settings;

/* loaded from: classes.dex */
public final class fv0 {
    public static final a b = new a(null);
    private static final int[] c = {18, 20, 17, 15};
    private static final int[] d = {Settings.DEFAULT_INITIAL_WINDOW_SIZE, 262143, 32767, 8191};
    private static final int[] e = {32767, 8191, Settings.DEFAULT_INITIAL_WINDOW_SIZE, 262143};
    private final long a;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private final int a(int i) {
            if (i < 8191) {
                return 13;
            }
            if (i < 32767) {
                return 15;
            }
            if (i < 65535) {
                return 16;
            }
            if (i < 262143) {
                return 18;
            }
            throw new IllegalArgumentException("Can't represent a size of " + i + " in Constraints");
        }

        public final long b(int i, int i2, int i3, int i4) {
            long j;
            int i5 = i4 == Integer.MAX_VALUE ? i3 : i4;
            int a = a(i5);
            int i6 = i2 == Integer.MAX_VALUE ? i : i2;
            int a2 = a(i6);
            if (a + a2 > 31) {
                throw new IllegalArgumentException("Can't represent a width of " + i6 + " and height of " + i5 + " in Constraints");
            }
            if (a2 == 13) {
                j = 3;
            } else if (a2 == 18) {
                j = 1;
            } else if (a2 == 15) {
                j = 2;
            } else {
                if (a2 != 16) {
                    throw new IllegalStateException("Should only have the provided constants.");
                }
                j = 0;
            }
            int i7 = i2 == Integer.MAX_VALUE ? 0 : i2 + 1;
            int i8 = i4 != Integer.MAX_VALUE ? i4 + 1 : 0;
            int i9 = fv0.c[(int) j];
            return fv0.c((i7 << 33) | j | (i << 2) | (i3 << i9) | (i8 << (i9 + 31)));
        }

        public final long c(int i, int i2) {
            if (i >= 0 && i2 >= 0) {
                return b(i, i, i2, i2);
            }
            throw new IllegalArgumentException(("width(" + i + ") and height(" + i2 + ") must be >= 0").toString());
        }

        public final long d(int i) {
            if (i >= 0) {
                return b(0, Integer.MAX_VALUE, i, i);
            }
            throw new IllegalArgumentException(("height(" + i + ") must be >= 0").toString());
        }

        public final long e(int i) {
            if (i >= 0) {
                return b(i, i, 0, Integer.MAX_VALUE);
            }
            throw new IllegalArgumentException(("width(" + i + ") must be >= 0").toString());
        }

        private a() {
        }
    }

    private /* synthetic */ fv0(long j) {
        this.a = j;
    }

    public static final /* synthetic */ fv0 b(long j) {
        return new fv0(j);
    }

    public static long c(long j) {
        return j;
    }

    public static final long d(long j, int i, int i2, int i3, int i4) {
        if (i3 < 0 || i < 0) {
            throw new IllegalArgumentException(("minHeight(" + i3 + ") and minWidth(" + i + ") must be >= 0").toString());
        }
        if (i2 < i && i2 != Integer.MAX_VALUE) {
            throw new IllegalArgumentException(("maxWidth(" + i2 + ") must be >= minWidth(" + i + ')').toString());
        }
        if (i4 >= i3 || i4 == Integer.MAX_VALUE) {
            return b.b(i, i2, i3, i4);
        }
        throw new IllegalArgumentException(("maxHeight(" + i4 + ") must be >= minHeight(" + i3 + ')').toString());
    }

    public static /* synthetic */ long e(long j, int i, int i2, int i3, int i4, int i5, Object obj) {
        if ((i5 & 1) != 0) {
            i = p(j);
        }
        int i6 = i;
        if ((i5 & 2) != 0) {
            i2 = n(j);
        }
        int i7 = i2;
        if ((i5 & 4) != 0) {
            i3 = o(j);
        }
        int i8 = i3;
        if ((i5 & 8) != 0) {
            i4 = m(j);
        }
        return d(j, i6, i7, i8, i4);
    }

    public static boolean f(long j, Object obj) {
        return (obj instanceof fv0) && j == ((fv0) obj).t();
    }

    public static final boolean g(long j, long j2) {
        return j == j2;
    }

    private static final int h(long j) {
        return (int) (j & 3);
    }

    public static final boolean i(long j) {
        int h = h(j);
        return (((int) (j >> (c[h] + 31))) & e[h]) != 0;
    }

    public static final boolean j(long j) {
        return (((int) (j >> 33)) & d[h(j)]) != 0;
    }

    public static final boolean k(long j) {
        return m(j) == o(j);
    }

    public static final boolean l(long j) {
        return n(j) == p(j);
    }

    public static final int m(long j) {
        int h = h(j);
        int i = ((int) (j >> (c[h] + 31))) & e[h];
        if (i == 0) {
            return Integer.MAX_VALUE;
        }
        return i - 1;
    }

    public static final int n(long j) {
        int i = ((int) (j >> 33)) & d[h(j)];
        if (i == 0) {
            return Integer.MAX_VALUE;
        }
        return i - 1;
    }

    public static final int o(long j) {
        int h = h(j);
        return ((int) (j >> c[h])) & e[h];
    }

    public static final int p(long j) {
        return ((int) (j >> 2)) & d[h(j)];
    }

    public static int q(long j) {
        return Long.hashCode(j);
    }

    public static final boolean r(long j) {
        return n(j) == 0 || m(j) == 0;
    }

    public static String s(long j) {
        int n = n(j);
        String valueOf = n == Integer.MAX_VALUE ? "Infinity" : String.valueOf(n);
        int m = m(j);
        return "Constraints(minWidth = " + p(j) + ", maxWidth = " + valueOf + ", minHeight = " + o(j) + ", maxHeight = " + (m != Integer.MAX_VALUE ? String.valueOf(m) : "Infinity") + ')';
    }

    public boolean equals(Object obj) {
        return f(this.a, obj);
    }

    public int hashCode() {
        return q(this.a);
    }

    public final /* synthetic */ long t() {
        return this.a;
    }

    public String toString() {
        return s(this.a);
    }
}
