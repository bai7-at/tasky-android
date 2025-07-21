package com.nytimes.android.eventtracker.agent;

import androidx.recyclerview.widget.RecyclerView;
import defpackage.by0;
import defpackage.fc1;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

@fc1(c = "com.nytimes.android.eventtracker.agent.DefaultAgentProvider", f = "DefaultAgentProvider.kt", l = {37}, m = "get")
/* loaded from: classes4.dex */
final class DefaultAgentProvider$get$1 extends ContinuationImpl {
    Object L$0;
    Object L$1;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ DefaultAgentProvider this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    DefaultAgentProvider$get$1(DefaultAgentProvider defaultAgentProvider, by0 by0Var) {
        super(by0Var);
        this.this$0 = defaultAgentProvider;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= RecyclerView.UNDEFINED_DURATION;
        return this.this$0.a(null, this);
    }
}
