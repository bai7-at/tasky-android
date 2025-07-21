package defpackage;

import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes.dex */
public final class zt7 {
    public static final a b = new a(null);
    private static final long c = du7.a(0.0f, 0.0f);
    private static final long d = du7.a(Float.NaN, Float.NaN);
    private final long a;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final long a() {
            return zt7.d;
        }

        public final long b() {
            return zt7.c;
        }

        private a() {
        }
    }

    private /* synthetic */ zt7(long j) {
        this.a = j;
    }

    public static final /* synthetic */ zt7 c(long j) {
        return new zt7(j);
    }

    public static long d(long j) {
        return j;
    }

    public static boolean e(long j, Object obj) {
        return (obj instanceof zt7) && j == ((zt7) obj).m();
    }

    public static final boolean f(long j, long j2) {
        return j == j2;
    }

    public static final float g(long j) {
        if (j == d) {
            throw new IllegalStateException("Size is unspecified");
        }
        wk2 wk2Var = wk2.a;
        return Float.intBitsToFloat((int) (j & 4294967295L));
    }

    public static final float h(long j) {
        return Math.min(Math.abs(i(j)), Math.abs(g(j)));
    }

    public static final float i(long j) {
        if (j == d) {
            throw new IllegalStateException("Size is unspecified");
        }
        wk2 wk2Var = wk2.a;
        return Float.intBitsToFloat((int) (j >> 32));
    }

    public static int j(long j) {
        return Long.hashCode(j);
    }

    public static final boolean k(long j) {
        return i(j) <= 0.0f || g(j) <= 0.0f;
    }

    public static String l(long j) {
        if (j == b.a()) {
            return "Size.Unspecified";
        }
        return "Size(" + yx2.a(i(j), 1) + ", " + yx2.a(g(j), 1) + ')';
    }

    public boolean equals(Object obj) {
        return e(this.a, obj);
    }

    public int hashCode() {
        return j(this.a);
    }

    public final /* synthetic */ long m() {
        return this.a;
    }

    public String toString() {
        return l(this.a);
    }
}
