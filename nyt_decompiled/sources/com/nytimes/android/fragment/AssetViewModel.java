package com.nytimes.android.fragment;

import android.content.Intent;
import androidx.lifecycle.n;
import androidx.lifecycle.q;
import androidx.lifecycle.r;
import com.nytimes.android.assetretriever.AssetRetriever;
import com.nytimes.android.assetretriever.e;
import com.nytimes.android.gateway.GatewayType;
import defpackage.by0;
import defpackage.fw2;
import defpackage.h90;
import defpackage.st;
import defpackage.zq3;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;

/* loaded from: classes4.dex */
public final class AssetViewModel extends q {
    private final AssetRetriever a;
    private final fw2 b;
    private final n c;
    private final AssetArgs d;

    public AssetViewModel(AssetRetriever assetRetriever, fw2 fw2Var, n nVar) {
        zq3.h(assetRetriever, "assetRetriever");
        zq3.h(fw2Var, "analytics");
        zq3.h(nVar, "savedStateHandle");
        this.a = assetRetriever;
        this.b = fw2Var;
        this.c = nVar;
        this.d = AssetArgs.Companion.a(nVar);
    }

    public final Object f(by0 by0Var) {
        return this.a.o(e.Companion.c(this.d.h(), this.d.i()), null, new st[0], by0Var);
    }

    public final AssetArgs g() {
        return this.d;
    }

    public final void i(Intent intent) {
        zq3.h(intent, "intent");
        this.b.d(intent);
    }

    public final void j(Intent intent) {
        zq3.h(intent, "intent");
        this.b.e(intent);
    }

    public final void k() {
        this.b.f();
    }

    public final void l() {
        this.b.g();
    }

    public final void m(int i, GatewayType gatewayType, String str, String str2, h90 h90Var, Intent intent) {
        zq3.h(gatewayType, "gatewayType");
        zq3.h(str, "pageViewId");
        zq3.h(intent, "intent");
        BuildersKt__Builders_commonKt.launch$default(r.a(this), null, null, new AssetViewModel$updateAnalyticsData$1(this, i, gatewayType, str, str2, h90Var, intent, null), 3, null);
    }

    @Override // androidx.lifecycle.q
    protected void onCleared() {
        super.onCleared();
        this.b.b();
    }
}
