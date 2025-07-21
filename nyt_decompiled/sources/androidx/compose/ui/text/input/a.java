package androidx.compose.ui.text.input;

import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes.dex */
public final class a {
    public static final C0067a b = new C0067a(null);
    private static final int c = j(1);
    private static final int d = j(0);
    private static final int e = j(2);
    private static final int f = j(3);
    private static final int g = j(4);
    private static final int h = j(5);
    private static final int i = j(6);
    private static final int j = j(7);
    private final int a;

    /* renamed from: androidx.compose.ui.text.input.a$a, reason: collision with other inner class name */
    public static final class C0067a {
        public /* synthetic */ C0067a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final int a() {
            return a.c;
        }

        public final int b() {
            return a.j;
        }

        public final int c() {
            return a.e;
        }

        public final int d() {
            return a.i;
        }

        public final int e() {
            return a.d;
        }

        public final int f() {
            return a.h;
        }

        public final int g() {
            return a.f;
        }

        public final int h() {
            return a.g;
        }

        private C0067a() {
        }
    }

    private /* synthetic */ a(int i2) {
        this.a = i2;
    }

    public static final /* synthetic */ a i(int i2) {
        return new a(i2);
    }

    public static int j(int i2) {
        return i2;
    }

    public static boolean k(int i2, Object obj) {
        return (obj instanceof a) && i2 == ((a) obj).o();
    }

    public static final boolean l(int i2, int i3) {
        return i2 == i3;
    }

    public static int m(int i2) {
        return Integer.hashCode(i2);
    }

    public static String n(int i2) {
        return l(i2, d) ? "None" : l(i2, c) ? "Default" : l(i2, e) ? "Go" : l(i2, f) ? "Search" : l(i2, g) ? "Send" : l(i2, h) ? "Previous" : l(i2, i) ? "Next" : l(i2, j) ? "Done" : "Invalid";
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
