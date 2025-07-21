package com.nytimes.android.entitlements.subauth;

import androidx.recyclerview.widget.RecyclerView;
import defpackage.by0;
import defpackage.fc1;
import kotlin.Result;
import kotlin.coroutines.intrinsics.a;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

@fc1(c = "com.nytimes.android.entitlements.subauth.SubauthPurchaseClientImpl", f = "SubauthPurchaseClientImpl.kt", l = {276}, m = "isProductDetailsSupported-IoAF18A")
/* loaded from: classes4.dex */
final class SubauthPurchaseClientImpl$isProductDetailsSupported$1 extends ContinuationImpl {
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ SubauthPurchaseClientImpl this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    SubauthPurchaseClientImpl$isProductDetailsSupported$1(SubauthPurchaseClientImpl subauthPurchaseClientImpl, by0 by0Var) {
        super(by0Var);
        this.this$0 = subauthPurchaseClientImpl;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= RecyclerView.UNDEFINED_DURATION;
        Object f = this.this$0.f(this);
        return f == a.h() ? f : Result.a(f);
    }
}
