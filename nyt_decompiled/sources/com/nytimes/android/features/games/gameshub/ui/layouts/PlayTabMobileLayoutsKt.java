package com.nytimes.android.features.games.gameshub.ui.layouts;

import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.d;
import androidx.compose.foundation.layout.m;
import androidx.compose.foundation.lazy.LazyDslKt;
import androidx.compose.foundation.lazy.LazyListScope;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.b;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.input.nestedscroll.a;
import androidx.compose.ui.layout.LayoutKt;
import androidx.compose.ui.node.ComposeUiNode;
import com.amazonaws.mobileconnectors.s3.transferutility.TransferTable;
import com.comscore.streaming.ContentType;
import com.nytimes.android.ads.ui.compose.AdWrapperUiKt;
import com.nytimes.android.features.games.gameshub.configuration.models.CardType;
import com.nytimes.android.features.games.gameshub.configuration.models.PlayTabFooter;
import com.nytimes.android.features.games.gameshub.configuration.models.PlayTabHeader;
import com.nytimes.android.features.games.gameshub.configuration.models.PlayTabSection;
import com.nytimes.android.features.games.gameshub.configuration.models.SectionCardDescription;
import com.nytimes.android.features.games.gameshub.progress.api.GamesButtonState;
import com.nytimes.android.features.games.gameshub.ui.components.GameCardHeroKt;
import com.nytimes.android.features.games.gameshub.ui.components.GameCardSidekickKt;
import com.nytimes.android.features.games.gameshub.ui.components.GameListItemKt;
import com.nytimes.android.features.games.gameshub.ui.components.ItemImpressionKt;
import com.nytimes.android.features.games.gameshub.ui.components.PlayTabInformationKt;
import com.nytimes.android.features.games.gameshub.ui.components.SectionHeaderKt;
import com.nytimes.android.utils.composeutils.nestedscroll.ScrollObserver;
import defpackage.ap0;
import defpackage.bu1;
import defpackage.cc7;
import defpackage.cs0;
import defpackage.d8;
import defpackage.eb5;
import defpackage.et0;
import defpackage.gt2;
import defpackage.gt6;
import defpackage.h04;
import defpackage.it2;
import defpackage.ju7;
import defpackage.jv5;
import defpackage.kt2;
import defpackage.m37;
import defpackage.n37;
import defpackage.qs2;
import defpackage.rg4;
import defpackage.ss2;
import defpackage.wt2;
import defpackage.ww8;
import defpackage.ym5;
import defpackage.zq3;
import defpackage.zr0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.collections.i;

/* loaded from: classes4.dex */
public abstract class PlayTabMobileLayoutsKt {
    public static final void a(final jv5 jv5Var, final List list, final Map map, final it2 it2Var, Composer composer, final int i) {
        Iterator it2;
        boolean z;
        Composer composer2;
        zq3.h(jv5Var, TransferTable.COLUMN_STATE);
        zq3.h(list, "listCards");
        zq3.h(map, "playTabGames");
        zq3.h(it2Var, "openOrSubscribe");
        Composer h = composer.h(-2043705693);
        if (b.G()) {
            b.S(-2043705693, i, -1, "com.nytimes.android.features.games.gameshub.ui.layouts.GameCardList (PlayTabMobileLayouts.kt:255)");
        }
        h.z(-483455358);
        Modifier.a aVar = Modifier.a;
        boolean z2 = false;
        rg4 a = d.a(Arrangement.a.g(), Alignment.a.k(), h, 0);
        h.z(-1323940314);
        int a2 = cs0.a(h, 0);
        et0 o = h.o();
        ComposeUiNode.Companion companion = ComposeUiNode.F;
        qs2 a3 = companion.a();
        it2 c = LayoutKt.c(aVar);
        if (h.j() == null) {
            cs0.c();
        }
        h.G();
        if (h.f()) {
            h.D(a3);
        } else {
            h.p();
        }
        Composer a4 = Updater.a(h);
        Updater.c(a4, a, companion.e());
        Updater.c(a4, o, companion.g());
        gt2 b = companion.b();
        if (a4.f() || !zq3.c(a4.A(), Integer.valueOf(a2))) {
            a4.q(Integer.valueOf(a2));
            a4.v(Integer.valueOf(a2), b);
        }
        c.invoke(ju7.a(ju7.b(h)), h, 0);
        h.z(2058660585);
        ap0 ap0Var = ap0.a;
        h.z(1184840040);
        Iterator it3 = list.iterator();
        while (it3.hasNext()) {
            final SectionCardDescription sectionCardDescription = (SectionCardDescription) it3.next();
            final wt2 wt2Var = (wt2) map.get(sectionCardDescription.c());
            h.z(443134404);
            if (wt2Var == null) {
                it2 = it3;
                z = z2;
                composer2 = h;
            } else {
                long a5 = wt2Var.a();
                int h2 = wt2Var.h();
                String i2 = wt2Var.i();
                String d = wt2Var.d();
                String e = wt2Var.e();
                boolean j = wt2Var.j();
                boolean a6 = jv5Var.f().a();
                it2 = it3;
                boolean z3 = true;
                Modifier h3 = SizeKt.h(PaddingKt.j(Modifier.a, bu1.g(24), bu1.g(8)), 0.0f, 1, null);
                Integer valueOf = Integer.valueOf(h2);
                h.z(-46110971);
                if ((((i & 7168) ^ 3072) <= 2048 || !h.S(it2Var)) && (i & 3072) != 2048) {
                    z3 = false;
                }
                boolean S = z3 | h.S(wt2Var) | h.S(sectionCardDescription);
                Object A = h.A();
                if (S || A == Composer.a.a()) {
                    A = new ss2() { // from class: com.nytimes.android.features.games.gameshub.ui.layouts.PlayTabMobileLayoutsKt$GameCardList$1$1$1$1$1
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(1);
                        }

                        @Override // defpackage.ss2
                        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                            invoke(((Boolean) obj).booleanValue());
                            return ww8.a;
                        }

                        public final void invoke(boolean z4) {
                            it2.this.invoke(Boolean.valueOf(z4), wt2Var, sectionCardDescription.b());
                        }
                    };
                    h.q(A);
                }
                h.R();
                z = false;
                composer2 = h;
                GameListItemKt.a(a5, valueOf, i2, d, e, j, a6, (ss2) A, h3, composer2, 100663296, 0);
            }
            composer2.R();
            z2 = z;
            it3 = it2;
            h = composer2;
        }
        Composer composer3 = h;
        composer3.R();
        composer3.R();
        composer3.t();
        composer3.R();
        composer3.R();
        if (b.G()) {
            b.R();
        }
        cc7 k = composer3.k();
        if (k != null) {
            k.a(new gt2() { // from class: com.nytimes.android.features.games.gameshub.ui.layouts.PlayTabMobileLayoutsKt$GameCardList$2
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                @Override // defpackage.gt2
                public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                    invoke((Composer) obj, ((Number) obj2).intValue());
                    return ww8.a;
                }

                public final void invoke(Composer composer4, int i3) {
                    PlayTabMobileLayoutsKt.a(jv5.this, list, map, it2Var, composer4, gt6.a(i | 1));
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void b(final jv5 jv5Var, final Map map, final SectionCardDescription sectionCardDescription, final it2 it2Var, Composer composer, final int i) {
        Composer h = composer.h(1910926302);
        if (b.G()) {
            b.S(1910926302, i, -1, "com.nytimes.android.features.games.gameshub.ui.layouts.HeroCardDisplay (PlayTabMobileLayouts.kt:156)");
        }
        if (sectionCardDescription == null) {
            if (b.G()) {
                b.R();
            }
            cc7 k = h.k();
            if (k != null) {
                k.a(new gt2() { // from class: com.nytimes.android.features.games.gameshub.ui.layouts.PlayTabMobileLayoutsKt$HeroCardDisplay$1
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
                        PlayTabMobileLayoutsKt.b(jv5.this, map, sectionCardDescription, it2Var, composer2, gt6.a(i | 1));
                    }
                });
                return;
            }
            return;
        }
        final wt2 wt2Var = (wt2) map.get(sectionCardDescription.c());
        if (wt2Var != null) {
            long a = wt2Var.a();
            int h2 = wt2Var.h();
            String i2 = wt2Var.i();
            String d = wt2Var.d();
            String e = wt2Var.e();
            boolean j = wt2Var.j();
            boolean a2 = jv5Var.f().a();
            Modifier j2 = PaddingKt.j(Modifier.a, bu1.g(24), bu1.g(8));
            GamesButtonState b = wt2Var.b();
            String c = wt2Var.c();
            Integer valueOf = Integer.valueOf(h2);
            h.z(1238681248);
            boolean S = ((((i & 7168) ^ 3072) > 2048 && h.S(it2Var)) || (i & 3072) == 2048) | h.S(wt2Var) | ((((i & 896) ^ 384) > 256 && h.S(sectionCardDescription)) || (i & 384) == 256);
            Object A = h.A();
            if (S || A == Composer.a.a()) {
                A = new ss2() { // from class: com.nytimes.android.features.games.gameshub.ui.layouts.PlayTabMobileLayoutsKt$HeroCardDisplay$2$1$1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(1);
                    }

                    @Override // defpackage.ss2
                    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                        invoke(((Boolean) obj).booleanValue());
                        return ww8.a;
                    }

                    public final void invoke(boolean z) {
                        it2.this.invoke(Boolean.valueOf(z), wt2Var, sectionCardDescription.b());
                    }
                };
                h.q(A);
            }
            h.R();
            GameCardHeroKt.a(j2, a, valueOf, i2, d, e, j, a2, (ss2) A, b, c, h, 0, 0, 0);
        }
        if (b.G()) {
            b.R();
        }
        cc7 k2 = h.k();
        if (k2 != null) {
            k2.a(new gt2() { // from class: com.nytimes.android.features.games.gameshub.ui.layouts.PlayTabMobileLayoutsKt$HeroCardDisplay$3
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
                    PlayTabMobileLayoutsKt.b(jv5.this, map, sectionCardDescription, it2Var, composer2, gt6.a(i | 1));
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void c(final jv5 jv5Var, final List list, final Map map, final it2 it2Var, Composer composer, final int i) {
        Composer h = composer.h(-727291171);
        if (b.G()) {
            b.S(-727291171, i, -1, "com.nytimes.android.features.games.gameshub.ui.layouts.HorizontalSidekickCards (PlayTabMobileLayouts.kt:184)");
        }
        if (!list.isEmpty()) {
            Iterator it2 = list.iterator();
            while (it2.hasNext()) {
                Pair pair = (Pair) it2.next();
                Modifier k = PaddingKt.k(Modifier.a, bu1.g(12), 0.0f, 2, null);
                h.z(693286680);
                rg4 a = m.a(Arrangement.a.f(), Alignment.a.l(), h, 0);
                h.z(-1323940314);
                int a2 = cs0.a(h, 0);
                et0 o = h.o();
                ComposeUiNode.Companion companion = ComposeUiNode.F;
                qs2 a3 = companion.a();
                it2 c = LayoutKt.c(k);
                if (h.j() == null) {
                    cs0.c();
                }
                h.G();
                if (h.f()) {
                    h.D(a3);
                } else {
                    h.p();
                }
                Composer a4 = Updater.a(h);
                Updater.c(a4, a, companion.e());
                Updater.c(a4, o, companion.g());
                gt2 b = companion.b();
                if (a4.f() || !zq3.c(a4.A(), Integer.valueOf(a2))) {
                    a4.q(Integer.valueOf(a2));
                    a4.v(Integer.valueOf(a2), b);
                }
                c.invoke(ju7.a(ju7.b(h)), h, 0);
                h.z(2058660585);
                g(n37.a, map, pair, it2Var, jv5Var, h, (i & 7168) | 70 | (ScrollObserver.g << 12) | ((i << 12) & 57344));
                h.R();
                h.t();
                h.R();
                h.R();
            }
        }
        if (b.G()) {
            b.R();
        }
        cc7 k2 = h.k();
        if (k2 != null) {
            k2.a(new gt2() { // from class: com.nytimes.android.features.games.gameshub.ui.layouts.PlayTabMobileLayoutsKt$HorizontalSidekickCards$2
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
                    PlayTabMobileLayoutsKt.c(jv5.this, list, map, it2Var, composer2, gt6.a(i | 1));
                }
            });
        }
    }

    public static final void d(final jv5 jv5Var, final Map map, final ym5 ym5Var, final PlayTabHeader playTabHeader, final List list, final d8 d8Var, final PlayTabFooter playTabFooter, final qs2 qs2Var, final it2 it2Var, final ss2 ss2Var, Composer composer, final int i) {
        zq3.h(jv5Var, TransferTable.COLUMN_STATE);
        zq3.h(map, "playTabGames");
        zq3.h(ym5Var, "paddingValues");
        zq3.h(playTabHeader, "header");
        zq3.h(list, "nytGamesSections");
        zq3.h(d8Var, "bottomAd");
        zq3.h(playTabFooter, "footer");
        zq3.h(qs2Var, "onClickSubtitleSubscription");
        zq3.h(it2Var, "openOrSubscribe");
        zq3.h(ss2Var, "onSectionViewed");
        Composer h = composer.h(-934842982);
        if (b.G()) {
            b.S(-934842982, i, -1, "com.nytimes.android.features.games.gameshub.ui.layouts.MobileLayout (PlayTabMobileLayouts.kt:46)");
        }
        LazyDslKt.a(BackgroundKt.d(a.b(Modifier.a, jv5Var.e(), null, 2, null), eb5.Companion.a(h, 8).h(), null, 2, null), jv5Var.d(), ym5Var, false, null, null, null, false, new ss2() { // from class: com.nytimes.android.features.games.gameshub.ui.layouts.PlayTabMobileLayoutsKt$MobileLayout$1
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
                zq3.h(lazyListScope, "$this$LazyColumn");
                final PlayTabHeader playTabHeader2 = playTabHeader;
                LazyListScope.d(lazyListScope, null, null, zr0.c(1005374254, true, new it2() { // from class: com.nytimes.android.features.games.gameshub.ui.layouts.PlayTabMobileLayoutsKt$MobileLayout$1.1
                    {
                        super(3);
                    }

                    @Override // defpackage.it2
                    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
                        invoke((h04) obj, (Composer) obj2, ((Number) obj3).intValue());
                        return ww8.a;
                    }

                    public final void invoke(h04 h04Var, Composer composer2, int i2) {
                        zq3.h(h04Var, "$this$item");
                        if ((i2 & 81) == 16 && composer2.i()) {
                            composer2.K();
                            return;
                        }
                        if (b.G()) {
                            b.S(1005374254, i2, -1, "com.nytimes.android.features.games.gameshub.ui.layouts.MobileLayout.<anonymous>.<anonymous> (PlayTabMobileLayouts.kt:55)");
                        }
                        PlayTabInformationKt.b(PlayTabHeader.this.b(), PlayTabHeader.this.a(), composer2, 0);
                        if (b.G()) {
                            b.R();
                        }
                    }
                }), 3, null);
                final List<PlayTabSection> list2 = list;
                final AnonymousClass2 anonymousClass2 = new ss2() { // from class: com.nytimes.android.features.games.gameshub.ui.layouts.PlayTabMobileLayoutsKt$MobileLayout$1.2
                    @Override // defpackage.ss2
                    /* renamed from: b, reason: merged with bridge method [inline-methods] */
                    public final Object invoke(PlayTabSection playTabSection) {
                        zq3.h(playTabSection, "section");
                        return playTabSection.b();
                    }
                };
                final jv5 jv5Var2 = jv5Var;
                final Map<String, wt2> map2 = map;
                final qs2 qs2Var2 = qs2Var;
                final it2 it2Var2 = it2Var;
                final ss2 ss2Var2 = ss2Var;
                final PlayTabMobileLayoutsKt$MobileLayout$1$invoke$$inlined$items$default$1 playTabMobileLayoutsKt$MobileLayout$1$invoke$$inlined$items$default$1 = new ss2() { // from class: com.nytimes.android.features.games.gameshub.ui.layouts.PlayTabMobileLayoutsKt$MobileLayout$1$invoke$$inlined$items$default$1
                    @Override // defpackage.ss2
                    /* renamed from: b, reason: merged with bridge method [inline-methods] */
                    public final Void invoke(Object obj) {
                        return null;
                    }
                };
                lazyListScope.b(list2.size(), anonymousClass2 != null ? new ss2() { // from class: com.nytimes.android.features.games.gameshub.ui.layouts.PlayTabMobileLayoutsKt$MobileLayout$1$invoke$$inlined$items$default$2
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(1);
                    }

                    @Override // defpackage.ss2
                    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                        return invoke(((Number) obj).intValue());
                    }

                    public final Object invoke(int i2) {
                        return ss2.this.invoke(list2.get(i2));
                    }
                } : null, new ss2() { // from class: com.nytimes.android.features.games.gameshub.ui.layouts.PlayTabMobileLayoutsKt$MobileLayout$1$invoke$$inlined$items$default$3
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(1);
                    }

                    @Override // defpackage.ss2
                    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                        return invoke(((Number) obj).intValue());
                    }

                    public final Object invoke(int i2) {
                        return ss2.this.invoke(list2.get(i2));
                    }
                }, zr0.c(-632812321, true, new kt2() { // from class: com.nytimes.android.features.games.gameshub.ui.layouts.PlayTabMobileLayoutsKt$MobileLayout$1$invoke$$inlined$items$default$4
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(4);
                    }

                    @Override // defpackage.kt2
                    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
                        invoke((h04) obj, ((Number) obj2).intValue(), (Composer) obj3, ((Number) obj4).intValue());
                        return ww8.a;
                    }

                    /* JADX WARN: Multi-variable type inference failed */
                    /* JADX WARN: Type inference failed for: r12v17, types: [java.util.List] */
                    public final void invoke(h04 h04Var, int i2, Composer composer2, int i3) {
                        Object obj;
                        ArrayList arrayList;
                        int i4 = (i3 & 14) == 0 ? (composer2.S(h04Var) ? 4 : 2) | i3 : i3;
                        if ((i3 & ContentType.LONG_FORM_ON_DEMAND) == 0) {
                            i4 |= composer2.d(i2) ? 32 : 16;
                        }
                        if ((i4 & 731) == 146 && composer2.i()) {
                            composer2.K();
                            return;
                        }
                        if (b.G()) {
                            b.S(-632812321, i4, -1, "androidx.compose.foundation.lazy.items.<anonymous> (LazyDsl.kt:148)");
                        }
                        PlayTabSection playTabSection = (PlayTabSection) list2.get(i2);
                        Iterator it2 = playTabSection.c().iterator();
                        while (true) {
                            if (it2.hasNext()) {
                                obj = it2.next();
                                if (((SectionCardDescription) obj).b() == CardType.HERO) {
                                    break;
                                }
                            } else {
                                obj = null;
                                break;
                            }
                        }
                        SectionCardDescription sectionCardDescription = (SectionCardDescription) obj;
                        List c = playTabSection.c();
                        ArrayList arrayList2 = new ArrayList();
                        for (Object obj2 : c) {
                            if (((SectionCardDescription) obj2).b() == CardType.SIDEKICK) {
                                arrayList2.add(obj2);
                            }
                        }
                        Iterator it3 = arrayList2.iterator();
                        if (it3.hasNext()) {
                            ArrayList arrayList3 = new ArrayList();
                            Object next = it3.next();
                            while (it3.hasNext()) {
                                Object next2 = it3.next();
                                arrayList3.add(new Pair((SectionCardDescription) next, (SectionCardDescription) next2));
                                next = next2;
                            }
                            arrayList = arrayList3;
                        } else {
                            arrayList = i.l();
                        }
                        List c2 = playTabSection.c();
                        ArrayList arrayList4 = new ArrayList();
                        for (Object obj3 : c2) {
                            if (((SectionCardDescription) obj3).b() == CardType.LIST) {
                                arrayList4.add(obj3);
                            }
                        }
                        PlayTabMobileLayoutsKt.e(jv5Var2, playTabSection, map2, sectionCardDescription, arrayList, arrayList4, qs2Var2, it2Var2, ss2Var2, composer2, ScrollObserver.g | 295488);
                        if (b.G()) {
                            b.R();
                        }
                    }
                }));
                final d8 d8Var2 = d8Var;
                LazyListScope.d(lazyListScope, null, null, zr0.c(1786431141, true, new it2() { // from class: com.nytimes.android.features.games.gameshub.ui.layouts.PlayTabMobileLayoutsKt$MobileLayout$1.4
                    {
                        super(3);
                    }

                    @Override // defpackage.it2
                    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
                        invoke((h04) obj, (Composer) obj2, ((Number) obj3).intValue());
                        return ww8.a;
                    }

                    public final void invoke(h04 h04Var, Composer composer2, int i2) {
                        zq3.h(h04Var, "$this$item");
                        if ((i2 & 81) == 16 && composer2.i()) {
                            composer2.K();
                            return;
                        }
                        if (b.G()) {
                            b.S(1786431141, i2, -1, "com.nytimes.android.features.games.gameshub.ui.layouts.MobileLayout.<anonymous>.<anonymous> (PlayTabMobileLayouts.kt:78)");
                        }
                        AdWrapperUiKt.f(d8.this, PaddingKt.m(Modifier.a, 0.0f, bu1.g(32), 0.0f, bu1.g(16), 5, null), false, false, composer2, d8.a | 48, 12);
                        if (b.G()) {
                            b.R();
                        }
                    }
                }), 3, null);
                final PlayTabFooter playTabFooter2 = playTabFooter;
                LazyListScope.d(lazyListScope, null, null, zr0.c(-253032346, true, new it2() { // from class: com.nytimes.android.features.games.gameshub.ui.layouts.PlayTabMobileLayoutsKt$MobileLayout$1.5
                    {
                        super(3);
                    }

                    @Override // defpackage.it2
                    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
                        invoke((h04) obj, (Composer) obj2, ((Number) obj3).intValue());
                        return ww8.a;
                    }

                    public final void invoke(h04 h04Var, Composer composer2, int i2) {
                        zq3.h(h04Var, "$this$item");
                        if ((i2 & 81) == 16 && composer2.i()) {
                            composer2.K();
                            return;
                        }
                        if (b.G()) {
                            b.S(-253032346, i2, -1, "com.nytimes.android.features.games.gameshub.ui.layouts.MobileLayout.<anonymous>.<anonymous> (PlayTabMobileLayouts.kt:84)");
                        }
                        PlayTabInformationKt.a(PlayTabFooter.this.b(), PlayTabFooter.this.a(), composer2, 0);
                        if (b.G()) {
                            b.R();
                        }
                    }
                }), 3, null);
            }
        }, h, i & 896, 248);
        if (b.G()) {
            b.R();
        }
        cc7 k = h.k();
        if (k != null) {
            k.a(new gt2() { // from class: com.nytimes.android.features.games.gameshub.ui.layouts.PlayTabMobileLayoutsKt$MobileLayout$2
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
                    PlayTabMobileLayoutsKt.d(jv5.this, map, ym5Var, playTabHeader, list, d8Var, playTabFooter, qs2Var, it2Var, ss2Var, composer2, gt6.a(i | 1));
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void e(final jv5 jv5Var, final PlayTabSection playTabSection, final Map map, final SectionCardDescription sectionCardDescription, final List list, final List list2, final qs2 qs2Var, final it2 it2Var, final ss2 ss2Var, Composer composer, final int i) {
        Composer h = composer.h(-64844636);
        if (b.G()) {
            b.S(-64844636, i, -1, "com.nytimes.android.features.games.gameshub.ui.layouts.MobileSection (PlayTabMobileLayouts.kt:100)");
        }
        h.z(-483455358);
        Modifier.a aVar = Modifier.a;
        rg4 a = d.a(Arrangement.a.g(), Alignment.a.k(), h, 0);
        h.z(-1323940314);
        int a2 = cs0.a(h, 0);
        et0 o = h.o();
        ComposeUiNode.Companion companion = ComposeUiNode.F;
        qs2 a3 = companion.a();
        it2 c = LayoutKt.c(aVar);
        if (h.j() == null) {
            cs0.c();
        }
        h.G();
        if (h.f()) {
            h.D(a3);
        } else {
            h.p();
        }
        Composer a4 = Updater.a(h);
        Updater.c(a4, a, companion.e());
        Updater.c(a4, o, companion.g());
        gt2 b = companion.b();
        if (a4.f() || !zq3.c(a4.A(), Integer.valueOf(a2))) {
            a4.q(Integer.valueOf(a2));
            a4.v(Integer.valueOf(a2), b);
        }
        c.invoke(ju7.a(ju7.b(h)), h, 0);
        h.z(2058660585);
        ap0 ap0Var = ap0.a;
        ItemImpressionKt.a(playTabSection.b(), jv5Var.d(), null, null, new qs2() { // from class: com.nytimes.android.features.games.gameshub.ui.layouts.PlayTabMobileLayoutsKt$MobileSection$1$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // defpackage.qs2
            /* renamed from: invoke */
            public /* bridge */ /* synthetic */ Object mo865invoke() {
                m397invoke();
                return ww8.a;
            }

            /* renamed from: invoke, reason: collision with other method in class */
            public final void m397invoke() {
                ss2.this.invoke(playTabSection);
            }
        }, h, 0, 12);
        int i2 = i >> 12;
        SectionHeaderKt.a(playTabSection.e(), playTabSection.d(), qs2Var, h, i2 & 896);
        int i3 = ScrollObserver.g;
        int i4 = i2 & 7168;
        b(jv5Var, map, sectionCardDescription, it2Var, h, i3 | 64 | (i & 14) | ((i >> 3) & 896) | i4);
        f(list, list2, map, it2Var, jv5Var, h, (i3 << 12) | i4 | 584 | ((i << 12) & 57344));
        h.R();
        h.t();
        h.R();
        h.R();
        if (b.G()) {
            b.R();
        }
        cc7 k = h.k();
        if (k != null) {
            k.a(new gt2() { // from class: com.nytimes.android.features.games.gameshub.ui.layouts.PlayTabMobileLayoutsKt$MobileSection$2
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
                    PlayTabMobileLayoutsKt.e(jv5.this, playTabSection, map, sectionCardDescription, list, list2, qs2Var, it2Var, ss2Var, composer2, gt6.a(i | 1));
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void f(final List list, final List list2, final Map map, final it2 it2Var, final jv5 jv5Var, Composer composer, final int i) {
        Composer h = composer.h(-1318799297);
        if (b.G()) {
            b.S(-1318799297, i, -1, "com.nytimes.android.features.games.gameshub.ui.layouts.SectionCardsDisplay (PlayTabMobileLayouts.kt:135)");
        }
        int i2 = ScrollObserver.g;
        int i3 = (i >> 12) & 14;
        int i4 = i & 7168;
        c(jv5Var, list, map, it2Var, h, i2 | 576 | i3 | i4);
        a(jv5Var, list2, map, it2Var, h, i2 | 576 | i3 | i4);
        if (b.G()) {
            b.R();
        }
        cc7 k = h.k();
        if (k != null) {
            k.a(new gt2() { // from class: com.nytimes.android.features.games.gameshub.ui.layouts.PlayTabMobileLayoutsKt$SectionCardsDisplay$1
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
                    PlayTabMobileLayoutsKt.f(list, list2, map, it2Var, jv5Var, composer2, gt6.a(i | 1));
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void g(final m37 m37Var, final Map map, final Pair pair, final it2 it2Var, final jv5 jv5Var, Composer composer, final int i) {
        int i2;
        Composer h = composer.h(-1775044982);
        if (b.G()) {
            b.S(-1775044982, i, -1, "com.nytimes.android.features.games.gameshub.ui.layouts.SidekickPair (PlayTabMobileLayouts.kt:208)");
        }
        final wt2 wt2Var = (wt2) map.get(((SectionCardDescription) pair.c()).c());
        final wt2 wt2Var2 = (wt2) map.get(((SectionCardDescription) pair.d()).c());
        h.z(-760599862);
        if (wt2Var != null) {
            long a = wt2Var.a();
            int h2 = wt2Var.h();
            String i3 = wt2Var.i();
            String d = wt2Var.d();
            String e = wt2Var.e();
            boolean j = wt2Var.j();
            boolean a2 = jv5Var.f().a();
            Modifier j2 = PaddingKt.j(SizeKt.k(m37.b(m37Var, Modifier.a, 1.0f, false, 2, null), bu1.g(200), 0.0f, 2, null), bu1.g(12), bu1.g(8));
            GamesButtonState b = wt2Var.b();
            String c = wt2Var.c();
            Integer valueOf = Integer.valueOf(h2);
            h.z(-760599533);
            boolean S = ((((i & 7168) ^ 3072) > 2048 && h.S(it2Var)) || (i & 3072) == 2048) | h.S(wt2Var);
            Object A = h.A();
            if (S || A == Composer.a.a()) {
                A = new ss2() { // from class: com.nytimes.android.features.games.gameshub.ui.layouts.PlayTabMobileLayoutsKt$SidekickPair$1$1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(1);
                    }

                    @Override // defpackage.ss2
                    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                        invoke(((Boolean) obj).booleanValue());
                        return ww8.a;
                    }

                    public final void invoke(boolean z) {
                        it2.this.invoke(Boolean.valueOf(z), wt2Var, CardType.SIDEKICK);
                    }
                };
                h.q(A);
            }
            h.R();
            i2 = 200;
            GameCardSidekickKt.a(j2, a, valueOf, i3, d, e, j, (ss2) A, a2, b, c, h, 0, 0, 0);
        } else {
            i2 = 200;
        }
        h.R();
        if (wt2Var2 != null) {
            long a3 = wt2Var2.a();
            int h3 = wt2Var2.h();
            String i4 = wt2Var2.i();
            String d2 = wt2Var2.d();
            String e2 = wt2Var2.e();
            boolean j3 = wt2Var2.j();
            boolean a4 = jv5Var.f().a();
            Modifier j4 = PaddingKt.j(SizeKt.k(m37.b(m37Var, Modifier.a, 1.0f, false, 2, null), bu1.g(i2), 0.0f, 2, null), bu1.g(12), bu1.g(8));
            GamesButtonState b2 = wt2Var2.b();
            String c2 = wt2Var2.c();
            Integer valueOf2 = Integer.valueOf(h3);
            h.z(-760598785);
            boolean S2 = h.S(wt2Var2) | ((((i & 7168) ^ 3072) > 2048 && h.S(it2Var)) || (i & 3072) == 2048);
            Object A2 = h.A();
            if (S2 || A2 == Composer.a.a()) {
                A2 = new ss2() { // from class: com.nytimes.android.features.games.gameshub.ui.layouts.PlayTabMobileLayoutsKt$SidekickPair$2$1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(1);
                    }

                    @Override // defpackage.ss2
                    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                        invoke(((Boolean) obj).booleanValue());
                        return ww8.a;
                    }

                    public final void invoke(boolean z) {
                        it2.this.invoke(Boolean.valueOf(z), wt2Var2, CardType.SIDEKICK);
                    }
                };
                h.q(A2);
            }
            h.R();
            GameCardSidekickKt.a(j4, a3, valueOf2, i4, d2, e2, j3, (ss2) A2, a4, b2, c2, h, 0, 0, 0);
        }
        if (b.G()) {
            b.R();
        }
        cc7 k = h.k();
        if (k != null) {
            k.a(new gt2() { // from class: com.nytimes.android.features.games.gameshub.ui.layouts.PlayTabMobileLayoutsKt$SidekickPair$3
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
                    PlayTabMobileLayoutsKt.g(m37.this, map, pair, it2Var, jv5Var, composer2, gt6.a(i | 1));
                }
            });
        }
    }
}
