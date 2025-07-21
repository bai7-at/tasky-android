package com.nytimes.android.eventtracker.asyncdata;

import androidx.recyclerview.widget.RecyclerView;
import defpackage.by0;
import defpackage.fc1;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

@fc1(c = "com.nytimes.android.eventtracker.asyncdata.DefaultAsyncDataProvider", f = "DefaultAsyncDataProvider.kt", l = {23}, m = "get")
/* loaded from: classes4.dex */
final class DefaultAsyncDataProvider$get$1 extends ContinuationImpl {
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ DefaultAsyncDataProvider this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    DefaultAsyncDataProvider$get$1(DefaultAsyncDataProvider defaultAsyncDataProvider, by0 by0Var) {
        super(by0Var);
        this.this$0 = defaultAsyncDataProvider;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= RecyclerView.UNDEFINED_DURATION;
        return this.this$0.a(this);
    }
}
