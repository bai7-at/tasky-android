package androidx.compose.ui;

import androidx.compose.ui.c;
import androidx.compose.ui.unit.LayoutDirection;

/* loaded from: classes.dex */
public interface Alignment {
    public static final a a = a.a;

    public static final class a {
        static final /* synthetic */ a a = new a();
        private static final Alignment b = new androidx.compose.ui.c(-1.0f, -1.0f);
        private static final Alignment c = new androidx.compose.ui.c(0.0f, -1.0f);
        private static final Alignment d = new androidx.compose.ui.c(1.0f, -1.0f);
        private static final Alignment e = new androidx.compose.ui.c(-1.0f, 0.0f);
        private static final Alignment f = new androidx.compose.ui.c(0.0f, 0.0f);
        private static final Alignment g = new androidx.compose.ui.c(1.0f, 0.0f);
        private static final Alignment h = new androidx.compose.ui.c(-1.0f, 1.0f);
        private static final Alignment i = new androidx.compose.ui.c(0.0f, 1.0f);
        private static final Alignment j = new androidx.compose.ui.c(1.0f, 1.0f);
        private static final c k = new c.b(-1.0f);
        private static final c l = new c.b(0.0f);
        private static final c m = new c.b(1.0f);
        private static final b n = new c.a(-1.0f);
        private static final b o = new c.a(0.0f);
        private static final b p = new c.a(1.0f);

        private a() {
        }

        public final c a() {
            return m;
        }

        public final Alignment b() {
            return i;
        }

        public final Alignment c() {
            return j;
        }

        public final Alignment d() {
            return h;
        }

        public final Alignment e() {
            return f;
        }

        public final Alignment f() {
            return g;
        }

        public final b g() {
            return o;
        }

        public final Alignment h() {
            return e;
        }

        public final c i() {
            return l;
        }

        public final b j() {
            return p;
        }

        public final b k() {
            return n;
        }

        public final c l() {
            return k;
        }

        public final Alignment m() {
            return c;
        }

        public final Alignment n() {
            return d;
        }

        public final Alignment o() {
            return b;
        }
    }

    public interface b {
        int a(int i, int i2, LayoutDirection layoutDirection);
    }

    public interface c {
        int a(int i, int i2);
    }

    long a(long j, long j2, LayoutDirection layoutDirection);
}
