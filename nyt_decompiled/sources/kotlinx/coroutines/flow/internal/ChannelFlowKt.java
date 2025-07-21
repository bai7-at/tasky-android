package kotlinx.coroutines.flow.internal;

import defpackage.by0;
import defpackage.gt2;
import defpackage.hc1;
import defpackage.ku8;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.a;
import kotlin.coroutines.jvm.internal.BaseContinuationImpl;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.internal.ThreadContextKt;

/* loaded from: classes5.dex */
public final class ChannelFlowKt {
    public static final <T> ChannelFlow<T> asChannelFlow(Flow<? extends T> flow) {
        ChannelFlow<T> channelFlow = flow instanceof ChannelFlow ? (ChannelFlow) flow : null;
        if (channelFlow == null) {
            return new ChannelFlowOperatorImpl(flow, null, 0, null, 14, null);
        }
        return channelFlow;
    }

    public static final <T, V> Object withContextUndispatched(CoroutineContext coroutineContext, V v, Object obj, gt2 gt2Var, by0<? super T> by0Var) {
        Object updateThreadContext = ThreadContextKt.updateThreadContext(coroutineContext, obj);
        try {
            StackFrameContinuation stackFrameContinuation = new StackFrameContinuation(by0Var, coroutineContext);
            Object f = !(gt2Var instanceof BaseContinuationImpl) ? a.f(gt2Var, v, stackFrameContinuation) : ((gt2) ku8.f(gt2Var, 2)).invoke(v, stackFrameContinuation);
            ThreadContextKt.restoreThreadContext(coroutineContext, updateThreadContext);
            if (f == a.h()) {
                hc1.c(by0Var);
            }
            return f;
        } catch (Throwable th) {
            ThreadContextKt.restoreThreadContext(coroutineContext, updateThreadContext);
            throw th;
        }
    }

    public static /* synthetic */ Object withContextUndispatched$default(CoroutineContext coroutineContext, Object obj, Object obj2, gt2 gt2Var, by0 by0Var, int i, Object obj3) {
        if ((i & 4) != 0) {
            obj2 = ThreadContextKt.threadContextElements(coroutineContext);
        }
        return withContextUndispatched(coroutineContext, obj, obj2, gt2Var, by0Var);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final <T> FlowCollector<T> withUndispatchedContextCollector(FlowCollector<? super T> flowCollector, CoroutineContext coroutineContext) {
        return flowCollector instanceof SendingCollector ? true : flowCollector instanceof NopCollector ? flowCollector : new UndispatchedContextCollector(flowCollector, coroutineContext);
    }
}
