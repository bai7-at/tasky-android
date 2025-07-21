package io.embrace.android.embracesdk.samples;

import defpackage.zq3;
import io.embrace.android.embracesdk.EmbraceAutomaticVerification;
import io.embrace.android.embracesdk.logging.InternalEmbraceLogger;
import java.lang.Thread;

/* loaded from: classes5.dex */
public final class AutomaticVerificationExceptionHandler implements Thread.UncaughtExceptionHandler {
    private final Thread.UncaughtExceptionHandler defaultHandler;
    private final InternalEmbraceLogger logger;

    public AutomaticVerificationExceptionHandler(Thread.UncaughtExceptionHandler uncaughtExceptionHandler, InternalEmbraceLogger internalEmbraceLogger) {
        zq3.h(internalEmbraceLogger, "logger");
        this.defaultHandler = uncaughtExceptionHandler;
        this.logger = internalEmbraceLogger;
    }

    @Override // java.lang.Thread.UncaughtExceptionHandler
    public void uncaughtException(Thread thread, Throwable th) {
        Throwable cause;
        zq3.h(thread, "thread");
        zq3.h(th, "exception");
        Throwable cause2 = th.getCause();
        if (zq3.c((cause2 == null || (cause = cause2.getCause()) == null) ? null : cause.getClass(), VerifyIntegrationException.class)) {
            EmbraceAutomaticVerification.Companion.getInstance$embrace_android_sdk_release().restartAppFromPendingIntent();
        }
        this.logger.log("Finished handling exception. Delegating to default handler.", InternalEmbraceLogger.Severity.DEBUG, th, true);
        Thread.UncaughtExceptionHandler uncaughtExceptionHandler = this.defaultHandler;
        if (uncaughtExceptionHandler != null) {
            uncaughtExceptionHandler.uncaughtException(thread, th);
        }
    }
}
