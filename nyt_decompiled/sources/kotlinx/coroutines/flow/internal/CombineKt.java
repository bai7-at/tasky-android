package kotlinx.coroutines.flow.internal;

import defpackage.by0;
import defpackage.it2;
import defpackage.qs2;
import defpackage.ww8;
import kotlin.coroutines.intrinsics.a;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;

/* loaded from: classes5.dex */
public final class CombineKt {
    public static final <R, T> Object combineInternal(FlowCollector<? super R> flowCollector, Flow<? extends T>[] flowArr, qs2 qs2Var, it2 it2Var, by0<? super ww8> by0Var) {
        Object flowScope = FlowCoroutineKt.flowScope(new CombineKt$combineInternal$2(flowArr, qs2Var, it2Var, flowCollector, null), by0Var);
        return flowScope == a.h() ? flowScope : ww8.a;
    }

    public static final <T1, T2, R> Flow<R> zipImpl(final Flow<? extends T1> flow, final Flow<? extends T2> flow2, final it2 it2Var) {
        return new Flow<R>() { // from class: kotlinx.coroutines.flow.internal.CombineKt$zipImpl$$inlined$unsafeFlow$1
            @Override // kotlinx.coroutines.flow.Flow
            public Object collect(FlowCollector<? super R> flowCollector, by0<? super ww8> by0Var) {
                Object coroutineScope = CoroutineScopeKt.coroutineScope(new CombineKt$zipImpl$1$1(Flow.this, flow, flowCollector, it2Var, null), by0Var);
                return coroutineScope == a.h() ? coroutineScope : ww8.a;
            }
        };
    }
}
