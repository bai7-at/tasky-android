package io.embrace.android.embracesdk.worker;

import defpackage.zq3;
import java.util.concurrent.RunnableFuture;
import java.util.concurrent.TimeUnit;

/* loaded from: classes5.dex */
public final class PriorityRunnableFuture<T> implements RunnableFuture<T> {
    private final RunnableFuture<T> impl;
    private final TaskPriority priority;
    private final long submitTime;

    public PriorityRunnableFuture(RunnableFuture<T> runnableFuture, TaskPriority taskPriority, long j) {
        zq3.h(runnableFuture, "impl");
        zq3.h(taskPriority, "priority");
        this.impl = runnableFuture;
        this.priority = taskPriority;
        this.submitTime = j;
    }

    @Override // java.util.concurrent.Future
    public boolean cancel(boolean z) {
        return this.impl.cancel(z);
    }

    @Override // java.util.concurrent.Future
    public T get() {
        return this.impl.get();
    }

    public final RunnableFuture<T> getImpl() {
        return this.impl;
    }

    public final TaskPriority getPriority() {
        return this.priority;
    }

    public final long getSubmitTime() {
        return this.submitTime;
    }

    @Override // java.util.concurrent.Future
    public boolean isCancelled() {
        return this.impl.isCancelled();
    }

    @Override // java.util.concurrent.Future
    public boolean isDone() {
        return this.impl.isDone();
    }

    @Override // java.util.concurrent.RunnableFuture, java.lang.Runnable
    public void run() {
        this.impl.run();
    }

    @Override // java.util.concurrent.Future
    public T get(long j, TimeUnit timeUnit) {
        return this.impl.get(j, timeUnit);
    }
}
