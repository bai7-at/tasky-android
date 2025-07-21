package com.nytimes.android.ribbon.destinations.opinions;

import androidx.activity.ComponentActivity;
import androidx.lifecycle.q;
import androidx.lifecycle.r;
import com.amazonaws.mobileconnectors.s3.transferutility.TransferTable;
import com.nytimes.android.api.cms.Asset;
import com.nytimes.android.coroutinesutils.CachedParallelStore;
import com.nytimes.android.coroutinesutils.DownloadState;
import com.nytimes.android.home.ui.hybrid.DestinationTabState;
import com.nytimes.android.ribbon.config.RibbonConfig;
import com.nytimes.android.ribbon.config.RibbonTabConfigRepository;
import com.nytimes.android.ribbon.destinations.DestinationAssetRepository;
import com.nytimes.android.ribbon.et2.DestinationEventTracker;
import com.nytimes.android.ribbon.et2.Key;
import defpackage.ai0;
import defpackage.di0;
import defpackage.g90;
import defpackage.s42;
import defpackage.tr3;
import defpackage.y25;
import defpackage.zq3;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.collections.i;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.StateFlow;
import kotlinx.coroutines.flow.StateFlowKt;

/* loaded from: classes4.dex */
public final class OpinionsViewModel extends q {
    public static final a Companion = new a(null);
    public static final int i = 8;
    private static final String j = RibbonConfig.OPINION.getId();
    private final DestinationAssetRepository a;
    private final tr3 b;
    private final DestinationEventTracker c;
    private final DestinationTabState d;
    private final RibbonTabConfigRepository e;
    private final MutableStateFlow f;
    private final StateFlow g;
    private final CachedParallelStore h;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    public OpinionsViewModel(DestinationAssetRepository destinationAssetRepository, tr3 tr3Var, DestinationEventTracker destinationEventTracker, DestinationTabState destinationTabState, RibbonTabConfigRepository ribbonTabConfigRepository) {
        zq3.h(destinationAssetRepository, "store");
        zq3.h(tr3Var, "itemToDetailNavigator");
        zq3.h(destinationEventTracker, "destinationEventTracker");
        zq3.h(destinationTabState, "tabState");
        zq3.h(ribbonTabConfigRepository, "ribbonConfigRepo");
        this.a = destinationAssetRepository;
        this.b = tr3Var;
        this.c = destinationEventTracker;
        this.d = destinationTabState;
        this.e = ribbonTabConfigRepository;
        MutableStateFlow MutableStateFlow = StateFlowKt.MutableStateFlow(DownloadState.c.b);
        this.f = MutableStateFlow;
        this.g = FlowKt.asStateFlow(MutableStateFlow);
        this.h = destinationAssetRepository.g("opinion", OpinionsViewState.Companion.serializer(), new OpinionsViewModel$cachedStore$1(this, null));
    }

    private final List j(List list, List list2) {
        List list3 = list;
        ArrayList arrayList = new ArrayList(i.w(list3, 10));
        Iterator it2 = list3.iterator();
        while (it2.hasNext()) {
            arrayList.add(((OpinionItemLockupData) it2.next()).d());
        }
        Set c1 = i.c1(arrayList);
        ArrayList arrayList2 = new ArrayList();
        for (Object obj : list2) {
            if (!i.c0(c1, ((Asset) obj).getUrl())) {
                arrayList2.add(obj);
            }
        }
        return arrayList2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:16:0x00bb A[LOOP:0: B:14:0x00b5->B:16:0x00bb, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x009a A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:27:0x009b  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0071  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0083 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0084  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0076  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0056  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0027  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object k(defpackage.by0 r9) {
        /*
            Method dump skipped, instructions count: 207
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.nytimes.android.ribbon.destinations.opinions.OpinionsViewModel.k(by0):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:13:0x004b  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object o(defpackage.by0 r5) {
        /*
            r4 = this;
            boolean r0 = r5 instanceof com.nytimes.android.ribbon.destinations.opinions.OpinionsViewModel$opinionsConfig$1
            if (r0 == 0) goto L13
            r0 = r5
            com.nytimes.android.ribbon.destinations.opinions.OpinionsViewModel$opinionsConfig$1 r0 = (com.nytimes.android.ribbon.destinations.opinions.OpinionsViewModel$opinionsConfig$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            com.nytimes.android.ribbon.destinations.opinions.OpinionsViewModel$opinionsConfig$1 r0 = new com.nytimes.android.ribbon.destinations.opinions.OpinionsViewModel$opinionsConfig$1
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
            com.nytimes.android.ribbon.config.RibbonTabConfigRepository r4 = r4.e
            r0.label = r3
            java.lang.Object r5 = r4.a(r0)
            if (r5 != r1) goto L3f
            return r1
        L3f:
            java.lang.Iterable r5 = (java.lang.Iterable) r5
            java.util.Iterator r4 = r5.iterator()
        L45:
            boolean r5 = r4.hasNext()
            if (r5 == 0) goto L5f
            java.lang.Object r5 = r4.next()
            r0 = r5
            com.nytimes.android.api.config.model.RibbonConfigDTO r0 = (com.nytimes.android.api.config.model.RibbonConfigDTO) r0
            java.lang.String r0 = r0.getId()
            java.lang.String r1 = com.nytimes.android.ribbon.destinations.opinions.OpinionsViewModel.j
            boolean r0 = defpackage.zq3.c(r0, r1)
            if (r0 == 0) goto L45
            goto L60
        L5f:
            r5 = 0
        L60:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.nytimes.android.ribbon.destinations.opinions.OpinionsViewModel.o(by0):java.lang.Object");
    }

    public static /* synthetic */ Job q(OpinionsViewModel opinionsViewModel, OpinionsViewState opinionsViewState, boolean z, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            opinionsViewState = null;
        }
        if ((i2 & 2) != 0) {
            z = false;
        }
        return opinionsViewModel.p(opinionsViewState, z);
    }

    public final StateFlow l() {
        return this.g;
    }

    public final boolean m() {
        return this.d.d(RibbonConfig.OPINION.getId());
    }

    public final void n(ComponentActivity componentActivity, y25 y25Var) {
        zq3.h(y25Var, "item");
        this.b.a(componentActivity, y25Var);
    }

    public final Job p(OpinionsViewState opinionsViewState, boolean z) {
        Job launch$default;
        launch$default = BuildersKt__Builders_commonKt.launch$default(r.a(this), null, null, new OpinionsViewModel$refreshOpinionAssets$1(this, z, opinionsViewState, null), 3, null);
        return launch$default;
    }

    public final void r(Key key, int i2, String str, int i3, String str2, String str3, Map map) {
        zq3.h(key, TransferTable.COLUMN_KEY);
        zq3.h(str, "blockLabel");
        zq3.h(str2, "cardContentUrl");
        zq3.h(str3, "cardContentUri");
        this.c.u(key, RibbonConfig.OPINION, new s42(null, null, null, null, null, null, null, null, "opinion panel", 255, null), new di0(new g90(str, null, null, Integer.valueOf(i2), 2, null), new ai0(str3, str2, i3, null, null, 24, null), map));
    }
}
