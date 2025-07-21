package com.nytimes.android.ribbon.destinations.bestof;

import androidx.recyclerview.widget.RecyclerView;
import defpackage.by0;
import defpackage.fc1;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

@fc1(c = "com.nytimes.android.ribbon.destinations.bestof.BestOfViewModel", f = "BestOfViewModel.kt", l = {33}, m = "bestOfConfig")
/* loaded from: classes4.dex */
final class BestOfViewModel$bestOfConfig$1 extends ContinuationImpl {
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ BestOfViewModel this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    BestOfViewModel$bestOfConfig$1(BestOfViewModel bestOfViewModel, by0 by0Var) {
        super(by0Var);
        this.this$0 = bestOfViewModel;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object g;
        this.result = obj;
        this.label |= RecyclerView.UNDEFINED_DURATION;
        g = this.this$0.g(this);
        return g;
    }
}
