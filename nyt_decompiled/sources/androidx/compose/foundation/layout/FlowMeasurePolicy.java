package androidx.compose.foundation.layout;

import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.ui.layout.l;
import defpackage.bu1;
import defpackage.it2;
import defpackage.iv0;
import defpackage.k37;
import defpackage.kl2;
import defpackage.rg4;
import defpackage.sg4;
import defpackage.ss2;
import defpackage.vy4;
import defpackage.ww8;
import defpackage.xk5;
import defpackage.xq3;
import defpackage.yq3;
import defpackage.zq3;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes.dex */
final class FlowMeasurePolicy implements rg4 {
    private final LayoutOrientation a;
    private final Arrangement.e b;
    private final Arrangement.m c;
    private final float d;
    private final SizeMode e;
    private final f f;
    private final float g;
    private final int h;
    private final it2 i;
    private final it2 j;
    private final it2 k;
    private final it2 l;

    public /* synthetic */ FlowMeasurePolicy(LayoutOrientation layoutOrientation, Arrangement.e eVar, Arrangement.m mVar, float f, SizeMode sizeMode, f fVar, float f2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(layoutOrientation, eVar, mVar, f, sizeMode, fVar, f2, i);
    }

    @Override // defpackage.rg4
    public int a(yq3 yq3Var, List list, int i) {
        return this.a == LayoutOrientation.Horizontal ? k(list, i, yq3Var.l0(this.d)) : j(list, i, yq3Var.l0(this.d), yq3Var.l0(this.g));
    }

    @Override // defpackage.rg4
    public sg4 d(final androidx.compose.ui.layout.f fVar, List list, long j) {
        int c;
        if (list.isEmpty()) {
            return androidx.compose.ui.layout.f.J(fVar, 0, 0, null, new ss2() { // from class: androidx.compose.foundation.layout.FlowMeasurePolicy$measure$1
                public final void b(l.a aVar) {
                }

                @Override // defpackage.ss2
                public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                    b((l.a) obj);
                    return ww8.a;
                }
            }, 4, null);
        }
        final l lVar = new l(this.a, this.b, this.c, this.d, this.e, this.f, list, new androidx.compose.ui.layout.l[list.size()], null);
        final kl2 e = FlowLayoutKt.e(fVar, lVar, this.a, xk5.c(j, this.a), this.h);
        vy4 b = e.b();
        int q = b.q();
        int[] iArr = new int[q];
        for (int i = 0; i < q; i++) {
            iArr[i] = ((k37) b.p()[i]).b();
        }
        final int[] iArr2 = new int[q];
        int a = e.a() + (fVar.l0(this.g) * (b.q() - 1));
        LayoutOrientation layoutOrientation = this.a;
        LayoutOrientation layoutOrientation2 = LayoutOrientation.Horizontal;
        if (layoutOrientation == layoutOrientation2) {
            Arrangement.m mVar = this.c;
            if (mVar == null) {
                throw new IllegalArgumentException("null verticalArrangement");
            }
            mVar.c(fVar, a, iArr, iArr2);
        } else {
            Arrangement.e eVar = this.b;
            if (eVar == null) {
                throw new IllegalArgumentException("null horizontalArrangement");
            }
            eVar.b(fVar, a, iArr, fVar.getLayoutDirection(), iArr2);
        }
        if (this.a == layoutOrientation2) {
            a = e.c();
            c = a;
        } else {
            c = e.c();
        }
        return androidx.compose.ui.layout.f.J(fVar, iv0.g(j, a), iv0.f(j, c), null, new ss2() { // from class: androidx.compose.foundation.layout.FlowMeasurePolicy$measure$6
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            public final void b(l.a aVar) {
                vy4 b2 = kl2.this.b();
                l lVar2 = lVar;
                int[] iArr3 = iArr2;
                androidx.compose.ui.layout.f fVar2 = fVar;
                int q2 = b2.q();
                if (q2 > 0) {
                    Object[] p = b2.p();
                    int i2 = 0;
                    do {
                        lVar2.i(aVar, (k37) p[i2], iArr3[i2], fVar2.getLayoutDirection());
                        i2++;
                    } while (i2 < q2);
                }
            }

            @Override // defpackage.ss2
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                b((l.a) obj);
                return ww8.a;
            }
        }, 4, null);
    }

    @Override // defpackage.rg4
    public int e(yq3 yq3Var, List list, int i) {
        return this.a == LayoutOrientation.Horizontal ? l(list, i, yq3Var.l0(this.d), yq3Var.l0(this.g)) : j(list, i, yq3Var.l0(this.d), yq3Var.l0(this.g));
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof FlowMeasurePolicy)) {
            return false;
        }
        FlowMeasurePolicy flowMeasurePolicy = (FlowMeasurePolicy) obj;
        return this.a == flowMeasurePolicy.a && zq3.c(this.b, flowMeasurePolicy.b) && zq3.c(this.c, flowMeasurePolicy.c) && bu1.j(this.d, flowMeasurePolicy.d) && this.e == flowMeasurePolicy.e && zq3.c(this.f, flowMeasurePolicy.f) && bu1.j(this.g, flowMeasurePolicy.g) && this.h == flowMeasurePolicy.h;
    }

    @Override // defpackage.rg4
    public int g(yq3 yq3Var, List list, int i) {
        return this.a == LayoutOrientation.Horizontal ? j(list, i, yq3Var.l0(this.d), yq3Var.l0(this.g)) : k(list, i, yq3Var.l0(this.d));
    }

    public int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        Arrangement.e eVar = this.b;
        int hashCode2 = (hashCode + (eVar == null ? 0 : eVar.hashCode())) * 31;
        Arrangement.m mVar = this.c;
        return ((((((((((hashCode2 + (mVar != null ? mVar.hashCode() : 0)) * 31) + bu1.k(this.d)) * 31) + this.e.hashCode()) * 31) + this.f.hashCode()) * 31) + bu1.k(this.g)) * 31) + Integer.hashCode(this.h);
    }

    @Override // defpackage.rg4
    public int i(yq3 yq3Var, List list, int i) {
        return this.a == LayoutOrientation.Horizontal ? j(list, i, yq3Var.l0(this.d), yq3Var.l0(this.g)) : l(list, i, yq3Var.l0(this.d), yq3Var.l0(this.g));
    }

    public final int j(List list, int i, int i2, int i3) {
        int f;
        f = FlowLayoutKt.f(list, this.l, this.k, i, i2, i3, this.h);
        return f;
    }

    public final int k(List list, int i, int i2) {
        int j;
        j = FlowLayoutKt.j(list, this.i, i, i2, this.h);
        return j;
    }

    public final int l(List list, int i, int i2, int i3) {
        int l;
        l = FlowLayoutKt.l(list, this.l, this.k, i, i2, i3, this.h);
        return l;
    }

    public String toString() {
        return "FlowMeasurePolicy(orientation=" + this.a + ", horizontalArrangement=" + this.b + ", verticalArrangement=" + this.c + ", mainAxisArrangementSpacing=" + ((Object) bu1.l(this.d)) + ", crossAxisSize=" + this.e + ", crossAxisAlignment=" + this.f + ", crossAxisArrangementSpacing=" + ((Object) bu1.l(this.g)) + ", maxItemsInMainAxis=" + this.h + ')';
    }

    private FlowMeasurePolicy(LayoutOrientation layoutOrientation, Arrangement.e eVar, Arrangement.m mVar, float f, SizeMode sizeMode, f fVar, float f2, int i) {
        this.a = layoutOrientation;
        this.b = eVar;
        this.c = mVar;
        this.d = f;
        this.e = sizeMode;
        this.f = fVar;
        this.g = f2;
        this.h = i;
        LayoutOrientation layoutOrientation2 = LayoutOrientation.Horizontal;
        this.i = layoutOrientation == layoutOrientation2 ? new it2() { // from class: androidx.compose.foundation.layout.FlowMeasurePolicy$maxMainAxisIntrinsicItemSize$1
            public final Integer b(xq3 xq3Var, int i2, int i3) {
                return Integer.valueOf(xq3Var.V(i3));
            }

            @Override // defpackage.it2
            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
                return b((xq3) obj, ((Number) obj2).intValue(), ((Number) obj3).intValue());
            }
        } : new it2() { // from class: androidx.compose.foundation.layout.FlowMeasurePolicy$maxMainAxisIntrinsicItemSize$2
            public final Integer b(xq3 xq3Var, int i2, int i3) {
                return Integer.valueOf(xq3Var.i(i3));
            }

            @Override // defpackage.it2
            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
                return b((xq3) obj, ((Number) obj2).intValue(), ((Number) obj3).intValue());
            }
        };
        this.j = layoutOrientation == layoutOrientation2 ? new it2() { // from class: androidx.compose.foundation.layout.FlowMeasurePolicy$maxCrossAxisIntrinsicItemSize$1
            public final Integer b(xq3 xq3Var, int i2, int i3) {
                return Integer.valueOf(xq3Var.i(i3));
            }

            @Override // defpackage.it2
            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
                return b((xq3) obj, ((Number) obj2).intValue(), ((Number) obj3).intValue());
            }
        } : new it2() { // from class: androidx.compose.foundation.layout.FlowMeasurePolicy$maxCrossAxisIntrinsicItemSize$2
            public final Integer b(xq3 xq3Var, int i2, int i3) {
                return Integer.valueOf(xq3Var.V(i3));
            }

            @Override // defpackage.it2
            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
                return b((xq3) obj, ((Number) obj2).intValue(), ((Number) obj3).intValue());
            }
        };
        this.k = layoutOrientation == layoutOrientation2 ? new it2() { // from class: androidx.compose.foundation.layout.FlowMeasurePolicy$minCrossAxisIntrinsicItemSize$1
            public final Integer b(xq3 xq3Var, int i2, int i3) {
                return Integer.valueOf(xq3Var.H(i3));
            }

            @Override // defpackage.it2
            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
                return b((xq3) obj, ((Number) obj2).intValue(), ((Number) obj3).intValue());
            }
        } : new it2() { // from class: androidx.compose.foundation.layout.FlowMeasurePolicy$minCrossAxisIntrinsicItemSize$2
            public final Integer b(xq3 xq3Var, int i2, int i3) {
                return Integer.valueOf(xq3Var.S(i3));
            }

            @Override // defpackage.it2
            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
                return b((xq3) obj, ((Number) obj2).intValue(), ((Number) obj3).intValue());
            }
        };
        this.l = layoutOrientation == layoutOrientation2 ? new it2() { // from class: androidx.compose.foundation.layout.FlowMeasurePolicy$minMainAxisIntrinsicItemSize$1
            public final Integer b(xq3 xq3Var, int i2, int i3) {
                return Integer.valueOf(xq3Var.S(i3));
            }

            @Override // defpackage.it2
            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
                return b((xq3) obj, ((Number) obj2).intValue(), ((Number) obj3).intValue());
            }
        } : new it2() { // from class: androidx.compose.foundation.layout.FlowMeasurePolicy$minMainAxisIntrinsicItemSize$2
            public final Integer b(xq3 xq3Var, int i2, int i3) {
                return Integer.valueOf(xq3Var.H(i3));
            }

            @Override // defpackage.it2
            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
                return b((xq3) obj, ((Number) obj2).intValue(), ((Number) obj3).intValue());
            }
        };
    }
}
