package com.apollographql.apollo;

import androidx.recyclerview.widget.RecyclerView;
import defpackage.by0;
import defpackage.fc1;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

@fc1(c = "com.apollographql.apollo.ApolloCall", f = "ApolloCall.kt", l = {206}, m = "singleSuccessOrException")
/* loaded from: classes2.dex */
final class ApolloCall$singleSuccessOrException$1 extends ContinuationImpl {
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ ApolloCall this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ApolloCall$singleSuccessOrException$1(ApolloCall apolloCall, by0 by0Var) {
        super(by0Var);
        this.this$0 = apolloCall;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object c;
        this.result = obj;
        this.label |= RecyclerView.UNDEFINED_DURATION;
        c = this.this$0.c(null, this);
        return c;
    }
}
