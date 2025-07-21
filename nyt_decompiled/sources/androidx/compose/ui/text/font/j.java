package androidx.compose.ui.text.font;

import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes.dex */
public abstract class j {
    public static final a a = new a(null);
    private static final int b = d(0);
    private static final int c = d(1);
    private static final int d = d(2);

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final int a() {
            return j.d;
        }

        public final int b() {
            return j.b;
        }

        public final int c() {
            return j.c;
        }

        private a() {
        }
    }

    private static int d(int i) {
        return i;
    }

    public static final boolean e(int i, int i2) {
        return i == i2;
    }

    public static int f(int i) {
        return Integer.hashCode(i);
    }

    public static String g(int i) {
        if (e(i, b)) {
            return "Blocking";
        }
        if (e(i, c)) {
            return "Optional";
        }
        if (e(i, d)) {
            return "Async";
        }
        return "Invalid(value=" + i + ')';
    }
}
