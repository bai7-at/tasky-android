package com.nytimes.android.entitlements.subauth;

import androidx.recyclerview.widget.RecyclerView;
import com.comscore.streaming.AdvertisementType;
import defpackage.by0;
import defpackage.fc1;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

@fc1(c = "com.nytimes.android.entitlements.subauth.SubauthPurchaseClientImpl", f = "SubauthPurchaseClientImpl.kt", l = {202, AdvertisementType.ON_DEMAND_MID_ROLL, 217, 226}, m = "checkForceLink")
/* loaded from: classes4.dex */
final class SubauthPurchaseClientImpl$checkForceLink$1 extends ContinuationImpl {
    Object L$0;
    Object L$1;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ SubauthPurchaseClientImpl this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    SubauthPurchaseClientImpl$checkForceLink$1(SubauthPurchaseClientImpl subauthPurchaseClientImpl, by0 by0Var) {
        super(by0Var);
        this.this$0 = subauthPurchaseClientImpl;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= RecyclerView.UNDEFINED_DURATION;
        return this.this$0.K(null, this);
    }
}
