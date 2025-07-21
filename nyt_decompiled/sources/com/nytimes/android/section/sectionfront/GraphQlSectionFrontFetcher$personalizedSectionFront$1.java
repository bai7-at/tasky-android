package com.nytimes.android.section.sectionfront;

import androidx.recyclerview.widget.RecyclerView;
import defpackage.by0;
import defpackage.fc1;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

@fc1(c = "com.nytimes.android.section.sectionfront.GraphQlSectionFrontFetcher", f = "GraphQlSectionFrontFetcher.kt", l = {149, 154}, m = "personalizedSectionFront")
/* loaded from: classes4.dex */
final class GraphQlSectionFrontFetcher$personalizedSectionFront$1 extends ContinuationImpl {
    Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ GraphQlSectionFrontFetcher this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    GraphQlSectionFrontFetcher$personalizedSectionFront$1(GraphQlSectionFrontFetcher graphQlSectionFrontFetcher, by0 by0Var) {
        super(by0Var);
        this.this$0 = graphQlSectionFrontFetcher;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object q;
        this.result = obj;
        this.label |= RecyclerView.UNDEFINED_DURATION;
        q = this.this$0.q(null, null, this);
        return q;
    }
}
