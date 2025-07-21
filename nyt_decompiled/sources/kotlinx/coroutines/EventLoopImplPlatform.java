package kotlinx.coroutines;

import defpackage.ww8;
import java.util.concurrent.locks.LockSupport;
import kotlinx.coroutines.EventLoopImplBase;

/* loaded from: classes5.dex */
public abstract class EventLoopImplPlatform extends EventLoop {
    protected abstract Thread getThread();

    protected void reschedule(long j, EventLoopImplBase.DelayedTask delayedTask) {
        DefaultExecutor.INSTANCE.schedule(j, delayedTask);
    }

    protected final void unpark() {
        ww8 ww8Var;
        Thread thread = getThread();
        if (Thread.currentThread() != thread) {
            AbstractTimeSource abstractTimeSource = AbstractTimeSourceKt.timeSource;
            if (abstractTimeSource != null) {
                abstractTimeSource.unpark(thread);
                ww8Var = ww8.a;
            } else {
                ww8Var = null;
            }
            if (ww8Var == null) {
                LockSupport.unpark(thread);
            }
        }
    }
}
