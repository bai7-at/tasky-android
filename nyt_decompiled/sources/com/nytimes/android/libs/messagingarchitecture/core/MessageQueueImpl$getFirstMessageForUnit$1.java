package com.nytimes.android.libs.messagingarchitecture.core;

import androidx.recyclerview.widget.RecyclerView;
import defpackage.by0;
import defpackage.fc1;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

@fc1(c = "com.nytimes.android.libs.messagingarchitecture.core.MessageQueueImpl", f = "MessageQueueImpl.kt", l = {57, 58}, m = "getFirstMessageForUnit")
/* loaded from: classes4.dex */
final class MessageQueueImpl$getFirstMessageForUnit$1 extends ContinuationImpl {
    Object L$0;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ MessageQueueImpl this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    MessageQueueImpl$getFirstMessageForUnit$1(MessageQueueImpl messageQueueImpl, by0 by0Var) {
        super(by0Var);
        this.this$0 = messageQueueImpl;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= RecyclerView.UNDEFINED_DURATION;
        return this.this$0.k(null, null, this);
    }
}
