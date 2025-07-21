package androidx.compose.ui.graphics.vector;

import defpackage.aq5;
import defpackage.bg;
import defpackage.c04;
import defpackage.c49;
import defpackage.cg;
import defpackage.fv1;
import defpackage.ip5;
import defpackage.qs2;
import defpackage.sp5;
import defpackage.u48;
import defpackage.yc0;
import defpackage.zq3;
import java.util.List;
import kotlin.LazyThreadSafetyMode;
import kotlin.c;

/* loaded from: classes.dex */
public final class PathComponent extends a {
    private String b;
    private yc0 c;
    private float d;
    private List e;
    private int f;
    private float g;
    private float h;
    private yc0 i;
    private int j;
    private int k;
    private float l;
    private float m;
    private float n;
    private float o;
    private boolean p;
    private boolean q;
    private boolean r;
    private u48 s;
    private final ip5 t;
    private ip5 u;
    private final c04 v;

    public PathComponent() {
        super(null);
        this.b = "";
        this.d = 1.0f;
        this.e = c49.e();
        this.f = c49.b();
        this.g = 1.0f;
        this.j = c49.c();
        this.k = c49.d();
        this.l = 4.0f;
        this.n = 1.0f;
        this.p = true;
        this.q = true;
        ip5 a = cg.a();
        this.t = a;
        this.u = a;
        this.v = c.b(LazyThreadSafetyMode.NONE, new qs2() { // from class: androidx.compose.ui.graphics.vector.PathComponent$pathMeasure$2
            @Override // defpackage.qs2
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public final sp5 mo865invoke() {
                return bg.a();
            }
        });
    }

    private final sp5 f() {
        return (sp5) this.v.getValue();
    }

    private final void v() {
        aq5.c(this.e, this.t);
        w();
    }

    private final void w() {
        if (this.m == 0.0f && this.n == 1.0f) {
            this.u = this.t;
            return;
        }
        if (zq3.c(this.u, this.t)) {
            this.u = cg.a();
        } else {
            int F = this.u.F();
            this.u.q();
            this.u.A(F);
        }
        f().a(this.t, false);
        float length = f().getLength();
        float f = this.m;
        float f2 = this.o;
        float f3 = ((f + f2) % 1.0f) * length;
        float f4 = ((this.n + f2) % 1.0f) * length;
        if (f3 <= f4) {
            f().b(f3, f4, this.u, true);
        } else {
            f().b(f3, length, this.u, true);
            f().b(0.0f, f4, this.u, true);
        }
    }

    @Override // androidx.compose.ui.graphics.vector.a
    public void a(fv1 fv1Var) {
        if (this.p) {
            v();
        } else if (this.r) {
            w();
        }
        this.p = false;
        this.r = false;
        yc0 yc0Var = this.c;
        if (yc0Var != null) {
            fv1.w0(fv1Var, this.u, yc0Var, this.d, null, null, 0, 56, null);
        }
        yc0 yc0Var2 = this.i;
        if (yc0Var2 != null) {
            u48 u48Var = this.s;
            if (this.q || u48Var == null) {
                u48Var = new u48(this.h, this.l, this.j, this.k, null, 16, null);
                this.s = u48Var;
                this.q = false;
            }
            fv1.w0(fv1Var, this.u, yc0Var2, this.g, u48Var, null, 0, 48, null);
        }
    }

    public final yc0 e() {
        return this.c;
    }

    public final yc0 g() {
        return this.i;
    }

    public final void h(yc0 yc0Var) {
        this.c = yc0Var;
        c();
    }

    public final void i(float f) {
        this.d = f;
        c();
    }

    public final void j(String str) {
        this.b = str;
        c();
    }

    public final void k(List list) {
        this.e = list;
        this.p = true;
        c();
    }

    public final void l(int i) {
        this.f = i;
        this.u.A(i);
        c();
    }

    public final void m(yc0 yc0Var) {
        this.i = yc0Var;
        c();
    }

    public final void n(float f) {
        this.g = f;
        c();
    }

    public final void o(int i) {
        this.j = i;
        this.q = true;
        c();
    }

    public final void p(int i) {
        this.k = i;
        this.q = true;
        c();
    }

    public final void q(float f) {
        this.l = f;
        this.q = true;
        c();
    }

    public final void r(float f) {
        this.h = f;
        this.q = true;
        c();
    }

    public final void s(float f) {
        this.n = f;
        this.r = true;
        c();
    }

    public final void t(float f) {
        this.o = f;
        this.r = true;
        c();
    }

    public String toString() {
        return this.t.toString();
    }

    public final void u(float f) {
        this.m = f;
        this.r = true;
        c();
    }
}
