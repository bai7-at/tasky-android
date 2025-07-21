package com.nytimes.android.performancetrackerclientphoenix.event.base;

import com.nytimes.android.performancetracker.lib.PerformanceTracker;
import defpackage.by0;
import defpackage.cr5;
import defpackage.fc1;
import defpackage.gt2;
import defpackage.ww8;
import java.util.Map;
import kotlin.coroutines.intrinsics.a;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.f;
import kotlinx.coroutines.CoroutineScope;

@fc1(c = "com.nytimes.android.performancetrackerclientphoenix.event.base.BasePerformanceTracker$end$1", f = "BasePerformanceTracker.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes4.dex */
final class BasePerformanceTracker$end$1 extends SuspendLambda implements gt2 {
    final /* synthetic */ Map<String, Object> $extraParams;
    final /* synthetic */ PerformanceTracker.b $token;
    int label;
    final /* synthetic */ BasePerformanceTracker this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    BasePerformanceTracker$end$1(BasePerformanceTracker basePerformanceTracker, PerformanceTracker.b bVar, Map map, by0 by0Var) {
        super(2, by0Var);
        this.this$0 = basePerformanceTracker;
        this.$token = bVar;
        this.$extraParams = map;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final by0 create(Object obj, by0 by0Var) {
        return new BasePerformanceTracker$end$1(this.this$0, this.$token, this.$extraParams, by0Var);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        cr5 cr5Var;
        a.h();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        f.b(obj);
        cr5Var = this.this$0.a;
        cr5Var.a(this.$token, this.$extraParams);
        return ww8.a;
    }

    @Override // defpackage.gt2
    public final Object invoke(CoroutineScope coroutineScope, by0 by0Var) {
        return ((BasePerformanceTracker$end$1) create(coroutineScope, by0Var)).invokeSuspend(ww8.a);
    }
}
