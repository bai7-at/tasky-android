package com.nytimes.android.unfear.nytdesignsystem.composable;

import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.lazy.LazyDslKt;
import androidx.compose.foundation.lazy.LazyListScope;
import androidx.compose.foundation.lazy.LazyListState;
import androidx.compose.foundation.lazy.LazyListStateKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.b;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import com.comscore.streaming.ContentType;
import com.nytimes.android.unfear.core.composable.UnfearLayoutsKt;
import com.nytimes.android.unfear.nytdesignsystem.model.HasKey;
import com.nytimes.android.utils.composeutils.ModifierUtilsKt;
import defpackage.bu1;
import defpackage.cc7;
import defpackage.gt2;
import defpackage.gt6;
import defpackage.h04;
import defpackage.j08;
import defpackage.kt2;
import defpackage.l34;
import defpackage.qk2;
import defpackage.sc7;
import defpackage.ss2;
import defpackage.ts1;
import defpackage.ww8;
import defpackage.ym5;
import defpackage.zq3;
import defpackage.zr0;
import java.util.List;

/* loaded from: classes4.dex */
public abstract class PageLayoutsKt {
    public static final void a(final j08 j08Var, Modifier modifier, LazyListState lazyListState, ym5 ym5Var, boolean z, Arrangement.m mVar, Alignment.b bVar, qk2 qk2Var, Composer composer, final int i, final int i2) {
        LazyListState lazyListState2;
        int i3;
        int i4;
        Arrangement.m mVar2;
        qk2 qk2Var2;
        zq3.h(j08Var, "page");
        Composer h = composer.h(1464380206);
        Modifier modifier2 = (i2 & 2) != 0 ? Modifier.a : modifier;
        if ((i2 & 4) != 0) {
            lazyListState2 = LazyListStateKt.c(0, 0, h, 0, 3);
            i3 = i & (-897);
        } else {
            lazyListState2 = lazyListState;
            i3 = i;
        }
        ym5 a = (i2 & 8) != 0 ? PaddingKt.a(bu1.g(0)) : ym5Var;
        boolean z2 = (i2 & 16) == 0 ? z : false;
        if ((i2 & 32) != 0) {
            Arrangement arrangement = Arrangement.a;
            Arrangement.m g = !z2 ? arrangement.g() : arrangement.a();
            i4 = i3 & (-458753);
            mVar2 = g;
        } else {
            i4 = i3;
            mVar2 = mVar;
        }
        Alignment.b k = (i2 & 64) != 0 ? Alignment.a.k() : bVar;
        if ((i2 & 128) != 0) {
            i4 &= -29360129;
            qk2Var2 = sc7.a.b(h, sc7.b);
        } else {
            qk2Var2 = qk2Var;
        }
        if (b.G()) {
            b.S(1464380206, i4, -1, "com.nytimes.android.unfear.nytdesignsystem.composable.StandardPageLayout (PageLayouts.kt:39)");
        }
        LazyDslKt.a(modifier2, lazyListState2, a, z2, mVar2, k, qk2Var2, false, new ss2() { // from class: com.nytimes.android.unfear.nytdesignsystem.composable.PageLayoutsKt$StandardPageLayout$1
            {
                super(1);
            }

            @Override // defpackage.ss2
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke((LazyListScope) obj);
                return ww8.a;
            }

            public final void invoke(LazyListScope lazyListScope) {
                zq3.h(lazyListScope, "$this$LazyColumn");
                final List b = j08.this.b();
                final gt2 a2 = HasKey.Companion.a();
                final j08 j08Var2 = j08.this;
                lazyListScope.b(b.size(), a2 != null ? new ss2() { // from class: com.nytimes.android.unfear.nytdesignsystem.composable.PageLayoutsKt$StandardPageLayout$1$invoke$$inlined$itemsIndexed$default$1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(1);
                    }

                    @Override // defpackage.ss2
                    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                        return invoke(((Number) obj).intValue());
                    }

                    public final Object invoke(int i5) {
                        return gt2.this.invoke(Integer.valueOf(i5), b.get(i5));
                    }
                } : null, new ss2() { // from class: com.nytimes.android.unfear.nytdesignsystem.composable.PageLayoutsKt$StandardPageLayout$1$invoke$$inlined$itemsIndexed$default$2
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(1);
                    }

                    @Override // defpackage.ss2
                    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                        return invoke(((Number) obj).intValue());
                    }

                    public final Object invoke(int i5) {
                        b.get(i5);
                        return null;
                    }
                }, zr0.c(-1091073711, true, new kt2() { // from class: com.nytimes.android.unfear.nytdesignsystem.composable.PageLayoutsKt$StandardPageLayout$1$invoke$$inlined$itemsIndexed$default$3
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(4);
                    }

                    @Override // defpackage.kt2
                    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
                        invoke((h04) obj, ((Number) obj2).intValue(), (Composer) obj3, ((Number) obj4).intValue());
                        return ww8.a;
                    }

                    public final void invoke(h04 h04Var, int i5, Composer composer2, int i6) {
                        int i7;
                        Modifier modifier3;
                        if ((i6 & 14) == 0) {
                            i7 = (composer2.S(h04Var) ? 4 : 2) | i6;
                        } else {
                            i7 = i6;
                        }
                        if ((i6 & ContentType.LONG_FORM_ON_DEMAND) == 0) {
                            i7 |= composer2.d(i5) ? 32 : 16;
                        }
                        if ((i7 & 731) == 146 && composer2.i()) {
                            composer2.K();
                            return;
                        }
                        if (b.G()) {
                            b.S(-1091073711, i7, -1, "androidx.compose.foundation.lazy.itemsIndexed.<anonymous> (LazyDsl.kt:183)");
                        }
                        l34 l34Var = (l34) b.get(i5);
                        composer2.z(19738761);
                        if (i5 > 0 && !j08Var2.c().b().c()) {
                            DividerLayoutsKt.a(j08Var2.c().b(), null, composer2, ts1.c, 2);
                        }
                        composer2.R();
                        String a3 = l34Var.a();
                        if (a3 == null || (modifier3 = ModifierUtilsKt.d(Modifier.a, a3)) == null) {
                            modifier3 = Modifier.a;
                        }
                        UnfearLayoutsKt.a(l34Var, modifier3, null, composer2, 8, 4);
                        if (b.G()) {
                            b.R();
                        }
                    }
                }));
            }
        }, h, (i4 >> 3) & 4194302, 128);
        if (b.G()) {
            b.R();
        }
        cc7 k2 = h.k();
        if (k2 != null) {
            final Modifier modifier3 = modifier2;
            final LazyListState lazyListState3 = lazyListState2;
            final ym5 ym5Var2 = a;
            final boolean z3 = z2;
            final Arrangement.m mVar3 = mVar2;
            final Alignment.b bVar2 = k;
            final qk2 qk2Var3 = qk2Var2;
            k2.a(new gt2() { // from class: com.nytimes.android.unfear.nytdesignsystem.composable.PageLayoutsKt$StandardPageLayout$2
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                @Override // defpackage.gt2
                public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                    invoke((Composer) obj, ((Number) obj2).intValue());
                    return ww8.a;
                }

                public final void invoke(Composer composer2, int i5) {
                    PageLayoutsKt.a(j08.this, modifier3, lazyListState3, ym5Var2, z3, mVar3, bVar2, qk2Var3, composer2, gt6.a(i | 1), i2);
                }
            });
        }
    }
}
