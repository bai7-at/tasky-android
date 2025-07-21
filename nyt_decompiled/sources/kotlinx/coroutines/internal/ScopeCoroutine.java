package kotlinx.coroutines.internal;

import defpackage.by0;
import defpackage.p01;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.a;
import kotlinx.coroutines.AbstractCoroutine;
import kotlinx.coroutines.CompletionStateKt;

/* loaded from: classes5.dex */
public class ScopeCoroutine<T> extends AbstractCoroutine<T> implements p01 {
    public final by0<T> uCont;

    /* JADX WARN: Multi-variable type inference failed */
    public ScopeCoroutine(CoroutineContext coroutineContext, by0<? super T> by0Var) {
        super(coroutineContext, true, true);
        this.uCont = by0Var;
    }

    @Override // kotlinx.coroutines.JobSupport
    protected void afterCompletion(Object obj) {
        DispatchedContinuationKt.resumeCancellableWith$default(a.d(this.uCont), CompletionStateKt.recoverResult(obj, this.uCont), null, 2, null);
    }

    @Override // kotlinx.coroutines.AbstractCoroutine
    protected void afterResume(Object obj) {
        by0<T> by0Var = this.uCont;
        by0Var.resumeWith(CompletionStateKt.recoverResult(obj, by0Var));
    }

    @Override // defpackage.p01
    public final p01 getCallerFrame() {
        by0<T> by0Var = this.uCont;
        if (by0Var instanceof p01) {
            return (p01) by0Var;
        }
        return null;
    }

    @Override // defpackage.p01
    public final StackTraceElement getStackTraceElement() {
        return null;
    }

    @Override // kotlinx.coroutines.JobSupport
    protected final boolean isScopedCoroutine() {
        return true;
    }
}
