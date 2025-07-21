package androidx.compose.ui.text.input;

import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes.dex */
public abstract class d {
    public static final a a = new a(null);
    private static final int b = j(1);
    private static final int c = j(2);
    private static final int d = j(3);
    private static final int e = j(4);
    private static final int f = j(5);
    private static final int g = j(6);
    private static final int h = j(7);
    private static final int i = j(8);
    private static final int j = j(9);

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final int a() {
            return d.c;
        }

        public final int b() {
            return d.j;
        }

        public final int c() {
            return d.g;
        }

        public final int d() {
            return d.d;
        }

        public final int e() {
            return d.i;
        }

        public final int f() {
            return d.h;
        }

        public final int g() {
            return d.e;
        }

        public final int h() {
            return d.b;
        }

        public final int i() {
            return d.f;
        }

        private a() {
        }
    }

    public static int j(int i2) {
        return i2;
    }

    public static final boolean k(int i2, int i3) {
        return i2 == i3;
    }

    public static int l(int i2) {
        return Integer.hashCode(i2);
    }

    public static String m(int i2) {
        return k(i2, b) ? "Text" : k(i2, c) ? "Ascii" : k(i2, d) ? "Number" : k(i2, e) ? "Phone" : k(i2, f) ? "Uri" : k(i2, g) ? "Email" : k(i2, h) ? "Password" : k(i2, i) ? "NumberPassword" : k(i2, j) ? "Decimal" : "Invalid";
    }
}
