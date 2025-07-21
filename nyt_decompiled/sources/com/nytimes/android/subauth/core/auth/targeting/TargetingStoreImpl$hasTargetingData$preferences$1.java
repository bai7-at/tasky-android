package com.nytimes.android.subauth.core.auth.targeting;

import defpackage.ba1;
import defpackage.by0;
import defpackage.fc1;
import defpackage.gt2;
import defpackage.ww8;
import kotlin.coroutines.intrinsics.a;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.f;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;

@fc1(c = "com.nytimes.android.subauth.core.auth.targeting.TargetingStoreImpl$hasTargetingData$preferences$1", f = "TargetingStore.kt", l = {30}, m = "invokeSuspend")
/* loaded from: classes4.dex */
final class TargetingStoreImpl$hasTargetingData$preferences$1 extends SuspendLambda implements gt2 {
    int label;
    final /* synthetic */ TargetingStoreImpl this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    TargetingStoreImpl$hasTargetingData$preferences$1(TargetingStoreImpl targetingStoreImpl, by0 by0Var) {
        super(2, by0Var);
        this.this$0 = targetingStoreImpl;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final by0 create(Object obj, by0 by0Var) {
        return new TargetingStoreImpl$hasTargetingData$preferences$1(this.this$0, by0Var);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        ba1 ba1Var;
        Object h = a.h();
        int i = this.label;
        if (i == 0) {
            f.b(obj);
            ba1Var = this.this$0.a;
            Flow data = ba1Var.getData();
            this.label = 1;
            obj = FlowKt.firstOrNull(data, this);
            if (obj == h) {
                return h;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            f.b(obj);
        }
        return obj;
    }

    @Override // defpackage.gt2
    public final Object invoke(CoroutineScope coroutineScope, by0 by0Var) {
        return ((TargetingStoreImpl$hasTargetingData$preferences$1) create(coroutineScope, by0Var)).invokeSuspend(ww8.a);
    }
}
