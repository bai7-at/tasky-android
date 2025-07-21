package io.embrace.android.embracesdk.worker;

import defpackage.zq3;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Future;

/* loaded from: classes5.dex */
public final class BackgroundWorker {
    private final ExecutorService impl;

    public BackgroundWorker(ExecutorService executorService) {
        zq3.h(executorService, "impl");
        this.impl = executorService;
    }

    public static /* synthetic */ Future submit$default(BackgroundWorker backgroundWorker, TaskPriority taskPriority, Runnable runnable, int i, Object obj) {
        if ((i & 1) != 0) {
            taskPriority = TaskPriority.NORMAL;
        }
        return backgroundWorker.submit(taskPriority, runnable);
    }

    public final Future<?> submit(TaskPriority taskPriority, Runnable runnable) {
        zq3.h(taskPriority, "priority");
        zq3.h(runnable, "runnable");
        Future<?> submit = this.impl.submit(new PriorityRunnable(taskPriority, runnable));
        zq3.g(submit, "impl.submit(PriorityRunnable(priority, runnable))");
        return submit;
    }

    public static /* synthetic */ Future submit$default(BackgroundWorker backgroundWorker, TaskPriority taskPriority, Callable callable, int i, Object obj) {
        if ((i & 1) != 0) {
            taskPriority = TaskPriority.NORMAL;
        }
        return backgroundWorker.submit(taskPriority, callable);
    }

    public final <T> Future<T> submit(TaskPriority taskPriority, Callable<T> callable) {
        zq3.h(taskPriority, "priority");
        zq3.h(callable, "callable");
        Future<T> submit = this.impl.submit(new PriorityCallable(taskPriority, callable));
        zq3.g(submit, "impl.submit(PriorityCallable(priority, callable))");
        return submit;
    }
}
