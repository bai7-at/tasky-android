package io.embrace.android.embracesdk.logging;

import defpackage.zq3;
import io.embrace.android.embracesdk.internal.ApkToolsConfig;
import io.embrace.android.embracesdk.logging.ReportingLoggerAction;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.collections.i;

/* loaded from: classes5.dex */
public final class InternalEmbraceLogger {
    private final CopyOnWriteArrayList<LoggerAction> loggerActions = new CopyOnWriteArrayList<>(i.e(new AndroidLoggingAction()));
    private Severity threshold = Severity.INFO;

    public interface LoggerAction {
        void log(String str, Severity severity, Throwable th, boolean z);
    }

    public enum Severity {
        DEBUG,
        INFO,
        WARNING,
        ERROR,
        NONE
    }

    public static /* synthetic */ void logDebug$default(InternalEmbraceLogger internalEmbraceLogger, String str, Throwable th, int i, Object obj) {
        if ((i & 2) != 0) {
            th = null;
        }
        zq3.h(str, "msg");
        internalEmbraceLogger.log(str, Severity.DEBUG, th, true);
    }

    public static /* synthetic */ void logError$default(InternalEmbraceLogger internalEmbraceLogger, String str, Throwable th, boolean z, int i, Object obj) {
        if ((i & 2) != 0) {
            th = null;
        }
        if ((i & 4) != 0) {
            z = false;
        }
        zq3.h(str, "msg");
        internalEmbraceLogger.log(str, Severity.ERROR, th, z);
    }

    public static /* synthetic */ void logInfoWithException$default(InternalEmbraceLogger internalEmbraceLogger, String str, Throwable th, boolean z, int i, Object obj) {
        if ((i & 2) != 0) {
            th = null;
        }
        if ((i & 4) != 0) {
            z = false;
        }
        zq3.h(str, "msg");
        Severity severity = Severity.INFO;
        if (th == null) {
            th = new ReportingLoggerAction.NotAnException(str);
        }
        internalEmbraceLogger.log(str, severity, th, z);
    }

    public static /* synthetic */ void logWarning$default(InternalEmbraceLogger internalEmbraceLogger, String str, Throwable th, boolean z, int i, Object obj) {
        if ((i & 2) != 0) {
            th = null;
        }
        if ((i & 4) != 0) {
            z = false;
        }
        zq3.h(str, "msg");
        internalEmbraceLogger.log(str, Severity.WARNING, th, z);
    }

    public static /* synthetic */ void logWarningWithException$default(InternalEmbraceLogger internalEmbraceLogger, String str, Throwable th, boolean z, int i, Object obj) {
        if ((i & 2) != 0) {
            th = null;
        }
        if ((i & 4) != 0) {
            z = false;
        }
        zq3.h(str, "msg");
        Severity severity = Severity.WARNING;
        if (th == null) {
            th = new ReportingLoggerAction.NotAnException(str);
        }
        internalEmbraceLogger.log(str, severity, th, z);
    }

    private final boolean shouldTriggerLoggerActions(Severity severity) {
        return ApkToolsConfig.IS_DEVELOPER_LOGGING_ENABLED || severity.compareTo(this.threshold) >= 0;
    }

    public final void addLoggerAction(LoggerAction loggerAction) {
        zq3.h(loggerAction, "action");
        this.loggerActions.add(loggerAction);
    }

    public final void log(String str, Severity severity, Throwable th, boolean z) {
        zq3.h(str, "msg");
        zq3.h(severity, "severity");
        if (shouldTriggerLoggerActions(severity)) {
            Iterator<T> it2 = this.loggerActions.iterator();
            while (it2.hasNext()) {
                ((LoggerAction) it2.next()).log(str, severity, th, z);
            }
        }
    }

    public final void logDebug(String str) {
        logDebug$default(this, str, null, 2, null);
    }

    public final void logError(String str) {
        logError$default(this, str, null, false, 6, null);
    }

    public final void logInfo(String str) {
        zq3.h(str, "msg");
        log(str, Severity.INFO, null, true);
    }

    public final void logInfoWithException(String str, Throwable th, boolean z) {
        zq3.h(str, "msg");
        Severity severity = Severity.INFO;
        if (th == null) {
            th = new ReportingLoggerAction.NotAnException(str);
        }
        log(str, severity, th, z);
    }

    public final void logSDKNotInitialized(String str) {
        zq3.h(str, "action");
        String str2 = "Embrace SDK is not initialized yet, cannot " + str + '.';
        log(str2, Severity.WARNING, new Throwable(str2), true);
    }

    public final void logWarning(String str) {
        logWarning$default(this, str, null, false, 6, null);
    }

    public final void logWarningWithException(String str, Throwable th, boolean z) {
        zq3.h(str, "msg");
        Severity severity = Severity.WARNING;
        if (th == null) {
            th = new ReportingLoggerAction.NotAnException(str);
        }
        log(str, severity, th, z);
    }

    public final void setThreshold(Severity severity) {
        zq3.h(severity, "severity");
        this.threshold = severity;
    }

    public final void logDebug(String str, Throwable th) {
        zq3.h(str, "msg");
        log(str, Severity.DEBUG, th, true);
    }

    public final void logError(String str, Throwable th) {
        logError$default(this, str, th, false, 4, null);
    }

    public final void logWarning(String str, Throwable th) {
        logWarning$default(this, str, th, false, 4, null);
    }

    public final void logError(String str, Throwable th, boolean z) {
        zq3.h(str, "msg");
        log(str, Severity.ERROR, th, z);
    }

    public final void logWarning(String str, Throwable th, boolean z) {
        zq3.h(str, "msg");
        log(str, Severity.WARNING, th, z);
    }
}
