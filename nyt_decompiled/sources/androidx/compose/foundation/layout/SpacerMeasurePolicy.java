package androidx.compose.foundation.layout;

import androidx.compose.ui.layout.l;
import defpackage.fv0;
import defpackage.rg4;
import defpackage.sg4;
import defpackage.ss2;
import defpackage.ww8;
import java.util.List;

/* loaded from: classes.dex */
final class SpacerMeasurePolicy implements rg4 {
    public static final SpacerMeasurePolicy a = new SpacerMeasurePolicy();

    private SpacerMeasurePolicy() {
    }

    @Override // defpackage.rg4
    public sg4 d(androidx.compose.ui.layout.f fVar, List list, long j) {
        return androidx.compose.ui.layout.f.J(fVar, fv0.l(j) ? fv0.n(j) : 0, fv0.k(j) ? fv0.m(j) : 0, null, new ss2() { // from class: androidx.compose.foundation.layout.SpacerMeasurePolicy$measure$1$1
            public final void b(l.a aVar) {
            }

            @Override // defpackage.ss2
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                b((l.a) obj);
                return ww8.a;
            }
        }, 4, null);
    }
}
