package androidx.compose.foundation.layout;

import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.ui.layout.l;
import defpackage.bu1;
import defpackage.it2;
import defpackage.k37;
import defpackage.rg4;
import defpackage.sg4;
import defpackage.ss2;
import defpackage.ww8;
import defpackage.yq3;
import defpackage.zq3;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes.dex */
public final class RowColumnMeasurePolicy implements rg4 {
    private final LayoutOrientation a;
    private final Arrangement.e b;
    private final Arrangement.m c;
    private final float d;
    private final SizeMode e;
    private final f f;

    public /* synthetic */ RowColumnMeasurePolicy(LayoutOrientation layoutOrientation, Arrangement.e eVar, Arrangement.m mVar, float f, SizeMode sizeMode, f fVar, DefaultConstructorMarker defaultConstructorMarker) {
        this(layoutOrientation, eVar, mVar, f, sizeMode, fVar);
    }

    @Override // defpackage.rg4
    public int a(yq3 yq3Var, List list, int i) {
        it2 b;
        b = k.b(this.a);
        return ((Number) b.invoke(list, Integer.valueOf(i), Integer.valueOf(yq3Var.l0(this.d)))).intValue();
    }

    @Override // defpackage.rg4
    public sg4 d(final androidx.compose.ui.layout.f fVar, List list, long j) {
        int b;
        int e;
        final l lVar = new l(this.a, this.b, this.c, this.d, this.e, this.f, list, new androidx.compose.ui.layout.l[list.size()], null);
        final k37 h = lVar.h(fVar, j, 0, list.size());
        if (this.a == LayoutOrientation.Horizontal) {
            b = h.e();
            e = h.b();
        } else {
            b = h.b();
            e = h.e();
        }
        return androidx.compose.ui.layout.f.J(fVar, b, e, null, new ss2() { // from class: androidx.compose.foundation.layout.RowColumnMeasurePolicy$measure$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            public final void b(l.a aVar) {
                l.this.i(aVar, h, 0, fVar.getLayoutDirection());
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
        it2 d;
        d = k.d(this.a);
        return ((Number) d.invoke(list, Integer.valueOf(i), Integer.valueOf(yq3Var.l0(this.d)))).intValue();
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof RowColumnMeasurePolicy)) {
            return false;
        }
        RowColumnMeasurePolicy rowColumnMeasurePolicy = (RowColumnMeasurePolicy) obj;
        return this.a == rowColumnMeasurePolicy.a && zq3.c(this.b, rowColumnMeasurePolicy.b) && zq3.c(this.c, rowColumnMeasurePolicy.c) && bu1.j(this.d, rowColumnMeasurePolicy.d) && this.e == rowColumnMeasurePolicy.e && zq3.c(this.f, rowColumnMeasurePolicy.f);
    }

    @Override // defpackage.rg4
    public int g(yq3 yq3Var, List list, int i) {
        it2 a;
        a = k.a(this.a);
        return ((Number) a.invoke(list, Integer.valueOf(i), Integer.valueOf(yq3Var.l0(this.d)))).intValue();
    }

    public int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        Arrangement.e eVar = this.b;
        int hashCode2 = (hashCode + (eVar == null ? 0 : eVar.hashCode())) * 31;
        Arrangement.m mVar = this.c;
        return ((((((hashCode2 + (mVar != null ? mVar.hashCode() : 0)) * 31) + bu1.k(this.d)) * 31) + this.e.hashCode()) * 31) + this.f.hashCode();
    }

    @Override // defpackage.rg4
    public int i(yq3 yq3Var, List list, int i) {
        it2 c;
        c = k.c(this.a);
        return ((Number) c.invoke(list, Integer.valueOf(i), Integer.valueOf(yq3Var.l0(this.d)))).intValue();
    }

    public String toString() {
        return "RowColumnMeasurePolicy(orientation=" + this.a + ", horizontalArrangement=" + this.b + ", verticalArrangement=" + this.c + ", arrangementSpacing=" + ((Object) bu1.l(this.d)) + ", crossAxisSize=" + this.e + ", crossAxisAlignment=" + this.f + ')';
    }

    private RowColumnMeasurePolicy(LayoutOrientation layoutOrientation, Arrangement.e eVar, Arrangement.m mVar, float f, SizeMode sizeMode, f fVar) {
        this.a = layoutOrientation;
        this.b = eVar;
        this.c = mVar;
        this.d = f;
        this.e = sizeMode;
        this.f = fVar;
    }
}
