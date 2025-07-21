package io.embrace.android.embracesdk.worker;

import defpackage.zq3;
import java.util.concurrent.Callable;

/* loaded from: classes5.dex */
public final class PriorityCallable<T> implements Callable<T> {
    private final /* synthetic */ Callable<T> $$delegate_0;
    private final TaskPriority priority;

    public PriorityCallable(TaskPriority taskPriority, Callable<T> callable) {
        zq3.h(taskPriority, "priority");
        zq3.h(callable, "impl");
        this.$$delegate_0 = callable;
        this.priority = taskPriority;
    }

    @Override // java.util.concurrent.Callable
    public T call() {
        return this.$$delegate_0.call();
    }

    public final TaskPriority getPriority() {
        return this.priority;
    }
}
