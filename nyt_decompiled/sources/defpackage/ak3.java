package defpackage;

import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes.dex */
public abstract class ak3 {
    public static final a a = new a(null);
    private static final long b = b(Float.NaN, Float.NaN);

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final long a() {
            return ak3.b;
        }

        private a() {
        }
    }

    public static long b(float f, float f2) {
        return c((Float.floatToRawIntBits(f2) & 4294967295L) | (Float.floatToRawIntBits(f) << 32));
    }

    private static long c(long j) {
        return j;
    }

    public static long d(fm1 fm1Var) {
        return b(fm1Var.getDensity(), fm1Var.c1());
    }

    public static final boolean e(long j, long j2) {
        return j == j2;
    }
}
