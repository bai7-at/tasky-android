package defpackage;

import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes.dex */
public final class u49 {
    public static final a b = new a(null);
    private static final long c = v49.a(0.0f, 0.0f);
    private final long a;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final long a() {
            return u49.c;
        }

        private a() {
        }
    }

    private /* synthetic */ u49(long j) {
        this.a = j;
    }

    public static final /* synthetic */ u49 b(long j) {
        return new u49(j);
    }

    public static long c(long j) {
        return j;
    }

    public static final long d(long j, float f, float f2) {
        return v49.a(f, f2);
    }

    public static /* synthetic */ long e(long j, float f, float f2, int i, Object obj) {
        if ((i & 1) != 0) {
            f = h(j);
        }
        if ((i & 2) != 0) {
            f2 = i(j);
        }
        return d(j, f, f2);
    }

    public static boolean f(long j, Object obj) {
        return (obj instanceof u49) && j == ((u49) obj).o();
    }

    public static final boolean g(long j, long j2) {
        return j == j2;
    }

    public static final float h(long j) {
        wk2 wk2Var = wk2.a;
        return Float.intBitsToFloat((int) (j >> 32));
    }

    public static final float i(long j) {
        wk2 wk2Var = wk2.a;
        return Float.intBitsToFloat((int) (j & 4294967295L));
    }

    public static int j(long j) {
        return Long.hashCode(j);
    }

    public static final long k(long j, long j2) {
        return v49.a(h(j) - h(j2), i(j) - i(j2));
    }

    public static final long l(long j, long j2) {
        return v49.a(h(j) + h(j2), i(j) + i(j2));
    }

    public static final long m(long j, float f) {
        return v49.a(h(j) * f, i(j) * f);
    }

    public static String n(long j) {
        return '(' + h(j) + ", " + i(j) + ") px/sec";
    }

    public boolean equals(Object obj) {
        return f(this.a, obj);
    }

    public int hashCode() {
        return j(this.a);
    }

    public final /* synthetic */ long o() {
        return this.a;
    }

    public String toString() {
        return n(this.a);
    }
}
