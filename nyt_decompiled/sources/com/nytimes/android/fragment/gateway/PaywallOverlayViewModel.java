package com.nytimes.android.fragment.gateway;

import android.content.Intent;
import androidx.lifecycle.q;
import com.nytimes.android.api.cms.Asset;
import com.nytimes.android.gateway.GatewayType;
import defpackage.fw2;
import defpackage.h90;
import defpackage.hw2;
import defpackage.zq3;

/* loaded from: classes4.dex */
public final class PaywallOverlayViewModel extends q {
    private final fw2 a;

    public PaywallOverlayViewModel(fw2 fw2Var) {
        zq3.h(fw2Var, "analytics");
        this.a = fw2Var;
    }

    public final void e(Intent intent) {
        zq3.h(intent, "intent");
        this.a.d(intent);
    }

    public final void f(Intent intent) {
        zq3.h(intent, "intent");
        this.a.e(intent);
    }

    public final void g() {
        this.a.f();
    }

    public final void i() {
        this.a.g();
    }

    public final void j(Asset asset, int i, GatewayType gatewayType, String str, String str2, h90 h90Var, Intent intent) {
        zq3.h(gatewayType, "gatewayType");
        zq3.h(str, "pageViewId");
        zq3.h(intent, "intent");
        this.a.a(hw2.Companion.a(asset, i, gatewayType, str, str2, h90Var));
        this.a.c(intent);
    }

    @Override // androidx.lifecycle.q
    protected void onCleared() {
        super.onCleared();
        this.a.b();
    }
}
