package kotlinx.coroutines.flow;

import defpackage.by0;
import defpackage.ww8;
import kotlin.coroutines.intrinsics.a;

/* loaded from: classes5.dex */
final class CancellableFlowImpl<T> implements CancellableFlow<T> {
    private final Flow<T> flow;

    /* JADX WARN: Multi-variable type inference failed */
    public CancellableFlowImpl(Flow<? extends T> flow) {
        this.flow = flow;
    }

    @Override // kotlinx.coroutines.flow.Flow
    public Object collect(FlowCollector<? super T> flowCollector, by0<? super ww8> by0Var) {
        Object collect = this.flow.collect(new CancellableFlowImpl$collect$2(flowCollector), by0Var);
        return collect == a.h() ? collect : ww8.a;
    }
}
