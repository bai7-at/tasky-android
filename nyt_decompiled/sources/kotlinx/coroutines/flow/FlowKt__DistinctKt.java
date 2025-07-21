package kotlinx.coroutines.flow;

import defpackage.gt2;
import defpackage.ku8;
import defpackage.ss2;
import defpackage.zq3;

/* loaded from: classes5.dex */
final /* synthetic */ class FlowKt__DistinctKt {
    private static final ss2 defaultKeySelector = new ss2() { // from class: kotlinx.coroutines.flow.FlowKt__DistinctKt$defaultKeySelector$1
        @Override // defpackage.ss2
        public final Object invoke(Object obj) {
            return obj;
        }
    };
    private static final gt2 defaultAreEquivalent = new gt2() { // from class: kotlinx.coroutines.flow.FlowKt__DistinctKt$defaultAreEquivalent$1
        @Override // defpackage.gt2
        public final Boolean invoke(Object obj, Object obj2) {
            return Boolean.valueOf(zq3.c(obj, obj2));
        }
    };

    /* JADX WARN: Multi-variable type inference failed */
    public static final <T> Flow<T> distinctUntilChanged(Flow<? extends T> flow) {
        return flow instanceof StateFlow ? flow : distinctUntilChangedBy$FlowKt__DistinctKt(flow, defaultKeySelector, defaultAreEquivalent);
    }

    public static final <T, K> Flow<T> distinctUntilChangedBy(Flow<? extends T> flow, ss2 ss2Var) {
        return distinctUntilChangedBy$FlowKt__DistinctKt(flow, ss2Var, defaultAreEquivalent);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static final <T> Flow<T> distinctUntilChangedBy$FlowKt__DistinctKt(Flow<? extends T> flow, ss2 ss2Var, gt2 gt2Var) {
        if (flow instanceof DistinctFlowImpl) {
            DistinctFlowImpl distinctFlowImpl = (DistinctFlowImpl) flow;
            if (distinctFlowImpl.keySelector == ss2Var && distinctFlowImpl.areEquivalent == gt2Var) {
                return flow;
            }
        }
        return new DistinctFlowImpl(flow, ss2Var, gt2Var);
    }

    public static final <T> Flow<T> distinctUntilChanged(Flow<? extends T> flow, gt2 gt2Var) {
        ss2 ss2Var = defaultKeySelector;
        zq3.f(gt2Var, "null cannot be cast to non-null type kotlin.Function2<kotlin.Any?, kotlin.Any?, kotlin.Boolean>");
        return distinctUntilChangedBy$FlowKt__DistinctKt(flow, ss2Var, (gt2) ku8.f(gt2Var, 2));
    }
}
