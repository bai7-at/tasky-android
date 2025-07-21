package defpackage;

import io.embrace.android.embracesdk.okhttp3.EmbraceOkHttp3ApplicationInterceptor;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes.dex */
public abstract class jh2 {
    public static final a a = new a(null);
    private static final int b = c(0);
    private static final int c = c(1);
    private static final int d = c(2);
    private static final int e = c(3);

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final int a() {
            return jh2.c;
        }

        public final int b() {
            return jh2.b;
        }

        private a() {
        }
    }

    public static int c(int i) {
        return i;
    }

    public static final boolean d(int i, int i2) {
        return i == i2;
    }

    public static int e(int i) {
        return Integer.hashCode(i);
    }

    public static String f(int i) {
        return d(i, b) ? "None" : d(i, c) ? "Low" : d(i, d) ? "Medium" : d(i, e) ? "High" : EmbraceOkHttp3ApplicationInterceptor.UNKNOWN_EXCEPTION;
    }
}
