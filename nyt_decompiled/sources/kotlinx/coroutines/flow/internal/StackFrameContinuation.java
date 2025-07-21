package kotlinx.coroutines.flow.internal;

import defpackage.by0;
import defpackage.p01;
import kotlin.coroutines.CoroutineContext;

/* loaded from: classes5.dex */
final class StackFrameContinuation<T> implements by0<T>, p01 {
    private final CoroutineContext context;
    private final by0<T> uCont;

    /* JADX WARN: Multi-variable type inference failed */
    public StackFrameContinuation(by0<? super T> by0Var, CoroutineContext coroutineContext) {
        this.uCont = by0Var;
        this.context = coroutineContext;
    }

    @Override // defpackage.p01
    public p01 getCallerFrame() {
        by0<T> by0Var = this.uCont;
        if (by0Var instanceof p01) {
            return (p01) by0Var;
        }
        return null;
    }

    @Override // defpackage.by0
    public CoroutineContext getContext() {
        return this.context;
    }

    @Override // defpackage.p01
    public StackTraceElement getStackTraceElement() {
        return null;
    }

    @Override // defpackage.by0
    public void resumeWith(Object obj) {
        this.uCont.resumeWith(obj);
    }
}
