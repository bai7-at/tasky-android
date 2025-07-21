package io.embrace.android.embracesdk.capture.envelope.log;

import io.embrace.android.embracesdk.internal.payload.LogPayload;
import java.util.List;

/* loaded from: classes5.dex */
public interface LogPayloadSource {
    LogPayload getBatchedLogPayload();

    List<LogPayload> getNonbatchedLogPayloads();
}
