package kotlinx.coroutines;

import kotlinx.coroutines.scheduling.Task;
import kotlinx.coroutines.scheduling.TaskContext;

/* loaded from: classes5.dex */
public final class SchedulerTaskKt {
    public static final void afterTask(TaskContext taskContext) {
        taskContext.afterTask();
    }

    public static final TaskContext getTaskContext(Task task) {
        return task.taskContext;
    }

    public static /* synthetic */ void getTaskContext$annotations(Task task) {
    }
}
