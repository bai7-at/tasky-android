package io.embrace.android.embracesdk.anr.sigquit;

import defpackage.zq3;
import io.embrace.android.embracesdk.logging.InternalEmbraceLogger;
import kotlin.text.h;

/* loaded from: classes5.dex */
public final class FindGoogleThread {
    private final GetThreadCommand getThreadCommand;
    private final GetThreadsInCurrentProcess getThreadsInCurrentProcess;
    private final InternalEmbraceLogger logger;

    public FindGoogleThread(InternalEmbraceLogger internalEmbraceLogger, GetThreadsInCurrentProcess getThreadsInCurrentProcess, GetThreadCommand getThreadCommand) {
        zq3.h(internalEmbraceLogger, "logger");
        zq3.h(getThreadsInCurrentProcess, "getThreadsInCurrentProcess");
        zq3.h(getThreadCommand, "getThreadCommand");
        this.logger = internalEmbraceLogger;
        this.getThreadsInCurrentProcess = getThreadsInCurrentProcess;
        this.getThreadCommand = getThreadCommand;
    }

    public final int invoke() {
        this.logger.log("Searching for Google thread ID for ANR detection", InternalEmbraceLogger.Severity.INFO, null, true);
        for (String str : this.getThreadsInCurrentProcess.invoke()) {
            if (h.K(this.getThreadCommand.invoke(str), "Signal Catcher", false, 2, null)) {
                Integer l = h.l(str);
                if (l != null) {
                    return l.intValue();
                }
                return 0;
            }
        }
        return 0;
    }
}
