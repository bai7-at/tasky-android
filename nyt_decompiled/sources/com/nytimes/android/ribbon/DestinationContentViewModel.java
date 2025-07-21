package com.nytimes.android.ribbon;

import androidx.compose.foundation.pager.PagerState;
import androidx.lifecycle.q;
import androidx.lifecycle.r;
import com.amazonaws.mobileconnectors.s3.transferutility.TransferTable;
import com.nytimes.android.api.config.model.RibbonConfigDTO;
import com.nytimes.android.home.ui.hybrid.DestinationTabState;
import com.nytimes.android.ribbon.config.RibbonConfig;
import com.nytimes.android.ribbon.config.RibbonTabConfigRepository;
import com.nytimes.android.ribbon.et2.DestinationEventTracker;
import defpackage.b65;
import defpackage.bn8;
import defpackage.cn8;
import defpackage.in1;
import defpackage.ln1;
import defpackage.wt6;
import defpackage.zq3;
import java.util.Iterator;
import java.util.List;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.StateFlow;
import kotlinx.coroutines.flow.StateFlowKt;

/* loaded from: classes4.dex */
public final class DestinationContentViewModel extends q {
    private final DestinationEventTracker a;
    private final DestinationTabState b;
    private final ln1 c;
    private final RibbonTabConfigRepository d;
    private final cn8 e;
    private final MutableStateFlow f;
    private final StateFlow g;
    private final StateFlow h;
    private final String i;
    private String j;
    private final StateFlow k;

    public DestinationContentViewModel(DestinationEventTracker destinationEventTracker, DestinationTabState destinationTabState, ln1 ln1Var, RibbonTabConfigRepository ribbonTabConfigRepository, cn8 cn8Var, bn8 bn8Var) {
        zq3.h(destinationEventTracker, "destinationEventTracker");
        zq3.h(destinationTabState, "tabState");
        zq3.h(ln1Var, "destinationDeeplinkHandler");
        zq3.h(ribbonTabConfigRepository, "ribbonConfigRepo");
        zq3.h(cn8Var, "todayTabJourney");
        zq3.h(bn8Var, "todayLoadObserver");
        this.a = destinationEventTracker;
        this.b = destinationTabState;
        this.c = ln1Var;
        this.d = ribbonTabConfigRepository;
        this.e = cn8Var;
        MutableStateFlow MutableStateFlow = StateFlowKt.MutableStateFlow(null);
        this.f = MutableStateFlow;
        this.g = FlowKt.asStateFlow(MutableStateFlow);
        this.h = ln1Var.a();
        String id = RibbonConfig.TODAY.getId();
        this.i = id;
        this.j = id;
        this.k = bn8Var.a();
    }

    private final RibbonConfigDTO j(RibbonConfig ribbonConfig) {
        List e;
        in1 in1Var = (in1) this.f.getValue();
        Object obj = null;
        if (in1Var == null || (e = in1Var.e()) == null) {
            return null;
        }
        Iterator it2 = e.iterator();
        while (true) {
            if (!it2.hasNext()) {
                break;
            }
            Object next = it2.next();
            if (zq3.c(((RibbonConfigDTO) next).getId(), ribbonConfig != null ? ribbonConfig.getId() : null)) {
                obj = next;
                break;
            }
        }
        return (RibbonConfigDTO) obj;
    }

    public final b65 i() {
        return this.c.b();
    }

    public final RibbonConfig k() {
        return RibbonConfig.Companion.a(this.b.c());
    }

    public final StateFlow l() {
        return this.h;
    }

    public final StateFlow m() {
        return this.k;
    }

    public final StateFlow n() {
        return this.g;
    }

    public final boolean o(RibbonConfig ribbonConfig) {
        return this.b.d(ribbonConfig != null ? ribbonConfig.getId() : null);
    }

    public final boolean p() {
        return this.b.e() || this.b.d(RibbonConfig.LIFESTYLE.getId());
    }

    public final Job q() {
        Job launch$default;
        launch$default = BuildersKt__Builders_commonKt.launch$default(r.a(this), null, null, new DestinationContentViewModel$loadRibbonConfiguration$1(this, null), 3, null);
        return launch$default;
    }

    public final void r(RibbonConfig ribbonConfig) {
        RibbonConfigDTO j = j(ribbonConfig);
        this.a.o(ribbonConfig, j != null ? j.getUrl() : null);
    }

    public final void s(RibbonConfig ribbonConfig) {
        RibbonConfigDTO j = j(ribbonConfig);
        this.a.p(ribbonConfig, j != null ? j.getUrl() : null);
    }

    public final RibbonConfig t(int i) {
        return RibbonConfig.Companion.a(this.b.f(i));
    }

    public final void u(boolean z) {
        Object value;
        in1 in1Var;
        MutableStateFlow mutableStateFlow = this.f;
        do {
            value = mutableStateFlow.getValue();
            in1Var = (in1) value;
        } while (!mutableStateFlow.compareAndSet(value, in1Var != null ? in1.b(in1Var, null, null, false, z, 7, null) : null));
    }

    public final void v(RibbonConfig ribbonConfig, wt6 wt6Var) {
        RibbonConfigDTO j = j(ribbonConfig);
        this.a.w(ribbonConfig, j != null ? j.getUrl() : null, wt6Var);
    }

    public final void w(List list, PagerState pagerState) {
        zq3.h(list, "tabTitles");
        zq3.h(pagerState, TransferTable.COLUMN_STATE);
        this.b.h(list, this.j, this.i, pagerState);
    }

    public final void x(boolean z) {
        Object value;
        in1 in1Var;
        MutableStateFlow mutableStateFlow = this.f;
        do {
            value = mutableStateFlow.getValue();
            in1Var = (in1) value;
        } while (!mutableStateFlow.compareAndSet(value, in1Var != null ? in1.b(in1Var, null, null, z, false, 11, null) : null));
    }

    public final int y(List list) {
        zq3.h(list, "tabTitles");
        return DestinationTabState.Companion.f(list, this.j);
    }
}
