package io.embrace.android.embracesdk.injection;

import io.embrace.android.embracesdk.capture.envelope.log.LogEnvelopeSource;
import io.embrace.android.embracesdk.capture.envelope.session.SessionEnvelopeSource;

/* loaded from: classes5.dex */
public interface PayloadModule {
    LogEnvelopeSource getLogEnvelopeSource();

    SessionEnvelopeSource getSessionEnvelopeSource();
}
