package io.embrace.android.embracesdk.worker;

import defpackage.tp0;
import defpackage.zq3;
import io.embrace.android.embracesdk.internal.clock.Clock;
import java.util.Comparator;
import java.util.concurrent.Callable;
import java.util.concurrent.PriorityBlockingQueue;
import java.util.concurrent.RejectedExecutionHandler;
import java.util.concurrent.RunnableFuture;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes5.dex */
public final class PriorityThreadPoolExecutor extends ThreadPoolExecutor {
    public static final Companion Companion = new Companion(null);
    private final Clock clock;

    public static final class Companion {
        private Companion() {
        }

        public final PriorityBlockingQueue<Runnable> createPriorityQueue$embrace_android_sdk_release() {
            return new PriorityBlockingQueue<>(100, new Comparator<T>() { // from class: io.embrace.android.embracesdk.worker.PriorityThreadPoolExecutor$Companion$createPriorityQueue$$inlined$compareBy$1
                @Override // java.util.Comparator
                public final int compare(T t, T t2) {
                    Runnable runnable = (Runnable) t;
                    if (!(runnable instanceof PriorityRunnableFuture)) {
                        throw new IllegalArgumentException("Runnable must be PriorityRunnableFuture");
                    }
                    PriorityRunnableFuture priorityRunnableFuture = (PriorityRunnableFuture) runnable;
                    Long valueOf = Long.valueOf(priorityRunnableFuture.getSubmitTime() + priorityRunnableFuture.getPriority().getDelayThresholdMs());
                    Runnable runnable2 = (Runnable) t2;
                    if (!(runnable2 instanceof PriorityRunnableFuture)) {
                        throw new IllegalArgumentException("Runnable must be PriorityRunnableFuture");
                    }
                    PriorityRunnableFuture priorityRunnableFuture2 = (PriorityRunnableFuture) runnable2;
                    return tp0.d(valueOf, Long.valueOf(priorityRunnableFuture2.getSubmitTime() + priorityRunnableFuture2.getPriority().getDelayThresholdMs()));
                }
            });
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PriorityThreadPoolExecutor(Clock clock, ThreadFactory threadFactory, RejectedExecutionHandler rejectedExecutionHandler, int i, int i2) {
        super(i, i2, 60L, TimeUnit.SECONDS, Companion.createPriorityQueue$embrace_android_sdk_release(), threadFactory, rejectedExecutionHandler);
        zq3.h(clock, "clock");
        zq3.h(threadFactory, "threadFactory");
        zq3.h(rejectedExecutionHandler, "handler");
        this.clock = clock;
    }

    @Override // java.util.concurrent.AbstractExecutorService
    protected <T> RunnableFuture<T> newTaskFor(Callable<T> callable) {
        zq3.h(callable, "callable");
        if (!(callable instanceof PriorityCallable)) {
            throw new IllegalArgumentException("Callable must be PriorityCallable");
        }
        RunnableFuture<T> newTaskFor = super.newTaskFor(callable);
        zq3.g(newTaskFor, "runnableFuture");
        return new PriorityRunnableFuture(newTaskFor, ((PriorityCallable) callable).getPriority(), this.clock.now());
    }

    @Override // java.util.concurrent.AbstractExecutorService
    protected <T> RunnableFuture<T> newTaskFor(Runnable runnable, T t) {
        zq3.h(runnable, "runnable");
        if (runnable instanceof PriorityRunnable) {
            RunnableFuture<T> newTaskFor = super.newTaskFor(runnable, t);
            zq3.g(newTaskFor, "runnableFuture");
            return new PriorityRunnableFuture(newTaskFor, ((PriorityRunnable) runnable).getPriority(), this.clock.now());
        }
        throw new IllegalArgumentException("Runnable must be PriorityCallable");
    }
}
