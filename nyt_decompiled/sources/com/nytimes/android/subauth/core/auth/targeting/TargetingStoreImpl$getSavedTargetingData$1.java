package com.nytimes.android.subauth.core.auth.targeting;

import androidx.recyclerview.widget.RecyclerView;
import defpackage.by0;
import defpackage.fc1;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

@fc1(c = "com.nytimes.android.subauth.core.auth.targeting.TargetingStoreImpl", f = "TargetingStore.kt", l = {47}, m = "getSavedTargetingData")
/* loaded from: classes4.dex */
final class TargetingStoreImpl$getSavedTargetingData$1 extends ContinuationImpl {
    Object L$0;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ TargetingStoreImpl this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    TargetingStoreImpl$getSavedTargetingData$1(TargetingStoreImpl targetingStoreImpl, by0 by0Var) {
        super(by0Var);
        this.this$0 = targetingStoreImpl;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= RecyclerView.UNDEFINED_DURATION;
        return this.this$0.b(this);
    }
}
