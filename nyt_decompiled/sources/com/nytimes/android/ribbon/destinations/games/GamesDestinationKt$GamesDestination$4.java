package com.nytimes.android.ribbon.destinations.games;

import androidx.activity.ComponentActivity;
import androidx.compose.foundation.lazy.LazyDslKt;
import androidx.compose.foundation.lazy.LazyListScope;
import androidx.compose.foundation.lazy.LazyListState;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.b;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.platform.CompositionLocalsKt;
import com.amazonaws.mobileconnectors.s3.transferutility.TransferTable;
import com.nytimes.android.api.cms.Asset;
import com.nytimes.android.ribbon.composable.XpnHandoffKt;
import com.nytimes.android.ribbon.composable.XpnModuleKt;
import com.nytimes.android.ribbon.config.RibbonConfig;
import com.nytimes.android.ribbon.et2.Key;
import com.nytimes.android.tpl.TPLSize;
import defpackage.c58;
import defpackage.fe4;
import defpackage.fm9;
import defpackage.gt2;
import defpackage.h04;
import defpackage.it2;
import defpackage.kt2;
import defpackage.mt2;
import defpackage.qs2;
import defpackage.ss2;
import defpackage.tv2;
import defpackage.vy8;
import defpackage.wv2;
import defpackage.ww8;
import defpackage.xe6;
import defpackage.zq3;
import defpackage.zr0;
import java.util.List;
import kotlin.jvm.internal.Lambda;

/* loaded from: classes4.dex */
final class GamesDestinationKt$GamesDestination$4 extends Lambda implements it2 {
    final /* synthetic */ ComponentActivity $activity;
    final /* synthetic */ LazyListState $listState;
    final /* synthetic */ fe4 $mainTabState;
    final /* synthetic */ Modifier $modifier;
    final /* synthetic */ fm9 $tracker;
    final /* synthetic */ GamesViewModel $viewModel;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    GamesDestinationKt$GamesDestination$4(fm9 fm9Var, Modifier modifier, LazyListState lazyListState, GamesViewModel gamesViewModel, fe4 fe4Var, ComponentActivity componentActivity) {
        super(3);
        this.$tracker = fm9Var;
        this.$modifier = modifier;
        this.$listState = lazyListState;
        this.$viewModel = gamesViewModel;
        this.$mainTabState = fe4Var;
        this.$activity = componentActivity;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void g(GamesViewModel gamesViewModel, ComponentActivity componentActivity, int i, String str, int i2, Asset asset) {
        gamesViewModel.p(componentActivity, tv2.d(asset, i, str, i2));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void h(GamesViewModel gamesViewModel, vy8 vy8Var, int i, String str, int i2, GamesDestinationItem gamesDestinationItem) {
        gamesViewModel.q(vy8Var, tv2.e(gamesDestinationItem, i, str, i2, gamesDestinationItem.f()));
    }

    private static final void i(GamesViewModel gamesViewModel, Key key, int i, String str, int i2, String str2, String str3, String str4) {
        gamesViewModel.u(key, i, str, i2, str2, str3, str4);
    }

    static /* synthetic */ void j(GamesViewModel gamesViewModel, Key key, int i, String str, int i2, String str2, String str3, String str4, int i3, Object obj) {
        i(gamesViewModel, key, i, str, i2, (i3 & 32) != 0 ? "" : str2, (i3 & 64) != 0 ? "" : str3, (i3 & 128) != 0 ? "" : str4);
    }

    public final void d(wv2 wv2Var, Composer composer, int i) {
        zq3.h(wv2Var, "viewState");
        if (b.G()) {
            b.S(-1906643409, i, -1, "com.nytimes.android.ribbon.destinations.games.GamesDestination.<anonymous> (GamesDestination.kt:57)");
        }
        fm9 fm9Var = this.$tracker;
        if (fm9Var != null) {
            fm9Var.m(RibbonConfig.GAMES.getId());
        }
        final List c = wv2Var.c();
        final List d = wv2Var.d();
        final GamesLockupData a = wv2Var.a();
        final GamesLockupData b = wv2Var.b();
        final vy8 vy8Var = (vy8) composer.m(CompositionLocalsKt.o());
        Modifier modifier = this.$modifier;
        final LazyListState lazyListState = this.$listState;
        final GamesViewModel gamesViewModel = this.$viewModel;
        final fe4 fe4Var = this.$mainTabState;
        final ComponentActivity componentActivity = this.$activity;
        LazyDslKt.a(modifier, lazyListState, null, false, null, null, null, false, new ss2() { // from class: com.nytimes.android.ribbon.destinations.games.GamesDestinationKt$GamesDestination$4.1
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
                LazyListState lazyListState2 = LazyListState.this;
                List<GamesDestinationItem> list = c;
                final GamesViewModel gamesViewModel2 = gamesViewModel;
                qs2 qs2Var = new qs2() { // from class: com.nytimes.android.ribbon.destinations.games.GamesDestinationKt.GamesDestination.4.1.1
                    {
                        super(0);
                    }

                    @Override // defpackage.qs2
                    /* renamed from: invoke */
                    public final Boolean mo865invoke() {
                        return Boolean.valueOf(GamesViewModel.this.o());
                    }
                };
                final vy8 vy8Var2 = vy8Var;
                final GamesViewModel gamesViewModel3 = gamesViewModel;
                kt2 kt2Var = new kt2() { // from class: com.nytimes.android.ribbon.destinations.games.GamesDestinationKt.GamesDestination.4.1.2
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(4);
                    }

                    public final void b(int i2, String str, int i3, GamesDestinationItem gamesDestinationItem) {
                        zq3.h(str, "blockLabel");
                        zq3.h(gamesDestinationItem, "item");
                        GamesDestinationKt$GamesDestination$4.h(gamesViewModel3, vy8.this, i2, str, i3, gamesDestinationItem);
                    }

                    @Override // defpackage.kt2
                    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
                        b(((Number) obj).intValue(), (String) obj2, ((Number) obj3).intValue(), (GamesDestinationItem) obj4);
                        return ww8.a;
                    }
                };
                final GamesViewModel gamesViewModel4 = gamesViewModel;
                GamesLockupsKt.f(lazyListScope, lazyListState2, list, qs2Var, kt2Var, new mt2() { // from class: com.nytimes.android.ribbon.destinations.games.GamesDestinationKt.GamesDestination.4.1.3
                    {
                        super(5);
                    }

                    public final void b(int i2, String str, Key key, int i3, GamesDestinationItem gamesDestinationItem) {
                        zq3.h(str, "blockLabel");
                        zq3.h(key, TransferTable.COLUMN_KEY);
                        zq3.h(gamesDestinationItem, "item");
                        GamesDestinationKt$GamesDestination$4.j(GamesViewModel.this, key, i2, str, i3, gamesDestinationItem.b(), gamesDestinationItem.f(), null, 128, null);
                    }

                    @Override // defpackage.mt2
                    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
                        b(((Number) obj).intValue(), (String) obj2, (Key) obj3, ((Number) obj4).intValue(), (GamesDestinationItem) obj5);
                        return ww8.a;
                    }
                });
                LazyListState lazyListState3 = LazyListState.this;
                final GamesViewModel gamesViewModel5 = gamesViewModel;
                qs2 qs2Var2 = new qs2() { // from class: com.nytimes.android.ribbon.destinations.games.GamesDestinationKt.GamesDestination.4.1.4
                    {
                        super(0);
                    }

                    @Override // defpackage.qs2
                    /* renamed from: invoke */
                    public final Boolean mo865invoke() {
                        return Boolean.valueOf(GamesViewModel.this.o());
                    }
                };
                final GamesViewModel gamesViewModel6 = gamesViewModel;
                final fe4 fe4Var2 = fe4Var;
                qs2 qs2Var3 = new qs2() { // from class: com.nytimes.android.ribbon.destinations.games.GamesDestinationKt.GamesDestination.4.1.5
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(0);
                    }

                    @Override // defpackage.qs2
                    /* renamed from: invoke */
                    public /* bridge */ /* synthetic */ Object mo865invoke() {
                        m696invoke();
                        return ww8.a;
                    }

                    /* renamed from: invoke, reason: collision with other method in class */
                    public final void m696invoke() {
                        GamesViewModel.this.w();
                        fe4Var2.b().invoke("play");
                    }
                };
                final GamesViewModel gamesViewModel7 = gamesViewModel;
                GamesLockupsKt.g(lazyListScope, lazyListState3, qs2Var2, qs2Var3, new ss2() { // from class: com.nytimes.android.ribbon.destinations.games.GamesDestinationKt.GamesDestination.4.1.6
                    {
                        super(1);
                    }

                    public final void b(Key key) {
                        zq3.h(key, TransferTable.COLUMN_KEY);
                        GamesViewModel.this.v(key);
                    }

                    @Override // defpackage.ss2
                    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                        b((Key) obj);
                        return ww8.a;
                    }
                });
                LazyListState lazyListState4 = LazyListState.this;
                List<GamesLockupData> list2 = d;
                final GamesViewModel gamesViewModel8 = gamesViewModel;
                qs2 qs2Var4 = new qs2() { // from class: com.nytimes.android.ribbon.destinations.games.GamesDestinationKt.GamesDestination.4.1.7
                    {
                        super(0);
                    }

                    @Override // defpackage.qs2
                    /* renamed from: invoke */
                    public final Boolean mo865invoke() {
                        return Boolean.valueOf(GamesViewModel.this.o());
                    }
                };
                final GamesViewModel gamesViewModel9 = gamesViewModel;
                final ComponentActivity componentActivity2 = componentActivity;
                gt2 gt2Var = new gt2() { // from class: com.nytimes.android.ribbon.destinations.games.GamesDestinationKt.GamesDestination.4.1.8
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(2);
                    }

                    public final void b(int i2, Asset asset) {
                        zq3.h(asset, "asset");
                        GamesDestinationKt$GamesDestination$4.g(GamesViewModel.this, componentActivity2, 2, "tips and tricks", i2, asset);
                    }

                    @Override // defpackage.gt2
                    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                        b(((Number) obj).intValue(), (Asset) obj2);
                        return ww8.a;
                    }
                };
                final GamesViewModel gamesViewModel10 = gamesViewModel;
                GamesLockupsKt.h(lazyListScope, lazyListState4, list2, qs2Var4, gt2Var, new it2() { // from class: com.nytimes.android.ribbon.destinations.games.GamesDestinationKt.GamesDestination.4.1.9
                    {
                        super(3);
                    }

                    public final void b(Key key, int i2, Asset asset) {
                        zq3.h(key, TransferTable.COLUMN_KEY);
                        zq3.h(asset, "asset");
                        GamesViewModel gamesViewModel11 = GamesViewModel.this;
                        String url = asset.getUrl();
                        String str = url == null ? "" : url;
                        String uri = asset.getUri();
                        GamesDestinationKt$GamesDestination$4.j(gamesViewModel11, key, 2, "tips and tricks", i2, null, str, uri == null ? "" : uri, 32, null);
                    }

                    @Override // defpackage.it2
                    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
                        b((Key) obj, ((Number) obj2).intValue(), (Asset) obj3);
                        return ww8.a;
                    }
                });
                GamesLockupData gamesLockupData = a;
                final GamesViewModel gamesViewModel11 = gamesViewModel;
                qs2 qs2Var5 = new qs2() { // from class: com.nytimes.android.ribbon.destinations.games.GamesDestinationKt.GamesDestination.4.1.10
                    {
                        super(0);
                    }

                    @Override // defpackage.qs2
                    /* renamed from: invoke */
                    public final Boolean mo865invoke() {
                        return Boolean.valueOf(GamesViewModel.this.o());
                    }
                };
                GamesLockupData gamesLockupData2 = b;
                final GamesViewModel gamesViewModel12 = gamesViewModel;
                final ComponentActivity componentActivity3 = componentActivity;
                gt2 gt2Var2 = new gt2() { // from class: com.nytimes.android.ribbon.destinations.games.GamesDestinationKt.GamesDestination.4.1.11
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(2);
                    }

                    public final void b(int i2, Asset asset) {
                        zq3.h(asset, "asset");
                        GamesDestinationKt$GamesDestination$4.g(GamesViewModel.this, componentActivity3, 3, "games feature", i2, asset);
                    }

                    @Override // defpackage.gt2
                    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                        b(((Number) obj).intValue(), (Asset) obj2);
                        return ww8.a;
                    }
                };
                final GamesViewModel gamesViewModel13 = gamesViewModel;
                GamesLockupsKt.e(lazyListScope, gamesLockupData, qs2Var5, gamesLockupData2, gt2Var2, new it2() { // from class: com.nytimes.android.ribbon.destinations.games.GamesDestinationKt.GamesDestination.4.1.12
                    {
                        super(3);
                    }

                    public final void b(Key key, int i2, Asset asset) {
                        zq3.h(key, TransferTable.COLUMN_KEY);
                        zq3.h(asset, "asset");
                        GamesViewModel gamesViewModel14 = GamesViewModel.this;
                        String url = asset.getUrl();
                        String str = url == null ? "" : url;
                        String uri = asset.getUri();
                        GamesDestinationKt$GamesDestination$4.j(gamesViewModel14, key, 3, "games feature", i2, null, str, uri == null ? "" : uri, 32, null);
                    }

                    @Override // defpackage.it2
                    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
                        b((Key) obj, ((Number) obj2).intValue(), (Asset) obj3);
                        return ww8.a;
                    }
                }, LazyListState.this);
                Key b2 = c58.c.a.b();
                final GamesViewModel gamesViewModel14 = gamesViewModel;
                final ComponentActivity componentActivity4 = componentActivity;
                ss2 ss2Var = new ss2() { // from class: com.nytimes.android.ribbon.destinations.games.GamesDestinationKt.GamesDestination.4.1.13
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(1);
                    }

                    public final void b(Key key) {
                        zq3.h(key, TransferTable.COLUMN_KEY);
                        GamesViewModel.this.t(key, componentActivity4);
                    }

                    @Override // defpackage.ss2
                    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                        b((Key) obj);
                        return ww8.a;
                    }
                };
                LazyListState lazyListState5 = LazyListState.this;
                final GamesViewModel gamesViewModel15 = gamesViewModel;
                qs2 qs2Var6 = new qs2() { // from class: com.nytimes.android.ribbon.destinations.games.GamesDestinationKt.GamesDestination.4.1.14
                    {
                        super(0);
                    }

                    @Override // defpackage.qs2
                    /* renamed from: invoke */
                    public final Boolean mo865invoke() {
                        return Boolean.valueOf(GamesViewModel.this.o());
                    }
                };
                final GamesViewModel gamesViewModel16 = gamesViewModel;
                XpnModuleKt.e(lazyListScope, (r17 & 1) != 0 ? null : null, (r17 & 2) != 0 ? TPLSize.spacing3.m765getValueD9Ej5fM() : 0.0f, b2, ss2Var, lazyListState5, qs2Var6, zr0.c(1629162, true, new it2() { // from class: com.nytimes.android.ribbon.destinations.games.GamesDestinationKt.GamesDestination.4.1.15
                    {
                        super(3);
                    }

                    @Override // defpackage.it2
                    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
                        invoke((h04) obj, (Composer) obj2, ((Number) obj3).intValue());
                        return ww8.a;
                    }

                    public final void invoke(h04 h04Var, Composer composer2, int i2) {
                        zq3.h(h04Var, "$this$xpnModule");
                        if ((i2 & 81) == 16 && composer2.i()) {
                            composer2.K();
                            return;
                        }
                        if (b.G()) {
                            b.S(1629162, i2, -1, "com.nytimes.android.ribbon.destinations.games.GamesDestination.<anonymous>.<anonymous>.<anonymous> (GamesDestination.kt:211)");
                        }
                        int i3 = xe6.ic_games_logo;
                        final GamesViewModel gamesViewModel17 = GamesViewModel.this;
                        XpnHandoffKt.d("Play games, enjoy past puzzles and track streaks and stats.", "Games and All Access subscribers enjoy full access.", i3, "Go to the Games app", new qs2() { // from class: com.nytimes.android.ribbon.destinations.games.GamesDestinationKt.GamesDestination.4.1.15.1
                            {
                                super(0);
                            }

                            @Override // defpackage.qs2
                            /* renamed from: invoke */
                            public /* bridge */ /* synthetic */ Object mo865invoke() {
                                m695invoke();
                                return ww8.a;
                            }

                            /* renamed from: invoke, reason: collision with other method in class */
                            public final void m695invoke() {
                                GamesViewModel.this.n();
                            }
                        }, null, composer2, 3126, 32);
                        if (b.G()) {
                            b.R();
                        }
                    }
                }));
            }
        }, composer, 0, 252);
        if (b.G()) {
            b.R();
        }
    }

    @Override // defpackage.it2
    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
        d((wv2) obj, (Composer) obj2, ((Number) obj3).intValue());
        return ww8.a;
    }
}
