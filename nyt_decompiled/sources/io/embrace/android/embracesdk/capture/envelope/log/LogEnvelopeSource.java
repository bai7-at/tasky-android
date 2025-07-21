package io.embrace.android.embracesdk.capture.envelope.log;

import io.embrace.android.embracesdk.internal.payload.Envelope;
import io.embrace.android.embracesdk.internal.payload.LogPayload;
import java.util.List;

/* loaded from: classes5.dex */
public interface LogEnvelopeSource {
    Envelope<LogPayload> getBatchedLogEnvelope();

    List<Envelope<LogPayload>> getNonbatchedEnvelope();
}
