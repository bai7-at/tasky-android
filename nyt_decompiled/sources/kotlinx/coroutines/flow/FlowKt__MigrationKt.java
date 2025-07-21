package kotlinx.coroutines.flow;

import defpackage.gt2;
import defpackage.it2;
import defpackage.kt2;
import defpackage.mt2;
import defpackage.nt2;
import defpackage.ss2;
import kotlin.KotlinNothingValueException;
import kotlin.coroutines.CoroutineContext;

/* loaded from: classes5.dex */
final /* synthetic */ class FlowKt__MigrationKt {
    public static final <T> Flow<T> cache(Flow<? extends T> flow) {
        FlowKt.noImpl();
        throw new KotlinNothingValueException();
    }

    public static final <T1, T2, R> Flow<R> combineLatest(Flow<? extends T1> flow, Flow<? extends T2> flow2, it2 it2Var) {
        return FlowKt.combine(flow, flow2, it2Var);
    }

    public static final <T, R> Flow<R> compose(Flow<? extends T> flow, ss2 ss2Var) {
        FlowKt.noImpl();
        throw new KotlinNothingValueException();
    }

    public static final <T, R> Flow<R> concatMap(Flow<? extends T> flow, ss2 ss2Var) {
        FlowKt.noImpl();
        throw new KotlinNothingValueException();
    }

    public static final <T> Flow<T> concatWith(Flow<? extends T> flow, T t) {
        FlowKt.noImpl();
        throw new KotlinNothingValueException();
    }

    public static final <T> Flow<T> delayEach(Flow<? extends T> flow, long j) {
        return FlowKt.onEach(flow, new FlowKt__MigrationKt$delayEach$1(j, null));
    }

    public static final <T> Flow<T> delayFlow(Flow<? extends T> flow, long j) {
        return FlowKt.onStart(flow, new FlowKt__MigrationKt$delayFlow$1(j, null));
    }

    public static final <T, R> Flow<R> flatMap(Flow<? extends T> flow, gt2 gt2Var) {
        FlowKt.noImpl();
        throw new KotlinNothingValueException();
    }

    public static final <T> Flow<T> flatten(Flow<? extends Flow<? extends T>> flow) {
        FlowKt.noImpl();
        throw new KotlinNothingValueException();
    }

    public static final <T> void forEach(Flow<? extends T> flow, gt2 gt2Var) {
        FlowKt.noImpl();
        throw new KotlinNothingValueException();
    }

    public static final <T> Flow<T> merge(Flow<? extends Flow<? extends T>> flow) {
        FlowKt.noImpl();
        throw new KotlinNothingValueException();
    }

    public static final Void noImpl() {
        throw new UnsupportedOperationException("Not implemented, should not be called");
    }

    public static final <T> Flow<T> observeOn(Flow<? extends T> flow, CoroutineContext coroutineContext) {
        FlowKt.noImpl();
        throw new KotlinNothingValueException();
    }

    public static final <T> Flow<T> onErrorResume(Flow<? extends T> flow, Flow<? extends T> flow2) {
        FlowKt.noImpl();
        throw new KotlinNothingValueException();
    }

    public static final <T> Flow<T> onErrorResumeNext(Flow<? extends T> flow, Flow<? extends T> flow2) {
        FlowKt.noImpl();
        throw new KotlinNothingValueException();
    }

    public static final <T> Flow<T> onErrorReturn(Flow<? extends T> flow, T t) {
        FlowKt.noImpl();
        throw new KotlinNothingValueException();
    }

    public static /* synthetic */ Flow onErrorReturn$default(Flow flow, Object obj, ss2 ss2Var, int i, Object obj2) {
        if ((i & 2) != 0) {
            ss2Var = new ss2() { // from class: kotlinx.coroutines.flow.FlowKt__MigrationKt$onErrorReturn$1
                @Override // defpackage.ss2
                public final Boolean invoke(Throwable th) {
                    return Boolean.TRUE;
                }
            };
        }
        return FlowKt.onErrorReturn(flow, obj, ss2Var);
    }

    public static final <T> Flow<T> publish(Flow<? extends T> flow) {
        FlowKt.noImpl();
        throw new KotlinNothingValueException();
    }

    public static final <T> Flow<T> publishOn(Flow<? extends T> flow, CoroutineContext coroutineContext) {
        FlowKt.noImpl();
        throw new KotlinNothingValueException();
    }

    public static final <T> Flow<T> replay(Flow<? extends T> flow) {
        FlowKt.noImpl();
        throw new KotlinNothingValueException();
    }

    public static final <T, R> Flow<R> scanFold(Flow<? extends T> flow, R r, it2 it2Var) {
        FlowKt.noImpl();
        throw new KotlinNothingValueException();
    }

    public static final <T> Flow<T> scanReduce(Flow<? extends T> flow, it2 it2Var) {
        return FlowKt.runningReduce(flow, it2Var);
    }

    public static final <T> Flow<T> skip(Flow<? extends T> flow, int i) {
        FlowKt.noImpl();
        throw new KotlinNothingValueException();
    }

    public static final <T> Flow<T> startWith(Flow<? extends T> flow, T t) {
        FlowKt.noImpl();
        throw new KotlinNothingValueException();
    }

    public static final <T> void subscribe(Flow<? extends T> flow) {
        FlowKt.noImpl();
        throw new KotlinNothingValueException();
    }

    public static final <T> Flow<T> subscribeOn(Flow<? extends T> flow, CoroutineContext coroutineContext) {
        FlowKt.noImpl();
        throw new KotlinNothingValueException();
    }

    public static final <T, R> Flow<R> switchMap(Flow<? extends T> flow, gt2 gt2Var) {
        return FlowKt.transformLatest(flow, new FlowKt__MigrationKt$switchMap$$inlined$flatMapLatest$1(gt2Var, null));
    }

    public static final <T1, T2, T3, R> Flow<R> combineLatest(Flow<? extends T1> flow, Flow<? extends T2> flow2, Flow<? extends T3> flow3, kt2 kt2Var) {
        return FlowKt.combine(flow, flow2, flow3, kt2Var);
    }

    public static final <T> Flow<T> concatWith(Flow<? extends T> flow, Flow<? extends T> flow2) {
        FlowKt.noImpl();
        throw new KotlinNothingValueException();
    }

    public static final <T> Flow<T> onErrorReturn(Flow<? extends T> flow, T t, ss2 ss2Var) {
        return FlowKt.m911catch(flow, new FlowKt__MigrationKt$onErrorReturn$2(ss2Var, t, null));
    }

    public static final <T> Flow<T> publish(Flow<? extends T> flow, int i) {
        FlowKt.noImpl();
        throw new KotlinNothingValueException();
    }

    public static final <T> Flow<T> replay(Flow<? extends T> flow, int i) {
        FlowKt.noImpl();
        throw new KotlinNothingValueException();
    }

    public static final <T> Flow<T> startWith(Flow<? extends T> flow, Flow<? extends T> flow2) {
        FlowKt.noImpl();
        throw new KotlinNothingValueException();
    }

    public static final <T> void subscribe(Flow<? extends T> flow, gt2 gt2Var) {
        FlowKt.noImpl();
        throw new KotlinNothingValueException();
    }

    public static final <T1, T2, T3, T4, R> Flow<R> combineLatest(Flow<? extends T1> flow, Flow<? extends T2> flow2, Flow<? extends T3> flow3, Flow<? extends T4> flow4, mt2 mt2Var) {
        return FlowKt.combine(flow, flow2, flow3, flow4, mt2Var);
    }

    public static final <T> void subscribe(Flow<? extends T> flow, gt2 gt2Var, gt2 gt2Var2) {
        FlowKt.noImpl();
        throw new KotlinNothingValueException();
    }

    public static final <T1, T2, T3, T4, T5, R> Flow<R> combineLatest(Flow<? extends T1> flow, Flow<? extends T2> flow2, Flow<? extends T3> flow3, Flow<? extends T4> flow4, Flow<? extends T5> flow5, nt2 nt2Var) {
        return FlowKt.combine(flow, flow2, flow3, flow4, flow5, nt2Var);
    }
}
