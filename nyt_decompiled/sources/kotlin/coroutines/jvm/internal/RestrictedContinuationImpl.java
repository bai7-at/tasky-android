package kotlin.coroutines.jvm.internal;

import defpackage.by0;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.EmptyCoroutineContext;

/* loaded from: classes5.dex */
public abstract class RestrictedContinuationImpl extends BaseContinuationImpl {
    public RestrictedContinuationImpl(by0 by0Var) {
        super(by0Var);
        if (by0Var != null && by0Var.getContext() != EmptyCoroutineContext.a) {
            throw new IllegalArgumentException("Coroutines with restricted suspension must have EmptyCoroutineContext");
        }
    }

    @Override // defpackage.by0
    public CoroutineContext getContext() {
        return EmptyCoroutineContext.a;
    }
}
