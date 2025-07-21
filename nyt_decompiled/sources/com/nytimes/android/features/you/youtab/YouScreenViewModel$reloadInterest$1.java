package com.nytimes.android.features.you.youtab;

import androidx.recyclerview.widget.RecyclerView;
import defpackage.by0;
import defpackage.fc1;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

@fc1(c = "com.nytimes.android.features.you.youtab.YouScreenViewModel", f = "YouScreenViewModel.kt", l = {623}, m = "reloadInterest")
/* loaded from: classes4.dex */
final class YouScreenViewModel$reloadInterest$1 extends ContinuationImpl {
    Object L$0;
    Object L$1;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ YouScreenViewModel this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    YouScreenViewModel$reloadInterest$1(YouScreenViewModel youScreenViewModel, by0 by0Var) {
        super(by0Var);
        this.this$0 = youScreenViewModel;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object s0;
        this.result = obj;
        this.label |= RecyclerView.UNDEFINED_DURATION;
        s0 = this.this$0.s0(null, null, this);
        return s0;
    }
}
