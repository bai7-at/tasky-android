package kotlinx.coroutines.reactive;

import defpackage.g86;
import java.util.ServiceLoader;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.sequences.d;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.flow.Flow;

/* loaded from: classes5.dex */
public final class ReactiveFlowKt {
    private static final ContextInjector[] contextInjectors = (ContextInjector[]) d.w(d.c(ServiceLoader.load(ContextInjector.class, ContextInjector.class.getClassLoader()).iterator())).toArray(new ContextInjector[0]);

    public static final <T> Flow<T> asFlow(g86 g86Var) {
        return new PublisherAsFlow(g86Var, null, 0, null, 14, null);
    }

    public static final <T> g86 asPublisher(Flow<? extends T> flow) {
        return asPublisher$default(flow, null, 1, null);
    }

    public static /* synthetic */ g86 asPublisher$default(Flow flow, CoroutineContext coroutineContext, int i, Object obj) {
        if ((i & 1) != 0) {
            coroutineContext = EmptyCoroutineContext.a;
        }
        return asPublisher(flow, coroutineContext);
    }

    public static final <T> g86 injectCoroutineContext(g86 g86Var, CoroutineContext coroutineContext) {
        for (ContextInjector contextInjector : contextInjectors) {
            g86Var = contextInjector.injectCoroutineContext(g86Var, coroutineContext);
        }
        return g86Var;
    }

    public static final <T> g86 asPublisher(Flow<? extends T> flow, CoroutineContext coroutineContext) {
        return new FlowAsPublisher(flow, Dispatchers.getUnconfined().plus(coroutineContext));
    }
}
