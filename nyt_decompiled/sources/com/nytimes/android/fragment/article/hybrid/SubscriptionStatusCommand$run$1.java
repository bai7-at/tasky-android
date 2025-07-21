package com.nytimes.android.fragment.article.hybrid;

import androidx.recyclerview.widget.RecyclerView;
import defpackage.by0;
import defpackage.fc1;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

@fc1(c = "com.nytimes.android.fragment.article.hybrid.SubscriptionStatusCommand", f = "SubscriptionStatusCommand.kt", l = {31}, m = "run")
/* loaded from: classes4.dex */
final class SubscriptionStatusCommand$run$1 extends ContinuationImpl {
    int I$0;
    Object L$0;
    Object L$1;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ SubscriptionStatusCommand this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    SubscriptionStatusCommand$run$1(SubscriptionStatusCommand subscriptionStatusCommand, by0 by0Var) {
        super(by0Var);
        this.this$0 = subscriptionStatusCommand;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= RecyclerView.UNDEFINED_DURATION;
        return this.this$0.b(null, 0, null, this);
    }
}
