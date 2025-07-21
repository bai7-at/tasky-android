package com.nytimes.android.libs.messagingarchitecture.network;

import androidx.recyclerview.widget.RecyclerView;
import defpackage.by0;
import defpackage.fc1;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

@fc1(c = "com.nytimes.android.libs.messagingarchitecture.network.GraphQlMessageFetcher", f = "GraphQlMessageFetcher.kt", l = {68}, m = "fetchData")
/* loaded from: classes4.dex */
final class GraphQlMessageFetcher$fetchData$1 extends ContinuationImpl {
    Object L$0;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ GraphQlMessageFetcher this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    GraphQlMessageFetcher$fetchData$1(GraphQlMessageFetcher graphQlMessageFetcher, by0 by0Var) {
        super(by0Var);
        this.this$0 = graphQlMessageFetcher;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= RecyclerView.UNDEFINED_DURATION;
        return this.this$0.a(this);
    }
}
