package defpackage;

import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes.dex */
public final class q44 {
    public static final a b = new a(null);
    private static final int c;
    private static final int d;
    private static final int e;
    private static final int f;
    private final int a;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final int a() {
            return q44.c;
        }

        public final int b() {
            return q44.f;
        }

        private a() {
        }
    }

    public static final class b {
        public static final a a = new a(null);
        private static final int b = d(1);
        private static final int c = d(2);
        private static final int d = d(3);
        private static final int e = d(0);

        public static final class a {
            public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final int a() {
                return b.d;
            }

            public final int b() {
                return b.c;
            }

            public final int c() {
                return b.b;
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

        public static String f(int i) {
            return e(i, b) ? "Strategy.Simple" : e(i, c) ? "Strategy.HighQuality" : e(i, d) ? "Strategy.Balanced" : e(i, e) ? "Strategy.Unspecified" : "Invalid";
        }
    }

    public static final class c {
        public static final a a = new a(null);
        private static final int b = e(1);
        private static final int c = e(2);
        private static final int d = e(3);
        private static final int e = e(4);
        private static final int f = e(0);

        public static final class a {
            public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final int a() {
                return c.b;
            }

            public final int b() {
                return c.c;
            }

            public final int c() {
                return c.d;
            }

            public final int d() {
                return c.e;
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

        public static String g(int i) {
            return f(i, b) ? "Strictness.None" : f(i, c) ? "Strictness.Loose" : f(i, d) ? "Strictness.Normal" : f(i, e) ? "Strictness.Strict" : f(i, f) ? "Strictness.Unspecified" : "Invalid";
        }
    }

    public static final class d {
        public static final a a = new a(null);
        private static final int b = c(1);
        private static final int c = c(2);
        private static final int d = c(0);

        public static final class a {
            public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final int a() {
                return d.b;
            }

            public final int b() {
                return d.c;
            }

            private a() {
            }
        }

        public static int c(int i) {
            return i;
        }

        public static final boolean d(int i, int i2) {
            return i == i2;
        }

        public static String e(int i) {
            return d(i, b) ? "WordBreak.None" : d(i, c) ? "WordBreak.Phrase" : d(i, d) ? "WordBreak.Unspecified" : "Invalid";
        }
    }

    static {
        int e2;
        int e3;
        int e4;
        b.a aVar = b.a;
        int c2 = aVar.c();
        c.a aVar2 = c.a;
        int c3 = aVar2.c();
        d.a aVar3 = d.a;
        e2 = r44.e(c2, c3, aVar3.a());
        c = d(e2);
        e3 = r44.e(aVar.a(), aVar2.b(), aVar3.b());
        d = d(e3);
        e4 = r44.e(aVar.b(), aVar2.d(), aVar3.a());
        e = d(e4);
        f = d(0);
    }

    private /* synthetic */ q44(int i) {
        this.a = i;
    }

    public static final /* synthetic */ q44 c(int i) {
        return new q44(i);
    }

    private static int d(int i) {
        return i;
    }

    public static boolean e(int i, Object obj) {
        return (obj instanceof q44) && i == ((q44) obj).l();
    }

    public static final boolean f(int i, int i2) {
        return i == i2;
    }

    public static final int g(int i) {
        int f2;
        f2 = r44.f(i);
        return b.d(f2);
    }

    public static final int h(int i) {
        int g;
        g = r44.g(i);
        return c.e(g);
    }

    public static final int i(int i) {
        int h;
        h = r44.h(i);
        return d.c(h);
    }

    public static int j(int i) {
        return Integer.hashCode(i);
    }

    public static String k(int i) {
        return "LineBreak(strategy=" + ((Object) b.f(g(i))) + ", strictness=" + ((Object) c.g(h(i))) + ", wordBreak=" + ((Object) d.e(i(i))) + ')';
    }

    public boolean equals(Object obj) {
        return e(this.a, obj);
    }

    public int hashCode() {
        return j(this.a);
    }

    public final /* synthetic */ int l() {
        return this.a;
    }

    public String toString() {
        return k(this.a);
    }
}
