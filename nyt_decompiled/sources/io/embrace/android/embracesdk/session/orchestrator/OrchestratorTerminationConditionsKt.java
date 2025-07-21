package io.embrace.android.embracesdk.session.orchestrator;

import com.amazonaws.mobileconnectors.s3.transferutility.TransferTable;
import defpackage.zq3;
import io.embrace.android.embracesdk.config.ConfigService;
import io.embrace.android.embracesdk.internal.clock.Clock;
import io.embrace.android.embracesdk.logging.InternalEmbraceLogger;
import io.embrace.android.embracesdk.payload.Session;
import io.embrace.android.embracesdk.session.lifecycle.ProcessState;

/* loaded from: classes5.dex */
public final class OrchestratorTerminationConditionsKt {
    private static final long MIN_SESSION_MS = 5000;

    public static final boolean shouldEndManualSession(ConfigService configService, Clock clock, Session session, ProcessState processState, InternalEmbraceLogger internalEmbraceLogger) {
        zq3.h(configService, "configService");
        zq3.h(clock, "clock");
        zq3.h(processState, TransferTable.COLUMN_STATE);
        zq3.h(internalEmbraceLogger, "logger");
        if (processState == ProcessState.BACKGROUND) {
            internalEmbraceLogger.log("Cannot manually end session while in background.", InternalEmbraceLogger.Severity.WARNING, null, false);
            return true;
        }
        if (configService.getSessionBehavior().isSessionControlEnabled()) {
            internalEmbraceLogger.log("Cannot manually end session while session control is enabled.", InternalEmbraceLogger.Severity.WARNING, null, false);
            return true;
        }
        if (session == null) {
            return true;
        }
        if (clock.now() - session.getStartTime() >= 5000) {
            return false;
        }
        internalEmbraceLogger.log("Cannot manually end session while session is <5s long.This protects against instrumentation unintentionally creating toomany sessions", InternalEmbraceLogger.Severity.WARNING, null, false);
        return true;
    }

    public static final boolean shouldRunOnBackground(ProcessState processState, InternalEmbraceLogger internalEmbraceLogger) {
        zq3.h(processState, TransferTable.COLUMN_STATE);
        zq3.h(internalEmbraceLogger, "logger");
        if (processState != ProcessState.BACKGROUND) {
            return false;
        }
        internalEmbraceLogger.log("Detected unbalanced call to onBackground. Ignoring..", InternalEmbraceLogger.Severity.WARNING, null, false);
        return true;
    }

    public static final boolean shouldRunOnForeground(ProcessState processState, InternalEmbraceLogger internalEmbraceLogger) {
        zq3.h(processState, TransferTable.COLUMN_STATE);
        zq3.h(internalEmbraceLogger, "logger");
        if (processState != ProcessState.FOREGROUND) {
            return false;
        }
        internalEmbraceLogger.log("Detected unbalanced call to onForeground. Ignoring..", InternalEmbraceLogger.Severity.WARNING, null, false);
        return true;
    }
}
