package com.nytimes.android.coroutinesutils;

import androidx.recyclerview.widget.RecyclerView;
import defpackage.by0;
import defpackage.fc1;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

@fc1(c = "com.nytimes.android.coroutinesutils.ParallelStore", f = "ParallelStore.kt", l = {104, 105, 114, 117, 119}, m = "loadFromCacheOrFetch")
/* loaded from: classes4.dex */
final class ParallelStore$loadFromCacheOrFetch$1 extends ContinuationImpl {
    Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    Object L$4;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ ParallelStore this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ParallelStore$loadFromCacheOrFetch$1(ParallelStore parallelStore, by0 by0Var) {
        super(by0Var);
        this.this$0 = parallelStore;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object q;
        this.result = obj;
        this.label |= RecyclerView.UNDEFINED_DURATION;
        q = this.this$0.q(null, null, null, this);
        return q;
    }
}
