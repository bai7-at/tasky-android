package androidx.compose.ui.focus;

import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes.dex */
public final class d {
    public static final a b = new a(null);
    private static final int c = j(1);
    private static final int d = j(2);
    private static final int e = j(3);
    private static final int f = j(4);
    private static final int g = j(5);
    private static final int h = j(6);
    private static final int i = j(7);
    private static final int j = j(8);
    private final int a;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final int a() {
            return d.h;
        }

        public final int b() {
            return d.i;
        }

        public final int c() {
            return d.j;
        }

        public final int d() {
            return d.e;
        }

        public final int e() {
            return d.c;
        }

        public final int f() {
            return d.d;
        }

        public final int g() {
            return d.f;
        }

        public final int h() {
            return d.g;
        }

        private a() {
        }
    }

    private /* synthetic */ d(int i2) {
        this.a = i2;
    }

    public static final /* synthetic */ d i(int i2) {
        return new d(i2);
    }

    public static int j(int i2) {
        return i2;
    }

    public static boolean k(int i2, Object obj) {
        return (obj instanceof d) && i2 == ((d) obj).o();
    }

    public static final boolean l(int i2, int i3) {
        return i2 == i3;
    }

    public static int m(int i2) {
        return Integer.hashCode(i2);
    }

    public static String n(int i2) {
        return l(i2, c) ? "Next" : l(i2, d) ? "Previous" : l(i2, e) ? "Left" : l(i2, f) ? "Right" : l(i2, g) ? "Up" : l(i2, h) ? "Down" : l(i2, i) ? "Enter" : l(i2, j) ? "Exit" : "Invalid FocusDirection";
    }

    public boolean equals(Object obj) {
        return k(this.a, obj);
    }

    public int hashCode() {
        return m(this.a);
    }

    public final /* synthetic */ int o() {
        return this.a;
    }

    public String toString() {
        return n(this.a);
    }
}
