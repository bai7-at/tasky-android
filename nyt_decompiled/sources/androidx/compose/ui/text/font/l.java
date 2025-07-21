package androidx.compose.ui.text.font;

import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes.dex */
public final class l {
    public static final a b = new a(null);
    private static final int c = d(0);
    private static final int d = d(1);
    private final int a;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final int a() {
            return l.d;
        }

        public final int b() {
            return l.c;
        }

        private a() {
        }
    }

    private /* synthetic */ l(int i) {
        this.a = i;
    }

    public static final /* synthetic */ l c(int i) {
        return new l(i);
    }

    public static int d(int i) {
        return i;
    }

    public static boolean e(int i, Object obj) {
        return (obj instanceof l) && i == ((l) obj).i();
    }

    public static final boolean f(int i, int i2) {
        return i == i2;
    }

    public static int g(int i) {
        return Integer.hashCode(i);
    }

    public static String h(int i) {
        return f(i, c) ? "Normal" : f(i, d) ? "Italic" : "Invalid";
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
