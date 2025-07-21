package com.nytimes.android.ribbon.destinations.greatreads;

import androidx.activity.ComponentActivity;
import androidx.lifecycle.q;
import androidx.lifecycle.r;
import com.amazonaws.mobileconnectors.s3.transferutility.TransferTable;
import com.nytimes.android.coroutinesutils.DownloadState;
import com.nytimes.android.home.ui.hybrid.DestinationTabState;
import com.nytimes.android.ribbon.config.RibbonConfig;
import com.nytimes.android.ribbon.et2.DestinationEventTracker;
import com.nytimes.android.ribbon.et2.Key;
import defpackage.ai0;
import defpackage.di0;
import defpackage.e33;
import defpackage.g90;
import defpackage.i33;
import defpackage.s42;
import defpackage.tr3;
import defpackage.y25;
import defpackage.zq3;
import java.util.Map;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.StateFlow;
import kotlinx.coroutines.flow.StateFlowKt;

/* loaded from: classes4.dex */
public final class GreatReadsViewModel extends q {
    private final e33 a;
    private final tr3 b;
    private final DestinationEventTracker c;
    private final DestinationTabState d;
    private final MutableStateFlow e;
    private final StateFlow f;

    public GreatReadsViewModel(e33 e33Var, tr3 tr3Var, DestinationEventTracker destinationEventTracker, DestinationTabState destinationTabState) {
        zq3.h(e33Var, "greatReadsRepository");
        zq3.h(tr3Var, "itemToDetailNavigator");
        zq3.h(destinationEventTracker, "destinationEventTracker");
        zq3.h(destinationTabState, "tabState");
        this.a = e33Var;
        this.b = tr3Var;
        this.c = destinationEventTracker;
        this.d = destinationTabState;
        MutableStateFlow MutableStateFlow = StateFlowKt.MutableStateFlow(DownloadState.c.b);
        this.e = MutableStateFlow;
        this.f = FlowKt.asStateFlow(MutableStateFlow);
    }

    public static /* synthetic */ Job l(GreatReadsViewModel greatReadsViewModel, i33 i33Var, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            i33Var = null;
        }
        if ((i & 2) != 0) {
            z = false;
        }
        return greatReadsViewModel.k(i33Var, z);
    }

    public final StateFlow g() {
        return this.f;
    }

    public final boolean i() {
        return this.d.d(RibbonConfig.GREAT_READS.getId());
    }

    public final void j(ComponentActivity componentActivity, y25 y25Var) {
        zq3.h(y25Var, "item");
        this.b.a(componentActivity, y25Var);
    }

    public final Job k(i33 i33Var, boolean z) {
        Job launch$default;
        launch$default = BuildersKt__Builders_commonKt.launch$default(r.a(this), null, null, new GreatReadsViewModel$refreshGreatReadsArticles$1(this, i33Var, z, null), 3, null);
        return launch$default;
    }

    public final void m(Key key) {
        zq3.h(key, TransferTable.COLUMN_KEY);
        this.c.r(key, RibbonConfig.GREAT_READS, new s42("view more great reads", null, null, null, null, null, null, null, "great reads panel", 254, null));
    }

    public final void n(Key key, int i, String str, String str2, Map map) {
        zq3.h(key, TransferTable.COLUMN_KEY);
        zq3.h(str, "cardContentUrl");
        zq3.h(str2, "cardContentUri");
        this.c.u(key, RibbonConfig.GREAT_READS, new s42(null, null, null, null, null, null, null, null, "great reads panel", 255, null), new di0(new g90("", null, null, 0, 2, null), new ai0(str2, str, i, null, null, 24, null), map));
    }
}
