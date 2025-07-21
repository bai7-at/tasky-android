package io.embrace.android.embracesdk.opentelemetry;

import com.amazonaws.mobileconnectors.s3.transferutility.TransferTable;
import io.embrace.android.embracesdk.arch.schema.EmbraceAttributeKey;

/* loaded from: classes5.dex */
public final class EmbraceAttributeKeysKt {
    private static final EmbraceAttributeKey embAndroidThreads = new EmbraceAttributeKey("android.threads", null, false, false, 14, null);
    private static final EmbraceAttributeKey embCrashNumber = new EmbraceAttributeKey("android.crash_number", null, false, false, 14, null);
    private static final EmbraceAttributeKey embExceptionHandling = new EmbraceAttributeKey("exception_handling", null, false, false, 14, null);
    private static final EmbraceAttributeKey embProcessIdentifier = new EmbraceAttributeKey("process_identifier", null, false, false, 14, null);
    private static final EmbraceAttributeKey embSequenceId = new EmbraceAttributeKey("sequence_id", null, false, true, 6, null);
    private static final EmbraceAttributeKey embSessionId = new EmbraceAttributeKey("session_id", null, false, false, 14, null);
    private static final EmbraceAttributeKey embState = new EmbraceAttributeKey(TransferTable.COLUMN_STATE, null, false, false, 14, null);
    private static final EmbraceAttributeKey embColdStart = new EmbraceAttributeKey("cold_start", null, false, false, 14, null);
    private static final EmbraceAttributeKey embSessionNumber = new EmbraceAttributeKey("session_number", null, false, false, 14, null);
    private static final EmbraceAttributeKey embCleanExit = new EmbraceAttributeKey("clean_exit", null, false, false, 14, null);
    private static final EmbraceAttributeKey embTerminated = new EmbraceAttributeKey("terminated", null, false, false, 14, null);
    private static final EmbraceAttributeKey embHeartbeatTimeUnixNano = new EmbraceAttributeKey("heartbeat_time_unix_nano", null, false, false, 14, null);
    private static final EmbraceAttributeKey embCrashId = new EmbraceAttributeKey("crash_id", null, false, false, 14, null);
    private static final EmbraceAttributeKey embSessionStartType = new EmbraceAttributeKey("session_start_type", null, false, false, 14, null);
    private static final EmbraceAttributeKey embSessionEndType = new EmbraceAttributeKey("session_end_type", null, false, false, 14, null);

    public static final EmbraceAttributeKey getEmbAndroidThreads() {
        return embAndroidThreads;
    }

    public static final EmbraceAttributeKey getEmbCleanExit() {
        return embCleanExit;
    }

    public static final EmbraceAttributeKey getEmbColdStart() {
        return embColdStart;
    }

    public static final EmbraceAttributeKey getEmbCrashId() {
        return embCrashId;
    }

    public static final EmbraceAttributeKey getEmbCrashNumber() {
        return embCrashNumber;
    }

    public static final EmbraceAttributeKey getEmbExceptionHandling() {
        return embExceptionHandling;
    }

    public static final EmbraceAttributeKey getEmbHeartbeatTimeUnixNano() {
        return embHeartbeatTimeUnixNano;
    }

    public static final EmbraceAttributeKey getEmbProcessIdentifier() {
        return embProcessIdentifier;
    }

    public static final EmbraceAttributeKey getEmbSequenceId() {
        return embSequenceId;
    }

    public static final EmbraceAttributeKey getEmbSessionEndType() {
        return embSessionEndType;
    }

    public static final EmbraceAttributeKey getEmbSessionId() {
        return embSessionId;
    }

    public static final EmbraceAttributeKey getEmbSessionNumber() {
        return embSessionNumber;
    }

    public static final EmbraceAttributeKey getEmbSessionStartType() {
        return embSessionStartType;
    }

    public static final EmbraceAttributeKey getEmbState() {
        return embState;
    }

    public static final EmbraceAttributeKey getEmbTerminated() {
        return embTerminated;
    }
}
