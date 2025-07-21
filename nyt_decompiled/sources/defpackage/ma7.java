package defpackage;

import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes.dex */
public abstract class ma7 {
    public static final a a = new a(null);
    private static final long b = na7.a(Float.NaN, Float.NaN);

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    public static long a(long j) {
        return j;
    }

    public static final float b(long j) {
        if (j == b) {
            throw new IllegalStateException("ScaleFactor is unspecified");
        }
        wk2 wk2Var = wk2.a;
        return Float.intBitsToFloat((int) (j >> 32));
    }

    public static final float c(long j) {
        if (j == b) {
            throw new IllegalStateException("ScaleFactor is unspecified");
        }
        wk2 wk2Var = wk2.a;
        return Float.intBitsToFloat((int) (j & 4294967295L));
    }
}
