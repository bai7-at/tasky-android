package kotlinx.coroutines;

import defpackage.by0;
import defpackage.ss2;
import kotlin.coroutines.CoroutineContext;

/* loaded from: classes5.dex */
public interface CancellableContinuation<T> extends by0<T> {

    public static final class DefaultImpls {
        public static /* synthetic */ boolean cancel$default(CancellableContinuation cancellableContinuation, Throwable th, int i, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: cancel");
            }
            if ((i & 1) != 0) {
                th = null;
            }
            return cancellableContinuation.cancel(th);
        }

        public static /* synthetic */ Object tryResume$default(CancellableContinuation cancellableContinuation, Object obj, Object obj2, int i, Object obj3) {
            if (obj3 != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: tryResume");
            }
            if ((i & 2) != 0) {
                obj2 = null;
            }
            return cancellableContinuation.tryResume(obj, obj2);
        }
    }

    boolean cancel(Throwable th);

    @InternalCoroutinesApi
    void completeResume(Object obj);

    @Override // defpackage.by0
    /* synthetic */ CoroutineContext getContext();

    @InternalCoroutinesApi
    void initCancellability();

    void invokeOnCancellation(ss2 ss2Var);

    boolean isActive();

    boolean isCancelled();

    boolean isCompleted();

    @ExperimentalCoroutinesApi
    void resume(T t, ss2 ss2Var);

    @ExperimentalCoroutinesApi
    void resumeUndispatched(CoroutineDispatcher coroutineDispatcher, T t);

    @ExperimentalCoroutinesApi
    void resumeUndispatchedWithException(CoroutineDispatcher coroutineDispatcher, Throwable th);

    @Override // defpackage.by0
    /* synthetic */ void resumeWith(Object obj);

    @InternalCoroutinesApi
    Object tryResume(T t, Object obj);

    @InternalCoroutinesApi
    Object tryResume(T t, Object obj, ss2 ss2Var);

    @InternalCoroutinesApi
    Object tryResumeWithException(Throwable th);
}
