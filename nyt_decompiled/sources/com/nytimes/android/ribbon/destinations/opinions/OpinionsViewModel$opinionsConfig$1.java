package com.nytimes.android.ribbon.destinations.opinions;

import androidx.recyclerview.widget.RecyclerView;
import defpackage.by0;
import defpackage.fc1;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

@fc1(c = "com.nytimes.android.ribbon.destinations.opinions.OpinionsViewModel", f = "OpinionsViewModel.kt", l = {132}, m = "opinionsConfig")
/* loaded from: classes4.dex */
final class OpinionsViewModel$opinionsConfig$1 extends ContinuationImpl {
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ OpinionsViewModel this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    OpinionsViewModel$opinionsConfig$1(OpinionsViewModel opinionsViewModel, by0 by0Var) {
        super(by0Var);
        this.this$0 = opinionsViewModel;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object o;
        this.result = obj;
        this.label |= RecyclerView.UNDEFINED_DURATION;
        o = this.this$0.o(this);
        return o;
    }
}
