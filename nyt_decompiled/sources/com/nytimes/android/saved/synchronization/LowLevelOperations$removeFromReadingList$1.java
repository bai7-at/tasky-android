package com.nytimes.android.saved.synchronization;

import androidx.recyclerview.widget.RecyclerView;
import defpackage.by0;
import defpackage.fc1;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

@fc1(c = "com.nytimes.android.saved.synchronization.LowLevelOperations", f = "LowLevelOperations.kt", l = {127}, m = "removeFromReadingList")
/* loaded from: classes4.dex */
final class LowLevelOperations$removeFromReadingList$1 extends ContinuationImpl {
    Object L$0;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ LowLevelOperations this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    LowLevelOperations$removeFromReadingList$1(LowLevelOperations lowLevelOperations, by0 by0Var) {
        super(by0Var);
        this.this$0 = lowLevelOperations;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object r;
        this.result = obj;
        this.label |= RecyclerView.UNDEFINED_DURATION;
        r = this.this$0.r(null, this);
        return r;
    }
}
