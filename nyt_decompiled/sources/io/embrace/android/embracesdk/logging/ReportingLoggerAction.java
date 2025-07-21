package io.embrace.android.embracesdk.logging;

import android.util.Log;
import defpackage.zq3;
import io.embrace.android.embracesdk.logging.InternalEmbraceLogger;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes5.dex */
public final class ReportingLoggerAction implements InternalEmbraceLogger.LoggerAction {
    private final InternalErrorService internalErrorService;
    private final boolean logStrictMode;

    public static final class InternalError extends Exception {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public InternalError(String str) {
            super(str);
            zq3.h(str, "msg");
        }
    }

    public static final class LogStrictModeException extends Exception {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public LogStrictModeException(String str) {
            super(str);
            zq3.h(str, "msg");
        }
    }

    public static final class NotAnException extends Exception {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public NotAnException(String str) {
            super(str);
            zq3.h(str, "msg");
        }
    }

    public ReportingLoggerAction(InternalErrorService internalErrorService, boolean z) {
        zq3.h(internalErrorService, "internalErrorService");
        this.internalErrorService = internalErrorService;
        this.logStrictMode = z;
    }

    @Override // io.embrace.android.embracesdk.logging.InternalEmbraceLogger.LoggerAction
    public void log(String str, InternalEmbraceLogger.Severity severity, Throwable th, boolean z) {
        zq3.h(str, "msg");
        zq3.h(severity, "severity");
        if (this.logStrictMode && severity == InternalEmbraceLogger.Severity.ERROR && th == null) {
            th = new LogStrictModeException(str);
        }
        if (th != null) {
            try {
                this.internalErrorService.handleInternalError(th);
            } catch (Throwable th2) {
                Log.w(AndroidLoggingActionKt.EMBRACE_TAG, str, th2);
            }
        }
    }

    public /* synthetic */ ReportingLoggerAction(InternalErrorService internalErrorService, boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(internalErrorService, (i & 2) != 0 ? false : z);
    }
}
