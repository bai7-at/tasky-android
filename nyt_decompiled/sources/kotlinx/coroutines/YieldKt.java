package kotlinx.coroutines;

import defpackage.by0;
import defpackage.hc1;
import defpackage.ww8;
import kotlin.coroutines.CoroutineContext;
import kotlinx.coroutines.internal.DispatchedContinuation;
import kotlinx.coroutines.internal.DispatchedContinuationKt;

/* loaded from: classes5.dex */
public final class YieldKt {
    public static final Object yield(by0<? super ww8> by0Var) {
        Object h;
        CoroutineContext context = by0Var.getContext();
        JobKt.ensureActive(context);
        by0 d = kotlin.coroutines.intrinsics.a.d(by0Var);
        DispatchedContinuation dispatchedContinuation = d instanceof DispatchedContinuation ? (DispatchedContinuation) d : null;
        if (dispatchedContinuation == null) {
            h = ww8.a;
        } else {
            if (dispatchedContinuation.dispatcher.isDispatchNeeded(context)) {
                dispatchedContinuation.dispatchYield$kotlinx_coroutines_core(context, ww8.a);
            } else {
                YieldContext yieldContext = new YieldContext();
                CoroutineContext plus = context.plus(yieldContext);
                ww8 ww8Var = ww8.a;
                dispatchedContinuation.dispatchYield$kotlinx_coroutines_core(plus, ww8Var);
                if (yieldContext.dispatcherWasUnconfined) {
                    h = DispatchedContinuationKt.yieldUndispatched(dispatchedContinuation) ? kotlin.coroutines.intrinsics.a.h() : ww8Var;
                }
            }
            h = kotlin.coroutines.intrinsics.a.h();
        }
        if (h == kotlin.coroutines.intrinsics.a.h()) {
            hc1.c(by0Var);
        }
        return h == kotlin.coroutines.intrinsics.a.h() ? h : ww8.a;
    }
}
