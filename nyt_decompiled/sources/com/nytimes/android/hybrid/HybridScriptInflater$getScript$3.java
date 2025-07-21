package com.nytimes.android.hybrid;

import androidx.recyclerview.widget.RecyclerView;
import defpackage.by0;
import defpackage.fc1;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

@fc1(c = "com.nytimes.android.hybrid.HybridScriptInflater", f = "HybridScriptInflater.kt", l = {35}, m = "getScript")
/* loaded from: classes4.dex */
final class HybridScriptInflater$getScript$3 extends ContinuationImpl {
    Object L$0;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ HybridScriptInflater this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    HybridScriptInflater$getScript$3(HybridScriptInflater hybridScriptInflater, by0 by0Var) {
        super(by0Var);
        this.this$0 = hybridScriptInflater;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= RecyclerView.UNDEFINED_DURATION;
        return this.this$0.c(null, 0, null, this);
    }
}
