package io.embrace.android.embracesdk.utils;

import android.os.Handler;
import android.os.Looper;
import defpackage.zq3;
import io.embrace.android.embracesdk.logging.InternalEmbraceLogger;

/* loaded from: classes5.dex */
public final class ThreadUtils {
    public static final ThreadUtils INSTANCE = new ThreadUtils();
    private static final Looper mainLooper;
    private static final Thread mainThread;

    static {
        Looper mainLooper2 = Looper.getMainLooper();
        mainLooper = mainLooper2;
        zq3.g(mainLooper2, "mainLooper");
        Thread thread = mainLooper2.getThread();
        zq3.g(thread, "mainLooper.thread");
        mainThread = thread;
    }

    private ThreadUtils() {
    }

    public final void runOnMainThread(final InternalEmbraceLogger internalEmbraceLogger, final Runnable runnable) {
        zq3.h(internalEmbraceLogger, "logger");
        zq3.h(runnable, "runnable");
        Runnable runnable2 = new Runnable() { // from class: io.embrace.android.embracesdk.utils.ThreadUtils$runOnMainThread$wrappedRunnable$1
            @Override // java.lang.Runnable
            public final void run() {
                try {
                    runnable.run();
                } catch (Exception e) {
                    internalEmbraceLogger.log("Failed to run wrapped runnable on Main thread.", InternalEmbraceLogger.Severity.ERROR, e, false);
                }
            }
        };
        if (Thread.currentThread() != mainThread) {
            new Handler(mainLooper).post(runnable2);
        } else {
            runnable2.run();
        }
    }
}
