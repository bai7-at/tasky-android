package kotlinx.coroutines;

import defpackage.by0;
import defpackage.hc1;
import defpackage.ww8;
import kotlin.coroutines.CoroutineContext;

@InternalCoroutinesApi
/* loaded from: classes5.dex */
public interface Delay {

    public static final class DefaultImpls {
        public static Object delay(Delay delay, long j, by0<? super ww8> by0Var) {
            if (j <= 0) {
                return ww8.a;
            }
            CancellableContinuationImpl cancellableContinuationImpl = new CancellableContinuationImpl(kotlin.coroutines.intrinsics.a.d(by0Var), 1);
            cancellableContinuationImpl.initCancellability();
            delay.mo938scheduleResumeAfterDelay(j, cancellableContinuationImpl);
            Object result = cancellableContinuationImpl.getResult();
            if (result == kotlin.coroutines.intrinsics.a.h()) {
                hc1.c(by0Var);
            }
            return result == kotlin.coroutines.intrinsics.a.h() ? result : ww8.a;
        }

        public static DisposableHandle invokeOnTimeout(Delay delay, long j, Runnable runnable, CoroutineContext coroutineContext) {
            return DefaultExecutorKt.getDefaultDelay().invokeOnTimeout(j, runnable, coroutineContext);
        }
    }

    Object delay(long j, by0<? super ww8> by0Var);

    DisposableHandle invokeOnTimeout(long j, Runnable runnable, CoroutineContext coroutineContext);

    /* renamed from: scheduleResumeAfterDelay */
    void mo938scheduleResumeAfterDelay(long j, CancellableContinuation<? super ww8> cancellableContinuation);
}
