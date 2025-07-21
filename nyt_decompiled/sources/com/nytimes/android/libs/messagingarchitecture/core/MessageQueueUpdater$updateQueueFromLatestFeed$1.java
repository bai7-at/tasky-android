package com.nytimes.android.libs.messagingarchitecture.core;

import androidx.recyclerview.widget.RecyclerView;
import defpackage.by0;
import defpackage.fc1;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

@fc1(c = "com.nytimes.android.libs.messagingarchitecture.core.MessageQueueUpdater", f = "MessageQueueUpdater.kt", l = {51, 66, 68, 69}, m = "updateQueueFromLatestFeed")
/* loaded from: classes4.dex */
final class MessageQueueUpdater$updateQueueFromLatestFeed$1 extends ContinuationImpl {
    Object L$0;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ MessageQueueUpdater this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    MessageQueueUpdater$updateQueueFromLatestFeed$1(MessageQueueUpdater messageQueueUpdater, by0 by0Var) {
        super(by0Var);
        this.this$0 = messageQueueUpdater;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object d;
        this.result = obj;
        this.label |= RecyclerView.UNDEFINED_DURATION;
        d = this.this$0.d(this);
        return d;
    }
}
