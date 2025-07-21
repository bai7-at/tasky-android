package defpackage;

import io.embrace.android.embracesdk.okhttp3.EmbraceOkHttp3ApplicationInterceptor;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes.dex */
public final class s64 {
    public static final a b = new a(null);
    private static final int c = d(0);
    private static final int d = d(1);
    private final int a;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final int a() {
            return s64.d;
        }

        public final int b() {
            return s64.c;
        }

        private a() {
        }
    }

    private /* synthetic */ s64(int i) {
        this.a = i;
    }

    public static final /* synthetic */ s64 c(int i) {
        return new s64(i);
    }

    private static int d(int i) {
        return i;
    }

    public static boolean e(int i, Object obj) {
        return (obj instanceof s64) && i == ((s64) obj).i();
    }

    public static final boolean f(int i, int i2) {
        return i == i2;
    }

    public static int g(int i) {
        return Integer.hashCode(i);
    }

    public static String h(int i) {
        return f(i, c) ? "Polite" : f(i, d) ? "Assertive" : EmbraceOkHttp3ApplicationInterceptor.UNKNOWN_EXCEPTION;
    }

    public boolean equals(Object obj) {
        return e(this.a, obj);
    }

    public int hashCode() {
        return g(this.a);
    }

    public final /* synthetic */ int i() {
        return this.a;
    }

    public String toString() {
        return h(this.a);
    }
}
