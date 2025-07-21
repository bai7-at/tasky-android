package com.nytimes.android.entitlements.subauth;

import androidx.recyclerview.widget.RecyclerView;
import defpackage.by0;
import defpackage.fc1;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

@fc1(c = "com.nytimes.android.entitlements.subauth.SubauthPurchaseClientImpl", f = "SubauthPurchaseClientImpl.kt", l = {255, 262}, m = "executeLinkNYTAccountToPurchase")
/* loaded from: classes4.dex */
final class SubauthPurchaseClientImpl$executeLinkNYTAccountToPurchase$1 extends ContinuationImpl {
    Object L$0;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ SubauthPurchaseClientImpl this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    SubauthPurchaseClientImpl$executeLinkNYTAccountToPurchase$1(SubauthPurchaseClientImpl subauthPurchaseClientImpl, by0 by0Var) {
        super(by0Var);
        this.this$0 = subauthPurchaseClientImpl;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object h;
        this.result = obj;
        this.label |= RecyclerView.UNDEFINED_DURATION;
        h = this.this$0.h(null, this);
        return h;
    }
}
