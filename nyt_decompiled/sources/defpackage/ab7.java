package defpackage;

import io.reactivex.Scheduler;
import io.reactivex.schedulers.Schedulers;
import java.util.concurrent.Executor;

/* loaded from: classes.dex */
public final class ab7 extends Scheduler implements Executor {
    private final Executor a;
    private final Scheduler b;

    public ab7(Executor executor) {
        zq3.h(executor, "executor");
        this.a = executor;
        Scheduler from = Schedulers.from(executor);
        zq3.g(from, "from(executor)");
        this.b = from;
    }

    @Override // io.reactivex.Scheduler
    public Scheduler.Worker createWorker() {
        Scheduler.Worker createWorker = this.b.createWorker();
        zq3.g(createWorker, "scheduler.createWorker()");
        return createWorker;
    }

    @Override // java.util.concurrent.Executor
    public void execute(Runnable runnable) {
        zq3.h(runnable, "command");
        this.a.execute(runnable);
    }
}
