package com.nytimes.android.libs.messagingarchitecture.core;

import androidx.recyclerview.widget.RecyclerView;
import com.comscore.streaming.EventType;
import defpackage.by0;
import defpackage.fc1;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

@fc1(c = "com.nytimes.android.libs.messagingarchitecture.core.MessageQueueImpl", f = "MessageQueueImpl.kt", l = {EventType.CDN}, m = "isAfterCoolDown")
/* loaded from: classes4.dex */
final class MessageQueueImpl$isAfterCoolDown$1 extends ContinuationImpl {
    Object L$0;
    Object L$1;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ MessageQueueImpl this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    MessageQueueImpl$isAfterCoolDown$1(MessageQueueImpl messageQueueImpl, by0 by0Var) {
        super(by0Var);
        this.this$0 = messageQueueImpl;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object p;
        this.result = obj;
        this.label |= RecyclerView.UNDEFINED_DURATION;
        p = this.this$0.p(null, this);
        return p;
    }
}
