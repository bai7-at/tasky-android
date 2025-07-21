package androidx.compose.ui.graphics.colorspace;

import io.embrace.android.embracesdk.okhttp3.EmbraceOkHttp3ApplicationInterceptor;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes.dex */
public abstract class b {
    public static final a a = new a(null);
    private static final long b;
    private static final long c;
    private static final long d;
    private static final long e;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final long a() {
            return b.d;
        }

        public final long b() {
            return b.b;
        }

        public final long c() {
            return b.c;
        }

        private a() {
        }
    }

    static {
        long j = 3;
        long j2 = j << 32;
        b = d((0 & 4294967295L) | j2);
        c = d((1 & 4294967295L) | j2);
        d = d(j2 | (2 & 4294967295L));
        e = d((j & 4294967295L) | (4 << 32));
    }

    public static long d(long j) {
        return j;
    }

    public static final boolean e(long j, long j2) {
        return j == j2;
    }

    public static final int f(long j) {
        return (int) (j >> 32);
    }

    public static int g(long j) {
        return Long.hashCode(j);
    }

    public static String h(long j) {
        return e(j, b) ? "Rgb" : e(j, c) ? "Xyz" : e(j, d) ? "Lab" : e(j, e) ? "Cmyk" : EmbraceOkHttp3ApplicationInterceptor.UNKNOWN_EXCEPTION;
    }
}
