package defpackage;

import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes.dex */
public abstract class du5 {
    public static final a a = new a(null);
    private static final int b = h(1);
    private static final int c = h(2);
    private static final int d = h(3);
    private static final int e = h(4);
    private static final int f = h(5);
    private static final int g = h(6);
    private static final int h = h(7);

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final int a() {
            return du5.b;
        }

        public final int b() {
            return du5.d;
        }

        public final int c() {
            return du5.e;
        }

        public final int d() {
            return du5.g;
        }

        public final int e() {
            return du5.h;
        }

        public final int f() {
            return du5.f;
        }

        public final int g() {
            return du5.c;
        }

        private a() {
        }
    }

    public static int h(int i) {
        return i;
    }

    public static final boolean i(int i, int i2) {
        return i == i2;
    }

    public static int j(int i) {
        return Integer.hashCode(i);
    }

    public static String k(int i) {
        return i(i, b) ? "AboveBaseline" : i(i, c) ? "Top" : i(i, d) ? "Bottom" : i(i, e) ? "Center" : i(i, f) ? "TextTop" : i(i, g) ? "TextBottom" : i(i, h) ? "TextCenter" : "Invalid";
    }
}
