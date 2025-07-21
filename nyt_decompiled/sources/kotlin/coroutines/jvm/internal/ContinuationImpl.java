package kotlin.coroutines.jvm.internal;

import defpackage.by0;
import defpackage.hq0;
import defpackage.zq3;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.c;

/* loaded from: classes5.dex */
public abstract class ContinuationImpl extends BaseContinuationImpl {
    private final CoroutineContext _context;
    private transient by0<Object> intercepted;

    public ContinuationImpl(by0 by0Var, CoroutineContext coroutineContext) {
        super(by0Var);
        this._context = coroutineContext;
    }

    @Override // defpackage.by0
    public CoroutineContext getContext() {
        CoroutineContext coroutineContext = this._context;
        zq3.e(coroutineContext);
        return coroutineContext;
    }

    public final by0<Object> intercepted() {
        by0 by0Var = this.intercepted;
        if (by0Var == null) {
            c cVar = (c) getContext().get(c.P);
            if (cVar == null || (by0Var = cVar.interceptContinuation(this)) == null) {
                by0Var = this;
            }
            this.intercepted = by0Var;
        }
        return by0Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    protected void releaseIntercepted() {
        by0<Object> by0Var = this.intercepted;
        if (by0Var != null && by0Var != this) {
            CoroutineContext.a aVar = getContext().get(c.P);
            zq3.e(aVar);
            ((c) aVar).releaseInterceptedContinuation(by0Var);
        }
        this.intercepted = hq0.a;
    }

    public ContinuationImpl(by0 by0Var) {
        this(by0Var, by0Var != null ? by0Var.getContext() : null);
    }
}
