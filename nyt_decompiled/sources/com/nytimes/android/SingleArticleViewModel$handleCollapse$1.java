package com.nytimes.android;

import androidx.recyclerview.widget.RecyclerView;
import defpackage.by0;
import defpackage.fc1;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

@fc1(c = "com.nytimes.android.SingleArticleViewModel", f = "SingleArticleViewModel.kt", l = {115}, m = "handleCollapse")
/* loaded from: classes2.dex */
final class SingleArticleViewModel$handleCollapse$1 extends ContinuationImpl {
    Object L$0;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ SingleArticleViewModel this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    SingleArticleViewModel$handleCollapse$1(SingleArticleViewModel singleArticleViewModel, by0 by0Var) {
        super(by0Var);
        this.this$0 = singleArticleViewModel;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= RecyclerView.UNDEFINED_DURATION;
        return this.this$0.m(null, this);
    }
}
