package kotlinx.coroutines;

import java.util.concurrent.Future;

/* loaded from: classes5.dex */
final /* synthetic */ class JobKt__FutureKt {
    public static final void cancelFutureOnCancellation(CancellableContinuation<?> cancellableContinuation, Future<?> future) {
        cancellableContinuation.invokeOnCancellation(new CancelFutureOnCancel(future));
    }

    @InternalCoroutinesApi
    public static final DisposableHandle cancelFutureOnCompletion(Job job, Future<?> future) {
        return job.invokeOnCompletion(new CancelFutureOnCompletion(future));
    }
}
