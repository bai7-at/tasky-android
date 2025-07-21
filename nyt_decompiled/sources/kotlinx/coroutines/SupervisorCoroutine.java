package kotlinx.coroutines;

import defpackage.by0;
import kotlin.coroutines.CoroutineContext;
import kotlinx.coroutines.internal.ScopeCoroutine;

/* loaded from: classes5.dex */
final class SupervisorCoroutine<T> extends ScopeCoroutine<T> {
    public SupervisorCoroutine(CoroutineContext coroutineContext, by0<? super T> by0Var) {
        super(coroutineContext, by0Var);
    }

    @Override // kotlinx.coroutines.JobSupport
    public boolean childCancelled(Throwable th) {
        return false;
    }
}
