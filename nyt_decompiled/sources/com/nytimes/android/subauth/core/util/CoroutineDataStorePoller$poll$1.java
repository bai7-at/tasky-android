package com.nytimes.android.subauth.core.util;

import defpackage.by0;
import defpackage.fc1;
import defpackage.gt2;
import defpackage.ww8;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.channels.ProducerScope;

@fc1(c = "com.nytimes.android.subauth.core.util.CoroutineDataStorePoller$poll$1", f = "CoroutinePoller.kt", l = {74, 79, 80, 81, 83, 87, 88, 89, 90, 95}, m = "invokeSuspend")
/* loaded from: classes4.dex */
final class CoroutineDataStorePoller$poll$1 extends SuspendLambda implements gt2 {
    final /* synthetic */ long $delay;
    private /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ CoroutineDataStorePoller this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    CoroutineDataStorePoller$poll$1(CoroutineDataStorePoller coroutineDataStorePoller, long j, by0 by0Var) {
        super(2, by0Var);
        this.this$0 = coroutineDataStorePoller;
        this.$delay = j;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final by0 create(Object obj, by0 by0Var) {
        CoroutineDataStorePoller$poll$1 coroutineDataStorePoller$poll$1 = new CoroutineDataStorePoller$poll$1(this.this$0, this.$delay, by0Var);
        coroutineDataStorePoller$poll$1.L$0 = obj;
        return coroutineDataStorePoller$poll$1;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0099  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00a3  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00c8 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00d6 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00e4 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00e5  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x010e A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:53:0x011d A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:9:0x012c A[RETURN] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:38:0x00e2 -> B:9:0x0061). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:49:0x011b -> B:7:0x011e). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:52:0x013d -> B:9:0x0061). Please report as a decompilation issue!!! */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r13) {
        /*
            Method dump skipped, instructions count: 350
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.nytimes.android.subauth.core.util.CoroutineDataStorePoller$poll$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // defpackage.gt2
    public final Object invoke(ProducerScope producerScope, by0 by0Var) {
        return ((CoroutineDataStorePoller$poll$1) create(producerScope, by0Var)).invokeSuspend(ww8.a);
    }
}
