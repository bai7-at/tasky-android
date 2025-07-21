package io.embrace.android.embracesdk.anr.detection;

import defpackage.zq3;
import io.embrace.android.embracesdk.anr.BlockedThreadListener;
import io.embrace.android.embracesdk.logging.InternalEmbraceLogger;

/* loaded from: classes5.dex */
public final class UnbalancedCallDetector implements BlockedThreadListener {
    private volatile boolean blocked;
    private volatile long lastTimestamp;
    private final InternalEmbraceLogger logger;

    public UnbalancedCallDetector(InternalEmbraceLogger internalEmbraceLogger) {
        zq3.h(internalEmbraceLogger, "logger");
        this.logger = internalEmbraceLogger;
    }

    private final void checkTimeTravel(String str, long j) {
        if (this.lastTimestamp > j) {
            String str2 = "Time travel in " + str + ". " + this.lastTimestamp + " to " + j;
            this.logger.log(str2, InternalEmbraceLogger.Severity.ERROR, new IllegalStateException(str2), true);
        }
        this.lastTimestamp = j;
    }

    private final void checkUnbalancedCall(String str, boolean z) {
        if (this.blocked != z) {
            Thread currentThread = Thread.currentThread();
            zq3.g(currentThread, "Thread.currentThread()");
            String str2 = "Unbalanced call to " + str + " in ANR detection. Thread=" + currentThread.getName();
            this.logger.log(str2, InternalEmbraceLogger.Severity.ERROR, new IllegalStateException(str2), true);
        }
    }

    @Override // io.embrace.android.embracesdk.anr.BlockedThreadListener
    public void onThreadBlocked(Thread thread, long j) {
        zq3.h(thread, "thread");
        checkUnbalancedCall("onThreadBlocked()", false);
        this.blocked = true;
        checkTimeTravel("onThreadBlocked()", j);
    }

    @Override // io.embrace.android.embracesdk.anr.BlockedThreadListener
    public void onThreadBlockedInterval(Thread thread, long j) {
        zq3.h(thread, "thread");
        checkUnbalancedCall("onThreadBlockedInterval()", true);
        checkTimeTravel("onThreadBlockedInterval()", j);
    }

    @Override // io.embrace.android.embracesdk.anr.BlockedThreadListener
    public void onThreadUnblocked(Thread thread, long j) {
        zq3.h(thread, "thread");
        checkUnbalancedCall("onThreadUnblocked()", true);
        this.blocked = false;
        checkTimeTravel("onThreadUnblocked()", j);
    }
}
