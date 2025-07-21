package com.nytimes.android.fragment.gateway;

import android.content.Intent;
import androidx.lifecycle.Lifecycle;
import com.nytimes.android.api.cms.Asset;
import com.nytimes.android.gateway.GatewayType;
import com.nytimes.android.m;
import defpackage.by0;
import defpackage.d44;
import defpackage.ei1;
import defpackage.fc1;
import defpackage.gq5;
import defpackage.gt2;
import defpackage.jk;
import defpackage.ww8;
import defpackage.zq3;
import kotlin.coroutines.intrinsics.a;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.f;
import kotlinx.coroutines.CoroutineScope;

@fc1(c = "com.nytimes.android.fragment.gateway.PaywallComposableKt$PaywallComposable$2", f = "PaywallComposable.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes4.dex */
final class PaywallComposableKt$PaywallComposable$2 extends SuspendLambda implements gt2 {
    final /* synthetic */ jk $activity;
    final /* synthetic */ gq5 $entryPoint;
    final /* synthetic */ Lifecycle $lifecycle;
    final /* synthetic */ PaywallOverlayViewModel $viewModel;
    final /* synthetic */ m $webViewContent;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    PaywallComposableKt$PaywallComposable$2(gq5 gq5Var, Lifecycle lifecycle, m mVar, PaywallOverlayViewModel paywallOverlayViewModel, jk jkVar, by0 by0Var) {
        super(2, by0Var);
        this.$entryPoint = gq5Var;
        this.$lifecycle = lifecycle;
        this.$webViewContent = mVar;
        this.$viewModel = paywallOverlayViewModel;
        this.$activity = jkVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final by0 create(Object obj, by0 by0Var) {
        return new PaywallComposableKt$PaywallComposable$2(this.$entryPoint, this.$lifecycle, this.$webViewContent, this.$viewModel, this.$activity, by0Var);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        a.h();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        f.b(obj);
        final HasGateway a0 = this.$entryPoint.a0();
        this.$lifecycle.a(a0);
        final m mVar = this.$webViewContent;
        PaywallOverlayViewModel paywallOverlayViewModel = this.$viewModel;
        gq5 gq5Var = this.$entryPoint;
        jk jkVar = this.$activity;
        Lifecycle lifecycle = this.$lifecycle;
        Asset a = mVar.a();
        int g = a0.g();
        GatewayType gatewayType = (GatewayType) a0.f().getValue();
        String K = gq5Var.K();
        String g2 = mVar.g();
        if (g2 == null) {
            Asset a2 = mVar.a();
            g2 = a2 != null ? a2.getUrl() : null;
        }
        String str = g2;
        Intent intent = jkVar.getIntent();
        zq3.g(intent, "getIntent(...)");
        paywallOverlayViewModel.j(a, g, gatewayType, K, str, null, intent);
        lifecycle.a(new ei1() { // from class: com.nytimes.android.fragment.gateway.PaywallComposableKt$PaywallComposable$2$1$1
            @Override // defpackage.ei1
            public void onResume(d44 d44Var) {
                zq3.h(d44Var, "owner");
                if (m.this.b()) {
                    return;
                }
                a0.c(mVar.a(), m.this.f());
            }
        });
        if (!(this.$webViewContent instanceof m.g)) {
            a0.j(true);
        }
        return ww8.a;
    }

    @Override // defpackage.gt2
    public final Object invoke(CoroutineScope coroutineScope, by0 by0Var) {
        return ((PaywallComposableKt$PaywallComposable$2) create(coroutineScope, by0Var)).invokeSuspend(ww8.a);
    }
}
