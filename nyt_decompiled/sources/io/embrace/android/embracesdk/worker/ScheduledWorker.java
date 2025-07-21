package io.embrace.android.embracesdk.worker;

import defpackage.zq3;
import java.util.concurrent.Callable;
import java.util.concurrent.Future;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/* loaded from: classes5.dex */
public final class ScheduledWorker {
    private final ScheduledExecutorService impl;

    public ScheduledWorker(ScheduledExecutorService scheduledExecutorService) {
        zq3.h(scheduledExecutorService, "impl");
        this.impl = scheduledExecutorService;
    }

    public final <T> ScheduledFuture<T> schedule(Runnable runnable, long j, TimeUnit timeUnit) {
        ScheduledFuture<T> scheduledFuture = (ScheduledFuture<T>) this.impl.schedule(runnable, j, timeUnit);
        if (scheduledFuture != null) {
            return scheduledFuture;
        }
        throw new NullPointerException("null cannot be cast to non-null type java.util.concurrent.ScheduledFuture<T>");
    }

    public final ScheduledFuture<?> scheduleAtFixedRate(Runnable runnable, long j, long j2, TimeUnit timeUnit) {
        zq3.h(runnable, "runnable");
        zq3.h(timeUnit, "unit");
        ScheduledFuture<?> scheduleAtFixedRate = this.impl.scheduleAtFixedRate(runnable, j, j2, timeUnit);
        zq3.g(scheduleAtFixedRate, "impl.scheduleAtFixedRate…lDelay, intervalMs, unit)");
        return scheduleAtFixedRate;
    }

    public final ScheduledFuture<?> scheduleWithFixedDelay(Runnable runnable, long j, long j2, TimeUnit timeUnit) {
        return this.impl.scheduleWithFixedDelay(runnable, j, j2, timeUnit);
    }

    public final Future<?> submit(Runnable runnable) {
        zq3.h(runnable, "runnable");
        Future<?> submit = this.impl.submit(runnable);
        zq3.g(submit, "impl.submit(runnable)");
        return submit;
    }

    public final <T> Future<T> submit(Callable<T> callable) {
        zq3.h(callable, "callable");
        Future<T> submit = this.impl.submit(callable);
        zq3.g(submit, "impl.submit(callable)");
        return submit;
    }
}
