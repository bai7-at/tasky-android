package androidx.compose.material;

import androidx.compose.ui.layout.AlignmentLineKt;
import androidx.compose.ui.layout.l;
import defpackage.fv0;
import defpackage.gt2;
import defpackage.iv0;
import defpackage.qg4;
import defpackage.rg4;
import defpackage.sg4;
import defpackage.ss2;
import defpackage.uo6;
import defpackage.ww8;
import defpackage.xq3;
import defpackage.ym5;
import defpackage.yq3;
import defpackage.zq3;
import java.util.List;
import java.util.NoSuchElementException;

/* loaded from: classes.dex */
final class TextFieldMeasurePolicy implements rg4 {
    private final boolean a;
    private final float b;
    private final ym5 c;

    public TextFieldMeasurePolicy(boolean z, float f, ym5 ym5Var) {
        this.a = z;
        this.b = f;
        this.c = ym5Var;
    }

    private final int m(yq3 yq3Var, List list, int i, gt2 gt2Var) {
        Object obj;
        Object obj2;
        int i2;
        int i3;
        Object obj3;
        int i4;
        Object obj4;
        int h;
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
        int intValue = obj5 != null ? ((Number) gt2Var.invoke(obj5, Integer.valueOf(i2))).intValue() : 0;
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
                h = TextFieldKt.h(intValue2, intValue > 0, intValue, i3, i4, obj8 != null ? ((Number) gt2Var.invoke(obj8, Integer.valueOf(i2))).intValue() : 0, TextFieldImplKt.h(), yq3Var.getDensity(), this.c);
                return h;
            }
        }
        throw new NoSuchElementException("Collection contains no element matching the predicate.");
    }

    private final int n(List list, int i, gt2 gt2Var) {
        Object obj;
        Object obj2;
        Object obj3;
        Object obj4;
        int i2;
        int size = list.size();
        for (int i3 = 0; i3 < size; i3++) {
            Object obj5 = list.get(i3);
            if (zq3.c(TextFieldImplKt.f((xq3) obj5), "TextField")) {
                int intValue = ((Number) gt2Var.invoke(obj5, Integer.valueOf(i))).intValue();
                int size2 = list.size();
                int i4 = 0;
                while (true) {
                    obj = null;
                    if (i4 >= size2) {
                        obj2 = null;
                        break;
                    }
                    obj2 = list.get(i4);
                    if (zq3.c(TextFieldImplKt.f((xq3) obj2), "Label")) {
                        break;
                    }
                    i4++;
                }
                xq3 xq3Var = (xq3) obj2;
                int intValue2 = xq3Var != null ? ((Number) gt2Var.invoke(xq3Var, Integer.valueOf(i))).intValue() : 0;
                int size3 = list.size();
                int i5 = 0;
                while (true) {
                    if (i5 >= size3) {
                        obj3 = null;
                        break;
                    }
                    obj3 = list.get(i5);
                    if (zq3.c(TextFieldImplKt.f((xq3) obj3), "Trailing")) {
                        break;
                    }
                    i5++;
                }
                xq3 xq3Var2 = (xq3) obj3;
                int intValue3 = xq3Var2 != null ? ((Number) gt2Var.invoke(xq3Var2, Integer.valueOf(i))).intValue() : 0;
                int size4 = list.size();
                int i6 = 0;
                while (true) {
                    if (i6 >= size4) {
                        obj4 = null;
                        break;
                    }
                    obj4 = list.get(i6);
                    if (zq3.c(TextFieldImplKt.f((xq3) obj4), "Leading")) {
                        break;
                    }
                    i6++;
                }
                xq3 xq3Var3 = (xq3) obj4;
                int intValue4 = xq3Var3 != null ? ((Number) gt2Var.invoke(xq3Var3, Integer.valueOf(i))).intValue() : 0;
                int size5 = list.size();
                int i7 = 0;
                while (true) {
                    if (i7 >= size5) {
                        break;
                    }
                    Object obj6 = list.get(i7);
                    if (zq3.c(TextFieldImplKt.f((xq3) obj6), "Hint")) {
                        obj = obj6;
                        break;
                    }
                    i7++;
                }
                xq3 xq3Var4 = (xq3) obj;
                i2 = TextFieldKt.i(intValue4, intValue3, intValue, intValue2, xq3Var4 != null ? ((Number) gt2Var.invoke(xq3Var4, Integer.valueOf(i))).intValue() : 0, TextFieldImplKt.h());
                return i2;
            }
        }
        throw new NoSuchElementException("Collection contains no element matching the predicate.");
    }

    @Override // defpackage.rg4
    public int a(yq3 yq3Var, List list, int i) {
        return n(list, i, new gt2() { // from class: androidx.compose.material.TextFieldMeasurePolicy$maxIntrinsicWidth$1
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
        int i;
        long j2;
        final androidx.compose.ui.layout.l lVar;
        Object obj3;
        int i2;
        Object obj4;
        final int i3;
        final int h;
        List list2 = list;
        final int l0 = fVar.l0(this.c.d());
        int l02 = fVar.l0(this.c.a());
        final int l03 = fVar.l0(TextFieldKt.m());
        long e = fv0.e(j, 0, 0, 0, 0, 10, null);
        int size = list.size();
        int i4 = 0;
        while (true) {
            if (i4 >= size) {
                obj = null;
                break;
            }
            obj = list2.get(i4);
            if (zq3.c(androidx.compose.ui.layout.b.a((qg4) obj), "Leading")) {
                break;
            }
            i4++;
        }
        qg4 qg4Var = (qg4) obj;
        androidx.compose.ui.layout.l W = qg4Var != null ? qg4Var.W(e) : null;
        int j3 = TextFieldImplKt.j(W);
        int size2 = list.size();
        int i5 = 0;
        while (true) {
            if (i5 >= size2) {
                obj2 = null;
                break;
            }
            obj2 = list2.get(i5);
            if (zq3.c(androidx.compose.ui.layout.b.a((qg4) obj2), "Trailing")) {
                break;
            }
            i5++;
        }
        qg4 qg4Var2 = (qg4) obj2;
        if (qg4Var2 != null) {
            i = j3;
            j2 = e;
            lVar = qg4Var2.W(iv0.j(e, -j3, 0, 2, null));
        } else {
            i = j3;
            j2 = e;
            lVar = null;
        }
        int i6 = -l02;
        int i7 = -(i + TextFieldImplKt.j(lVar));
        long i8 = iv0.i(j2, i7, i6);
        int size3 = list.size();
        int i9 = 0;
        while (true) {
            if (i9 >= size3) {
                obj3 = null;
                break;
            }
            obj3 = list2.get(i9);
            if (zq3.c(androidx.compose.ui.layout.b.a((qg4) obj3), "Label")) {
                break;
            }
            i9++;
        }
        qg4 qg4Var3 = (qg4) obj3;
        androidx.compose.ui.layout.l W2 = qg4Var3 != null ? qg4Var3.W(i8) : null;
        if (W2 != null) {
            i2 = W2.c0(AlignmentLineKt.b());
            if (i2 == Integer.MIN_VALUE) {
                i2 = W2.v0();
            }
        } else {
            i2 = 0;
        }
        final int max = Math.max(i2, l0);
        long i10 = iv0.i(fv0.e(j, 0, 0, 0, 0, 11, null), i7, W2 != null ? (i6 - l03) - max : (-l0) - l02);
        int size4 = list.size();
        int i11 = 0;
        while (i11 < size4) {
            qg4 qg4Var4 = (qg4) list2.get(i11);
            if (zq3.c(androidx.compose.ui.layout.b.a(qg4Var4), "TextField")) {
                final androidx.compose.ui.layout.l W3 = qg4Var4.W(i10);
                long e2 = fv0.e(i10, 0, 0, 0, 0, 14, null);
                int size5 = list.size();
                int i12 = 0;
                while (true) {
                    if (i12 >= size5) {
                        obj4 = null;
                        break;
                    }
                    obj4 = list2.get(i12);
                    if (zq3.c(androidx.compose.ui.layout.b.a((qg4) obj4), "Hint")) {
                        break;
                    }
                    i12++;
                    list2 = list;
                }
                qg4 qg4Var5 = (qg4) obj4;
                androidx.compose.ui.layout.l W4 = qg4Var5 != null ? qg4Var5.W(e2) : null;
                i3 = TextFieldKt.i(TextFieldImplKt.j(W), TextFieldImplKt.j(lVar), W3.F0(), TextFieldImplKt.j(W2), TextFieldImplKt.j(W4), j);
                h = TextFieldKt.h(W3.v0(), W2 != null, max, TextFieldImplKt.i(W), TextFieldImplKt.i(lVar), TextFieldImplKt.i(W4), j, fVar.getDensity(), this.c);
                final androidx.compose.ui.layout.l lVar2 = W2;
                final int i13 = i2;
                final androidx.compose.ui.layout.l lVar3 = W4;
                final androidx.compose.ui.layout.l lVar4 = W;
                return androidx.compose.ui.layout.f.J(fVar, i3, h, null, new ss2() { // from class: androidx.compose.material.TextFieldMeasurePolicy$measure$1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(1);
                    }

                    public final void b(l.a aVar) {
                        boolean z;
                        ym5 ym5Var;
                        boolean z2;
                        float f;
                        if (androidx.compose.ui.layout.l.this == null) {
                            int i14 = i3;
                            int i15 = h;
                            androidx.compose.ui.layout.l lVar5 = W3;
                            androidx.compose.ui.layout.l lVar6 = lVar3;
                            androidx.compose.ui.layout.l lVar7 = lVar4;
                            androidx.compose.ui.layout.l lVar8 = lVar;
                            z = this.a;
                            float density = fVar.getDensity();
                            ym5Var = this.c;
                            TextFieldKt.o(aVar, i14, i15, lVar5, lVar6, lVar7, lVar8, z, density, ym5Var);
                            return;
                        }
                        int d = uo6.d(l0 - i13, 0);
                        int i16 = i3;
                        int i17 = h;
                        androidx.compose.ui.layout.l lVar9 = W3;
                        androidx.compose.ui.layout.l lVar10 = androidx.compose.ui.layout.l.this;
                        androidx.compose.ui.layout.l lVar11 = lVar3;
                        androidx.compose.ui.layout.l lVar12 = lVar4;
                        androidx.compose.ui.layout.l lVar13 = lVar;
                        z2 = this.a;
                        int i18 = max + l03;
                        f = this.b;
                        TextFieldKt.n(aVar, i16, i17, lVar9, lVar10, lVar11, lVar12, lVar13, z2, d, i18, f, fVar.getDensity());
                    }

                    @Override // defpackage.ss2
                    public /* bridge */ /* synthetic */ Object invoke(Object obj5) {
                        b((l.a) obj5);
                        return ww8.a;
                    }
                }, 4, null);
            }
            i11++;
            list2 = list;
        }
        throw new NoSuchElementException("Collection contains no element matching the predicate.");
    }

    @Override // defpackage.rg4
    public int e(yq3 yq3Var, List list, int i) {
        return n(list, i, new gt2() { // from class: androidx.compose.material.TextFieldMeasurePolicy$minIntrinsicWidth$1
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
        return m(yq3Var, list, i, new gt2() { // from class: androidx.compose.material.TextFieldMeasurePolicy$maxIntrinsicHeight$1
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
        return m(yq3Var, list, i, new gt2() { // from class: androidx.compose.material.TextFieldMeasurePolicy$minIntrinsicHeight$1
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
