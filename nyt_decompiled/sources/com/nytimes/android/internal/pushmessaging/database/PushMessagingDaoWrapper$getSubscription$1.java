package com.nytimes.android.internal.pushmessaging.database;

import androidx.recyclerview.widget.RecyclerView;
import defpackage.by0;
import defpackage.fc1;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

@fc1(c = "com.nytimes.android.internal.pushmessaging.database.PushMessagingDaoWrapper", f = "PushMessagingDatabase.kt", l = {91}, m = "getSubscription")
/* loaded from: classes4.dex */
final class PushMessagingDaoWrapper$getSubscription$1 extends ContinuationImpl {
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ PushMessagingDaoWrapper this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    PushMessagingDaoWrapper$getSubscription$1(PushMessagingDaoWrapper pushMessagingDaoWrapper, by0 by0Var) {
        super(by0Var);
        this.this$0 = pushMessagingDaoWrapper;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= RecyclerView.UNDEFINED_DURATION;
        return this.this$0.c(this);
    }
}
