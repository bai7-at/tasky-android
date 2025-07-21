package com.nytimes.android.ribbon.destinations.bestof;

import androidx.lifecycle.q;
import androidx.lifecycle.r;
import com.nytimes.android.home.ui.hybrid.DestinationTabState;
import com.nytimes.android.ribbon.config.RibbonTabConfigRepository;
import defpackage.d70;
import defpackage.g70;
import defpackage.zq3;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.StateFlow;
import kotlinx.coroutines.flow.StateFlowKt;

/* loaded from: classes4.dex */
public final class BestOfViewModel extends q {
    private final DestinationTabState a;
    private final RibbonTabConfigRepository b;
    private final MutableStateFlow c;
    private final StateFlow d;

    public BestOfViewModel(DestinationTabState destinationTabState, RibbonTabConfigRepository ribbonTabConfigRepository) {
        zq3.h(destinationTabState, "tabState");
        zq3.h(ribbonTabConfigRepository, "ribbonConfigRepo");
        this.a = destinationTabState;
        this.b = ribbonTabConfigRepository;
        MutableStateFlow MutableStateFlow = StateFlowKt.MutableStateFlow(new g70(null, 1, null));
        this.c = MutableStateFlow;
        this.d = FlowKt.asStateFlow(MutableStateFlow);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:13:0x004b  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object g(defpackage.by0 r5) {
        /*
            r4 = this;
            boolean r0 = r5 instanceof com.nytimes.android.ribbon.destinations.bestof.BestOfViewModel$bestOfConfig$1
            if (r0 == 0) goto L13
            r0 = r5
            com.nytimes.android.ribbon.destinations.bestof.BestOfViewModel$bestOfConfig$1 r0 = (com.nytimes.android.ribbon.destinations.bestof.BestOfViewModel$bestOfConfig$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            com.nytimes.android.ribbon.destinations.bestof.BestOfViewModel$bestOfConfig$1 r0 = new com.nytimes.android.ribbon.destinations.bestof.BestOfViewModel$bestOfConfig$1
            r0.<init>(r4, r5)
        L18:
            java.lang.Object r5 = r0.result
            java.lang.Object r1 = kotlin.coroutines.intrinsics.a.h()
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 != r3) goto L29
            kotlin.f.b(r5)
            goto L3f
        L29:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L31:
            kotlin.f.b(r5)
            com.nytimes.android.ribbon.config.RibbonTabConfigRepository r4 = r4.b
            r0.label = r3
            java.lang.Object r5 = r4.a(r0)
            if (r5 != r1) goto L3f
            return r1
        L3f:
            java.lang.Iterable r5 = (java.lang.Iterable) r5
            java.util.Iterator r4 = r5.iterator()
        L45:
            boolean r5 = r4.hasNext()
            if (r5 == 0) goto L61
            java.lang.Object r5 = r4.next()
            r0 = r5
            com.nytimes.android.api.config.model.RibbonConfigDTO r0 = (com.nytimes.android.api.config.model.RibbonConfigDTO) r0
            java.lang.String r0 = r0.getId()
            java.lang.String r1 = defpackage.d70.a()
            boolean r0 = defpackage.zq3.c(r0, r1)
            if (r0 == 0) goto L45
            goto L62
        L61:
            r5 = 0
        L62:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.nytimes.android.ribbon.destinations.bestof.BestOfViewModel.g(by0):java.lang.Object");
    }

    public final Job i() {
        Job launch$default;
        launch$default = BuildersKt__Builders_commonKt.launch$default(r.a(this), null, null, new BestOfViewModel$checkUrl$1(this, null), 3, null);
        return launch$default;
    }

    public final StateFlow j() {
        return this.d;
    }

    public final boolean k() {
        String str;
        DestinationTabState destinationTabState = this.a;
        str = d70.a;
        return destinationTabState.d(str);
    }
}
