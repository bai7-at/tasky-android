package com.nytimes.android.libs.messagingarchitecture.core;

import androidx.recyclerview.widget.RecyclerView;
import defpackage.by0;
import defpackage.fc1;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlinx.coroutines.internal.LockFreeTaskQueueCore;

@fc1(c = "com.nytimes.android.libs.messagingarchitecture.core.DeferringMessageQueue", f = "DeferringMessageQueue.kt", l = {LockFreeTaskQueueCore.FROZEN_SHIFT, LockFreeTaskQueueCore.CLOSED_SHIFT}, m = "getFirstMessageForUnit")
/* loaded from: classes4.dex */
final class DeferringMessageQueue$getFirstMessageForUnit$1 extends ContinuationImpl {
    Object L$0;
    Object L$1;
    Object L$2;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ DeferringMessageQueue this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    DeferringMessageQueue$getFirstMessageForUnit$1(DeferringMessageQueue deferringMessageQueue, by0 by0Var) {
        super(by0Var);
        this.this$0 = deferringMessageQueue;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= RecyclerView.UNDEFINED_DURATION;
        return this.this$0.k(null, null, this);
    }
}
