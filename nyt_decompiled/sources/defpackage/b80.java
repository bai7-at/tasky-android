package defpackage;

import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes.dex */
public interface b80 {

    public interface a {
        boolean a();
    }

    public static final class b {
        public static final a a = new a(null);
        private static final int b = g(1);
        private static final int c = g(2);
        private static final int d = g(3);
        private static final int e = g(4);
        private static final int f = g(5);
        private static final int g = g(6);

        public static final class a {
            public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final int a() {
                return b.f;
            }

            public final int b() {
                return b.c;
            }

            public final int c() {
                return b.b;
            }

            public final int d() {
                return b.g;
            }

            public final int e() {
                return b.d;
            }

            public final int f() {
                return b.e;
            }

            private a() {
            }
        }

        public static int g(int i) {
            return i;
        }

        public static final boolean h(int i, int i2) {
            return i == i2;
        }
    }

    Object l(int i, ss2 ss2Var);
}
