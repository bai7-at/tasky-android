package androidx.compose.foundation.lazy;

import androidx.compose.foundation.gestures.Orientation;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.ui.layout.l;
import androidx.compose.ui.unit.LayoutDirection;
import defpackage.c14;
import defpackage.dg4;
import defpackage.e14;
import defpackage.fm1;
import defpackage.fv0;
import defpackage.it2;
import defpackage.iv0;
import defpackage.j14;
import defpackage.k14;
import defpackage.l14;
import defpackage.m14;
import defpackage.sg4;
import defpackage.ss2;
import defpackage.sy4;
import defpackage.tc5;
import defpackage.uo6;
import defpackage.ww8;
import defpackage.ym3;
import defpackage.zq3;
import java.util.ArrayList;
import java.util.List;
import kotlin.collections.c;
import kotlin.collections.d;
import kotlin.collections.i;
import kotlinx.coroutines.CoroutineScope;

/* loaded from: classes.dex */
public abstract class LazyListMeasureKt {
    private static final List a(List list, List list2, List list3, int i, int i2, int i3, int i4, int i5, boolean z, Arrangement.m mVar, Arrangement.e eVar, boolean z2, fm1 fm1Var) {
        int i6 = z ? i2 : i;
        boolean z3 = i3 < Math.min(i6, i4);
        if (z3 && i5 != 0) {
            throw new IllegalStateException("non-zero itemsScrollOffset");
        }
        ArrayList arrayList = new ArrayList(list.size() + list2.size() + list3.size());
        if (!z3) {
            int size = list2.size();
            int i7 = i5;
            for (int i8 = 0; i8 < size; i8++) {
                l14 l14Var = (l14) list2.get(i8);
                i7 -= l14Var.k();
                l14Var.n(i7, i, i2);
                arrayList.add(l14Var);
            }
            int size2 = list.size();
            int i9 = i5;
            for (int i10 = 0; i10 < size2; i10++) {
                l14 l14Var2 = (l14) list.get(i10);
                l14Var2.n(i9, i, i2);
                arrayList.add(l14Var2);
                i9 += l14Var2.k();
            }
            int size3 = list3.size();
            for (int i11 = 0; i11 < size3; i11++) {
                l14 l14Var3 = (l14) list3.get(i11);
                l14Var3.n(i9, i, i2);
                arrayList.add(l14Var3);
                i9 += l14Var3.k();
            }
        } else {
            if (!list2.isEmpty() || !list3.isEmpty()) {
                throw new IllegalArgumentException("no extra items");
            }
            int size4 = list.size();
            int[] iArr = new int[size4];
            for (int i12 = 0; i12 < size4; i12++) {
                iArr[i12] = ((l14) list.get(b(i12, z2, size4))).a();
            }
            int[] iArr2 = new int[size4];
            for (int i13 = 0; i13 < size4; i13++) {
                iArr2[i13] = 0;
            }
            if (z) {
                if (mVar == null) {
                    throw new IllegalArgumentException("null verticalArrangement when isVertical == true");
                }
                mVar.c(fm1Var, i6, iArr, iArr2);
            } else {
                if (eVar == null) {
                    throw new IllegalArgumentException("null horizontalArrangement when isVertical == false");
                }
                eVar.b(fm1Var, i6, iArr, LayoutDirection.Ltr, iArr2);
            }
            ym3 b0 = d.b0(iArr2);
            if (z2) {
                b0 = uo6.s(b0);
            }
            int g = b0.g();
            int j = b0.j();
            int n = b0.n();
            if ((n > 0 && g <= j) || (n < 0 && j <= g)) {
                while (true) {
                    int i14 = iArr2[g];
                    l14 l14Var4 = (l14) list.get(b(g, z2, size4));
                    if (z2) {
                        i14 = (i6 - i14) - l14Var4.a();
                    }
                    l14Var4.n(i14, i, i2);
                    arrayList.add(l14Var4);
                    if (g == j) {
                        break;
                    }
                    g += n;
                }
            }
        }
        return arrayList;
    }

    private static final int b(int i, boolean z, int i2) {
        return !z ? i : (i2 - i) - 1;
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x0072, code lost:
    
        r7 = (defpackage.g14) r7.get(r8);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static final java.util.List c(java.util.List r14, defpackage.m14 r15, int r16, int r17, java.util.List r18, float r19, boolean r20, defpackage.j14 r21) {
        /*
            Method dump skipped, instructions count: 408
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.lazy.LazyListMeasureKt.c(java.util.List, m14, int, int, java.util.List, float, boolean, j14):java.util.List");
    }

    private static final List d(int i, m14 m14Var, int i2, List list) {
        int max = Math.max(0, i - i2);
        int i3 = i - 1;
        ArrayList arrayList = null;
        if (max <= i3) {
            while (true) {
                if (arrayList == null) {
                    arrayList = new ArrayList();
                }
                arrayList.add(m14Var.b(i3));
                if (i3 == max) {
                    break;
                }
                i3--;
            }
        }
        int size = list.size() - 1;
        if (size >= 0) {
            while (true) {
                int i4 = size - 1;
                int intValue = ((Number) list.get(size)).intValue();
                if (intValue < max) {
                    if (arrayList == null) {
                        arrayList = new ArrayList();
                    }
                    arrayList.add(m14Var.b(intValue));
                }
                if (i4 < 0) {
                    break;
                }
                size = i4;
            }
        }
        return arrayList == null ? i.l() : arrayList;
    }

    public static final k14 e(int i, m14 m14Var, int i2, int i3, int i4, int i5, int i6, int i7, float f, long j, boolean z, List list, Arrangement.m mVar, Arrangement.e eVar, boolean z2, fm1 fm1Var, e14 e14Var, int i8, List list2, boolean z3, final boolean z4, j14 j14Var, CoroutineScope coroutineScope, final sy4 sy4Var, it2 it2Var) {
        int i9;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        l14 l14Var;
        int i17;
        List list3;
        int i18;
        List list4;
        int i19;
        int i20;
        if (i3 < 0) {
            throw new IllegalArgumentException("invalid beforeContentPadding");
        }
        if (i4 < 0) {
            throw new IllegalArgumentException("invalid afterContentPadding");
        }
        if (i <= 0) {
            int p = fv0.p(j);
            int o = fv0.o(j);
            e14Var.e(0, p, o, new ArrayList(), m14Var, z, z4, z3, coroutineScope);
            return new k14(null, 0, false, 0.0f, (sg4) it2Var.invoke(Integer.valueOf(p), Integer.valueOf(o), new ss2() { // from class: androidx.compose.foundation.lazy.LazyListMeasureKt$measureLazyList$3
                public final void b(l.a aVar) {
                }

                @Override // defpackage.ss2
                public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                    b((l.a) obj);
                    return ww8.a;
                }
            }), 0.0f, false, i.l(), -i3, i2 + i4, 0, z2, z ? Orientation.Vertical : Orientation.Horizontal, i4, i5);
        }
        int i21 = 0;
        int i22 = i6;
        if (i22 >= i) {
            i22 = i - 1;
            i9 = 0;
        } else {
            i9 = i7;
        }
        int d = dg4.d(f);
        int i23 = i9 - d;
        if (i22 == 0 && i23 < 0) {
            d += i23;
            i23 = 0;
        }
        c cVar = new c();
        int i24 = -i3;
        int i25 = (i5 < 0 ? i5 : 0) + i24;
        int i26 = i23 + i25;
        int i27 = 0;
        while (i26 < 0 && i22 > 0) {
            i22--;
            int i28 = i24;
            l14 b = m14Var.b(i22);
            cVar.add(i21, b);
            i27 = Math.max(i27, b.d());
            i26 += b.k();
            i24 = i28;
            i21 = 0;
        }
        int i29 = i24;
        if (i26 < i25) {
            d += i26;
            i26 = i25;
        }
        int i30 = i26 - i25;
        int i31 = i2 + i4;
        int i32 = i22;
        int d2 = uo6.d(i31, 0);
        int i33 = i32;
        int i34 = i27;
        int i35 = -i30;
        int i36 = 0;
        boolean z5 = false;
        while (i36 < cVar.size()) {
            if (i35 >= d2) {
                cVar.remove(i36);
                z5 = true;
            } else {
                i33++;
                i35 += ((l14) cVar.get(i36)).k();
                i36++;
            }
        }
        int i37 = i30;
        int i38 = i35;
        boolean z6 = z5;
        int i39 = i33;
        int i40 = i34;
        while (i39 < i && (i38 < d2 || i38 <= 0 || cVar.isEmpty())) {
            int i41 = d2;
            l14 b2 = m14Var.b(i39);
            i38 += b2.k();
            if (i38 <= i25) {
                i19 = i25;
                if (i39 != i - 1) {
                    i20 = i39 + 1;
                    i37 -= b2.k();
                    z6 = true;
                    i39++;
                    d2 = i41;
                    i32 = i20;
                    i25 = i19;
                }
            } else {
                i19 = i25;
            }
            i40 = Math.max(i40, b2.d());
            cVar.add(b2);
            i20 = i32;
            i39++;
            d2 = i41;
            i32 = i20;
            i25 = i19;
        }
        if (i38 < i2) {
            int i42 = i2 - i38;
            i37 -= i42;
            int i43 = i38 + i42;
            i12 = i40;
            i15 = i32;
            while (i37 < i3 && i15 > 0) {
                i15--;
                int i44 = i31;
                l14 b3 = m14Var.b(i15);
                cVar.add(0, b3);
                i12 = Math.max(i12, b3.d());
                i37 += b3.k();
                i31 = i44;
                i39 = i39;
            }
            i10 = i31;
            i11 = i39;
            i13 = i42 + d;
            if (i37 < 0) {
                i13 += i37;
                i14 = i43 + i37;
                i37 = 0;
            } else {
                i14 = i43;
            }
        } else {
            i10 = i31;
            i11 = i39;
            i12 = i40;
            i13 = d;
            i14 = i38;
            i15 = i32;
        }
        float f2 = (dg4.a(dg4.d(f)) != dg4.a(i13) || Math.abs(dg4.d(f)) < Math.abs(i13)) ? f : i13;
        float f3 = f - f2;
        float f4 = (!z4 || i13 <= d || f3 > 0.0f) ? 0.0f : (i13 - d) + f3;
        if (i37 < 0) {
            throw new IllegalArgumentException("negative currentFirstItemScrollOffset");
        }
        int i45 = -i37;
        l14 l14Var2 = (l14) cVar.first();
        if (i3 > 0 || i5 < 0) {
            int size = cVar.size();
            l14 l14Var3 = l14Var2;
            int i46 = i37;
            int i47 = 0;
            while (i47 < size) {
                int i48 = size;
                int k = ((l14) cVar.get(i47)).k();
                if (i46 == 0 || k > i46) {
                    break;
                }
                i16 = i12;
                if (i47 == i.n(cVar)) {
                    break;
                }
                i46 -= k;
                i47++;
                l14Var3 = (l14) cVar.get(i47);
                i12 = i16;
                size = i48;
            }
            i16 = i12;
            l14Var = l14Var3;
            i17 = i8;
            list3 = list2;
            i18 = i46;
        } else {
            list3 = list2;
            i16 = i12;
            i18 = i37;
            i17 = i8;
            l14Var = l14Var2;
        }
        List d3 = d(i15, m14Var, i17, list3);
        int i49 = i16;
        int i50 = 0;
        for (int size2 = d3.size(); i50 < size2; size2 = size2) {
            i49 = Math.max(i49, ((l14) d3.get(i50)).d());
            i50++;
        }
        int i51 = i49;
        l14 l14Var4 = l14Var;
        int i52 = i10;
        float f5 = f2;
        List c = c(cVar, m14Var, i, i8, list2, f2, z4, j14Var);
        int size3 = c.size();
        int i53 = i51;
        for (int i54 = 0; i54 < size3; i54++) {
            i53 = Math.max(i53, ((l14) c.get(i54)).d());
        }
        boolean z7 = zq3.c(l14Var4, cVar.first()) && d3.isEmpty() && c.isEmpty();
        int g = iv0.g(j, z ? i53 : i14);
        if (z) {
            i53 = i14;
        }
        int f6 = iv0.f(j, i53);
        int i55 = i14;
        int i56 = i11;
        final List a = a(cVar, d3, c, g, f6, i55, i2, i45, z, mVar, eVar, z2, fm1Var);
        e14Var.e((int) f5, g, f6, a, m14Var, z, z4, z3, coroutineScope);
        final l14 a2 = !list.isEmpty() ? c14.a(a, m14Var, list, i3, g, f6) : null;
        boolean z8 = i56 < i || i55 > i2;
        sg4 sg4Var = (sg4) it2Var.invoke(Integer.valueOf(g), Integer.valueOf(f6), new ss2() { // from class: androidx.compose.foundation.lazy.LazyListMeasureKt$measureLazyList$7
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            public final void b(l.a aVar) {
                List<l14> list5 = a;
                l14 l14Var5 = a2;
                boolean z9 = z4;
                int size4 = list5.size();
                for (int i57 = 0; i57 < size4; i57++) {
                    l14 l14Var6 = list5.get(i57);
                    if (l14Var6 != l14Var5) {
                        l14Var6.m(aVar, z9);
                    }
                }
                l14 l14Var7 = a2;
                if (l14Var7 != null) {
                    l14Var7.m(aVar, z4);
                }
                tc5.a(sy4Var);
            }

            @Override // defpackage.ss2
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                b((l.a) obj);
                return ww8.a;
            }
        });
        if (z7) {
            list4 = a;
        } else {
            ArrayList arrayList = new ArrayList(a.size());
            int size4 = a.size();
            for (int i57 = 0; i57 < size4; i57++) {
                Object obj = a.get(i57);
                l14 l14Var5 = (l14) obj;
                if ((l14Var5.getIndex() >= ((l14) cVar.first()).getIndex() && l14Var5.getIndex() <= ((l14) cVar.last()).getIndex()) || l14Var5 == a2) {
                    arrayList.add(obj);
                }
            }
            list4 = arrayList;
        }
        return new k14(l14Var4, i18, z8, f5, sg4Var, f4, z6, list4, i29, i52, i, z2, z ? Orientation.Vertical : Orientation.Horizontal, i4, i5);
    }
}
