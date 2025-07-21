package kotlinx.coroutines;

import defpackage.ww8;

/* loaded from: classes5.dex */
final class ResumeUndispatchedRunnable implements Runnable {
    private final CancellableContinuation<ww8> continuation;
    private final CoroutineDispatcher dispatcher;

    /* JADX WARN: Multi-variable type inference failed */
    public ResumeUndispatchedRunnable(CoroutineDispatcher coroutineDispatcher, CancellableContinuation<? super ww8> cancellableContinuation) {
        this.dispatcher = coroutineDispatcher;
        this.continuation = cancellableContinuation;
    }

    @Override // java.lang.Runnable
    public void run() {
        this.continuation.resumeUndispatched(this.dispatcher, ww8.a);
    }
}
