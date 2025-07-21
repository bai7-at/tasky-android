package com.nytimes.android.internal.pushmessaging.subscription;

import androidx.recyclerview.widget.RecyclerView;
import defpackage.by0;
import defpackage.fc1;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

@fc1(c = "com.nytimes.android.internal.pushmessaging.subscription.SubscriptionManagerImpl", f = "SubscriptionManagerImpl.kt", l = {210, 220}, m = "updateSubscription$push_messaging_release")
/* loaded from: classes4.dex */
final class SubscriptionManagerImpl$updateSubscription$1 extends ContinuationImpl {
    Object L$0;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ SubscriptionManagerImpl this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    SubscriptionManagerImpl$updateSubscription$1(SubscriptionManagerImpl subscriptionManagerImpl, by0 by0Var) {
        super(by0Var);
        this.this$0 = subscriptionManagerImpl;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= RecyclerView.UNDEFINED_DURATION;
        return this.this$0.z(null, this);
    }
}
