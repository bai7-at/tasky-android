package androidx.compose.foundation.layout;

import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.ui.layout.l;
import androidx.compose.ui.unit.LayoutDirection;
import defpackage.dg4;
import defpackage.fv0;
import defpackage.k37;
import defpackage.l37;
import defpackage.qg4;
import defpackage.qm3;
import defpackage.uo6;
import defpackage.xk5;
import defpackage.xq3;
import defpackage.zq3;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes.dex */
public final class l {
    private final LayoutOrientation a;
    private final Arrangement.e b;
    private final Arrangement.m c;
    private final float d;
    private final SizeMode e;
    private final f f;
    private final List g;
    private final androidx.compose.ui.layout.l[] h;
    private final l37[] i;

    public /* synthetic */ l(LayoutOrientation layoutOrientation, Arrangement.e eVar, Arrangement.m mVar, float f, SizeMode sizeMode, f fVar, List list, androidx.compose.ui.layout.l[] lVarArr, DefaultConstructorMarker defaultConstructorMarker) {
        this(layoutOrientation, eVar, mVar, f, sizeMode, fVar, list, lVarArr);
    }

    private final int c(androidx.compose.ui.layout.l lVar, l37 l37Var, int i, LayoutDirection layoutDirection, int i2) {
        f fVar;
        if (l37Var == null || (fVar = l37Var.a()) == null) {
            fVar = this.f;
        }
        int a = i - a(lVar);
        if (this.a == LayoutOrientation.Horizontal) {
            layoutDirection = LayoutDirection.Ltr;
        }
        return fVar.a(a, layoutDirection, lVar, i2);
    }

    private final int[] f(int i, int[] iArr, int[] iArr2, androidx.compose.ui.layout.f fVar) {
        if (this.a == LayoutOrientation.Vertical) {
            Arrangement.m mVar = this.c;
            if (mVar == null) {
                throw new IllegalArgumentException("null verticalArrangement in Column");
            }
            mVar.c(fVar, i, iArr, iArr2);
        } else {
            Arrangement.e eVar = this.b;
            if (eVar == null) {
                throw new IllegalArgumentException("null horizontalArrangement in Row");
            }
            eVar.b(fVar, i, iArr, fVar.getLayoutDirection(), iArr2);
        }
        return iArr2;
    }

    public final int a(androidx.compose.ui.layout.l lVar) {
        return this.a == LayoutOrientation.Horizontal ? lVar.v0() : lVar.F0();
    }

    public final float b() {
        return this.d;
    }

    public final List d() {
        return this.g;
    }

    public final androidx.compose.ui.layout.l[] e() {
        return this.h;
    }

    public final int g(androidx.compose.ui.layout.l lVar) {
        return this.a == LayoutOrientation.Horizontal ? lVar.F0() : lVar.v0();
    }

    public final k37 h(androidx.compose.ui.layout.f fVar, long j, int i, int i2) {
        int i3;
        int o;
        float f;
        long j2;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        long j3;
        long c = xk5.c(j, this.a);
        long l0 = fVar.l0(this.d);
        int i10 = i2 - i;
        long j4 = 0;
        int i11 = i;
        long j5 = 0;
        float f2 = 0.0f;
        int i12 = 0;
        int i13 = 0;
        int i14 = 0;
        boolean z = false;
        while (true) {
            boolean z2 = true;
            if (i11 >= i2) {
                break;
            }
            qg4 qg4Var = (qg4) this.g.get(i11);
            l37 l37Var = this.i[i11];
            float m = k.m(l37Var);
            if (m > 0.0f) {
                f2 += m;
                i14++;
                i8 = i11;
                j3 = j4;
            } else {
                int n = fv0.n(c);
                androidx.compose.ui.layout.l lVar = this.h[i11];
                if (lVar == null) {
                    i7 = i13;
                    i8 = i11;
                    i9 = n;
                    lVar = qg4Var.W(xk5.f(xk5.e(c, 0, n == Integer.MAX_VALUE ? Integer.MAX_VALUE : (int) uo6.e(n - j5, j4), 0, 0, 8, null), this.a));
                } else {
                    i7 = i13;
                    i8 = i11;
                    i9 = n;
                }
                j3 = 0;
                int min = Math.min((int) l0, (int) uo6.e((i9 - j5) - g(lVar), 0L));
                j5 += g(lVar) + min;
                int max = Math.max(i7, a(lVar));
                if (!z && !k.q(l37Var)) {
                    z2 = false;
                }
                this.h[i8] = lVar;
                i12 = min;
                i13 = max;
                z = z2;
            }
            j4 = j3;
            i11 = i8 + 1;
        }
        long j6 = j4;
        if (i14 == 0) {
            j5 -= i12;
            i3 = 0;
            o = 0;
        } else {
            long j7 = l0 * (i14 - 1);
            long e = uo6.e((((f2 <= 0.0f || fv0.n(c) == Integer.MAX_VALUE) ? fv0.p(c) : fv0.n(c)) - j5) - j7, j6);
            float f3 = f2 > 0.0f ? e / f2 : 0.0f;
            Iterator it2 = uo6.u(i, i2).iterator();
            int i15 = 0;
            while (it2.hasNext()) {
                i15 += dg4.d(k.m(this.i[((qm3) it2).c()]) * f3);
            }
            long j8 = e - i15;
            int i16 = i;
            int i17 = 0;
            while (i16 < i2) {
                if (this.h[i16] == null) {
                    qg4 qg4Var2 = (qg4) this.g.get(i16);
                    l37 l37Var2 = this.i[i16];
                    float m2 = k.m(l37Var2);
                    if (m2 <= 0.0f) {
                        throw new IllegalStateException("All weights <= 0 should have placeables");
                    }
                    int b = dg4.b(j8);
                    j2 = j7;
                    j8 -= b;
                    int max2 = Math.max(0, dg4.d(m2 * f3) + b);
                    if (!k.k(l37Var2) || max2 == Integer.MAX_VALUE) {
                        i4 = 0;
                        f = f3;
                    } else {
                        f = f3;
                        i4 = max2;
                    }
                    androidx.compose.ui.layout.l W = qg4Var2.W(xk5.f(xk5.a(i4, max2, 0, fv0.m(c)), this.a));
                    i17 += g(W);
                    int max3 = Math.max(i13, a(W));
                    boolean z3 = z || k.q(l37Var2);
                    this.h[i16] = W;
                    z = z3;
                    i13 = max3;
                } else {
                    f = f3;
                    j2 = j7;
                }
                i16++;
                f3 = f;
                j7 = j2;
            }
            i3 = 0;
            o = (int) uo6.o(i17 + j7, 0L, fv0.n(c) - j5);
        }
        if (z) {
            i5 = i3;
            i6 = i5;
            for (int i18 = i; i18 < i2; i18++) {
                androidx.compose.ui.layout.l lVar2 = this.h[i18];
                zq3.e(lVar2);
                f j9 = k.j(this.i[i18]);
                Integer b2 = j9 != null ? j9.b(lVar2) : null;
                if (b2 != null) {
                    int intValue = b2.intValue();
                    if (intValue == Integer.MIN_VALUE) {
                        intValue = i3;
                    }
                    i5 = Math.max(i5, intValue);
                    int a = a(lVar2);
                    int intValue2 = b2.intValue();
                    if (intValue2 == Integer.MIN_VALUE) {
                        intValue2 = a(lVar2);
                    }
                    i6 = Math.max(i6, a - intValue2);
                }
            }
        } else {
            i5 = i3;
            i6 = i5;
        }
        int max4 = Math.max((int) uo6.e(j5 + o, 0L), fv0.p(c));
        int max5 = (fv0.m(c) == Integer.MAX_VALUE || this.e != SizeMode.Expand) ? Math.max(i13, Math.max(fv0.o(c), i6 + i5)) : fv0.m(c);
        int[] iArr = new int[i10];
        for (int i19 = i3; i19 < i10; i19++) {
            iArr[i19] = i3;
        }
        int[] iArr2 = new int[i10];
        for (int i20 = i3; i20 < i10; i20++) {
            androidx.compose.ui.layout.l lVar3 = this.h[i20 + i];
            zq3.e(lVar3);
            iArr2[i20] = g(lVar3);
        }
        return new k37(max5, max4, i, i2, i5, f(max4, iArr2, iArr, fVar));
    }

    public final void i(l.a aVar, k37 k37Var, int i, LayoutDirection layoutDirection) {
        int c = k37Var.c();
        for (int f = k37Var.f(); f < c; f++) {
            androidx.compose.ui.layout.l lVar = this.h[f];
            zq3.e(lVar);
            int[] d = k37Var.d();
            Object d2 = ((qg4) this.g.get(f)).d();
            int c2 = c(lVar, d2 instanceof l37 ? (l37) d2 : null, k37Var.b(), layoutDirection, k37Var.a()) + i;
            if (this.a == LayoutOrientation.Horizontal) {
                l.a.f(aVar, lVar, d[f - k37Var.f()], c2, 0.0f, 4, null);
            } else {
                l.a.f(aVar, lVar, c2, d[f - k37Var.f()], 0.0f, 4, null);
            }
        }
    }

    private l(LayoutOrientation layoutOrientation, Arrangement.e eVar, Arrangement.m mVar, float f, SizeMode sizeMode, f fVar, List list, androidx.compose.ui.layout.l[] lVarArr) {
        this.a = layoutOrientation;
        this.b = eVar;
        this.c = mVar;
        this.d = f;
        this.e = sizeMode;
        this.f = fVar;
        this.g = list;
        this.h = lVarArr;
        int size = list.size();
        l37[] l37VarArr = new l37[size];
        for (int i = 0; i < size; i++) {
            l37VarArr[i] = k.l((xq3) this.g.get(i));
        }
        this.i = l37VarArr;
    }
}
