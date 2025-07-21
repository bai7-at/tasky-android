package com.nytimes.android.section.sectionfront;

import androidx.recyclerview.widget.RecyclerView;
import defpackage.by0;
import defpackage.fc1;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

@fc1(c = "com.nytimes.android.section.sectionfront.GraphQlSectionFrontFetcher", f = "GraphQlSectionFrontFetcher.kt", l = {225}, m = "queryCookingCollection")
/* loaded from: classes4.dex */
final class GraphQlSectionFrontFetcher$queryCookingCollection$1 extends ContinuationImpl {
    Object L$0;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ GraphQlSectionFrontFetcher this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    GraphQlSectionFrontFetcher$queryCookingCollection$1(GraphQlSectionFrontFetcher graphQlSectionFrontFetcher, by0 by0Var) {
        super(by0Var);
        this.this$0 = graphQlSectionFrontFetcher;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= RecyclerView.UNDEFINED_DURATION;
        return this.this$0.s(null, this);
    }
}
