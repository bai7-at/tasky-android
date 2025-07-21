package androidx.compose.foundation.layout;

import androidx.compose.runtime.b0;
import androidx.compose.ui.layout.l;
import defpackage.hv4;
import defpackage.iv0;
import defpackage.mv4;
import defpackage.n76;
import defpackage.nv4;
import defpackage.qg4;
import defpackage.sg4;
import defpackage.ss2;
import defpackage.sy4;
import defpackage.uh9;
import defpackage.ww8;
import defpackage.zq3;

/* loaded from: classes.dex */
public final class InsetsPaddingModifier implements androidx.compose.ui.layout.c, hv4, mv4 {
    private final o b;
    private final sy4 c;
    private final sy4 d;

    public InsetsPaddingModifier(o oVar) {
        this.b = oVar;
        this.c = b0.e(oVar, null, 2, null);
        this.d = b0.e(oVar, null, 2, null);
    }

    private final o l() {
        return (o) this.d.getValue();
    }

    private final o r() {
        return (o) this.c.getValue();
    }

    private final void v(o oVar) {
        this.d.setValue(oVar);
    }

    private final void x(o oVar) {
        this.c.setValue(oVar);
    }

    @Override // defpackage.hv4
    public void c(nv4 nv4Var) {
        o oVar = (o) nv4Var.l(WindowInsetsPaddingKt.a());
        x(uh9.e(this.b, oVar));
        v(uh9.g(oVar, this.b));
    }

    @Override // androidx.compose.ui.layout.c
    public sg4 d(androidx.compose.ui.layout.f fVar, qg4 qg4Var, long j) {
        final int b = r().b(fVar, fVar.getLayoutDirection());
        final int a = r().a(fVar);
        int d = r().d(fVar, fVar.getLayoutDirection()) + b;
        int c = r().c(fVar) + a;
        final androidx.compose.ui.layout.l W = qg4Var.W(iv0.i(j, -d, -c));
        return androidx.compose.ui.layout.f.J(fVar, iv0.g(j, W.F0() + d), iv0.f(j, W.v0() + c), null, new ss2() { // from class: androidx.compose.foundation.layout.InsetsPaddingModifier$measure$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            public final void b(l.a aVar) {
                l.a.f(aVar, androidx.compose.ui.layout.l.this, b, a, 0.0f, 4, null);
            }

            @Override // defpackage.ss2
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                b((l.a) obj);
                return ww8.a;
            }
        }, 4, null);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof InsetsPaddingModifier) {
            return zq3.c(((InsetsPaddingModifier) obj).b, this.b);
        }
        return false;
    }

    @Override // defpackage.mv4
    public n76 getKey() {
        return WindowInsetsPaddingKt.a();
    }

    public int hashCode() {
        return this.b.hashCode();
    }

    @Override // defpackage.mv4
    /* renamed from: t, reason: merged with bridge method [inline-methods] */
    public o getValue() {
        return l();
    }
}
