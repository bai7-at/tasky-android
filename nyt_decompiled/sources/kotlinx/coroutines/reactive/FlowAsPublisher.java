package kotlinx.coroutines.reactive;

import defpackage.g86;
import defpackage.va8;
import kotlin.coroutines.CoroutineContext;
import kotlinx.coroutines.flow.Flow;

/* loaded from: classes5.dex */
final class FlowAsPublisher<T> implements g86 {
    private final CoroutineContext context;
    private final Flow<T> flow;

    /* JADX WARN: Multi-variable type inference failed */
    public FlowAsPublisher(Flow<? extends T> flow, CoroutineContext coroutineContext) {
        this.flow = flow;
        this.context = coroutineContext;
    }

    @Override // defpackage.g86
    public void subscribe(va8 va8Var) {
        va8Var.getClass();
        va8Var.onSubscribe(new FlowSubscription(this.flow, va8Var, this.context));
    }
}
