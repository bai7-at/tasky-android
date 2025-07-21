package kotlinx.coroutines.flow.internal;

import defpackage.by0;
import defpackage.it2;
import defpackage.ww8;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.coroutines.intrinsics.a;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.channels.BufferOverflow;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;

/* loaded from: classes5.dex */
public final class ChannelFlowTransformLatest<T, R> extends ChannelFlowOperator<T, R> {
    private final it2 transform;

    public /* synthetic */ ChannelFlowTransformLatest(it2 it2Var, Flow flow, CoroutineContext coroutineContext, int i, BufferOverflow bufferOverflow, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(it2Var, flow, (i2 & 4) != 0 ? EmptyCoroutineContext.a : coroutineContext, (i2 & 8) != 0 ? -2 : i, (i2 & 16) != 0 ? BufferOverflow.SUSPEND : bufferOverflow);
    }

    @Override // kotlinx.coroutines.flow.internal.ChannelFlow
    protected ChannelFlow<R> create(CoroutineContext coroutineContext, int i, BufferOverflow bufferOverflow) {
        return new ChannelFlowTransformLatest(this.transform, this.flow, coroutineContext, i, bufferOverflow);
    }

    @Override // kotlinx.coroutines.flow.internal.ChannelFlowOperator
    protected Object flowCollect(FlowCollector<? super R> flowCollector, by0<? super ww8> by0Var) {
        Object coroutineScope = CoroutineScopeKt.coroutineScope(new ChannelFlowTransformLatest$flowCollect$3(this, flowCollector, null), by0Var);
        return coroutineScope == a.h() ? coroutineScope : ww8.a;
    }

    public ChannelFlowTransformLatest(it2 it2Var, Flow<? extends T> flow, CoroutineContext coroutineContext, int i, BufferOverflow bufferOverflow) {
        super(flow, coroutineContext, i, bufferOverflow);
        this.transform = it2Var;
    }
}
