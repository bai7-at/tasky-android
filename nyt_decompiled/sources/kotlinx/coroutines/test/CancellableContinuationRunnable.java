package kotlinx.coroutines.test;

import defpackage.ww8;
import kotlinx.coroutines.CancellableContinuation;
import kotlinx.coroutines.CoroutineDispatcher;

/* loaded from: classes5.dex */
final class CancellableContinuationRunnable implements Runnable {
    public final CancellableContinuation<ww8> continuation;
    private final CoroutineDispatcher dispatcher;

    /* JADX WARN: Multi-variable type inference failed */
    public CancellableContinuationRunnable(CancellableContinuation<? super ww8> cancellableContinuation, CoroutineDispatcher coroutineDispatcher) {
        this.continuation = cancellableContinuation;
        this.dispatcher = coroutineDispatcher;
    }

    @Override // java.lang.Runnable
    public void run() {
        this.continuation.resumeUndispatched(this.dispatcher, ww8.a);
    }
}
