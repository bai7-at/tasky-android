package kotlinx.coroutines.flow;

import defpackage.by0;
import defpackage.ww8;
import kotlinx.coroutines.ExperimentalCoroutinesApi;

/* loaded from: classes5.dex */
public interface MutableSharedFlow<T> extends SharedFlow<T>, FlowCollector<T> {
    @Override // kotlinx.coroutines.flow.FlowCollector
    Object emit(T t, by0<? super ww8> by0Var);

    StateFlow<Integer> getSubscriptionCount();

    @ExperimentalCoroutinesApi
    void resetReplayCache();

    boolean tryEmit(T t);
}
