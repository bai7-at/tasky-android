package defpackage;

import com.datadog.android.api.InternalLogger;
import com.datadog.android.core.internal.thread.ThreadExtKt;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* loaded from: classes2.dex */
public abstract class el8 {
    public static final boolean a(ThreadPoolExecutor threadPoolExecutor) {
        zq3.h(threadPoolExecutor, "<this>");
        return threadPoolExecutor.getTaskCount() - threadPoolExecutor.getCompletedTaskCount() <= 0;
    }

    public static final boolean b(ThreadPoolExecutor threadPoolExecutor, long j, InternalLogger internalLogger) {
        zq3.h(threadPoolExecutor, "<this>");
        zq3.h(internalLogger, "internalLogger");
        long nanoTime = System.nanoTime();
        long nanos = TimeUnit.MILLISECONDS.toNanos(j);
        long o = uo6.o(j, 0L, 10L);
        while (!a(threadPoolExecutor)) {
            boolean b = ThreadExtKt.b(o, internalLogger);
            if (System.nanoTime() - nanoTime >= nanos || b) {
                return a(threadPoolExecutor);
            }
        }
        return true;
    }
}
