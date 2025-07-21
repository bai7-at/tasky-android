package com.nytimes.android.embrace.backgroundqueue;

import defpackage.by0;
import defpackage.cc0;
import defpackage.fc1;
import defpackage.gt2;
import defpackage.kt2;
import defpackage.rz1;
import defpackage.ul8;
import defpackage.ww8;
import java.util.List;
import kotlin.coroutines.intrinsics.a;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.f;
import kotlinx.coroutines.CoroutineScope;

@fc1(c = "com.nytimes.android.embrace.backgroundqueue.BackgroundEmbraceTimberQueue$flush$1", f = "BackgroundEmbraceTimberQueue.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes4.dex */
final class BackgroundEmbraceTimberQueue$flush$1 extends SuspendLambda implements gt2 {
    final /* synthetic */ List<rz1> $dataList;
    final /* synthetic */ int $queueSize;
    int label;
    final /* synthetic */ BackgroundEmbraceTimberQueue this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    BackgroundEmbraceTimberQueue$flush$1(int i, List list, BackgroundEmbraceTimberQueue backgroundEmbraceTimberQueue, by0 by0Var) {
        super(2, by0Var);
        this.$queueSize = i;
        this.$dataList = list;
        this.this$0 = backgroundEmbraceTimberQueue;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final by0 create(Object obj, by0 by0Var) {
        return new BackgroundEmbraceTimberQueue$flush$1(this.$queueSize, this.$dataList, this.this$0, by0Var);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        kt2 kt2Var;
        a.h();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        f.b(obj);
        ul8.a.z("EMBRACE").a("Flushing Embrace BG Logs: " + this.$queueSize, new Object[0]);
        List<rz1> list = this.$dataList;
        BackgroundEmbraceTimberQueue backgroundEmbraceTimberQueue = this.this$0;
        for (rz1 rz1Var : list) {
            kt2Var = backgroundEmbraceTimberQueue.b;
            kt2Var.invoke(cc0.c(rz1Var.b()), rz1Var.d(), rz1Var.a(), rz1Var.c());
        }
        return ww8.a;
    }

    @Override // defpackage.gt2
    public final Object invoke(CoroutineScope coroutineScope, by0 by0Var) {
        return ((BackgroundEmbraceTimberQueue$flush$1) create(coroutineScope, by0Var)).invokeSuspend(ww8.a);
    }
}
