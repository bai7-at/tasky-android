package com.nytimes.android.internal.common.coroutines;

import defpackage.by0;
import defpackage.fc1;
import defpackage.gt2;
import defpackage.ww8;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.f;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;

@fc1(c = "com.nytimes.android.internal.common.coroutines.FlowObserverKt$observe$1$onStart$1", f = "FlowObserver.kt", l = {20}, m = "invokeSuspend")
/* loaded from: classes4.dex */
public final class FlowObserverKt$observe$1$onStart$1 extends SuspendLambda implements gt2 {
    final /* synthetic */ gt2 $collector;
    final /* synthetic */ Flow<Object> $this_observe;
    int label;

    public static final class a implements FlowCollector {
        final /* synthetic */ gt2 a;

        public a(gt2 gt2Var) {
            this.a = gt2Var;
        }

        @Override // kotlinx.coroutines.flow.FlowCollector
        public final Object emit(Object obj, by0 by0Var) {
            Object invoke = this.a.invoke(obj, by0Var);
            return invoke == kotlin.coroutines.intrinsics.a.h() ? invoke : ww8.a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FlowObserverKt$observe$1$onStart$1(Flow flow, gt2 gt2Var, by0 by0Var) {
        super(2, by0Var);
        this.$this_observe = flow;
        this.$collector = gt2Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final by0 create(Object obj, by0 by0Var) {
        return new FlowObserverKt$observe$1$onStart$1(this.$this_observe, this.$collector, by0Var);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object h = kotlin.coroutines.intrinsics.a.h();
        int i = this.label;
        if (i == 0) {
            f.b(obj);
            Flow<Object> flow = this.$this_observe;
            a aVar = new a(this.$collector);
            this.label = 1;
            if (flow.collect(aVar, this) == h) {
                return h;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            f.b(obj);
        }
        return ww8.a;
    }

    @Override // defpackage.gt2
    public final Object invoke(CoroutineScope coroutineScope, by0 by0Var) {
        return ((FlowObserverKt$observe$1$onStart$1) create(coroutineScope, by0Var)).invokeSuspend(ww8.a);
    }
}
