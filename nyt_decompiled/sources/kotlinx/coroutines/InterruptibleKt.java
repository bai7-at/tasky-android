package kotlinx.coroutines;

import defpackage.by0;
import defpackage.qs2;
import java.util.concurrent.CancellationException;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.EmptyCoroutineContext;

/* loaded from: classes5.dex */
public final class InterruptibleKt {
    private static final int FINISHED = 1;
    private static final int INTERRUPTED = 3;
    private static final int INTERRUPTING = 2;
    private static final int WORKING = 0;

    public static final <T> Object runInterruptible(CoroutineContext coroutineContext, qs2 qs2Var, by0<? super T> by0Var) {
        return BuildersKt.withContext(coroutineContext, new InterruptibleKt$runInterruptible$2(qs2Var, null), by0Var);
    }

    public static /* synthetic */ Object runInterruptible$default(CoroutineContext coroutineContext, qs2 qs2Var, by0 by0Var, int i, Object obj) {
        if ((i & 1) != 0) {
            coroutineContext = EmptyCoroutineContext.a;
        }
        return runInterruptible(coroutineContext, qs2Var, by0Var);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final <T> T runInterruptibleInExpectedContext(CoroutineContext coroutineContext, qs2 qs2Var) {
        try {
            ThreadState threadState = new ThreadState(JobKt.getJob(coroutineContext));
            threadState.setup();
            try {
                return (T) qs2Var.mo865invoke();
            } finally {
                threadState.clearInterrupt();
            }
        } catch (InterruptedException e) {
            throw new CancellationException("Blocking call was interrupted due to parent cancellation").initCause(e);
        }
    }
}
