package defpackage;

import android.graphics.Paint;
import android.graphics.Shader;

/* loaded from: classes.dex */
public final class tf implements ao5 {
    private Paint a;
    private int b;
    private Shader c;
    private qn0 d;

    public tf(Paint paint) {
        this.a = paint;
        this.b = b90.a.B();
    }

    @Override // defpackage.ao5
    public float a() {
        return uf.c(this.a);
    }

    @Override // defpackage.ao5
    public long b() {
        return uf.d(this.a);
    }

    @Override // defpackage.ao5
    public void c(float f) {
        uf.k(this.a, f);
    }

    @Override // defpackage.ao5
    public void d(int i) {
        uf.r(this.a, i);
    }

    @Override // defpackage.ao5
    public void e(int i) {
        if (b90.E(this.b, i)) {
            return;
        }
        this.b = i;
        uf.l(this.a, i);
    }

    @Override // defpackage.ao5
    public qn0 f() {
        return this.d;
    }

    @Override // defpackage.ao5
    public void g(mp5 mp5Var) {
        uf.p(this.a, mp5Var);
    }

    @Override // defpackage.ao5
    public void h(int i) {
        uf.o(this.a, i);
    }

    @Override // defpackage.ao5
    public int i() {
        return uf.f(this.a);
    }

    @Override // defpackage.ao5
    public void j(int i) {
        uf.s(this.a, i);
    }

    @Override // defpackage.ao5
    public void k(long j) {
        uf.m(this.a, j);
    }

    @Override // defpackage.ao5
    public mp5 l() {
        return null;
    }

    @Override // defpackage.ao5
    public int m() {
        return this.b;
    }

    @Override // defpackage.ao5
    public int n() {
        return uf.g(this.a);
    }

    @Override // defpackage.ao5
    public float o() {
        return uf.h(this.a);
    }

    @Override // defpackage.ao5
    public Paint p() {
        return this.a;
    }

    @Override // defpackage.ao5
    public void q(Shader shader) {
        this.c = shader;
        uf.q(this.a, shader);
    }

    @Override // defpackage.ao5
    public Shader r() {
        return this.c;
    }

    @Override // defpackage.ao5
    public void s(float f) {
        uf.t(this.a, f);
    }

    @Override // defpackage.ao5
    public void t(qn0 qn0Var) {
        this.d = qn0Var;
        uf.n(this.a, qn0Var);
    }

    @Override // defpackage.ao5
    public int u() {
        return uf.e(this.a);
    }

    @Override // defpackage.ao5
    public void v(int i) {
        uf.v(this.a, i);
    }

    @Override // defpackage.ao5
    public void w(float f) {
        uf.u(this.a, f);
    }

    @Override // defpackage.ao5
    public float x() {
        return uf.i(this.a);
    }

    public tf() {
        this(uf.j());
    }
}
