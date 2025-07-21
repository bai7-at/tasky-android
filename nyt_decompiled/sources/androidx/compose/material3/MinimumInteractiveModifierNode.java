package androidx.compose.material3;

import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.l;
import defpackage.ct0;
import defpackage.dg4;
import defpackage.dt0;
import defpackage.fu1;
import defpackage.qg4;
import defpackage.sg4;
import defpackage.ss2;
import defpackage.ww8;

/* loaded from: classes.dex */
public final class MinimumInteractiveModifierNode extends Modifier.c implements ct0, androidx.compose.ui.node.c {
    @Override // androidx.compose.ui.node.c
    public sg4 d(androidx.compose.ui.layout.f fVar, qg4 qg4Var, long j) {
        long j2;
        j2 = InteractiveComponentSizeKt.c;
        final l W = qg4Var.W(j);
        boolean z = L1() && ((Boolean) dt0.a(this, InteractiveComponentSizeKt.b())).booleanValue();
        final int max = z ? Math.max(W.F0(), fVar.l0(fu1.h(j2))) : W.F0();
        final int max2 = z ? Math.max(W.v0(), fVar.l0(fu1.g(j2))) : W.v0();
        return androidx.compose.ui.layout.f.J(fVar, max, max2, null, new ss2() { // from class: androidx.compose.material3.MinimumInteractiveModifierNode$measure$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            public final void b(l.a aVar) {
                l.a.f(aVar, W, dg4.d((max - W.F0()) / 2.0f), dg4.d((max2 - W.v0()) / 2.0f), 0.0f, 4, null);
            }

            @Override // defpackage.ss2
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                b((l.a) obj);
                return ww8.a;
            }
        }, 4, null);
    }
}
