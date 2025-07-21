package com.nytimes.android.saved.synchronization;

import androidx.recyclerview.widget.RecyclerView;
import defpackage.by0;
import defpackage.fc1;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

@fc1(c = "com.nytimes.android.saved.synchronization.LowLevelOperations", f = "LowLevelOperations.kt", l = {74, 177, 182}, m = "delete")
/* loaded from: classes4.dex */
final class LowLevelOperations$delete$1 extends ContinuationImpl {
    Object L$0;
    Object L$1;
    Object L$2;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ LowLevelOperations this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    LowLevelOperations$delete$1(LowLevelOperations lowLevelOperations, by0 by0Var) {
        super(by0Var);
        this.this$0 = lowLevelOperations;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= RecyclerView.UNDEFINED_DURATION;
        return this.this$0.g(null, this);
    }
}
