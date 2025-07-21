package com.nytimes.android.section.sectionfront;

import androidx.recyclerview.widget.RecyclerView;
import defpackage.by0;
import defpackage.fc1;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

@fc1(c = "com.nytimes.android.section.sectionfront.GraphQlSectionFrontFetcher", f = "GraphQlSectionFrontFetcher.kt", l = {289}, m = "awaitData")
/* loaded from: classes4.dex */
final class GraphQlSectionFrontFetcher$awaitData$1<T> extends ContinuationImpl {
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ GraphQlSectionFrontFetcher this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    GraphQlSectionFrontFetcher$awaitData$1(GraphQlSectionFrontFetcher graphQlSectionFrontFetcher, by0 by0Var) {
        super(by0Var);
        this.this$0 = graphQlSectionFrontFetcher;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object k;
        this.result = obj;
        this.label |= RecyclerView.UNDEFINED_DURATION;
        k = this.this$0.k(null, this);
        return k;
    }
}
