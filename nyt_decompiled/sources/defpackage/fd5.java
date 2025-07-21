package defpackage;

import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes.dex */
public final class fd5 {
    public static final a b = new a(null);
    private static final long c = hd5.a(0.0f, 0.0f);
    private static final long d = hd5.a(Float.POSITIVE_INFINITY, Float.POSITIVE_INFINITY);
    private static final long e = hd5.a(Float.NaN, Float.NaN);
    private final long a;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final long a() {
            return fd5.d;
        }

        public final long b() {
            return fd5.e;
        }

        public final long c() {
            return fd5.c;
        }

        private a() {
        }
    }

    private /* synthetic */ fd5(long j) {
        this.a = j;
    }

    public static final /* synthetic */ fd5 d(long j) {
        return new fd5(j);
    }

    public static final float e(long j) {
        return o(j);
    }

    public static final float f(long j) {
        return p(j);
    }

    public static long g(long j) {
        return j;
    }

    public static final long h(long j, float f, float f2) {
        return hd5.a(f, f2);
    }

    public static /* synthetic */ long i(long j, float f, float f2, int i, Object obj) {
        if ((i & 1) != 0) {
            f = o(j);
        }
        if ((i & 2) != 0) {
            f2 = p(j);
        }
        return h(j, f, f2);
    }

    public static final long j(long j, float f) {
        return hd5.a(o(j) / f, p(j) / f);
    }

    public static boolean k(long j, Object obj) {
        return (obj instanceof fd5) && j == ((fd5) obj).x();
    }

    public static final boolean l(long j, long j2) {
        return j == j2;
    }

    public static final float m(long j) {
        return (float) Math.sqrt((o(j) * o(j)) + (p(j) * p(j)));
    }

    public static final float n(long j) {
        return (o(j) * o(j)) + (p(j) * p(j));
    }

    public static final float o(long j) {
        if (j == e) {
            throw new IllegalStateException("Offset is unspecified");
        }
        wk2 wk2Var = wk2.a;
        return Float.intBitsToFloat((int) (j >> 32));
    }

    public static final float p(long j) {
        if (j == e) {
            throw new IllegalStateException("Offset is unspecified");
        }
        wk2 wk2Var = wk2.a;
        return Float.intBitsToFloat((int) (j & 4294967295L));
    }

    public static int q(long j) {
        return Long.hashCode(j);
    }

    public static final boolean r(long j) {
        if (Float.isNaN(o(j)) || Float.isNaN(p(j))) {
            throw new IllegalStateException("Offset argument contained a NaN value.");
        }
        return true;
    }

    public static final long s(long j, long j2) {
        return hd5.a(o(j) - o(j2), p(j) - p(j2));
    }

    public static final long t(long j, long j2) {
        return hd5.a(o(j) + o(j2), p(j) + p(j2));
    }

    public static final long u(long j, float f) {
        return hd5.a(o(j) * f, p(j) * f);
    }

    public static String v(long j) {
        if (!hd5.c(j)) {
            return "Offset.Unspecified";
        }
        return "Offset(" + yx2.a(o(j), 1) + ", " + yx2.a(p(j), 1) + ')';
    }

    public static final long w(long j) {
        return hd5.a(-o(j), -p(j));
    }

    public boolean equals(Object obj) {
        return k(this.a, obj);
    }

    public int hashCode() {
        return q(this.a);
    }

    public String toString() {
        return v(this.a);
    }

    public final /* synthetic */ long x() {
        return this.a;
    }
}
