package com.nytimes.android.dailyfive.domain;

import androidx.recyclerview.widget.RecyclerView;
import defpackage.by0;
import defpackage.fc1;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

@fc1(c = "com.nytimes.android.dailyfive.domain.DailyFiveFeedStore", f = "DailyFiveFeedStore.kt", l = {93, 105, 107}, m = "prefetchArticles")
/* loaded from: classes4.dex */
final class DailyFiveFeedStore$prefetchArticles$1 extends ContinuationImpl {
    Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ DailyFiveFeedStore this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    DailyFiveFeedStore$prefetchArticles$1(DailyFiveFeedStore dailyFiveFeedStore, by0 by0Var) {
        super(by0Var);
        this.this$0 = dailyFiveFeedStore;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object g;
        this.result = obj;
        this.label |= RecyclerView.UNDEFINED_DURATION;
        g = this.this$0.g(null, null, this);
        return g;
    }
}
