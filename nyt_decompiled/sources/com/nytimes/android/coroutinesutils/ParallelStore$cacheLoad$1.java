package com.nytimes.android.coroutinesutils;

import androidx.recyclerview.widget.RecyclerView;
import defpackage.by0;
import defpackage.fc1;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

@fc1(c = "com.nytimes.android.coroutinesutils.ParallelStore", f = "ParallelStore.kt", l = {184}, m = "cacheLoad")
/* loaded from: classes4.dex */
final class ParallelStore$cacheLoad$1 extends ContinuationImpl {
    Object L$0;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ ParallelStore this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ParallelStore$cacheLoad$1(ParallelStore parallelStore, by0 by0Var) {
        super(by0Var);
        this.this$0 = parallelStore;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object k;
        this.result = obj;
        this.label |= RecyclerView.UNDEFINED_DURATION;
        k = this.this$0.k(null, null, this);
        return k;
    }
}
