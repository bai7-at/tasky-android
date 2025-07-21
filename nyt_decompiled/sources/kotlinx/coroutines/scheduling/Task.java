package kotlinx.coroutines.scheduling;

/* loaded from: classes5.dex */
public abstract class Task implements Runnable {
    public long submissionTime;
    public TaskContext taskContext;

    public Task(long j, TaskContext taskContext) {
        this.submissionTime = j;
        this.taskContext = taskContext;
    }

    public final int getMode$kotlinx_coroutines_core() {
        return this.taskContext.getTaskMode();
    }

    public Task() {
        this(0L, TasksKt.NonBlockingContext);
    }
}
