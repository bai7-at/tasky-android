package kotlinx.coroutines.flow;

import defpackage.by0;
import defpackage.gt2;
import defpackage.ss2;
import defpackage.ww8;
import kotlin.coroutines.intrinsics.a;
import kotlin.jvm.internal.Ref$ObjectRef;
import kotlinx.coroutines.flow.internal.NullSurrogateKt;

/* loaded from: classes5.dex */
final class DistinctFlowImpl<T> implements Flow<T> {
    public final gt2 areEquivalent;
    public final ss2 keySelector;
    private final Flow<T> upstream;

    /* JADX WARN: Multi-variable type inference failed */
    public DistinctFlowImpl(Flow<? extends T> flow, ss2 ss2Var, gt2 gt2Var) {
        this.upstream = flow;
        this.keySelector = ss2Var;
        this.areEquivalent = gt2Var;
    }

    @Override // kotlinx.coroutines.flow.Flow
    public Object collect(FlowCollector<? super T> flowCollector, by0<? super ww8> by0Var) {
        Ref$ObjectRef ref$ObjectRef = new Ref$ObjectRef();
        ref$ObjectRef.element = (T) NullSurrogateKt.NULL;
        Object collect = this.upstream.collect(new DistinctFlowImpl$collect$2(this, ref$ObjectRef, flowCollector), by0Var);
        return collect == a.h() ? collect : ww8.a;
    }
}
