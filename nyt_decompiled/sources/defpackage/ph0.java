package defpackage;

/* loaded from: classes.dex */
public interface ph0 {
    static /* synthetic */ void h(ph0 ph0Var, kt6 kt6Var, int i, int i2, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: clipRect-mtrdD-E");
        }
        if ((i2 & 2) != 0) {
            i = ql0.a.b();
        }
        ph0Var.f(kt6Var, i);
    }

    static /* synthetic */ void i(ph0 ph0Var, float f, float f2, float f3, float f4, int i, int i2, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: clipRect-N_I0leg");
        }
        if ((i2 & 16) != 0) {
            i = ql0.a.b();
        }
        ph0Var.b(f, f2, f3, f4, i);
    }

    static /* synthetic */ void m(ph0 ph0Var, ip5 ip5Var, int i, int i2, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: clipPath-mtrdD-E");
        }
        if ((i2 & 2) != 0) {
            i = ql0.a.b();
        }
        ph0Var.d(ip5Var, i);
    }

    void b(float f, float f2, float f3, float f4, int i);

    void c(float f, float f2);

    void d(ip5 ip5Var, int i);

    void e(float f, float f2);

    default void f(kt6 kt6Var, int i) {
        b(kt6Var.i(), kt6Var.l(), kt6Var.j(), kt6Var.e(), i);
    }

    void g(sf3 sf3Var, long j, long j2, long j3, long j4, ao5 ao5Var);

    void j(float f, float f2, float f3, float f4, float f5, float f6, boolean z, ao5 ao5Var);

    void k();

    void l(sf3 sf3Var, long j, ao5 ao5Var);

    void n();

    default void o(kt6 kt6Var, ao5 ao5Var) {
        y(kt6Var.i(), kt6Var.l(), kt6Var.j(), kt6Var.e(), ao5Var);
    }

    void p(long j, long j2, ao5 ao5Var);

    void q(float f, float f2, float f3, float f4, float f5, float f6, ao5 ao5Var);

    void r(ip5 ip5Var, ao5 ao5Var);

    void s(float f);

    void t();

    void u();

    void v(float[] fArr);

    void w(kt6 kt6Var, ao5 ao5Var);

    void x(long j, float f, ao5 ao5Var);

    void y(float f, float f2, float f3, float f4, ao5 ao5Var);
}
