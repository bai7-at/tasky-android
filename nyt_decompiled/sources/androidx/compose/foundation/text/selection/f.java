package androidx.compose.foundation.text.selection;

import androidx.compose.foundation.text.selection.e;
import androidx.compose.foundation.text.selection.f;
import defpackage.c48;
import defpackage.xi7;
import defpackage.zq3;

/* loaded from: classes.dex */
public interface f {
    public static final a a = a.a;

    public static final class a {
        static final /* synthetic */ a a = new a();
        private static final f b = new f() { // from class: pi7
            @Override // androidx.compose.foundation.text.selection.f
            public final e a(xi7 xi7Var) {
                e h;
                h = f.a.h(xi7Var);
                return h;
            }
        };
        private static final f c = new f() { // from class: qi7
            @Override // androidx.compose.foundation.text.selection.f
            public final e a(xi7 xi7Var) {
                e f2;
                f2 = f.a.f(xi7Var);
                return f2;
            }
        };
        private static final f d = new f() { // from class: ri7
            @Override // androidx.compose.foundation.text.selection.f
            public final e a(xi7 xi7Var) {
                e j;
                j = f.a.j(xi7Var);
                return j;
            }
        };
        private static final f e = new f() { // from class: si7
            @Override // androidx.compose.foundation.text.selection.f
            public final e a(xi7 xi7Var) {
                e i;
                i = f.a.i(xi7Var);
                return i;
            }
        };
        private static final f f = new f() { // from class: ti7
            @Override // androidx.compose.foundation.text.selection.f
            public final e a(xi7 xi7Var) {
                e g;
                g = f.a.g(xi7Var);
                return g;
            }
        };

        /* renamed from: androidx.compose.foundation.text.selection.f$a$a, reason: collision with other inner class name */
        static final class C0042a implements androidx.compose.foundation.text.selection.a {
            public static final C0042a a = new C0042a();

            C0042a() {
            }

            @Override // androidx.compose.foundation.text.selection.a
            public final long a(d dVar, int i) {
                return c48.c(dVar.c(), i);
            }
        }

        static final class b implements androidx.compose.foundation.text.selection.a {
            public static final b a = new b();

            b() {
            }

            @Override // androidx.compose.foundation.text.selection.a
            public final long a(d dVar, int i) {
                return dVar.k().C(i);
            }
        }

        private a() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final e f(xi7 xi7Var) {
            return SelectionAdjustmentKt.h(b.a(xi7Var), xi7Var);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final e g(xi7 xi7Var) {
            e.a c2;
            e.a l;
            e.a e2;
            e.a aVar;
            e h = xi7Var.h();
            if (h == null) {
                return d.a(xi7Var);
            }
            if (xi7Var.b()) {
                c2 = h.e();
                l = SelectionAdjustmentKt.l(xi7Var, xi7Var.j(), c2);
                aVar = h.c();
                e2 = l;
            } else {
                c2 = h.c();
                l = SelectionAdjustmentKt.l(xi7Var, xi7Var.i(), c2);
                e2 = h.e();
                aVar = l;
            }
            if (zq3.c(l, c2)) {
                return h;
            }
            return SelectionAdjustmentKt.h(new e(e2, aVar, xi7Var.g() == CrossStatus.CROSSED || (xi7Var.g() == CrossStatus.COLLAPSED && e2.c() > aVar.c())), xi7Var);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final e h(xi7 xi7Var) {
            return new e(xi7Var.j().a(xi7Var.j().g()), xi7Var.i().a(xi7Var.i().e()), xi7Var.g() == CrossStatus.CROSSED);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final e i(xi7 xi7Var) {
            e e2;
            e2 = SelectionAdjustmentKt.e(xi7Var, C0042a.a);
            return e2;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final e j(xi7 xi7Var) {
            e e2;
            e2 = SelectionAdjustmentKt.e(xi7Var, b.a);
            return e2;
        }

        public final f k() {
            return f;
        }

        public final f l() {
            return b;
        }

        public final f m() {
            return e;
        }

        public final f n() {
            return d;
        }
    }

    e a(xi7 xi7Var);
}
