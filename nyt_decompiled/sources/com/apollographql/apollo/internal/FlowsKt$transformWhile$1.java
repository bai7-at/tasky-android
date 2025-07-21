package com.apollographql.apollo.internal;

import defpackage.by0;
import defpackage.fc1;
import defpackage.gt2;
import defpackage.it2;
import defpackage.ww8;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.f;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.internal.LockFreeTaskQueueCore;

@fc1(c = "com.apollographql.apollo.internal.FlowsKt$transformWhile$1", f = "flows.kt", l = {LockFreeTaskQueueCore.CLOSED_SHIFT}, m = "invokeSuspend")
/* loaded from: classes2.dex */
final class FlowsKt$transformWhile$1 extends SuspendLambda implements gt2 {
    final /* synthetic */ Flow<Object> $this_transformWhile;
    final /* synthetic */ it2 $transform;
    private /* synthetic */ Object L$0;
    int label;

    public static final class a implements FlowCollector {
        final /* synthetic */ FlowsKt$transformWhile$1$invokeSuspend$$inlined$collectWhile$1 a;

        public a(FlowsKt$transformWhile$1$invokeSuspend$$inlined$collectWhile$1 flowsKt$transformWhile$1$invokeSuspend$$inlined$collectWhile$1) {
            this.a = flowsKt$transformWhile$1$invokeSuspend$$inlined$collectWhile$1;
        }

        @Override // kotlinx.coroutines.flow.FlowCollector
        public final Object emit(Object obj, by0 by0Var) {
            Object emit = this.a.emit(obj, by0Var);
            return emit == kotlin.coroutines.intrinsics.a.h() ? emit : ww8.a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    FlowsKt$transformWhile$1(Flow flow, it2 it2Var, by0 by0Var) {
        super(2, by0Var);
        this.$this_transformWhile = flow;
        this.$transform = it2Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final by0 create(Object obj, by0 by0Var) {
        FlowsKt$transformWhile$1 flowsKt$transformWhile$1 = new FlowsKt$transformWhile$1(this.$this_transformWhile, this.$transform, by0Var);
        flowsKt$transformWhile$1.L$0 = obj;
        return flowsKt$transformWhile$1;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        FlowsKt$transformWhile$1$invokeSuspend$$inlined$collectWhile$1 flowsKt$transformWhile$1$invokeSuspend$$inlined$collectWhile$1;
        Object h = kotlin.coroutines.intrinsics.a.h();
        int i = this.label;
        if (i == 0) {
            f.b(obj);
            FlowCollector flowCollector = (FlowCollector) this.L$0;
            Flow<Object> flow = this.$this_transformWhile;
            FlowsKt$transformWhile$1$invokeSuspend$$inlined$collectWhile$1 flowsKt$transformWhile$1$invokeSuspend$$inlined$collectWhile$12 = new FlowsKt$transformWhile$1$invokeSuspend$$inlined$collectWhile$1(this.$transform, flowCollector);
            try {
                a aVar = new a(flowsKt$transformWhile$1$invokeSuspend$$inlined$collectWhile$12);
                this.L$0 = flowsKt$transformWhile$1$invokeSuspend$$inlined$collectWhile$12;
                this.label = 1;
                if (flow.collect(aVar, this) == h) {
                    return h;
                }
            } catch (AbortFlowException e) {
                e = e;
                flowsKt$transformWhile$1$invokeSuspend$$inlined$collectWhile$1 = flowsKt$transformWhile$1$invokeSuspend$$inlined$collectWhile$12;
                e.a(flowsKt$transformWhile$1$invokeSuspend$$inlined$collectWhile$1);
                return ww8.a;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            flowsKt$transformWhile$1$invokeSuspend$$inlined$collectWhile$1 = (FlowsKt$transformWhile$1$invokeSuspend$$inlined$collectWhile$1) this.L$0;
            try {
                f.b(obj);
            } catch (AbortFlowException e2) {
                e = e2;
                e.a(flowsKt$transformWhile$1$invokeSuspend$$inlined$collectWhile$1);
                return ww8.a;
            }
        }
        return ww8.a;
    }

    @Override // defpackage.gt2
    public final Object invoke(FlowCollector flowCollector, by0 by0Var) {
        return ((FlowsKt$transformWhile$1) create(flowCollector, by0Var)).invokeSuspend(ww8.a);
    }
}
