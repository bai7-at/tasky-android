package okhttp3.internal.concurrent;

import defpackage.bk3;
import defpackage.qs2;
import defpackage.z38;
import defpackage.zq3;
import io.embrace.android.embracesdk.config.behavior.NetworkBehavior;
import java.util.Arrays;
import java.util.logging.Level;
import java.util.logging.Logger;
import okhttp3.internal.http2.Http2Connection;

/* loaded from: classes5.dex */
public final class TaskLoggerKt {
    public static final String formatDuration(long j) {
        String str;
        if (j <= -999500000) {
            str = ((j - 500000000) / Http2Connection.DEGRADED_PONG_TIMEOUT_NS) + " s ";
        } else if (j <= -999500) {
            str = ((j - 500000) / 1000000) + " ms";
        } else if (j <= 0) {
            str = ((j - 500) / NetworkBehavior.DEFAULT_NETWORK_CALL_LIMIT) + " µs";
        } else if (j < 999500) {
            str = ((j + 500) / NetworkBehavior.DEFAULT_NETWORK_CALL_LIMIT) + " µs";
        } else if (j < 999500000) {
            str = ((j + 500000) / 1000000) + " ms";
        } else {
            str = ((j + 500000000) / Http2Connection.DEGRADED_PONG_TIMEOUT_NS) + " s ";
        }
        z38 z38Var = z38.a;
        String format = String.format("%6s", Arrays.copyOf(new Object[]{str}, 1));
        zq3.g(format, "format(format, *args)");
        return format;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void log(Task task, TaskQueue taskQueue, String str) {
        Logger logger = TaskRunner.Companion.getLogger();
        StringBuilder sb = new StringBuilder();
        sb.append(taskQueue.getName$okhttp());
        sb.append(' ');
        z38 z38Var = z38.a;
        String format = String.format("%-22s", Arrays.copyOf(new Object[]{str}, 1));
        zq3.g(format, "format(format, *args)");
        sb.append(format);
        sb.append(": ");
        sb.append(task.getName());
        logger.fine(sb.toString());
    }

    public static final <T> T logElapsed(Task task, TaskQueue taskQueue, qs2 qs2Var) {
        long j;
        zq3.h(task, "task");
        zq3.h(taskQueue, "queue");
        zq3.h(qs2Var, "block");
        boolean isLoggable = TaskRunner.Companion.getLogger().isLoggable(Level.FINE);
        if (isLoggable) {
            j = taskQueue.getTaskRunner$okhttp().getBackend().nanoTime();
            log(task, taskQueue, "starting");
        } else {
            j = -1;
        }
        try {
            T t = (T) qs2Var.mo865invoke();
            bk3.b(1);
            if (isLoggable) {
                log(task, taskQueue, "finished run in " + formatDuration(taskQueue.getTaskRunner$okhttp().getBackend().nanoTime() - j));
            }
            bk3.a(1);
            return t;
        } catch (Throwable th) {
            bk3.b(1);
            if (isLoggable) {
                log(task, taskQueue, "failed a run in " + formatDuration(taskQueue.getTaskRunner$okhttp().getBackend().nanoTime() - j));
            }
            bk3.a(1);
            throw th;
        }
    }

    public static final void taskLog(Task task, TaskQueue taskQueue, qs2 qs2Var) {
        zq3.h(task, "task");
        zq3.h(taskQueue, "queue");
        zq3.h(qs2Var, "messageBlock");
        if (TaskRunner.Companion.getLogger().isLoggable(Level.FINE)) {
            log(task, taskQueue, (String) qs2Var.mo865invoke());
        }
    }
}
