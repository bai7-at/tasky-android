package defpackage;

import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes.dex */
public final class u44 {
    public static final b c;
    private static final u44 d;
    private final float a;
    private final int b;

    public static final class a {
        public static final C0543a a = new C0543a(null);
        private static final float b = c(0.0f);
        private static final float c = c(0.5f);
        private static final float d = c(-1.0f);
        private static final float e = c(1.0f);

        /* renamed from: u44$a$a, reason: collision with other inner class name */
        public static final class C0543a {
            public /* synthetic */ C0543a(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final float a() {
                return a.c;
            }

            public final float b() {
                return a.d;
            }

            private C0543a() {
            }
        }

        public static float c(float f) {
            if ((0.0f > f || f > 1.0f) && f != -1.0f) {
                throw new IllegalStateException("topRatio should be in [0..1] range or -1");
            }
            return f;
        }

        public static final boolean d(float f, float f2) {
            return Float.compare(f, f2) == 0;
        }

        public static int e(float f) {
            return Float.hashCode(f);
        }

        public static String f(float f) {
            if (f == b) {
                return "LineHeightStyle.Alignment.Top";
            }
            if (f == c) {
                return "LineHeightStyle.Alignment.Center";
            }
            if (f == d) {
                return "LineHeightStyle.Alignment.Proportional";
            }
            if (f == e) {
                return "LineHeightStyle.Alignment.Bottom";
            }
            return "LineHeightStyle.Alignment(topPercentage = " + f + ')';
        }
    }

    public static final class b {
        public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final u44 a() {
            return u44.d;
        }

        private b() {
        }
    }

    public static final class c {
        public static final a a = new a(null);
        private static final int b = c(1);
        private static final int c = c(16);
        private static final int d = c(17);
        private static final int e = c(0);

        public static final class a {
            public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final int a() {
                return c.d;
            }

            public final int b() {
                return c.e;
            }

            private a() {
            }
        }

        private static int c(int i) {
            return i;
        }

        public static final boolean d(int i, int i2) {
            return i == i2;
        }

        public static int e(int i) {
            return Integer.hashCode(i);
        }

        public static final boolean f(int i) {
            return (i & 1) > 0;
        }

        public static final boolean g(int i) {
            return (i & 16) > 0;
        }

        public static String h(int i) {
            return i == b ? "LineHeightStyle.Trim.FirstLineTop" : i == c ? "LineHeightStyle.Trim.LastLineBottom" : i == d ? "LineHeightStyle.Trim.Both" : i == e ? "LineHeightStyle.Trim.None" : "Invalid";
        }
    }

    static {
        DefaultConstructorMarker defaultConstructorMarker = null;
        c = new b(defaultConstructorMarker);
        d = new u44(a.a.b(), c.a.a(), defaultConstructorMarker);
    }

    public /* synthetic */ u44(float f, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(f, i);
    }

    public final float b() {
        return this.a;
    }

    public final int c() {
        return this.b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof u44)) {
            return false;
        }
        u44 u44Var = (u44) obj;
        return a.d(this.a, u44Var.a) && c.d(this.b, u44Var.b);
    }

    public int hashCode() {
        return (a.e(this.a) * 31) + c.e(this.b);
    }

    public String toString() {
        return "LineHeightStyle(alignment=" + ((Object) a.f(this.a)) + ", trim=" + ((Object) c.h(this.b)) + ')';
    }

    private u44(float f, int i) {
        this.a = f;
        this.b = i;
    }
}
