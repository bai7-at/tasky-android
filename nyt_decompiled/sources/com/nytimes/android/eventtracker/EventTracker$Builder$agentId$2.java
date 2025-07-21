package com.nytimes.android.eventtracker;

import defpackage.by0;
import defpackage.fc1;
import defpackage.ss2;
import defpackage.ww8;
import defpackage.zq3;
import io.reactivex.Single;
import kotlin.coroutines.intrinsics.a;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.f;

@fc1(c = "com.nytimes.android.eventtracker.EventTracker$Builder$agentId$2", f = "EventTracker.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes4.dex */
final class EventTracker$Builder$agentId$2 extends SuspendLambda implements ss2 {
    final /* synthetic */ Single<String> $agentIdAsync;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    EventTracker$Builder$agentId$2(Single single, by0 by0Var) {
        super(1, by0Var);
        this.$agentIdAsync = single;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final by0 create(by0 by0Var) {
        return new EventTracker$Builder$agentId$2(this.$agentIdAsync, by0Var);
    }

    @Override // defpackage.ss2
    public final Object invoke(by0 by0Var) {
        return ((EventTracker$Builder$agentId$2) create(by0Var)).invokeSuspend(ww8.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        a.h();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        f.b(obj);
        String blockingGet = this.$agentIdAsync.blockingGet();
        zq3.g(blockingGet, "blockingGet(...)");
        return blockingGet;
    }
}
