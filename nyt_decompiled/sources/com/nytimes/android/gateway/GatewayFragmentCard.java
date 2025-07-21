package com.nytimes.android.gateway;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.activity.result.ActivityResult;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.f;
import com.nytimes.abtests.GrowthUIPaywallVariants;
import com.nytimes.abtests.GrowthUIWordlebotPaywallVariants;
import com.nytimes.android.ArticlePageEventSender;
import com.nytimes.android.abra.AbraManager;
import com.nytimes.android.api.cms.Asset;
import com.nytimes.android.eventtracker.context.PageContext;
import com.nytimes.android.eventtracker.pagetracker.scope.ET2CoroutineScope;
import com.nytimes.android.eventtracker.pagetracker.scope.ET2CoroutineScopeKt;
import com.nytimes.android.gateway.GatewayFragmentCard;
import com.nytimes.android.gateway.GatewayPresenterImpl;
import com.nytimes.android.growthui.common.models.DataConfigId;
import com.nytimes.android.growthui.paywall.PaywallDialogFragment;
import com.nytimes.android.messaging.OfflineCard;
import com.nytimes.android.messaging.regiwall.DismissibleRegiwallCard;
import com.nytimes.android.messaging.regiwall.RegiwallCard;
import com.nytimes.android.messaging.truncator.TruncatorCard;
import com.nytimes.android.meter.MeterServiceResponse;
import com.nytimes.android.utils.AppPreferences;
import defpackage.d5;
import defpackage.du8;
import defpackage.e44;
import defpackage.ei6;
import defpackage.i5;
import defpackage.id9;
import defpackage.j5;
import defpackage.jk;
import defpackage.kw2;
import defpackage.ng6;
import defpackage.s55;
import defpackage.sw2;
import defpackage.tx1;
import defpackage.uy3;
import defpackage.zq3;
import kotlin.collections.t;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;

/* loaded from: classes4.dex */
public class GatewayFragmentCard extends b implements com.nytimes.android.gateway.a, kw2 {
    public static final a Companion = new a(null);
    public static final int h = 8;
    public AbraManager abraManager;
    public AppPreferences appPreferences;
    public ArticlePageEventSender articlePageEventSender;
    public DismissibleRegiwallCard dismissibleRegiwallCard;
    public ET2CoroutineScope f;
    private final j5 g;
    public GatewayFragmentManager gatewayFragmentManager;
    public sw2 gatewayPresenter;
    public uy3 launchProductLandingHelper;
    public OfflineCard offlineCard;
    public RegiwallCard regiwallCard;
    public TruncatorCard truncatorCard;
    public id9 webActivityNavigator;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final GatewayFragmentCard a(Asset asset, String str, int i, int i2, boolean z, boolean z2, boolean z3, String str2, boolean z4, String str3, String str4) {
            zq3.h(str, "assetType");
            zq3.h(str2, "gatewayType");
            zq3.h(str3, "assetUrl");
            zq3.h(str4, "grantReason");
            GatewayFragmentCard gatewayFragmentCard = new GatewayFragmentCard();
            Bundle bundle = new Bundle();
            bundle.putLong("ARG_ASSET_ID", asset != null ? asset.getAssetId() : 0L);
            bundle.putString("ARG_ASSET_URL", str3);
            String safeUri = asset != null ? asset.getSafeUri() : null;
            if (safeUri == null) {
                safeUri = "";
            }
            bundle.putString("ARG_ASSET_URI", safeUri);
            bundle.putString("ARG_ASSET_TYPE", str);
            bundle.putInt("ARG_METER_VIEWS", i);
            bundle.putInt("ARG_METER_TOTAL", i2);
            bundle.putBoolean("ARG_CAN_VIEW_ARTICLE", z);
            bundle.putBoolean("ARG_METER_COUNTED", z2);
            bundle.putBoolean("ARG_DEVICE_OFFLINE", z3);
            bundle.putString("ARG_GATEWAY_TYPE", str2);
            bundle.putBoolean("ARG_TRUNCATOR_ACTIVE", z4);
            bundle.putString("ARG_GRANT_REASON", str4);
            gatewayFragmentCard.setArguments(bundle);
            return gatewayFragmentCard;
        }

        private a() {
        }
    }

    public GatewayFragmentCard() {
        j5 registerForActivityResult = registerForActivityResult(new i5(), new d5() { // from class: ow2
            @Override // defpackage.d5
            public final void a(Object obj) {
                GatewayFragmentCard.m1(GatewayFragmentCard.this, (ActivityResult) obj);
            }
        });
        zq3.g(registerForActivityResult, "registerForActivityResult(...)");
        this.g = registerForActivityResult;
    }

    private final void d1() {
        RegiwallCard k1 = k1();
        View view = getView();
        k1.j(this, view != null ? view.findViewById(ng6.gatewayContainer) : null);
        OfflineCard j1 = j1();
        View view2 = getView();
        j1.init(this, view2 != null ? view2.findViewById(ng6.offlineContainer) : null);
        DismissibleRegiwallCard f1 = f1();
        View view3 = getView();
        View findViewById = view3 != null ? view3.findViewById(ng6.dismissibleContainer) : null;
        f activity = getActivity();
        zq3.f(activity, "null cannot be cast to non-null type androidx.appcompat.app.AppCompatActivity");
        f1.h(this, findViewById, (jk) activity);
        TruncatorCard l1 = l1();
        View view4 = getView();
        View findViewById2 = view4 != null ? view4.findViewById(ng6.truncatorContainer) : null;
        tx1 c = getEt2Scope().c();
        zq3.e(c);
        l1.init(this, findViewById2, c.i());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void m1(GatewayFragmentCard gatewayFragmentCard, ActivityResult activityResult) {
        f activity;
        zq3.h(gatewayFragmentCard, "this$0");
        if (activityResult.b() != 0 || (activity = gatewayFragmentCard.getActivity()) == null) {
            return;
        }
        activity.finish();
    }

    private final void n1() {
        PageContext pageContext;
        tx1 c = getEt2Scope().c();
        if (c == null || (pageContext = c.i()) == null) {
            pageContext = new PageContext(null, null, null, null, 0, 31, null);
        }
        AbraManager abraManager = getAbraManager();
        GrowthUIPaywallVariants.a aVar = GrowthUIPaywallVariants.Companion;
        abraManager.exposeTest(aVar.a().getTestName(), t.f(du8.a("pageContext", pageContext)));
        if (aVar.b(getAbraManager())) {
            PaywallDialogFragment.a aVar2 = PaywallDialogFragment.Companion;
            FragmentManager parentFragmentManager = getParentFragmentManager();
            zq3.g(parentFragmentManager, "getParentFragmentManager(...)");
            PaywallDialogFragment.a.b(aVar2, parentFragmentManager, DataConfigId.AllAccessPaywall, null, 4, null);
            return;
        }
        j5 j5Var = this.g;
        uy3 i1 = i1();
        f activity = getActivity();
        zq3.f(activity, "null cannot be cast to non-null type androidx.appcompat.app.AppCompatActivity");
        j5Var.a(i1.d((jk) activity));
    }

    private final void o1(s55 s55Var) {
        BuildersKt__Builders_commonKt.launch$default(e44.a(this), null, null, new GatewayFragmentCard$trackPage$1(this, s55Var, null), 3, null);
    }

    @Override // defpackage.kw2
    public void A() {
        View view = getView();
        if (view == null) {
            return;
        }
        view.setVisibility(8);
    }

    @Override // com.nytimes.android.gateway.a
    public void C(boolean z) {
        PageContext pageContext;
        tx1 c = getEt2Scope().c();
        if (c == null || (pageContext = c.i()) == null) {
            pageContext = new PageContext(null, null, null, null, 0, 31, null);
        }
        AbraManager abraManager = getAbraManager();
        GrowthUIWordlebotPaywallVariants.a aVar = GrowthUIWordlebotPaywallVariants.Companion;
        abraManager.exposeTest(aVar.a().getTestName(), t.f(du8.a("pageContext", pageContext)));
        if (aVar.b(getAbraManager())) {
            PaywallDialogFragment.a aVar2 = PaywallDialogFragment.Companion;
            FragmentManager parentFragmentManager = getParentFragmentManager();
            zq3.g(parentFragmentManager, "getParentFragmentManager(...)");
            PaywallDialogFragment.a.b(aVar2, parentFragmentManager, DataConfigId.WordlebotPaywall, null, 4, null);
            return;
        }
        i1().e(z);
        if (z) {
            s0();
        }
    }

    @Override // com.nytimes.android.gateway.a
    public void C0() {
        View view = getView();
        if (view == null) {
            return;
        }
        view.setVisibility(0);
    }

    @Override // defpackage.kw2
    public void K0(boolean z) {
        f activity = getActivity();
        jk jkVar = activity instanceof jk ? (jk) activity : null;
        if (jkVar != null) {
            BuildersKt__Builders_commonKt.launch$default(e44.a(jkVar), null, null, new GatewayFragmentCard$onGatewayLoginButton$1$1(this, z, jkVar, null), 3, null);
        }
    }

    @Override // com.nytimes.android.gateway.a
    public GatewayPresenterImpl.a N0() {
        Bundle arguments = getArguments();
        long j = arguments != null ? arguments.getLong("ARG_ASSET_ID") : 0L;
        Bundle arguments2 = getArguments();
        String string = arguments2 != null ? arguments2.getString("ARG_ASSET_URL") : null;
        String str = string == null ? "" : string;
        Bundle arguments3 = getArguments();
        String string2 = arguments3 != null ? arguments3.getString("ARG_ASSET_URI") : null;
        String str2 = string2 == null ? "" : string2;
        Bundle arguments4 = getArguments();
        String string3 = arguments4 != null ? arguments4.getString("ARG_ASSET_TYPE") : null;
        String str3 = string3 == null ? "" : string3;
        GatewayFragmentManager g1 = g1();
        Bundle arguments5 = getArguments();
        int i = arguments5 != null ? arguments5.getInt("ARG_METER_TOTAL") : 0;
        Bundle arguments6 = getArguments();
        int i2 = arguments6 != null ? arguments6.getInt("ARG_METER_VIEWS") : 0;
        Bundle arguments7 = getArguments();
        boolean z = arguments7 != null ? arguments7.getBoolean("ARG_CAN_VIEW_ARTICLE") : false;
        Bundle arguments8 = getArguments();
        boolean z2 = arguments8 != null ? arguments8.getBoolean("ARG_METER_COUNTED") : false;
        Bundle arguments9 = getArguments();
        String string4 = arguments9 != null ? arguments9.getString("ARG_GATEWAY_TYPE") : null;
        String str4 = string4 == null ? "" : string4;
        String a2 = e1().a();
        String str5 = a2 == null ? "" : a2;
        Bundle arguments10 = getArguments();
        boolean z3 = arguments10 != null ? arguments10.getBoolean("ARG_DEVICE_OFFLINE") : false;
        Bundle arguments11 = getArguments();
        boolean z4 = arguments11 != null ? arguments11.getBoolean("ARG_TRUNCATOR_ACTIVE") : false;
        Bundle arguments12 = getArguments();
        String string5 = arguments12 != null ? arguments12.getString("ARG_GRANT_REASON") : null;
        return new GatewayPresenterImpl.a(j, str, str2, str3, g1, i, i2, z, z2, str4, str5, z3, z4, false, string5 == null ? "" : string5, 8192, null);
    }

    @Override // com.nytimes.android.gateway.a
    public void O(boolean z, String str) {
        zq3.h(str, "gatewayType");
        if (zq3.c(str, "REGIWALL")) {
            k1().m(z);
            o1(s55.k.c);
        } else if (zq3.c(str, "PAYWALL")) {
            n1();
        }
    }

    @Override // com.nytimes.android.gateway.a
    public void P0() {
        View view = getView();
        if (view == null) {
            return;
        }
        view.setVisibility(8);
    }

    @Override // com.nytimes.android.gateway.a
    public void X() {
        f activity = getActivity();
        if (activity != null) {
            activity.invalidateOptionsMenu();
        }
    }

    @Override // defpackage.kw2
    public void Z() {
        f activity = getActivity();
        jk jkVar = activity instanceof jk ? (jk) activity : null;
        if (jkVar != null) {
            BuildersKt__Builders_commonKt.launch$default(e44.a(jkVar), null, null, new GatewayFragmentCard$onGatewayActionButton$1$1(this, jkVar, null), 3, null);
        }
    }

    public final ArticlePageEventSender e1() {
        ArticlePageEventSender articlePageEventSender = this.articlePageEventSender;
        if (articlePageEventSender != null) {
            return articlePageEventSender;
        }
        zq3.z("articlePageEventSender");
        return null;
    }

    public final DismissibleRegiwallCard f1() {
        DismissibleRegiwallCard dismissibleRegiwallCard = this.dismissibleRegiwallCard;
        if (dismissibleRegiwallCard != null) {
            return dismissibleRegiwallCard;
        }
        zq3.z("dismissibleRegiwallCard");
        return null;
    }

    @Override // defpackage.kw2
    public void g0() {
        P0();
    }

    public final GatewayFragmentManager g1() {
        GatewayFragmentManager gatewayFragmentManager = this.gatewayFragmentManager;
        if (gatewayFragmentManager != null) {
            return gatewayFragmentManager;
        }
        zq3.z("gatewayFragmentManager");
        return null;
    }

    public final AbraManager getAbraManager() {
        AbraManager abraManager = this.abraManager;
        if (abraManager != null) {
            return abraManager;
        }
        zq3.z("abraManager");
        return null;
    }

    public final ET2CoroutineScope getEt2Scope() {
        ET2CoroutineScope eT2CoroutineScope = this.f;
        if (eT2CoroutineScope != null) {
            return eT2CoroutineScope;
        }
        zq3.z("et2Scope");
        return null;
    }

    public final id9 getWebActivityNavigator() {
        id9 id9Var = this.webActivityNavigator;
        if (id9Var != null) {
            return id9Var;
        }
        zq3.z("webActivityNavigator");
        return null;
    }

    public final sw2 h1() {
        sw2 sw2Var = this.gatewayPresenter;
        if (sw2Var != null) {
            return sw2Var;
        }
        zq3.z("gatewayPresenter");
        return null;
    }

    @Override // com.nytimes.android.gateway.a
    public CoroutineScope i0() {
        return e44.a(this);
    }

    public final uy3 i1() {
        uy3 uy3Var = this.launchProductLandingHelper;
        if (uy3Var != null) {
            return uy3Var;
        }
        zq3.z("launchProductLandingHelper");
        return null;
    }

    public final OfflineCard j1() {
        OfflineCard offlineCard = this.offlineCard;
        if (offlineCard != null) {
            return offlineCard;
        }
        zq3.z("offlineCard");
        return null;
    }

    public final RegiwallCard k1() {
        RegiwallCard regiwallCard = this.regiwallCard;
        if (regiwallCard != null) {
            return regiwallCard;
        }
        zq3.z("regiwallCard");
        return null;
    }

    public final TruncatorCard l1() {
        TruncatorCard truncatorCard = this.truncatorCard;
        if (truncatorCard != null) {
            return truncatorCard;
        }
        zq3.z("truncatorCard");
        return null;
    }

    @Override // com.nytimes.android.gateway.a
    public void m0() {
        View view = getView();
        View findViewById = view != null ? view.findViewById(ng6.paywallBackground) : null;
        if (findViewById == null) {
            return;
        }
        findViewById.setVisibility(8);
    }

    @Override // com.nytimes.android.gateway.a
    public void o0(MeterServiceResponse meterServiceResponse) {
        zq3.h(meterServiceResponse, "response");
        e1().b(meterServiceResponse);
    }

    @Override // androidx.fragment.app.Fragment
    public void onActivityCreated(Bundle bundle) {
        super.onActivityCreated(bundle);
        setEt2Scope(ET2CoroutineScopeKt.d(this, new GatewayFragmentCard$onActivityCreated$1(null)));
        d1();
        h1().c(this);
    }

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        zq3.h(layoutInflater, "inflater");
        return layoutInflater.inflate(ei6.gateway_fragment, viewGroup, false);
    }

    @Override // androidx.fragment.app.Fragment
    public void onDestroy() {
        k1().o();
        j1().unsubscribe();
        f1().o();
        h1().a();
        l1().unsubscribe();
        super.onDestroy();
    }

    @Override // com.nytimes.android.gateway.a
    public void p() {
        l1().show();
    }

    @Override // defpackage.kw2
    public void p0(String str) {
        zq3.h(str, "url");
        Context context = getContext();
        if (context != null) {
            BuildersKt__Builders_commonKt.launch$default(e44.a(this), null, null, new GatewayFragmentCard$onTruncatorActionButton$1$1(this, context, str, null), 3, null);
        }
    }

    @Override // com.nytimes.android.gateway.a
    public void q(String str) {
        zq3.h(str, "url");
        j1().show(str);
    }

    @Override // com.nytimes.android.gateway.a
    public void r() {
        f1().m();
    }

    @Override // defpackage.kw2
    public void s0() {
        f activity = getActivity();
        if (activity != null) {
            activity.finish();
        }
    }

    public final void setEt2Scope(ET2CoroutineScope eT2CoroutineScope) {
        zq3.h(eT2CoroutineScope, "<set-?>");
        this.f = eT2CoroutineScope;
    }

    @Override // defpackage.kw2
    public void w0() {
        f activity = getActivity();
        if (activity != null) {
            activity.invalidateOptionsMenu();
        }
    }

    @Override // com.nytimes.android.gateway.a
    public void z() {
        j1().hide();
    }

    @Override // defpackage.kw2
    public void z0() {
        Context context = getContext();
        if (context != null) {
            BuildersKt__Builders_commonKt.launch$default(e44.a(this), null, null, new GatewayFragmentCard$onMeterLogin$1$1(this, context, null), 3, null);
        }
    }
}
