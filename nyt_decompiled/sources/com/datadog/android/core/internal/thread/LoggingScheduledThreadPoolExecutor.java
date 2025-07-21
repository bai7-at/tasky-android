package com.datadog.android.core.internal.thread;

import com.datadog.android.api.InternalLogger;
import com.datadog.android.core.internal.thread.LoggingScheduledThreadPoolExecutor;
import defpackage.du8;
import defpackage.j30;
import defpackage.lb1;
import defpackage.qs2;
import defpackage.zq3;
import java.util.concurrent.RejectedExecutionHandler;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.ThreadPoolExecutor;
import kotlin.collections.i;
import kotlin.collections.t;

/* loaded from: classes2.dex */
public final class LoggingScheduledThreadPoolExecutor extends ScheduledThreadPoolExecutor {
    private final InternalLogger a;
    private final j30 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LoggingScheduledThreadPoolExecutor(int i, final String str, final InternalLogger internalLogger, final j30 j30Var) {
        super(i, new lb1(str), new RejectedExecutionHandler() { // from class: ea4
            @Override // java.util.concurrent.RejectedExecutionHandler
            public final void rejectedExecution(Runnable runnable, ThreadPoolExecutor threadPoolExecutor) {
                LoggingScheduledThreadPoolExecutor.c(InternalLogger.this, str, j30Var, runnable, threadPoolExecutor);
            }
        });
        zq3.h(str, "executorContext");
        zq3.h(internalLogger, "logger");
        zq3.h(j30Var, "backPressureStrategy");
        this.a = internalLogger;
        this.b = j30Var;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void c(InternalLogger internalLogger, String str, j30 j30Var, final Runnable runnable, ThreadPoolExecutor threadPoolExecutor) {
        zq3.h(internalLogger, "$logger");
        zq3.h(str, "$executorContext");
        zq3.h(j30Var, "$backPressureStrategy");
        if (runnable != null) {
            internalLogger.c(InternalLogger.Level.ERROR, i.o(InternalLogger.Target.MAINTAINER, InternalLogger.Target.TELEMETRY), new qs2() { // from class: com.datadog.android.core.internal.thread.LoggingScheduledThreadPoolExecutor$1$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(0);
                }

                @Override // defpackage.qs2
                /* renamed from: invoke */
                public final String mo865invoke() {
                    return "Dropped scheduled item in LoggingScheduledThreadPoolExecutor queue: " + runnable;
                }
            }, null, false, t.f(du8.a("executor.context", str)));
            j30Var.c().invoke(runnable);
        }
    }

    @Override // java.util.concurrent.ThreadPoolExecutor
    protected void afterExecute(Runnable runnable, Throwable th) {
        super.afterExecute(runnable, th);
        ThreadExtKt.a(runnable, th, this.a);
    }
}
