package kotlinx.coroutines.test;

import defpackage.ss2;
import kotlin.jvm.internal.FunctionReferenceImpl;

/* loaded from: classes5.dex */
/* synthetic */ class TestDispatcher$scheduleResumeAfterDelay$handle$1 extends FunctionReferenceImpl implements ss2 {
    public static final TestDispatcher$scheduleResumeAfterDelay$handle$1 INSTANCE = new TestDispatcher$scheduleResumeAfterDelay$handle$1();

    TestDispatcher$scheduleResumeAfterDelay$handle$1() {
        super(1, TestDispatcherKt.class, "cancellableRunnableIsCancelled", "cancellableRunnableIsCancelled(Lkotlinx/coroutines/test/CancellableContinuationRunnable;)Z", 1);
    }

    @Override // defpackage.ss2
    public final Boolean invoke(CancellableContinuationRunnable cancellableContinuationRunnable) {
        boolean cancellableRunnableIsCancelled;
        cancellableRunnableIsCancelled = TestDispatcherKt.cancellableRunnableIsCancelled(cancellableContinuationRunnable);
        return Boolean.valueOf(cancellableRunnableIsCancelled);
    }
}
