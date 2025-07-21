package androidx.compose.ui.platform;

import android.graphics.Canvas;
import android.graphics.Matrix;
import androidx.compose.ui.unit.LayoutDirection;
import com.amazonaws.event.ProgressEvent;
import com.amazonaws.services.s3.internal.crypto.JceEncryptionConstants;
import defpackage.ao5;
import defpackage.du7;
import defpackage.fd5;
import defpackage.fm1;
import defpackage.gl5;
import defpackage.gt2;
import defpackage.hn3;
import defpackage.ip5;
import defpackage.jm5;
import defpackage.kg4;
import defpackage.ll9;
import defpackage.my4;
import defpackage.ph0;
import defpackage.qs2;
import defpackage.qt6;
import defpackage.sp1;
import defpackage.ss2;
import defpackage.th0;
import defpackage.uf;
import defpackage.vm3;
import defpackage.wd;
import defpackage.wn0;
import defpackage.ww8;
import defpackage.xy3;
import defpackage.zw6;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes.dex */
public final class RenderNodeLayer implements jm5 {
    public static final a n = new a(null);
    public static final int r = 8;
    private static final gt2 s = new gt2() { // from class: androidx.compose.ui.platform.RenderNodeLayer$Companion$getMatrix$1
        public final void b(sp1 sp1Var, Matrix matrix) {
            sp1Var.L(matrix);
        }

        @Override // defpackage.gt2
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            b((sp1) obj, (Matrix) obj2);
            return ww8.a;
        }
    };
    private final AndroidComposeView a;
    private ss2 b;
    private qs2 c;
    private boolean d;
    private final gl5 e;
    private boolean f;
    private boolean g;
    private ao5 h;
    private final xy3 i = new xy3(s);
    private final th0 j = new th0();
    private long k = androidx.compose.ui.graphics.e.b.a();
    private final sp1 l;
    private int m;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    public RenderNodeLayer(AndroidComposeView androidComposeView, ss2 ss2Var, qs2 qs2Var) {
        this.a = androidComposeView;
        this.b = ss2Var;
        this.c = qs2Var;
        this.e = new gl5(androidComposeView.getDensity());
        zw6 zw6Var = new zw6(androidComposeView);
        zw6Var.K(true);
        zw6Var.A(false);
        this.l = zw6Var;
    }

    private final void l(ph0 ph0Var) {
        if (this.l.J() || this.l.G()) {
            this.e.a(ph0Var);
        }
    }

    private final void m(boolean z) {
        if (z != this.d) {
            this.d = z;
            this.a.j0(this, z);
        }
    }

    private final void n() {
        ll9.a.a(this.a);
    }

    @Override // defpackage.jm5
    public void a(float[] fArr) {
        kg4.k(fArr, this.i.b(this.l));
    }

    @Override // defpackage.jm5
    public void b(my4 my4Var, boolean z) {
        if (!z) {
            kg4.g(this.i.b(this.l), my4Var);
            return;
        }
        float[] a2 = this.i.a(this.l);
        if (a2 == null) {
            my4Var.g(0.0f, 0.0f, 0.0f, 0.0f);
        } else {
            kg4.g(a2, my4Var);
        }
    }

    @Override // defpackage.jm5
    public long c(long j, boolean z) {
        if (!z) {
            return kg4.f(this.i.b(this.l), j);
        }
        float[] a2 = this.i.a(this.l);
        return a2 != null ? kg4.f(a2, j) : fd5.b.a();
    }

    @Override // defpackage.jm5
    public void d(long j) {
        int g = hn3.g(j);
        int f = hn3.f(j);
        float f2 = g;
        this.l.O(androidx.compose.ui.graphics.e.f(this.k) * f2);
        float f3 = f;
        this.l.P(androidx.compose.ui.graphics.e.g(this.k) * f3);
        sp1 sp1Var = this.l;
        if (sp1Var.B(sp1Var.d(), this.l.H(), this.l.d() + g, this.l.H() + f)) {
            this.e.i(du7.a(f2, f3));
            this.l.Q(this.e.d());
            invalidate();
            this.i.c();
        }
    }

    @Override // defpackage.jm5
    public void destroy() {
        if (this.l.F()) {
            this.l.C();
        }
        this.b = null;
        this.c = null;
        this.f = true;
        m(false);
        this.a.q0();
        this.a.o0(this);
    }

    @Override // defpackage.jm5
    public void e(androidx.compose.ui.graphics.d dVar, LayoutDirection layoutDirection, fm1 fm1Var) {
        qs2 qs2Var;
        int k = dVar.k() | this.m;
        int i = k & ProgressEvent.PART_FAILED_EVENT_CODE;
        if (i != 0) {
            this.k = dVar.j0();
        }
        boolean z = false;
        boolean z2 = this.l.J() && !this.e.e();
        if ((k & 1) != 0) {
            this.l.n(dVar.D0());
        }
        if ((k & 2) != 0) {
            this.l.t(dVar.y1());
        }
        if ((k & 4) != 0) {
            this.l.c(dVar.d());
        }
        if ((k & 8) != 0) {
            this.l.x(dVar.m1());
        }
        if ((k & 16) != 0) {
            this.l.g(dVar.d1());
        }
        if ((k & 32) != 0) {
            this.l.D(dVar.m());
        }
        if ((k & 64) != 0) {
            this.l.R(wn0.k(dVar.e()));
        }
        if ((k & 128) != 0) {
            this.l.T(wn0.k(dVar.u()));
        }
        if ((k & 1024) != 0) {
            this.l.s(dVar.R());
        }
        if ((k & JceEncryptionConstants.SYMMETRIC_KEY_LENGTH) != 0) {
            this.l.q(dVar.o1());
        }
        if ((k & 512) != 0) {
            this.l.r(dVar.M());
        }
        if ((k & ProgressEvent.PART_COMPLETED_EVENT_CODE) != 0) {
            this.l.p(dVar.f0());
        }
        if (i != 0) {
            this.l.O(androidx.compose.ui.graphics.e.f(this.k) * this.l.getWidth());
            this.l.P(androidx.compose.ui.graphics.e.g(this.k) * this.l.getHeight());
        }
        boolean z3 = dVar.f() && dVar.o() != qt6.a();
        if ((k & 24576) != 0) {
            this.l.S(z3);
            this.l.A(dVar.f() && dVar.o() == qt6.a());
        }
        if ((131072 & k) != 0) {
            sp1 sp1Var = this.l;
            dVar.l();
            sp1Var.h(null);
        }
        if ((32768 & k) != 0) {
            this.l.j(dVar.i());
        }
        boolean h = this.e.h(dVar.o(), dVar.d(), z3, dVar.m(), layoutDirection, fm1Var);
        if (this.e.b()) {
            this.l.Q(this.e.d());
        }
        if (z3 && !this.e.e()) {
            z = true;
        }
        if (z2 != z || (z && h)) {
            invalidate();
        } else {
            n();
        }
        if (!this.g && this.l.U() > 0.0f && (qs2Var = this.c) != null) {
            qs2Var.mo865invoke();
        }
        if ((k & 7963) != 0) {
            this.i.c();
        }
        this.m = dVar.k();
    }

    @Override // defpackage.jm5
    public void f(ss2 ss2Var, qs2 qs2Var) {
        m(false);
        this.f = false;
        this.g = false;
        this.k = androidx.compose.ui.graphics.e.b.a();
        this.b = ss2Var;
        this.c = qs2Var;
    }

    @Override // defpackage.jm5
    public boolean g(long j) {
        float o = fd5.o(j);
        float p = fd5.p(j);
        if (this.l.G()) {
            return 0.0f <= o && o < ((float) this.l.getWidth()) && 0.0f <= p && p < ((float) this.l.getHeight());
        }
        if (this.l.J()) {
            return this.e.f(j);
        }
        return true;
    }

    @Override // defpackage.jm5
    public void h(ph0 ph0Var) {
        Canvas d = wd.d(ph0Var);
        if (d.isHardwareAccelerated()) {
            k();
            boolean z = this.l.U() > 0.0f;
            this.g = z;
            if (z) {
                ph0Var.n();
            }
            this.l.z(d);
            if (this.g) {
                ph0Var.u();
                return;
            }
            return;
        }
        float d2 = this.l.d();
        float H = this.l.H();
        float y = this.l.y();
        float N = this.l.N();
        if (this.l.a() < 1.0f) {
            ao5 ao5Var = this.h;
            if (ao5Var == null) {
                ao5Var = uf.a();
                this.h = ao5Var;
            }
            ao5Var.c(this.l.a());
            d.saveLayer(d2, H, y, N, ao5Var.p());
        } else {
            ph0Var.t();
        }
        ph0Var.c(d2, H);
        ph0Var.v(this.i.b(this.l));
        l(ph0Var);
        ss2 ss2Var = this.b;
        if (ss2Var != null) {
            ss2Var.invoke(ph0Var);
        }
        ph0Var.k();
        m(false);
    }

    @Override // defpackage.jm5
    public void i(float[] fArr) {
        float[] a2 = this.i.a(this.l);
        if (a2 != null) {
            kg4.k(fArr, a2);
        }
    }

    @Override // defpackage.jm5
    public void invalidate() {
        if (this.d || this.f) {
            return;
        }
        this.a.invalidate();
        m(true);
    }

    @Override // defpackage.jm5
    public void j(long j) {
        int d = this.l.d();
        int H = this.l.H();
        int j2 = vm3.j(j);
        int k = vm3.k(j);
        if (d == j2 && H == k) {
            return;
        }
        if (d != j2) {
            this.l.M(j2 - d);
        }
        if (H != k) {
            this.l.E(k - H);
        }
        n();
        this.i.c();
    }

    @Override // defpackage.jm5
    public void k() {
        if (this.d || !this.l.F()) {
            ip5 c = (!this.l.J() || this.e.e()) ? null : this.e.c();
            ss2 ss2Var = this.b;
            if (ss2Var != null) {
                this.l.I(this.j, c, ss2Var);
            }
            m(false);
        }
    }
}
