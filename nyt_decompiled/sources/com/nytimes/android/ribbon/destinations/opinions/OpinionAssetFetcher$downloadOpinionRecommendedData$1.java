package com.nytimes.android.ribbon.destinations.opinions;

import androidx.recyclerview.widget.RecyclerView;
import defpackage.by0;
import defpackage.fc1;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

@fc1(c = "com.nytimes.android.ribbon.destinations.opinions.OpinionAssetFetcher", f = "OpinionAssetFetcher.kt", l = {20, 30}, m = "downloadOpinionRecommendedData")
/* loaded from: classes4.dex */
final class OpinionAssetFetcher$downloadOpinionRecommendedData$1 extends ContinuationImpl {
    Object L$0;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ OpinionAssetFetcher this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    OpinionAssetFetcher$downloadOpinionRecommendedData$1(OpinionAssetFetcher opinionAssetFetcher, by0 by0Var) {
        super(by0Var);
        this.this$0 = opinionAssetFetcher;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= RecyclerView.UNDEFINED_DURATION;
        return this.this$0.a(null, this);
    }
}
