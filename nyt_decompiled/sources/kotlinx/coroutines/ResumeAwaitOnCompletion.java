package kotlinx.coroutines;

import defpackage.ww8;
import kotlin.Result;
import kotlin.f;

/* loaded from: classes5.dex */
final class ResumeAwaitOnCompletion<T> extends JobNode {
    private final CancellableContinuationImpl<T> continuation;

    /* JADX WARN: Multi-variable type inference failed */
    public ResumeAwaitOnCompletion(CancellableContinuationImpl<? super T> cancellableContinuationImpl) {
        this.continuation = cancellableContinuationImpl;
    }

    @Override // kotlinx.coroutines.JobNode, kotlinx.coroutines.CompletionHandlerBase, defpackage.ss2
    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((Throwable) obj);
        return ww8.a;
    }

    @Override // kotlinx.coroutines.CompletionHandlerBase
    public void invoke(Throwable th) {
        Object state$kotlinx_coroutines_core = getJob().getState$kotlinx_coroutines_core();
        if (state$kotlinx_coroutines_core instanceof CompletedExceptionally) {
            CancellableContinuationImpl<T> cancellableContinuationImpl = this.continuation;
            Result.a aVar = Result.a;
            cancellableContinuationImpl.resumeWith(Result.b(f.a(((CompletedExceptionally) state$kotlinx_coroutines_core).cause)));
        } else {
            CancellableContinuationImpl<T> cancellableContinuationImpl2 = this.continuation;
            Result.a aVar2 = Result.a;
            cancellableContinuationImpl2.resumeWith(Result.b(JobSupportKt.unboxState(state$kotlinx_coroutines_core)));
        }
    }
}
