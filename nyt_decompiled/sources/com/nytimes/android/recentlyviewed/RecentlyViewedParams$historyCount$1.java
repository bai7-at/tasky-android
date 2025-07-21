package com.nytimes.android.recentlyviewed;

import androidx.recyclerview.widget.RecyclerView;
import defpackage.by0;
import defpackage.fc1;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

@fc1(c = "com.nytimes.android.recentlyviewed.RecentlyViewedParams", f = "RecentlyViewedParams.kt", l = {21}, m = "historyCount")
/* loaded from: classes4.dex */
final class RecentlyViewedParams$historyCount$1 extends ContinuationImpl {
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ RecentlyViewedParams this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    RecentlyViewedParams$historyCount$1(RecentlyViewedParams recentlyViewedParams, by0 by0Var) {
        super(by0Var);
        this.this$0 = recentlyViewedParams;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= RecyclerView.UNDEFINED_DURATION;
        return this.this$0.a(this);
    }
}
