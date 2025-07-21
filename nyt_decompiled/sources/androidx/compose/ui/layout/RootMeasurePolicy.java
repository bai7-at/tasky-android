package androidx.compose.ui.layout;

import androidx.compose.ui.layout.l;
import androidx.compose.ui.node.LayoutNode;
import defpackage.fv0;
import defpackage.iv0;
import defpackage.qg4;
import defpackage.sg4;
import defpackage.ss2;
import defpackage.ww8;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
public final class RootMeasurePolicy extends LayoutNode.d {
    public static final RootMeasurePolicy b = new RootMeasurePolicy();

    private RootMeasurePolicy() {
        super("Undefined intrinsics block and it is required");
    }

    @Override // defpackage.rg4
    public sg4 d(f fVar, List list, long j) {
        if (list.isEmpty()) {
            return f.J(fVar, fv0.p(j), fv0.o(j), null, new ss2() { // from class: androidx.compose.ui.layout.RootMeasurePolicy$measure$1
                public final void b(l.a aVar) {
                }

                @Override // defpackage.ss2
                public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                    b((l.a) obj);
                    return ww8.a;
                }
            }, 4, null);
        }
        if (list.size() == 1) {
            final l W = ((qg4) list.get(0)).W(j);
            return f.J(fVar, iv0.g(j, W.F0()), iv0.f(j, W.v0()), null, new ss2() { // from class: androidx.compose.ui.layout.RootMeasurePolicy$measure$2
                {
                    super(1);
                }

                public final void b(l.a aVar) {
                    l.a.n(aVar, l.this, 0, 0, 0.0f, null, 12, null);
                }

                @Override // defpackage.ss2
                public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                    b((l.a) obj);
                    return ww8.a;
                }
            }, 4, null);
        }
        final ArrayList arrayList = new ArrayList(list.size());
        int size = list.size();
        for (int i = 0; i < size; i++) {
            arrayList.add(((qg4) list.get(i)).W(j));
        }
        int size2 = arrayList.size();
        int i2 = 0;
        int i3 = 0;
        for (int i4 = 0; i4 < size2; i4++) {
            l lVar = (l) arrayList.get(i4);
            i2 = Math.max(lVar.F0(), i2);
            i3 = Math.max(lVar.v0(), i3);
        }
        return f.J(fVar, iv0.g(j, i2), iv0.f(j, i3), null, new ss2() { // from class: androidx.compose.ui.layout.RootMeasurePolicy$measure$4
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            public final void b(l.a aVar) {
                List<l> list2 = arrayList;
                int size3 = list2.size();
                for (int i5 = 0; i5 < size3; i5++) {
                    l.a.n(aVar, list2.get(i5), 0, 0, 0.0f, null, 12, null);
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
