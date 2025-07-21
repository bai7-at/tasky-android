package androidx.compose.ui.text.input;

import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes.dex */
public abstract class c {
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
            return c.c;
        }

        public final int b() {
            return c.b;
        }

        public final int c() {
            return c.e;
        }

        public final int d() {
            return c.d;
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
        return f(i, b) ? "None" : f(i, c) ? "Characters" : f(i, d) ? "Words" : f(i, e) ? "Sentences" : "Invalid";
    }
}
