package com.nytimes.android.entitlements.subauth;

import androidx.recyclerview.widget.RecyclerView;
import defpackage.by0;
import defpackage.fc1;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

@fc1(c = "com.nytimes.android.entitlements.subauth.SubauthUserClientImpl", f = "SubauthUserClientImpl.kt", l = {160, 161, 162}, m = "getNytCookieValue")
/* loaded from: classes4.dex */
final class SubauthUserClientImpl$getNytCookieValue$1 extends ContinuationImpl {
    Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ SubauthUserClientImpl this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    SubauthUserClientImpl$getNytCookieValue$1(SubauthUserClientImpl subauthUserClientImpl, by0 by0Var) {
        super(by0Var);
        this.this$0 = subauthUserClientImpl;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= RecyclerView.UNDEFINED_DURATION;
        return this.this$0.l(null, this);
    }
}
