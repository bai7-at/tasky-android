package defpackage;

import io.embrace.android.embracesdk.okhttp3.EmbraceOkHttp3ApplicationInterceptor;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes.dex */
public abstract class iy5 {
    public static final a a = new a(null);
    private static final int b = f(0);
    private static final int c = f(1);
    private static final int d = f(2);
    private static final int e = f(3);
    private static final int f = f(4);

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final int a() {
            return iy5.f;
        }

        public final int b() {
            return iy5.d;
        }

        public final int c() {
            return iy5.e;
        }

        public final int d() {
            return iy5.c;
        }

        public final int e() {
            return iy5.b;
        }

        private a() {
        }
    }

    private static int f(int i) {
        return i;
    }

    public static final boolean g(int i, int i2) {
        return i == i2;
    }

    public static int h(int i) {
        return Integer.hashCode(i);
    }

    public static String i(int i) {
        return i != 1 ? i != 2 ? i != 3 ? i != 4 ? EmbraceOkHttp3ApplicationInterceptor.UNKNOWN_EXCEPTION : "Eraser" : "Stylus" : "Mouse" : "Touch";
    }
}
