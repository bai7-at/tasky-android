package com.nytimes.android.gateway;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.r;
import com.nytimes.abtests.GraceTruncatorVariants;
import com.nytimes.android.abra.AbraManager;
import com.nytimes.android.abra.models.AbraTest;
import com.nytimes.android.api.cms.Asset;
import com.nytimes.android.gateway.GatewayFragmentCard;
import com.nytimes.android.meter.MeterServiceResponse;
import defpackage.e44;
import defpackage.ew2;
import defpackage.fc;
import defpackage.ng6;
import defpackage.rw2;
import defpackage.ss2;
import defpackage.zq3;
import java.util.ArrayList;
import java.util.Iterator;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.StateFlow;
import kotlinx.coroutines.flow.StateFlowKt;

/* loaded from: classes4.dex */
public final class GatewayFragmentManager implements rw2 {
    private final ew2 a;
    private final com.nytimes.android.entitlements.a b;
    private final AbraManager c;
    private final MutableStateFlow d;
    private Fragment e;
    private FragmentManager f;
    private final ArrayList g;
    private final MutableStateFlow h;
    private final StateFlow i;
    private boolean j;
    private MeterServiceResponse k;

    public GatewayFragmentManager(ew2 ew2Var, com.nytimes.android.entitlements.a aVar, AbraManager abraManager, MutableStateFlow mutableStateFlow) {
        zq3.h(ew2Var, "activityManager");
        zq3.h(aVar, "eCommClient");
        zq3.h(abraManager, "abraManager");
        zq3.h(mutableStateFlow, "isPaywallShowingFlow");
        this.a = ew2Var;
        this.b = aVar;
        this.c = abraManager;
        this.d = mutableStateFlow;
        this.g = new ArrayList();
        MutableStateFlow MutableStateFlow = StateFlowKt.MutableStateFlow(GatewayType.NONE);
        this.h = MutableStateFlow;
        this.i = FlowKt.asStateFlow(MutableStateFlow);
    }

    private final int h() {
        MeterServiceResponse meterServiceResponse = this.k;
        if (meterServiceResponse != null) {
            return meterServiceResponse.viewsUsed();
        }
        return -1;
    }

    private final void o(FragmentManager fragmentManager, boolean z, ss2 ss2Var) {
        try {
            r p = fragmentManager.p();
            zq3.g(p, "beginTransaction()");
            ss2Var.invoke(p);
            if (z) {
                p.k();
            } else {
                p.j();
            }
        } catch (IllegalStateException unused) {
            r p2 = fragmentManager.p();
            zq3.g(p2, "beginTransaction()");
            ss2Var.invoke(p2);
            if (z) {
                p2.i();
            } else {
                p2.h();
            }
        }
    }

    static /* synthetic */ void p(GatewayFragmentManager gatewayFragmentManager, FragmentManager fragmentManager, boolean z, ss2 ss2Var, int i, Object obj) {
        if ((i & 1) != 0) {
            z = false;
        }
        gatewayFragmentManager.o(fragmentManager, z, ss2Var);
    }

    @Override // defpackage.rw2
    public void a() {
        k();
        this.h.setValue(GatewayType.NONE);
        Iterator it2 = this.g.iterator();
        while (it2.hasNext()) {
            ((fc) it2.next()).n();
        }
    }

    @Override // defpackage.rw2
    public void b(boolean z) {
        if (z) {
            k();
        }
        FragmentManager fragmentManager = this.f;
        Fragment fragment = this.e;
        if (fragmentManager == null || fragment == null) {
            return;
        }
        e44.a(fragment).c(new GatewayFragmentManager$finishGatewayFragment$1(this, fragmentManager, fragment, null));
        this.e = null;
        this.f = null;
        this.d.setValue(Boolean.valueOf(j()));
    }

    @Override // defpackage.rw2
    public void c(GatewayType gatewayType) {
        zq3.h(gatewayType, "gatewayType");
        this.h.setValue(gatewayType);
        if (gatewayType == GatewayType.BLOCKED) {
            this.a.a(false, false, h());
        }
    }

    public final void d(fc fcVar) {
        zq3.h(fcVar, "callback");
        this.g.add(fcVar);
    }

    public final void e(Fragment fragment, FragmentManager fragmentManager) {
        zq3.h(fragment, "paywall");
        zq3.h(fragmentManager, "fragmentManager");
        this.f = fragmentManager;
        this.e = fragment;
        fragmentManager.p().c(ng6.paywallContainer, fragment, fragment.getClass().getSimpleName()).h();
        fragmentManager.f0();
        this.d.setValue(Boolean.valueOf(j()));
    }

    public final Fragment f(Asset asset, String str) {
        String str2;
        String str3;
        String grantReason;
        String assetType;
        MeterServiceResponse meterServiceResponse = this.k;
        int viewsUsed = meterServiceResponse != null ? meterServiceResponse.viewsUsed() : 0;
        MeterServiceResponse meterServiceResponse2 = this.k;
        int total = meterServiceResponse2 != null ? meterServiceResponse2.getTotal() : 0;
        MeterServiceResponse meterServiceResponse3 = this.k;
        boolean granted = meterServiceResponse3 != null ? meterServiceResponse3.getGranted() : false;
        MeterServiceResponse meterServiceResponse4 = this.k;
        boolean counted = meterServiceResponse4 != null ? meterServiceResponse4.getCounted() : false;
        MeterServiceResponse meterServiceResponse5 = this.k;
        boolean deviceOffline = meterServiceResponse5 != null ? meterServiceResponse5.getDeviceOffline() : false;
        AbraTest test = this.c.getTest(GraceTruncatorVariants.Companion.a().getTestName());
        boolean c = zq3.c(test != null ? test.getVariant() : null, GraceTruncatorVariants.USER_IN_GRACE.getVariantName());
        MeterServiceResponse meterServiceResponse6 = this.k;
        if (meterServiceResponse6 == null || (str2 = meterServiceResponse6.getGatewayType()) == null) {
            str2 = "PAYWALL";
        }
        String str4 = str2;
        MeterServiceResponse meterServiceResponse7 = this.k;
        String str5 = (meterServiceResponse7 == null || (assetType = meterServiceResponse7.getAssetType()) == null) ? "" : assetType;
        MeterServiceResponse meterServiceResponse8 = this.k;
        String str6 = (meterServiceResponse8 == null || (grantReason = meterServiceResponse8.getGrantReason()) == null) ? "" : grantReason;
        GatewayFragmentCard.a aVar = GatewayFragmentCard.Companion;
        if (str == null) {
            String url = asset != null ? asset.getUrl() : null;
            str3 = url == null ? "" : url;
        } else {
            str3 = str;
        }
        return aVar.a(asset, str5, viewsUsed, total, granted, counted, deviceOffline, str4, c, str3, str6);
    }

    public final StateFlow g() {
        return this.i;
    }

    public final MeterServiceResponse i() {
        return this.k;
    }

    public final boolean j() {
        Fragment fragment = this.e;
        if (fragment != null) {
            return fragment.isAdded();
        }
        return false;
    }

    public final void k() {
        this.a.a(true ^ this.j, (this.b.a() || this.j) ? false : true, h());
    }

    public final void l(fc fcVar) {
        zq3.h(fcVar, "callback");
        this.g.remove(fcVar);
    }

    public final void m(MeterServiceResponse meterServiceResponse) {
        this.k = meterServiceResponse;
    }

    public final void n(boolean z) {
        this.j = z;
    }
}
