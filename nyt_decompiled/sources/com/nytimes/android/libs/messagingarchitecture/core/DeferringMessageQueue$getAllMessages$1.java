package com.nytimes.android.libs.messagingarchitecture.core;

import androidx.recyclerview.widget.RecyclerView;
import com.comscore.streaming.EventType;
import defpackage.by0;
import defpackage.fc1;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

@fc1(c = "com.nytimes.android.libs.messagingarchitecture.core.DeferringMessageQueue", f = "DeferringMessageQueue.kt", l = {24, EventType.SUBS}, m = "getAllMessages")
/* loaded from: classes4.dex */
final class DeferringMessageQueue$getAllMessages$1 extends ContinuationImpl {
    Object L$0;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ DeferringMessageQueue this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    DeferringMessageQueue$getAllMessages$1(DeferringMessageQueue deferringMessageQueue, by0 by0Var) {
        super(by0Var);
        this.this$0 = deferringMessageQueue;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= RecyclerView.UNDEFINED_DURATION;
        return this.this$0.j(this);
    }
}
