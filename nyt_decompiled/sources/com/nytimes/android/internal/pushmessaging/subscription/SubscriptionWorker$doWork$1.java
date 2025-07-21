package com.nytimes.android.internal.pushmessaging.subscription;

import androidx.recyclerview.widget.RecyclerView;
import defpackage.by0;
import defpackage.fc1;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

@fc1(c = "com.nytimes.android.internal.pushmessaging.subscription.SubscriptionWorker", f = "SubscriptionWorker.kt", l = {31}, m = "doWork")
/* loaded from: classes4.dex */
final class SubscriptionWorker$doWork$1 extends ContinuationImpl {
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ SubscriptionWorker this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    SubscriptionWorker$doWork$1(SubscriptionWorker subscriptionWorker, by0 by0Var) {
        super(by0Var);
        this.this$0 = subscriptionWorker;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= RecyclerView.UNDEFINED_DURATION;
        return this.this$0.b(this);
    }
}
