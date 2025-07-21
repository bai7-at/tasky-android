package androidx.compose.foundation.pager;

import androidx.compose.foundation.gestures.Orientation;
import androidx.compose.foundation.gestures.snapping.g;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.snapshots.e;
import androidx.compose.ui.Alignment;
import defpackage.bu1;
import defpackage.dg4;
import defpackage.fn5;
import defpackage.fv0;
import defpackage.gt2;
import defpackage.hk0;
import defpackage.it2;
import defpackage.iv0;
import defpackage.on5;
import defpackage.qs2;
import defpackage.r04;
import defpackage.sg4;
import defpackage.ss2;
import defpackage.wm3;
import defpackage.ww8;
import defpackage.ym5;
import java.util.List;
import kotlin.collections.t;

/* loaded from: classes.dex */
public abstract class PagerMeasurePolicyKt {
    public static final int a(PagerState pagerState, int i) {
        Object obj;
        List i2 = pagerState.C().i();
        int size = i2.size();
        int i3 = 0;
        while (true) {
            if (i3 >= size) {
                obj = null;
                break;
            }
            obj = i2.get(i3);
            if (((fn5) obj).getIndex() == pagerState.w()) {
                break;
            }
            i3++;
        }
        fn5 fn5Var = (fn5) obj;
        int b = fn5Var != null ? fn5Var.b() : 0;
        return -dg4.d(((pagerState.x() - (i == 0 ? pagerState.x() : (-b) / i)) * i) - b);
    }

    public static final gt2 b(final qs2 qs2Var, final PagerState pagerState, final ym5 ym5Var, final boolean z, final Orientation orientation, final int i, final float f, final a aVar, final Alignment.b bVar, final Alignment.c cVar, final g gVar, final qs2 qs2Var2, Composer composer, int i2, int i3) {
        composer.z(-1615726010);
        if (androidx.compose.runtime.b.G()) {
            androidx.compose.runtime.b.S(-1615726010, i2, i3, "androidx.compose.foundation.pager.rememberPagerMeasurePolicy (PagerMeasurePolicy.kt:56)");
        }
        Object[] objArr = {pagerState, ym5Var, Boolean.valueOf(z), orientation, bVar, cVar, bu1.d(f), aVar, gVar, qs2Var2};
        composer.z(-568225417);
        boolean z2 = false;
        for (int i4 = 0; i4 < 10; i4++) {
            z2 |= composer.S(objArr[i4]);
        }
        Object A = composer.A();
        if (z2 || A == Composer.a.a()) {
            A = new gt2() { // from class: androidx.compose.foundation.pager.PagerMeasurePolicyKt$rememberPagerMeasurePolicy$1$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                public final on5 b(final r04 r04Var, final long j) {
                    long a;
                    Orientation orientation2 = Orientation.this;
                    Orientation orientation3 = Orientation.Vertical;
                    boolean z3 = orientation2 == orientation3;
                    hk0.a(j, z3 ? orientation3 : Orientation.Horizontal);
                    int l0 = z3 ? r04Var.l0(ym5Var.b(r04Var.getLayoutDirection())) : r04Var.l0(PaddingKt.g(ym5Var, r04Var.getLayoutDirection()));
                    int l02 = z3 ? r04Var.l0(ym5Var.c(r04Var.getLayoutDirection())) : r04Var.l0(PaddingKt.f(ym5Var, r04Var.getLayoutDirection()));
                    int l03 = r04Var.l0(ym5Var.d());
                    int l04 = r04Var.l0(ym5Var.a());
                    final int i5 = l03 + l04;
                    final int i6 = l0 + l02;
                    int i7 = z3 ? i5 : i6;
                    int i8 = (!z3 || z) ? (z3 && z) ? l04 : (z3 || z) ? l02 : l0 : l03;
                    int i9 = i7 - i8;
                    long i10 = iv0.i(j, -i6, -i5);
                    pagerState.e0(r04Var);
                    int l05 = r04Var.l0(f);
                    int m = z3 ? fv0.m(j) - i5 : fv0.n(j) - i6;
                    if (!z || m > 0) {
                        a = wm3.a(l0, l03);
                    } else {
                        if (!z3) {
                            l0 += m;
                        }
                        if (z3) {
                            l03 += m;
                        }
                        a = wm3.a(l0, l03);
                    }
                    long j2 = a;
                    int a2 = aVar.a(r04Var, m, l05);
                    pagerState.f0(iv0.b(0, Orientation.this == orientation3 ? fv0.n(i10) : a2, 0, Orientation.this != orientation3 ? fv0.m(i10) : a2, 5, null));
                    PagerLazyLayoutItemProvider pagerLazyLayoutItemProvider = (PagerLazyLayoutItemProvider) qs2Var.mo865invoke();
                    int i11 = a2 + l05;
                    e.a aVar2 = e.e;
                    PagerState pagerState2 = pagerState;
                    e c = aVar2.c();
                    try {
                        e l = c.l();
                        try {
                            int W = pagerState2.W(pagerLazyLayoutItemProvider, pagerState2.w());
                            int a3 = PagerMeasurePolicyKt.a(pagerState2, i11);
                            ww8 ww8Var = ww8.a;
                            c.d();
                            on5 h = PagerMeasureKt.h(r04Var, ((Number) qs2Var2.mo865invoke()).intValue(), pagerLazyLayoutItemProvider, m, i8, i9, l05, W, a3, i10, Orientation.this, cVar, bVar, z, j2, a2, i, androidx.compose.foundation.lazy.layout.c.a(pagerLazyLayoutItemProvider, pagerState.I(), pagerState.v()), gVar, pagerState.J(), new it2() { // from class: androidx.compose.foundation.pager.PagerMeasurePolicyKt$rememberPagerMeasurePolicy$1$1.2
                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                {
                                    super(3);
                                }

                                public final sg4 b(int i12, int i13, ss2 ss2Var) {
                                    return r04.this.P(iv0.g(j, i12 + i6), iv0.f(j, i13 + i5), t.i(), ss2Var);
                                }

                                @Override // defpackage.it2
                                public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
                                    return b(((Number) obj).intValue(), ((Number) obj2).intValue(), (ss2) obj3);
                                }
                            });
                            PagerState.q(pagerState, h, false, 2, null);
                            return h;
                        } finally {
                            c.s(l);
                        }
                    } catch (Throwable th) {
                        c.d();
                        throw th;
                    }
                }

                @Override // defpackage.gt2
                public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                    return b((r04) obj, ((fv0) obj2).t());
                }
            };
            composer.q(A);
        }
        composer.R();
        gt2 gt2Var = (gt2) A;
        if (androidx.compose.runtime.b.G()) {
            androidx.compose.runtime.b.R();
        }
        composer.R();
        return gt2Var;
    }
}
