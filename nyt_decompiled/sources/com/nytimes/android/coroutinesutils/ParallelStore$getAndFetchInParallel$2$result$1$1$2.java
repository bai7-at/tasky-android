package com.nytimes.android.coroutinesutils;

import com.nytimes.android.coroutinesutils.FetchResult;
import defpackage.by0;
import defpackage.fc1;
import defpackage.gt2;
import defpackage.ww8;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.f;

@fc1(c = "com.nytimes.android.coroutinesutils.ParallelStore$getAndFetchInParallel$2$result$1$1$2", f = "ParallelStore.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes4.dex */
final class ParallelStore$getAndFetchInParallel$2$result$1$1$2 extends SuspendLambda implements gt2 {
    int label;

    ParallelStore$getAndFetchInParallel$2$result$1$1$2(by0 by0Var) {
        super(2, by0Var);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final by0 create(Object obj, by0 by0Var) {
        return new ParallelStore$getAndFetchInParallel$2$result$1$1$2(by0Var);
    }

    @Override // defpackage.gt2
    public final Object invoke(ww8 ww8Var, by0 by0Var) {
        return ((ParallelStore$getAndFetchInParallel$2$result$1$1$2) create(ww8Var, by0Var)).invokeSuspend(ww8.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        kotlin.coroutines.intrinsics.a.h();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        f.b(obj);
        return new FetchResult.c();
    }
}
