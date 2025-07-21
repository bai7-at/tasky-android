package kotlinx.coroutines;

import defpackage.by0;
import defpackage.zq3;
import kotlin.coroutines.CoroutineContext;
import kotlinx.coroutines.selects.SelectClause1;

/* loaded from: classes5.dex */
class DeferredCoroutine<T> extends AbstractCoroutine<T> implements Deferred<T> {
    public DeferredCoroutine(CoroutineContext coroutineContext, boolean z) {
        super(coroutineContext, true, z);
    }

    static /* synthetic */ <T> Object await$suspendImpl(DeferredCoroutine<T> deferredCoroutine, by0<? super T> by0Var) {
        Object awaitInternal = deferredCoroutine.awaitInternal(by0Var);
        kotlin.coroutines.intrinsics.a.h();
        return awaitInternal;
    }

    @Override // kotlinx.coroutines.Deferred
    public Object await(by0<? super T> by0Var) {
        return await$suspendImpl(this, by0Var);
    }

    @Override // kotlinx.coroutines.Deferred
    public T getCompleted() {
        return (T) getCompletedInternal$kotlinx_coroutines_core();
    }

    @Override // kotlinx.coroutines.Deferred
    public SelectClause1<T> getOnAwait() {
        SelectClause1<T> selectClause1 = (SelectClause1<T>) getOnAwaitInternal();
        zq3.f(selectClause1, "null cannot be cast to non-null type kotlinx.coroutines.selects.SelectClause1<T of kotlinx.coroutines.DeferredCoroutine>");
        return selectClause1;
    }
}
