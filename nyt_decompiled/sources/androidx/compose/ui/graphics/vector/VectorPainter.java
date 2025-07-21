package androidx.compose.ui.graphics.vector;

import androidx.compose.runtime.b0;
import androidx.compose.ui.graphics.painter.Painter;
import androidx.compose.ui.unit.LayoutDirection;
import defpackage.cy4;
import defpackage.fv1;
import defpackage.ow7;
import defpackage.qn0;
import defpackage.qs2;
import defpackage.sy4;
import defpackage.ww8;
import defpackage.zt7;
import defpackage.zu1;

/* loaded from: classes.dex */
public final class VectorPainter extends Painter {
    public static final int n = 8;
    private final sy4 g = b0.e(zt7.c(zt7.b.b()), null, 2, null);
    private final sy4 h = b0.e(Boolean.FALSE, null, 2, null);
    private final VectorComponent i;
    private final cy4 j;
    private float k;
    private qn0 l;
    private int m;

    public VectorPainter(GroupComponent groupComponent) {
        VectorComponent vectorComponent = new VectorComponent(groupComponent);
        vectorComponent.o(new qs2() { // from class: androidx.compose.ui.graphics.vector.VectorPainter$vector$1$1
            {
                super(0);
            }

            @Override // defpackage.qs2
            /* renamed from: invoke */
            public /* bridge */ /* synthetic */ Object mo865invoke() {
                m71invoke();
                return ww8.a;
            }

            /* renamed from: invoke, reason: collision with other method in class */
            public final void m71invoke() {
                int i;
                int r;
                int r2;
                i = VectorPainter.this.m;
                r = VectorPainter.this.r();
                if (i == r) {
                    VectorPainter vectorPainter = VectorPainter.this;
                    r2 = vectorPainter.r();
                    vectorPainter.v(r2 + 1);
                }
            }
        });
        this.i = vectorComponent;
        this.j = ow7.a(0);
        this.k = 1.0f;
        this.m = -1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final int r() {
        return this.j.d();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void v(int i) {
        this.j.f(i);
    }

    @Override // androidx.compose.ui.graphics.painter.Painter
    protected boolean a(float f) {
        this.k = f;
        return true;
    }

    @Override // androidx.compose.ui.graphics.painter.Painter
    protected boolean b(qn0 qn0Var) {
        this.l = qn0Var;
        return true;
    }

    @Override // androidx.compose.ui.graphics.painter.Painter
    public long k() {
        return s();
    }

    @Override // androidx.compose.ui.graphics.painter.Painter
    protected void m(fv1 fv1Var) {
        VectorComponent vectorComponent = this.i;
        qn0 qn0Var = this.l;
        if (qn0Var == null) {
            qn0Var = vectorComponent.k();
        }
        if (q() && fv1Var.getLayoutDirection() == LayoutDirection.Rtl) {
            long t1 = fv1Var.t1();
            zu1 i1 = fv1Var.i1();
            long b = i1.b();
            i1.c().t();
            i1.a().e(-1.0f, 1.0f, t1);
            vectorComponent.i(fv1Var, this.k, qn0Var);
            i1.c().k();
            i1.d(b);
        } else {
            vectorComponent.i(fv1Var, this.k, qn0Var);
        }
        this.m = r();
    }

    public final boolean q() {
        return ((Boolean) this.h.getValue()).booleanValue();
    }

    public final long s() {
        return ((zt7) this.g.getValue()).m();
    }

    public final void t(boolean z) {
        this.h.setValue(Boolean.valueOf(z));
    }

    public final void u(qn0 qn0Var) {
        this.i.n(qn0Var);
    }

    public final void w(String str) {
        this.i.p(str);
    }

    public final void x(long j) {
        this.g.setValue(zt7.c(j));
    }

    public final void y(long j) {
        this.i.q(j);
    }
}
