package defpackage;

import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes.dex */
public final class ij8 {
    public static final a c;
    private static final ij8 d;
    private static final ij8 e;
    private final int a;
    private final boolean b;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final ij8 a() {
            return ij8.d;
        }

        private a() {
        }
    }

    public static final class b {
        public static final a a = new a(null);
        private static final int b = d(1);
        private static final int c = d(2);
        private static final int d = d(3);

        public static final class a {
            public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final int a() {
                return b.c;
            }

            public final int b() {
                return b.b;
            }

            public final int c() {
                return b.d;
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
    }

    static {
        DefaultConstructorMarker defaultConstructorMarker = null;
        c = new a(defaultConstructorMarker);
        b.a aVar = b.a;
        d = new ij8(aVar.a(), false, defaultConstructorMarker);
        e = new ij8(aVar.b(), true, defaultConstructorMarker);
    }

    public /* synthetic */ ij8(int i, boolean z, DefaultConstructorMarker defaultConstructorMarker) {
        this(i, z);
    }

    public final int b() {
        return this.a;
    }

    public final boolean c() {
        return this.b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ij8)) {
            return false;
        }
        ij8 ij8Var = (ij8) obj;
        return b.e(this.a, ij8Var.a) && this.b == ij8Var.b;
    }

    public int hashCode() {
        return (b.f(this.a) * 31) + Boolean.hashCode(this.b);
    }

    public String toString() {
        return zq3.c(this, d) ? "TextMotion.Static" : zq3.c(this, e) ? "TextMotion.Animated" : "Invalid";
    }

    private ij8(int i, boolean z) {
        this.a = i;
        this.b = z;
    }
}
