package androidx.compose.ui.text.font;

import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes.dex */
public final class m {
    public static final a b = new a(null);
    private static final int c = f(0);
    private static final int d = f(1);
    private static final int e = f(2);
    private static final int f = f(3);
    private final int a;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final int a() {
            return m.d;
        }

        public final int b() {
            return m.c;
        }

        public final int c() {
            return m.f;
        }

        public final int d() {
            return m.e;
        }

        private a() {
        }
    }

    private /* synthetic */ m(int i) {
        this.a = i;
    }

    public static final /* synthetic */ m e(int i) {
        return new m(i);
    }

    public static int f(int i) {
        return i;
    }

    public static boolean g(int i, Object obj) {
        return (obj instanceof m) && i == ((m) obj).m();
    }

    public static final boolean h(int i, int i2) {
        return i == i2;
    }

    public static int i(int i) {
        return Integer.hashCode(i);
    }

    public static final boolean j(int i) {
        return h(i, d) || h(i, f);
    }

    public static final boolean k(int i) {
        return h(i, d) || h(i, e);
    }

    public static String l(int i) {
        return h(i, c) ? "None" : h(i, d) ? "All" : h(i, e) ? "Weight" : h(i, f) ? "Style" : "Invalid";
    }

    public boolean equals(Object obj) {
        return g(this.a, obj);
    }

    public int hashCode() {
        return i(this.a);
    }

    public final /* synthetic */ int m() {
        return this.a;
    }

    public String toString() {
        return l(this.a);
    }
}
