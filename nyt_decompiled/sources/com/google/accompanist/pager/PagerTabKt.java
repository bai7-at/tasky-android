package com.google.accompanist.pager;

import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.d;
import androidx.compose.ui.layout.f;
import androidx.compose.ui.layout.l;
import defpackage.du1;
import defpackage.fv0;
import defpackage.it2;
import defpackage.iv0;
import defpackage.kf8;
import defpackage.qg4;
import defpackage.sg4;
import defpackage.ss2;
import defpackage.ww8;
import defpackage.zq3;
import java.util.List;
import kotlin.collections.i;

/* loaded from: classes2.dex */
public abstract class PagerTabKt {
    public static final Modifier a(Modifier modifier, final PagerState pagerState, final List list, final ss2 ss2Var) {
        zq3.h(modifier, "<this>");
        zq3.h(pagerState, "pagerState");
        zq3.h(list, "tabPositions");
        zq3.h(ss2Var, "pageIndexMapping");
        return d.a(modifier, new it2() { // from class: com.google.accompanist.pager.PagerTabKt$pagerTabIndicatorOffset$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(3);
            }

            public final sg4 b(f fVar, qg4 qg4Var, final long j) {
                zq3.h(fVar, "$this$layout");
                zq3.h(qg4Var, "measurable");
                if (list.isEmpty()) {
                    return f.J(fVar, fv0.n(j), 0, null, new ss2() { // from class: com.google.accompanist.pager.PagerTabKt$pagerTabIndicatorOffset$2.1
                        public final void b(l.a aVar) {
                            zq3.h(aVar, "$this$layout");
                        }

                        @Override // defpackage.ss2
                        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                            b((l.a) obj);
                            return ww8.a;
                        }
                    }, 4, null);
                }
                int min = Math.min(i.n(list), ((Number) ss2Var.invoke(Integer.valueOf(pagerState.k()))).intValue());
                kf8 kf8Var = list.get(min);
                kf8 kf8Var2 = (kf8) i.n0(list, min - 1);
                kf8 kf8Var3 = (kf8) i.n0(list, min + 1);
                float m = pagerState.m();
                float f = 0;
                int l0 = (m <= f || kf8Var3 == null) ? (m >= f || kf8Var2 == null) ? fVar.l0(kf8Var.c()) : fVar.l0(du1.c(kf8Var.c(), kf8Var2.c(), -m)) : fVar.l0(du1.c(kf8Var.c(), kf8Var3.c(), m));
                final int l02 = (m <= f || kf8Var3 == null) ? (m >= f || kf8Var2 == null) ? fVar.l0(kf8Var.a()) : fVar.l0(du1.c(kf8Var.a(), kf8Var2.a(), -m)) : fVar.l0(du1.c(kf8Var.a(), kf8Var3.a(), m));
                final l W = qg4Var.W(iv0.a(l0, l0, 0, fv0.m(j)));
                return f.J(fVar, fv0.n(j), Math.max(W.v0(), fv0.o(j)), null, new ss2() { // from class: com.google.accompanist.pager.PagerTabKt$pagerTabIndicatorOffset$2.2
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(1);
                    }

                    public final void b(l.a aVar) {
                        zq3.h(aVar, "$this$layout");
                        l.a.j(aVar, l.this, l02, Math.max(fv0.o(j) - l.this.v0(), 0), 0.0f, 4, null);
                    }

                    @Override // defpackage.ss2
                    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                        b((l.a) obj);
                        return ww8.a;
                    }
                }, 4, null);
            }

            @Override // defpackage.it2
            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
                return b((f) obj, (qg4) obj2, ((fv0) obj3).t());
            }
        });
    }

    public static /* synthetic */ Modifier b(Modifier modifier, PagerState pagerState, List list, ss2 ss2Var, int i, Object obj) {
        if ((i & 4) != 0) {
            ss2Var = new ss2() { // from class: com.google.accompanist.pager.PagerTabKt$pagerTabIndicatorOffset$1
                public final Integer b(int i2) {
                    return Integer.valueOf(i2);
                }

                @Override // defpackage.ss2
                public /* bridge */ /* synthetic */ Object invoke(Object obj2) {
                    return b(((Number) obj2).intValue());
                }
            };
        }
        return a(modifier, pagerState, list, ss2Var);
    }
}
