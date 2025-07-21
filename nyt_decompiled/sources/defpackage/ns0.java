package defpackage;

import androidx.compose.runtime.ComposerImpl;
import androidx.compose.runtime.b;
import androidx.compose.runtime.c;
import androidx.compose.runtime.q;
import androidx.compose.runtime.r;
import java.util.List;
import kotlin.KotlinNothingValueException;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes.dex */
public final class ns0 {
    public static final a m = new a(null);
    public static final int n = 8;
    private final ComposerImpl a;
    private ej0 b;
    private boolean c;
    private int f;
    private int g;
    private int l;
    private final kn3 d = new kn3();
    private boolean e = true;
    private e08 h = new e08();
    private int i = -1;
    private int j = -1;
    private int k = -1;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    public ns0(ComposerImpl composerImpl, ej0 ej0Var) {
        this.a = composerImpl;
        this.b = ej0Var;
    }

    private final void A() {
        G(this, false, 1, null);
        I();
    }

    private final void B(boolean z) {
        F(z);
    }

    static /* synthetic */ void C(ns0 ns0Var, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            z = false;
        }
        ns0Var.B(z);
    }

    private final void D(int i, int i2, int i3) {
        y();
        this.b.t(i, i2, i3);
    }

    private final void E() {
        int i = this.l;
        if (i > 0) {
            int i2 = this.i;
            if (i2 >= 0) {
                H(i2, i);
                this.i = -1;
            } else {
                D(this.k, this.j, i);
                this.j = -1;
                this.k = -1;
            }
            this.l = 0;
        }
    }

    private final void F(boolean z) {
        int s = z ? o().s() : o().k();
        int i = s - this.f;
        if (!(i >= 0)) {
            b.t("Tried to seek backward");
            throw new KotlinNothingValueException();
        }
        if (i > 0) {
            this.b.e(i);
            this.f = s;
        }
    }

    static /* synthetic */ void G(ns0 ns0Var, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            z = false;
        }
        ns0Var.F(z);
    }

    private final void H(int i, int i2) {
        y();
        this.b.w(i, i2);
    }

    private final void j(hd hdVar) {
        C(this, false, 1, null);
        this.b.n(hdVar);
        this.c = true;
    }

    private final void k() {
        if (this.c || !this.e) {
            return;
        }
        C(this, false, 1, null);
        this.b.o();
        this.c = true;
    }

    private final q o() {
        return this.a.F0();
    }

    private final void y() {
        z();
    }

    private final void z() {
        int i = this.g;
        if (i > 0) {
            this.b.D(i);
            this.g = 0;
        }
        if (this.h.d()) {
            this.b.j(this.h.i());
            this.h.a();
        }
    }

    public final void I() {
        q o;
        int s;
        if (o().u() <= 0 || this.d.g(-2) == (s = (o = o()).s())) {
            return;
        }
        k();
        if (s > 0) {
            hd a2 = o.a(s);
            this.d.i(s);
            j(a2);
        }
    }

    public final void J() {
        z();
        if (this.c) {
            S();
            i();
        }
    }

    public final void K(ov6 ov6Var) {
        this.b.u(ov6Var);
    }

    public final void L() {
        A();
        this.b.v();
        this.f += o().p();
    }

    public final void M(int i, int i2) {
        if (i2 > 0) {
            if (!(i >= 0)) {
                b.t(("Invalid remove index " + i).toString());
                throw new KotlinNothingValueException();
            }
            if (this.i == i) {
                this.l += i2;
                return;
            }
            E();
            this.i = i;
            this.l = i2;
        }
    }

    public final void N() {
        this.b.x();
    }

    public final void O() {
        this.c = false;
        this.d.a();
        this.f = 0;
    }

    public final void P(ej0 ej0Var) {
        this.b = ej0Var;
    }

    public final void Q(boolean z) {
        this.e = z;
    }

    public final void R(qs2 qs2Var) {
        this.b.y(qs2Var);
    }

    public final void S() {
        this.b.z();
    }

    public final void T(Object obj) {
        C(this, false, 1, null);
        this.b.A(obj);
    }

    public final void U(Object obj, gt2 gt2Var) {
        y();
        this.b.B(obj, gt2Var);
    }

    public final void V(Object obj, int i) {
        B(true);
        this.b.C(obj, i);
    }

    public final void W(Object obj) {
        y();
        this.b.E(obj);
    }

    public final void a(List list, dn3 dn3Var) {
        this.b.f(list, dn3Var);
    }

    public final void b(kw4 kw4Var, c cVar, lw4 lw4Var, lw4 lw4Var2) {
        this.b.g(kw4Var, cVar, lw4Var, lw4Var2);
    }

    public final void c() {
        C(this, false, 1, null);
        this.b.h();
    }

    public final void d(dn3 dn3Var, hd hdVar) {
        z();
        this.b.i(dn3Var, hdVar);
    }

    public final void e(ss2 ss2Var, ws0 ws0Var) {
        this.b.k(ss2Var, ws0Var);
    }

    public final void f() {
        int s = o().s();
        if (!(this.d.g(-1) <= s)) {
            b.t("Missed recording an endGroup");
            throw new KotlinNothingValueException();
        }
        if (this.d.g(-1) == s) {
            C(this, false, 1, null);
            this.d.h();
            this.b.l();
        }
    }

    public final void g() {
        this.b.m();
        this.f = 0;
    }

    public final void h() {
        E();
    }

    public final void i() {
        if (this.c) {
            C(this, false, 1, null);
            C(this, false, 1, null);
            this.b.l();
            this.c = false;
        }
    }

    public final void l() {
        z();
        if (this.d.d()) {
            return;
        }
        b.t("Missed recording an endGroup()");
        throw new KotlinNothingValueException();
    }

    public final ej0 m() {
        return this.b;
    }

    public final boolean n() {
        return this.e;
    }

    public final void p(ej0 ej0Var, dn3 dn3Var) {
        this.b.p(ej0Var, dn3Var);
    }

    public final void q(hd hdVar, r rVar) {
        z();
        A();
        this.b.q(hdVar, rVar);
    }

    public final void r(hd hdVar, r rVar, yj2 yj2Var) {
        z();
        A();
        this.b.r(hdVar, rVar, yj2Var);
    }

    public final void s(int i) {
        A();
        this.b.s(i);
    }

    public final void t(Object obj) {
        this.h.h(obj);
    }

    public final void u(int i, int i2, int i3) {
        if (i3 > 0) {
            int i4 = this.l;
            if (i4 > 0 && this.j == i - i4 && this.k == i2 - i4) {
                this.l = i4 + i3;
                return;
            }
            E();
            this.j = i;
            this.k = i2;
            this.l = i3;
        }
    }

    public final void v(int i) {
        this.f += i - o().k();
    }

    public final void w(int i) {
        this.f = i;
    }

    public final void x() {
        if (this.h.d()) {
            this.h.g();
        } else {
            this.g++;
        }
    }
}
