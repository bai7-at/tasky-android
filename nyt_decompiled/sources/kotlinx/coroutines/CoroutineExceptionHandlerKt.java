package kotlinx.coroutines;

import defpackage.g62;
import defpackage.gt2;
import kotlin.coroutines.CoroutineContext;
import kotlinx.coroutines.internal.CoroutineExceptionHandlerImpl_commonKt;

/* loaded from: classes5.dex */
public final class CoroutineExceptionHandlerKt {
    public static final CoroutineExceptionHandler CoroutineExceptionHandler(gt2 gt2Var) {
        return new CoroutineExceptionHandlerKt$CoroutineExceptionHandler$1(gt2Var, CoroutineExceptionHandler.Key);
    }

    @InternalCoroutinesApi
    public static final void handleCoroutineException(CoroutineContext coroutineContext, Throwable th) {
        try {
            CoroutineExceptionHandler coroutineExceptionHandler = (CoroutineExceptionHandler) coroutineContext.get(CoroutineExceptionHandler.Key);
            if (coroutineExceptionHandler != null) {
                coroutineExceptionHandler.handleException(coroutineContext, th);
            } else {
                CoroutineExceptionHandlerImpl_commonKt.handleUncaughtCoroutineException(coroutineContext, th);
            }
        } catch (Throwable th2) {
            CoroutineExceptionHandlerImpl_commonKt.handleUncaughtCoroutineException(coroutineContext, handlerException(th, th2));
        }
    }

    public static final Throwable handlerException(Throwable th, Throwable th2) {
        if (th == th2) {
            return th;
        }
        RuntimeException runtimeException = new RuntimeException("Exception while trying to handle coroutine exception", th2);
        g62.a(runtimeException, th);
        return runtimeException;
    }
}
