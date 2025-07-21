package com.nytimes.android.performancetracker.lib;

import defpackage.by0;
import defpackage.fc1;
import defpackage.gt2;
import defpackage.j32;
import defpackage.ww8;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.f;
import kotlinx.coroutines.CoroutineScope;

@fc1(c = "com.nytimes.android.performancetracker.lib.PerformanceTracker$begin$deferredParams$1", f = "PerformanceTracker.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes4.dex */
final class PerformanceTracker$begin$deferredParams$1 extends SuspendLambda implements gt2 {
    final /* synthetic */ j32 $type;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    PerformanceTracker$begin$deferredParams$1(j32 j32Var, by0 by0Var) {
        super(2, by0Var);
        this.$type = j32Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final by0 create(Object obj, by0 by0Var) {
        return new PerformanceTracker$begin$deferredParams$1(this.$type, by0Var);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        kotlin.coroutines.intrinsics.a.h();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        f.b(obj);
        return this.$type.b();
    }

    @Override // defpackage.gt2
    public final Object invoke(CoroutineScope coroutineScope, by0 by0Var) {
        return ((PerformanceTracker$begin$deferredParams$1) create(coroutineScope, by0Var)).invokeSuspend(ww8.a);
    }
}
