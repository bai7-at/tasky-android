package androidx.compose.foundation.layout;

import androidx.compose.ui.Alignment;
import androidx.compose.ui.layout.l;
import androidx.compose.ui.unit.LayoutDirection;
import defpackage.fv0;
import defpackage.iv0;
import defpackage.qg4;
import defpackage.rg4;
import defpackage.sg4;
import defpackage.ss2;
import defpackage.ww8;
import defpackage.zq3;
import java.util.List;
import kotlin.jvm.internal.Ref$IntRef;

/* loaded from: classes.dex */
final class BoxMeasurePolicy implements rg4 {
    private final Alignment a;
    private final boolean b;

    public BoxMeasurePolicy(Alignment alignment, boolean z) {
        this.a = alignment;
        this.b = z;
    }

    @Override // defpackage.rg4
    public sg4 d(final androidx.compose.ui.layout.f fVar, final List list, long j) {
        boolean e;
        boolean e2;
        boolean e3;
        int p;
        int o;
        androidx.compose.ui.layout.l W;
        if (list.isEmpty()) {
            return androidx.compose.ui.layout.f.J(fVar, fv0.p(j), fv0.o(j), null, new ss2() { // from class: androidx.compose.foundation.layout.BoxMeasurePolicy$measure$1
                public final void b(l.a aVar) {
                }

                @Override // defpackage.ss2
                public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                    b((l.a) obj);
                    return ww8.a;
                }
            }, 4, null);
        }
        long e4 = this.b ? j : fv0.e(j, 0, 0, 0, 0, 10, null);
        if (list.size() == 1) {
            final qg4 qg4Var = (qg4) list.get(0);
            e3 = BoxKt.e(qg4Var);
            if (e3) {
                p = fv0.p(j);
                o = fv0.o(j);
                W = qg4Var.W(fv0.b.c(fv0.p(j), fv0.o(j)));
            } else {
                W = qg4Var.W(e4);
                p = Math.max(fv0.p(j), W.F0());
                o = Math.max(fv0.o(j), W.v0());
            }
            final int i = o;
            final androidx.compose.ui.layout.l lVar = W;
            final int i2 = p;
            return androidx.compose.ui.layout.f.J(fVar, i2, i, null, new ss2() { // from class: androidx.compose.foundation.layout.BoxMeasurePolicy$measure$2
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(1);
                }

                public final void b(l.a aVar) {
                    Alignment alignment;
                    androidx.compose.ui.layout.l lVar2 = androidx.compose.ui.layout.l.this;
                    qg4 qg4Var2 = qg4Var;
                    LayoutDirection layoutDirection = fVar.getLayoutDirection();
                    int i3 = i2;
                    int i4 = i;
                    alignment = this.a;
                    BoxKt.f(aVar, lVar2, qg4Var2, layoutDirection, i3, i4, alignment);
                }

                @Override // defpackage.ss2
                public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                    b((l.a) obj);
                    return ww8.a;
                }
            }, 4, null);
        }
        final androidx.compose.ui.layout.l[] lVarArr = new androidx.compose.ui.layout.l[list.size()];
        final Ref$IntRef ref$IntRef = new Ref$IntRef();
        ref$IntRef.element = fv0.p(j);
        final Ref$IntRef ref$IntRef2 = new Ref$IntRef();
        ref$IntRef2.element = fv0.o(j);
        int size = list.size();
        boolean z = false;
        for (int i3 = 0; i3 < size; i3++) {
            qg4 qg4Var2 = (qg4) list.get(i3);
            e2 = BoxKt.e(qg4Var2);
            if (e2) {
                z = true;
            } else {
                androidx.compose.ui.layout.l W2 = qg4Var2.W(e4);
                lVarArr[i3] = W2;
                ref$IntRef.element = Math.max(ref$IntRef.element, W2.F0());
                ref$IntRef2.element = Math.max(ref$IntRef2.element, W2.v0());
            }
        }
        if (z) {
            int i4 = ref$IntRef.element;
            int i5 = i4 != Integer.MAX_VALUE ? i4 : 0;
            int i6 = ref$IntRef2.element;
            long a = iv0.a(i5, i4, i6 != Integer.MAX_VALUE ? i6 : 0, i6);
            int size2 = list.size();
            for (int i7 = 0; i7 < size2; i7++) {
                qg4 qg4Var3 = (qg4) list.get(i7);
                e = BoxKt.e(qg4Var3);
                if (e) {
                    lVarArr[i7] = qg4Var3.W(a);
                }
            }
        }
        return androidx.compose.ui.layout.f.J(fVar, ref$IntRef.element, ref$IntRef2.element, null, new ss2() { // from class: androidx.compose.foundation.layout.BoxMeasurePolicy$measure$5
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            public final void b(l.a aVar) {
                Alignment alignment;
                androidx.compose.ui.layout.l[] lVarArr2 = lVarArr;
                List<qg4> list2 = list;
                androidx.compose.ui.layout.f fVar2 = fVar;
                Ref$IntRef ref$IntRef3 = ref$IntRef;
                Ref$IntRef ref$IntRef4 = ref$IntRef2;
                BoxMeasurePolicy boxMeasurePolicy = this;
                int length = lVarArr2.length;
                int i8 = 0;
                int i9 = 0;
                while (i8 < length) {
                    androidx.compose.ui.layout.l lVar2 = lVarArr2[i8];
                    zq3.f(lVar2, "null cannot be cast to non-null type androidx.compose.ui.layout.Placeable");
                    qg4 qg4Var4 = list2.get(i9);
                    LayoutDirection layoutDirection = fVar2.getLayoutDirection();
                    int i10 = ref$IntRef3.element;
                    int i11 = ref$IntRef4.element;
                    alignment = boxMeasurePolicy.a;
                    BoxKt.f(aVar, lVar2, qg4Var4, layoutDirection, i10, i11, alignment);
                    i8++;
                    i9++;
                }
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
        if (!(obj instanceof BoxMeasurePolicy)) {
            return false;
        }
        BoxMeasurePolicy boxMeasurePolicy = (BoxMeasurePolicy) obj;
        return zq3.c(this.a, boxMeasurePolicy.a) && this.b == boxMeasurePolicy.b;
    }

    public int hashCode() {
        return (this.a.hashCode() * 31) + Boolean.hashCode(this.b);
    }

    public String toString() {
        return "BoxMeasurePolicy(alignment=" + this.a + ", propagateMinConstraints=" + this.b + ')';
    }
}
