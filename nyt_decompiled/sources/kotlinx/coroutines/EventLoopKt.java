package kotlinx.coroutines;

import defpackage.qs2;
import kotlinx.coroutines.scheduling.CoroutineScheduler;

/* loaded from: classes5.dex */
public final class EventLoopKt {
    public static final EventLoop createEventLoop() {
        return new BlockingEventLoop(Thread.currentThread());
    }

    @InternalCoroutinesApi
    @DelicateCoroutinesApi
    public static final boolean isIoDispatcherThread(Thread thread) {
        if (thread instanceof CoroutineScheduler.Worker) {
            return ((CoroutineScheduler.Worker) thread).isIo();
        }
        return false;
    }

    public static final void platformAutoreleasePool(qs2 qs2Var) {
        qs2Var.mo865invoke();
    }

    @InternalCoroutinesApi
    public static final long processNextEventInCurrentThread() {
        EventLoop currentOrNull$kotlinx_coroutines_core = ThreadLocalEventLoop.INSTANCE.currentOrNull$kotlinx_coroutines_core();
        if (currentOrNull$kotlinx_coroutines_core != null) {
            return currentOrNull$kotlinx_coroutines_core.processNextEvent();
        }
        return Long.MAX_VALUE;
    }

    @InternalCoroutinesApi
    @DelicateCoroutinesApi
    public static final long runSingleTaskFromCurrentSystemDispatcher() {
        Thread currentThread = Thread.currentThread();
        if (currentThread instanceof CoroutineScheduler.Worker) {
            return ((CoroutineScheduler.Worker) currentThread).runSingleTask();
        }
        throw new IllegalStateException("Expected CoroutineScheduler.Worker, but got " + currentThread);
    }
}
