package com.nytimes.android.features.discovery.discoverytab.composable;

import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.d;
import androidx.compose.foundation.lazy.LazyListState;
import androidx.compose.foundation.lazy.LazyListStateKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.CompositionLocalKt;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.b;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.input.nestedscroll.a;
import androidx.compose.ui.layout.LayoutKt;
import androidx.compose.ui.node.ComposeUiNode;
import com.amazonaws.mobileconnectors.s3.transferutility.TransferTable;
import com.comscore.streaming.ContentType;
import com.nytimes.android.coroutinesutils.DownloadState;
import com.nytimes.android.designsystem.uicompose.composable.RefreshableContentKt;
import com.nytimes.android.designsystem.uicompose.composable.SearchBarComposableKt;
import com.nytimes.android.tabs.composable.MainTopAppBarKt;
import com.nytimes.android.unfear.core.UnfearConverter;
import com.nytimes.android.unfear.core.UnfearKt;
import com.nytimes.android.unfear.core.composable.UnfearLayoutsKt;
import com.nytimes.android.unfear.nytdesignsystem.composable.PageLayoutsKt;
import com.nytimes.android.utils.TimeStampUtil;
import com.nytimes.android.utils.composeutils.nestedscroll.ScrollObserver;
import com.nytimes.android.utils.composeutils.nestedscroll.ScrollObserverKt;
import com.nytimes.android.utils.snackbar.LocalSnackbarKt;
import com.nytimes.android.utils.snackbar.SnackbarUtil;
import defpackage.ap0;
import defpackage.bu1;
import defpackage.cc7;
import defpackage.cs0;
import defpackage.et0;
import defpackage.gt2;
import defpackage.gt6;
import defpackage.it2;
import defpackage.j08;
import defpackage.ju7;
import defpackage.k48;
import defpackage.kt2;
import defpackage.l34;
import defpackage.m76;
import defpackage.o76;
import defpackage.or1;
import defpackage.qk6;
import defpackage.qs2;
import defpackage.rg4;
import defpackage.sm9;
import defpackage.ww8;
import defpackage.zq3;
import defpackage.zr0;
import defpackage.zt6;
import kotlin.Pair;
import org.threeten.bp.Instant;

/* loaded from: classes4.dex */
public abstract class DiscoverySectionsScreenKt {
    public static final void a(final TimeStampUtil timeStampUtil, final DownloadState downloadState, final qs2 qs2Var, final qs2 qs2Var2, final or1 or1Var, Composer composer, final int i) {
        zq3.h(timeStampUtil, "timeStampUtil");
        zq3.h(downloadState, "downloadState");
        zq3.h(qs2Var, "onRefresh");
        zq3.h(qs2Var2, "onClickSearchBar");
        zq3.h(or1Var, TransferTable.COLUMN_STATE);
        Composer h = composer.h(119167254);
        if (b.G()) {
            b.S(119167254, i, -1, "com.nytimes.android.features.discovery.discoverytab.composable.DiscoverySectionsScreen (DiscoverySectionsScreen.kt:65)");
        }
        h.z(733328855);
        Modifier.a aVar = Modifier.a;
        rg4 g = BoxKt.g(Alignment.a.o(), false, h, 0);
        h.z(-1323940314);
        int a = cs0.a(h, 0);
        et0 o = h.o();
        ComposeUiNode.Companion companion = ComposeUiNode.F;
        qs2 a2 = companion.a();
        it2 c = LayoutKt.c(aVar);
        if (h.j() == null) {
            cs0.c();
        }
        h.G();
        if (h.f()) {
            h.D(a2);
        } else {
            h.p();
        }
        Composer a3 = Updater.a(h);
        Updater.c(a3, g, companion.e());
        Updater.c(a3, o, companion.g());
        gt2 b = companion.b();
        if (a3.f() || !zq3.c(a3.A(), Integer.valueOf(a))) {
            a3.q(Integer.valueOf(a));
            a3.v(Integer.valueOf(a), b);
        }
        c.invoke(ju7.a(ju7.b(h)), h, 0);
        h.z(2058660585);
        BoxScopeInstance boxScopeInstance = BoxScopeInstance.a;
        RefreshableContentKt.a(downloadState, qs2Var, null, null, zr0.b(h, -1610530459, true, new it2() { // from class: com.nytimes.android.features.discovery.discoverytab.composable.DiscoverySectionsScreenKt$DiscoverySectionsScreen$1$1
            {
                super(3);
            }

            public final void b(DownloadState.b bVar, Composer composer2, int i2) {
                zq3.h(bVar, "it");
                if (b.G()) {
                    b.S(-1610530459, i2, -1, "com.nytimes.android.features.discovery.discoverytab.composable.DiscoverySectionsScreen.<anonymous>.<anonymous> (DiscoverySectionsScreen.kt:72)");
                }
                SnackbarUtil.z((SnackbarUtil) composer2.m(LocalSnackbarKt.a()), TimeStampUtil.this.s((Instant) ((Pair) bVar.a()).d()), 0, false, 6, null);
                if (b.G()) {
                    b.R();
                }
            }

            @Override // defpackage.it2
            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
                b((DownloadState.b) obj, (Composer) obj2, ((Number) obj3).intValue());
                return ww8.a;
            }
        }), null, false, 0.0f, null, PaddingKt.e(0.0f, or1Var.d(), 0.0f, 0.0f, 13, null), 0L, 0L, null, false, false, zr0.b(h, -468913847, true, new it2() { // from class: com.nytimes.android.features.discovery.discoverytab.composable.DiscoverySectionsScreenKt$DiscoverySectionsScreen$1$2
            {
                super(3);
            }

            public final void b(final Pair pair, Composer composer2, int i2) {
                zq3.h(pair, "it");
                if (b.G()) {
                    b.S(-468913847, i2, -1, "com.nytimes.android.features.discovery.discoverytab.composable.DiscoverySectionsScreen.<anonymous>.<anonymous> (DiscoverySectionsScreen.kt:75)");
                }
                m76 a4 = UnfearKt.a();
                UnfearConverter unfearConverter = (UnfearConverter) composer2.m(UnfearKt.a());
                final or1 or1Var2 = or1.this;
                o76 c2 = a4.c(unfearConverter.d(zt6.b(j08.class), zr0.b(composer2, 11470928, true, new kt2() { // from class: com.nytimes.android.features.discovery.discoverytab.composable.DiscoverySectionsScreenKt$DiscoverySectionsScreen$1$2.1
                    {
                        super(4);
                    }

                    public final void b(j08 j08Var, Modifier modifier, Composer composer3, int i3) {
                        int i4;
                        zq3.h(j08Var, "obj");
                        zq3.h(modifier, "modifier");
                        if ((i3 & 14) == 0) {
                            i4 = i3 | (composer3.S(j08Var) ? 4 : 2);
                        } else {
                            i4 = i3;
                        }
                        if ((i3 & ContentType.LONG_FORM_ON_DEMAND) == 0) {
                            i4 |= composer3.S(modifier) ? 32 : 16;
                        }
                        if ((i4 & 731) == 146 && composer3.i()) {
                            composer3.K();
                            return;
                        }
                        if (b.G()) {
                            b.S(11470928, i4, -1, "com.nytimes.android.features.discovery.discoverytab.composable.DiscoverySectionsScreen.<anonymous>.<anonymous>.<anonymous> (DiscoverySectionsScreen.kt:78)");
                        }
                        PageLayoutsKt.a(j08Var, modifier, or1.this.b(), PaddingKt.e(0.0f, bu1.g(or1.this.d() + bu1.g(40)), 0.0f, 0.0f, 13, null), false, null, null, null, composer3, j08.f | (i4 & 14) | (i4 & ContentType.LONG_FORM_ON_DEMAND), 240);
                        if (b.G()) {
                            b.R();
                        }
                    }

                    @Override // defpackage.kt2
                    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
                        b((j08) obj, (Modifier) obj2, (Composer) obj3, ((Number) obj4).intValue());
                        return ww8.a;
                    }
                })));
                final or1 or1Var3 = or1.this;
                CompositionLocalKt.a(c2, zr0.b(composer2, 1489806857, true, new gt2() { // from class: com.nytimes.android.features.discovery.discoverytab.composable.DiscoverySectionsScreenKt$DiscoverySectionsScreen$1$2.2
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(2);
                    }

                    @Override // defpackage.gt2
                    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                        invoke((Composer) obj, ((Number) obj2).intValue());
                        return ww8.a;
                    }

                    public final void invoke(Composer composer3, int i3) {
                        if ((i3 & 11) == 2 && composer3.i()) {
                            composer3.K();
                            return;
                        }
                        if (b.G()) {
                            b.S(1489806857, i3, -1, "com.nytimes.android.features.discovery.discoverytab.composable.DiscoverySectionsScreen.<anonymous>.<anonymous>.<anonymous> (DiscoverySectionsScreen.kt:86)");
                        }
                        UnfearLayoutsKt.a((l34) Pair.this.c(), a.b(Modifier.a, or1Var3.c(), null, 2, null), null, composer3, j08.f, 4);
                        if (b.G()) {
                            b.R();
                        }
                    }
                }), composer2, o76.d | UnfearConverter.b | 48);
                if (b.G()) {
                    b.R();
                }
            }

            @Override // defpackage.it2
            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
                b((Pair) obj, (Composer) obj2, ((Number) obj3).intValue());
                return ww8.a;
            }
        }), h, ((i >> 3) & ContentType.LONG_FORM_ON_DEMAND) | 24584, 196608, 32236);
        b(qs2Var2, or1Var.c(), h, ((i >> 9) & 14) | (ScrollObserver.g << 3));
        h.R();
        h.t();
        h.R();
        h.R();
        if (b.G()) {
            b.R();
        }
        cc7 k = h.k();
        if (k != null) {
            k.a(new gt2() { // from class: com.nytimes.android.features.discovery.discoverytab.composable.DiscoverySectionsScreenKt$DiscoverySectionsScreen$2
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
                    DiscoverySectionsScreenKt.a(TimeStampUtil.this, downloadState, qs2Var, qs2Var2, or1Var, composer2, gt6.a(i | 1));
                }
            });
        }
    }

    public static final void b(final qs2 qs2Var, final ScrollObserver scrollObserver, Composer composer, final int i) {
        int i2;
        Composer composer2;
        zq3.h(qs2Var, "onClickSearchBar");
        zq3.h(scrollObserver, "scrollObserver");
        Composer h = composer.h(-1081463634);
        if ((i & 14) == 0) {
            i2 = (h.C(qs2Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & ContentType.LONG_FORM_ON_DEMAND) == 0) {
            i2 |= h.S(scrollObserver) ? 32 : 16;
        }
        if ((i2 & 91) == 18 && h.i()) {
            h.K();
            composer2 = h;
        } else {
            if (b.G()) {
                b.S(-1081463634, i2, -1, "com.nytimes.android.features.discovery.discoverytab.composable.DiscoverySectionsScreenHeader (DiscoverySectionsScreen.kt:103)");
            }
            Modifier.a aVar = Modifier.a;
            Modifier b = ScrollObserverKt.b(aVar, scrollObserver);
            h.z(-483455358);
            rg4 a = d.a(Arrangement.a.g(), Alignment.a.k(), h, 0);
            h.z(-1323940314);
            int a2 = cs0.a(h, 0);
            et0 o = h.o();
            ComposeUiNode.Companion companion = ComposeUiNode.F;
            qs2 a3 = companion.a();
            it2 c = LayoutKt.c(b);
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
            gt2 b2 = companion.b();
            if (a4.f() || !zq3.c(a4.A(), Integer.valueOf(a2))) {
                a4.q(Integer.valueOf(a2));
                a4.v(Integer.valueOf(a2), b2);
            }
            c.invoke(ju7.a(ju7.b(h)), h, 0);
            h.z(2058660585);
            ap0 ap0Var = ap0.a;
            MainTopAppBarKt.a(ComposableSingletons$DiscoverySectionsScreenKt.a.a(), null, null, null, null, 0L, 0L, 0.0f, h, 390, 250);
            float f = 8;
            composer2 = h;
            SearchBarComposableKt.b(k48.b(qk6.search_hint_label, h, 0), k48.b(qk6.search_accessibility, h, 0), sm9.a(PaddingKt.j(ScrollObserverKt.b(aVar, scrollObserver), bu1.g(f), bu1.g(f)), -1.0f), qs2Var, h, (i2 << 9) & 7168, 0);
            composer2.R();
            composer2.t();
            composer2.R();
            composer2.R();
            if (b.G()) {
                b.R();
            }
        }
        cc7 k = composer2.k();
        if (k != null) {
            k.a(new gt2() { // from class: com.nytimes.android.features.discovery.discoverytab.composable.DiscoverySectionsScreenKt$DiscoverySectionsScreenHeader$2
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                @Override // defpackage.gt2
                public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                    invoke((Composer) obj, ((Number) obj2).intValue());
                    return ww8.a;
                }

                public final void invoke(Composer composer3, int i3) {
                    DiscoverySectionsScreenKt.b(qs2.this, scrollObserver, composer3, gt6.a(i | 1));
                }
            });
        }
    }

    public static final or1 c(float f, ScrollObserver scrollObserver, LazyListState lazyListState, Composer composer, int i, int i2) {
        composer.z(-936320155);
        if ((i2 & 2) != 0) {
            scrollObserver = ScrollObserverKt.c(bu1.g(bu1.g(4) + f), 0.0f, composer, 0, 2);
        }
        if ((i2 & 4) != 0) {
            lazyListState = LazyListStateKt.c(0, 0, composer, 0, 3);
        }
        if (b.G()) {
            b.S(-936320155, i, -1, "com.nytimes.android.features.discovery.discoverytab.composable.rememberDiscoverySectionsState (DiscoverySectionsScreen.kt:39)");
        }
        composer.z(1857701066);
        Object A = composer.A();
        if (A == Composer.a.a()) {
            A = new or1(f, scrollObserver, lazyListState, null);
            composer.q(A);
        }
        or1 or1Var = (or1) A;
        composer.R();
        if (b.G()) {
            b.R();
        }
        composer.R();
        return or1Var;
    }
}
