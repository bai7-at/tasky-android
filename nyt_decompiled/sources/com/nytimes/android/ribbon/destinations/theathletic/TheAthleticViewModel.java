package com.nytimes.android.ribbon.destinations.theathletic;

import androidx.activity.ComponentActivity;
import androidx.lifecycle.q;
import androidx.lifecycle.r;
import com.amazonaws.mobileconnectors.s3.transferutility.TransferTable;
import com.nytimes.android.api.cms.Asset;
import com.nytimes.android.api.cms.Image;
import com.nytimes.android.api.cms.ImageDimension;
import com.nytimes.android.coroutinesutils.DownloadState;
import com.nytimes.android.home.ui.hybrid.DestinationTabState;
import com.nytimes.android.ribbon.config.RibbonConfig;
import com.nytimes.android.ribbon.destinations.DestinationAssetRepository;
import com.nytimes.android.ribbon.et2.DestinationEventTracker;
import com.nytimes.android.ribbon.et2.Key;
import defpackage.ai0;
import defpackage.c58;
import defpackage.di0;
import defpackage.g90;
import defpackage.rk8;
import defpackage.s42;
import defpackage.s63;
import defpackage.t63;
import defpackage.tr3;
import defpackage.y25;
import defpackage.zq3;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.StateFlow;
import kotlinx.coroutines.flow.StateFlowKt;

/* loaded from: classes4.dex */
public final class TheAthleticViewModel extends q {
    public static final a Companion = new a(null);
    public static final int h = 8;
    private final DestinationAssetRepository a;
    private final tr3 b;
    private final s63 c;
    private final DestinationEventTracker d;
    private final DestinationTabState e;
    private final MutableStateFlow f;
    private final StateFlow g;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    public TheAthleticViewModel(DestinationAssetRepository destinationAssetRepository, tr3 tr3Var, s63 s63Var, DestinationEventTracker destinationEventTracker, DestinationTabState destinationTabState) {
        zq3.h(destinationAssetRepository, "store");
        zq3.h(tr3Var, "itemToDetailNavigator");
        zq3.h(s63Var, "handoffManager");
        zq3.h(destinationEventTracker, "destinationEventTracker");
        zq3.h(destinationTabState, "tabState");
        this.a = destinationAssetRepository;
        this.b = tr3Var;
        this.c = s63Var;
        this.d = destinationEventTracker;
        this.e = destinationTabState;
        MutableStateFlow MutableStateFlow = StateFlowKt.MutableStateFlow(DownloadState.c.b);
        this.f = MutableStateFlow;
        this.g = FlowKt.asStateFlow(MutableStateFlow);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final String j(Asset asset) {
        Image extractImage = asset.extractImage();
        String credit = extractImage != null ? extractImage.getCredit() : null;
        return credit == null ? "" : credit;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final String k(Asset asset) {
        Image.ImageCrop crops;
        ImageDimension square320;
        Image extractImage = asset.extractImage();
        if (extractImage == null || (crops = extractImage.getCrops()) == null || (square320 = crops.getSquare320()) == null) {
            return null;
        }
        return square320.getUrl();
    }

    public static /* synthetic */ Job q(TheAthleticViewModel theAthleticViewModel, rk8 rk8Var, int i, Object obj) {
        if ((i & 1) != 0) {
            rk8Var = null;
        }
        return theAthleticViewModel.p(rk8Var);
    }

    public final StateFlow l() {
        return this.g;
    }

    public final void m() {
        this.c.b(RibbonConfig.THE_ATHLETIC, c58.f.a);
    }

    public final boolean n() {
        return this.e.d(RibbonConfig.THE_ATHLETIC.getId());
    }

    public final void o(ComponentActivity componentActivity, y25 y25Var) {
        zq3.h(y25Var, "item");
        this.b.a(componentActivity, y25Var);
    }

    public final Job p(rk8 rk8Var) {
        Job launch$default;
        launch$default = BuildersKt__Builders_commonKt.launch$default(r.a(this), null, null, new TheAthleticViewModel$refreshAthleticAssets$1(rk8Var, this, null), 3, null);
        return launch$default;
    }

    public final void r(Key key, ComponentActivity componentActivity) {
        zq3.h(key, TransferTable.COLUMN_KEY);
        DestinationEventTracker destinationEventTracker = this.d;
        RibbonConfig ribbonConfig = RibbonConfig.THE_ATHLETIC;
        c58.f fVar = c58.f.a;
        destinationEventTracker.r(key, ribbonConfig, t63.c(fVar, t63.e(fVar, componentActivity != null ? componentActivity.getPackageManager() : null)));
    }

    public final void s(Key key, int i, String str, int i2, String str2, String str3) {
        zq3.h(key, TransferTable.COLUMN_KEY);
        zq3.h(str, "blockLabel");
        zq3.h(str2, "cardContentUrl");
        zq3.h(str3, "cardContentUri");
        this.d.u(key, RibbonConfig.THE_ATHLETIC, new s42(null, null, null, null, null, null, null, null, "the athletic panel", 255, null), new di0(new g90(str, null, null, Integer.valueOf(i), 2, null), new ai0(str3, str2, i2, null, null, 24, null), null, 4, null));
    }
}
