package androidx.compose.foundation.layout;

import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.l;
import defpackage.iv0;
import defpackage.qg4;
import defpackage.sg4;
import defpackage.ss2;
import defpackage.ww8;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes.dex */
final class PaddingNode extends Modifier.c implements androidx.compose.ui.node.c {
    private float n;
    private float r;
    private float s;
    private float t;
    private boolean u;

    public /* synthetic */ PaddingNode(float f, float f2, float f3, float f4, boolean z, DefaultConstructorMarker defaultConstructorMarker) {
        this(f, f2, f3, f4, z);
    }

    @Override // androidx.compose.ui.node.c
    public sg4 d(final androidx.compose.ui.layout.f fVar, qg4 qg4Var, long j) {
        int l0 = fVar.l0(this.n) + fVar.l0(this.s);
        int l02 = fVar.l0(this.r) + fVar.l0(this.t);
        final androidx.compose.ui.layout.l W = qg4Var.W(iv0.i(j, -l0, -l02));
        return androidx.compose.ui.layout.f.J(fVar, iv0.g(j, W.F0() + l0), iv0.f(j, W.v0() + l02), null, new ss2() { // from class: androidx.compose.foundation.layout.PaddingNode$measure$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            public final void b(l.a aVar) {
                if (PaddingNode.this.e2()) {
                    l.a.j(aVar, W, fVar.l0(PaddingNode.this.f2()), fVar.l0(PaddingNode.this.g2()), 0.0f, 4, null);
                } else {
                    l.a.f(aVar, W, fVar.l0(PaddingNode.this.f2()), fVar.l0(PaddingNode.this.g2()), 0.0f, 4, null);
                }
            }

            @Override // defpackage.ss2
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                b((l.a) obj);
                return ww8.a;
            }
        }, 4, null);
    }

    public final boolean e2() {
        return this.u;
    }

    public final float f2() {
        return this.n;
    }

    public final float g2() {
        return this.r;
    }

    public final void h2(float f) {
        this.t = f;
    }

    public final void i2(float f) {
        this.s = f;
    }

    public final void j2(boolean z) {
        this.u = z;
    }

    public final void k2(float f) {
        this.n = f;
    }

    public final void l2(float f) {
        this.r = f;
    }

    private PaddingNode(float f, float f2, float f3, float f4, boolean z) {
        this.n = f;
        this.r = f2;
        this.s = f3;
        this.t = f4;
        this.u = z;
    }
}
