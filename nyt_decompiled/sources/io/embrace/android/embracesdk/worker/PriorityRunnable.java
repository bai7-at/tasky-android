package io.embrace.android.embracesdk.worker;

import defpackage.zq3;

/* loaded from: classes5.dex */
public final class PriorityRunnable implements Runnable {
    private final /* synthetic */ Runnable $$delegate_0;
    private final TaskPriority priority;

    public PriorityRunnable(TaskPriority taskPriority, Runnable runnable) {
        zq3.h(taskPriority, "priority");
        zq3.h(runnable, "impl");
        this.$$delegate_0 = runnable;
        this.priority = taskPriority;
    }

    public final TaskPriority getPriority() {
        return this.priority;
    }

    @Override // java.lang.Runnable
    public void run() {
        this.$$delegate_0.run();
    }
}
