package com.nytimes.android.subauth.core.purchase;

import androidx.recyclerview.widget.RecyclerView;
import defpackage.by0;
import defpackage.fc1;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

@fc1(c = "com.nytimes.android.subauth.core.purchase.SubauthLoginLinkingAPIImpl", f = "SubauthLoginLinkingAPIImpl.kt", l = {57, 62}, m = "attemptLinkingOnForceLogin")
/* loaded from: classes4.dex */
final class SubauthLoginLinkingAPIImpl$attemptLinkingOnForceLogin$1 extends ContinuationImpl {
    Object L$0;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ SubauthLoginLinkingAPIImpl this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    SubauthLoginLinkingAPIImpl$attemptLinkingOnForceLogin$1(SubauthLoginLinkingAPIImpl subauthLoginLinkingAPIImpl, by0 by0Var) {
        super(by0Var);
        this.this$0 = subauthLoginLinkingAPIImpl;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= RecyclerView.UNDEFINED_DURATION;
        return this.this$0.a(false, this);
    }
}
