package kotlinx.coroutines.flow;

import defpackage.ss2;
import kotlin.coroutines.CoroutineContext;
import kotlinx.coroutines.channels.BufferOverflow;
import kotlinx.coroutines.flow.internal.NullSurrogateKt;
import kotlinx.coroutines.internal.Symbol;

/* loaded from: classes5.dex */
public final class StateFlowKt {
    private static final Symbol NONE = new Symbol("NONE");
    private static final Symbol PENDING = new Symbol("PENDING");

    public static final <T> MutableStateFlow<T> MutableStateFlow(T t) {
        if (t == null) {
            t = (T) NullSurrogateKt.NULL;
        }
        return new StateFlowImpl(t);
    }

    public static final <T> Flow<T> fuseStateFlow(StateFlow<? extends T> stateFlow, CoroutineContext coroutineContext, int i, BufferOverflow bufferOverflow) {
        return (((i < 0 || i >= 2) && i != -2) || bufferOverflow != BufferOverflow.DROP_OLDEST) ? SharedFlowKt.fuseSharedFlow(stateFlow, coroutineContext, i, bufferOverflow) : stateFlow;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final <T> T getAndUpdate(MutableStateFlow<T> mutableStateFlow, ss2 ss2Var) {
        T t;
        do {
            t = (T) mutableStateFlow.getValue();
        } while (!mutableStateFlow.compareAndSet(t, ss2Var.invoke(t)));
        return t;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final <T> void update(MutableStateFlow<T> mutableStateFlow, ss2 ss2Var) {
        Object value;
        do {
            value = mutableStateFlow.getValue();
        } while (!mutableStateFlow.compareAndSet(value, ss2Var.invoke(value)));
    }

    public static final <T> T updateAndGet(MutableStateFlow<T> mutableStateFlow, ss2 ss2Var) {
        T value;
        T t;
        do {
            value = mutableStateFlow.getValue();
            t = (T) ss2Var.invoke(value);
        } while (!mutableStateFlow.compareAndSet(value, t));
        return t;
    }
}
