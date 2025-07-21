package com.nytimes.android.recentlyviewed;

import androidx.recyclerview.widget.RecyclerView;
import defpackage.by0;
import defpackage.fc1;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

@fc1(c = "com.nytimes.android.recentlyviewed.RecentlyViewedManager", f = "RecentlyViewedManager.kt", l = {124, 125}, m = "flushOlderAssets")
/* loaded from: classes4.dex */
final class RecentlyViewedManager$flushOlderAssets$1 extends ContinuationImpl {
    Object L$0;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ RecentlyViewedManager this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    RecentlyViewedManager$flushOlderAssets$1(RecentlyViewedManager recentlyViewedManager, by0 by0Var) {
        super(by0Var);
        this.this$0 = recentlyViewedManager;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= RecyclerView.UNDEFINED_DURATION;
        return this.this$0.q(this);
    }
}
