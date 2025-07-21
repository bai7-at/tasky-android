package androidx.compose.foundation.pager;

import androidx.compose.foundation.gestures.Orientation;
import androidx.compose.foundation.gestures.snapping.g;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.layout.l;
import androidx.compose.ui.unit.LayoutDirection;
import defpackage.fm1;
import defpackage.fv0;
import defpackage.fw7;
import defpackage.it2;
import defpackage.iv0;
import defpackage.on5;
import defpackage.r04;
import defpackage.sg4;
import defpackage.ss2;
import defpackage.sy4;
import defpackage.tc5;
import defpackage.ug4;
import defpackage.uo6;
import defpackage.ww8;
import defpackage.ym3;
import defpackage.zq3;
import java.util.ArrayList;
import java.util.List;
import kotlin.collections.d;
import kotlin.collections.i;

/* loaded from: classes.dex */
public abstract class PagerMeasureKt {
    private static final ug4 b(int i, List list, int i2, int i3, int i4, g gVar) {
        Object obj;
        if (list.isEmpty()) {
            obj = null;
        } else {
            Object obj2 = list.get(0);
            ug4 ug4Var = (ug4) obj2;
            float f = -Math.abs(fw7.a(i, i2, i3, i4, ug4Var.b(), ug4Var.getIndex(), gVar));
            int n = i.n(list);
            int i5 = 1;
            if (1 <= n) {
                while (true) {
                    Object obj3 = list.get(i5);
                    ug4 ug4Var2 = (ug4) obj3;
                    float f2 = -Math.abs(fw7.a(i, i2, i3, i4, ug4Var2.b(), ug4Var2.getIndex(), gVar));
                    if (Float.compare(f, f2) < 0) {
                        obj2 = obj3;
                        f = f2;
                    }
                    if (i5 == n) {
                        break;
                    }
                    i5++;
                }
            }
            obj = obj2;
        }
        return (ug4) obj;
    }

    private static final List c(r04 r04Var, List list, List list2, List list3, int i, int i2, int i3, int i4, int i5, Orientation orientation, boolean z, fm1 fm1Var, int i6, int i7) {
        int i8;
        int i9;
        int i10 = i5;
        int i11 = i7 + i6;
        if (orientation == Orientation.Vertical) {
            i8 = i4;
            i9 = i2;
        } else {
            i8 = i4;
            i9 = i;
        }
        boolean z2 = i3 < Math.min(i9, i8);
        if (z2 && i10 != 0) {
            throw new IllegalStateException(("non-zero pagesScrollOffset=" + i10).toString());
        }
        ArrayList arrayList = new ArrayList(list.size() + list2.size() + list3.size());
        if (!z2) {
            int size = list2.size();
            int i12 = i10;
            for (int i13 = 0; i13 < size; i13++) {
                ug4 ug4Var = (ug4) list2.get(i13);
                i12 -= i11;
                ug4Var.i(i12, i, i2);
                arrayList.add(ug4Var);
            }
            int size2 = list.size();
            for (int i14 = 0; i14 < size2; i14++) {
                ug4 ug4Var2 = (ug4) list.get(i14);
                ug4Var2.i(i10, i, i2);
                arrayList.add(ug4Var2);
                i10 += i11;
            }
            int size3 = list3.size();
            for (int i15 = 0; i15 < size3; i15++) {
                ug4 ug4Var3 = (ug4) list3.get(i15);
                ug4Var3.i(i10, i, i2);
                arrayList.add(ug4Var3);
                i10 += i11;
            }
        } else {
            if (!list2.isEmpty() || !list3.isEmpty()) {
                throw new IllegalArgumentException("No extra pages");
            }
            int size4 = list.size();
            int[] iArr = new int[size4];
            for (int i16 = 0; i16 < size4; i16++) {
                iArr[i16] = i7;
            }
            int[] iArr2 = new int[size4];
            for (int i17 = 0; i17 < size4; i17++) {
                iArr2[i17] = 0;
            }
            Arrangement.f a = Arrangement.a.a.a(r04Var.v(i6));
            if (orientation == Orientation.Vertical) {
                a.c(fm1Var, i9, iArr, iArr2);
            } else {
                a.b(fm1Var, i9, iArr, LayoutDirection.Ltr, iArr2);
            }
            ym3 b0 = d.b0(iArr2);
            if (z) {
                b0 = uo6.s(b0);
            }
            int g = b0.g();
            int j = b0.j();
            int n = b0.n();
            if ((n > 0 && g <= j) || (n < 0 && j <= g)) {
                while (true) {
                    int i18 = iArr2[g];
                    ug4 ug4Var4 = (ug4) list.get(d(g, z, size4));
                    if (z) {
                        i18 = (i9 - i18) - ug4Var4.g();
                    }
                    ug4Var4.i(i18, i, i2);
                    arrayList.add(ug4Var4);
                    if (g == j) {
                        break;
                    }
                    g += n;
                }
            }
        }
        return arrayList;
    }

    private static final int d(int i, boolean z, int i2) {
        return !z ? i : (i2 - i) - 1;
    }

    private static final List e(int i, int i2, int i3, List list, ss2 ss2Var) {
        int min = Math.min(i3 + i, i2 - 1);
        int i4 = i + 1;
        ArrayList arrayList = null;
        if (i4 <= min) {
            while (true) {
                if (arrayList == null) {
                    arrayList = new ArrayList();
                }
                arrayList.add(ss2Var.invoke(Integer.valueOf(i4)));
                if (i4 == min) {
                    break;
                }
                i4++;
            }
        }
        int size = list.size();
        for (int i5 = 0; i5 < size; i5++) {
            int intValue = ((Number) list.get(i5)).intValue();
            if (min + 1 <= intValue && intValue < i2) {
                if (arrayList == null) {
                    arrayList = new ArrayList();
                }
                arrayList.add(ss2Var.invoke(Integer.valueOf(intValue)));
            }
        }
        return arrayList == null ? i.l() : arrayList;
    }

    private static final List f(int i, int i2, List list, ss2 ss2Var) {
        int max = Math.max(0, i - i2);
        int i3 = i - 1;
        ArrayList arrayList = null;
        if (max <= i3) {
            while (true) {
                if (arrayList == null) {
                    arrayList = new ArrayList();
                }
                arrayList.add(ss2Var.invoke(Integer.valueOf(i3)));
                if (i3 == max) {
                    break;
                }
                i3--;
            }
        }
        int size = list.size();
        for (int i4 = 0; i4 < size; i4++) {
            int intValue = ((Number) list.get(i4)).intValue();
            if (intValue < max) {
                if (arrayList == null) {
                    arrayList = new ArrayList();
                }
                arrayList.add(ss2Var.invoke(Integer.valueOf(intValue)));
            }
        }
        return arrayList == null ? i.l() : arrayList;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ug4 g(r04 r04Var, int i, long j, PagerLazyLayoutItemProvider pagerLazyLayoutItemProvider, long j2, Orientation orientation, Alignment.b bVar, Alignment.c cVar, LayoutDirection layoutDirection, boolean z, int i2) {
        return new ug4(i, i2, r04Var.T(i, j), j2, pagerLazyLayoutItemProvider.c(i), orientation, bVar, cVar, layoutDirection, z, null);
    }

    public static final on5 h(final r04 r04Var, int i, final PagerLazyLayoutItemProvider pagerLazyLayoutItemProvider, int i2, int i3, int i4, int i5, int i6, int i7, long j, final Orientation orientation, final Alignment.c cVar, final Alignment.b bVar, final boolean z, final long j2, final int i8, int i9, List list, g gVar, final sy4 sy4Var, it2 it2Var) {
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        long j3;
        int i16;
        List list2;
        int i17;
        int i18;
        int i19;
        if (i3 < 0) {
            throw new IllegalArgumentException("negative beforeContentPadding");
        }
        if (i4 < 0) {
            throw new IllegalArgumentException("negative afterContentPadding");
        }
        int d = uo6.d(i8 + i5, 0);
        if (i <= 0) {
            return new on5(i.l(), i8, i5, i4, orientation, -i3, i2 + i4, false, i9, null, null, 0.0f, 0, false, (sg4) it2Var.invoke(Integer.valueOf(fv0.p(j)), Integer.valueOf(fv0.o(j)), new ss2() { // from class: androidx.compose.foundation.pager.PagerMeasureKt$measurePager$4
                public final void b(l.a aVar) {
                }

                @Override // defpackage.ss2
                public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                    b((l.a) obj);
                    return ww8.a;
                }
            }), false);
        }
        Orientation orientation2 = Orientation.Vertical;
        final long b = iv0.b(0, orientation == orientation2 ? fv0.n(j) : i8, 0, orientation != orientation2 ? fv0.m(j) : i8, 5, null);
        int i20 = i6;
        int i21 = i7;
        while (i20 > 0 && i21 > 0) {
            i20--;
            i21 -= d;
        }
        int i22 = i21 * (-1);
        if (i20 >= i) {
            i20 = i - 1;
            i22 = 0;
        }
        kotlin.collections.c cVar2 = new kotlin.collections.c();
        int i23 = -i3;
        if (i5 < 0) {
            i11 = i5;
            i10 = i20;
        } else {
            i10 = i20;
            i11 = 0;
        }
        int i24 = i23 + i11;
        int i25 = 0;
        int i26 = i22 + i24;
        int i27 = i10;
        while (i26 < 0 && i27 > 0) {
            int i28 = i27 - 1;
            ug4 g = g(r04Var, i28, b, pagerLazyLayoutItemProvider, j2, orientation, bVar, cVar, r04Var.getLayoutDirection(), z, i8);
            cVar2.add(0, g);
            i25 = Math.max(i25, g.c());
            i26 += d;
            i27 = i28;
        }
        if (i26 < i24) {
            i26 = i24;
        }
        int i29 = i26 - i24;
        int i30 = i2 + i4;
        int i31 = i27;
        int d2 = uo6.d(i30, 0);
        int i32 = i31;
        boolean z2 = false;
        int i33 = -i29;
        int i34 = 0;
        while (i34 < cVar2.size()) {
            if (i33 >= d2) {
                cVar2.remove(i34);
                z2 = true;
            } else {
                i32++;
                i33 += d;
                i34++;
            }
        }
        boolean z3 = z2;
        int i35 = i32;
        int i36 = i29;
        while (i35 < i && (i33 < d2 || i33 <= 0 || cVar2.isEmpty())) {
            int i37 = d2;
            ug4 g2 = g(r04Var, i35, b, pagerLazyLayoutItemProvider, j2, orientation, bVar, cVar, r04Var.getLayoutDirection(), z, i8);
            int i38 = i - 1;
            i33 += i35 == i38 ? i8 : d;
            if (i33 > i24 || i35 == i38) {
                i25 = Math.max(i25, g2.c());
                cVar2.add(g2);
                i19 = i31;
            } else {
                i19 = i35 + 1;
                i36 -= d;
                z3 = true;
            }
            i35++;
            i31 = i19;
            d2 = i37;
        }
        if (i33 < i2) {
            int i39 = i2 - i33;
            i36 -= i39;
            i33 += i39;
            i12 = i31;
            while (i36 < i3 && i12 > 0) {
                i12--;
                ug4 g3 = g(r04Var, i12, b, pagerLazyLayoutItemProvider, j2, orientation, bVar, cVar, r04Var.getLayoutDirection(), z, i8);
                cVar2.add(0, g3);
                i25 = Math.max(i25, g3.c());
                i36 += d;
            }
            if (i36 < 0) {
                i33 += i36;
                i36 = 0;
            }
        } else {
            i12 = i31;
        }
        int i40 = i25;
        int i41 = i33;
        if (i36 < 0) {
            throw new IllegalArgumentException("invalid currentFirstPageScrollOffset");
        }
        int i42 = -i36;
        ug4 ug4Var = (ug4) cVar2.first();
        if (i3 > 0 || i5 < 0) {
            int size = cVar2.size();
            i13 = i40;
            int i43 = i36;
            int i44 = 0;
            while (i44 < size && i43 != 0 && d <= i43) {
                i14 = i42;
                if (i44 == i.n(cVar2)) {
                    break;
                }
                i43 -= d;
                i44++;
                ug4Var = (ug4) cVar2.get(i44);
                i42 = i14;
            }
            i14 = i42;
            i15 = i43;
        } else {
            i15 = i36;
            i13 = i40;
            i14 = i42;
        }
        ug4 ug4Var2 = ug4Var;
        List f = f(i12, i9, list, new ss2() { // from class: androidx.compose.foundation.pager.PagerMeasureKt$measurePager$extraPagesBefore$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            public final ug4 b(int i45) {
                ug4 g4;
                r04 r04Var2 = r04.this;
                g4 = PagerMeasureKt.g(r04Var2, i45, b, pagerLazyLayoutItemProvider, j2, orientation, bVar, cVar, r04Var2.getLayoutDirection(), z, i8);
                return g4;
            }

            @Override // defpackage.ss2
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                return b(((Number) obj).intValue());
            }
        });
        int i45 = i13;
        int i46 = 0;
        for (int size2 = f.size(); i46 < size2; size2 = size2) {
            i45 = Math.max(i45, ((ug4) f.get(i46)).c());
            i46++;
        }
        List e = e(((ug4) cVar2.last()).getIndex(), i, i9, list, new ss2() { // from class: androidx.compose.foundation.pager.PagerMeasureKt$measurePager$extraPagesAfter$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            public final ug4 b(int i47) {
                ug4 g4;
                r04 r04Var2 = r04.this;
                g4 = PagerMeasureKt.g(r04Var2, i47, b, pagerLazyLayoutItemProvider, j2, orientation, bVar, cVar, r04Var2.getLayoutDirection(), z, i8);
                return g4;
            }

            @Override // defpackage.ss2
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                return b(((Number) obj).intValue());
            }
        });
        int size3 = e.size();
        for (int i47 = 0; i47 < size3; i47++) {
            i45 = Math.max(i45, ((ug4) e.get(i47)).c());
        }
        boolean z4 = zq3.c(ug4Var2, cVar2.first()) && f.isEmpty() && e.isEmpty();
        Orientation orientation3 = Orientation.Vertical;
        if (orientation == orientation3) {
            j3 = j;
            i16 = i45;
        } else {
            j3 = j;
            i16 = i45;
            i45 = i41;
        }
        int g4 = iv0.g(j3, i45);
        int f2 = iv0.f(j3, orientation == orientation3 ? i41 : i16);
        int i48 = i35;
        final List c = c(r04Var, cVar2, f, e, g4, f2, i41, i2, i14, orientation, z, r04Var, i5, i8);
        if (z4) {
            list2 = c;
        } else {
            ArrayList arrayList = new ArrayList(c.size());
            int size4 = c.size();
            for (int i49 = 0; i49 < size4; i49++) {
                Object obj = c.get(i49);
                ug4 ug4Var3 = (ug4) obj;
                if (ug4Var3.getIndex() >= ((ug4) cVar2.first()).getIndex() && ug4Var3.getIndex() <= ((ug4) cVar2.last()).getIndex()) {
                    arrayList.add(obj);
                }
            }
            list2 = arrayList;
        }
        ug4 b2 = b(orientation == Orientation.Vertical ? f2 : g4, list2, i3, i4, d, gVar);
        if (b2 != null) {
            i18 = b2.b();
            i17 = d;
        } else {
            i17 = d;
            i18 = 0;
        }
        return new on5(list2, i8, i5, i4, orientation, i23, i30, z, i9, ug4Var2, b2, i17 == 0 ? 0.0f : uo6.l((-i18) / i17, -0.5f, 0.5f), i15, i48 < i || i41 > i2, (sg4) it2Var.invoke(Integer.valueOf(g4), Integer.valueOf(f2), new ss2() { // from class: androidx.compose.foundation.pager.PagerMeasureKt$measurePager$9
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            public final void b(l.a aVar) {
                List<ug4> list3 = c;
                int size5 = list3.size();
                for (int i50 = 0; i50 < size5; i50++) {
                    list3.get(i50).h(aVar);
                }
                tc5.a(sy4Var);
            }

            @Override // defpackage.ss2
            public /* bridge */ /* synthetic */ Object invoke(Object obj2) {
                b((l.a) obj2);
                return ww8.a;
            }
        }), z3);
    }
}
