package kotlinx.coroutines.rx2;

import defpackage.by0;
import defpackage.ww8;
import io.reactivex.Scheduler;
import io.reactivex.disposables.Disposable;
import java.util.concurrent.TimeUnit;
import kotlin.coroutines.CoroutineContext;
import kotlinx.coroutines.CancellableContinuation;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.Delay;
import kotlinx.coroutines.DisposableHandle;
import kotlinx.coroutines.rx2.SchedulerCoroutineDispatcher;

/* loaded from: classes5.dex */
public final class SchedulerCoroutineDispatcher extends CoroutineDispatcher implements Delay {
    private final Scheduler scheduler;

    public SchedulerCoroutineDispatcher(Scheduler scheduler) {
        this.scheduler = scheduler;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void scheduleResumeAfterDelay$lambda$1(CancellableContinuation cancellableContinuation, SchedulerCoroutineDispatcher schedulerCoroutineDispatcher) {
        cancellableContinuation.resumeUndispatched(schedulerCoroutineDispatcher, ww8.a);
    }

    @Override // kotlinx.coroutines.Delay
    public Object delay(long j, by0<? super ww8> by0Var) {
        return Delay.DefaultImpls.delay(this, j, by0Var);
    }

    @Override // kotlinx.coroutines.CoroutineDispatcher
    /* renamed from: dispatch */
    public void mo937dispatch(CoroutineContext coroutineContext, Runnable runnable) {
        this.scheduler.scheduleDirect(runnable);
    }

    public boolean equals(Object obj) {
        return (obj instanceof SchedulerCoroutineDispatcher) && ((SchedulerCoroutineDispatcher) obj).scheduler == this.scheduler;
    }

    public final Scheduler getScheduler() {
        return this.scheduler;
    }

    public int hashCode() {
        return System.identityHashCode(this.scheduler);
    }

    @Override // kotlinx.coroutines.Delay
    public DisposableHandle invokeOnTimeout(long j, Runnable runnable, CoroutineContext coroutineContext) {
        final Disposable scheduleDirect = this.scheduler.scheduleDirect(runnable, j, TimeUnit.MILLISECONDS);
        return new DisposableHandle() { // from class: hb7
            @Override // kotlinx.coroutines.DisposableHandle
            public final void dispose() {
                Disposable.this.dispose();
            }
        };
    }

    @Override // kotlinx.coroutines.Delay
    /* renamed from: scheduleResumeAfterDelay */
    public void mo938scheduleResumeAfterDelay(long j, final CancellableContinuation<? super ww8> cancellableContinuation) {
        RxAwaitKt.disposeOnCancellation(cancellableContinuation, this.scheduler.scheduleDirect(new Runnable() { // from class: ib7
            @Override // java.lang.Runnable
            public final void run() {
                SchedulerCoroutineDispatcher.scheduleResumeAfterDelay$lambda$1(CancellableContinuation.this, this);
            }
        }, j, TimeUnit.MILLISECONDS));
    }

    @Override // kotlinx.coroutines.CoroutineDispatcher
    public String toString() {
        return this.scheduler.toString();
    }
}
