package kotlinx.coroutines.test;

/* loaded from: classes5.dex */
public final class TestDispatcherKt {
    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean cancellableRunnableIsCancelled(CancellableContinuationRunnable cancellableContinuationRunnable) {
        return !cancellableContinuationRunnable.continuation.isActive();
    }
}
