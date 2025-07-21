package com.nytimes.android.coroutinesutils;

import com.nytimes.android.coroutinesutils.FetchResult;
import defpackage.by0;
import defpackage.fc1;
import defpackage.gt2;
import defpackage.ww8;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.f;
import kotlinx.coroutines.CoroutineScope;

@fc1(c = "com.nytimes.android.coroutinesutils.ParallelStore$getAndFetchInParallel$2$fetch$1", f = "ParallelStore.kt", l = {129}, m = "invokeSuspend")
/* loaded from: classes4.dex */
final class ParallelStore$getAndFetchInParallel$2$fetch$1 extends SuspendLambda implements gt2 {
    final /* synthetic */ Object $params;
    int label;
    final /* synthetic */ ParallelStore this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ParallelStore$getAndFetchInParallel$2$fetch$1(ParallelStore parallelStore, Object obj, by0 by0Var) {
        super(2, by0Var);
        this.this$0 = parallelStore;
        this.$params = obj;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final by0 create(Object obj, by0 by0Var) {
        return new ParallelStore$getAndFetchInParallel$2$fetch$1(this.this$0, this.$params, by0Var);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        gt2 gt2Var;
        Object h = kotlin.coroutines.intrinsics.a.h();
        int i = this.label;
        try {
            if (i == 0) {
                f.b(obj);
                FetchResult.a aVar = FetchResult.Companion;
                ParallelStore parallelStore = this.this$0;
                Object obj2 = this.$params;
                gt2Var = parallelStore.c;
                this.label = 1;
                obj = gt2Var.invoke(obj2, this);
                if (obj == h) {
                    return h;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                f.b(obj);
            }
            return new FetchResult.b.C0251b(obj);
        } catch (Exception e) {
            return new FetchResult.b.a(e);
        }
    }

    @Override // defpackage.gt2
    public final Object invoke(CoroutineScope coroutineScope, by0 by0Var) {
        return ((ParallelStore$getAndFetchInParallel$2$fetch$1) create(coroutineScope, by0Var)).invokeSuspend(ww8.a);
    }
}
