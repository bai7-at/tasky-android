package com.nytimes.android.ribbon.destinations.trending;

import androidx.recyclerview.widget.RecyclerView;
import defpackage.by0;
import defpackage.fc1;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

@fc1(c = "com.nytimes.android.ribbon.destinations.trending.TrendingViewModel", f = "TrendingViewModel.kt", l = {35, 36, 37}, m = "queryAssets")
/* loaded from: classes4.dex */
final class TrendingViewModel$queryAssets$1 extends ContinuationImpl {
    Object L$0;
    Object L$1;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ TrendingViewModel this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    TrendingViewModel$queryAssets$1(TrendingViewModel trendingViewModel, by0 by0Var) {
        super(by0Var);
        this.this$0 = trendingViewModel;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object m;
        this.result = obj;
        this.label |= RecyclerView.UNDEFINED_DURATION;
        m = this.this$0.m(this);
        return m;
    }
}
