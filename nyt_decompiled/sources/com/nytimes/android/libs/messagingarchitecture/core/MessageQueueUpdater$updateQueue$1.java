package com.nytimes.android.libs.messagingarchitecture.core;

import androidx.recyclerview.widget.RecyclerView;
import defpackage.by0;
import defpackage.fc1;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

@fc1(c = "com.nytimes.android.libs.messagingarchitecture.core.MessageQueueUpdater", f = "MessageQueueUpdater.kt", l = {40, 42}, m = "updateQueue")
/* loaded from: classes4.dex */
final class MessageQueueUpdater$updateQueue$1 extends ContinuationImpl {
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ MessageQueueUpdater this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    MessageQueueUpdater$updateQueue$1(MessageQueueUpdater messageQueueUpdater, by0 by0Var) {
        super(by0Var);
        this.this$0 = messageQueueUpdater;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= RecyclerView.UNDEFINED_DURATION;
        return this.this$0.c(this);
    }
}
