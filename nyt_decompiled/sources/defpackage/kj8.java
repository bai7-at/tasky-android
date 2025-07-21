package defpackage;

import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes.dex */
public abstract class kj8 {
    public static final a a = new a(null);
    private static final int b = d(1);
    private static final int c = d(2);
    private static final int d = d(3);

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final int a() {
            return kj8.b;
        }

        public final int b() {
            return kj8.c;
        }

        public final int c() {
            return kj8.d;
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
        return e(i, b) ? "Clip" : e(i, c) ? "Ellipsis" : e(i, d) ? "Visible" : "Invalid";
    }
}
