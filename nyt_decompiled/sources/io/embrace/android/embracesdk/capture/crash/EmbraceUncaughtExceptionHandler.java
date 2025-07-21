package io.embrace.android.embracesdk.capture.crash;

import defpackage.zq3;
import io.embrace.android.embracesdk.logging.InternalEmbraceLogger;
import java.lang.Thread;

/* loaded from: classes5.dex */
public final class EmbraceUncaughtExceptionHandler implements Thread.UncaughtExceptionHandler {
    private final CrashService crashService;
    private final Thread.UncaughtExceptionHandler defaultHandler;
    private final InternalEmbraceLogger logger;

    public EmbraceUncaughtExceptionHandler(Thread.UncaughtExceptionHandler uncaughtExceptionHandler, CrashService crashService, InternalEmbraceLogger internalEmbraceLogger) {
        zq3.h(crashService, "crashService");
        zq3.h(internalEmbraceLogger, "logger");
        this.defaultHandler = uncaughtExceptionHandler;
        this.crashService = crashService;
        this.logger = internalEmbraceLogger;
        internalEmbraceLogger.log("Registered EmbraceUncaughtExceptionHandler", InternalEmbraceLogger.Severity.DEBUG, null, true);
    }

    @Override // java.lang.Thread.UncaughtExceptionHandler
    public void uncaughtException(Thread thread, Throwable th) {
        zq3.h(thread, "thread");
        zq3.h(th, "exception");
        try {
            try {
                this.crashService.handleCrash(th);
            } catch (Exception e) {
                InternalEmbraceLogger internalEmbraceLogger = this.logger;
                InternalEmbraceLogger.Severity severity = InternalEmbraceLogger.Severity.DEBUG;
                internalEmbraceLogger.log("Error occurred in the uncaught exception handler", severity, e, true);
                this.logger.log("Finished handling exception. Delegating to default handler.", severity, th, true);
                Thread.UncaughtExceptionHandler uncaughtExceptionHandler = this.defaultHandler;
                if (uncaughtExceptionHandler == null) {
                }
            }
        } finally {
            this.logger.log("Finished handling exception. Delegating to default handler.", InternalEmbraceLogger.Severity.DEBUG, th, true);
            Thread.UncaughtExceptionHandler uncaughtExceptionHandler2 = this.defaultHandler;
            if (uncaughtExceptionHandler2 != null) {
                uncaughtExceptionHandler2.uncaughtException(thread, th);
            }
        }
    }
}
