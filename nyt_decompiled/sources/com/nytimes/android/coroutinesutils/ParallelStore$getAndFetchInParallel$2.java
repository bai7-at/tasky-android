package com.nytimes.android.coroutinesutils;

import defpackage.by0;
import defpackage.fc1;
import defpackage.gt2;
import defpackage.ww8;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.FlowCollector;

@fc1(c = "com.nytimes.android.coroutinesutils.ParallelStore$getAndFetchInParallel$2", f = "ParallelStore.kt", l = {206, 148, 154, 154, 160, 162, 165, 165}, m = "invokeSuspend")
/* loaded from: classes4.dex */
final class ParallelStore$getAndFetchInParallel$2 extends SuspendLambda implements gt2 {
    final /* synthetic */ Object $currentData;
    final /* synthetic */ Object $params;
    final /* synthetic */ FlowCollector<DownloadState> $this_getAndFetchInParallel;
    private /* synthetic */ Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    int label;
    final /* synthetic */ ParallelStore this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ParallelStore$getAndFetchInParallel$2(ParallelStore parallelStore, Object obj, FlowCollector flowCollector, Object obj2, by0 by0Var) {
        super(2, by0Var);
        this.this$0 = parallelStore;
        this.$currentData = obj;
        this.$this_getAndFetchInParallel = flowCollector;
        this.$params = obj2;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final by0 create(Object obj, by0 by0Var) {
        ParallelStore$getAndFetchInParallel$2 parallelStore$getAndFetchInParallel$2 = new ParallelStore$getAndFetchInParallel$2(this.this$0, this.$currentData, this.$this_getAndFetchInParallel, this.$params, by0Var);
        parallelStore$getAndFetchInParallel$2.L$0 = obj;
        return parallelStore$getAndFetchInParallel$2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0203  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0217 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:22:0x01fb A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x01fc  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x01cc  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0180  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0195 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0196  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0129  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0152  */
    /* JADX WARN: Type inference failed for: r1v0, types: [int] */
    /* JADX WARN: Type inference failed for: r1v1, types: [com.nytimes.android.coroutinesutils.b] */
    /* JADX WARN: Type inference failed for: r1v4 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r14) {
        /*
            Method dump skipped, instructions count: 578
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.nytimes.android.coroutinesutils.ParallelStore$getAndFetchInParallel$2.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // defpackage.gt2
    public final Object invoke(CoroutineScope coroutineScope, by0 by0Var) {
        return ((ParallelStore$getAndFetchInParallel$2) create(coroutineScope, by0Var)).invokeSuspend(ww8.a);
    }
}
