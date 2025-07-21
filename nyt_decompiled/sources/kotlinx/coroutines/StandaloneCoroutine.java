package kotlinx.coroutines;

import defpackage.ww8;
import kotlin.coroutines.CoroutineContext;

/* loaded from: classes5.dex */
class StandaloneCoroutine extends AbstractCoroutine<ww8> {
    public StandaloneCoroutine(CoroutineContext coroutineContext, boolean z) {
        super(coroutineContext, true, z);
    }

    @Override // kotlinx.coroutines.JobSupport
    protected boolean handleJobException(Throwable th) {
        CoroutineExceptionHandlerKt.handleCoroutineException(getContext(), th);
        return true;
    }
}
