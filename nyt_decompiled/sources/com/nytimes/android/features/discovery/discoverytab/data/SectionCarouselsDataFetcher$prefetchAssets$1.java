package com.nytimes.android.features.discovery.discoverytab.data;

import androidx.recyclerview.widget.RecyclerView;
import defpackage.by0;
import defpackage.fc1;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

@fc1(c = "com.nytimes.android.features.discovery.discoverytab.data.SectionCarouselsDataFetcher", f = "SectionCarouselsDataFetcher.kt", l = {57, 58}, m = "prefetchAssets")
/* loaded from: classes4.dex */
final class SectionCarouselsDataFetcher$prefetchAssets$1 extends ContinuationImpl {
    long J$0;
    Object L$0;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ SectionCarouselsDataFetcher this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    SectionCarouselsDataFetcher$prefetchAssets$1(SectionCarouselsDataFetcher sectionCarouselsDataFetcher, by0 by0Var) {
        super(by0Var);
        this.this$0 = sectionCarouselsDataFetcher;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object i;
        this.result = obj;
        this.label |= RecyclerView.UNDEFINED_DURATION;
        i = this.this$0.i(null, null, this);
        return i;
    }
}
