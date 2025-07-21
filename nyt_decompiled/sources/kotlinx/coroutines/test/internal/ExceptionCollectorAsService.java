package kotlinx.coroutines.test.internal;

import defpackage.gt2;
import kotlin.coroutines.CoroutineContext;
import kotlinx.coroutines.CoroutineExceptionHandler;

/* loaded from: classes5.dex */
public final class ExceptionCollectorAsService implements CoroutineExceptionHandler {
    private final /* synthetic */ ExceptionCollector $$delegate_0 = ExceptionCollector.INSTANCE;

    public boolean equals(Object obj) {
        return (obj instanceof ExceptionCollectorAsService) || (obj instanceof ExceptionCollector);
    }

    @Override // kotlinx.coroutines.CoroutineExceptionHandler, kotlin.coroutines.CoroutineContext
    public <R> R fold(R r, gt2 gt2Var) {
        return (R) this.$$delegate_0.fold(r, gt2Var);
    }

    @Override // kotlinx.coroutines.CoroutineExceptionHandler, kotlin.coroutines.CoroutineContext.a, kotlin.coroutines.CoroutineContext
    public <E extends CoroutineContext.a> E get(CoroutineContext.b bVar) {
        return (E) this.$$delegate_0.get(bVar);
    }

    @Override // kotlinx.coroutines.CoroutineExceptionHandler, kotlin.coroutines.CoroutineContext.a
    public CoroutineContext.b getKey() {
        return this.$$delegate_0.getKey();
    }

    @Override // kotlinx.coroutines.CoroutineExceptionHandler
    public void handleException(CoroutineContext coroutineContext, Throwable th) {
        this.$$delegate_0.handleException(coroutineContext, th);
    }

    public int hashCode() {
        return ExceptionCollector.INSTANCE.hashCode();
    }

    @Override // kotlinx.coroutines.CoroutineExceptionHandler, kotlin.coroutines.CoroutineContext
    public CoroutineContext minusKey(CoroutineContext.b bVar) {
        return this.$$delegate_0.minusKey(bVar);
    }

    @Override // kotlinx.coroutines.CoroutineExceptionHandler, kotlin.coroutines.CoroutineContext
    public CoroutineContext plus(CoroutineContext coroutineContext) {
        return this.$$delegate_0.plus(coroutineContext);
    }
}
