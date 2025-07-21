package defpackage;

import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes.dex */
public final class bl3 {
    public static final a b = new a(null);
    private static final int c = d(1);
    private static final int d = d(2);
    private final int a;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final int a() {
            return bl3.d;
        }

        public final int b() {
            return bl3.c;
        }

        private a() {
        }
    }

    private /* synthetic */ bl3(int i) {
        this.a = i;
    }

    public static final /* synthetic */ bl3 c(int i) {
        return new bl3(i);
    }

    public static int d(int i) {
        return i;
    }

    public static boolean e(int i, Object obj) {
        return (obj instanceof bl3) && i == ((bl3) obj).i();
    }

    public static final boolean f(int i, int i2) {
        return i == i2;
    }

    public static int g(int i) {
        return Integer.hashCode(i);
    }

    public static String h(int i) {
        return f(i, c) ? "Touch" : f(i, d) ? "Keyboard" : "Error";
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
