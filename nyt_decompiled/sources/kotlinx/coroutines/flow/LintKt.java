package kotlinx.coroutines.flow;

import defpackage.bk3;
import defpackage.by0;
import defpackage.gt2;
import defpackage.it2;
import defpackage.kt2;
import defpackage.zq3;
import java.util.List;
import java.util.Set;
import java.util.concurrent.CancellationException;
import kotlin.KotlinNothingValueException;
import kotlin.coroutines.CoroutineContext;

/* loaded from: classes5.dex */
public final class LintKt {
    public static final void cancel(FlowCollector<?> flowCollector, CancellationException cancellationException) {
        FlowKt.noImpl();
        throw new KotlinNothingValueException();
    }

    public static /* synthetic */ void cancel$default(FlowCollector flowCollector, CancellationException cancellationException, int i, Object obj) {
        if ((i & 1) != 0) {
            cancellationException = null;
        }
        cancel(flowCollector, cancellationException);
    }

    public static final <T> Flow<T> cancellable(SharedFlow<? extends T> sharedFlow) {
        FlowKt.noImpl();
        throw new KotlinNothingValueException();
    }

    /* renamed from: catch, reason: not valid java name */
    private static final <T> Flow<T> m923catch(SharedFlow<? extends T> sharedFlow, it2 it2Var) {
        zq3.f(sharedFlow, "null cannot be cast to non-null type kotlinx.coroutines.flow.Flow<T of kotlinx.coroutines.flow.LintKt.catch>");
        return FlowKt.m911catch(sharedFlow, it2Var);
    }

    public static final <T> Flow<T> conflate(StateFlow<? extends T> stateFlow) {
        FlowKt.noImpl();
        throw new KotlinNothingValueException();
    }

    private static final <T> Object count(SharedFlow<? extends T> sharedFlow, by0<? super Integer> by0Var) {
        zq3.f(sharedFlow, "null cannot be cast to non-null type kotlinx.coroutines.flow.Flow<T of kotlinx.coroutines.flow.LintKt.count>");
        bk3.c(0);
        Object count = FlowKt.count(sharedFlow, by0Var);
        bk3.c(1);
        return count;
    }

    public static final <T> Flow<T> distinctUntilChanged(StateFlow<? extends T> stateFlow) {
        FlowKt.noImpl();
        throw new KotlinNothingValueException();
    }

    public static final <T> Flow<T> flowOn(SharedFlow<? extends T> sharedFlow, CoroutineContext coroutineContext) {
        FlowKt.noImpl();
        throw new KotlinNothingValueException();
    }

    public static final CoroutineContext getCoroutineContext(FlowCollector<?> flowCollector) {
        FlowKt.noImpl();
        throw new KotlinNothingValueException();
    }

    public static /* synthetic */ void getCoroutineContext$annotations(FlowCollector flowCollector) {
    }

    public static final boolean isActive(FlowCollector<?> flowCollector) {
        FlowKt.noImpl();
        throw new KotlinNothingValueException();
    }

    public static /* synthetic */ void isActive$annotations(FlowCollector flowCollector) {
    }

    private static final <T> Flow<T> retry(SharedFlow<? extends T> sharedFlow, long j, gt2 gt2Var) {
        zq3.f(sharedFlow, "null cannot be cast to non-null type kotlinx.coroutines.flow.Flow<T of kotlinx.coroutines.flow.LintKt.retry>");
        return FlowKt.retry(sharedFlow, j, gt2Var);
    }

    static /* synthetic */ Flow retry$default(SharedFlow sharedFlow, long j, gt2 gt2Var, int i, Object obj) {
        if ((i & 1) != 0) {
            j = Long.MAX_VALUE;
        }
        if ((i & 2) != 0) {
            gt2Var = new LintKt$retry$1(null);
        }
        zq3.f(sharedFlow, "null cannot be cast to non-null type kotlinx.coroutines.flow.Flow<T of kotlinx.coroutines.flow.LintKt.retry>");
        return FlowKt.retry(sharedFlow, j, gt2Var);
    }

    private static final <T> Flow<T> retryWhen(SharedFlow<? extends T> sharedFlow, kt2 kt2Var) {
        zq3.f(sharedFlow, "null cannot be cast to non-null type kotlinx.coroutines.flow.Flow<T of kotlinx.coroutines.flow.LintKt.retryWhen>");
        return FlowKt.retryWhen(sharedFlow, kt2Var);
    }

    private static final <T> Object toList(SharedFlow<? extends T> sharedFlow, by0<? super List<? extends T>> by0Var) {
        Object list$default;
        zq3.f(sharedFlow, "null cannot be cast to non-null type kotlinx.coroutines.flow.Flow<T of kotlinx.coroutines.flow.LintKt.toList>");
        bk3.c(0);
        list$default = FlowKt__CollectionKt.toList$default(sharedFlow, null, by0Var, 1, null);
        bk3.c(1);
        return list$default;
    }

    private static final <T> Object toSet(SharedFlow<? extends T> sharedFlow, by0<? super Set<? extends T>> by0Var) {
        Object set$default;
        zq3.f(sharedFlow, "null cannot be cast to non-null type kotlinx.coroutines.flow.Flow<T of kotlinx.coroutines.flow.LintKt.toSet>");
        bk3.c(0);
        set$default = FlowKt__CollectionKt.toSet$default(sharedFlow, null, by0Var, 1, null);
        bk3.c(1);
        return set$default;
    }

    private static final <T> Object toList(SharedFlow<? extends T> sharedFlow, List<T> list, by0<?> by0Var) {
        zq3.f(sharedFlow, "null cannot be cast to non-null type kotlinx.coroutines.flow.Flow<T of kotlinx.coroutines.flow.LintKt.toList>");
        bk3.c(0);
        FlowKt.toList(sharedFlow, list, by0Var);
        bk3.c(1);
        throw new IllegalStateException("this code is supposed to be unreachable");
    }

    private static final <T> Object toSet(SharedFlow<? extends T> sharedFlow, Set<T> set, by0<?> by0Var) {
        zq3.f(sharedFlow, "null cannot be cast to non-null type kotlinx.coroutines.flow.Flow<T of kotlinx.coroutines.flow.LintKt.toSet>");
        bk3.c(0);
        FlowKt.toSet(sharedFlow, set, by0Var);
        bk3.c(1);
        throw new IllegalStateException("this code is supposed to be unreachable");
    }
}
