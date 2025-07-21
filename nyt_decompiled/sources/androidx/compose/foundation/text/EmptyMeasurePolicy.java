package androidx.compose.foundation.text;

import androidx.compose.ui.layout.f;
import androidx.compose.ui.layout.l;
import defpackage.fv0;
import defpackage.rg4;
import defpackage.sg4;
import defpackage.ss2;
import defpackage.ww8;
import java.util.List;

/* loaded from: classes.dex */
final class EmptyMeasurePolicy implements rg4 {
    public static final EmptyMeasurePolicy a = new EmptyMeasurePolicy();
    private static final ss2 b = new ss2() { // from class: androidx.compose.foundation.text.EmptyMeasurePolicy$placementBlock$1
        public final void b(l.a aVar) {
        }

        @Override // defpackage.ss2
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            b((l.a) obj);
            return ww8.a;
        }
    };

    private EmptyMeasurePolicy() {
    }

    @Override // defpackage.rg4
    public sg4 d(f fVar, List list, long j) {
        return f.J(fVar, fv0.n(j), fv0.m(j), null, b, 4, null);
    }
}
