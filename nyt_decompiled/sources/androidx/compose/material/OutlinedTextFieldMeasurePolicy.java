package androidx.compose.material;

import androidx.compose.ui.layout.l;
import androidx.compose.ui.unit.LayoutDirection;
import defpackage.cg4;
import defpackage.du7;
import defpackage.fv0;
import defpackage.gt2;
import defpackage.iv0;
import defpackage.qg4;
import defpackage.rg4;
import defpackage.sg4;
import defpackage.ss2;
import defpackage.ww8;
import defpackage.xq3;
import defpackage.ym5;
import defpackage.yq3;
import defpackage.zq3;
import defpackage.zt7;
import java.util.List;
import java.util.NoSuchElementException;

/* loaded from: classes.dex */
final class OutlinedTextFieldMeasurePolicy implements rg4 {
    private final ss2 a;
    private final boolean b;
    private final float c;
    private final ym5 d;

    public OutlinedTextFieldMeasurePolicy(ss2 ss2Var, boolean z, float f, ym5 ym5Var) {
        this.a = ss2Var;
        this.b = z;
        this.c = f;
        this.d = ym5Var;
    }

    private final int m(yq3 yq3Var, List list, int i, gt2 gt2Var) {
        Object obj;
        Object obj2;
        int i2;
        int i3;
        Object obj3;
        int i4;
        Object obj4;
        int j;
        int size = list.size();
        int i5 = 0;
        while (true) {
            obj = null;
            if (i5 >= size) {
                obj2 = null;
                break;
            }
            obj2 = list.get(i5);
            if (zq3.c(TextFieldImplKt.f((xq3) obj2), "Leading")) {
                break;
            }
            i5++;
        }
        xq3 xq3Var = (xq3) obj2;
        if (xq3Var != null) {
            i2 = i - xq3Var.V(Integer.MAX_VALUE);
            i3 = ((Number) gt2Var.invoke(xq3Var, Integer.valueOf(i))).intValue();
        } else {
            i2 = i;
            i3 = 0;
        }
        int size2 = list.size();
        int i6 = 0;
        while (true) {
            if (i6 >= size2) {
                obj3 = null;
                break;
            }
            obj3 = list.get(i6);
            if (zq3.c(TextFieldImplKt.f((xq3) obj3), "Trailing")) {
                break;
            }
            i6++;
        }
        xq3 xq3Var2 = (xq3) obj3;
        if (xq3Var2 != null) {
            i2 -= xq3Var2.V(Integer.MAX_VALUE);
            i4 = ((Number) gt2Var.invoke(xq3Var2, Integer.valueOf(i))).intValue();
        } else {
            i4 = 0;
        }
        int size3 = list.size();
        int i7 = 0;
        while (true) {
            if (i7 >= size3) {
                obj4 = null;
                break;
            }
            obj4 = list.get(i7);
            if (zq3.c(TextFieldImplKt.f((xq3) obj4), "Label")) {
                break;
            }
            i7++;
        }
        Object obj5 = (xq3) obj4;
        int intValue = obj5 != null ? ((Number) gt2Var.invoke(obj5, Integer.valueOf(cg4.b(i2, i, this.c)))).intValue() : 0;
        int size4 = list.size();
        for (int i8 = 0; i8 < size4; i8++) {
            Object obj6 = list.get(i8);
            if (zq3.c(TextFieldImplKt.f((xq3) obj6), "TextField")) {
                int intValue2 = ((Number) gt2Var.invoke(obj6, Integer.valueOf(i2))).intValue();
                int size5 = list.size();
                int i9 = 0;
                while (true) {
                    if (i9 >= size5) {
                        break;
                    }
                    Object obj7 = list.get(i9);
                    if (zq3.c(TextFieldImplKt.f((xq3) obj7), "Hint")) {
                        obj = obj7;
                        break;
                    }
                    i9++;
                }
                Object obj8 = (xq3) obj;
                j = OutlinedTextFieldKt.j(i3, i4, intValue2, intValue, obj8 != null ? ((Number) gt2Var.invoke(obj8, Integer.valueOf(i2))).intValue() : 0, this.c, TextFieldImplKt.h(), yq3Var.getDensity(), this.d);
                return j;
            }
        }
        throw new NoSuchElementException("Collection contains no element matching the predicate.");
    }

    private final int n(yq3 yq3Var, List list, int i, gt2 gt2Var) {
        Object obj;
        Object obj2;
        Object obj3;
        Object obj4;
        int k;
        int size = list.size();
        for (int i2 = 0; i2 < size; i2++) {
            Object obj5 = list.get(i2);
            if (zq3.c(TextFieldImplKt.f((xq3) obj5), "TextField")) {
                int intValue = ((Number) gt2Var.invoke(obj5, Integer.valueOf(i))).intValue();
                int size2 = list.size();
                int i3 = 0;
                while (true) {
                    obj = null;
                    if (i3 >= size2) {
                        obj2 = null;
                        break;
                    }
                    obj2 = list.get(i3);
                    if (zq3.c(TextFieldImplKt.f((xq3) obj2), "Label")) {
                        break;
                    }
                    i3++;
                }
                xq3 xq3Var = (xq3) obj2;
                int intValue2 = xq3Var != null ? ((Number) gt2Var.invoke(xq3Var, Integer.valueOf(i))).intValue() : 0;
                int size3 = list.size();
                int i4 = 0;
                while (true) {
                    if (i4 >= size3) {
                        obj3 = null;
                        break;
                    }
                    obj3 = list.get(i4);
                    if (zq3.c(TextFieldImplKt.f((xq3) obj3), "Trailing")) {
                        break;
                    }
                    i4++;
                }
                xq3 xq3Var2 = (xq3) obj3;
                int intValue3 = xq3Var2 != null ? ((Number) gt2Var.invoke(xq3Var2, Integer.valueOf(i))).intValue() : 0;
                int size4 = list.size();
                int i5 = 0;
                while (true) {
                    if (i5 >= size4) {
                        obj4 = null;
                        break;
                    }
                    obj4 = list.get(i5);
                    if (zq3.c(TextFieldImplKt.f((xq3) obj4), "Leading")) {
                        break;
                    }
                    i5++;
                }
                xq3 xq3Var3 = (xq3) obj4;
                int intValue4 = xq3Var3 != null ? ((Number) gt2Var.invoke(xq3Var3, Integer.valueOf(i))).intValue() : 0;
                int size5 = list.size();
                int i6 = 0;
                while (true) {
                    if (i6 >= size5) {
                        break;
                    }
                    Object obj6 = list.get(i6);
                    if (zq3.c(TextFieldImplKt.f((xq3) obj6), "Hint")) {
                        obj = obj6;
                        break;
                    }
                    i6++;
                }
                xq3 xq3Var4 = (xq3) obj;
                k = OutlinedTextFieldKt.k(intValue4, intValue3, intValue, intValue2, xq3Var4 != null ? ((Number) gt2Var.invoke(xq3Var4, Integer.valueOf(i))).intValue() : 0, this.c, TextFieldImplKt.h(), yq3Var.getDensity(), this.d);
                return k;
            }
        }
        throw new NoSuchElementException("Collection contains no element matching the predicate.");
    }

    @Override // defpackage.rg4
    public int a(yq3 yq3Var, List list, int i) {
        return n(yq3Var, list, i, new gt2() { // from class: androidx.compose.material.OutlinedTextFieldMeasurePolicy$maxIntrinsicWidth$1
            public final Integer b(xq3 xq3Var, int i2) {
                return Integer.valueOf(xq3Var.V(i2));
            }

            @Override // defpackage.gt2
            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                return b((xq3) obj, ((Number) obj2).intValue());
            }
        });
    }

    @Override // defpackage.rg4
    public sg4 d(final androidx.compose.ui.layout.f fVar, List list, long j) {
        Object obj;
        Object obj2;
        Object obj3;
        Object obj4;
        final int k;
        final int j2;
        int l0 = fVar.l0(this.d.a());
        long e = fv0.e(j, 0, 0, 0, 0, 10, null);
        int size = list.size();
        int i = 0;
        while (true) {
            if (i >= size) {
                obj = null;
                break;
            }
            obj = list.get(i);
            if (zq3.c(androidx.compose.ui.layout.b.a((qg4) obj), "Leading")) {
                break;
            }
            i++;
        }
        qg4 qg4Var = (qg4) obj;
        androidx.compose.ui.layout.l W = qg4Var != null ? qg4Var.W(e) : null;
        int j3 = TextFieldImplKt.j(W);
        int size2 = list.size();
        int i2 = 0;
        while (true) {
            if (i2 >= size2) {
                obj2 = null;
                break;
            }
            obj2 = list.get(i2);
            if (zq3.c(androidx.compose.ui.layout.b.a((qg4) obj2), "Trailing")) {
                break;
            }
            i2++;
        }
        qg4 qg4Var2 = (qg4) obj2;
        final androidx.compose.ui.layout.l W2 = qg4Var2 != null ? qg4Var2.W(iv0.j(e, -j3, 0, 2, null)) : null;
        int j4 = j3 + TextFieldImplKt.j(W2);
        int l02 = fVar.l0(this.d.b(fVar.getLayoutDirection())) + fVar.l0(this.d.c(fVar.getLayoutDirection()));
        int i3 = -j4;
        int i4 = -l0;
        long i5 = iv0.i(e, cg4.b(i3 - l02, -l02, this.c), i4);
        int size3 = list.size();
        int i6 = 0;
        while (true) {
            if (i6 >= size3) {
                obj3 = null;
                break;
            }
            obj3 = list.get(i6);
            if (zq3.c(androidx.compose.ui.layout.b.a((qg4) obj3), "Label")) {
                break;
            }
            i6++;
        }
        qg4 qg4Var3 = (qg4) obj3;
        final androidx.compose.ui.layout.l W3 = qg4Var3 != null ? qg4Var3.W(i5) : null;
        if (W3 != null) {
            this.a.invoke(zt7.c(du7.a(W3.F0(), W3.v0())));
        }
        long e2 = fv0.e(iv0.i(j, i3, i4 - Math.max(TextFieldImplKt.i(W3) / 2, fVar.l0(this.d.d()))), 0, 0, 0, 0, 11, null);
        int size4 = list.size();
        for (int i7 = 0; i7 < size4; i7++) {
            qg4 qg4Var4 = (qg4) list.get(i7);
            if (zq3.c(androidx.compose.ui.layout.b.a(qg4Var4), "TextField")) {
                final androidx.compose.ui.layout.l W4 = qg4Var4.W(e2);
                long e3 = fv0.e(e2, 0, 0, 0, 0, 14, null);
                int size5 = list.size();
                int i8 = 0;
                while (true) {
                    if (i8 >= size5) {
                        obj4 = null;
                        break;
                    }
                    obj4 = list.get(i8);
                    int i9 = size5;
                    if (zq3.c(androidx.compose.ui.layout.b.a((qg4) obj4), "Hint")) {
                        break;
                    }
                    i8++;
                    size5 = i9;
                }
                qg4 qg4Var5 = (qg4) obj4;
                androidx.compose.ui.layout.l W5 = qg4Var5 != null ? qg4Var5.W(e3) : null;
                k = OutlinedTextFieldKt.k(TextFieldImplKt.j(W), TextFieldImplKt.j(W2), W4.F0(), TextFieldImplKt.j(W3), TextFieldImplKt.j(W5), this.c, j, fVar.getDensity(), this.d);
                j2 = OutlinedTextFieldKt.j(TextFieldImplKt.i(W), TextFieldImplKt.i(W2), W4.v0(), TextFieldImplKt.i(W3), TextFieldImplKt.i(W5), this.c, j, fVar.getDensity(), this.d);
                int size6 = list.size();
                for (int i10 = 0; i10 < size6; i10++) {
                    qg4 qg4Var6 = (qg4) list.get(i10);
                    if (zq3.c(androidx.compose.ui.layout.b.a(qg4Var6), "border")) {
                        final androidx.compose.ui.layout.l W6 = qg4Var6.W(iv0.a(k != Integer.MAX_VALUE ? k : 0, k, j2 != Integer.MAX_VALUE ? j2 : 0, j2));
                        final androidx.compose.ui.layout.l lVar = W;
                        final androidx.compose.ui.layout.l lVar2 = W5;
                        return androidx.compose.ui.layout.f.J(fVar, k, j2, null, new ss2() { // from class: androidx.compose.material.OutlinedTextFieldMeasurePolicy$measure$2
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            {
                                super(1);
                            }

                            public final void b(l.a aVar) {
                                float f;
                                boolean z;
                                ym5 ym5Var;
                                int i11 = j2;
                                int i12 = k;
                                androidx.compose.ui.layout.l lVar3 = lVar;
                                androidx.compose.ui.layout.l lVar4 = W2;
                                androidx.compose.ui.layout.l lVar5 = W4;
                                androidx.compose.ui.layout.l lVar6 = W3;
                                androidx.compose.ui.layout.l lVar7 = lVar2;
                                androidx.compose.ui.layout.l lVar8 = W6;
                                f = this.c;
                                z = this.b;
                                float density = fVar.getDensity();
                                LayoutDirection layoutDirection = fVar.getLayoutDirection();
                                ym5Var = this.d;
                                OutlinedTextFieldKt.m(aVar, i11, i12, lVar3, lVar4, lVar5, lVar6, lVar7, lVar8, f, z, density, layoutDirection, ym5Var);
                            }

                            @Override // defpackage.ss2
                            public /* bridge */ /* synthetic */ Object invoke(Object obj5) {
                                b((l.a) obj5);
                                return ww8.a;
                            }
                        }, 4, null);
                    }
                }
                throw new NoSuchElementException("Collection contains no element matching the predicate.");
            }
        }
        throw new NoSuchElementException("Collection contains no element matching the predicate.");
    }

    @Override // defpackage.rg4
    public int e(yq3 yq3Var, List list, int i) {
        return n(yq3Var, list, i, new gt2() { // from class: androidx.compose.material.OutlinedTextFieldMeasurePolicy$minIntrinsicWidth$1
            public final Integer b(xq3 xq3Var, int i2) {
                return Integer.valueOf(xq3Var.S(i2));
            }

            @Override // defpackage.gt2
            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                return b((xq3) obj, ((Number) obj2).intValue());
            }
        });
    }

    @Override // defpackage.rg4
    public int g(yq3 yq3Var, List list, int i) {
        return m(yq3Var, list, i, new gt2() { // from class: androidx.compose.material.OutlinedTextFieldMeasurePolicy$maxIntrinsicHeight$1
            public final Integer b(xq3 xq3Var, int i2) {
                return Integer.valueOf(xq3Var.i(i2));
            }

            @Override // defpackage.gt2
            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                return b((xq3) obj, ((Number) obj2).intValue());
            }
        });
    }

    @Override // defpackage.rg4
    public int i(yq3 yq3Var, List list, int i) {
        return m(yq3Var, list, i, new gt2() { // from class: androidx.compose.material.OutlinedTextFieldMeasurePolicy$minIntrinsicHeight$1
            public final Integer b(xq3 xq3Var, int i2) {
                return Integer.valueOf(xq3Var.H(i2));
            }

            @Override // defpackage.gt2
            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                return b((xq3) obj, ((Number) obj2).intValue());
            }
        });
    }
}
