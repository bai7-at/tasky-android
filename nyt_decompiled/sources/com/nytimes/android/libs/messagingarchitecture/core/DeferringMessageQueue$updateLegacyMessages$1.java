package com.nytimes.android.libs.messagingarchitecture.core;

import androidx.recyclerview.widget.RecyclerView;
import defpackage.by0;
import defpackage.fc1;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

@fc1(c = "com.nytimes.android.libs.messagingarchitecture.core.DeferringMessageQueue", f = "DeferringMessageQueue.kt", l = {55}, m = "updateLegacyMessages")
/* loaded from: classes4.dex */
final class DeferringMessageQueue$updateLegacyMessages$1 extends ContinuationImpl {
    Object L$0;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ DeferringMessageQueue this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    DeferringMessageQueue$updateLegacyMessages$1(DeferringMessageQueue deferringMessageQueue, by0 by0Var) {
        super(by0Var);
        this.this$0 = deferringMessageQueue;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= RecyclerView.UNDEFINED_DURATION;
        return this.this$0.d(null, this);
    }
}
