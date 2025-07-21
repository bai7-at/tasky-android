package androidx.compose.ui.graphics.vector;

import androidx.compose.runtime.b0;
import defpackage.c49;
import defpackage.fd5;
import defpackage.fv1;
import defpackage.in3;
import defpackage.nn0;
import defpackage.qn0;
import defpackage.qs2;
import defpackage.sf3;
import defpackage.ss2;
import defpackage.sy4;
import defpackage.tf3;
import defpackage.ww8;
import defpackage.xu1;
import defpackage.zq3;
import defpackage.zt7;
import defpackage.zu1;

/* loaded from: classes.dex */
public final class VectorComponent extends a {
    private final GroupComponent b;
    private String c;
    private boolean d;
    private final xu1 e;
    private qs2 f;
    private final sy4 g;
    private qn0 h;
    private final sy4 i;
    private long j;
    private float k;
    private float l;
    private final ss2 m;

    public VectorComponent(GroupComponent groupComponent) {
        super(null);
        this.b = groupComponent;
        groupComponent.d(new ss2() { // from class: androidx.compose.ui.graphics.vector.VectorComponent.1
            {
                super(1);
            }

            public final void b(a aVar) {
                VectorComponent.this.h();
            }

            @Override // defpackage.ss2
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                b((a) obj);
                return ww8.a;
            }
        });
        this.c = "";
        this.d = true;
        this.e = new xu1();
        this.f = new qs2() { // from class: androidx.compose.ui.graphics.vector.VectorComponent$invalidateCallback$1
            /* renamed from: invoke, reason: collision with other method in class */
            public final void m70invoke() {
            }

            @Override // defpackage.qs2
            /* renamed from: invoke */
            public /* bridge */ /* synthetic */ Object mo865invoke() {
                m70invoke();
                return ww8.a;
            }
        };
        this.g = b0.e(null, null, 2, null);
        zt7.a aVar = zt7.b;
        this.i = b0.e(zt7.c(aVar.b()), null, 2, null);
        this.j = aVar.a();
        this.k = 1.0f;
        this.l = 1.0f;
        this.m = new ss2() { // from class: androidx.compose.ui.graphics.vector.VectorComponent$drawVectorBlock$1
            {
                super(1);
            }

            @Override // defpackage.ss2
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke((fv1) obj);
                return ww8.a;
            }

            public final void invoke(fv1 fv1Var) {
                float f;
                float f2;
                GroupComponent l = VectorComponent.this.l();
                VectorComponent vectorComponent = VectorComponent.this;
                f = vectorComponent.k;
                f2 = vectorComponent.l;
                long c = fd5.b.c();
                zu1 i1 = fv1Var.i1();
                long b = i1.b();
                i1.c().t();
                i1.a().e(f, f2, c);
                l.a(fv1Var);
                i1.c().k();
                i1.d(b);
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void h() {
        this.d = true;
        this.f.mo865invoke();
    }

    @Override // androidx.compose.ui.graphics.vector.a
    public void a(fv1 fv1Var) {
        i(fv1Var, 1.0f, null);
    }

    public final void i(fv1 fv1Var, float f, qn0 qn0Var) {
        int a = (this.b.j() && this.b.g() != nn0.b.g() && c49.g(k()) && c49.g(qn0Var)) ? tf3.b.a() : tf3.b.b();
        if (this.d || !zt7.f(this.j, fv1Var.b()) || !tf3.i(a, j())) {
            this.h = tf3.i(a, tf3.b.a()) ? qn0.a.b(qn0.b, this.b.g(), 0, 2, null) : null;
            this.k = zt7.i(fv1Var.b()) / zt7.i(m());
            this.l = zt7.g(fv1Var.b()) / zt7.g(m());
            this.e.b(a, in3.a((int) Math.ceil(zt7.i(fv1Var.b())), (int) Math.ceil(zt7.g(fv1Var.b()))), fv1Var, fv1Var.getLayoutDirection(), this.m);
            this.d = false;
            this.j = fv1Var.b();
        }
        if (qn0Var == null) {
            qn0Var = k() != null ? k() : this.h;
        }
        this.e.c(fv1Var, f, qn0Var);
    }

    public final int j() {
        sf3 d = this.e.d();
        return d != null ? d.b() : tf3.b.b();
    }

    public final qn0 k() {
        return (qn0) this.g.getValue();
    }

    public final GroupComponent l() {
        return this.b;
    }

    public final long m() {
        return ((zt7) this.i.getValue()).m();
    }

    public final void n(qn0 qn0Var) {
        this.g.setValue(qn0Var);
    }

    public final void o(qs2 qs2Var) {
        this.f = qs2Var;
    }

    public final void p(String str) {
        this.c = str;
    }

    public final void q(long j) {
        this.i.setValue(zt7.c(j));
    }

    public String toString() {
        String str = "Params: \tname: " + this.c + "\n\tviewportWidth: " + zt7.i(m()) + "\n\tviewportHeight: " + zt7.g(m()) + "\n";
        zq3.g(str, "StringBuilder().apply(builderAction).toString()");
        return str;
    }
}
