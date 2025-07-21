package com.nytimes.android.performancetrackerclientphoenix.event;

import com.nytimes.android.performancetrackerclientphoenix.event.base.AppEvent;
import com.nytimes.android.performancetrackerclientphoenix.monitor.b;
import defpackage.by0;
import defpackage.fc1;
import defpackage.gt2;
import defpackage.ww8;
import java.util.Iterator;
import java.util.Set;
import kotlin.coroutines.intrinsics.a;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.f;
import kotlinx.coroutines.CoroutineScope;

@fc1(c = "com.nytimes.android.performancetrackerclientphoenix.event.MetricsTracker$onResume$1", f = "MetricsTracker.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes4.dex */
final class MetricsTracker$onResume$1 extends SuspendLambda implements gt2 {
    int label;
    final /* synthetic */ MetricsTracker this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    MetricsTracker$onResume$1(MetricsTracker metricsTracker, by0 by0Var) {
        super(2, by0Var);
        this.this$0 = metricsTracker;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final by0 create(Object obj, by0 by0Var) {
        return new MetricsTracker$onResume$1(this.this$0, by0Var);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        a.h();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        f.b(obj);
        Set set = this.this$0.a;
        MetricsTracker metricsTracker = this.this$0;
        Iterator it2 = set.iterator();
        while (it2.hasNext()) {
            AppEvent a = ((b) it2.next()).a();
            if (a != null) {
                metricsTracker.b.d(AppEvent.toEventConvertible$default(a, null, 1, null));
            }
        }
        return ww8.a;
    }

    @Override // defpackage.gt2
    public final Object invoke(CoroutineScope coroutineScope, by0 by0Var) {
        return ((MetricsTracker$onResume$1) create(coroutineScope, by0Var)).invokeSuspend(ww8.a);
    }
}
