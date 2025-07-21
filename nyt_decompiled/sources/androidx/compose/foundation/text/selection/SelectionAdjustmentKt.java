package androidx.compose.foundation.text.selection;

import androidx.compose.foundation.text.selection.e;
import androidx.compose.ui.text.i;
import defpackage.aj8;
import defpackage.c04;
import defpackage.d48;
import defpackage.qs2;
import defpackage.xi7;
import kotlin.LazyThreadSafetyMode;

/* loaded from: classes.dex */
public abstract class SelectionAdjustmentKt {
    /* JADX INFO: Access modifiers changed from: private */
    public static final e e(xi7 xi7Var, a aVar) {
        boolean z = xi7Var.g() == CrossStatus.CROSSED;
        return new e(f(xi7Var.j(), z, true, xi7Var.k(), aVar), f(xi7Var.i(), z, false, xi7Var.f(), aVar), z);
    }

    private static final e.a f(d dVar, boolean z, boolean z2, int i, a aVar) {
        int g = z2 ? dVar.g() : dVar.e();
        if (i != dVar.i()) {
            return dVar.a(g);
        }
        long a = aVar.a(dVar, g);
        return dVar.a(z ^ z2 ? i.n(a) : i.i(a));
    }

    private static final e.a g(e.a aVar, d dVar, int i) {
        return e.a.b(aVar, dVar.k().c(i), i, 0L, 4, null);
    }

    public static final e h(e eVar, xi7 xi7Var) {
        if (SelectionLayoutKt.d(eVar, xi7Var)) {
            return (xi7Var.a() > 1 || xi7Var.h() == null || xi7Var.c().c().length() == 0) ? eVar : i(eVar, xi7Var);
        }
        return eVar;
    }

    private static final e i(e eVar, xi7 xi7Var) {
        d c = xi7Var.c();
        String c2 = c.c();
        int g = c.g();
        int length = c2.length();
        if (g == 0) {
            int a = d48.a(c2, 0);
            return xi7Var.b() ? e.b(eVar, g(eVar.e(), c, a), null, true, 2, null) : e.b(eVar, null, g(eVar.c(), c, a), false, 1, null);
        }
        if (g == length) {
            int b = d48.b(c2, length);
            return xi7Var.b() ? e.b(eVar, g(eVar.e(), c, b), null, false, 2, null) : e.b(eVar, null, g(eVar.c(), c, b), true, 1, null);
        }
        e h = xi7Var.h();
        boolean z = h != null && h.d();
        int b2 = xi7Var.b() ^ z ? d48.b(c2, g) : d48.a(c2, g);
        return xi7Var.b() ? e.b(eVar, g(eVar.e(), c, b2), null, z, 2, null) : e.b(eVar, null, g(eVar.c(), c, b2), z, 1, null);
    }

    private static final boolean j(d dVar, int i, boolean z) {
        if (dVar.f() == -1) {
            return true;
        }
        if (i == dVar.f()) {
            return false;
        }
        if (z ^ (dVar.d() == CrossStatus.CROSSED)) {
            if (i < dVar.f()) {
                return true;
            }
        } else if (i > dVar.f()) {
            return true;
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final e.a k(d dVar, int i, int i2, int i3, boolean z, boolean z2) {
        long C = dVar.k().C(i2);
        int n = dVar.k().q(i.n(C)) == i ? i.n(C) : i >= dVar.k().n() ? dVar.k().u(dVar.k().n() - 1) : dVar.k().u(i);
        int i4 = dVar.k().q(i.i(C)) == i ? i.i(C) : i >= dVar.k().n() ? aj8.p(dVar.k(), dVar.k().n() - 1, false, 2, null) : aj8.p(dVar.k(), i, false, 2, null);
        if (n == i3) {
            return dVar.a(i4);
        }
        if (i4 == i3) {
            return dVar.a(n);
        }
        if (!(z ^ z2) ? i2 >= n : i2 > i4) {
            n = i4;
        }
        return dVar.a(n);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final e.a l(final xi7 xi7Var, final d dVar, e.a aVar) {
        final int g = xi7Var.b() ? dVar.g() : dVar.e();
        if ((xi7Var.b() ? xi7Var.k() : xi7Var.f()) != dVar.i()) {
            return dVar.a(g);
        }
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.NONE;
        final c04 b = kotlin.c.b(lazyThreadSafetyMode, new qs2() { // from class: androidx.compose.foundation.text.selection.SelectionAdjustmentKt$updateSelectionBoundary$currentRawLine$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // defpackage.qs2
            /* renamed from: invoke */
            public final Integer mo865invoke() {
                return Integer.valueOf(d.this.k().q(g));
            }
        });
        final int e = xi7Var.b() ? dVar.e() : dVar.g();
        final int i = g;
        c04 b2 = kotlin.c.b(lazyThreadSafetyMode, new qs2() { // from class: androidx.compose.foundation.text.selection.SelectionAdjustmentKt$updateSelectionBoundary$anchorSnappedToWordBoundary$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // defpackage.qs2
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public final e.a mo865invoke() {
                int m;
                e.a k;
                d dVar2 = d.this;
                m = SelectionAdjustmentKt.m(b);
                k = SelectionAdjustmentKt.k(dVar2, m, i, e, xi7Var.b(), xi7Var.g() == CrossStatus.CROSSED);
                return k;
            }
        });
        if (dVar.h() != aVar.d()) {
            return n(b2);
        }
        int f = dVar.f();
        if (g == f) {
            return aVar;
        }
        if (m(b) != dVar.k().q(f)) {
            return n(b2);
        }
        int c = aVar.c();
        long C = dVar.k().C(c);
        return !j(dVar, g, xi7Var.b()) ? dVar.a(g) : (c == i.n(C) || c == i.i(C)) ? n(b2) : dVar.a(g);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int m(c04 c04Var) {
        return ((Number) c04Var.getValue()).intValue();
    }

    private static final e.a n(c04 c04Var) {
        return (e.a) c04Var.getValue();
    }
}
