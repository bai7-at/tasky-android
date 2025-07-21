package defpackage;

import io.embrace.android.embracesdk.okhttp3.EmbraceOkHttp3ApplicationInterceptor;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes.dex */
public final class tf3 {
    public static final a b = new a(null);
    private static final int c = g(0);
    private static final int d = g(1);
    private static final int e = g(2);
    private static final int f = g(3);
    private static final int g = g(4);
    private final int a;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final int a() {
            return tf3.d;
        }

        public final int b() {
            return tf3.c;
        }

        public final int c() {
            return tf3.f;
        }

        public final int d() {
            return tf3.g;
        }

        public final int e() {
            return tf3.e;
        }

        private a() {
        }
    }

    private /* synthetic */ tf3(int i) {
        this.a = i;
    }

    public static final /* synthetic */ tf3 f(int i) {
        return new tf3(i);
    }

    public static int g(int i) {
        return i;
    }

    public static boolean h(int i, Object obj) {
        return (obj instanceof tf3) && i == ((tf3) obj).l();
    }

    public static final boolean i(int i, int i2) {
        return i == i2;
    }

    public static int j(int i) {
        return Integer.hashCode(i);
    }

    public static String k(int i) {
        return i(i, c) ? "Argb8888" : i(i, d) ? "Alpha8" : i(i, e) ? "Rgb565" : i(i, f) ? "F16" : i(i, g) ? "Gpu" : EmbraceOkHttp3ApplicationInterceptor.UNKNOWN_EXCEPTION;
    }

    public boolean equals(Object obj) {
        return h(this.a, obj);
    }

    public int hashCode() {
        return j(this.a);
    }

    public final /* synthetic */ int l() {
        return this.a;
    }

    public String toString() {
        return k(this.a);
    }
}
