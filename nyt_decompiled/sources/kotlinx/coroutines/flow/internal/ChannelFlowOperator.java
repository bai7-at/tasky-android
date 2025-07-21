package kotlinx.coroutines.flow.internal;

import defpackage.by0;
import defpackage.ww8;
import defpackage.zq3;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.c;
import kotlin.coroutines.intrinsics.a;
import kotlinx.coroutines.CoroutineContextKt;
import kotlinx.coroutines.channels.BufferOverflow;
import kotlinx.coroutines.channels.ProducerScope;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;

/* loaded from: classes5.dex */
public abstract class ChannelFlowOperator<S, T> extends ChannelFlow<T> {
    protected final Flow<S> flow;

    /* JADX WARN: Multi-variable type inference failed */
    public ChannelFlowOperator(Flow<? extends S> flow, CoroutineContext coroutineContext, int i, BufferOverflow bufferOverflow) {
        super(coroutineContext, i, bufferOverflow);
        this.flow = flow;
    }

    static /* synthetic */ <S, T> Object collect$suspendImpl(ChannelFlowOperator<S, T> channelFlowOperator, FlowCollector<? super T> flowCollector, by0<? super ww8> by0Var) {
        if (channelFlowOperator.capacity == -3) {
            CoroutineContext context = by0Var.getContext();
            CoroutineContext newCoroutineContext = CoroutineContextKt.newCoroutineContext(context, channelFlowOperator.context);
            if (zq3.c(newCoroutineContext, context)) {
                Object flowCollect = channelFlowOperator.flowCollect(flowCollector, by0Var);
                return flowCollect == a.h() ? flowCollect : ww8.a;
            }
            c.b bVar = c.P;
            if (zq3.c(newCoroutineContext.get(bVar), context.get(bVar))) {
                Object collectWithContextUndispatched = channelFlowOperator.collectWithContextUndispatched(flowCollector, newCoroutineContext, by0Var);
                return collectWithContextUndispatched == a.h() ? collectWithContextUndispatched : ww8.a;
            }
        }
        Object collect = super.collect(flowCollector, by0Var);
        return collect == a.h() ? collect : ww8.a;
    }

    static /* synthetic */ <S, T> Object collectTo$suspendImpl(ChannelFlowOperator<S, T> channelFlowOperator, ProducerScope<? super T> producerScope, by0<? super ww8> by0Var) {
        Object flowCollect = channelFlowOperator.flowCollect(new SendingCollector(producerScope), by0Var);
        return flowCollect == a.h() ? flowCollect : ww8.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object collectWithContextUndispatched(FlowCollector<? super T> flowCollector, CoroutineContext coroutineContext, by0<? super ww8> by0Var) {
        FlowCollector withUndispatchedContextCollector;
        withUndispatchedContextCollector = ChannelFlowKt.withUndispatchedContextCollector(flowCollector, by0Var.getContext());
        return ChannelFlowKt.withContextUndispatched$default(coroutineContext, withUndispatchedContextCollector, null, new ChannelFlowOperator$collectWithContextUndispatched$2(this, null), by0Var, 4, null);
    }

    @Override // kotlinx.coroutines.flow.internal.ChannelFlow, kotlinx.coroutines.flow.Flow
    public Object collect(FlowCollector<? super T> flowCollector, by0<? super ww8> by0Var) {
        return collect$suspendImpl((ChannelFlowOperator) this, (FlowCollector) flowCollector, by0Var);
    }

    @Override // kotlinx.coroutines.flow.internal.ChannelFlow
    protected Object collectTo(ProducerScope<? super T> producerScope, by0<? super ww8> by0Var) {
        return collectTo$suspendImpl(this, producerScope, by0Var);
    }

    protected abstract Object flowCollect(FlowCollector<? super T> flowCollector, by0<? super ww8> by0Var);

    @Override // kotlinx.coroutines.flow.internal.ChannelFlow
    public String toString() {
        return this.flow + " -> " + super.toString();
    }
}
