package androidx.compose.ui.graphics.painter;

import androidx.compose.ui.unit.LayoutDirection;
import defpackage.ao5;
import defpackage.du7;
import defpackage.fd5;
import defpackage.fv1;
import defpackage.kt6;
import defpackage.nt6;
import defpackage.ph0;
import defpackage.qn0;
import defpackage.ss2;
import defpackage.uf;
import defpackage.ww8;
import defpackage.zq3;
import defpackage.zt7;

/* loaded from: classes.dex */
public abstract class Painter {
    private ao5 a;
    private boolean b;
    private qn0 c;
    private float d = 1.0f;
    private LayoutDirection e = LayoutDirection.Ltr;
    private final ss2 f = new ss2() { // from class: androidx.compose.ui.graphics.painter.Painter$drawLambda$1
        {
            super(1);
        }

        @Override // defpackage.ss2
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((fv1) obj);
            return ww8.a;
        }

        public final void invoke(fv1 fv1Var) {
            Painter.this.m(fv1Var);
        }
    };

    private final void g(float f) {
        if (this.d == f) {
            return;
        }
        if (!a(f)) {
            if (f == 1.0f) {
                ao5 ao5Var = this.a;
                if (ao5Var != null) {
                    ao5Var.c(f);
                }
                this.b = false;
            } else {
                l().c(f);
                this.b = true;
            }
        }
        this.d = f;
    }

    private final void h(qn0 qn0Var) {
        if (zq3.c(this.c, qn0Var)) {
            return;
        }
        if (!b(qn0Var)) {
            if (qn0Var == null) {
                ao5 ao5Var = this.a;
                if (ao5Var != null) {
                    ao5Var.t(null);
                }
                this.b = false;
            } else {
                l().t(qn0Var);
                this.b = true;
            }
        }
        this.c = qn0Var;
    }

    private final void i(LayoutDirection layoutDirection) {
        if (this.e != layoutDirection) {
            f(layoutDirection);
            this.e = layoutDirection;
        }
    }

    private final ao5 l() {
        ao5 ao5Var = this.a;
        if (ao5Var != null) {
            return ao5Var;
        }
        ao5 a = uf.a();
        this.a = a;
        return a;
    }

    protected abstract boolean a(float f);

    protected boolean b(qn0 qn0Var) {
        return false;
    }

    protected boolean f(LayoutDirection layoutDirection) {
        return false;
    }

    public final void j(fv1 fv1Var, long j, float f, qn0 qn0Var) {
        g(f);
        h(qn0Var);
        i(fv1Var.getLayoutDirection());
        float i = zt7.i(fv1Var.b()) - zt7.i(j);
        float g = zt7.g(fv1Var.b()) - zt7.g(j);
        fv1Var.i1().a().i(0.0f, 0.0f, i, g);
        if (f > 0.0f && zt7.i(j) > 0.0f && zt7.g(j) > 0.0f) {
            if (this.b) {
                kt6 b = nt6.b(fd5.b.c(), du7.a(zt7.i(j), zt7.g(j)));
                ph0 c = fv1Var.i1().c();
                try {
                    c.w(b, l());
                    m(fv1Var);
                } finally {
                    c.k();
                }
            } else {
                m(fv1Var);
            }
        }
        fv1Var.i1().a().i(-0.0f, -0.0f, -i, -g);
    }

    public abstract long k();

    protected abstract void m(fv1 fv1Var);
}
