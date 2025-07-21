package com.datadog.android.core.internal.utils;

import com.datadog.android.api.InternalLogger;
import defpackage.qs2;
import defpackage.zq3;
import java.util.Arrays;
import java.util.Locale;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Future;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import kotlin.collections.i;

/* loaded from: classes2.dex */
public abstract class ConcurrencyExtKt {
    public static final void a(Executor executor, final String str, InternalLogger internalLogger, Runnable runnable) {
        zq3.h(executor, "<this>");
        zq3.h(str, "operationName");
        zq3.h(internalLogger, "internalLogger");
        zq3.h(runnable, "runnable");
        try {
            executor.execute(runnable);
        } catch (RejectedExecutionException e) {
            InternalLogger.b.b(internalLogger, InternalLogger.Level.ERROR, i.o(InternalLogger.Target.MAINTAINER, InternalLogger.Target.TELEMETRY), new qs2() { // from class: com.datadog.android.core.internal.utils.ConcurrencyExtKt$executeSafe$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(0);
                }

                @Override // defpackage.qs2
                /* renamed from: invoke */
                public final String mo865invoke() {
                    String format = String.format(Locale.US, "Unable to schedule %s task on the executor", Arrays.copyOf(new Object[]{str}, 1));
                    zq3.g(format, "format(...)");
                    return format;
                }
            }, e, false, null, 48, null);
        }
    }

    public static final ScheduledFuture b(ScheduledExecutorService scheduledExecutorService, final String str, long j, TimeUnit timeUnit, InternalLogger internalLogger, Runnable runnable) {
        zq3.h(scheduledExecutorService, "<this>");
        zq3.h(str, "operationName");
        zq3.h(timeUnit, "unit");
        zq3.h(internalLogger, "internalLogger");
        zq3.h(runnable, "runnable");
        try {
            return scheduledExecutorService.schedule(runnable, j, timeUnit);
        } catch (RejectedExecutionException e) {
            InternalLogger.b.b(internalLogger, InternalLogger.Level.ERROR, i.o(InternalLogger.Target.MAINTAINER, InternalLogger.Target.TELEMETRY), new qs2() { // from class: com.datadog.android.core.internal.utils.ConcurrencyExtKt$scheduleSafe$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(0);
                }

                @Override // defpackage.qs2
                /* renamed from: invoke */
                public final String mo865invoke() {
                    String format = String.format(Locale.US, "Unable to schedule %s task on the executor", Arrays.copyOf(new Object[]{str}, 1));
                    zq3.g(format, "format(...)");
                    return format;
                }
            }, e, false, null, 48, null);
            return null;
        }
    }

    public static final Future c(ExecutorService executorService, final String str, InternalLogger internalLogger, Runnable runnable) {
        zq3.h(executorService, "<this>");
        zq3.h(str, "operationName");
        zq3.h(internalLogger, "internalLogger");
        zq3.h(runnable, "runnable");
        try {
            return executorService.submit(runnable);
        } catch (RejectedExecutionException e) {
            InternalLogger.b.b(internalLogger, InternalLogger.Level.ERROR, i.o(InternalLogger.Target.MAINTAINER, InternalLogger.Target.TELEMETRY), new qs2() { // from class: com.datadog.android.core.internal.utils.ConcurrencyExtKt$submitSafe$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(0);
                }

                @Override // defpackage.qs2
                /* renamed from: invoke */
                public final String mo865invoke() {
                    String format = String.format(Locale.US, "Unable to schedule %s task on the executor", Arrays.copyOf(new Object[]{str}, 1));
                    zq3.g(format, "format(...)");
                    return format;
                }
            }, e, false, null, 48, null);
            return null;
        }
    }
}
