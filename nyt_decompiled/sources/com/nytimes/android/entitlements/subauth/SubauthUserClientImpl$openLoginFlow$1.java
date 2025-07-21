package com.nytimes.android.entitlements.subauth;

import androidx.recyclerview.widget.RecyclerView;
import defpackage.by0;
import defpackage.fc1;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

@fc1(c = "com.nytimes.android.entitlements.subauth.SubauthUserClientImpl", f = "SubauthUserClientImpl.kt", l = {115}, m = "openLoginFlow")
/* loaded from: classes4.dex */
final class SubauthUserClientImpl$openLoginFlow$1 extends ContinuationImpl {
    Object L$0;
    Object L$1;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ SubauthUserClientImpl this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    SubauthUserClientImpl$openLoginFlow$1(SubauthUserClientImpl subauthUserClientImpl, by0 by0Var) {
        super(by0Var);
        this.this$0 = subauthUserClientImpl;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= RecyclerView.UNDEFINED_DURATION;
        return this.this$0.I(null, false, null, null, this);
    }
}
