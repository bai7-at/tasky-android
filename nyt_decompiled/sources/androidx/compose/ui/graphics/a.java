package androidx.compose.ui.graphics;

import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes.dex */
public abstract class a {
    public static final C0056a a = new C0056a(null);
    private static final int b = d(0);
    private static final int c = d(1);
    private static final int d = d(2);

    /* renamed from: androidx.compose.ui.graphics.a$a, reason: collision with other inner class name */
    public static final class C0056a {
        public /* synthetic */ C0056a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final int a() {
            return a.b;
        }

        public final int b() {
            return a.d;
        }

        public final int c() {
            return a.c;
        }

        private C0056a() {
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
        return "CompositingStrategy(value=" + i + ')';
    }
}
