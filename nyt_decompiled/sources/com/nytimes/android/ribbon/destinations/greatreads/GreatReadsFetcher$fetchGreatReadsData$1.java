package com.nytimes.android.ribbon.destinations.greatreads;

import androidx.recyclerview.widget.RecyclerView;
import defpackage.by0;
import defpackage.fc1;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import zendesk.core.BuildConfig;

@fc1(c = "com.nytimes.android.ribbon.destinations.greatreads.GreatReadsFetcher", f = "GreatReadsFetcher.kt", l = {BuildConfig.VERSION_CODE, 59, 69}, m = "fetchGreatReadsData")
/* loaded from: classes4.dex */
final class GreatReadsFetcher$fetchGreatReadsData$1 extends ContinuationImpl {
    Object L$0;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ GreatReadsFetcher this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    GreatReadsFetcher$fetchGreatReadsData$1(GreatReadsFetcher greatReadsFetcher, by0 by0Var) {
        super(by0Var);
        this.this$0 = greatReadsFetcher;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object c;
        this.result = obj;
        this.label |= RecyclerView.UNDEFINED_DURATION;
        c = this.this$0.c(this);
        return c;
    }
}
