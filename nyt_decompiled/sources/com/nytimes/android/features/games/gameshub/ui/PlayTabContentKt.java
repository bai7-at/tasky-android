package com.nytimes.android.features.games.gameshub.ui;

import android.content.Context;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.b;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import com.amazonaws.mobileconnectors.s3.transferutility.TransferTable;
import com.nytimes.android.api.cms.AssetConstants;
import com.nytimes.android.designsystem.uicompose.composable.NytScaffoldKt;
import com.nytimes.android.features.games.gameshub.configuration.models.CardType;
import com.nytimes.android.features.games.gameshub.configuration.models.PlayTabFooter;
import com.nytimes.android.features.games.gameshub.configuration.models.PlayTabHeader;
import com.nytimes.android.features.games.gameshub.configuration.models.PlayTabSection;
import com.nytimes.android.features.games.gameshub.configuration.models.SectionCardDescription;
import com.nytimes.android.features.games.gameshub.ui.layouts.PlayTabMobileLayoutsKt;
import com.nytimes.android.features.games.gameshub.ui.layouts.PlayTabTabletLayoutsKt;
import com.nytimes.android.messaging.dock.DockConfig;
import com.nytimes.android.messaging.dock.DockViewComposableKt;
import com.nytimes.android.utils.DeviceUtils;
import com.nytimes.android.utils.composeutils.ActionUtilsKt;
import com.nytimes.android.utils.composeutils.SingleActionHandler;
import com.nytimes.android.utils.composeutils.nestedscroll.ScrollObserver;
import defpackage.bu1;
import defpackage.cc7;
import defpackage.d8;
import defpackage.gt2;
import defpackage.gt6;
import defpackage.it2;
import defpackage.jv5;
import defpackage.qs2;
import defpackage.ss2;
import defpackage.wt2;
import defpackage.ww8;
import defpackage.ym5;
import defpackage.zq3;
import defpackage.zr0;
import java.util.List;
import java.util.Map;

/* loaded from: classes4.dex */
public abstract class PlayTabContentKt {
    public static final void a(final jv5 jv5Var, final PlayTabHeader playTabHeader, final PlayTabFooter playTabFooter, final Map map, final List list, final d8 d8Var, final gt2 gt2Var, final qs2 qs2Var, final qs2 qs2Var2, final gt2 gt2Var2, final boolean z, Composer composer, final int i, final int i2) {
        zq3.h(jv5Var, TransferTable.COLUMN_STATE);
        zq3.h(playTabHeader, "playTabHeader");
        zq3.h(playTabFooter, "playTabFooter");
        zq3.h(map, "playTabDetails");
        zq3.h(list, "playTabSections");
        zq3.h(d8Var, "bottomAd");
        zq3.h(gt2Var, "onClickPlay");
        zq3.h(qs2Var, "onClickSubscribe");
        zq3.h(qs2Var2, "onClickSubtitleSubscription");
        zq3.h(gt2Var2, "onImpressionEvent");
        Composer h = composer.h(-1478324364);
        if (b.G()) {
            b.S(-1478324364, i, i2, "com.nytimes.android.features.games.gameshub.ui.PlayTabGamesScreen (PlayTabContent.kt:44)");
        }
        final SingleActionHandler b = ActionUtilsKt.b(0L, 0L, h, 0, 3);
        NytScaffoldKt.a(null, null, zr0.b(h, 316827814, true, new gt2() { // from class: com.nytimes.android.features.games.gameshub.ui.PlayTabContentKt$PlayTabGamesScreen$1
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
                if ((i3 & 11) == 2 && composer2.i()) {
                    composer2.K();
                    return;
                }
                if (b.G()) {
                    b.S(316827814, i3, -1, "com.nytimes.android.features.games.gameshub.ui.PlayTabGamesScreen.<anonymous> (PlayTabContent.kt:57)");
                }
                if (z) {
                    DockViewComposableKt.DockViewComposable(0, null, DockConfig.PLAY_TAB, true, composer2, 3462, 2);
                }
                if (b.G()) {
                    b.R();
                }
            }
        }), 0.0f, null, null, null, 0, false, null, false, null, 0.0f, 0L, 0L, 0L, 0L, 0L, null, null, zr0.b(h, -1408937163, true, new it2() { // from class: com.nytimes.android.features.games.gameshub.ui.PlayTabContentKt$PlayTabGamesScreen$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(3);
            }

            @Override // defpackage.it2
            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
                invoke((ym5) obj, (Composer) obj2, ((Number) obj3).intValue());
                return ww8.a;
            }

            public final void invoke(ym5 ym5Var, Composer composer2, int i3) {
                zq3.h(ym5Var, "it");
                if ((i3 & 81) == 16 && composer2.i()) {
                    composer2.K();
                    return;
                }
                if (b.G()) {
                    b.S(-1408937163, i3, -1, "com.nytimes.android.features.games.gameshub.ui.PlayTabGamesScreen.<anonymous> (PlayTabContent.kt:66)");
                }
                ym5 e = PaddingKt.e(0.0f, 0.0f, 0.0f, bu1.g(16), 7, null);
                if (DeviceUtils.G((Context) composer2.m(AndroidCompositionLocals_androidKt.g()))) {
                    composer2.z(-1080379196);
                    jv5 jv5Var2 = jv5.this;
                    Map<String, wt2> map2 = map;
                    PlayTabHeader playTabHeader2 = playTabHeader;
                    List<PlayTabSection> list2 = list;
                    d8 d8Var2 = d8Var;
                    PlayTabFooter playTabFooter2 = playTabFooter;
                    qs2 qs2Var3 = qs2Var2;
                    final SingleActionHandler singleActionHandler = b;
                    final qs2 qs2Var4 = qs2Var;
                    final gt2 gt2Var3 = gt2Var;
                    it2 it2Var = new it2() { // from class: com.nytimes.android.features.games.gameshub.ui.PlayTabContentKt$PlayTabGamesScreen$2.1
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(3);
                        }

                        public final void b(boolean z2, wt2 wt2Var, CardType cardType) {
                            zq3.h(wt2Var, AssetConstants.DAILY_FIVE_GAME);
                            zq3.h(cardType, "cardType");
                            PlayTabContentKt.b(SingleActionHandler.this, qs2Var4, gt2Var3, z2, wt2Var, cardType);
                        }

                        @Override // defpackage.it2
                        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
                            b(((Boolean) obj).booleanValue(), (wt2) obj2, (CardType) obj3);
                            return ww8.a;
                        }
                    };
                    composer2.z(-1080378517);
                    boolean S = composer2.S(gt2Var2);
                    final gt2 gt2Var4 = gt2Var2;
                    Object A = composer2.A();
                    if (S || A == Composer.a.a()) {
                        A = new gt2() { // from class: com.nytimes.android.features.games.gameshub.ui.PlayTabContentKt$PlayTabGamesScreen$2$2$1
                            {
                                super(2);
                            }

                            public final void b(wt2 wt2Var, CardType cardType) {
                                zq3.h(wt2Var, AssetConstants.DAILY_FIVE_GAME);
                                zq3.h(cardType, "cardType");
                                gt2.this.invoke(wt2Var, cardType);
                            }

                            @Override // defpackage.gt2
                            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                                b((wt2) obj, (CardType) obj2);
                                return ww8.a;
                            }
                        };
                        composer2.q(A);
                    }
                    composer2.R();
                    PlayTabTabletLayoutsKt.e(jv5Var2, map2, e, playTabHeader2, list2, d8Var2, playTabFooter2, qs2Var3, it2Var, (gt2) A, composer2, ScrollObserver.g | 33216 | (d8.a << 15));
                    composer2.R();
                } else {
                    composer2.z(-1080378418);
                    jv5 jv5Var3 = jv5.this;
                    Map<String, wt2> map3 = map;
                    PlayTabHeader playTabHeader3 = playTabHeader;
                    List<PlayTabSection> list3 = list;
                    d8 d8Var3 = d8Var;
                    PlayTabFooter playTabFooter3 = playTabFooter;
                    qs2 qs2Var5 = qs2Var2;
                    final SingleActionHandler singleActionHandler2 = b;
                    final qs2 qs2Var6 = qs2Var;
                    final gt2 gt2Var5 = gt2Var;
                    it2 it2Var2 = new it2() { // from class: com.nytimes.android.features.games.gameshub.ui.PlayTabContentKt$PlayTabGamesScreen$2.3
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(3);
                        }

                        public final void b(boolean z2, wt2 wt2Var, CardType cardType) {
                            zq3.h(wt2Var, AssetConstants.DAILY_FIVE_GAME);
                            zq3.h(cardType, "cardType");
                            PlayTabContentKt.b(SingleActionHandler.this, qs2Var6, gt2Var5, z2, wt2Var, cardType);
                        }

                        @Override // defpackage.it2
                        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
                            b(((Boolean) obj).booleanValue(), (wt2) obj2, (CardType) obj3);
                            return ww8.a;
                        }
                    };
                    final Map<String, wt2> map4 = map;
                    final gt2 gt2Var6 = gt2Var2;
                    PlayTabMobileLayoutsKt.d(jv5Var3, map3, e, playTabHeader3, list3, d8Var3, playTabFooter3, qs2Var5, it2Var2, new ss2() { // from class: com.nytimes.android.features.games.gameshub.ui.PlayTabContentKt$PlayTabGamesScreen$2.4
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(1);
                        }

                        public final void b(PlayTabSection playTabSection) {
                            zq3.h(playTabSection, "section");
                            List<SectionCardDescription> c = playTabSection.c();
                            Map<String, wt2> map5 = map4;
                            gt2 gt2Var7 = gt2Var6;
                            for (SectionCardDescription sectionCardDescription : c) {
                                wt2 wt2Var = map5.get(sectionCardDescription.c());
                                if (wt2Var != null) {
                                    gt2Var7.invoke(wt2Var, sectionCardDescription.b());
                                }
                            }
                        }

                        @Override // defpackage.ss2
                        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                            b((PlayTabSection) obj);
                            return ww8.a;
                        }
                    }, composer2, ScrollObserver.g | 33216 | (d8.a << 15));
                    composer2.R();
                }
                if (b.G()) {
                    b.R();
                }
            }
        }), h, 384, 0, 6, 1048571);
        if (b.G()) {
            b.R();
        }
        cc7 k = h.k();
        if (k != null) {
            k.a(new gt2() { // from class: com.nytimes.android.features.games.gameshub.ui.PlayTabContentKt$PlayTabGamesScreen$3
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
                    PlayTabContentKt.a(jv5.this, playTabHeader, playTabFooter, map, list, d8Var, gt2Var, qs2Var, qs2Var2, gt2Var2, z, composer2, gt6.a(i | 1), gt6.a(i2));
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void b(SingleActionHandler singleActionHandler, final qs2 qs2Var, final gt2 gt2Var, final boolean z, final wt2 wt2Var, final CardType cardType) {
        SingleActionHandler.b(singleActionHandler, 0L, new qs2() { // from class: com.nytimes.android.features.games.gameshub.ui.PlayTabContentKt$PlayTabGamesScreen$openOrSubscribe$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // defpackage.qs2
            /* renamed from: invoke */
            public /* bridge */ /* synthetic */ Object mo865invoke() {
                m371invoke();
                return ww8.a;
            }

            /* renamed from: invoke, reason: collision with other method in class */
            public final void m371invoke() {
                if (z) {
                    qs2Var.mo865invoke();
                } else {
                    gt2Var.invoke(wt2Var, cardType);
                }
            }
        }, 1, null);
    }
}
