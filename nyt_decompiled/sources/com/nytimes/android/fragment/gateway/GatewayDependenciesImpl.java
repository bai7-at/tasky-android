package com.nytimes.android.fragment.gateway;

import com.nytimes.abtests.GraceTruncatorVariants;
import com.nytimes.android.abra.AbraManager;
import com.nytimes.android.abra.models.AbraTest;
import com.nytimes.android.api.cms.Asset;
import com.nytimes.android.entitlements.a;
import com.nytimes.android.fragment.gateway.GatewayDependenciesImpl;
import com.nytimes.android.gateway.GatewayFragmentManager;
import com.nytimes.android.meter.MeterServiceResponse;
import defpackage.gt4;
import defpackage.lw2;
import defpackage.rb5;
import defpackage.ss2;
import defpackage.ww8;
import defpackage.zq3;
import io.reactivex.Observable;
import io.reactivex.Single;
import io.reactivex.functions.Consumer;
import io.reactivex.functions.Function;

/* loaded from: classes4.dex */
public final class GatewayDependenciesImpl implements lw2 {
    private final GatewayFragmentManager a;
    private final gt4 b;
    private final a c;
    private final PaywallPreferences d;
    private final AbraManager e;
    private boolean f;

    public GatewayDependenciesImpl(GatewayFragmentManager gatewayFragmentManager, gt4 gt4Var, a aVar, PaywallPreferences paywallPreferences, AbraManager abraManager) {
        zq3.h(gatewayFragmentManager, "gatewayFragmentManager");
        zq3.h(gt4Var, "meterServiceDAO");
        zq3.h(aVar, "eCommClient");
        zq3.h(paywallPreferences, "paywallPreferences");
        zq3.h(abraManager, "abraManager");
        this.a = gatewayFragmentManager;
        this.b = gt4Var;
        this.c = aVar;
        this.d = paywallPreferences;
        this.e = abraManager;
    }

    private final boolean h(Asset asset, String str) {
        return ((asset != null && asset.isMetered()) || (str != null && rb5.r(str))) && !this.c.a() && this.d.b();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void i(ss2 ss2Var, Object obj) {
        zq3.h(ss2Var, "$tmp0");
        ss2Var.invoke(obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Boolean j(ss2 ss2Var, Object obj) {
        zq3.h(ss2Var, "$tmp0");
        zq3.h(obj, "p0");
        return (Boolean) ss2Var.invoke(obj);
    }

    @Override // defpackage.lw2
    public void a(boolean z) {
        this.f = z;
    }

    @Override // defpackage.lw2
    public Observable b(Asset asset, String str, String str2) {
        zq3.h(str, "pageviewId");
        if (this.f || !h(asset, str2)) {
            Observable just = Observable.just(Boolean.FALSE);
            zq3.g(just, "just(...)");
            return just;
        }
        if (str2 == null) {
            str2 = asset != null ? asset.getUrl() : null;
            if (str2 == null) {
                str2 = "";
            }
        }
        Single a = this.b.a(str2, str);
        final ss2 ss2Var = new ss2() { // from class: com.nytimes.android.fragment.gateway.GatewayDependenciesImpl$shouldShowMeterPaywall$1
            {
                super(1);
            }

            public final void b(MeterServiceResponse meterServiceResponse) {
                GatewayFragmentManager gatewayFragmentManager;
                gatewayFragmentManager = GatewayDependenciesImpl.this.a;
                gatewayFragmentManager.m(meterServiceResponse);
            }

            @Override // defpackage.ss2
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                b((MeterServiceResponse) obj);
                return ww8.a;
            }
        };
        Single doOnSuccess = a.doOnSuccess(new Consumer() { // from class: mw2
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                GatewayDependenciesImpl.i(ss2.this, obj);
            }
        });
        final GatewayDependenciesImpl$shouldShowMeterPaywall$2 gatewayDependenciesImpl$shouldShowMeterPaywall$2 = new ss2() { // from class: com.nytimes.android.fragment.gateway.GatewayDependenciesImpl$shouldShowMeterPaywall$2
            @Override // defpackage.ss2
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public final Boolean invoke(MeterServiceResponse meterServiceResponse) {
                zq3.h(meterServiceResponse, "it");
                return Boolean.valueOf(!meterServiceResponse.getGranted() || meterServiceResponse.remaining() > 0);
            }
        };
        Observable observable = doOnSuccess.map(new Function() { // from class: nw2
            @Override // io.reactivex.functions.Function
            public final Object apply(Object obj) {
                Boolean j;
                j = GatewayDependenciesImpl.j(ss2.this, obj);
                return j;
            }
        }).toObservable();
        zq3.g(observable, "toObservable(...)");
        return observable;
    }

    @Override // defpackage.lw2
    public MeterServiceResponse c() {
        return this.a.i();
    }

    @Override // defpackage.lw2
    public Observable d() {
        AbraTest test = this.e.getTest(GraceTruncatorVariants.Companion.a().getTestName());
        Observable just = Observable.just(Boolean.valueOf(zq3.c(test != null ? test.getVariant() : null, GraceTruncatorVariants.USER_IN_GRACE.getVariantName())));
        zq3.g(just, "just(...)");
        return just;
    }
}
