package defpackage;

import io.embrace.android.embracesdk.okhttp3.EmbraceOkHttp3ApplicationInterceptor;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes.dex */
public final class n27 {
    public static final a b = new a(null);
    private static final int c = i(0);
    private static final int d = i(1);
    private static final int e = i(2);
    private static final int f = i(3);
    private static final int g = i(4);
    private static final int h = i(5);
    private static final int i = i(6);
    private final int a;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final int a() {
            return n27.c;
        }

        public final int b() {
            return n27.d;
        }

        public final int c() {
            return n27.i;
        }

        public final int d() {
            return n27.h;
        }

        public final int e() {
            return n27.f;
        }

        public final int f() {
            return n27.e;
        }

        public final int g() {
            return n27.g;
        }

        private a() {
        }
    }

    private /* synthetic */ n27(int i2) {
        this.a = i2;
    }

    public static final /* synthetic */ n27 h(int i2) {
        return new n27(i2);
    }

    private static int i(int i2) {
        return i2;
    }

    public static boolean j(int i2, Object obj) {
        return (obj instanceof n27) && i2 == ((n27) obj).n();
    }

    public static final boolean k(int i2, int i3) {
        return i2 == i3;
    }

    public static int l(int i2) {
        return Integer.hashCode(i2);
    }

    public static String m(int i2) {
        return k(i2, c) ? "Button" : k(i2, d) ? "Checkbox" : k(i2, e) ? "Switch" : k(i2, f) ? "RadioButton" : k(i2, g) ? "Tab" : k(i2, h) ? "Image" : k(i2, i) ? "DropdownList" : EmbraceOkHttp3ApplicationInterceptor.UNKNOWN_EXCEPTION;
    }

    public boolean equals(Object obj) {
        return j(this.a, obj);
    }

    public int hashCode() {
        return l(this.a);
    }

    public final /* synthetic */ int n() {
        return this.a;
    }

    public String toString() {
        return m(this.a);
    }
}
