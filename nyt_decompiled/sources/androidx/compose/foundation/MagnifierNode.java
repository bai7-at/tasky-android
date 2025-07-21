package androidx.compose.foundation;

import android.view.View;
import androidx.compose.runtime.b0;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.node.l;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.ui.platform.CompositionLocalsKt;
import defpackage.bu1;
import defpackage.ct0;
import defpackage.cv1;
import defpackage.cz3;
import defpackage.dt0;
import defpackage.ej7;
import defpackage.ez3;
import defpackage.f13;
import defpackage.fd5;
import defpackage.fm1;
import defpackage.fu1;
import defpackage.hd5;
import defpackage.hn3;
import defpackage.in3;
import defpackage.lj7;
import defpackage.qs2;
import defpackage.ru5;
import defpackage.ss2;
import defpackage.sy4;
import defpackage.ww8;
import defpackage.xc5;
import defpackage.yv0;
import defpackage.zq3;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;

/* loaded from: classes.dex */
public final class MagnifierNode extends Modifier.c implements ct0, f13, cv1, ej7, xc5 {
    private boolean B;
    private j H;
    private View L;
    private fm1 M;
    private ru5 N;
    private final sy4 Q;
    private long S;
    private hn3 X;
    private ss2 n;
    private ss2 r;
    private ss2 s;
    private float t;
    private boolean u;
    private long w;
    private float x;
    private float y;

    public /* synthetic */ MagnifierNode(ss2 ss2Var, ss2 ss2Var2, ss2 ss2Var3, float f, boolean z, long j, float f2, float f3, boolean z2, j jVar, DefaultConstructorMarker defaultConstructorMarker) {
        this(ss2Var, ss2Var2, ss2Var3, f, z, j, f2, f3, z2, jVar);
    }

    private final long m2() {
        return ((fd5) this.Q.getValue()).x();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void n2() {
        fm1 fm1Var;
        ru5 ru5Var = this.N;
        if (ru5Var != null) {
            ru5Var.dismiss();
        }
        View view = this.L;
        if (view == null || (fm1Var = this.M) == null) {
            return;
        }
        this.N = this.H.b(view, this.u, this.w, this.x, this.y, this.B, fm1Var, this.t);
        r2();
    }

    private final void o2(long j) {
        this.Q.setValue(fd5.d(j));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void q2() {
        fm1 fm1Var;
        long b;
        ru5 ru5Var = this.N;
        if (ru5Var == null || (fm1Var = this.M) == null) {
            return;
        }
        long x = ((fd5) this.n.invoke(fm1Var)).x();
        long t = (hd5.c(m2()) && hd5.c(x)) ? fd5.t(m2(), x) : fd5.b.b();
        this.S = t;
        if (!hd5.c(t)) {
            ru5Var.dismiss();
            return;
        }
        ss2 ss2Var = this.r;
        if (ss2Var != null) {
            fd5 d = fd5.d(((fd5) ss2Var.invoke(fm1Var)).x());
            if (!hd5.c(d.x())) {
                d = null;
            }
            if (d != null) {
                b = fd5.t(m2(), d.x());
                ru5Var.b(this.S, b, this.t);
                r2();
            }
        }
        b = fd5.b.b();
        ru5Var.b(this.S, b, this.t);
        r2();
    }

    private final void r2() {
        fm1 fm1Var;
        ru5 ru5Var = this.N;
        if (ru5Var == null || (fm1Var = this.M) == null || hn3.d(ru5Var.a(), this.X)) {
            return;
        }
        ss2 ss2Var = this.s;
        if (ss2Var != null) {
            ss2Var.invoke(fu1.c(fm1Var.B(in3.c(ru5Var.a()))));
        }
        this.X = hn3.b(ru5Var.a());
    }

    @Override // androidx.compose.ui.Modifier.c
    public void O1() {
        g0();
    }

    @Override // androidx.compose.ui.Modifier.c
    public void P1() {
        ru5 ru5Var = this.N;
        if (ru5Var != null) {
            ru5Var.dismiss();
        }
        this.N = null;
    }

    @Override // defpackage.xc5
    public void g0() {
        l.a(this, new qs2() { // from class: androidx.compose.foundation.MagnifierNode$onObservedReadsChanged$1
            {
                super(0);
            }

            @Override // defpackage.qs2
            /* renamed from: invoke */
            public /* bridge */ /* synthetic */ Object mo865invoke() {
                m20invoke();
                return ww8.a;
            }

            /* renamed from: invoke, reason: collision with other method in class */
            public final void m20invoke() {
                View view;
                fm1 fm1Var;
                ru5 ru5Var;
                view = MagnifierNode.this.L;
                View view2 = (View) dt0.a(MagnifierNode.this, AndroidCompositionLocals_androidKt.k());
                MagnifierNode.this.L = view2;
                fm1Var = MagnifierNode.this.M;
                fm1 fm1Var2 = (fm1) dt0.a(MagnifierNode.this, CompositionLocalsKt.e());
                MagnifierNode.this.M = fm1Var2;
                ru5Var = MagnifierNode.this.N;
                if (ru5Var == null || !zq3.c(view2, view) || !zq3.c(fm1Var2, fm1Var)) {
                    MagnifierNode.this.n2();
                }
                MagnifierNode.this.q2();
            }
        });
    }

    @Override // defpackage.f13
    public void k(cz3 cz3Var) {
        o2(ez3.e(cz3Var));
    }

    public final void p2(ss2 ss2Var, ss2 ss2Var2, float f, boolean z, long j, float f2, float f3, boolean z2, ss2 ss2Var3, j jVar) {
        float f4 = this.t;
        long j2 = this.w;
        float f5 = this.x;
        float f6 = this.y;
        boolean z3 = this.B;
        j jVar2 = this.H;
        this.n = ss2Var;
        this.r = ss2Var2;
        this.t = f;
        this.u = z;
        this.w = j;
        this.x = f2;
        this.y = f3;
        this.B = z2;
        this.s = ss2Var3;
        this.H = jVar;
        if (this.N == null || ((f != f4 && !jVar.a()) || !fu1.f(j, j2) || !bu1.j(f2, f5) || !bu1.j(f3, f6) || z2 != z3 || !zq3.c(jVar, jVar2))) {
            n2();
        }
        q2();
    }

    @Override // defpackage.ej7
    public void u0(lj7 lj7Var) {
        lj7Var.a(Magnifier_androidKt.a(), new qs2() { // from class: androidx.compose.foundation.MagnifierNode$applySemantics$1
            {
                super(0);
            }

            public final long b() {
                long j;
                j = MagnifierNode.this.S;
                return j;
            }

            @Override // defpackage.qs2
            /* renamed from: invoke */
            public /* bridge */ /* synthetic */ Object mo865invoke() {
                return fd5.d(b());
            }
        });
    }

    @Override // defpackage.cv1
    public void w(yv0 yv0Var) {
        yv0Var.A1();
        BuildersKt__Builders_commonKt.launch$default(E1(), null, null, new MagnifierNode$draw$1(this, null), 3, null);
    }

    private MagnifierNode(ss2 ss2Var, ss2 ss2Var2, ss2 ss2Var3, float f, boolean z, long j, float f2, float f3, boolean z2, j jVar) {
        this.n = ss2Var;
        this.r = ss2Var2;
        this.s = ss2Var3;
        this.t = f;
        this.u = z;
        this.w = j;
        this.x = f2;
        this.y = f3;
        this.B = z2;
        this.H = jVar;
        fd5.a aVar = fd5.b;
        this.Q = b0.e(fd5.d(aVar.b()), null, 2, null);
        this.S = aVar.b();
    }
}
