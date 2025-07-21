package defpackage;

import io.embrace.android.embracesdk.okhttp3.EmbraceOkHttp3ApplicationInterceptor;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes.dex */
public abstract class rl8 {
    public static final a a = new a(null);
    private static final int b = e(0);
    private static final int c = e(1);
    private static final int d = e(2);
    private static final int e = e(3);

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final int a() {
            return rl8.b;
        }

        public final int b() {
            return rl8.e;
        }

        public final int c() {
            return rl8.d;
        }

        public final int d() {
            return rl8.c;
        }

        private a() {
        }
    }

    public static int e(int i) {
        return i;
    }

    public static final boolean f(int i, int i2) {
        return i == i2;
    }

    public static int g(int i) {
        return Integer.hashCode(i);
    }

    public static String h(int i) {
        return f(i, b) ? "Clamp" : f(i, c) ? "Repeated" : f(i, d) ? "Mirror" : f(i, e) ? "Decal" : EmbraceOkHttp3ApplicationInterceptor.UNKNOWN_EXCEPTION;
    }
}
