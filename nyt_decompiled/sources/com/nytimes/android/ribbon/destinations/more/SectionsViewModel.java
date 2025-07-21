package com.nytimes.android.ribbon.destinations.more;

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
import defpackage.g90;
import defpackage.nh7;
import defpackage.s42;
import defpackage.tv4;
import defpackage.u32;
import defpackage.y32;
import defpackage.zq3;
import java.util.Locale;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.StateFlow;
import kotlinx.coroutines.flow.StateFlowKt;

/* loaded from: classes4.dex */
public final class SectionsViewModel extends q {
    private final SectionsRepository a;
    private final DestinationEventTracker b;
    private final DestinationTabState c;
    private final MutableStateFlow d;
    private final StateFlow e;

    public SectionsViewModel(SectionsRepository sectionsRepository, DestinationEventTracker destinationEventTracker, DestinationTabState destinationTabState) {
        zq3.h(sectionsRepository, "sectionsRepository");
        zq3.h(destinationEventTracker, "destinationEventTracker");
        zq3.h(destinationTabState, "tabState");
        this.a = sectionsRepository;
        this.b = destinationEventTracker;
        this.c = destinationTabState;
        MutableStateFlow MutableStateFlow = StateFlowKt.MutableStateFlow(DownloadState.c.b);
        this.d = MutableStateFlow;
        this.e = FlowKt.asStateFlow(MutableStateFlow);
    }

    public static /* synthetic */ Job k(SectionsViewModel sectionsViewModel, tv4 tv4Var, int i, Object obj) {
        if ((i & 1) != 0) {
            tv4Var = null;
        }
        return sectionsViewModel.j(tv4Var);
    }

    public final StateFlow g() {
        return this.e;
    }

    public final boolean i() {
        return this.c.d(RibbonConfig.SECTIONS.getId());
    }

    public final Job j(tv4 tv4Var) {
        Job launch$default;
        launch$default = BuildersKt__Builders_commonKt.launch$default(r.a(this), null, null, new SectionsViewModel$refreshList$1(this, tv4Var, null), 3, null);
        return launch$default;
    }

    public final void l(int i, int i2, nh7 nh7Var) {
        zq3.h(nh7Var, "item");
        DestinationEventTracker destinationEventTracker = this.b;
        RibbonConfig ribbonConfig = RibbonConfig.SECTIONS;
        destinationEventTracker.s(ribbonConfig, new s42("open", "section front tap", null, null, null, null, nh7Var.b(), new y32(nh7Var.a(), null, null, null, null, null, 62, null), "sections panel", 60, null), new u32(null, DestinationEventTracker.Companion.a(ribbonConfig), "tap", 1, null), new di0(new g90(null, null, null, Integer.valueOf(i), 2, null), new ai0(null, null, i2, null, null, 27, null), null, 4, null));
    }

    public final void m(Key key, int i, int i2, String str) {
        zq3.h(key, TransferTable.COLUMN_KEY);
        zq3.h(str, "sectionName");
        DestinationEventTracker destinationEventTracker = this.b;
        RibbonConfig ribbonConfig = RibbonConfig.SECTIONS;
        String lowerCase = str.toLowerCase(Locale.ROOT);
        zq3.g(lowerCase, "toLowerCase(...)");
        destinationEventTracker.u(key, ribbonConfig, new s42("section", lowerCase, null, null, null, null, null, null, "sections panel", 252, null), new di0(new g90(null, null, null, Integer.valueOf(i), 2, null), new ai0(null, null, i2, null, null, 27, null), null, 4, null));
    }
}
