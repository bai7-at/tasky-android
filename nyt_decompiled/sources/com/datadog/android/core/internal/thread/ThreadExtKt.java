package com.datadog.android.core.internal.thread;

import com.datadog.android.api.InternalLogger;
import defpackage.qs2;
import defpackage.zq3;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import kotlin.collections.i;

/* loaded from: classes2.dex */
public abstract class ThreadExtKt {
    public static final void a(Runnable runnable, Throwable th, InternalLogger internalLogger) {
        zq3.h(internalLogger, "logger");
        if (th == null && (runnable instanceof Future) && ((Future) runnable).isDone()) {
            try {
                try {
                    ((Future) runnable).get();
                } catch (SecurityException e) {
                    InternalLogger.b.a(internalLogger, InternalLogger.Level.ERROR, InternalLogger.Target.MAINTAINER, new qs2() { // from class: com.datadog.android.core.internal.thread.ThreadExtKt$loggingAfterExecute$1
                        @Override // defpackage.qs2
                        /* renamed from: invoke */
                        public final String mo865invoke() {
                            return "Thread was unable to set its own interrupted state";
                        }
                    }, e, false, null, 48, null);
                }
            } catch (InterruptedException unused) {
                Thread.currentThread().interrupt();
            } catch (CancellationException e2) {
                th = e2;
            } catch (ExecutionException e3) {
                th = e3.getCause();
            }
        }
        Throwable th2 = th;
        if (th2 != null) {
            InternalLogger.b.b(internalLogger, InternalLogger.Level.ERROR, i.o(InternalLogger.Target.USER, InternalLogger.Target.TELEMETRY), new qs2() { // from class: com.datadog.android.core.internal.thread.ThreadExtKt$loggingAfterExecute$2
                @Override // defpackage.qs2
                /* renamed from: invoke */
                public final String mo865invoke() {
                    return "Uncaught exception during the task execution";
                }
            }, th2, false, null, 48, null);
        }
    }

    public static final boolean b(long j, InternalLogger internalLogger) {
        zq3.h(internalLogger, "internalLogger");
        try {
            try {
                Thread.sleep(j);
                return false;
            } catch (SecurityException e) {
                InternalLogger.b.a(internalLogger, InternalLogger.Level.ERROR, InternalLogger.Target.MAINTAINER, new qs2() { // from class: com.datadog.android.core.internal.thread.ThreadExtKt$sleepSafe$1
                    @Override // defpackage.qs2
                    /* renamed from: invoke */
                    public final String mo865invoke() {
                        return "Thread was unable to set its own interrupted state";
                    }
                }, e, false, null, 48, null);
                return true;
            }
        } catch (IllegalArgumentException e2) {
            InternalLogger.b.a(internalLogger, InternalLogger.Level.WARN, InternalLogger.Target.MAINTAINER, new qs2() { // from class: com.datadog.android.core.internal.thread.ThreadExtKt$sleepSafe$2
                @Override // defpackage.qs2
                /* renamed from: invoke */
                public final String mo865invoke() {
                    return "Thread tried to sleep for a negative amount of time";
                }
            }, e2, false, null, 48, null);
            return false;
        } catch (InterruptedException unused) {
            Thread.currentThread().interrupt();
            return true;
        }
    }
}
