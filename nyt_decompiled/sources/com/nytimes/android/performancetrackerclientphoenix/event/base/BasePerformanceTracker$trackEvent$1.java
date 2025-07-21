package com.nytimes.android.performancetrackerclientphoenix.event.base;

import defpackage.by0;
import defpackage.cr5;
import defpackage.fc1;
import defpackage.gt2;
import defpackage.ww8;
import kotlin.coroutines.intrinsics.a;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.f;
import kotlinx.coroutines.CoroutineScope;

@fc1(c = "com.nytimes.android.performancetrackerclientphoenix.event.base.BasePerformanceTracker$trackEvent$1", f = "BasePerformanceTracker.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes4.dex */
final class BasePerformanceTracker$trackEvent$1 extends SuspendLambda implements gt2 {
    final /* synthetic */ AppEvent $event;
    int label;
    final /* synthetic */ BasePerformanceTracker this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    BasePerformanceTracker$trackEvent$1(BasePerformanceTracker basePerformanceTracker, AppEvent appEvent, by0 by0Var) {
        super(2, by0Var);
        this.this$0 = basePerformanceTracker;
        this.$event = appEvent;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final by0 create(Object obj, by0 by0Var) {
        return new BasePerformanceTracker$trackEvent$1(this.this$0, this.$event, by0Var);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        cr5 cr5Var;
        AppEventFactory appEventFactory;
        a.h();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        f.b(obj);
        cr5Var = this.this$0.a;
        appEventFactory = this.this$0.b;
        cr5Var.d(appEventFactory.a(this.$event));
        return ww8.a;
    }

    @Override // defpackage.gt2
    public final Object invoke(CoroutineScope coroutineScope, by0 by0Var) {
        return ((BasePerformanceTracker$trackEvent$1) create(coroutineScope, by0Var)).invokeSuspend(ww8.a);
    }
}
