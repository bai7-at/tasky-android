package com.nytimes.android.ribbon.destinations.cooking;

import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.foundation.layout.d;
import androidx.compose.foundation.lazy.LazyListScope;
import androidx.compose.foundation.lazy.LazyListState;
import androidx.compose.material.TextKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.b;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.LayoutKt;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.text.j;
import com.amazonaws.mobileconnectors.s3.transferutility.TransferTable;
import com.comscore.streaming.ContentType;
import com.nytimes.android.designsystem.uicompose.ui.tpl.XPNTypography;
import com.nytimes.android.ribbon.composable.ComposableSingletons$XpnModuleKt;
import com.nytimes.android.ribbon.composable.XpnCarouselKt;
import com.nytimes.android.ribbon.composable.XpnHandoffKt;
import com.nytimes.android.ribbon.composable.XpnModuleKt;
import com.nytimes.android.ribbon.composable.b;
import com.nytimes.android.ribbon.et2.Key;
import com.nytimes.android.tpl.TPLSize;
import defpackage.ap0;
import defpackage.bu1;
import defpackage.cc7;
import defpackage.cs0;
import defpackage.et0;
import defpackage.gt2;
import defpackage.gt6;
import defpackage.h04;
import defpackage.it2;
import defpackage.ju7;
import defpackage.kt2;
import defpackage.mt2;
import defpackage.qs2;
import defpackage.rg4;
import defpackage.ss2;
import defpackage.sy4;
import defpackage.ww8;
import defpackage.xe6;
import defpackage.zq3;
import defpackage.zr0;
import java.util.List;

/* loaded from: classes4.dex */
public abstract class CookingComponentsKt {
    /* JADX WARN: Removed duplicated region for block: B:18:0x01f4  */
    /* JADX WARN: Removed duplicated region for block: B:21:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x007c  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0086  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00c7  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00d3  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0133  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0171  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0190  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x01ea  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0173  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0135  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x00d7  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x007f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void a(final com.nytimes.android.ribbon.destinations.cooking.ProgrammedArticleData r19, final defpackage.qs2 r20, androidx.compose.ui.Modifier r21, androidx.compose.runtime.Composer r22, final int r23, final int r24) {
        /*
            Method dump skipped, instructions count: 519
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.nytimes.android.ribbon.destinations.cooking.CookingComponentsKt.a(com.nytimes.android.ribbon.destinations.cooking.ProgrammedArticleData, qs2, androidx.compose.ui.Modifier, androidx.compose.runtime.Composer, int, int):void");
    }

    public static final void b(final List list, final qs2 qs2Var, Modifier modifier, Composer composer, final int i, final int i2) {
        zq3.h(list, "recipes");
        zq3.h(qs2Var, "onClick");
        Composer h = composer.h(321036147);
        if ((i2 & 4) != 0) {
            modifier = Modifier.a;
        }
        if (b.G()) {
            b.S(321036147, i, -1, "com.nytimes.android.ribbon.destinations.cooking.CookingCarousel (CookingComponents.kt:386)");
        }
        XpnCarouselKt.a(new ss2() { // from class: com.nytimes.android.ribbon.destinations.cooking.CookingComponentsKt$CookingCarousel$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // defpackage.ss2
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke((LazyListScope) obj);
                return ww8.a;
            }

            public final void invoke(LazyListScope lazyListScope) {
                zq3.h(lazyListScope, "$this$XpnCarousel");
                final List<RecipeCardData> list2 = list;
                final AnonymousClass1 anonymousClass1 = new gt2() { // from class: com.nytimes.android.ribbon.destinations.cooking.CookingComponentsKt$CookingCarousel$1.1
                    public final Object b(int i3, RecipeCardData recipeCardData) {
                        zq3.h(recipeCardData, "item");
                        String b = recipeCardData.b();
                        zq3.e(b);
                        return b;
                    }

                    @Override // defpackage.gt2
                    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                        return b(((Number) obj).intValue(), (RecipeCardData) obj2);
                    }
                };
                final qs2 qs2Var2 = qs2Var;
                lazyListScope.b(list2.size(), anonymousClass1 != null ? new ss2() { // from class: com.nytimes.android.ribbon.destinations.cooking.CookingComponentsKt$CookingCarousel$1$invoke$$inlined$itemsIndexed$default$1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(1);
                    }

                    @Override // defpackage.ss2
                    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                        return invoke(((Number) obj).intValue());
                    }

                    public final Object invoke(int i3) {
                        return gt2.this.invoke(Integer.valueOf(i3), list2.get(i3));
                    }
                } : null, new ss2() { // from class: com.nytimes.android.ribbon.destinations.cooking.CookingComponentsKt$CookingCarousel$1$invoke$$inlined$itemsIndexed$default$2
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(1);
                    }

                    @Override // defpackage.ss2
                    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                        return invoke(((Number) obj).intValue());
                    }

                    public final Object invoke(int i3) {
                        list2.get(i3);
                        return null;
                    }
                }, zr0.c(-1091073711, true, new kt2() { // from class: com.nytimes.android.ribbon.destinations.cooking.CookingComponentsKt$CookingCarousel$1$invoke$$inlined$itemsIndexed$default$3
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(4);
                    }

                    @Override // defpackage.kt2
                    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
                        invoke((h04) obj, ((Number) obj2).intValue(), (Composer) obj3, ((Number) obj4).intValue());
                        return ww8.a;
                    }

                    public final void invoke(h04 h04Var, int i3, Composer composer2, int i4) {
                        int i5;
                        if ((i4 & 14) == 0) {
                            i5 = (composer2.S(h04Var) ? 4 : 2) | i4;
                        } else {
                            i5 = i4;
                        }
                        if ((i4 & ContentType.LONG_FORM_ON_DEMAND) == 0) {
                            i5 |= composer2.d(i3) ? 32 : 16;
                        }
                        if ((i5 & 731) == 146 && composer2.i()) {
                            composer2.K();
                            return;
                        }
                        if (b.G()) {
                            b.S(-1091073711, i5, -1, "androidx.compose.foundation.lazy.itemsIndexed.<anonymous> (LazyDsl.kt:183)");
                        }
                        CookingComponentsKt.i((RecipeCardData) list2.get(i3), qs2Var2, SizeKt.s(SizeKt.i(Modifier.a, bu1.g(445)), bu1.g(266)), composer2, 384, 0);
                        if (b.G()) {
                            b.R();
                        }
                    }
                }));
            }
        }, PaddingKt.m(SizeKt.w(modifier, null, false, 3, null), 0.0f, TPLSize.spacing1.m765getValueD9Ej5fM(), 0.0f, 0.0f, 13, null), null, null, null, h, 0, 28);
        if (b.G()) {
            b.R();
        }
        cc7 k = h.k();
        if (k != null) {
            final Modifier modifier2 = modifier;
            k.a(new gt2() { // from class: com.nytimes.android.ribbon.destinations.cooking.CookingComponentsKt$CookingCarousel$2
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
                    CookingComponentsKt.b(list, qs2Var, modifier2, composer2, gt6.a(i | 1), i2);
                }
            });
        }
    }

    public static final void c(final qs2 qs2Var, final Modifier modifier, Composer composer, final int i, final int i2) {
        int i3;
        zq3.h(qs2Var, "onClick");
        Composer h = composer.h(328050577);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 14) == 0) {
            i3 = (h.C(qs2Var) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        int i4 = i2 & 2;
        if (i4 != 0) {
            i3 |= 48;
        } else if ((i & ContentType.LONG_FORM_ON_DEMAND) == 0) {
            i3 |= h.S(modifier) ? 32 : 16;
        }
        if ((i3 & 91) == 18 && h.i()) {
            h.K();
        } else {
            if (i4 != 0) {
                modifier = Modifier.a;
            }
            if (b.G()) {
                b.S(328050577, i3, -1, "com.nytimes.android.ribbon.destinations.cooking.CookingHandoff (CookingComponents.kt:412)");
            }
            int i5 = i3 << 12;
            XpnHandoffKt.d("Search all recipes and organize your favorites.", "Cooking and All Access subscribers enjoy full access.", xe6.ic_cooking_logo, "Go to the Cooking app", qs2Var, modifier, h, (57344 & i5) | 3126 | (i5 & 458752), 0);
            if (b.G()) {
                b.R();
            }
        }
        cc7 k = h.k();
        if (k != null) {
            k.a(new gt2() { // from class: com.nytimes.android.ribbon.destinations.cooking.CookingComponentsKt$CookingHandoff$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                @Override // defpackage.gt2
                public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                    invoke((Composer) obj, ((Number) obj2).intValue());
                    return ww8.a;
                }

                public final void invoke(Composer composer2, int i6) {
                    CookingComponentsKt.c(qs2.this, modifier, composer2, gt6.a(i | 1), i2);
                }
            });
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0051  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0191  */
    /* JADX WARN: Removed duplicated region for block: B:22:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:24:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0088  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0096  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00af  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00c8  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00e2  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00ea  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0110  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x012d  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0134  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0188  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0112  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x00e7  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x00ca  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x00b1  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0098  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0080  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0055  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void d(final com.nytimes.android.ribbon.destinations.cooking.CookingHeroData r23, androidx.compose.ui.Modifier r24, final defpackage.qs2 r25, androidx.compose.runtime.Composer r26, final int r27, final int r28) {
        /*
            Method dump skipped, instructions count: 421
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.nytimes.android.ribbon.destinations.cooking.CookingComponentsKt.d(com.nytimes.android.ribbon.destinations.cooking.CookingHeroData, androidx.compose.ui.Modifier, qs2, androidx.compose.runtime.Composer, int, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0333  */
    /* JADX WARN: Removed duplicated region for block: B:21:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x007d  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0088  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00be  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x011e  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x012a  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x019c  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x01ef  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x01fb  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0328  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x01ff  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x012e  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0081  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void e(final java.lang.String r32, final defpackage.qs2 r33, androidx.compose.ui.Modifier r34, androidx.compose.runtime.Composer r35, final int r36, final int r37) {
        /*
            Method dump skipped, instructions count: 837
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.nytimes.android.ribbon.destinations.cooking.CookingComponentsKt.e(java.lang.String, qs2, androidx.compose.ui.Modifier, androidx.compose.runtime.Composer, int, int):void");
    }

    private static final float f(sy4 sy4Var) {
        return ((bu1) sy4Var.getValue()).n();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void g(sy4 sy4Var, float f) {
        sy4Var.setValue(bu1.d(f));
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x01e5  */
    /* JADX WARN: Removed duplicated region for block: B:21:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x006c  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0077  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00b8  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00c4  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0122  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x01db  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x01c5  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00c8  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0070  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void h(final int r30, final int r31, androidx.compose.ui.Modifier r32, androidx.compose.runtime.Composer r33, final int r34, final int r35) {
        /*
            Method dump skipped, instructions count: 504
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.nytimes.android.ribbon.destinations.cooking.CookingComponentsKt.h(int, int, androidx.compose.ui.Modifier, androidx.compose.runtime.Composer, int, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0147  */
    /* JADX WARN: Removed duplicated region for block: B:21:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0079  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0086  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0094  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00ad  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00d8  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00f5  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x013e  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00da  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x00b2  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0096  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x007e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void i(final com.nytimes.android.ribbon.destinations.cooking.RecipeCardData r18, final defpackage.qs2 r19, androidx.compose.ui.Modifier r20, androidx.compose.runtime.Composer r21, final int r22, final int r23) {
        /*
            Method dump skipped, instructions count: 347
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.nytimes.android.ribbon.destinations.cooking.CookingComponentsKt.i(com.nytimes.android.ribbon.destinations.cooking.RecipeCardData, qs2, androidx.compose.ui.Modifier, androidx.compose.runtime.Composer, int, int):void");
    }

    public static final void k(LazyListScope lazyListScope, gt2 gt2Var, List list, final String str, qs2 qs2Var, gt2 gt2Var2, final gt2 gt2Var3, it2 it2Var) {
        zq3.h(lazyListScope, "<this>");
        zq3.h(gt2Var, "listState");
        zq3.h(list, "recipes");
        zq3.h(str, "moduleName");
        zq3.h(qs2Var, "isCurrentPage");
        zq3.h(gt2Var2, TransferTable.COLUMN_KEY);
        zq3.h(gt2Var3, "onClick");
        zq3.h(it2Var, "onViewCarousel");
        XpnModuleKt.a(lazyListScope, list, (r25 & 2) != 0 ? null : zr0.c(-1402671694, true, new it2() { // from class: com.nytimes.android.ribbon.destinations.cooking.CookingComponentsKt$carouselModules$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(3);
            }

            @Override // defpackage.it2
            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
                invoke((h04) obj, (Composer) obj2, ((Number) obj3).intValue());
                return ww8.a;
            }

            public final void invoke(h04 h04Var, Composer composer, int i) {
                zq3.h(h04Var, "$this$xpnCarouselModule");
                if ((i & 81) == 16 && composer.i()) {
                    composer.K();
                    return;
                }
                if (b.G()) {
                    b.S(-1402671694, i, -1, "com.nytimes.android.ribbon.destinations.cooking.carouselModules.<anonymous> (CookingComponents.kt:124)");
                }
                String str2 = str;
                composer.z(-483455358);
                Modifier.a aVar = Modifier.a;
                rg4 a = d.a(Arrangement.a.g(), Alignment.a.k(), composer, 0);
                composer.z(-1323940314);
                int a2 = cs0.a(composer, 0);
                et0 o = composer.o();
                ComposeUiNode.Companion companion = ComposeUiNode.F;
                qs2 a3 = companion.a();
                it2 c = LayoutKt.c(aVar);
                if (composer.j() == null) {
                    cs0.c();
                }
                composer.G();
                if (composer.f()) {
                    composer.D(a3);
                } else {
                    composer.p();
                }
                Composer a4 = Updater.a(composer);
                Updater.c(a4, a, companion.e());
                Updater.c(a4, o, companion.g());
                gt2 b = companion.b();
                if (a4.f() || !zq3.c(a4.A(), Integer.valueOf(a2))) {
                    a4.q(Integer.valueOf(a2));
                    a4.v(Integer.valueOf(a2), b);
                }
                c.invoke(ju7.a(ju7.b(composer)), composer, 0);
                composer.z(2058660585);
                ap0 ap0Var = ap0.a;
                j value = XPNTypography.headline28.getValue();
                b.a aVar2 = com.nytimes.android.ribbon.composable.b.Companion;
                TextKt.c(str2, PaddingKt.m(aVar, aVar2.a().d(), 0.0f, aVar2.a().c(), 0.0f, 10, null), 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, value, composer, 48, 0, 65532);
                SpacerKt.a(SizeKt.n(aVar, TPLSize.spacing1_5.m765getValueD9Ej5fM()), composer, 0);
                composer.R();
                composer.t();
                composer.R();
                composer.R();
                if (androidx.compose.runtime.b.G()) {
                    androidx.compose.runtime.b.R();
                }
            }
        }), (r25 & 4) != 0 ? ComposableSingletons$XpnModuleKt.a.b() : ComposableSingletons$CookingComponentsKt.a.f(), (r25 & 8) != 0 ? false : true, (r25 & 16) != 0 ? TPLSize.spacing3.m765getValueD9Ej5fM() : 0.0f, (r25 & 32) != 0 ? Arrangement.a.n(bu1.g(20)) : null, qs2Var, gt2Var2, it2Var, gt2Var, zr0.c(-1043069297, true, new mt2() { // from class: com.nytimes.android.ribbon.destinations.cooking.CookingComponentsKt$carouselModules$2
            {
                super(5);
            }

            public final void b(h04 h04Var, final int i, final RecipeCardData recipeCardData, Composer composer, int i2) {
                int i3;
                zq3.h(h04Var, "$this$xpnCarouselModule");
                zq3.h(recipeCardData, "item");
                if ((i2 & ContentType.LONG_FORM_ON_DEMAND) == 0) {
                    i3 = (composer.d(i) ? 32 : 16) | i2;
                } else {
                    i3 = i2;
                }
                if ((i2 & 896) == 0) {
                    i3 |= composer.S(recipeCardData) ? 256 : 128;
                }
                if ((i3 & 5841) == 1168 && composer.i()) {
                    composer.K();
                    return;
                }
                if (androidx.compose.runtime.b.G()) {
                    androidx.compose.runtime.b.S(-1043069297, i3, -1, "com.nytimes.android.ribbon.destinations.cooking.carouselModules.<anonymous> (CookingComponents.kt:141)");
                }
                Modifier s = SizeKt.s(SizeKt.i(Modifier.a, bu1.g(445)), bu1.g(266));
                composer.z(-187719269);
                boolean S = composer.S(gt2.this) | ((i3 & ContentType.LONG_FORM_ON_DEMAND) == 32) | ((i3 & 896) == 256);
                final gt2 gt2Var4 = gt2.this;
                Object A = composer.A();
                if (S || A == Composer.a.a()) {
                    A = new qs2() { // from class: com.nytimes.android.ribbon.destinations.cooking.CookingComponentsKt$carouselModules$2$1$1
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(0);
                        }

                        @Override // defpackage.qs2
                        /* renamed from: invoke */
                        public /* bridge */ /* synthetic */ Object mo865invoke() {
                            m681invoke();
                            return ww8.a;
                        }

                        /* renamed from: invoke, reason: collision with other method in class */
                        public final void m681invoke() {
                            gt2.this.invoke(Integer.valueOf(i), recipeCardData);
                        }
                    };
                    composer.q(A);
                }
                composer.R();
                CookingComponentsKt.i(recipeCardData, (qs2) A, s, composer, ((i3 >> 6) & 14) | 384, 0);
                if (androidx.compose.runtime.b.G()) {
                    androidx.compose.runtime.b.R();
                }
            }

            @Override // defpackage.mt2
            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
                b((h04) obj, ((Number) obj2).intValue(), (RecipeCardData) obj3, (Composer) obj4, ((Number) obj5).intValue());
                return ww8.a;
            }
        }));
    }

    public static final void m(LazyListScope lazyListScope, LazyListState lazyListState, final CookingHeroData cookingHeroData, qs2 qs2Var, final qs2 qs2Var2, final ss2 ss2Var) {
        zq3.h(lazyListScope, "<this>");
        zq3.h(lazyListState, "listState");
        zq3.h(cookingHeroData, "viewState");
        zq3.h(qs2Var, "isCurrentPage");
        zq3.h(qs2Var2, "onClick");
        zq3.h(ss2Var, "onView");
        XpnModuleKt.e(lazyListScope, (r17 & 1) != 0 ? null : null, (r17 & 2) != 0 ? TPLSize.spacing3.m765getValueD9Ej5fM() : 0.0f, new Key(cookingHeroData.j()), new ss2() { // from class: com.nytimes.android.ribbon.destinations.cooking.CookingComponentsKt$cookingHero$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            public final void b(Key key) {
                zq3.h(key, "it");
                ss2.this.invoke(cookingHeroData);
            }

            @Override // defpackage.ss2
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                b((Key) obj);
                return ww8.a;
            }
        }, lazyListState, qs2Var, zr0.c(1517835414, true, new it2() { // from class: com.nytimes.android.ribbon.destinations.cooking.CookingComponentsKt$cookingHero$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
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
                if (androidx.compose.runtime.b.G()) {
                    androidx.compose.runtime.b.S(1517835414, i, -1, "com.nytimes.android.ribbon.destinations.cooking.cookingHero.<anonymous> (CookingComponents.kt:68)");
                }
                CookingHeroData cookingHeroData2 = CookingHeroData.this;
                composer.z(579052260);
                boolean S = composer.S(qs2Var2);
                final qs2 qs2Var3 = qs2Var2;
                Object A = composer.A();
                if (S || A == Composer.a.a()) {
                    A = new qs2() { // from class: com.nytimes.android.ribbon.destinations.cooking.CookingComponentsKt$cookingHero$2$1$1
                        {
                            super(0);
                        }

                        @Override // defpackage.qs2
                        /* renamed from: invoke */
                        public /* bridge */ /* synthetic */ Object mo865invoke() {
                            m682invoke();
                            return ww8.a;
                        }

                        /* renamed from: invoke, reason: collision with other method in class */
                        public final void m682invoke() {
                            qs2.this.mo865invoke();
                        }
                    };
                    composer.q(A);
                }
                composer.R();
                CookingComponentsKt.d(cookingHeroData2, null, (qs2) A, composer, 0, 2);
                if (androidx.compose.runtime.b.G()) {
                    androidx.compose.runtime.b.R();
                }
            }
        }));
    }

    public static final void n(LazyListScope lazyListScope, LazyListState lazyListState, final ProgrammedArticleData programmedArticleData, qs2 qs2Var, final qs2 qs2Var2, final ss2 ss2Var) {
        zq3.h(lazyListScope, "<this>");
        zq3.h(lazyListState, "listState");
        zq3.h(qs2Var, "isCurrentPage");
        zq3.h(qs2Var2, "onClick");
        zq3.h(ss2Var, "onView");
        if (programmedArticleData != null) {
            XpnModuleKt.e(lazyListScope, (r17 & 1) != 0 ? null : ComposableSingletons$CookingComponentsKt.a.a(), (r17 & 2) != 0 ? TPLSize.spacing3.m765getValueD9Ej5fM() : 0.0f, new Key(programmedArticleData.g()), new ss2() { // from class: com.nytimes.android.ribbon.destinations.cooking.CookingComponentsKt$cookingProgrammedArticle$1$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(1);
                }

                public final void b(Key key) {
                    zq3.h(key, "it");
                    ss2.this.invoke(programmedArticleData);
                }

                @Override // defpackage.ss2
                public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                    b((Key) obj);
                    return ww8.a;
                }
            }, lazyListState, qs2Var, zr0.c(442262975, true, new it2() { // from class: com.nytimes.android.ribbon.destinations.cooking.CookingComponentsKt$cookingProgrammedArticle$1$2
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
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
                    if (androidx.compose.runtime.b.G()) {
                        androidx.compose.runtime.b.S(442262975, i, -1, "com.nytimes.android.ribbon.destinations.cooking.cookingProgrammedArticle.<anonymous>.<anonymous> (CookingComponents.kt:97)");
                    }
                    ProgrammedArticleData programmedArticleData2 = ProgrammedArticleData.this;
                    composer.z(2018184333);
                    boolean S = composer.S(qs2Var2);
                    final qs2 qs2Var3 = qs2Var2;
                    Object A = composer.A();
                    if (S || A == Composer.a.a()) {
                        A = new qs2() { // from class: com.nytimes.android.ribbon.destinations.cooking.CookingComponentsKt$cookingProgrammedArticle$1$2$1$1
                            {
                                super(0);
                            }

                            @Override // defpackage.qs2
                            /* renamed from: invoke */
                            public /* bridge */ /* synthetic */ Object mo865invoke() {
                                m683invoke();
                                return ww8.a;
                            }

                            /* renamed from: invoke, reason: collision with other method in class */
                            public final void m683invoke() {
                                qs2.this.mo865invoke();
                            }
                        };
                        composer.q(A);
                    }
                    composer.R();
                    CookingComponentsKt.a(programmedArticleData2, (qs2) A, null, composer, 0, 4);
                    if (androidx.compose.runtime.b.G()) {
                        androidx.compose.runtime.b.R();
                    }
                }
            }));
        }
    }

    public static final void o(LazyListScope lazyListScope, LazyListState lazyListState, qs2 qs2Var, ss2 ss2Var, Key key, final qs2 qs2Var2) {
        zq3.h(lazyListScope, "<this>");
        zq3.h(lazyListState, "listState");
        zq3.h(qs2Var, "isCurrentPage");
        zq3.h(ss2Var, "onView");
        zq3.h(key, TransferTable.COLUMN_KEY);
        zq3.h(qs2Var2, "onClick");
        XpnModuleKt.e(lazyListScope, (r17 & 1) != 0 ? null : null, (r17 & 2) != 0 ? TPLSize.spacing3.m765getValueD9Ej5fM() : 0.0f, key, ss2Var, lazyListState, qs2Var, zr0.c(-786031331, true, new it2() { // from class: com.nytimes.android.ribbon.destinations.cooking.CookingComponentsKt$handoffModule$1
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
                if (androidx.compose.runtime.b.G()) {
                    androidx.compose.runtime.b.S(-786031331, i, -1, "com.nytimes.android.ribbon.destinations.cooking.handoffModule.<anonymous> (CookingComponents.kt:184)");
                }
                CookingComponentsKt.c(qs2.this, null, composer, 0, 2);
                if (androidx.compose.runtime.b.G()) {
                    androidx.compose.runtime.b.R();
                }
            }
        }));
    }

    public static final void p(LazyListScope lazyListScope, LazyListState lazyListState, qs2 qs2Var, CookingCarouselModule cookingCarouselModule, ss2 ss2Var, final qs2 qs2Var2) {
        zq3.h(lazyListScope, "<this>");
        zq3.h(lazyListState, "listState");
        zq3.h(qs2Var, "isCurrentPage");
        zq3.h(cookingCarouselModule, "cookingCarouselModule");
        zq3.h(ss2Var, "onView");
        zq3.h(qs2Var2, "onClickCTA");
        XpnModuleKt.e(lazyListScope, (r17 & 1) != 0 ? null : null, (r17 & 2) != 0 ? TPLSize.spacing3.m765getValueD9Ej5fM() : 0.0f, new Key("view all recipes: " + cookingCarouselModule.b()), ss2Var, lazyListState, qs2Var, zr0.c(104450171, true, new it2() { // from class: com.nytimes.android.ribbon.destinations.cooking.CookingComponentsKt$viewAllRecipesCta$1
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
                if (androidx.compose.runtime.b.G()) {
                    androidx.compose.runtime.b.S(104450171, i, -1, "com.nytimes.android.ribbon.destinations.cooking.viewAllRecipesCta.<anonymous> (CookingComponents.kt:164)");
                }
                composer.z(926297026);
                boolean S = composer.S(qs2.this);
                final qs2 qs2Var3 = qs2.this;
                Object A = composer.A();
                if (S || A == Composer.a.a()) {
                    A = new qs2() { // from class: com.nytimes.android.ribbon.destinations.cooking.CookingComponentsKt$viewAllRecipesCta$1$1$1
                        {
                            super(0);
                        }

                        @Override // defpackage.qs2
                        /* renamed from: invoke */
                        public /* bridge */ /* synthetic */ Object mo865invoke() {
                            m684invoke();
                            return ww8.a;
                        }

                        /* renamed from: invoke, reason: collision with other method in class */
                        public final void m684invoke() {
                            qs2.this.mo865invoke();
                        }
                    };
                    composer.q(A);
                }
                composer.R();
                CookingComponentsKt.e("View All Recipes", (qs2) A, null, composer, 6, 4);
                if (androidx.compose.runtime.b.G()) {
                    androidx.compose.runtime.b.R();
                }
            }
        }));
    }
}
