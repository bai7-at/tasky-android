package androidx.compose.foundation.text;

import androidx.compose.ui.layout.f;
import androidx.compose.ui.layout.l;
import defpackage.dg4;
import defpackage.fv0;
import defpackage.iv0;
import defpackage.kt6;
import defpackage.qg4;
import defpackage.qs2;
import defpackage.rg4;
import defpackage.sg4;
import defpackage.ss2;
import defpackage.vm3;
import defpackage.wm3;
import defpackage.ww8;
import java.util.ArrayList;
import java.util.List;
import kotlin.Pair;

/* loaded from: classes.dex */
final class TextMeasurePolicy implements rg4 {
    private final qs2 a;

    public TextMeasurePolicy(qs2 qs2Var) {
        this.a = qs2Var;
    }

    @Override // defpackage.rg4
    public sg4 d(f fVar, List list, long j) {
        List list2 = (List) this.a.mo865invoke();
        final ArrayList arrayList = null;
        if (list2 != null) {
            ArrayList arrayList2 = new ArrayList(list2.size());
            int size = list2.size();
            for (int i = 0; i < size; i++) {
                kt6 kt6Var = (kt6) list2.get(i);
                Pair pair = kt6Var != null ? new Pair(((qg4) list.get(i)).W(iv0.b(0, (int) Math.floor(kt6Var.n()), 0, (int) Math.floor(kt6Var.h()), 5, null)), vm3.b(wm3.a(dg4.d(kt6Var.i()), dg4.d(kt6Var.l())))) : null;
                if (pair != null) {
                    arrayList2.add(pair);
                }
            }
            arrayList = arrayList2;
        }
        return f.J(fVar, fv0.n(j), fv0.m(j), null, new ss2() { // from class: androidx.compose.foundation.text.TextMeasurePolicy$measure$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            public final void b(l.a aVar) {
                List<Pair<l, vm3>> list3 = arrayList;
                if (list3 != null) {
                    int size2 = list3.size();
                    for (int i2 = 0; i2 < size2; i2++) {
                        Pair<l, vm3> pair2 = list3.get(i2);
                        l.a.h(aVar, (l) pair2.a(), ((vm3) pair2.b()).n(), 0.0f, 2, null);
                    }
                }
            }

            @Override // defpackage.ss2
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                b((l.a) obj);
                return ww8.a;
            }
        }, 4, null);
    }
}
