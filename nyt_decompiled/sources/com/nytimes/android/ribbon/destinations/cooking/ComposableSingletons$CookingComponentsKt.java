package com.nytimes.android.ribbon.destinations.cooking;

import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.foundation.layout.d;
import androidx.compose.material.SurfaceKt;
import androidx.compose.material.TextKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.b;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.LayoutKt;
import androidx.compose.ui.node.ComposeUiNode;
import com.comscore.streaming.AdvertisementType;
import com.comscore.streaming.ContentFeedType;
import com.nytimes.android.designsystem.uicompose.ui.tpl.XPNTypography;
import com.nytimes.android.ribbon.composable.XpnDividersKt;
import com.nytimes.android.tpl.TPLSize;
import defpackage.ap0;
import defpackage.cs0;
import defpackage.eb5;
import defpackage.et0;
import defpackage.gt2;
import defpackage.h04;
import defpackage.it2;
import defpackage.ju7;
import defpackage.qs2;
import defpackage.rg4;
import defpackage.ww8;
import defpackage.zo0;
import defpackage.zq3;
import defpackage.zr0;
import kotlin.collections.i;

/* loaded from: classes4.dex */
public final class ComposableSingletons$CookingComponentsKt {
    public static final ComposableSingletons$CookingComponentsKt a = new ComposableSingletons$CookingComponentsKt();
    public static it2 b = zr0.c(1825349509, false, new it2() { // from class: com.nytimes.android.ribbon.destinations.cooking.ComposableSingletons$CookingComponentsKt$lambda-1$1
        @Override // defpackage.it2
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
            invoke((h04) obj, (Composer) obj2, ((Number) obj3).intValue());
            return ww8.a;
        }

        public final void invoke(h04 h04Var, Composer composer, int i2) {
            zq3.h(h04Var, "$this$xpnModule");
            if ((i2 & 81) == 16 && composer.i()) {
                composer.K();
                return;
            }
            if (b.G()) {
                b.S(1825349509, i2, -1, "com.nytimes.android.ribbon.destinations.cooking.ComposableSingletons$CookingComponentsKt.lambda-1.<anonymous> (CookingComponents.kt:88)");
            }
            composer.z(-483455358);
            Modifier.a aVar = Modifier.a;
            rg4 a2 = d.a(Arrangement.a.g(), Alignment.a.k(), composer, 0);
            composer.z(-1323940314);
            int a3 = cs0.a(composer, 0);
            et0 o2 = composer.o();
            ComposeUiNode.Companion companion = ComposeUiNode.F;
            qs2 a4 = companion.a();
            it2 c2 = LayoutKt.c(aVar);
            if (composer.j() == null) {
                cs0.c();
            }
            composer.G();
            if (composer.f()) {
                composer.D(a4);
            } else {
                composer.p();
            }
            Composer a5 = Updater.a(composer);
            Updater.c(a5, a2, companion.e());
            Updater.c(a5, o2, companion.g());
            gt2 b2 = companion.b();
            if (a5.f() || !zq3.c(a5.A(), Integer.valueOf(a3))) {
                a5.q(Integer.valueOf(a3));
                a5.v(Integer.valueOf(a3), b2);
            }
            c2.invoke(ju7.a(ju7.b(composer)), composer, 0);
            composer.z(2058660585);
            ap0 ap0Var = ap0.a;
            XpnDividersKt.a(null, eb5.Companion.b(composer, 8).g(), null, composer, 0, 5);
            SpacerKt.a(SizeKt.n(aVar, TPLSize.spacing1_5.m765getValueD9Ej5fM()), composer, 0);
            composer.R();
            composer.t();
            composer.R();
            composer.R();
            if (b.G()) {
                b.R();
            }
        }
    });
    public static gt2 c = zr0.c(761282516, false, new gt2() { // from class: com.nytimes.android.ribbon.destinations.cooking.ComposableSingletons$CookingComponentsKt$lambda-2$1
        @Override // defpackage.gt2
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            invoke((Composer) obj, ((Number) obj2).intValue());
            return ww8.a;
        }

        public final void invoke(Composer composer, int i2) {
            if ((i2 & 11) == 2 && composer.i()) {
                composer.K();
                return;
            }
            if (b.G()) {
                b.S(761282516, i2, -1, "com.nytimes.android.ribbon.destinations.cooking.ComposableSingletons$CookingComponentsKt.lambda-2.<anonymous> (CookingComponents.kt:119)");
            }
            XpnDividersKt.a(null, eb5.Companion.b(composer, 8).g(), null, composer, 0, 5);
            if (b.G()) {
                b.R();
            }
        }
    });
    public static it2 d = zr0.c(-538480552, false, new it2() { // from class: com.nytimes.android.ribbon.destinations.cooking.ComposableSingletons$CookingComponentsKt$lambda-3$1
        @Override // defpackage.it2
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
            invoke((zo0) obj, (Composer) obj2, ((Number) obj3).intValue());
            return ww8.a;
        }

        public final void invoke(zo0 zo0Var, Composer composer, int i2) {
            zq3.h(zo0Var, "$this$XpnLargeItem");
            if ((i2 & 81) == 16 && composer.i()) {
                composer.K();
                return;
            }
            if (b.G()) {
                b.S(-538480552, i2, -1, "com.nytimes.android.ribbon.destinations.cooking.ComposableSingletons$CookingComponentsKt.lambda-3.<anonymous> (CookingComponents.kt:220)");
            }
            TextKt.c("RECIPE OF THE DAY", PaddingKt.m(Modifier.a, 0.0f, TPLSize.spacing1.m765getValueD9Ej5fM(), 0.0f, 0.0f, 13, null), eb5.Companion.b(composer, 8).g(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, XPNTypography.labelMedium.getValue(), composer, 6, 0, 65528);
            if (b.G()) {
                b.R();
            }
        }
    });
    public static gt2 e = zr0.c(-1620714702, false, new gt2() { // from class: com.nytimes.android.ribbon.destinations.cooking.ComposableSingletons$CookingComponentsKt$lambda-4$1
        @Override // defpackage.gt2
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            invoke((Composer) obj, ((Number) obj2).intValue());
            return ww8.a;
        }

        public final void invoke(Composer composer, int i2) {
            if ((i2 & 11) == 2 && composer.i()) {
                composer.K();
                return;
            }
            if (b.G()) {
                b.S(-1620714702, i2, -1, "com.nytimes.android.ribbon.destinations.cooking.ComposableSingletons$CookingComponentsKt.lambda-4.<anonymous> (CookingComponents.kt:313)");
            }
            CookingComponentsKt.h(3, 5, null, composer, 54, 4);
            if (b.G()) {
                b.R();
            }
        }
    });
    public static gt2 f = zr0.c(-1222425874, false, new gt2() { // from class: com.nytimes.android.ribbon.destinations.cooking.ComposableSingletons$CookingComponentsKt$lambda-5$1
        @Override // defpackage.gt2
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            invoke((Composer) obj, ((Number) obj2).intValue());
            return ww8.a;
        }

        public final void invoke(Composer composer, int i2) {
            if ((i2 & 11) == 2 && composer.i()) {
                composer.K();
                return;
            }
            if (b.G()) {
                b.S(-1222425874, i2, -1, "com.nytimes.android.ribbon.destinations.cooking.ComposableSingletons$CookingComponentsKt.lambda-5.<anonymous> (CookingComponents.kt:312)");
            }
            SurfaceKt.a(null, null, 0L, 0L, null, 0.0f, ComposableSingletons$CookingComponentsKt.a.h(), composer, 1572864, 63);
            if (b.G()) {
                b.R();
            }
        }
    });
    public static gt2 g = zr0.c(467889576, false, new gt2() { // from class: com.nytimes.android.ribbon.destinations.cooking.ComposableSingletons$CookingComponentsKt$lambda-6$1
        @Override // defpackage.gt2
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            invoke((Composer) obj, ((Number) obj2).intValue());
            return ww8.a;
        }

        public final void invoke(Composer composer, int i2) {
            if ((i2 & 11) == 2 && composer.i()) {
                composer.K();
                return;
            }
            if (b.G()) {
                b.S(467889576, i2, -1, "com.nytimes.android.ribbon.destinations.cooking.ComposableSingletons$CookingComponentsKt.lambda-6.<anonymous> (CookingComponents.kt:428)");
            }
            CookingComponentsKt.c(new qs2() { // from class: com.nytimes.android.ribbon.destinations.cooking.ComposableSingletons$CookingComponentsKt$lambda-6$1.1
                /* renamed from: invoke, reason: collision with other method in class */
                public final void m675invoke() {
                }

                @Override // defpackage.qs2
                /* renamed from: invoke */
                public /* bridge */ /* synthetic */ Object mo865invoke() {
                    m675invoke();
                    return ww8.a;
                }
            }, Modifier.a, composer, 54, 0);
            if (b.G()) {
                b.R();
            }
        }
    });
    public static gt2 h = zr0.c(1866210924, false, new gt2() { // from class: com.nytimes.android.ribbon.destinations.cooking.ComposableSingletons$CookingComponentsKt$lambda-7$1
        @Override // defpackage.gt2
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            invoke((Composer) obj, ((Number) obj2).intValue());
            return ww8.a;
        }

        public final void invoke(Composer composer, int i2) {
            if ((i2 & 11) == 2 && composer.i()) {
                composer.K();
                return;
            }
            if (b.G()) {
                b.S(1866210924, i2, -1, "com.nytimes.android.ribbon.destinations.cooking.ComposableSingletons$CookingComponentsKt.lambda-7.<anonymous> (CookingComponents.kt:427)");
            }
            SurfaceKt.a(null, null, 0L, 0L, null, 0.0f, ComposableSingletons$CookingComponentsKt.a.i(), composer, 1572864, 63);
            if (b.G()) {
                b.R();
            }
        }
    });
    public static gt2 i = zr0.c(-1008356424, false, new gt2() { // from class: com.nytimes.android.ribbon.destinations.cooking.ComposableSingletons$CookingComponentsKt$lambda-8$1
        @Override // defpackage.gt2
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            invoke((Composer) obj, ((Number) obj2).intValue());
            return ww8.a;
        }

        public final void invoke(Composer composer, int i2) {
            if ((i2 & 11) == 2 && composer.i()) {
                composer.K();
                return;
            }
            if (b.G()) {
                b.S(-1008356424, i2, -1, "com.nytimes.android.ribbon.destinations.cooking.ComposableSingletons$CookingComponentsKt.lambda-8.<anonymous> (CookingComponents.kt:441)");
            }
            CookingComponentsKt.b(i.o(new RecipeCardData("https://static01.nyt.com/images/2024/03/19/multimedia/yf-baked-fish-with-olives-and-ginger-kwfl/yf-baked-fish-with-olives-and-ginger-kwfl-master768.jpg?w=1280&q=75", "Baked Fish With Olives and Ginger", "Yasmin Fahr", new Rating(461, 4), "https://cooking.nytimes.com/recipes/1025052-baked-fish-with-olives-and-ginger", "10 minutes", "recipe uri"), new RecipeCardData("https://static01.nyt.com/images/2024/04/17/multimedia/15KOrex/12KO1-zjlg-master768.jpg?w=1280&q=75", "Quick Shrimp and Asparagus Stir-Fry", "By Genevieve Ko", new Rating(536, 3), "https://cooking.nytimes.com/recipes/1025275-quick-shrimp-and-asparagus-stir-fry", "10 minutes", "recipe uri"), new RecipeCardData("https://static01.nyt.com/images/2024/04/17/multimedia/15KOrex/12KO1-zjlg-master768.jpg?w=1280&q=75", "Quick Shrimp and Asparagus Stir-Fry", "By Genevieve Ko", new Rating(Integer.valueOf(AdvertisementType.LIVE), 5), "https://cooking.nytimes.com/recipes/1025275-quick-shrimp-and-asparagus-stir-fry", "10 minutes", "recipe uri")), new qs2() { // from class: com.nytimes.android.ribbon.destinations.cooking.ComposableSingletons$CookingComponentsKt$lambda-8$1.1
                /* renamed from: invoke, reason: collision with other method in class */
                public final void m676invoke() {
                }

                @Override // defpackage.qs2
                /* renamed from: invoke */
                public /* bridge */ /* synthetic */ Object mo865invoke() {
                    m676invoke();
                    return ww8.a;
                }
            }, Modifier.a, composer, 432, 0);
            if (b.G()) {
                b.R();
            }
        }
    });
    public static gt2 j = zr0.c(-610067596, false, new gt2() { // from class: com.nytimes.android.ribbon.destinations.cooking.ComposableSingletons$CookingComponentsKt$lambda-9$1
        @Override // defpackage.gt2
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            invoke((Composer) obj, ((Number) obj2).intValue());
            return ww8.a;
        }

        public final void invoke(Composer composer, int i2) {
            if ((i2 & 11) == 2 && composer.i()) {
                composer.K();
                return;
            }
            if (b.G()) {
                b.S(-610067596, i2, -1, "com.nytimes.android.ribbon.destinations.cooking.ComposableSingletons$CookingComponentsKt.lambda-9.<anonymous> (CookingComponents.kt:440)");
            }
            SurfaceKt.a(null, null, 0L, 0L, null, 0.0f, ComposableSingletons$CookingComponentsKt.a.j(), composer, 1572864, 63);
            if (b.G()) {
                b.R();
            }
        }
    });
    public static gt2 k = zr0.c(-1605171824, false, new gt2() { // from class: com.nytimes.android.ribbon.destinations.cooking.ComposableSingletons$CookingComponentsKt$lambda-10$1
        @Override // defpackage.gt2
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            invoke((Composer) obj, ((Number) obj2).intValue());
            return ww8.a;
        }

        public final void invoke(Composer composer, int i2) {
            if ((i2 & 11) == 2 && composer.i()) {
                composer.K();
                return;
            }
            if (b.G()) {
                b.S(-1605171824, i2, -1, "com.nytimes.android.ribbon.destinations.cooking.ComposableSingletons$CookingComponentsKt.lambda-10.<anonymous> (CookingComponents.kt:592)");
            }
            CookingComponentsKt.i(new RecipeCardData("https://static01.nyt.com/images/2024/03/19/multimedia/yf-baked-fish-with-olives-and-ginger-kwfl/yf-baked-fish-with-olives-and-ginger-kwfl-master768.jpg?w=1280&q=75", "Baked Fish With Olives and Ginger", "Yasmin Fahr", new Rating(Integer.valueOf(ContentFeedType.OTHER), 4), "https://cooking.nytimes.com/recipes/1025052-baked-fish-with-olives-and-ginger?algo=identity&fellback=true&imp_id=5542623978095939&req_id=3477788091547091&surface=cooking-search-web&variant=0_relevance_reranking", "20 MIN", "uri"), new qs2() { // from class: com.nytimes.android.ribbon.destinations.cooking.ComposableSingletons$CookingComponentsKt$lambda-10$1.1
                /* renamed from: invoke, reason: collision with other method in class */
                public final void m671invoke() {
                }

                @Override // defpackage.qs2
                /* renamed from: invoke */
                public /* bridge */ /* synthetic */ Object mo865invoke() {
                    m671invoke();
                    return ww8.a;
                }
            }, null, composer, 48, 4);
            if (b.G()) {
                b.R();
            }
        }
    });
    public static gt2 l = zr0.c(-804603820, false, new gt2() { // from class: com.nytimes.android.ribbon.destinations.cooking.ComposableSingletons$CookingComponentsKt$lambda-11$1
        @Override // defpackage.gt2
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            invoke((Composer) obj, ((Number) obj2).intValue());
            return ww8.a;
        }

        public final void invoke(Composer composer, int i2) {
            if ((i2 & 11) == 2 && composer.i()) {
                composer.K();
                return;
            }
            if (b.G()) {
                b.S(-804603820, i2, -1, "com.nytimes.android.ribbon.destinations.cooking.ComposableSingletons$CookingComponentsKt.lambda-11.<anonymous> (CookingComponents.kt:591)");
            }
            SurfaceKt.a(null, null, 0L, 0L, null, 0.0f, ComposableSingletons$CookingComponentsKt.a.b(), composer, 1572864, 63);
            if (b.G()) {
                b.R();
            }
        }
    });
    public static gt2 m = zr0.c(-12830650, false, new gt2() { // from class: com.nytimes.android.ribbon.destinations.cooking.ComposableSingletons$CookingComponentsKt$lambda-12$1
        @Override // defpackage.gt2
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            invoke((Composer) obj, ((Number) obj2).intValue());
            return ww8.a;
        }

        public final void invoke(Composer composer, int i2) {
            if ((i2 & 11) == 2 && composer.i()) {
                composer.K();
                return;
            }
            if (b.G()) {
                b.S(-12830650, i2, -1, "com.nytimes.android.ribbon.destinations.cooking.ComposableSingletons$CookingComponentsKt.lambda-12.<anonymous> (CookingComponents.kt:616)");
            }
            CookingComponentsKt.e("View All Recipes", new qs2() { // from class: com.nytimes.android.ribbon.destinations.cooking.ComposableSingletons$CookingComponentsKt$lambda-12$1.1
                /* renamed from: invoke, reason: collision with other method in class */
                public final void m672invoke() {
                }

                @Override // defpackage.qs2
                /* renamed from: invoke */
                public /* bridge */ /* synthetic */ Object mo865invoke() {
                    m672invoke();
                    return ww8.a;
                }
            }, null, composer, 54, 4);
            if (b.G()) {
                b.R();
            }
        }
    });
    public static gt2 n = zr0.c(-550778870, false, new gt2() { // from class: com.nytimes.android.ribbon.destinations.cooking.ComposableSingletons$CookingComponentsKt$lambda-13$1
        @Override // defpackage.gt2
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            invoke((Composer) obj, ((Number) obj2).intValue());
            return ww8.a;
        }

        public final void invoke(Composer composer, int i2) {
            if ((i2 & 11) == 2 && composer.i()) {
                composer.K();
                return;
            }
            if (b.G()) {
                b.S(-550778870, i2, -1, "com.nytimes.android.ribbon.destinations.cooking.ComposableSingletons$CookingComponentsKt.lambda-13.<anonymous> (CookingComponents.kt:615)");
            }
            SurfaceKt.a(null, null, 0L, 0L, null, 0.0f, ComposableSingletons$CookingComponentsKt.a.c(), composer, 1572864, 63);
            if (b.G()) {
                b.R();
            }
        }
    });
    public static gt2 o = zr0.c(-1540226271, false, new gt2() { // from class: com.nytimes.android.ribbon.destinations.cooking.ComposableSingletons$CookingComponentsKt$lambda-14$1
        @Override // defpackage.gt2
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            invoke((Composer) obj, ((Number) obj2).intValue());
            return ww8.a;
        }

        public final void invoke(Composer composer, int i2) {
            if ((i2 & 11) == 2 && composer.i()) {
                composer.K();
                return;
            }
            if (b.G()) {
                b.S(-1540226271, i2, -1, "com.nytimes.android.ribbon.destinations.cooking.ComposableSingletons$CookingComponentsKt.lambda-14.<anonymous> (CookingComponents.kt:629)");
            }
            CookingComponentsKt.d(new CookingHeroData("https://static01.nyt.com/images/2024/04/11/multimedia/AS-Sheet-Pan-Herby-Roast-Chicken-With-Peas-and-Carrots-lpqh/AS-Sheet-Pan-Herby-Roast-Chicken-With-Peas-and-Carrots-lpqh-master768.jpg?w=1280&q=75", "Christopher Testani for The New York Times. Food Stylist: Cyd Raftus McDowell.", "RECIPE OF THE DAY", "Sheet-Pan Herby Roast Chicken With Peas and Carrots", "A bag of frozen peas and carrots delivers springy flavors all year round in this affordable sheet-pan meal.", "Ali Slagle", new Rating(95, 4), "45 MIN", "https://cooking.nytimes.com/recipes/1024240-vegetable-pulao"), null, new qs2() { // from class: com.nytimes.android.ribbon.destinations.cooking.ComposableSingletons$CookingComponentsKt$lambda-14$1.1
                /* renamed from: invoke, reason: collision with other method in class */
                public final void m673invoke() {
                }

                @Override // defpackage.qs2
                /* renamed from: invoke */
                public /* bridge */ /* synthetic */ Object mo865invoke() {
                    m673invoke();
                    return ww8.a;
                }
            }, composer, 384, 2);
            if (b.G()) {
                b.R();
            }
        }
    });
    public static gt2 p = zr0.c(424155365, false, new gt2() { // from class: com.nytimes.android.ribbon.destinations.cooking.ComposableSingletons$CookingComponentsKt$lambda-15$1
        @Override // defpackage.gt2
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            invoke((Composer) obj, ((Number) obj2).intValue());
            return ww8.a;
        }

        public final void invoke(Composer composer, int i2) {
            if ((i2 & 11) == 2 && composer.i()) {
                composer.K();
                return;
            }
            if (b.G()) {
                b.S(424155365, i2, -1, "com.nytimes.android.ribbon.destinations.cooking.ComposableSingletons$CookingComponentsKt.lambda-15.<anonymous> (CookingComponents.kt:628)");
            }
            SurfaceKt.a(null, null, 0L, 0L, null, 0.0f, ComposableSingletons$CookingComponentsKt.a.d(), composer, 1572864, 63);
            if (b.G()) {
                b.R();
            }
        }
    });
    public static gt2 q = zr0.c(-2029523566, false, new gt2() { // from class: com.nytimes.android.ribbon.destinations.cooking.ComposableSingletons$CookingComponentsKt$lambda-16$1
        @Override // defpackage.gt2
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            invoke((Composer) obj, ((Number) obj2).intValue());
            return ww8.a;
        }

        public final void invoke(Composer composer, int i2) {
            if ((i2 & 11) == 2 && composer.i()) {
                composer.K();
                return;
            }
            if (b.G()) {
                b.S(-2029523566, i2, -1, "com.nytimes.android.ribbon.destinations.cooking.ComposableSingletons$CookingComponentsKt.lambda-16.<anonymous> (CookingComponents.kt:655)");
            }
            CookingComponentsKt.a(new ProgrammedArticleData("THE VEGGIE NEWSLETTER", "100 Easy Recipes for Your Summer Cooking Bucket List", "And because life goes on — even in the summer — most of them can be on the table in 30 minutes or less.", "https://static01.nyt.com/images/2021/12/28/dining/yf-baked-feta-copy/yf-baked-feta-square320.jpg", "Bryan Gardner for The New York Times. Food Stylist: Barrett Washburne.", "Promo", "https://cooking.nytimes.com/68861692-nyt-cooking/115309301-summer-recipes", "uri"), new qs2() { // from class: com.nytimes.android.ribbon.destinations.cooking.ComposableSingletons$CookingComponentsKt$lambda-16$1.1
                /* renamed from: invoke, reason: collision with other method in class */
                public final void m674invoke() {
                }

                @Override // defpackage.qs2
                /* renamed from: invoke */
                public /* bridge */ /* synthetic */ Object mo865invoke() {
                    m674invoke();
                    return ww8.a;
                }
            }, null, composer, 48, 4);
            if (b.G()) {
                b.R();
            }
        }
    });
    public static gt2 r = zr0.c(-631202218, false, new gt2() { // from class: com.nytimes.android.ribbon.destinations.cooking.ComposableSingletons$CookingComponentsKt$lambda-17$1
        @Override // defpackage.gt2
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            invoke((Composer) obj, ((Number) obj2).intValue());
            return ww8.a;
        }

        public final void invoke(Composer composer, int i2) {
            if ((i2 & 11) == 2 && composer.i()) {
                composer.K();
                return;
            }
            if (b.G()) {
                b.S(-631202218, i2, -1, "com.nytimes.android.ribbon.destinations.cooking.ComposableSingletons$CookingComponentsKt.lambda-17.<anonymous> (CookingComponents.kt:654)");
            }
            SurfaceKt.a(null, null, 0L, 0L, null, 0.0f, ComposableSingletons$CookingComponentsKt.a.e(), composer, 1572864, 63);
            if (b.G()) {
                b.R();
            }
        }
    });

    public final it2 a() {
        return b;
    }

    public final gt2 b() {
        return k;
    }

    public final gt2 c() {
        return m;
    }

    public final gt2 d() {
        return o;
    }

    public final gt2 e() {
        return q;
    }

    public final gt2 f() {
        return c;
    }

    public final it2 g() {
        return d;
    }

    public final gt2 h() {
        return e;
    }

    public final gt2 i() {
        return g;
    }

    public final gt2 j() {
        return i;
    }
}
