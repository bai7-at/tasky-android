package defpackage;

import io.embrace.android.embracesdk.okhttp3.EmbraceOkHttp3ApplicationInterceptor;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes.dex */
public abstract class v48 {
    public static final a a = new a(null);
    private static final int b = d(0);
    private static final int c = d(1);
    private static final int d = d(2);

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final int a() {
            return v48.b;
        }

        public final int b() {
            return v48.c;
        }

        public final int c() {
            return v48.d;
        }

        private a() {
        }
    }

    public static int d(int i) {
        return i;
    }

    public static final boolean e(int i, int i2) {
        return i == i2;
    }

    public static int f(int i) {
        return Integer.hashCode(i);
    }

    public static String g(int i) {
        return e(i, b) ? "Butt" : e(i, c) ? "Round" : e(i, d) ? "Square" : EmbraceOkHttp3ApplicationInterceptor.UNKNOWN_EXCEPTION;
    }
}
