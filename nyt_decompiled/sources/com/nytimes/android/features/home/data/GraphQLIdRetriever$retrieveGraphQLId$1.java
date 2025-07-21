package com.nytimes.android.features.home.data;

import androidx.recyclerview.widget.RecyclerView;
import com.comscore.streaming.EventType;
import defpackage.by0;
import defpackage.fc1;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

@fc1(c = "com.nytimes.android.features.home.data.GraphQLIdRetriever", f = "GraphQLIdRetriever.kt", l = {EventType.SUBS}, m = "retrieveGraphQLId")
/* loaded from: classes4.dex */
final class GraphQLIdRetriever$retrieveGraphQLId$1 extends ContinuationImpl {
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ GraphQLIdRetriever this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    GraphQLIdRetriever$retrieveGraphQLId$1(GraphQLIdRetriever graphQLIdRetriever, by0 by0Var) {
        super(by0Var);
        this.this$0 = graphQLIdRetriever;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= RecyclerView.UNDEFINED_DURATION;
        return this.this$0.a(null, this);
    }
}
