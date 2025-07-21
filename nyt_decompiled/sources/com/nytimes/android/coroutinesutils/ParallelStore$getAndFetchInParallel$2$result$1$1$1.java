package com.nytimes.android.coroutinesutils;

import com.nytimes.android.coroutinesutils.FetchResult;
import defpackage.by0;
import defpackage.fc1;
import defpackage.gt2;
import defpackage.ww8;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.f;

@fc1(c = "com.nytimes.android.coroutinesutils.ParallelStore$getAndFetchInParallel$2$result$1$1$1", f = "ParallelStore.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes4.dex */
final class ParallelStore$getAndFetchInParallel$2$result$1$1$1 extends SuspendLambda implements gt2 {
    /* synthetic */ Object L$0;
    int label;

    ParallelStore$getAndFetchInParallel$2$result$1$1$1(by0 by0Var) {
        super(2, by0Var);
    }

    @Override // defpackage.gt2
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public final Object invoke(FetchResult.b bVar, by0 by0Var) {
        return ((ParallelStore$getAndFetchInParallel$2$result$1$1$1) create(bVar, by0Var)).invokeSuspend(ww8.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final by0 create(Object obj, by0 by0Var) {
        ParallelStore$getAndFetchInParallel$2$result$1$1$1 parallelStore$getAndFetchInParallel$2$result$1$1$1 = new ParallelStore$getAndFetchInParallel$2$result$1$1$1(by0Var);
        parallelStore$getAndFetchInParallel$2$result$1$1$1.L$0 = obj;
        return parallelStore$getAndFetchInParallel$2$result$1$1$1;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        kotlin.coroutines.intrinsics.a.h();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        f.b(obj);
        return (FetchResult.b) this.L$0;
    }
}
