package com.nytimes.android.ribbon.destinations.wirecutter;

import androidx.activity.ComponentActivity;
import androidx.lifecycle.q;
import androidx.lifecycle.r;
import com.amazonaws.mobileconnectors.s3.transferutility.TransferTable;
import com.nytimes.android.coroutinesutils.DownloadState;
import com.nytimes.android.home.ui.hybrid.DestinationTabState;
import com.nytimes.android.ribbon.config.RibbonConfig;
import com.nytimes.android.ribbon.config.RibbonTabConfigRepository;
import com.nytimes.android.ribbon.destinations.DestinationAssetRepository;
import com.nytimes.android.ribbon.et2.DestinationEventTracker;
import com.nytimes.android.ribbon.et2.Key;
import defpackage.ai0;
import defpackage.c58;
import defpackage.di0;
import defpackage.du8;
import defpackage.g90;
import defpackage.ji9;
import defpackage.s42;
import defpackage.s63;
import defpackage.tr3;
import defpackage.u14;
import defpackage.u32;
import defpackage.ue4;
import defpackage.y25;
import defpackage.y32;
import defpackage.zq3;
import java.util.Map;
import kotlin.collections.t;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.StateFlow;
import kotlinx.coroutines.flow.StateFlowKt;

/* loaded from: classes4.dex */
public final class WirecutterViewModel extends q {
    public static final a Companion = new a(null);
    public static final int m = 8;
    private static final String n = RibbonConfig.WIRECUTTER.getId();
    private final DestinationAssetRepository a;
    private final tr3 b;
    private final NewsletterSubscriptionMutator c;
    private final DestinationEventTracker d;
    private final s63 e;
    private final DestinationTabState f;
    private final RibbonTabConfigRepository g;
    private final MutableStateFlow h;
    private final StateFlow i;
    private final MutableStateFlow j;
    private final MutableStateFlow k;
    private final StateFlow l;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    public WirecutterViewModel(DestinationAssetRepository destinationAssetRepository, tr3 tr3Var, NewsletterSubscriptionMutator newsletterSubscriptionMutator, DestinationEventTracker destinationEventTracker, s63 s63Var, DestinationTabState destinationTabState, RibbonTabConfigRepository ribbonTabConfigRepository) {
        zq3.h(destinationAssetRepository, "store");
        zq3.h(tr3Var, "itemToDetailNavigator");
        zq3.h(newsletterSubscriptionMutator, "newsletterSubscriptionMutator");
        zq3.h(destinationEventTracker, "destinationEventTracker");
        zq3.h(s63Var, "handoffManager");
        zq3.h(destinationTabState, "tabState");
        zq3.h(ribbonTabConfigRepository, "ribbonConfigRepo");
        this.a = destinationAssetRepository;
        this.b = tr3Var;
        this.c = newsletterSubscriptionMutator;
        this.d = destinationEventTracker;
        this.e = s63Var;
        this.f = destinationTabState;
        this.g = ribbonTabConfigRepository;
        MutableStateFlow MutableStateFlow = StateFlowKt.MutableStateFlow(DownloadState.c.b);
        this.h = MutableStateFlow;
        this.i = FlowKt.asStateFlow(MutableStateFlow);
        this.j = StateFlowKt.MutableStateFlow(u14.b.b);
        MutableStateFlow MutableStateFlow2 = StateFlowKt.MutableStateFlow(Boolean.FALSE);
        this.k = MutableStateFlow2;
        this.l = FlowKt.asStateFlow(MutableStateFlow2);
        t(WirecutterLockupsKt.e().b());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:13:0x004b  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object B(defpackage.by0 r5) {
        /*
            r4 = this;
            boolean r0 = r5 instanceof com.nytimes.android.ribbon.destinations.wirecutter.WirecutterViewModel$wirecutterConfig$1
            if (r0 == 0) goto L13
            r0 = r5
            com.nytimes.android.ribbon.destinations.wirecutter.WirecutterViewModel$wirecutterConfig$1 r0 = (com.nytimes.android.ribbon.destinations.wirecutter.WirecutterViewModel$wirecutterConfig$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            com.nytimes.android.ribbon.destinations.wirecutter.WirecutterViewModel$wirecutterConfig$1 r0 = new com.nytimes.android.ribbon.destinations.wirecutter.WirecutterViewModel$wirecutterConfig$1
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
            com.nytimes.android.ribbon.config.RibbonTabConfigRepository r4 = r4.g
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
            java.lang.String r1 = com.nytimes.android.ribbon.destinations.wirecutter.WirecutterViewModel.n
            boolean r0 = defpackage.zq3.c(r0, r1)
            if (r0 == 0) goto L45
            goto L60
        L5f:
            r5 = 0
        L60:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.nytimes.android.ribbon.destinations.wirecutter.WirecutterViewModel.B(by0):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object n(defpackage.by0 r5) {
        /*
            r4 = this;
            boolean r0 = r5 instanceof com.nytimes.android.ribbon.destinations.wirecutter.WirecutterViewModel$getNewsletterData$1
            if (r0 == 0) goto L13
            r0 = r5
            com.nytimes.android.ribbon.destinations.wirecutter.WirecutterViewModel$getNewsletterData$1 r0 = (com.nytimes.android.ribbon.destinations.wirecutter.WirecutterViewModel$getNewsletterData$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            com.nytimes.android.ribbon.destinations.wirecutter.WirecutterViewModel$getNewsletterData$1 r0 = new com.nytimes.android.ribbon.destinations.wirecutter.WirecutterViewModel$getNewsletterData$1
            r0.<init>(r4, r5)
        L18:
            java.lang.Object r5 = r0.result
            java.lang.Object r1 = kotlin.coroutines.intrinsics.a.h()
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L33
            if (r2 != r3) goto L2b
            kotlin.f.b(r5)     // Catch: java.lang.Exception -> L29
            goto L41
        L29:
            r4 = move-exception
            goto L44
        L2b:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L33:
            kotlin.f.b(r5)
            com.nytimes.android.ribbon.destinations.DestinationAssetRepository r4 = r4.a     // Catch: java.lang.Exception -> L29
            r0.label = r3     // Catch: java.lang.Exception -> L29
            java.lang.Object r5 = r4.p(r0)     // Catch: java.lang.Exception -> L29
            if (r5 != r1) goto L41
            return r1
        L41:
            fi9 r5 = (defpackage.fi9) r5     // Catch: java.lang.Exception -> L29
            goto L48
        L44:
            com.nytimes.android.logging.NYTLogger.h(r4)
            r5 = 0
        L48:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.nytimes.android.ribbon.destinations.wirecutter.WirecutterViewModel.n(by0):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void t(String str) {
        BuildersKt__Builders_commonKt.launch$default(r.a(this), null, null, new WirecutterViewModel$readAndUpdateSubscriptionStatus$1(this, str, null), 3, null);
    }

    public static /* synthetic */ Job v(WirecutterViewModel wirecutterViewModel, ji9 ji9Var, int i, Object obj) {
        if ((i & 1) != 0) {
            ji9Var = null;
        }
        return wirecutterViewModel.u(ji9Var);
    }

    private final void y() {
        String str = !((Boolean) this.k.getValue()).booleanValue() ? "subscribe" : "not subscribe";
        DestinationEventTracker destinationEventTracker = this.d;
        RibbonConfig ribbonConfig = RibbonConfig.WIRECUTTER;
        destinationEventTracker.s(ribbonConfig, new s42("newsletter", "sign up", null, null, null, null, null, new y32(null, null, null, str, null, null, 55, null), "wirecutter panel", 124, null), new u32(null, DestinationEventTracker.Companion.a(ribbonConfig), "tap", 1, null), new ue4(du8.a("newsletter", t.m(du8.a("product", "WCD"), du8.a("productName", "The Recommendation")))));
    }

    public final void A(String str) {
        zq3.h(str, "newsletterCode");
        y();
        BuildersKt__Builders_commonKt.launch$default(r.a(this), null, null, new WirecutterViewModel$toggleNewsletterSubscription$1(this, str, null), 3, null);
    }

    public final StateFlow o() {
        return this.i;
    }

    public final void p(ComponentActivity componentActivity) {
        this.e.a(c58.g.a, componentActivity);
    }

    public final boolean q() {
        return this.f.d(n);
    }

    public final StateFlow r() {
        return this.l;
    }

    public final void s(ComponentActivity componentActivity, y25 y25Var) {
        zq3.h(y25Var, "item");
        if (componentActivity != null) {
            this.b.b(y25Var, componentActivity, null);
        }
    }

    public final Job u(ji9 ji9Var) {
        Job launch$default;
        launch$default = BuildersKt__Builders_commonKt.launch$default(r.a(this), null, null, new WirecutterViewModel$refreshWirecutterAssets$1(this, ji9Var, null), 3, null);
        return launch$default;
    }

    public final void w(Key key) {
        zq3.h(key, TransferTable.COLUMN_KEY);
        this.d.r(key, RibbonConfig.WIRECUTTER, new s42("go to wirecutter", null, null, null, null, null, null, null, "wirecutter panel", 254, null));
    }

    public final void x(Key key, int i, String str, int i2, String str2, String str3, String str4, Map map) {
        zq3.h(key, TransferTable.COLUMN_KEY);
        zq3.h(str, "blockLabel");
        zq3.h(str2, "contentUri");
        zq3.h(str3, "cardContentUrl");
        zq3.h(str4, "cardContentUri");
        this.d.u(key, RibbonConfig.WIRECUTTER, new s42(null, str2, null, null, null, null, null, null, "wirecutter panel", 253, null), new di0(new g90(str, null, null, Integer.valueOf(i), 2, null), new ai0(str4, str3, i2, null, null, 24, null), map));
    }

    public final void z(Key key) {
        zq3.h(key, TransferTable.COLUMN_KEY);
        this.d.r(key, RibbonConfig.WIRECUTTER, new s42("newsletter sign up", "the recommendation", null, null, null, null, null, null, "wirecutter panel", 252, null));
    }
}
