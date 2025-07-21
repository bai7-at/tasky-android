package com.nytimes.android.features.home.data;

import androidx.recyclerview.widget.RecyclerView;
import defpackage.by0;
import defpackage.fc1;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

@fc1(c = "com.nytimes.android.features.home.data.HomeDataFetcher", f = "HomeDataFetcher.kt", l = {24}, m = "fetchData")
/* loaded from: classes4.dex */
final class HomeDataFetcher$fetchData$1 extends ContinuationImpl {
    Object L$0;
    Object L$1;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ HomeDataFetcher this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    HomeDataFetcher$fetchData$1(HomeDataFetcher homeDataFetcher, by0 by0Var) {
        super(by0Var);
        this.this$0 = homeDataFetcher;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= RecyclerView.UNDEFINED_DURATION;
        return this.this$0.a(null, this);
    }
}
