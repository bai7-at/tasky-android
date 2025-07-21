package kotlinx.coroutines.flow.internal;

import defpackage.by0;
import defpackage.gt2;
import defpackage.hc1;
import defpackage.it2;
import defpackage.ww8;
import kotlin.coroutines.intrinsics.a;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.intrinsics.UndispatchedKt;

/* loaded from: classes5.dex */
public final class FlowCoroutineKt {
    public static final <R> Object flowScope(gt2 gt2Var, by0<? super R> by0Var) {
        FlowCoroutine flowCoroutine = new FlowCoroutine(by0Var.getContext(), by0Var);
        Object startUndispatchedOrReturn = UndispatchedKt.startUndispatchedOrReturn(flowCoroutine, flowCoroutine, gt2Var);
        if (startUndispatchedOrReturn == a.h()) {
            hc1.c(by0Var);
        }
        return startUndispatchedOrReturn;
    }

    public static final <R> Flow<R> scopedFlow(final it2 it2Var) {
        return new Flow<R>() { // from class: kotlinx.coroutines.flow.internal.FlowCoroutineKt$scopedFlow$$inlined$unsafeFlow$1
            @Override // kotlinx.coroutines.flow.Flow
            public Object collect(FlowCollector<? super R> flowCollector, by0<? super ww8> by0Var) {
                Object flowScope = FlowCoroutineKt.flowScope(new FlowCoroutineKt$scopedFlow$1$1(it2.this, flowCollector, null), by0Var);
                return flowScope == a.h() ? flowScope : ww8.a;
            }
        };
    }
}
