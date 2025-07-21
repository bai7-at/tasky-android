package com.nytimes.android.ribbon.destinations.greatreads;

import androidx.compose.foundation.ClickableKt;
import androidx.compose.foundation.ImageKt;
import androidx.compose.foundation.layout.AspectRatioKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.foundation.lazy.LazyListScope;
import androidx.compose.foundation.lazy.LazyListState;
import androidx.compose.material.TextKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.b;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.ContentScale;
import com.nytimes.android.designsystem.uicompose.ui.tpl.TPLTypography;
import com.nytimes.android.designsystem.uicompose.ui.tpl.XPNTypography;
import com.nytimes.android.ribbon.composable.ComposableSingletons$XpnModuleKt;
import com.nytimes.android.ribbon.composable.XpnArticleItemKt;
import com.nytimes.android.ribbon.composable.XpnDividersKt;
import com.nytimes.android.ribbon.composable.XpnModuleKt;
import com.nytimes.android.ribbon.et2.Key;
import com.nytimes.android.tpl.TPLSize;
import defpackage.bm6;
import defpackage.cc7;
import defpackage.dh8;
import defpackage.eb5;
import defpackage.em9;
import defpackage.gm9;
import defpackage.gt2;
import defpackage.gt6;
import defpackage.h04;
import defpackage.it2;
import defpackage.k48;
import defpackage.mt2;
import defpackage.qs2;
import defpackage.ss2;
import defpackage.ww8;
import defpackage.zo0;
import defpackage.zq3;
import defpackage.zr0;
import java.util.List;

/* loaded from: classes4.dex */
public abstract class GreatReadsLockupsKt {
    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(final GreatReadsLockupData greatReadsLockupData, final qs2 qs2Var, Modifier modifier, Composer composer, final int i, final int i2) {
        Composer h = composer.h(-2009477479);
        final Modifier modifier2 = (i2 & 4) != 0 ? Modifier.a : modifier;
        if (b.G()) {
            b.S(-2009477479, i, -1, "com.nytimes.android.ribbon.destinations.greatreads.GreatReadsArticleItem (GreatReadsLockups.kt:91)");
        }
        XpnArticleItemKt.a(qs2Var, zr0.b(h, -987209206, true, new it2() { // from class: com.nytimes.android.ribbon.destinations.greatreads.GreatReadsLockupsKt$GreatReadsArticleItem$2
            {
                super(3);
            }

            @Override // defpackage.it2
            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
                invoke((zo0) obj, (Composer) obj2, ((Number) obj3).intValue());
                return ww8.a;
            }

            public final void invoke(zo0 zo0Var, Composer composer2, int i3) {
                zq3.h(zo0Var, "$this$XpnArticleItem");
                if ((i3 & 81) == 16 && composer2.i()) {
                    composer2.K();
                    return;
                }
                if (b.G()) {
                    b.S(-987209206, i3, -1, "com.nytimes.android.ribbon.destinations.greatreads.GreatReadsArticleItem.<anonymous> (GreatReadsLockups.kt:96)");
                }
                TextKt.c(GreatReadsLockupData.this.b(), null, eb5.Companion.b(composer2, 8).g(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, XPNTypography.headline28.getValue(), composer2, 0, 0, 65530);
                if (b.G()) {
                    b.R();
                }
            }
        }), modifier2, zr0.b(h, -459815156, true, new it2() { // from class: com.nytimes.android.ribbon.destinations.greatreads.GreatReadsLockupsKt$GreatReadsArticleItem$3
            {
                super(3);
            }

            @Override // defpackage.it2
            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
                invoke((zo0) obj, (Composer) obj2, ((Number) obj3).intValue());
                return ww8.a;
            }

            public final void invoke(zo0 zo0Var, Composer composer2, int i3) {
                zq3.h(zo0Var, "$this$XpnArticleItem");
                if ((i3 & 81) == 16 && composer2.i()) {
                    composer2.K();
                    return;
                }
                if (b.G()) {
                    b.S(-459815156, i3, -1, "com.nytimes.android.ribbon.destinations.greatreads.GreatReadsArticleItem.<anonymous> (GreatReadsLockups.kt:117)");
                }
                ImageKt.b(em9.a(GreatReadsLockupData.this.e(), null, null, null, null, null, null, null, 0, composer2, 0, 510), null, AspectRatioKt.a(SizeKt.h(Modifier.a, 0.0f, 1, null), 1.0f, true), null, ContentScale.a.a(), 0.0f, null, composer2, 25008, 104);
                if (b.G()) {
                    b.R();
                }
            }
        }), gm9.a(greatReadsLockupData.g() != null, zr0.b(h, 1512763231, true, new it2() { // from class: com.nytimes.android.ribbon.destinations.greatreads.GreatReadsLockupsKt$GreatReadsArticleItem$1
            {
                super(3);
            }

            @Override // defpackage.it2
            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
                invoke((zo0) obj, (Composer) obj2, ((Number) obj3).intValue());
                return ww8.a;
            }

            public final void invoke(zo0 zo0Var, Composer composer2, int i3) {
                int i4;
                zq3.h(zo0Var, "$this$showScopedComposableOrNull");
                if ((i3 & 14) == 0) {
                    i4 = i3 | (composer2.S(zo0Var) ? 4 : 2);
                } else {
                    i4 = i3;
                }
                if ((i4 & 91) == 18 && composer2.i()) {
                    composer2.K();
                    return;
                }
                if (b.G()) {
                    b.S(1512763231, i4, -1, "com.nytimes.android.ribbon.destinations.greatreads.GreatReadsArticleItem.<anonymous> (GreatReadsLockups.kt:129)");
                }
                String g = GreatReadsLockupData.this.g();
                zq3.e(g);
                TextKt.c(g, zo0Var.c(SizeKt.h(Modifier.a, 0.0f, 1, null), Alignment.a.j()), eb5.Companion.b(composer2, 8).j(), 0L, null, null, null, 0L, null, dh8.h(dh8.b.b()), 0L, 0, false, 0, 0, null, XPNTypography.credit.getValue(), composer2, 0, 0, 65016);
                if (b.G()) {
                    b.R();
                }
            }
        })), null, zr0.b(h, 331275919, true, new it2() { // from class: com.nytimes.android.ribbon.destinations.greatreads.GreatReadsLockupsKt$GreatReadsArticleItem$4
            {
                super(3);
            }

            @Override // defpackage.it2
            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
                invoke((zo0) obj, (Composer) obj2, ((Number) obj3).intValue());
                return ww8.a;
            }

            public final void invoke(zo0 zo0Var, Composer composer2, int i3) {
                zq3.h(zo0Var, "$this$XpnArticleItem");
                if ((i3 & 81) == 16 && composer2.i()) {
                    composer2.K();
                    return;
                }
                if (b.G()) {
                    b.S(331275919, i3, -1, "com.nytimes.android.ribbon.destinations.greatreads.GreatReadsArticleItem.<anonymous> (GreatReadsLockups.kt:103)");
                }
                String h2 = GreatReadsLockupData.this.h();
                if (h2 == null) {
                    h2 = "";
                }
                TextKt.c(h2, null, eb5.Companion.b(composer2, 8).i(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, TPLTypography.body16.getValue(), composer2, 0, 0, 65530);
                if (b.G()) {
                    b.R();
                }
            }
        }), zr0.b(h, 594972944, true, new it2() { // from class: com.nytimes.android.ribbon.destinations.greatreads.GreatReadsLockupsKt$GreatReadsArticleItem$5
            {
                super(3);
            }

            @Override // defpackage.it2
            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
                invoke((zo0) obj, (Composer) obj2, ((Number) obj3).intValue());
                return ww8.a;
            }

            public final void invoke(zo0 zo0Var, Composer composer2, int i3) {
                zq3.h(zo0Var, "$this$XpnArticleItem");
                if ((i3 & 81) == 16 && composer2.i()) {
                    composer2.K();
                    return;
                }
                if (b.G()) {
                    b.S(594972944, i3, -1, "com.nytimes.android.ribbon.destinations.greatreads.GreatReadsArticleItem.<anonymous> (GreatReadsLockups.kt:110)");
                }
                TextKt.c(GreatReadsLockupData.this.f() + " " + k48.b(bm6.great_reads_min_read, composer2, 0), null, eb5.Companion.b(composer2, 8).j(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, TPLTypography.labelRegular.getValue(), composer2, 0, 0, 65530);
                if (b.G()) {
                    b.R();
                }
            }
        }), null, null, h, ((i >> 3) & 14) | 14158896 | (i & 896), 800);
        if (b.G()) {
            b.R();
        }
        cc7 k = h.k();
        if (k != null) {
            k.a(new gt2() { // from class: com.nytimes.android.ribbon.destinations.greatreads.GreatReadsLockupsKt$GreatReadsArticleItem$6
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                @Override // defpackage.gt2
                public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                    invoke((Composer) obj, ((Number) obj2).intValue());
                    return ww8.a;
                }

                public final void invoke(Composer composer2, int i3) {
                    GreatReadsLockupsKt.a(GreatReadsLockupData.this, qs2Var, modifier2, composer2, gt6.a(i | 1), i2);
                }
            });
        }
    }

    public static final void c(LazyListScope lazyListScope, LazyListState lazyListState, List list, qs2 qs2Var, final gt2 gt2Var, it2 it2Var) {
        zq3.h(lazyListScope, "<this>");
        zq3.h(lazyListState, "listState");
        zq3.h(list, "greatReadsArticles");
        zq3.h(qs2Var, "isCurrentPage");
        zq3.h(gt2Var, "onClick");
        zq3.h(it2Var, "onView");
        ComposableSingletons$GreatReadsLockupsKt composableSingletons$GreatReadsLockupsKt = ComposableSingletons$GreatReadsLockupsKt.a;
        XpnModuleKt.c(lazyListScope, list, (r25 & 2) != 0 ? null : composableSingletons$GreatReadsLockupsKt.a(), (r25 & 4) != 0 ? ComposableSingletons$XpnModuleKt.a.a() : composableSingletons$GreatReadsLockupsKt.b(), (r25 & 8) != 0 ? false : true, (r25 & 16) != 0 ? false : false, (r25 & 32) != 0 ? TPLSize.spacing3.m765getValueD9Ej5fM() : 0.0f, new gt2() { // from class: com.nytimes.android.ribbon.destinations.greatreads.GreatReadsLockupsKt$greatReadsArticles$1
            public final Key b(int i, GreatReadsLockupData greatReadsLockupData) {
                zq3.h(greatReadsLockupData, "item");
                return new Key(i + " " + greatReadsLockupData.d());
            }

            @Override // defpackage.gt2
            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                return b(((Number) obj).intValue(), (GreatReadsLockupData) obj2);
            }
        }, it2Var, lazyListState, qs2Var, zr0.c(1514450804, true, new mt2() { // from class: com.nytimes.android.ribbon.destinations.greatreads.GreatReadsLockupsKt$greatReadsArticles$2
            {
                super(5);
            }

            public final void b(h04 h04Var, final int i, final GreatReadsLockupData greatReadsLockupData, Composer composer, int i2) {
                zq3.h(h04Var, "$this$xpnListModule");
                zq3.h(greatReadsLockupData, "listItem");
                if (b.G()) {
                    b.S(1514450804, i2, -1, "com.nytimes.android.ribbon.destinations.greatreads.greatReadsArticles.<anonymous> (GreatReadsLockups.kt:79)");
                }
                final gt2 gt2Var2 = gt2.this;
                GreatReadsLockupsKt.a(greatReadsLockupData, new qs2() { // from class: com.nytimes.android.ribbon.destinations.greatreads.GreatReadsLockupsKt$greatReadsArticles$2.1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(0);
                    }

                    @Override // defpackage.qs2
                    /* renamed from: invoke */
                    public /* bridge */ /* synthetic */ Object mo865invoke() {
                        m705invoke();
                        return ww8.a;
                    }

                    /* renamed from: invoke, reason: collision with other method in class */
                    public final void m705invoke() {
                        gt2.this.invoke(Integer.valueOf(i), greatReadsLockupData);
                    }
                }, null, composer, 8, 4);
                if (b.G()) {
                    b.R();
                }
            }

            @Override // defpackage.mt2
            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
                b((h04) obj, ((Number) obj2).intValue(), (GreatReadsLockupData) obj3, (Composer) obj4, ((Number) obj5).intValue());
                return ww8.a;
            }
        }));
    }

    public static final void d(LazyListScope lazyListScope, LazyListState lazyListState, qs2 qs2Var, ss2 ss2Var, final qs2 qs2Var2) {
        zq3.h(lazyListScope, "<this>");
        zq3.h(lazyListState, "listState");
        zq3.h(qs2Var, "isCurrentPage");
        zq3.h(ss2Var, "onView");
        zq3.h(qs2Var2, "onClick");
        XpnModuleKt.e(lazyListScope, (r17 & 1) != 0 ? null : null, (r17 & 2) != 0 ? TPLSize.spacing3.m765getValueD9Ej5fM() : 0.0f, new Key("view more great reads"), ss2Var, lazyListState, qs2Var, zr0.c(1158669405, true, new it2() { // from class: com.nytimes.android.ribbon.destinations.greatreads.GreatReadsLockupsKt$viewMore$1
            {
                super(3);
            }

            @Override // defpackage.it2
            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
                invoke((h04) obj, (Composer) obj2, ((Number) obj3).intValue());
                return ww8.a;
            }

            public final void invoke(h04 h04Var, Composer composer, int i) {
                zq3.h(h04Var, "$this$xpnModule");
                if ((i & 81) == 16 && composer.i()) {
                    composer.K();
                    return;
                }
                if (b.G()) {
                    b.S(1158669405, i, -1, "com.nytimes.android.ribbon.destinations.greatreads.viewMore.<anonymous> (GreatReadsLockups.kt:154)");
                }
                Modifier.a aVar = Modifier.a;
                SpacerKt.a(SizeKt.n(aVar, TPLSize.spacing1_5.m765getValueD9Ej5fM()), composer, 0);
                String b = k48.b(bm6.great_reads_view_more_footer, composer, 0);
                composer.z(-1808885027);
                boolean S = composer.S(qs2.this);
                final qs2 qs2Var3 = qs2.this;
                Object A = composer.A();
                if (S || A == Composer.a.a()) {
                    A = new qs2() { // from class: com.nytimes.android.ribbon.destinations.greatreads.GreatReadsLockupsKt$viewMore$1$1$1
                        {
                            super(0);
                        }

                        @Override // defpackage.qs2
                        /* renamed from: invoke */
                        public /* bridge */ /* synthetic */ Object mo865invoke() {
                            m706invoke();
                            return ww8.a;
                        }

                        /* renamed from: invoke, reason: collision with other method in class */
                        public final void m706invoke() {
                            qs2.this.mo865invoke();
                        }
                    };
                    composer.q(A);
                }
                composer.R();
                XpnDividersKt.b(b, ClickableKt.e(aVar, false, null, null, (qs2) A, 7, null), true, false, null, composer, 384, 24);
                SpacerKt.a(SizeKt.n(aVar, TPLSize.spacing1.m765getValueD9Ej5fM()), composer, 0);
                if (b.G()) {
                    b.R();
                }
            }
        }));
    }
}
