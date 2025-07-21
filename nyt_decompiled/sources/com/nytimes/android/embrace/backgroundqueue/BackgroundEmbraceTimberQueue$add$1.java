package com.nytimes.android.embrace.backgroundqueue;

import defpackage.by0;
import defpackage.fc1;
import defpackage.gt2;
import defpackage.rz1;
import defpackage.ww8;
import java.util.concurrent.ConcurrentLinkedQueue;
import kotlin.coroutines.intrinsics.a;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.f;
import kotlinx.coroutines.CoroutineScope;

@fc1(c = "com.nytimes.android.embrace.backgroundqueue.BackgroundEmbraceTimberQueue$add$1", f = "BackgroundEmbraceTimberQueue.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes4.dex */
final class BackgroundEmbraceTimberQueue$add$1 extends SuspendLambda implements gt2 {
    final /* synthetic */ rz1 $data;
    int label;
    final /* synthetic */ BackgroundEmbraceTimberQueue this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    BackgroundEmbraceTimberQueue$add$1(BackgroundEmbraceTimberQueue backgroundEmbraceTimberQueue, rz1 rz1Var, by0 by0Var) {
        super(2, by0Var);
        this.this$0 = backgroundEmbraceTimberQueue;
        this.$data = rz1Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final by0 create(Object obj, by0 by0Var) {
        return new BackgroundEmbraceTimberQueue$add$1(this.this$0, this.$data, by0Var);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        ConcurrentLinkedQueue concurrentLinkedQueue;
        int i;
        ConcurrentLinkedQueue concurrentLinkedQueue2;
        ConcurrentLinkedQueue concurrentLinkedQueue3;
        a.h();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        f.b(obj);
        concurrentLinkedQueue = this.this$0.d;
        int size = concurrentLinkedQueue.size();
        i = this.this$0.a;
        if (size >= i) {
            concurrentLinkedQueue3 = this.this$0.d;
            concurrentLinkedQueue3.poll();
        }
        concurrentLinkedQueue2 = this.this$0.d;
        concurrentLinkedQueue2.add(this.$data);
        return ww8.a;
    }

    @Override // defpackage.gt2
    public final Object invoke(CoroutineScope coroutineScope, by0 by0Var) {
        return ((BackgroundEmbraceTimberQueue$add$1) create(coroutineScope, by0Var)).invokeSuspend(ww8.a);
    }
}
