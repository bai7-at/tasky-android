package defpackage;

import android.os.SystemClock;
import androidx.compose.runtime.b0;
import androidx.compose.ui.graphics.painter.Painter;
import androidx.compose.ui.layout.ContentScale;
import defpackage.zt7;

/* loaded from: classes.dex */
public final class o31 extends Painter {
    private Painter g;
    private final Painter h;
    private final ContentScale i;
    private final int j;
    private final boolean k;
    private final boolean l;
    private boolean r;
    private final sy4 m = b0.e(0, null, 2, null);
    private long n = -1;
    private final sy4 s = b0.e(Float.valueOf(1.0f), null, 2, null);
    private final sy4 t = b0.e(null, null, 2, null);

    public o31(Painter painter, Painter painter2, ContentScale contentScale, int i, boolean z, boolean z2) {
        this.g = painter;
        this.h = painter2;
        this.i = contentScale;
        this.j = i;
        this.k = z;
        this.l = z2;
    }

    private final long n(long j, long j2) {
        zt7.a aVar = zt7.b;
        return (j == aVar.a() || zt7.k(j) || j2 == aVar.a() || zt7.k(j2)) ? j2 : na7.b(j, this.i.a(j, j2));
    }

    private final long o() {
        Painter painter = this.g;
        long k = painter != null ? painter.k() : zt7.b.b();
        Painter painter2 = this.h;
        long k2 = painter2 != null ? painter2.k() : zt7.b.b();
        zt7.a aVar = zt7.b;
        boolean z = k != aVar.a();
        boolean z2 = k2 != aVar.a();
        if (z && z2) {
            return du7.a(Math.max(zt7.i(k), zt7.i(k2)), Math.max(zt7.g(k), zt7.g(k2)));
        }
        if (this.l) {
            if (z) {
                return k;
            }
            if (z2) {
                return k2;
            }
        }
        return aVar.a();
    }

    private final void p(fv1 fv1Var, Painter painter, float f) {
        if (painter == null || f <= 0.0f) {
            return;
        }
        long b = fv1Var.b();
        long n = n(painter.k(), b);
        if (b == zt7.b.a() || zt7.k(b)) {
            painter.j(fv1Var, n, f, q());
            return;
        }
        float f2 = 2;
        float i = (zt7.i(b) - zt7.i(n)) / f2;
        float g = (zt7.g(b) - zt7.g(n)) / f2;
        fv1Var.i1().a().i(i, g, i, g);
        painter.j(fv1Var, n, f, q());
        iv1 a = fv1Var.i1().a();
        float f3 = -i;
        float f4 = -g;
        a.i(f3, f4, f3, f4);
    }

    private final qn0 q() {
        return (qn0) this.t.getValue();
    }

    private final int r() {
        return ((Number) this.m.getValue()).intValue();
    }

    private final float s() {
        return ((Number) this.s.getValue()).floatValue();
    }

    private final void t(qn0 qn0Var) {
        this.t.setValue(qn0Var);
    }

    private final void u(int i) {
        this.m.setValue(Integer.valueOf(i));
    }

    private final void v(float f) {
        this.s.setValue(Float.valueOf(f));
    }

    @Override // androidx.compose.ui.graphics.painter.Painter
    protected boolean a(float f) {
        v(f);
        return true;
    }

    @Override // androidx.compose.ui.graphics.painter.Painter
    protected boolean b(qn0 qn0Var) {
        t(qn0Var);
        return true;
    }

    @Override // androidx.compose.ui.graphics.painter.Painter
    public long k() {
        return o();
    }

    @Override // androidx.compose.ui.graphics.painter.Painter
    protected void m(fv1 fv1Var) {
        if (this.r) {
            p(fv1Var, this.h, s());
            return;
        }
        long uptimeMillis = SystemClock.uptimeMillis();
        if (this.n == -1) {
            this.n = uptimeMillis;
        }
        float f = (uptimeMillis - this.n) / this.j;
        float l = uo6.l(f, 0.0f, 1.0f) * s();
        float s = this.k ? s() - l : s();
        this.r = f >= 1.0f;
        p(fv1Var, this.g, s);
        p(fv1Var, this.h, l);
        if (this.r) {
            this.g = null;
        } else {
            u(r() + 1);
        }
    }
}
