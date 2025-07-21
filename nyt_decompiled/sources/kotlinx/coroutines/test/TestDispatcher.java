package kotlinx.coroutines.test;

import defpackage.by0;
import defpackage.ss2;
import defpackage.ww8;
import kotlin.coroutines.CoroutineContext;
import kotlin.time.b;
import kotlinx.coroutines.CancellableContinuation;
import kotlinx.coroutines.CancellableContinuationKt;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.Delay;
import kotlinx.coroutines.DelayWithTimeoutDiagnostics;
import kotlinx.coroutines.DisposableHandle;

/* loaded from: classes5.dex */
public abstract class TestDispatcher extends CoroutineDispatcher implements Delay, DelayWithTimeoutDiagnostics {
    @Override // kotlinx.coroutines.Delay
    public Object delay(long j, by0<? super ww8> by0Var) {
        return Delay.DefaultImpls.delay(this, j, by0Var);
    }

    public abstract TestCoroutineScheduler getScheduler();

    @Override // kotlinx.coroutines.Delay
    public DisposableHandle invokeOnTimeout(long j, Runnable runnable, CoroutineContext coroutineContext) {
        return getScheduler().registerEvent$kotlinx_coroutines_test(this, j, runnable, coroutineContext, new ss2() { // from class: kotlinx.coroutines.test.TestDispatcher$invokeOnTimeout$1
            @Override // defpackage.ss2
            public final Boolean invoke(Runnable runnable2) {
                return Boolean.FALSE;
            }
        });
    }

    public final void processEvent$kotlinx_coroutines_test(Object obj) {
        if (!(obj instanceof Runnable)) {
            throw new IllegalStateException("Check failed.");
        }
        ((Runnable) obj).run();
    }

    @Override // kotlinx.coroutines.Delay
    /* renamed from: scheduleResumeAfterDelay */
    public void mo938scheduleResumeAfterDelay(long j, CancellableContinuation<? super ww8> cancellableContinuation) {
        CancellableContinuationKt.disposeOnCancellation(cancellableContinuation, getScheduler().registerEvent$kotlinx_coroutines_test(this, j, new CancellableContinuationRunnable(cancellableContinuation, this), cancellableContinuation.getContext(), TestDispatcher$scheduleResumeAfterDelay$handle$1.INSTANCE));
    }

    @Override // kotlinx.coroutines.DelayWithTimeoutDiagnostics
    /* renamed from: timeoutMessage-LRDsOJo */
    public /* synthetic */ String mo874timeoutMessageLRDsOJo(long j) {
        return "Timed out after " + ((Object) b.L(j)) + " of _virtual_ (kotlinx.coroutines.test) time. To use the real time, wrap 'withTimeout' in 'withContext(Dispatchers.Default.limitedParallelism(1))'";
    }
}
