package androidx.compose.foundation.layout;

import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.l;
import defpackage.bu1;
import defpackage.fv0;
import defpackage.iv0;
import defpackage.qg4;
import defpackage.sg4;
import defpackage.ss2;
import defpackage.uo6;
import defpackage.ww8;
import defpackage.xq3;
import defpackage.yq3;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes.dex */
final class UnspecifiedConstraintsNode extends Modifier.c implements androidx.compose.ui.node.c {
    private float n;
    private float r;

    public /* synthetic */ UnspecifiedConstraintsNode(float f, float f2, DefaultConstructorMarker defaultConstructorMarker) {
        this(f, f2);
    }

    @Override // androidx.compose.ui.node.c
    public sg4 d(androidx.compose.ui.layout.f fVar, qg4 qg4Var, long j) {
        float f = this.n;
        bu1.a aVar = bu1.b;
        final androidx.compose.ui.layout.l W = qg4Var.W(iv0.a((bu1.j(f, aVar.c()) || fv0.p(j) != 0) ? fv0.p(j) : uo6.d(uo6.i(fVar.l0(this.n), fv0.n(j)), 0), fv0.n(j), (bu1.j(this.r, aVar.c()) || fv0.o(j) != 0) ? fv0.o(j) : uo6.d(uo6.i(fVar.l0(this.r), fv0.m(j)), 0), fv0.m(j)));
        return androidx.compose.ui.layout.f.J(fVar, W.F0(), W.v0(), null, new ss2() { // from class: androidx.compose.foundation.layout.UnspecifiedConstraintsNode$measure$1
            {
                super(1);
            }

            public final void b(l.a aVar2) {
                l.a.j(aVar2, androidx.compose.ui.layout.l.this, 0, 0, 0.0f, 4, null);
            }

            @Override // defpackage.ss2
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                b((l.a) obj);
                return ww8.a;
            }
        }, 4, null);
    }

    public final void e2(float f) {
        this.r = f;
    }

    @Override // androidx.compose.ui.node.c
    public int f(yq3 yq3Var, xq3 xq3Var, int i) {
        return uo6.d(xq3Var.S(i), !bu1.j(this.n, bu1.b.c()) ? yq3Var.l0(this.n) : 0);
    }

    public final void f2(float f) {
        this.n = f;
    }

    @Override // androidx.compose.ui.node.c
    public int m(yq3 yq3Var, xq3 xq3Var, int i) {
        return uo6.d(xq3Var.i(i), !bu1.j(this.r, bu1.b.c()) ? yq3Var.l0(this.r) : 0);
    }

    @Override // androidx.compose.ui.node.c
    public int o(yq3 yq3Var, xq3 xq3Var, int i) {
        return uo6.d(xq3Var.H(i), !bu1.j(this.r, bu1.b.c()) ? yq3Var.l0(this.r) : 0);
    }

    @Override // androidx.compose.ui.node.c
    public int u(yq3 yq3Var, xq3 xq3Var, int i) {
        return uo6.d(xq3Var.V(i), !bu1.j(this.n, bu1.b.c()) ? yq3Var.l0(this.n) : 0);
    }

    private UnspecifiedConstraintsNode(float f, float f2) {
        this.n = f;
        this.r = f2;
    }
}
