package com.nytimes.android.ribbon.destinations.games;

import androidx.activity.ComponentActivity;
import androidx.lifecycle.q;
import androidx.lifecycle.r;
import com.amazonaws.mobileconnectors.s3.transferutility.TransferTable;
import com.nytimes.android.api.cms.Asset;
import com.nytimes.android.coroutinesutils.DownloadState;
import com.nytimes.android.coroutinesutils.ParallelStore;
import com.nytimes.android.home.ui.hybrid.DestinationTabState;
import com.nytimes.android.ribbon.config.RibbonConfig;
import com.nytimes.android.ribbon.destinations.DestinationAssetRepository;
import com.nytimes.android.ribbon.et2.DestinationEventTracker;
import com.nytimes.android.ribbon.et2.Key;
import com.nytimes.android.utils.MoshiFileSystemPersister;
import com.nytimes.navigation.ItemToDetailEventSender;
import defpackage.ai0;
import defpackage.c58;
import defpackage.di0;
import defpackage.g90;
import defpackage.j91;
import defpackage.s42;
import defpackage.s63;
import defpackage.ss2;
import defpackage.t63;
import defpackage.tr3;
import defpackage.tv2;
import defpackage.u32;
import defpackage.uu2;
import defpackage.vy8;
import defpackage.wv2;
import defpackage.ww8;
import defpackage.y25;
import defpackage.zq3;
import java.util.List;
import kotlin.collections.i;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.StateFlow;
import kotlinx.coroutines.flow.StateFlowKt;

/* loaded from: classes4.dex */
public final class GamesViewModel extends q {
    private final DestinationAssetRepository a;
    private final tr3 b;
    private final s63 c;
    private final DestinationEventTracker d;
    private final uu2 e;
    private final ItemToDetailEventSender f;
    private final DestinationTabState g;
    private final j91 h;
    private final MoshiFileSystemPersister i;
    private final ParallelStore j;
    private final MutableStateFlow k;
    private final StateFlow l;

    public GamesViewModel(DestinationAssetRepository destinationAssetRepository, tr3 tr3Var, s63 s63Var, DestinationEventTracker destinationEventTracker, uu2 uu2Var, ItemToDetailEventSender itemToDetailEventSender, DestinationTabState destinationTabState, j91 j91Var, MoshiFileSystemPersister moshiFileSystemPersister) {
        zq3.h(destinationAssetRepository, "store");
        zq3.h(tr3Var, "itemToDetailNavigator");
        zq3.h(s63Var, "handoffManager");
        zq3.h(destinationEventTracker, "destinationEventTracker");
        zq3.h(uu2Var, "gamesConfigRepo");
        zq3.h(itemToDetailEventSender, "itemToDetailEventSender");
        zq3.h(destinationTabState, "tabState");
        zq3.h(j91Var, "expirationChecker");
        zq3.h(moshiFileSystemPersister, "gamesAssetsPersister");
        this.a = destinationAssetRepository;
        this.b = tr3Var;
        this.c = s63Var;
        this.d = destinationEventTracker;
        this.e = uu2Var;
        this.f = itemToDetailEventSender;
        this.g = destinationTabState;
        this.h = j91Var;
        this.i = moshiFileSystemPersister;
        this.j = new ParallelStore(new ss2() { // from class: com.nytimes.android.ribbon.destinations.games.GamesViewModel$cachedStore$1
            {
                super(1);
            }

            @Override // defpackage.ss2
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public final Boolean invoke(ww8 ww8Var) {
                j91 j91Var2;
                zq3.h(ww8Var, "it");
                j91Var2 = GamesViewModel.this.h;
                return Boolean.valueOf(j91Var2.e());
            }
        }, new GamesViewModel$cachedStore$2(this, null), new GamesViewModel$cachedStore$3(this, null), null, 0L, 24, null);
        MutableStateFlow MutableStateFlow = StateFlowKt.MutableStateFlow(DownloadState.c.b);
        this.k = MutableStateFlow;
        this.l = FlowKt.asStateFlow(MutableStateFlow);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final wv2 l(List list) {
        List c;
        List b = this.e.b();
        c = tv2.c(i.P0(list, 3));
        Asset asset = (Asset) i.n0(list, 3);
        GamesLockupData b2 = asset != null ? tv2.b(asset) : null;
        Asset asset2 = (Asset) i.n0(list, 4);
        return new wv2(b, c, b2, asset2 != null ? tv2.b(asset2) : null);
    }

    public static /* synthetic */ Job s(GamesViewModel gamesViewModel, wv2 wv2Var, int i, Object obj) {
        if ((i & 1) != 0) {
            wv2Var = null;
        }
        return gamesViewModel.r(wv2Var);
    }

    public final StateFlow m() {
        return this.l;
    }

    public final void n() {
        this.c.b(RibbonConfig.GAMES, c58.c.a);
    }

    public final boolean o() {
        return this.g.d(DestinationEventTracker.Companion.a(RibbonConfig.GAMES));
    }

    public final void p(ComponentActivity componentActivity, y25 y25Var) {
        zq3.h(y25Var, "item");
        if (componentActivity != null) {
            this.b.a(componentActivity, y25Var);
        }
    }

    public final void q(vy8 vy8Var, y25 y25Var) {
        zq3.h(vy8Var, "handler");
        zq3.h(y25Var, "item");
        this.f.a(y25Var);
        vy8Var.a(y25Var.r());
    }

    public final Job r(wv2 wv2Var) {
        Job launch$default;
        launch$default = BuildersKt__Builders_commonKt.launch$default(r.a(this), null, null, new GamesViewModel$refreshGamesAssets$1(this, wv2Var, null), 3, null);
        return launch$default;
    }

    public final void t(Key key, ComponentActivity componentActivity) {
        zq3.h(key, TransferTable.COLUMN_KEY);
        DestinationEventTracker destinationEventTracker = this.d;
        RibbonConfig ribbonConfig = RibbonConfig.GAMES;
        c58.c cVar = c58.c.a;
        destinationEventTracker.r(key, ribbonConfig, t63.c(cVar, t63.e(cVar, componentActivity != null ? componentActivity.getPackageManager() : null)));
    }

    public final void u(Key key, int i, String str, int i2, String str2, String str3, String str4) {
        zq3.h(key, TransferTable.COLUMN_KEY);
        zq3.h(str, "blockLabel");
        zq3.h(str2, "moduleLabel");
        zq3.h(str3, "cardContentUrl");
        zq3.h(str4, "cardContentUri");
        this.d.u(key, RibbonConfig.GAMES, new s42(null, str2, null, null, null, null, null, null, "games panel", 253, null), new di0(new g90(str, null, null, Integer.valueOf(i), 2, null), new ai0(str4, str3, i2, null, null, 24, null), null, 4, null));
    }

    public final void v(Key key) {
        zq3.h(key, TransferTable.COLUMN_KEY);
        this.d.r(key, RibbonConfig.GAMES, new s42("go to play tab", "play today's games in the play tab", null, null, null, null, null, null, "games panel", 252, null));
    }

    public final void w() {
        DestinationEventTracker destinationEventTracker = this.d;
        RibbonConfig ribbonConfig = RibbonConfig.GAMES;
        DestinationEventTracker.t(destinationEventTracker, ribbonConfig, new s42("open tab", "play today's games in the play tab", null, null, null, null, null, null, "games panel", 252, null), new u32(null, DestinationEventTracker.Companion.a(ribbonConfig), "tap", 1, null), null, 8, null);
    }
}
