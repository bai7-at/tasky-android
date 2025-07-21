package com.nytimes.android.ribbon.destinations.games;

import androidx.compose.foundation.ClickableKt;
import androidx.compose.foundation.ImageKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.AspectRatioKt;
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
import androidx.compose.runtime.b0;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.ContentScale;
import androidx.compose.ui.layout.LayoutKt;
import androidx.compose.ui.node.ComposeUiNode;
import com.amazonaws.mobileconnectors.s3.transferutility.TransferTable;
import com.comscore.streaming.ContentType;
import com.nytimes.android.api.cms.Asset;
import com.nytimes.android.api.cms.AssetConstants;
import com.nytimes.android.designsystem.uicompose.ui.tpl.TPLTypography;
import com.nytimes.android.designsystem.uicompose.ui.tpl.XPNTypography;
import com.nytimes.android.ribbon.composable.ComposableSingletons$XpnModuleKt;
import com.nytimes.android.ribbon.composable.XpnArticleItemKt;
import com.nytimes.android.ribbon.composable.XpnDividersKt;
import com.nytimes.android.ribbon.composable.XpnListItemKt;
import com.nytimes.android.ribbon.composable.XpnModuleKt;
import com.nytimes.android.ribbon.et2.Key;
import com.nytimes.android.tpl.TPLSize;
import defpackage.ac0;
import defpackage.ap0;
import defpackage.bm6;
import defpackage.bu1;
import defpackage.cc7;
import defpackage.cs0;
import defpackage.eb5;
import defpackage.em9;
import defpackage.et0;
import defpackage.gm9;
import defpackage.gt2;
import defpackage.gt6;
import defpackage.h04;
import defpackage.it2;
import defpackage.ju7;
import defpackage.k48;
import defpackage.kt2;
import defpackage.mt2;
import defpackage.qs2;
import defpackage.rg4;
import defpackage.ss2;
import defpackage.sy4;
import defpackage.ww8;
import defpackage.zo0;
import defpackage.zq3;
import defpackage.zr0;
import java.util.List;

/* loaded from: classes4.dex */
public abstract class GamesLockupsKt {
    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(final ss2 ss2Var, final GamesLockupData gamesLockupData, Composer composer, final int i) {
        Composer h = composer.h(-807091700);
        if (b.G()) {
            b.S(-807091700, i, -1, "com.nytimes.android.ribbon.destinations.games.GamesFeaturedHero (GamesLockups.kt:323)");
        }
        XpnArticleItemKt.a(new qs2() { // from class: com.nytimes.android.ribbon.destinations.games.GamesLockupsKt$GamesFeaturedHero$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // defpackage.qs2
            /* renamed from: invoke */
            public /* bridge */ /* synthetic */ Object mo865invoke() {
                m697invoke();
                return ww8.a;
            }

            /* renamed from: invoke, reason: collision with other method in class */
            public final void m697invoke() {
                ss2.this.invoke(gamesLockupData.b());
            }
        }, zr0.b(h, -288737027, true, new it2() { // from class: com.nytimes.android.ribbon.destinations.games.GamesLockupsKt$GamesFeaturedHero$2
            {
                super(3);
            }

            @Override // defpackage.it2
            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
                invoke((zo0) obj, (Composer) obj2, ((Number) obj3).intValue());
                return ww8.a;
            }

            public final void invoke(zo0 zo0Var, Composer composer2, int i2) {
                zq3.h(zo0Var, "$this$XpnArticleItem");
                if ((i2 & 81) == 16 && composer2.i()) {
                    composer2.K();
                    return;
                }
                if (b.G()) {
                    b.S(-288737027, i2, -1, "com.nytimes.android.ribbon.destinations.games.GamesFeaturedHero.<anonymous> (GamesLockups.kt:327)");
                }
                TextKt.c(GamesLockupData.this.f(), null, eb5.Companion.b(composer2, 8).g(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, XPNTypography.headline28.getValue(), composer2, 0, 0, 65530);
                if (b.G()) {
                    b.R();
                }
            }
        }), null, zr0.b(h, 1608242431, true, new it2() { // from class: com.nytimes.android.ribbon.destinations.games.GamesLockupsKt$GamesFeaturedHero$3
            {
                super(3);
            }

            @Override // defpackage.it2
            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
                invoke((zo0) obj, (Composer) obj2, ((Number) obj3).intValue());
                return ww8.a;
            }

            public final void invoke(zo0 zo0Var, Composer composer2, int i2) {
                zq3.h(zo0Var, "$this$XpnArticleItem");
                if ((i2 & 81) == 16 && composer2.i()) {
                    composer2.K();
                    return;
                }
                if (b.G()) {
                    b.S(1608242431, i2, -1, "com.nytimes.android.ribbon.destinations.games.GamesFeaturedHero.<anonymous> (GamesLockups.kt:348)");
                }
                ImageKt.b(em9.a(GamesLockupData.this.c(), null, null, null, null, null, null, null, 0, composer2, 0, 510), null, AspectRatioKt.b(SizeKt.h(Modifier.a, 0.0f, 1, null), 1.0f, false, 2, null), null, ContentScale.a.a(), 0.0f, null, composer2, 25008, 104);
                if (b.G()) {
                    b.R();
                }
            }
        }), null, null, zr0.b(h, 158744322, true, new it2() { // from class: com.nytimes.android.ribbon.destinations.games.GamesLockupsKt$GamesFeaturedHero$4
            {
                super(3);
            }

            @Override // defpackage.it2
            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
                invoke((zo0) obj, (Composer) obj2, ((Number) obj3).intValue());
                return ww8.a;
            }

            public final void invoke(zo0 zo0Var, Composer composer2, int i2) {
                zq3.h(zo0Var, "$this$XpnArticleItem");
                if ((i2 & 81) == 16 && composer2.i()) {
                    composer2.K();
                    return;
                }
                if (b.G()) {
                    b.S(158744322, i2, -1, "com.nytimes.android.ribbon.destinations.games.GamesFeaturedHero.<anonymous> (GamesLockups.kt:334)");
                }
                TextKt.c(GamesLockupData.this.d(), null, eb5.Companion.b(composer2, 8).i(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, TPLTypography.body16.getValue(), composer2, 0, 0, 65530);
                if (b.G()) {
                    b.R();
                }
            }
        }), zr0.b(h, 1107234051, true, new it2() { // from class: com.nytimes.android.ribbon.destinations.games.GamesLockupsKt$GamesFeaturedHero$5
            {
                super(3);
            }

            @Override // defpackage.it2
            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
                invoke((zo0) obj, (Composer) obj2, ((Number) obj3).intValue());
                return ww8.a;
            }

            public final void invoke(zo0 zo0Var, Composer composer2, int i2) {
                zq3.h(zo0Var, "$this$XpnArticleItem");
                if ((i2 & 81) == 16 && composer2.i()) {
                    composer2.K();
                    return;
                }
                if (b.G()) {
                    b.S(1107234051, i2, -1, "com.nytimes.android.ribbon.destinations.games.GamesFeaturedHero.<anonymous> (GamesLockups.kt:341)");
                }
                TextKt.c(GamesLockupData.this.e(), null, eb5.Companion.b(composer2, 8).j(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, TPLTypography.labelRegular.getValue(), composer2, 0, 0, 65530);
                if (b.G()) {
                    b.R();
                }
            }
        }), null, null, h, 14158896, 820);
        if (b.G()) {
            b.R();
        }
        cc7 k = h.k();
        if (k != null) {
            k.a(new gt2() { // from class: com.nytimes.android.ribbon.destinations.games.GamesLockupsKt$GamesFeaturedHero$6
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                @Override // defpackage.gt2
                public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                    invoke((Composer) obj, ((Number) obj2).intValue());
                    return ww8.a;
                }

                public final void invoke(Composer composer2, int i2) {
                    GamesLockupsKt.a(ss2.this, gamesLockupData, composer2, gt6.a(i | 1));
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void b(final ss2 ss2Var, final GamesLockupData gamesLockupData, Composer composer, final int i) {
        Composer h = composer.h(1288655727);
        if (b.G()) {
            b.S(1288655727, i, -1, "com.nytimes.android.ribbon.destinations.games.GamesFeaturedSidekick (GamesLockups.kt:293)");
        }
        XpnListItemKt.a(new qs2() { // from class: com.nytimes.android.ribbon.destinations.games.GamesLockupsKt$GamesFeaturedSidekick$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // defpackage.qs2
            /* renamed from: invoke */
            public /* bridge */ /* synthetic */ Object mo865invoke() {
                m698invoke();
                return ww8.a;
            }

            /* renamed from: invoke, reason: collision with other method in class */
            public final void m698invoke() {
                ss2.this.invoke(gamesLockupData.b());
            }
        }, zr0.b(h, 146080314, true, new it2() { // from class: com.nytimes.android.ribbon.destinations.games.GamesLockupsKt$GamesFeaturedSidekick$2
            {
                super(3);
            }

            @Override // defpackage.it2
            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
                invoke((zo0) obj, (Composer) obj2, ((Number) obj3).intValue());
                return ww8.a;
            }

            public final void invoke(zo0 zo0Var, Composer composer2, int i2) {
                zq3.h(zo0Var, "$this$XpnListItem");
                if ((i2 & 81) == 16 && composer2.i()) {
                    composer2.K();
                    return;
                }
                if (b.G()) {
                    b.S(146080314, i2, -1, "com.nytimes.android.ribbon.destinations.games.GamesFeaturedSidekick.<anonymous> (GamesLockups.kt:297)");
                }
                TextKt.c(GamesLockupData.this.f(), null, eb5.Companion.b(composer2, 8).g(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, XPNTypography.headlineFeature20.getValue(), composer2, 0, 0, 65530);
                if (b.G()) {
                    b.R();
                }
            }
        }), null, zr0.b(h, 967947153, true, new it2() { // from class: com.nytimes.android.ribbon.destinations.games.GamesLockupsKt$GamesFeaturedSidekick$3
            {
                super(3);
            }

            public final void b(ac0 ac0Var, Composer composer2, int i2) {
                zq3.h(ac0Var, "$this$XpnListItem");
                if ((i2 & 81) == 16 && composer2.i()) {
                    composer2.K();
                    return;
                }
                if (b.G()) {
                    b.S(967947153, i2, -1, "com.nytimes.android.ribbon.destinations.games.GamesFeaturedSidekick.<anonymous> (GamesLockups.kt:304)");
                }
                ImageKt.b(em9.a(GamesLockupData.this.c(), null, null, null, null, null, null, null, 0, composer2, 0, 510), null, null, null, null, 0.0f, null, composer2, 48, 124);
                if (b.G()) {
                    b.R();
                }
            }

            @Override // defpackage.it2
            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
                b((ac0) obj, (Composer) obj2, ((Number) obj3).intValue());
                return ww8.a;
            }
        }), null, null, null, zr0.b(h, 471510772, true, new it2() { // from class: com.nytimes.android.ribbon.destinations.games.GamesLockupsKt$GamesFeaturedSidekick$4
            {
                super(3);
            }

            @Override // defpackage.it2
            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
                invoke((zo0) obj, (Composer) obj2, ((Number) obj3).intValue());
                return ww8.a;
            }

            public final void invoke(zo0 zo0Var, Composer composer2, int i2) {
                zq3.h(zo0Var, "$this$XpnListItem");
                if ((i2 & 81) == 16 && composer2.i()) {
                    composer2.K();
                    return;
                }
                if (b.G()) {
                    b.S(471510772, i2, -1, "com.nytimes.android.ribbon.destinations.games.GamesFeaturedSidekick.<anonymous> (GamesLockups.kt:310)");
                }
                TextKt.c(GamesLockupData.this.e(), null, eb5.Companion.b(composer2, 8).j(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, TPLTypography.labelRegular.getValue(), composer2, 0, 0, 65530);
                if (b.G()) {
                    b.R();
                }
            }
        }), null, null, h, 12586032, 884);
        if (b.G()) {
            b.R();
        }
        cc7 k = h.k();
        if (k != null) {
            k.a(new gt2() { // from class: com.nytimes.android.ribbon.destinations.games.GamesLockupsKt$GamesFeaturedSidekick$5
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                @Override // defpackage.gt2
                public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                    invoke((Composer) obj, ((Number) obj2).intValue());
                    return ww8.a;
                }

                public final void invoke(Composer composer2, int i2) {
                    GamesLockupsKt.b(ss2.this, gamesLockupData, composer2, gt6.a(i | 1));
                }
            });
        }
    }

    public static final void e(LazyListScope lazyListScope, final GamesLockupData gamesLockupData, qs2 qs2Var, final GamesLockupData gamesLockupData2, final gt2 gt2Var, final it2 it2Var, LazyListState lazyListState) {
        zq3.h(lazyListScope, "<this>");
        zq3.h(qs2Var, "isCurrentPage");
        zq3.h(gt2Var, "openArticle");
        zq3.h(it2Var, "onView");
        zq3.h(lazyListState, "listState");
        if (gamesLockupData == null || gamesLockupData2 == null) {
            return;
        }
        final String str = "Games Feature";
        XpnModuleKt.e(lazyListScope, (r17 & 1) != 0 ? null : zr0.c(-2090336996, true, new it2() { // from class: com.nytimes.android.ribbon.destinations.games.GamesLockupsKt$gamesFeature$1
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
                if (b.G()) {
                    b.S(-2090336996, i, -1, "com.nytimes.android.ribbon.destinations.games.gamesFeature.<anonymous> (GamesLockups.kt:234)");
                }
                XpnDividersKt.b(str, null, false, false, null, composer, 6, 30);
                if (b.G()) {
                    b.R();
                }
            }
        }), (r17 & 2) != 0 ? TPLSize.spacing3.m765getValueD9Ej5fM() : 0.0f, new Key(gamesLockupData.f()), new ss2() { // from class: com.nytimes.android.ribbon.destinations.games.GamesLockupsKt$gamesFeature$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            public final void b(Key key) {
                zq3.h(key, TransferTable.COLUMN_KEY);
                it2.this.invoke(key, 0, gamesLockupData.b());
            }

            @Override // defpackage.ss2
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                b((Key) obj);
                return ww8.a;
            }
        }, lazyListState, qs2Var, zr0.c(-1238380382, true, new it2() { // from class: com.nytimes.android.ribbon.destinations.games.GamesLockupsKt$gamesFeature$3
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
                if (b.G()) {
                    b.S(-1238380382, i, -1, "com.nytimes.android.ribbon.destinations.games.gamesFeature.<anonymous> (GamesLockups.kt:242)");
                }
                composer.z(-1591079945);
                boolean S = composer.S(gt2.this);
                final gt2 gt2Var2 = gt2.this;
                Object A = composer.A();
                if (S || A == Composer.a.a()) {
                    A = new ss2() { // from class: com.nytimes.android.ribbon.destinations.games.GamesLockupsKt$gamesFeature$3$1$1
                        {
                            super(1);
                        }

                        public final void b(Asset asset) {
                            zq3.h(asset, "asset");
                            gt2.this.invoke(0, asset);
                        }

                        @Override // defpackage.ss2
                        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                            b((Asset) obj);
                            return ww8.a;
                        }
                    };
                    composer.q(A);
                }
                composer.R();
                GamesLockupsKt.a((ss2) A, gamesLockupData, composer, 64);
                SpacerKt.a(SizeKt.n(Modifier.a, TPLSize.spacing3.m765getValueD9Ej5fM()), composer, 0);
                XpnDividersKt.a(null, 0L, null, composer, 0, 7);
                if (b.G()) {
                    b.R();
                }
            }
        }));
        XpnModuleKt.e(lazyListScope, (r17 & 1) != 0 ? null : null, (r17 & 2) != 0 ? TPLSize.spacing3.m765getValueD9Ej5fM() : 0.0f, new Key(gamesLockupData2.f()), new ss2() { // from class: com.nytimes.android.ribbon.destinations.games.GamesLockupsKt$gamesFeature$4
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            public final void b(Key key) {
                zq3.h(key, TransferTable.COLUMN_KEY);
                it2.this.invoke(key, 1, gamesLockupData2.b());
            }

            @Override // defpackage.ss2
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                b((Key) obj);
                return ww8.a;
            }
        }, lazyListState, qs2Var, zr0.c(-1084585013, true, new it2() { // from class: com.nytimes.android.ribbon.destinations.games.GamesLockupsKt$gamesFeature$5
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
                if (b.G()) {
                    b.S(-1084585013, i, -1, "com.nytimes.android.ribbon.destinations.games.gamesFeature.<anonymous> (GamesLockups.kt:260)");
                }
                composer.z(-1591079501);
                boolean S = composer.S(gt2.this);
                final gt2 gt2Var2 = gt2.this;
                Object A = composer.A();
                if (S || A == Composer.a.a()) {
                    A = new ss2() { // from class: com.nytimes.android.ribbon.destinations.games.GamesLockupsKt$gamesFeature$5$1$1
                        {
                            super(1);
                        }

                        public final void b(Asset asset) {
                            zq3.h(asset, "asset");
                            gt2.this.invoke(1, asset);
                        }

                        @Override // defpackage.ss2
                        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                            b((Asset) obj);
                            return ww8.a;
                        }
                    };
                    composer.q(A);
                }
                composer.R();
                GamesLockupsKt.b((ss2) A, gamesLockupData2, composer, 64);
                if (b.G()) {
                    b.R();
                }
            }
        }));
    }

    public static final void f(LazyListScope lazyListScope, LazyListState lazyListState, List list, qs2 qs2Var, final kt2 kt2Var, final mt2 mt2Var) {
        zq3.h(lazyListScope, "<this>");
        zq3.h(lazyListState, "listState");
        zq3.h(list, "gamesList");
        zq3.h(qs2Var, "isCurrentPage");
        zq3.h(kt2Var, "openGame");
        zq3.h(mt2Var, "onView");
        XpnModuleKt.c(lazyListScope, list, (r25 & 2) != 0 ? null : null, (r25 & 4) != 0 ? ComposableSingletons$XpnModuleKt.a.a() : null, (r25 & 8) != 0 ? false : false, (r25 & 16) != 0 ? false : false, (r25 & 32) != 0 ? TPLSize.spacing3.m765getValueD9Ej5fM() : 0.0f, new gt2() { // from class: com.nytimes.android.ribbon.destinations.games.GamesLockupsKt$gamesListItems$1
            public final Key b(int i, GamesDestinationItem gamesDestinationItem) {
                zq3.h(gamesDestinationItem, "item");
                return new Key(gamesDestinationItem.f());
            }

            @Override // defpackage.gt2
            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                return b(((Number) obj).intValue(), (GamesDestinationItem) obj2);
            }
        }, new it2() { // from class: com.nytimes.android.ribbon.destinations.games.GamesLockupsKt$gamesListItems$2
            {
                super(3);
            }

            public final void b(Key key, int i, GamesDestinationItem gamesDestinationItem) {
                zq3.h(key, TransferTable.COLUMN_KEY);
                zq3.h(gamesDestinationItem, "item");
                mt2.this.invoke(1, "games", key, Integer.valueOf(i), gamesDestinationItem);
            }

            @Override // defpackage.it2
            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
                b((Key) obj, ((Number) obj2).intValue(), (GamesDestinationItem) obj3);
                return ww8.a;
            }
        }, lazyListState, qs2Var, zr0.c(19363968, true, new mt2() { // from class: com.nytimes.android.ribbon.destinations.games.GamesLockupsKt$gamesListItems$3
            {
                super(5);
            }

            private static final float c(sy4 sy4Var) {
                return ((bu1) sy4Var.getValue()).n();
            }

            public final void b(h04 h04Var, final int i, final GamesDestinationItem gamesDestinationItem, Composer composer, int i2) {
                int i3;
                zq3.h(h04Var, "$this$xpnListModule");
                zq3.h(gamesDestinationItem, AssetConstants.DAILY_FIVE_GAME);
                if ((i2 & ContentType.LONG_FORM_ON_DEMAND) == 0) {
                    i3 = (composer.d(i) ? 32 : 16) | i2;
                } else {
                    i3 = i2;
                }
                if ((i2 & 896) == 0) {
                    i3 |= composer.S(gamesDestinationItem) ? 256 : 128;
                }
                if ((i3 & 5841) == 1168 && composer.i()) {
                    composer.K();
                    return;
                }
                if (b.G()) {
                    b.S(19363968, i3, -1, "com.nytimes.android.ribbon.destinations.games.gamesListItems.<anonymous> (GamesLockups.kt:126)");
                }
                composer.z(-1807464470);
                Object A = composer.A();
                Composer.a aVar = Composer.a;
                if (A == aVar.a()) {
                    A = b0.e(bu1.d(i == 0 ? TPLSize.spacing3.m765getValueD9Ej5fM() : TPLSize.spacing1_5.m765getValueD9Ej5fM()), null, 2, null);
                    composer.q(A);
                }
                composer.R();
                Modifier m = PaddingKt.m(Modifier.a, 0.0f, c((sy4) A), 0.0f, 0.0f, 13, null);
                final kt2 kt2Var2 = kt2.this;
                composer.z(-483455358);
                rg4 a = d.a(Arrangement.a.g(), Alignment.a.k(), composer, 0);
                composer.z(-1323940314);
                int a2 = cs0.a(composer, 0);
                et0 o = composer.o();
                ComposeUiNode.Companion companion = ComposeUiNode.F;
                qs2 a3 = companion.a();
                it2 c = LayoutKt.c(m);
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
                composer.z(1681870637);
                boolean S = composer.S(kt2Var2) | ((i3 & ContentType.LONG_FORM_ON_DEMAND) == 32) | ((i3 & 896) == 256);
                Object A2 = composer.A();
                if (S || A2 == aVar.a()) {
                    A2 = new qs2() { // from class: com.nytimes.android.ribbon.destinations.games.GamesLockupsKt$gamesListItems$3$1$1$1
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(0);
                        }

                        @Override // defpackage.qs2
                        /* renamed from: invoke */
                        public /* bridge */ /* synthetic */ Object mo865invoke() {
                            m699invoke();
                            return ww8.a;
                        }

                        /* renamed from: invoke, reason: collision with other method in class */
                        public final void m699invoke() {
                            kt2.this.invoke(1, "games", Integer.valueOf(i), gamesDestinationItem);
                        }
                    };
                    composer.q(A2);
                }
                composer.R();
                XpnListItemKt.a((qs2) A2, zr0.b(composer, 397292097, true, new it2() { // from class: com.nytimes.android.ribbon.destinations.games.GamesLockupsKt$gamesListItems$3$1$2
                    {
                        super(3);
                    }

                    @Override // defpackage.it2
                    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
                        invoke((zo0) obj, (Composer) obj2, ((Number) obj3).intValue());
                        return ww8.a;
                    }

                    public final void invoke(zo0 zo0Var, Composer composer2, int i4) {
                        zq3.h(zo0Var, "$this$XpnListItem");
                        if ((i4 & 81) == 16 && composer2.i()) {
                            composer2.K();
                            return;
                        }
                        if (b.G()) {
                            b.S(397292097, i4, -1, "com.nytimes.android.ribbon.destinations.games.gamesListItems.<anonymous>.<anonymous>.<anonymous> (GamesLockups.kt:142)");
                        }
                        TextKt.c(GamesDestinationItem.this.a(), null, eb5.Companion.b(composer2, 8).g(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, XPNTypography.titleKarnak28.getValue(), composer2, 0, 0, 65530);
                        if (b.G()) {
                            b.R();
                        }
                    }
                }), null, zr0.b(composer, 1473777816, true, new it2() { // from class: com.nytimes.android.ribbon.destinations.games.GamesLockupsKt$gamesListItems$3$1$3
                    {
                        super(3);
                    }

                    public final void b(ac0 ac0Var, Composer composer2, int i4) {
                        int i5;
                        zq3.h(ac0Var, "$this$XpnListItem");
                        if ((i4 & 14) == 0) {
                            i5 = i4 | (composer2.S(ac0Var) ? 4 : 2);
                        } else {
                            i5 = i4;
                        }
                        if ((i5 & 91) == 18 && composer2.i()) {
                            composer2.K();
                            return;
                        }
                        if (b.G()) {
                            b.S(1473777816, i5, -1, "com.nytimes.android.ribbon.destinations.games.gamesListItems.<anonymous>.<anonymous>.<anonymous> (GamesLockups.kt:149)");
                        }
                        ImageKt.b(em9.a(Integer.valueOf(GamesDestinationItem.this.c()), null, null, null, null, null, null, null, 0, composer2, 0, 510), null, ac0Var.c(SizeKt.n(Modifier.a, bu1.g(72)), Alignment.a.e()), null, null, 0.0f, null, composer2, 48, 120);
                        if (b.G()) {
                            b.R();
                        }
                    }

                    @Override // defpackage.it2
                    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
                        b((ac0) obj, (Composer) obj2, ((Number) obj3).intValue());
                        return ww8.a;
                    }
                }), null, null, zr0.b(composer, 136725980, true, new it2() { // from class: com.nytimes.android.ribbon.destinations.games.GamesLockupsKt$gamesListItems$3$1$4
                    {
                        super(3);
                    }

                    @Override // defpackage.it2
                    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
                        invoke((zo0) obj, (Composer) obj2, ((Number) obj3).intValue());
                        return ww8.a;
                    }

                    public final void invoke(zo0 zo0Var, Composer composer2, int i4) {
                        zq3.h(zo0Var, "$this$XpnListItem");
                        if ((i4 & 81) == 16 && composer2.i()) {
                            composer2.K();
                            return;
                        }
                        if (b.G()) {
                            b.S(136725980, i4, -1, "com.nytimes.android.ribbon.destinations.games.gamesListItems.<anonymous>.<anonymous>.<anonymous> (GamesLockups.kt:158)");
                        }
                        TextKt.c(GamesDestinationItem.this.d(), null, eb5.Companion.b(composer2, 8).i(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, TPLTypography.text16.getValue(), composer2, 0, 0, 65530);
                        if (b.G()) {
                            b.R();
                        }
                    }
                }), null, null, null, composer, 1575984, 948);
                composer.R();
                composer.t();
                composer.R();
                composer.R();
                if (b.G()) {
                    b.R();
                }
            }

            @Override // defpackage.mt2
            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
                b((h04) obj, ((Number) obj2).intValue(), (GamesDestinationItem) obj3, (Composer) obj4, ((Number) obj5).intValue());
                return ww8.a;
            }
        }));
    }

    public static final void g(LazyListScope lazyListScope, LazyListState lazyListState, qs2 qs2Var, final qs2 qs2Var2, ss2 ss2Var) {
        zq3.h(lazyListScope, "<this>");
        zq3.h(lazyListState, "listState");
        zq3.h(qs2Var, "isCurrentPage");
        zq3.h(qs2Var2, "onClick");
        zq3.h(ss2Var, "onView");
        XpnModuleKt.e(lazyListScope, (r17 & 1) != 0 ? null : null, (r17 & 2) != 0 ? TPLSize.spacing3.m765getValueD9Ej5fM() : 0.0f, new Key("play todays games"), ss2Var, lazyListState, qs2Var, zr0.c(1369466250, true, new it2() { // from class: com.nytimes.android.ribbon.destinations.games.GamesLockupsKt$playTodaysGames$1
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
                    b.S(1369466250, i, -1, "com.nytimes.android.ribbon.destinations.games.playTodaysGames.<anonymous> (GamesLockups.kt:278)");
                }
                Modifier.a aVar = Modifier.a;
                TPLSize tPLSize = TPLSize.spacing1_5;
                SpacerKt.a(SizeKt.n(aVar, tPLSize.m765getValueD9Ej5fM()), composer, 0);
                String b = k48.b(bm6.games_play_todays_games, composer, 0);
                composer.z(-1872233817);
                boolean S = composer.S(qs2.this);
                final qs2 qs2Var3 = qs2.this;
                Object A = composer.A();
                if (S || A == Composer.a.a()) {
                    A = new qs2() { // from class: com.nytimes.android.ribbon.destinations.games.GamesLockupsKt$playTodaysGames$1$1$1
                        {
                            super(0);
                        }

                        @Override // defpackage.qs2
                        /* renamed from: invoke */
                        public /* bridge */ /* synthetic */ Object mo865invoke() {
                            m700invoke();
                            return ww8.a;
                        }

                        /* renamed from: invoke, reason: collision with other method in class */
                        public final void m700invoke() {
                            qs2.this.mo865invoke();
                        }
                    };
                    composer.q(A);
                }
                composer.R();
                XpnDividersKt.b(b, ClickableKt.e(aVar, false, null, null, (qs2) A, 7, null), true, false, null, composer, 3456, 16);
                SpacerKt.a(SizeKt.n(aVar, tPLSize.m765getValueD9Ej5fM()), composer, 0);
                if (b.G()) {
                    b.R();
                }
            }
        }));
    }

    public static final void h(LazyListScope lazyListScope, LazyListState lazyListState, List list, qs2 qs2Var, final gt2 gt2Var, final it2 it2Var) {
        zq3.h(lazyListScope, "<this>");
        zq3.h(lazyListState, "listState");
        zq3.h(list, "assets");
        zq3.h(qs2Var, "isCurrentPage");
        zq3.h(gt2Var, "openArticle");
        zq3.h(it2Var, "onView");
        XpnModuleKt.c(lazyListScope, list, (r25 & 2) != 0 ? null : ComposableSingletons$GamesLockupsKt.a.a(), (r25 & 4) != 0 ? ComposableSingletons$XpnModuleKt.a.a() : null, (r25 & 8) != 0 ? false : false, (r25 & 16) != 0 ? false : false, (r25 & 32) != 0 ? TPLSize.spacing3.m765getValueD9Ej5fM() : 0.0f, new gt2() { // from class: com.nytimes.android.ribbon.destinations.games.GamesLockupsKt$tipsAndTricks$1
            public final Key b(int i, GamesLockupData gamesLockupData) {
                zq3.h(gamesLockupData, "item");
                return new Key(i + " " + gamesLockupData.b().getUrl());
            }

            @Override // defpackage.gt2
            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                return b(((Number) obj).intValue(), (GamesLockupData) obj2);
            }
        }, new it2() { // from class: com.nytimes.android.ribbon.destinations.games.GamesLockupsKt$tipsAndTricks$2
            {
                super(3);
            }

            public final void b(Key key, int i, GamesLockupData gamesLockupData) {
                zq3.h(key, TransferTable.COLUMN_KEY);
                zq3.h(gamesLockupData, "item");
                it2.this.invoke(key, Integer.valueOf(i), gamesLockupData.b());
            }

            @Override // defpackage.it2
            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
                b((Key) obj, ((Number) obj2).intValue(), (GamesLockupData) obj3);
                return ww8.a;
            }
        }, lazyListState, qs2Var, zr0.c(1217445169, true, new mt2() { // from class: com.nytimes.android.ribbon.destinations.games.GamesLockupsKt$tipsAndTricks$3
            {
                super(5);
            }

            public final void b(h04 h04Var, final int i, final GamesLockupData gamesLockupData, Composer composer, int i2) {
                zq3.h(h04Var, "$this$xpnListModule");
                zq3.h(gamesLockupData, "data");
                if (b.G()) {
                    b.S(1217445169, i2, -1, "com.nytimes.android.ribbon.destinations.games.tipsAndTricks.<anonymous> (GamesLockups.kt:186)");
                }
                final gt2 gt2Var2 = gt2.this;
                XpnListItemKt.a(new qs2() { // from class: com.nytimes.android.ribbon.destinations.games.GamesLockupsKt$tipsAndTricks$3.1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(0);
                    }

                    @Override // defpackage.qs2
                    /* renamed from: invoke */
                    public /* bridge */ /* synthetic */ Object mo865invoke() {
                        m701invoke();
                        return ww8.a;
                    }

                    /* renamed from: invoke, reason: collision with other method in class */
                    public final void m701invoke() {
                        gt2.this.invoke(Integer.valueOf(i), gamesLockupData.b());
                    }
                }, zr0.b(composer, -755996484, true, new it2() { // from class: com.nytimes.android.ribbon.destinations.games.GamesLockupsKt$tipsAndTricks$3.2
                    {
                        super(3);
                    }

                    @Override // defpackage.it2
                    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
                        invoke((zo0) obj, (Composer) obj2, ((Number) obj3).intValue());
                        return ww8.a;
                    }

                    public final void invoke(zo0 zo0Var, Composer composer2, int i3) {
                        zq3.h(zo0Var, "$this$XpnListItem");
                        if ((i3 & 81) == 16 && composer2.i()) {
                            composer2.K();
                            return;
                        }
                        if (b.G()) {
                            b.S(-755996484, i3, -1, "com.nytimes.android.ribbon.destinations.games.tipsAndTricks.<anonymous>.<anonymous> (GamesLockups.kt:189)");
                        }
                        TextKt.c(GamesLockupData.this.f(), null, eb5.Companion.b(composer2, 8).g(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, XPNTypography.headline20.getValue(), composer2, 0, 0, 65530);
                        if (b.G()) {
                            b.R();
                        }
                    }
                }), null, gm9.a(gamesLockupData.c() != null, zr0.b(composer, 543889924, true, new it2() { // from class: com.nytimes.android.ribbon.destinations.games.GamesLockupsKt$tipsAndTricks$3.3
                    {
                        super(3);
                    }

                    public final void b(ac0 ac0Var, Composer composer2, int i3) {
                        zq3.h(ac0Var, "$this$showScopedComposableOrNull");
                        if ((i3 & 81) == 16 && composer2.i()) {
                            composer2.K();
                            return;
                        }
                        if (b.G()) {
                            b.S(543889924, i3, -1, "com.nytimes.android.ribbon.destinations.games.tipsAndTricks.<anonymous>.<anonymous> (GamesLockups.kt:196)");
                        }
                        ImageKt.b(em9.a(GamesLockupData.this.c(), null, null, null, null, null, null, null, 0, composer2, 0, 510), null, null, null, null, 0.0f, null, composer2, 48, 124);
                        if (b.G()) {
                            b.R();
                        }
                    }

                    @Override // defpackage.it2
                    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
                        b((ac0) obj, (Composer) obj2, ((Number) obj3).intValue());
                        return ww8.a;
                    }
                })), null, null, zr0.b(composer, 704410647, true, new it2() { // from class: com.nytimes.android.ribbon.destinations.games.GamesLockupsKt$tipsAndTricks$3.4
                    {
                        super(3);
                    }

                    @Override // defpackage.it2
                    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
                        invoke((zo0) obj, (Composer) obj2, ((Number) obj3).intValue());
                        return ww8.a;
                    }

                    public final void invoke(zo0 zo0Var, Composer composer2, int i3) {
                        zq3.h(zo0Var, "$this$XpnListItem");
                        if ((i3 & 81) == 16 && composer2.i()) {
                            composer2.K();
                            return;
                        }
                        if (b.G()) {
                            b.S(704410647, i3, -1, "com.nytimes.android.ribbon.destinations.games.tipsAndTricks.<anonymous>.<anonymous> (GamesLockups.kt:202)");
                        }
                        TextKt.c(GamesLockupData.this.d(), null, eb5.Companion.b(composer2, 8).i(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, TPLTypography.body16.getValue(), composer2, 0, 0, 65530);
                        if (b.G()) {
                            b.R();
                        }
                    }
                }), zr0.b(composer, 137498614, true, new it2() { // from class: com.nytimes.android.ribbon.destinations.games.GamesLockupsKt$tipsAndTricks$3.5
                    {
                        super(3);
                    }

                    @Override // defpackage.it2
                    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
                        invoke((zo0) obj, (Composer) obj2, ((Number) obj3).intValue());
                        return ww8.a;
                    }

                    public final void invoke(zo0 zo0Var, Composer composer2, int i3) {
                        zq3.h(zo0Var, "$this$XpnListItem");
                        if ((i3 & 81) == 16 && composer2.i()) {
                            composer2.K();
                            return;
                        }
                        if (b.G()) {
                            b.S(137498614, i3, -1, "com.nytimes.android.ribbon.destinations.games.tipsAndTricks.<anonymous>.<anonymous> (GamesLockups.kt:209)");
                        }
                        TextKt.c(GamesLockupData.this.e(), null, eb5.Companion.b(composer2, 8).j(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, TPLTypography.labelRegular.getValue(), composer2, 0, 0, 65530);
                        if (b.G()) {
                            b.R();
                        }
                    }
                }), null, null, composer, 14155824, 820);
                if (b.G()) {
                    b.R();
                }
            }

            @Override // defpackage.mt2
            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
                b((h04) obj, ((Number) obj2).intValue(), (GamesLockupData) obj3, (Composer) obj4, ((Number) obj5).intValue());
                return ww8.a;
            }
        }));
    }
}
