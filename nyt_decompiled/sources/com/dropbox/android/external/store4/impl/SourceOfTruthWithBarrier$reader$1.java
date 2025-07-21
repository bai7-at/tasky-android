package com.dropbox.android.external.store4.impl;

import defpackage.by0;
import defpackage.fc1;
import defpackage.gt2;
import defpackage.ww8;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.CompletableDeferred;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.internal.LockFreeTaskQueueCore;

@fc1(c = "com.dropbox.android.external.store4.impl.SourceOfTruthWithBarrier$reader$1", f = "SourceOfTruthWithBarrier.kt", l = {LockFreeTaskQueueCore.FROZEN_SHIFT, 63, 64, 129, 129}, m = "invokeSuspend")
/* loaded from: classes2.dex */
final class SourceOfTruthWithBarrier$reader$1 extends SuspendLambda implements gt2 {
    final /* synthetic */ Object $key;
    final /* synthetic */ CompletableDeferred<ww8> $lock;
    long J$0;
    private /* synthetic */ Object L$0;
    Object L$1;
    int label;
    final /* synthetic */ SourceOfTruthWithBarrier this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    SourceOfTruthWithBarrier$reader$1(SourceOfTruthWithBarrier sourceOfTruthWithBarrier, Object obj, CompletableDeferred completableDeferred, by0 by0Var) {
        super(2, by0Var);
        this.this$0 = sourceOfTruthWithBarrier;
        this.$key = obj;
        this.$lock = completableDeferred;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final by0 create(Object obj, by0 by0Var) {
        SourceOfTruthWithBarrier$reader$1 sourceOfTruthWithBarrier$reader$1 = new SourceOfTruthWithBarrier$reader$1(this.this$0, this.$key, this.$lock, by0Var);
        sourceOfTruthWithBarrier$reader$1.L$0 = obj;
        return sourceOfTruthWithBarrier$reader$1;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:21:0x00bd A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00aa A[RETURN] */
    /* JADX WARN: Type inference failed for: r1v0, types: [int, java.lang.Object] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r15) {
        /*
            Method dump skipped, instructions count: 216
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.dropbox.android.external.store4.impl.SourceOfTruthWithBarrier$reader$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // defpackage.gt2
    public final Object invoke(FlowCollector flowCollector, by0 by0Var) {
        return ((SourceOfTruthWithBarrier$reader$1) create(flowCollector, by0Var)).invokeSuspend(ww8.a);
    }
}
