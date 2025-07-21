package com.nytimes.android.libs.messagingarchitecture.core;

import androidx.recyclerview.widget.RecyclerView;
import defpackage.by0;
import defpackage.fc1;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

@fc1(c = "com.nytimes.android.libs.messagingarchitecture.core.MessageQueueUpdater", f = "MessageQueueUpdater.kt", l = {76, 81, 81, 84, 88, 90, 95, 99, 102, 103}, m = "updateQueueFromOMA")
/* loaded from: classes4.dex */
final class MessageQueueUpdater$updateQueueFromOMA$1 extends ContinuationImpl {
    Object L$0;
    Object L$1;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ MessageQueueUpdater this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    MessageQueueUpdater$updateQueueFromOMA$1(MessageQueueUpdater messageQueueUpdater, by0 by0Var) {
        super(by0Var);
        this.this$0 = messageQueueUpdater;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object e;
        this.result = obj;
        this.label |= RecyclerView.UNDEFINED_DURATION;
        e = this.this$0.e(this);
        return e;
    }
}
