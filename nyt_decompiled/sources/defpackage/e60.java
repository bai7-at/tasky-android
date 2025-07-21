package defpackage;

import androidx.compose.ui.text.i;
import androidx.compose.ui.text.style.ResolvedTextDirection;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes.dex */
public abstract class e60 {
    public static final a h = new a(null);
    public static final int i = 8;
    private final androidx.compose.ui.text.a a;
    private final long b;
    private final aj8 c;
    private final id5 d;
    private final oj8 e;
    private long f;
    private androidx.compose.ui.text.a g;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    public /* synthetic */ e60(androidx.compose.ui.text.a aVar, long j, aj8 aj8Var, id5 id5Var, oj8 oj8Var, DefaultConstructorMarker defaultConstructorMarker) {
        this(aVar, j, aj8Var, id5Var, oj8Var);
    }

    private final e60 C() {
        int l;
        v().b();
        if (w().length() > 0 && (l = l()) != -1) {
            T(l);
        }
        zq3.f(this, "null cannot be cast to non-null type T of androidx.compose.foundation.text.selection.BaseTextPreparedSelection");
        return this;
    }

    private final e60 E() {
        Integer m;
        v().b();
        if (w().length() > 0 && (m = m()) != null) {
            T(m.intValue());
        }
        zq3.f(this, "null cannot be cast to non-null type T of androidx.compose.foundation.text.selection.BaseTextPreparedSelection");
        return this;
    }

    private final e60 F() {
        int q;
        v().b();
        if (w().length() > 0 && (q = q()) != -1) {
            T(q);
        }
        zq3.f(this, "null cannot be cast to non-null type T of androidx.compose.foundation.text.selection.BaseTextPreparedSelection");
        return this;
    }

    private final e60 H() {
        Integer t;
        v().b();
        if (w().length() > 0 && (t = t()) != null) {
            T(t.intValue());
        }
        zq3.f(this, "null cannot be cast to non-null type T of androidx.compose.foundation.text.selection.BaseTextPreparedSelection");
        return this;
    }

    private final int V() {
        return this.d.b(i.i(this.f));
    }

    private final int W() {
        return this.d.b(i.k(this.f));
    }

    private final int X() {
        return this.d.b(i.l(this.f));
    }

    private final int a(int i2) {
        return uo6.i(i2, w().length() - 1);
    }

    private final int g(aj8 aj8Var, int i2) {
        return this.d.a(aj8Var.o(aj8Var.q(i2), true));
    }

    static /* synthetic */ int h(e60 e60Var, aj8 aj8Var, int i2, int i3, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getLineEndByOffsetForLayout");
        }
        if ((i3 & 1) != 0) {
            i2 = e60Var.W();
        }
        return e60Var.g(aj8Var, i2);
    }

    private final int j(aj8 aj8Var, int i2) {
        return this.d.a(aj8Var.u(aj8Var.q(i2)));
    }

    static /* synthetic */ int k(e60 e60Var, aj8 aj8Var, int i2, int i3, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getLineStartByOffsetForLayout");
        }
        if ((i3 & 1) != 0) {
            i2 = e60Var.X();
        }
        return e60Var.j(aj8Var, i2);
    }

    private final int n(aj8 aj8Var, int i2) {
        while (i2 < this.a.length()) {
            long C = aj8Var.C(a(i2));
            if (i.i(C) > i2) {
                return this.d.a(i.i(C));
            }
            i2++;
        }
        return this.a.length();
    }

    static /* synthetic */ int o(e60 e60Var, aj8 aj8Var, int i2, int i3, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getNextWordOffsetForLayout");
        }
        if ((i3 & 1) != 0) {
            i2 = e60Var.V();
        }
        return e60Var.n(aj8Var, i2);
    }

    private final int r(aj8 aj8Var, int i2) {
        while (i2 > 0) {
            long C = aj8Var.C(a(i2));
            if (i.n(C) < i2) {
                return this.d.a(i.n(C));
            }
            i2--;
        }
        return 0;
    }

    static /* synthetic */ int s(e60 e60Var, aj8 aj8Var, int i2, int i3, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getPrevWordOffset");
        }
        if ((i3 & 1) != 0) {
            i2 = e60Var.V();
        }
        return e60Var.r(aj8Var, i2);
    }

    private final boolean x() {
        aj8 aj8Var = this.c;
        return (aj8Var != null ? aj8Var.y(V()) : null) != ResolvedTextDirection.Rtl;
    }

    private final int y(aj8 aj8Var, int i2) {
        int V = V();
        if (this.e.a() == null) {
            this.e.c(Float.valueOf(aj8Var.e(V).i()));
        }
        int q = aj8Var.q(V) + i2;
        if (q < 0) {
            return 0;
        }
        if (q >= aj8Var.n()) {
            return w().length();
        }
        float m = aj8Var.m(q) - 1;
        Float a2 = this.e.a();
        zq3.e(a2);
        float floatValue = a2.floatValue();
        if ((x() && floatValue >= aj8Var.t(q)) || (!x() && floatValue <= aj8Var.s(q))) {
            return aj8Var.o(q, true);
        }
        return this.d.a(aj8Var.x(hd5.a(a2.floatValue(), m)));
    }

    public final e60 A() {
        v().b();
        if (w().length() > 0) {
            if (x()) {
                F();
            } else {
                C();
            }
        }
        zq3.f(this, "null cannot be cast to non-null type T of androidx.compose.foundation.text.selection.BaseTextPreparedSelection");
        return this;
    }

    public final e60 B() {
        v().b();
        if (w().length() > 0) {
            if (x()) {
                H();
            } else {
                E();
            }
        }
        zq3.f(this, "null cannot be cast to non-null type T of androidx.compose.foundation.text.selection.BaseTextPreparedSelection");
        return this;
    }

    public final e60 D() {
        v().b();
        if (w().length() > 0) {
            int a2 = c48.a(w(), i.k(this.f));
            if (a2 == i.k(this.f) && a2 != w().length()) {
                a2 = c48.a(w(), a2 + 1);
            }
            T(a2);
        }
        zq3.f(this, "null cannot be cast to non-null type T of androidx.compose.foundation.text.selection.BaseTextPreparedSelection");
        return this;
    }

    public final e60 G() {
        v().b();
        if (w().length() > 0) {
            int b = c48.b(w(), i.l(this.f));
            if (b == i.l(this.f) && b != 0) {
                b = c48.b(w(), b - 1);
            }
            T(b);
        }
        zq3.f(this, "null cannot be cast to non-null type T of androidx.compose.foundation.text.selection.BaseTextPreparedSelection");
        return this;
    }

    public final e60 I() {
        v().b();
        if (w().length() > 0) {
            if (x()) {
                C();
            } else {
                F();
            }
        }
        zq3.f(this, "null cannot be cast to non-null type T of androidx.compose.foundation.text.selection.BaseTextPreparedSelection");
        return this;
    }

    public final e60 J() {
        v().b();
        if (w().length() > 0) {
            if (x()) {
                E();
            } else {
                H();
            }
        }
        zq3.f(this, "null cannot be cast to non-null type T of androidx.compose.foundation.text.selection.BaseTextPreparedSelection");
        return this;
    }

    public final e60 K() {
        v().b();
        if (w().length() > 0) {
            T(w().length());
        }
        zq3.f(this, "null cannot be cast to non-null type T of androidx.compose.foundation.text.selection.BaseTextPreparedSelection");
        return this;
    }

    public final e60 L() {
        v().b();
        if (w().length() > 0) {
            T(0);
        }
        zq3.f(this, "null cannot be cast to non-null type T of androidx.compose.foundation.text.selection.BaseTextPreparedSelection");
        return this;
    }

    public final e60 M() {
        Integer f;
        v().b();
        if (w().length() > 0 && (f = f()) != null) {
            T(f.intValue());
        }
        zq3.f(this, "null cannot be cast to non-null type T of androidx.compose.foundation.text.selection.BaseTextPreparedSelection");
        return this;
    }

    public final e60 N() {
        v().b();
        if (w().length() > 0) {
            if (x()) {
                P();
            } else {
                M();
            }
        }
        zq3.f(this, "null cannot be cast to non-null type T of androidx.compose.foundation.text.selection.BaseTextPreparedSelection");
        return this;
    }

    public final e60 O() {
        v().b();
        if (w().length() > 0) {
            if (x()) {
                M();
            } else {
                P();
            }
        }
        zq3.f(this, "null cannot be cast to non-null type T of androidx.compose.foundation.text.selection.BaseTextPreparedSelection");
        return this;
    }

    public final e60 P() {
        Integer i2;
        v().b();
        if (w().length() > 0 && (i2 = i()) != null) {
            T(i2.intValue());
        }
        zq3.f(this, "null cannot be cast to non-null type T of androidx.compose.foundation.text.selection.BaseTextPreparedSelection");
        return this;
    }

    public final e60 Q() {
        aj8 aj8Var;
        if (w().length() > 0 && (aj8Var = this.c) != null) {
            T(y(aj8Var, -1));
        }
        zq3.f(this, "null cannot be cast to non-null type T of androidx.compose.foundation.text.selection.BaseTextPreparedSelection");
        return this;
    }

    public final e60 R() {
        v().b();
        if (w().length() > 0) {
            U(0, w().length());
        }
        zq3.f(this, "null cannot be cast to non-null type T of androidx.compose.foundation.text.selection.BaseTextPreparedSelection");
        return this;
    }

    public final e60 S() {
        if (w().length() > 0) {
            this.f = pj8.b(i.n(this.b), i.i(this.f));
        }
        zq3.f(this, "null cannot be cast to non-null type T of androidx.compose.foundation.text.selection.BaseTextPreparedSelection");
        return this;
    }

    protected final void T(int i2) {
        U(i2, i2);
    }

    protected final void U(int i2, int i3) {
        this.f = pj8.b(i2, i3);
    }

    public final e60 b(ss2 ss2Var) {
        v().b();
        if (w().length() > 0) {
            if (i.h(this.f)) {
                zq3.f(this, "null cannot be cast to non-null type T of androidx.compose.foundation.text.selection.BaseTextPreparedSelection.collapseLeftOr$lambda$4");
                ss2Var.invoke(this);
            } else if (x()) {
                T(i.l(this.f));
            } else {
                T(i.k(this.f));
            }
        }
        zq3.f(this, "null cannot be cast to non-null type T of androidx.compose.foundation.text.selection.BaseTextPreparedSelection");
        return this;
    }

    public final e60 c(ss2 ss2Var) {
        v().b();
        if (w().length() > 0) {
            if (i.h(this.f)) {
                zq3.f(this, "null cannot be cast to non-null type T of androidx.compose.foundation.text.selection.BaseTextPreparedSelection.collapseRightOr$lambda$5");
                ss2Var.invoke(this);
            } else if (x()) {
                T(i.k(this.f));
            } else {
                T(i.l(this.f));
            }
        }
        zq3.f(this, "null cannot be cast to non-null type T of androidx.compose.foundation.text.selection.BaseTextPreparedSelection");
        return this;
    }

    public final e60 d() {
        v().b();
        if (w().length() > 0) {
            T(i.i(this.f));
        }
        zq3.f(this, "null cannot be cast to non-null type T of androidx.compose.foundation.text.selection.BaseTextPreparedSelection");
        return this;
    }

    public final androidx.compose.ui.text.a e() {
        return this.g;
    }

    public final Integer f() {
        aj8 aj8Var = this.c;
        if (aj8Var != null) {
            return Integer.valueOf(h(this, aj8Var, 0, 1, null));
        }
        return null;
    }

    public final Integer i() {
        aj8 aj8Var = this.c;
        if (aj8Var != null) {
            return Integer.valueOf(k(this, aj8Var, 0, 1, null));
        }
        return null;
    }

    public final int l() {
        return d48.a(this.g.j(), i.i(this.f));
    }

    public final Integer m() {
        aj8 aj8Var = this.c;
        if (aj8Var != null) {
            return Integer.valueOf(o(this, aj8Var, 0, 1, null));
        }
        return null;
    }

    public final id5 p() {
        return this.d;
    }

    public final int q() {
        return d48.b(this.g.j(), i.i(this.f));
    }

    public final Integer t() {
        aj8 aj8Var = this.c;
        if (aj8Var != null) {
            return Integer.valueOf(s(this, aj8Var, 0, 1, null));
        }
        return null;
    }

    public final long u() {
        return this.f;
    }

    public final oj8 v() {
        return this.e;
    }

    public final String w() {
        return this.g.j();
    }

    public final e60 z() {
        aj8 aj8Var;
        if (w().length() > 0 && (aj8Var = this.c) != null) {
            T(y(aj8Var, 1));
        }
        zq3.f(this, "null cannot be cast to non-null type T of androidx.compose.foundation.text.selection.BaseTextPreparedSelection");
        return this;
    }

    private e60(androidx.compose.ui.text.a aVar, long j, aj8 aj8Var, id5 id5Var, oj8 oj8Var) {
        this.a = aVar;
        this.b = j;
        this.c = aj8Var;
        this.d = id5Var;
        this.e = oj8Var;
        this.f = j;
        this.g = aVar;
    }
}
