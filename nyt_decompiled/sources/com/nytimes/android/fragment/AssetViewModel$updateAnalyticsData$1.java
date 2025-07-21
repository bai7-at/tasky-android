package com.nytimes.android.fragment;

import android.content.Intent;
import com.nytimes.android.api.cms.Asset;
import com.nytimes.android.gateway.GatewayType;
import com.nytimes.android.logging.NYTLogger;
import defpackage.by0;
import defpackage.fc1;
import defpackage.fw2;
import defpackage.gt2;
import defpackage.h90;
import defpackage.hw2;
import defpackage.ww8;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.f;
import kotlinx.coroutines.CoroutineScope;

@fc1(c = "com.nytimes.android.fragment.AssetViewModel$updateAnalyticsData$1", f = "AssetViewModel.kt", l = {42}, m = "invokeSuspend")
/* loaded from: classes4.dex */
final class AssetViewModel$updateAnalyticsData$1 extends SuspendLambda implements gt2 {
    final /* synthetic */ h90 $blockAttributes;
    final /* synthetic */ GatewayType $gatewayType;
    final /* synthetic */ Intent $intent;
    final /* synthetic */ String $pageViewId;
    final /* synthetic */ int $paywallState;
    final /* synthetic */ String $startUrl;
    int label;
    final /* synthetic */ AssetViewModel this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    AssetViewModel$updateAnalyticsData$1(AssetViewModel assetViewModel, int i, GatewayType gatewayType, String str, String str2, h90 h90Var, Intent intent, by0 by0Var) {
        super(2, by0Var);
        this.this$0 = assetViewModel;
        this.$paywallState = i;
        this.$gatewayType = gatewayType;
        this.$pageViewId = str;
        this.$startUrl = str2;
        this.$blockAttributes = h90Var;
        this.$intent = intent;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final by0 create(Object obj, by0 by0Var) {
        return new AssetViewModel$updateAnalyticsData$1(this.this$0, this.$paywallState, this.$gatewayType, this.$pageViewId, this.$startUrl, this.$blockAttributes, this.$intent, by0Var);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        fw2 fw2Var;
        fw2 fw2Var2;
        Object h = kotlin.coroutines.intrinsics.a.h();
        int i = this.label;
        try {
            if (i == 0) {
                f.b(obj);
                AssetViewModel assetViewModel = this.this$0;
                this.label = 1;
                obj = assetViewModel.f(this);
                if (obj == h) {
                    return h;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                f.b(obj);
            }
            hw2 a = hw2.Companion.a((Asset) obj, this.$paywallState, this.$gatewayType, this.$pageViewId, this.$startUrl, this.$blockAttributes);
            fw2Var = this.this$0.b;
            fw2Var.a(a);
            fw2Var2 = this.this$0.b;
            fw2Var2.c(this.$intent);
        } catch (Exception e) {
            NYTLogger.B(e);
        }
        return ww8.a;
    }

    @Override // defpackage.gt2
    public final Object invoke(CoroutineScope coroutineScope, by0 by0Var) {
        return ((AssetViewModel$updateAnalyticsData$1) create(coroutineScope, by0Var)).invokeSuspend(ww8.a);
    }
}
