package com.nytimes.android.entitlements.subauth;

import androidx.recyclerview.widget.RecyclerView;
import defpackage.by0;
import defpackage.fc1;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

@fc1(c = "com.nytimes.android.entitlements.subauth.SubauthPurchaseClientImpl", f = "SubauthPurchaseClientImpl.kt", l = {166, 173, 179, 181}, m = "linkNYTAccountToPurchase")
/* loaded from: classes4.dex */
final class SubauthPurchaseClientImpl$linkNYTAccountToPurchase$1 extends ContinuationImpl {
    Object L$0;
    Object L$1;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ SubauthPurchaseClientImpl this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    SubauthPurchaseClientImpl$linkNYTAccountToPurchase$1(SubauthPurchaseClientImpl subauthPurchaseClientImpl, by0 by0Var) {
        super(by0Var);
        this.this$0 = subauthPurchaseClientImpl;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= RecyclerView.UNDEFINED_DURATION;
        return this.this$0.J(null, null, null, null, null, this);
    }
}
