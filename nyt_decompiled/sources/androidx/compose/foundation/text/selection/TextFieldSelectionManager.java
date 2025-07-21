package androidx.compose.foundation.text.selection;

import androidx.compose.foundation.text.Handle;
import androidx.compose.foundation.text.HandleState;
import androidx.compose.foundation.text.TextFieldCursorKt;
import androidx.compose.foundation.text.TextFieldState;
import androidx.compose.runtime.b0;
import androidx.compose.ui.focus.FocusRequester;
import androidx.compose.ui.platform.TextToolbarStatus;
import androidx.compose.ui.text.i;
import androidx.compose.ui.text.input.TextFieldValue;
import defpackage.aj8;
import defpackage.bj8;
import defpackage.bk8;
import defpackage.bu1;
import defpackage.cz3;
import defpackage.fd5;
import defpackage.fm1;
import defpackage.hd5;
import defpackage.hp5;
import defpackage.id5;
import defpackage.iw4;
import defpackage.ji8;
import defpackage.jw8;
import defpackage.kc9;
import defpackage.kt6;
import defpackage.pj8;
import defpackage.qs2;
import defpackage.rh8;
import defpackage.sl0;
import defpackage.ss2;
import defpackage.sy4;
import defpackage.tj8;
import defpackage.u63;
import defpackage.uo6;
import defpackage.w63;
import defpackage.wi7;
import defpackage.ww8;
import defpackage.x29;
import defpackage.xh8;
import defpackage.xi7;
import defpackage.zq3;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes.dex */
public final class TextFieldSelectionManager {
    private final jw8 a;
    private TextFieldState d;
    private sl0 g;
    private bk8 h;
    private u63 i;
    private FocusRequester j;
    private long l;
    private Integer m;
    private long n;
    private final sy4 o;
    private final sy4 p;
    private int q;
    private TextFieldValue r;
    private xi7 s;
    private final xh8 t;
    private final iw4 u;
    private id5 b = x29.b();
    private ss2 c = new ss2() { // from class: androidx.compose.foundation.text.selection.TextFieldSelectionManager$onValueChange$1
        public final void b(TextFieldValue textFieldValue) {
        }

        @Override // defpackage.ss2
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            b((TextFieldValue) obj);
            return ww8.a;
        }
    };
    private final sy4 e = b0.e(new TextFieldValue((String) null, 0, (i) null, 7, (DefaultConstructorMarker) null), null, 2, null);
    private kc9 f = kc9.a.c();
    private final sy4 k = b0.e(Boolean.TRUE, null, 2, null);

    public static final class a implements xh8 {
        a() {
        }

        @Override // defpackage.xh8
        public void a() {
            TextFieldSelectionManager.this.T(null);
            TextFieldSelectionManager.this.S(null);
        }

        @Override // defpackage.xh8
        public void b() {
        }

        @Override // defpackage.xh8
        public void c(long j) {
        }

        @Override // defpackage.xh8
        public void d(long j) {
            bj8 h;
            long a = wi7.a(TextFieldSelectionManager.this.D(true));
            TextFieldState I = TextFieldSelectionManager.this.I();
            if (I == null || (h = I.h()) == null) {
                return;
            }
            long k = h.k(a);
            TextFieldSelectionManager.this.l = k;
            TextFieldSelectionManager.this.S(fd5.d(k));
            TextFieldSelectionManager.this.n = fd5.b.c();
            TextFieldSelectionManager.this.T(Handle.Cursor);
            TextFieldSelectionManager.this.f0(false);
        }

        @Override // defpackage.xh8
        public void e() {
            TextFieldSelectionManager.this.T(null);
            TextFieldSelectionManager.this.S(null);
        }

        @Override // defpackage.xh8
        public void f(long j) {
            bj8 h;
            u63 E;
            TextFieldSelectionManager textFieldSelectionManager = TextFieldSelectionManager.this;
            textFieldSelectionManager.n = fd5.t(textFieldSelectionManager.n, j);
            TextFieldState I = TextFieldSelectionManager.this.I();
            if (I == null || (h = I.h()) == null) {
                return;
            }
            TextFieldSelectionManager textFieldSelectionManager2 = TextFieldSelectionManager.this;
            textFieldSelectionManager2.S(fd5.d(fd5.t(textFieldSelectionManager2.l, textFieldSelectionManager2.n)));
            id5 G = textFieldSelectionManager2.G();
            fd5 y = textFieldSelectionManager2.y();
            zq3.e(y);
            int a = G.a(bj8.e(h, y.x(), false, 2, null));
            long b = pj8.b(a, a);
            if (i.g(b, textFieldSelectionManager2.L().g())) {
                return;
            }
            TextFieldState I2 = textFieldSelectionManager2.I();
            if ((I2 == null || I2.u()) && (E = textFieldSelectionManager2.E()) != null) {
                E.a(w63.a.b());
            }
            textFieldSelectionManager2.H().invoke(textFieldSelectionManager2.p(textFieldSelectionManager2.L().e(), b));
        }
    }

    public static final class b implements xh8 {
        final /* synthetic */ boolean b;

        b(boolean z) {
            this.b = z;
        }

        @Override // defpackage.xh8
        public void a() {
            TextFieldSelectionManager.this.T(null);
            TextFieldSelectionManager.this.S(null);
            TextFieldSelectionManager.this.f0(true);
        }

        @Override // defpackage.xh8
        public void b() {
        }

        @Override // defpackage.xh8
        public void c(long j) {
            bj8 h;
            TextFieldSelectionManager.this.T(this.b ? Handle.SelectionStart : Handle.SelectionEnd);
            long a = wi7.a(TextFieldSelectionManager.this.D(this.b));
            TextFieldState I = TextFieldSelectionManager.this.I();
            if (I == null || (h = I.h()) == null) {
                return;
            }
            long k = h.k(a);
            TextFieldSelectionManager.this.l = k;
            TextFieldSelectionManager.this.S(fd5.d(k));
            TextFieldSelectionManager.this.n = fd5.b.c();
            TextFieldSelectionManager.this.q = -1;
            TextFieldState I2 = TextFieldSelectionManager.this.I();
            if (I2 != null) {
                I2.y(true);
            }
            TextFieldSelectionManager.this.f0(false);
        }

        @Override // defpackage.xh8
        public void d(long j) {
        }

        @Override // defpackage.xh8
        public void e() {
            TextFieldSelectionManager.this.T(null);
            TextFieldSelectionManager.this.S(null);
            TextFieldSelectionManager.this.f0(true);
        }

        @Override // defpackage.xh8
        public void f(long j) {
            TextFieldSelectionManager textFieldSelectionManager = TextFieldSelectionManager.this;
            textFieldSelectionManager.n = fd5.t(textFieldSelectionManager.n, j);
            TextFieldSelectionManager textFieldSelectionManager2 = TextFieldSelectionManager.this;
            textFieldSelectionManager2.S(fd5.d(fd5.t(textFieldSelectionManager2.l, TextFieldSelectionManager.this.n)));
            TextFieldSelectionManager textFieldSelectionManager3 = TextFieldSelectionManager.this;
            TextFieldValue L = textFieldSelectionManager3.L();
            fd5 y = TextFieldSelectionManager.this.y();
            zq3.e(y);
            textFieldSelectionManager3.g0(L, y.x(), false, this.b, f.a.k(), true);
            TextFieldSelectionManager.this.f0(false);
        }
    }

    public static final class c implements iw4 {
        c() {
        }

        @Override // defpackage.iw4
        public void a() {
        }

        @Override // defpackage.iw4
        public boolean b(long j) {
            TextFieldState I;
            if (TextFieldSelectionManager.this.L().h().length() == 0 || (I = TextFieldSelectionManager.this.I()) == null || I.h() == null) {
                return false;
            }
            TextFieldSelectionManager textFieldSelectionManager = TextFieldSelectionManager.this;
            textFieldSelectionManager.g0(textFieldSelectionManager.L(), j, false, false, f.a.l(), false);
            return true;
        }

        @Override // defpackage.iw4
        public boolean c(long j, f fVar) {
            TextFieldState I;
            if (TextFieldSelectionManager.this.L().h().length() == 0 || (I = TextFieldSelectionManager.this.I()) == null || I.h() == null) {
                return false;
            }
            FocusRequester C = TextFieldSelectionManager.this.C();
            if (C != null) {
                C.e();
            }
            TextFieldSelectionManager.this.l = j;
            TextFieldSelectionManager.this.q = -1;
            TextFieldSelectionManager.v(TextFieldSelectionManager.this, false, 1, null);
            TextFieldSelectionManager textFieldSelectionManager = TextFieldSelectionManager.this;
            textFieldSelectionManager.g0(textFieldSelectionManager.L(), TextFieldSelectionManager.this.l, true, false, fVar, false);
            return true;
        }

        @Override // defpackage.iw4
        public boolean d(long j, f fVar) {
            TextFieldState I;
            if (TextFieldSelectionManager.this.L().h().length() == 0 || (I = TextFieldSelectionManager.this.I()) == null || I.h() == null) {
                return false;
            }
            TextFieldSelectionManager textFieldSelectionManager = TextFieldSelectionManager.this;
            textFieldSelectionManager.g0(textFieldSelectionManager.L(), j, false, false, fVar, false);
            return true;
        }

        @Override // defpackage.iw4
        public boolean e(long j) {
            TextFieldState I = TextFieldSelectionManager.this.I();
            if (I == null || I.h() == null) {
                return false;
            }
            TextFieldSelectionManager.this.q = -1;
            TextFieldSelectionManager textFieldSelectionManager = TextFieldSelectionManager.this;
            textFieldSelectionManager.g0(textFieldSelectionManager.L(), j, false, false, f.a.l(), false);
            return true;
        }
    }

    public static final class d implements xh8 {
        d() {
        }

        @Override // defpackage.xh8
        public void a() {
            TextFieldSelectionManager.this.T(null);
            TextFieldSelectionManager.this.S(null);
            TextFieldSelectionManager.this.f0(true);
            TextFieldSelectionManager.this.m = null;
        }

        @Override // defpackage.xh8
        public void b() {
        }

        @Override // defpackage.xh8
        public void c(long j) {
        }

        @Override // defpackage.xh8
        public void d(long j) {
            bj8 h;
            bj8 h2;
            if (TextFieldSelectionManager.this.A() != null) {
                return;
            }
            TextFieldSelectionManager.this.T(Handle.SelectionEnd);
            TextFieldSelectionManager.this.q = -1;
            TextFieldSelectionManager.this.N();
            TextFieldState I = TextFieldSelectionManager.this.I();
            if (I == null || (h2 = I.h()) == null || !h2.g(j)) {
                TextFieldState I2 = TextFieldSelectionManager.this.I();
                if (I2 != null && (h = I2.h()) != null) {
                    TextFieldSelectionManager textFieldSelectionManager = TextFieldSelectionManager.this;
                    int a = textFieldSelectionManager.G().a(bj8.e(h, j, false, 2, null));
                    TextFieldValue p = textFieldSelectionManager.p(textFieldSelectionManager.L().e(), pj8.b(a, a));
                    textFieldSelectionManager.u(false);
                    textFieldSelectionManager.W(HandleState.Cursor);
                    u63 E = textFieldSelectionManager.E();
                    if (E != null) {
                        E.a(w63.a.b());
                    }
                    textFieldSelectionManager.H().invoke(p);
                }
            } else {
                if (TextFieldSelectionManager.this.L().h().length() == 0) {
                    return;
                }
                TextFieldSelectionManager.this.u(false);
                TextFieldSelectionManager textFieldSelectionManager2 = TextFieldSelectionManager.this;
                TextFieldSelectionManager.this.m = Integer.valueOf(i.n(textFieldSelectionManager2.g0(TextFieldValue.c(textFieldSelectionManager2.L(), null, i.b.a(), null, 5, null), j, true, false, f.a.k(), true)));
            }
            TextFieldSelectionManager.this.l = j;
            TextFieldSelectionManager textFieldSelectionManager3 = TextFieldSelectionManager.this;
            textFieldSelectionManager3.S(fd5.d(textFieldSelectionManager3.l));
            TextFieldSelectionManager.this.n = fd5.b.c();
        }

        @Override // defpackage.xh8
        public void e() {
        }

        @Override // defpackage.xh8
        public void f(long j) {
            bj8 h;
            long g0;
            if (TextFieldSelectionManager.this.L().h().length() == 0) {
                return;
            }
            TextFieldSelectionManager textFieldSelectionManager = TextFieldSelectionManager.this;
            textFieldSelectionManager.n = fd5.t(textFieldSelectionManager.n, j);
            TextFieldState I = TextFieldSelectionManager.this.I();
            if (I != null && (h = I.h()) != null) {
                TextFieldSelectionManager textFieldSelectionManager2 = TextFieldSelectionManager.this;
                textFieldSelectionManager2.S(fd5.d(fd5.t(textFieldSelectionManager2.l, textFieldSelectionManager2.n)));
                if (textFieldSelectionManager2.m == null) {
                    fd5 y = textFieldSelectionManager2.y();
                    zq3.e(y);
                    if (!h.g(y.x())) {
                        int a = textFieldSelectionManager2.G().a(bj8.e(h, textFieldSelectionManager2.l, false, 2, null));
                        id5 G = textFieldSelectionManager2.G();
                        fd5 y2 = textFieldSelectionManager2.y();
                        zq3.e(y2);
                        f l = a == G.a(bj8.e(h, y2.x(), false, 2, null)) ? f.a.l() : f.a.k();
                        TextFieldValue L = textFieldSelectionManager2.L();
                        fd5 y3 = textFieldSelectionManager2.y();
                        zq3.e(y3);
                        g0 = textFieldSelectionManager2.g0(L, y3.x(), false, false, l, true);
                        i.b(g0);
                    }
                }
                Integer num = textFieldSelectionManager2.m;
                int intValue = num != null ? num.intValue() : h.d(textFieldSelectionManager2.l, false);
                fd5 y4 = textFieldSelectionManager2.y();
                zq3.e(y4);
                int d = h.d(y4.x(), false);
                if (textFieldSelectionManager2.m == null && intValue == d) {
                    return;
                }
                TextFieldValue L2 = textFieldSelectionManager2.L();
                fd5 y5 = textFieldSelectionManager2.y();
                zq3.e(y5);
                g0 = textFieldSelectionManager2.g0(L2, y5.x(), false, false, f.a.k(), true);
                i.b(g0);
            }
            TextFieldSelectionManager.this.f0(false);
        }
    }

    public TextFieldSelectionManager(jw8 jw8Var) {
        this.a = jw8Var;
        fd5.a aVar = fd5.b;
        this.l = aVar.c();
        this.n = aVar.c();
        this.o = b0.e(null, null, 2, null);
        this.p = b0.e(null, null, 2, null);
        this.q = -1;
        this.r = new TextFieldValue((String) null, 0L, (i) null, 7, (DefaultConstructorMarker) null);
        this.t = new d();
        this.u = new c();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void S(fd5 fd5Var) {
        this.p.setValue(fd5Var);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void T(Handle handle) {
        this.o.setValue(handle);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void W(HandleState handleState) {
        TextFieldState textFieldState = this.d;
        if (textFieldState != null) {
            if (textFieldState.c() == handleState) {
                textFieldState = null;
            }
            if (textFieldState != null) {
                textFieldState.w(handleState);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void f0(boolean z) {
        TextFieldState textFieldState = this.d;
        if (textFieldState != null) {
            textFieldState.E(z);
        }
        if (z) {
            e0();
        } else {
            N();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final long g0(TextFieldValue textFieldValue, long j, boolean z, boolean z2, f fVar, boolean z3) {
        bj8 h;
        u63 u63Var;
        int i;
        TextFieldState textFieldState = this.d;
        if (textFieldState == null || (h = textFieldState.h()) == null) {
            return i.b.a();
        }
        long b2 = pj8.b(this.b.b(i.n(textFieldValue.g())), this.b.b(i.i(textFieldValue.g())));
        int d2 = h.d(j, false);
        int n = (z2 || z) ? d2 : i.n(b2);
        int i2 = (!z2 || z) ? d2 : i.i(b2);
        xi7 xi7Var = this.s;
        int i3 = -1;
        if (!z && xi7Var != null && (i = this.q) != -1) {
            i3 = i;
        }
        xi7 c2 = SelectionLayoutKt.c(h.f(), n, i2, i3, b2, z, z2);
        if (!c2.l(xi7Var)) {
            return textFieldValue.g();
        }
        this.s = c2;
        this.q = d2;
        e a2 = fVar.a(c2);
        long b3 = pj8.b(this.b.a(a2.e().c()), this.b.a(a2.c().c()));
        if (i.g(b3, textFieldValue.g())) {
            return textFieldValue.g();
        }
        boolean z4 = i.m(b3) != i.m(textFieldValue.g()) && i.g(pj8.b(i.i(b3), i.n(b3)), textFieldValue.g());
        boolean z5 = i.h(b3) && i.h(textFieldValue.g());
        if (z3 && textFieldValue.h().length() > 0 && !z4 && !z5 && (u63Var = this.i) != null) {
            u63Var.a(w63.a.b());
        }
        TextFieldValue p = p(textFieldValue.e(), b3);
        this.c.invoke(p);
        W(i.h(p.g()) ? HandleState.Cursor : HandleState.Selection);
        TextFieldState textFieldState2 = this.d;
        if (textFieldState2 != null) {
            textFieldState2.y(z3);
        }
        TextFieldState textFieldState3 = this.d;
        if (textFieldState3 != null) {
            textFieldState3.G(TextFieldSelectionManagerKt.c(this, true));
        }
        TextFieldState textFieldState4 = this.d;
        if (textFieldState4 != null) {
            textFieldState4.F(TextFieldSelectionManagerKt.c(this, false));
        }
        return b3;
    }

    public static /* synthetic */ void o(TextFieldSelectionManager textFieldSelectionManager, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            z = true;
        }
        textFieldSelectionManager.n(z);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final TextFieldValue p(androidx.compose.ui.text.a aVar, long j) {
        return new TextFieldValue(aVar, j, (i) null, 4, (DefaultConstructorMarker) null);
    }

    public static /* synthetic */ void t(TextFieldSelectionManager textFieldSelectionManager, fd5 fd5Var, int i, Object obj) {
        if ((i & 1) != 0) {
            fd5Var = null;
        }
        textFieldSelectionManager.s(fd5Var);
    }

    public static /* synthetic */ void v(TextFieldSelectionManager textFieldSelectionManager, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            z = true;
        }
        textFieldSelectionManager.u(z);
    }

    private final kt6 x() {
        float f;
        cz3 g;
        aj8 f2;
        kt6 e;
        cz3 g2;
        aj8 f3;
        kt6 e2;
        cz3 g3;
        cz3 g4;
        TextFieldState textFieldState = this.d;
        if (textFieldState != null) {
            if (textFieldState.v()) {
                textFieldState = null;
            }
            if (textFieldState != null) {
                int b2 = this.b.b(i.n(L().g()));
                int b3 = this.b.b(i.i(L().g()));
                TextFieldState textFieldState2 = this.d;
                long c2 = (textFieldState2 == null || (g4 = textFieldState2.g()) == null) ? fd5.b.c() : g4.g0(D(true));
                TextFieldState textFieldState3 = this.d;
                long c3 = (textFieldState3 == null || (g3 = textFieldState3.g()) == null) ? fd5.b.c() : g3.g0(D(false));
                TextFieldState textFieldState4 = this.d;
                float f4 = 0.0f;
                if (textFieldState4 == null || (g2 = textFieldState4.g()) == null) {
                    f = 0.0f;
                } else {
                    bj8 h = textFieldState.h();
                    f = fd5.p(g2.g0(hd5.a(0.0f, (h == null || (f3 = h.f()) == null || (e2 = f3.e(b2)) == null) ? 0.0f : e2.l())));
                }
                TextFieldState textFieldState5 = this.d;
                if (textFieldState5 != null && (g = textFieldState5.g()) != null) {
                    bj8 h2 = textFieldState.h();
                    f4 = fd5.p(g.g0(hd5.a(0.0f, (h2 == null || (f2 = h2.f()) == null || (e = f2.e(b3)) == null) ? 0.0f : e.l())));
                }
                return new kt6(Math.min(fd5.o(c2), fd5.o(c3)), Math.min(f, f4), Math.max(fd5.o(c2), fd5.o(c3)), Math.max(fd5.p(c2), fd5.p(c3)) + (bu1.g(25) * textFieldState.s().a().getDensity()));
            }
        }
        return kt6.e.a();
    }

    public final Handle A() {
        return (Handle) this.o.getValue();
    }

    public final boolean B() {
        return ((Boolean) this.k.getValue()).booleanValue();
    }

    public final FocusRequester C() {
        return this.j;
    }

    public final long D(boolean z) {
        bj8 h;
        aj8 f;
        TextFieldState textFieldState = this.d;
        if (textFieldState == null || (h = textFieldState.h()) == null || (f = h.f()) == null) {
            return fd5.b.b();
        }
        androidx.compose.ui.text.a K = K();
        if (K == null) {
            return fd5.b.b();
        }
        if (!zq3.c(K.j(), f.l().j().j())) {
            return fd5.b.b();
        }
        long g = L().g();
        return tj8.b(f, this.b.b(z ? i.n(g) : i.i(g)), z, i.m(L().g()));
    }

    public final u63 E() {
        return this.i;
    }

    public final iw4 F() {
        return this.u;
    }

    public final id5 G() {
        return this.b;
    }

    public final ss2 H() {
        return this.c;
    }

    public final TextFieldState I() {
        return this.d;
    }

    public final xh8 J() {
        return this.t;
    }

    public final androidx.compose.ui.text.a K() {
        rh8 s;
        TextFieldState textFieldState = this.d;
        if (textFieldState == null || (s = textFieldState.s()) == null) {
            return null;
        }
        return s.k();
    }

    public final TextFieldValue L() {
        return (TextFieldValue) this.e.getValue();
    }

    public final xh8 M(boolean z) {
        return new b(z);
    }

    public final void N() {
        bk8 bk8Var;
        bk8 bk8Var2 = this.h;
        if ((bk8Var2 != null ? bk8Var2.getStatus() : null) != TextToolbarStatus.Shown || (bk8Var = this.h) == null) {
            return;
        }
        bk8Var.c();
    }

    public final boolean O() {
        return !zq3.c(this.r.h(), L().h());
    }

    public final void P() {
        androidx.compose.ui.text.a a2;
        sl0 sl0Var = this.g;
        if (sl0Var == null || (a2 = sl0Var.a()) == null) {
            return;
        }
        androidx.compose.ui.text.a n = ji8.c(L(), L().h().length()).n(a2).n(ji8.b(L(), L().h().length()));
        int l = i.l(L().g()) + a2.length();
        this.c.invoke(p(n, pj8.b(l, l)));
        W(HandleState.None);
        jw8 jw8Var = this.a;
        if (jw8Var != null) {
            jw8Var.a();
        }
    }

    public final void Q() {
        TextFieldValue p = p(L().e(), pj8.b(0, L().h().length()));
        this.c.invoke(p);
        this.r = TextFieldValue.c(this.r, null, p.g(), null, 5, null);
        u(true);
    }

    public final void R(sl0 sl0Var) {
        this.g = sl0Var;
    }

    public final void U(boolean z) {
        this.k.setValue(Boolean.valueOf(z));
    }

    public final void V(FocusRequester focusRequester) {
        this.j = focusRequester;
    }

    public final void X(u63 u63Var) {
        this.i = u63Var;
    }

    public final void Y(id5 id5Var) {
        this.b = id5Var;
    }

    public final void Z(ss2 ss2Var) {
        this.c = ss2Var;
    }

    public final void a0(TextFieldState textFieldState) {
        this.d = textFieldState;
    }

    public final void b0(bk8 bk8Var) {
        this.h = bk8Var;
    }

    public final void c0(TextFieldValue textFieldValue) {
        this.e.setValue(textFieldValue);
    }

    public final void d0(kc9 kc9Var) {
        this.f = kc9Var;
    }

    public final void e0() {
        sl0 sl0Var;
        TextFieldState textFieldState = this.d;
        if (textFieldState == null || textFieldState.u()) {
            boolean z = this.f instanceof hp5;
            qs2 qs2Var = (i.h(L().g()) || z) ? null : new qs2() { // from class: androidx.compose.foundation.text.selection.TextFieldSelectionManager$showSelectionToolbar$copy$1
                {
                    super(0);
                }

                @Override // defpackage.qs2
                /* renamed from: invoke */
                public /* bridge */ /* synthetic */ Object mo865invoke() {
                    m27invoke();
                    return ww8.a;
                }

                /* renamed from: invoke, reason: collision with other method in class */
                public final void m27invoke() {
                    TextFieldSelectionManager.o(TextFieldSelectionManager.this, false, 1, null);
                    TextFieldSelectionManager.this.N();
                }
            };
            qs2 qs2Var2 = (i.h(L().g()) || !B() || z) ? null : new qs2() { // from class: androidx.compose.foundation.text.selection.TextFieldSelectionManager$showSelectionToolbar$cut$1
                {
                    super(0);
                }

                @Override // defpackage.qs2
                /* renamed from: invoke */
                public /* bridge */ /* synthetic */ Object mo865invoke() {
                    m28invoke();
                    return ww8.a;
                }

                /* renamed from: invoke, reason: collision with other method in class */
                public final void m28invoke() {
                    TextFieldSelectionManager.this.r();
                    TextFieldSelectionManager.this.N();
                }
            };
            qs2 qs2Var3 = (B() && (sl0Var = this.g) != null && sl0Var.b()) ? new qs2() { // from class: androidx.compose.foundation.text.selection.TextFieldSelectionManager$showSelectionToolbar$paste$1
                {
                    super(0);
                }

                @Override // defpackage.qs2
                /* renamed from: invoke */
                public /* bridge */ /* synthetic */ Object mo865invoke() {
                    m29invoke();
                    return ww8.a;
                }

                /* renamed from: invoke, reason: collision with other method in class */
                public final void m29invoke() {
                    TextFieldSelectionManager.this.P();
                    TextFieldSelectionManager.this.N();
                }
            } : null;
            qs2 qs2Var4 = i.j(L().g()) != L().h().length() ? new qs2() { // from class: androidx.compose.foundation.text.selection.TextFieldSelectionManager$showSelectionToolbar$selectAll$1
                {
                    super(0);
                }

                @Override // defpackage.qs2
                /* renamed from: invoke */
                public /* bridge */ /* synthetic */ Object mo865invoke() {
                    m30invoke();
                    return ww8.a;
                }

                /* renamed from: invoke, reason: collision with other method in class */
                public final void m30invoke() {
                    TextFieldSelectionManager.this.Q();
                }
            } : null;
            bk8 bk8Var = this.h;
            if (bk8Var != null) {
                bk8Var.a(x(), qs2Var, qs2Var3, qs2Var2, qs2Var4);
            }
        }
    }

    public final void n(boolean z) {
        if (i.h(L().g())) {
            return;
        }
        sl0 sl0Var = this.g;
        if (sl0Var != null) {
            sl0Var.c(ji8.a(L()));
        }
        if (z) {
            int k = i.k(L().g());
            this.c.invoke(p(L().e(), pj8.b(k, k)));
            W(HandleState.None);
        }
    }

    public final xh8 q() {
        return new a();
    }

    public final void r() {
        if (i.h(L().g())) {
            return;
        }
        sl0 sl0Var = this.g;
        if (sl0Var != null) {
            sl0Var.c(ji8.a(L()));
        }
        androidx.compose.ui.text.a n = ji8.c(L(), L().h().length()).n(ji8.b(L(), L().h().length()));
        int l = i.l(L().g());
        this.c.invoke(p(n, pj8.b(l, l)));
        W(HandleState.None);
        jw8 jw8Var = this.a;
        if (jw8Var != null) {
            jw8Var.a();
        }
    }

    public final void s(fd5 fd5Var) {
        if (!i.h(L().g())) {
            TextFieldState textFieldState = this.d;
            bj8 h = textFieldState != null ? textFieldState.h() : null;
            this.c.invoke(TextFieldValue.c(L(), null, pj8.a((fd5Var == null || h == null) ? i.k(L().g()) : this.b.a(bj8.e(h, fd5Var.x(), false, 2, null))), null, 5, null));
        }
        W((fd5Var == null || L().h().length() <= 0) ? HandleState.None : HandleState.Cursor);
        f0(false);
    }

    public final void u(boolean z) {
        FocusRequester focusRequester;
        TextFieldState textFieldState = this.d;
        if (textFieldState != null && !textFieldState.d() && (focusRequester = this.j) != null) {
            focusRequester.e();
        }
        this.r = L();
        f0(z);
        W(HandleState.Selection);
    }

    public final void w() {
        f0(false);
        W(HandleState.None);
    }

    public final fd5 y() {
        return (fd5) this.p.getValue();
    }

    public final long z(fm1 fm1Var) {
        int b2 = this.b.b(i.n(L().g()));
        TextFieldState textFieldState = this.d;
        bj8 h = textFieldState != null ? textFieldState.h() : null;
        zq3.e(h);
        aj8 f = h.f();
        kt6 e = f.e(uo6.m(b2, 0, f.l().j().length()));
        return hd5.a(e.i() + (fm1Var.f1(TextFieldCursorKt.c()) / 2), e.e());
    }
}
