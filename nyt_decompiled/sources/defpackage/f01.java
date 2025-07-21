package defpackage;

import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes.dex */
public abstract class f01 {
    public static final a a = new a(null);
    private static final long b = g01.b(0.0f, 0.0f, 2, null);

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final long a() {
            return f01.b;
        }

        private a() {
        }
    }

    public static long b(long j) {
        return j;
    }

    public static final boolean c(long j, long j2) {
        return j == j2;
    }

    public static final float d(long j) {
        wk2 wk2Var = wk2.a;
        return Float.intBitsToFloat((int) (j >> 32));
    }

    public static final float e(long j) {
        wk2 wk2Var = wk2.a;
        return Float.intBitsToFloat((int) (j & 4294967295L));
    }

    public static int f(long j) {
        return Long.hashCode(j);
    }

    public static String g(long j) {
        if (d(j) == e(j)) {
            return "CornerRadius.circular(" + yx2.a(d(j), 1) + ')';
        }
        return "CornerRadius.elliptical(" + yx2.a(d(j), 1) + ", " + yx2.a(e(j), 1) + ')';
    }
}
