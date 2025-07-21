package com.nytimes.android.libs.messagingarchitecture.network;

import androidx.recyclerview.widget.RecyclerView;
import defpackage.by0;
import defpackage.fc1;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

@fc1(c = "com.nytimes.android.libs.messagingarchitecture.network.MessageHistoryUpdater", f = "MessageHistoryUpdater.kt", l = {105, 105, 109}, m = "fetchMessageCaps")
/* loaded from: classes4.dex */
final class MessageHistoryUpdater$fetchMessageCaps$1 extends ContinuationImpl {
    Object L$0;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ MessageHistoryUpdater this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    MessageHistoryUpdater$fetchMessageCaps$1(MessageHistoryUpdater messageHistoryUpdater, by0 by0Var) {
        super(by0Var);
        this.this$0 = messageHistoryUpdater;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= RecyclerView.UNDEFINED_DURATION;
        return this.this$0.a(this);
    }
}
