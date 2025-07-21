package androidx.compose.foundation.layout;

import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.f;
import androidx.compose.runtime.Composer;
import androidx.compose.ui.Alignment;
import defpackage.an3;
import defpackage.fv0;
import defpackage.it2;
import defpackage.k37;
import defpackage.kl2;
import defpackage.qg4;
import defpackage.qm3;
import defpackage.rg4;
import defpackage.ss2;
import defpackage.vy4;
import defpackage.ww8;
import defpackage.xk5;
import defpackage.xq3;
import defpackage.zq3;
import java.util.List;
import java.util.NoSuchElementException;

/* loaded from: classes.dex */
public abstract class FlowLayoutKt {
    private static final f a;
    private static final f b;

    static {
        f.b bVar = f.a;
        Alignment.a aVar = Alignment.a;
        a = bVar.b(aVar.l());
        b = bVar.a(aVar.k());
    }

    public static final kl2 e(androidx.compose.ui.layout.f fVar, l lVar, LayoutOrientation layoutOrientation, long j, int i) {
        vy4 vy4Var = new vy4(new k37[16], 0);
        int n = fv0.n(j);
        int p = fv0.p(j);
        int m = fv0.m(j);
        List d = lVar.d();
        final androidx.compose.ui.layout.l[] e = lVar.e();
        int ceil = (int) Math.ceil(fVar.f1(lVar.b()));
        long a2 = xk5.a(p, n, 0, m);
        qg4 qg4Var = (qg4) kotlin.collections.i.n0(d, 0);
        Integer valueOf = qg4Var != null ? Integer.valueOf(k(qg4Var, a2, layoutOrientation, new ss2() { // from class: androidx.compose.foundation.layout.FlowLayoutKt$breakDownItems$nextSize$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            public final void b(androidx.compose.ui.layout.l lVar2) {
                e[0] = lVar2;
            }

            @Override // defpackage.ss2
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                b((androidx.compose.ui.layout.l) obj);
                return ww8.a;
            }
        })) : null;
        Integer[] numArr = new Integer[d.size()];
        int size = d.size();
        int i2 = n;
        final int i3 = 0;
        int i4 = 0;
        int i5 = 0;
        int i6 = 0;
        while (i3 < size) {
            zq3.e(valueOf);
            int intValue = valueOf.intValue();
            int i7 = i4 + intValue;
            i2 -= intValue;
            int i8 = i3 + 1;
            qg4 qg4Var2 = (qg4) kotlin.collections.i.n0(d, i8);
            int i9 = size;
            Integer valueOf2 = qg4Var2 != null ? Integer.valueOf(k(qg4Var2, a2, layoutOrientation, new ss2() { // from class: androidx.compose.foundation.layout.FlowLayoutKt$breakDownItems$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(1);
                }

                public final void b(androidx.compose.ui.layout.l lVar2) {
                    e[i3 + 1] = lVar2;
                }

                @Override // defpackage.ss2
                public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                    b((androidx.compose.ui.layout.l) obj);
                    return ww8.a;
                }
            }) + ceil) : null;
            if (i8 < d.size() && i8 - i5 < i) {
                if (i2 - (valueOf2 != null ? valueOf2.intValue() : 0) >= 0) {
                    i3 = i8;
                    size = i9;
                    valueOf = valueOf2;
                    i4 = i7;
                }
            }
            p = Math.min(Math.max(p, i7), n);
            numArr[i6] = Integer.valueOf(i8);
            i6++;
            valueOf2 = valueOf2 != null ? Integer.valueOf(valueOf2.intValue() - ceil) : null;
            i2 = n;
            i5 = i8;
            i7 = 0;
            i3 = i8;
            size = i9;
            valueOf = valueOf2;
            i4 = i7;
        }
        long f = xk5.f(xk5.e(a2, p, 0, 0, 0, 14, null), layoutOrientation);
        int i10 = 0;
        int i11 = 0;
        Integer num = (Integer) kotlin.collections.d.f0(numArr, 0);
        int i12 = p;
        int i13 = 0;
        while (num != null) {
            Integer[] numArr2 = numArr;
            k37 h = lVar.h(fVar, f, i11, num.intValue());
            i10 += h.b();
            i12 = Math.max(i12, h.e());
            vy4Var.b(h);
            i11 = num.intValue();
            i13++;
            num = (Integer) kotlin.collections.d.f0(numArr2, i13);
            numArr = numArr2;
        }
        return new kl2(Math.max(i12, fv0.p(j)), Math.max(i10, fv0.o(j)), vy4Var);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int f(List list, it2 it2Var, it2 it2Var2, int i, int i2, int i3, int i4) {
        if (list.isEmpty()) {
            return 0;
        }
        Object n0 = kotlin.collections.i.n0(list, 0);
        xq3 xq3Var = (xq3) n0;
        int intValue = xq3Var != null ? ((Number) it2Var2.invoke(xq3Var, 0, Integer.valueOf(i))).intValue() : 0;
        int intValue2 = xq3Var != null ? ((Number) it2Var.invoke(xq3Var, 0, Integer.valueOf(intValue))).intValue() : 0;
        int size = list.size();
        int i5 = i;
        int i6 = 0;
        int i7 = 0;
        int i8 = 0;
        int i9 = 0;
        while (i6 < size) {
            zq3.e(n0);
            i5 -= intValue2;
            int max = Math.max(i8, intValue);
            i6++;
            Object n02 = kotlin.collections.i.n0(list, i6);
            xq3 xq3Var2 = (xq3) n02;
            int intValue3 = xq3Var2 != null ? ((Number) it2Var2.invoke(xq3Var2, Integer.valueOf(i6), Integer.valueOf(i))).intValue() : 0;
            int intValue4 = xq3Var2 != null ? ((Number) it2Var.invoke(xq3Var2, Integer.valueOf(i6), Integer.valueOf(intValue3))).intValue() + i2 : 0;
            if (i5 >= 0 && i6 != list.size()) {
                if (i6 - i9 != i4 && i5 - intValue4 >= 0) {
                    int i10 = intValue3;
                    i8 = max;
                    n0 = n02;
                    intValue2 = intValue4;
                    intValue = i10;
                }
            }
            i7 += max + i3;
            intValue4 -= i2;
            i5 = i;
            max = 0;
            i9 = i6;
            int i102 = intValue3;
            i8 = max;
            n0 = n02;
            intValue2 = intValue4;
            intValue = i102;
        }
        return i7 - i3;
    }

    private static final int g(List list, final int[] iArr, final int[] iArr2, int i, int i2, int i3, int i4) {
        return f(list, new it2() { // from class: androidx.compose.foundation.layout.FlowLayoutKt$intrinsicCrossAxisSize$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(3);
            }

            public final Integer b(xq3 xq3Var, int i5, int i6) {
                return Integer.valueOf(iArr[i5]);
            }

            @Override // defpackage.it2
            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
                return b((xq3) obj, ((Number) obj2).intValue(), ((Number) obj3).intValue());
            }
        }, new it2() { // from class: androidx.compose.foundation.layout.FlowLayoutKt$intrinsicCrossAxisSize$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(3);
            }

            public final Integer b(xq3 xq3Var, int i5, int i6) {
                return Integer.valueOf(iArr2[i5]);
            }

            @Override // defpackage.it2
            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
                return b((xq3) obj, ((Number) obj2).intValue(), ((Number) obj3).intValue());
            }
        }, i, i2, i3, i4);
    }

    public static final int h(qg4 qg4Var, LayoutOrientation layoutOrientation, int i) {
        return layoutOrientation == LayoutOrientation.Horizontal ? qg4Var.S(i) : qg4Var.H(i);
    }

    public static final int i(androidx.compose.ui.layout.l lVar, LayoutOrientation layoutOrientation) {
        return layoutOrientation == LayoutOrientation.Horizontal ? lVar.F0() : lVar.v0();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int j(List list, it2 it2Var, int i, int i2, int i3) {
        int size = list.size();
        int i4 = 0;
        int i5 = 0;
        int i6 = 0;
        int i7 = 0;
        while (i4 < size) {
            int intValue = ((Number) it2Var.invoke((xq3) list.get(i4), Integer.valueOf(i4), Integer.valueOf(i))).intValue() + i2;
            int i8 = i4 + 1;
            if (i8 - i6 == i3 || i8 == list.size()) {
                i5 = Math.max(i5, (i7 + intValue) - i2);
                i7 = 0;
                i6 = i4;
            } else {
                i7 += intValue;
            }
            i4 = i8;
        }
        return i5;
    }

    private static final int k(qg4 qg4Var, long j, LayoutOrientation layoutOrientation, ss2 ss2Var) {
        if (k.m(k.l(qg4Var)) != 0.0f) {
            return h(qg4Var, layoutOrientation, Integer.MAX_VALUE);
        }
        androidx.compose.ui.layout.l W = qg4Var.W(xk5.f(xk5.e(j, 0, 0, 0, 0, 14, null), layoutOrientation));
        ss2Var.invoke(W);
        return i(W, layoutOrientation);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int l(List list, it2 it2Var, it2 it2Var2, int i, int i2, int i3, int i4) {
        int size = list.size();
        int[] iArr = new int[size];
        for (int i5 = 0; i5 < size; i5++) {
            iArr[i5] = 0;
        }
        int size2 = list.size();
        int[] iArr2 = new int[size2];
        for (int i6 = 0; i6 < size2; i6++) {
            iArr2[i6] = 0;
        }
        int size3 = list.size();
        for (int i7 = 0; i7 < size3; i7++) {
            xq3 xq3Var = (xq3) list.get(i7);
            int intValue = ((Number) it2Var.invoke(xq3Var, Integer.valueOf(i7), Integer.valueOf(i))).intValue();
            iArr[i7] = intValue;
            iArr2[i7] = ((Number) it2Var2.invoke(xq3Var, Integer.valueOf(i7), Integer.valueOf(intValue))).intValue();
        }
        int y0 = kotlin.collections.d.y0(iArr);
        if (size2 == 0) {
            throw new NoSuchElementException();
        }
        int i8 = iArr2[0];
        qm3 it2 = new an3(1, kotlin.collections.d.c0(iArr2)).iterator();
        while (it2.hasNext()) {
            int i9 = iArr2[it2.c()];
            if (i8 < i9) {
                i8 = i9;
            }
        }
        if (size == 0) {
            throw new NoSuchElementException();
        }
        int i10 = iArr[0];
        qm3 it3 = new an3(1, kotlin.collections.d.c0(iArr)).iterator();
        while (it3.hasNext()) {
            int i11 = iArr[it3.c()];
            if (i10 < i11) {
                i10 = i11;
            }
        }
        int i12 = y0;
        while (i10 < i12 && i8 != i) {
            int i13 = (i10 + i12) / 2;
            i8 = g(list, iArr, iArr2, i13, i2, i3, i4);
            if (i8 == i) {
                return i13;
            }
            if (i8 > i) {
                i10 = i13 + 1;
            } else {
                i12 = i13 - 1;
            }
            y0 = i13;
        }
        return y0;
    }

    public static final rg4 m(Arrangement.e eVar, Arrangement.m mVar, int i, Composer composer, int i2) {
        composer.z(1479255111);
        if (androidx.compose.runtime.b.G()) {
            androidx.compose.runtime.b.S(1479255111, i2, -1, "androidx.compose.foundation.layout.rowMeasurementHelper (FlowLayout.kt:156)");
        }
        Integer valueOf = Integer.valueOf(i);
        composer.z(1618982084);
        boolean S = composer.S(valueOf) | composer.S(eVar) | composer.S(mVar);
        Object A = composer.A();
        if (S || A == Composer.a.a()) {
            A = new FlowMeasurePolicy(LayoutOrientation.Horizontal, eVar, mVar, eVar.a(), SizeMode.Wrap, a, mVar.a(), i, null);
            composer.q(A);
        }
        composer.R();
        FlowMeasurePolicy flowMeasurePolicy = (FlowMeasurePolicy) A;
        if (androidx.compose.runtime.b.G()) {
            androidx.compose.runtime.b.R();
        }
        composer.R();
        return flowMeasurePolicy;
    }
}
