package kotlinx.coroutines;

import defpackage.by0;
import defpackage.ss2;
import defpackage.zq3;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.b;
import kotlin.coroutines.c;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlinx.coroutines.internal.DispatchedContinuation;
import kotlinx.coroutines.internal.LimitedDispatcher;
import kotlinx.coroutines.internal.LimitedDispatcherKt;

/* loaded from: classes5.dex */
public abstract class CoroutineDispatcher extends kotlin.coroutines.a implements c {
    public static final Key Key = new Key(null);

    public static final class Key extends b {
        public /* synthetic */ Key(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Key() {
            super(c.P, new ss2() { // from class: kotlinx.coroutines.CoroutineDispatcher.Key.1
                @Override // defpackage.ss2
                public final CoroutineDispatcher invoke(CoroutineContext.a aVar) {
                    if (aVar instanceof CoroutineDispatcher) {
                        return (CoroutineDispatcher) aVar;
                    }
                    return null;
                }
            });
        }
    }

    public CoroutineDispatcher() {
        super(c.P);
    }

    /* renamed from: dispatch */
    public abstract void mo937dispatch(CoroutineContext coroutineContext, Runnable runnable);

    @InternalCoroutinesApi
    public void dispatchYield(CoroutineContext coroutineContext, Runnable runnable) {
        mo937dispatch(coroutineContext, runnable);
    }

    @Override // kotlin.coroutines.a, kotlin.coroutines.CoroutineContext.a, kotlin.coroutines.CoroutineContext
    public <E extends CoroutineContext.a> E get(CoroutineContext.b bVar) {
        return (E) c.a.a(this, bVar);
    }

    @Override // kotlin.coroutines.c
    public final <T> by0<T> interceptContinuation(by0<? super T> by0Var) {
        return new DispatchedContinuation(this, by0Var);
    }

    public boolean isDispatchNeeded(CoroutineContext coroutineContext) {
        return true;
    }

    @ExperimentalCoroutinesApi
    public CoroutineDispatcher limitedParallelism(int i) {
        LimitedDispatcherKt.checkParallelism(i);
        return new LimitedDispatcher(this, i);
    }

    @Override // kotlin.coroutines.a, kotlin.coroutines.CoroutineContext
    public CoroutineContext minusKey(CoroutineContext.b bVar) {
        return c.a.b(this, bVar);
    }

    public final CoroutineDispatcher plus(CoroutineDispatcher coroutineDispatcher) {
        return coroutineDispatcher;
    }

    @Override // kotlin.coroutines.c
    public final void releaseInterceptedContinuation(by0<?> by0Var) {
        zq3.f(by0Var, "null cannot be cast to non-null type kotlinx.coroutines.internal.DispatchedContinuation<*>");
        ((DispatchedContinuation) by0Var).release$kotlinx_coroutines_core();
    }

    public String toString() {
        return DebugStringsKt.getClassSimpleName(this) + '@' + DebugStringsKt.getHexAddress(this);
    }
}
