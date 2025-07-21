package io.embrace.android.embracesdk.capture.envelope.log;

import defpackage.zq3;
import io.embrace.android.embracesdk.capture.envelope.metadata.EnvelopeMetadataSource;
import io.embrace.android.embracesdk.capture.envelope.resource.EnvelopeResourceSource;
import io.embrace.android.embracesdk.internal.payload.Envelope;
import io.embrace.android.embracesdk.internal.payload.LogPayload;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.i;

/* loaded from: classes5.dex */
public final class LogEnvelopeSourceImpl implements LogEnvelopeSource {
    private final LogPayloadSource logPayloadSource;
    private final EnvelopeMetadataSource metadataSource;
    private final EnvelopeResourceSource resourceSource;

    public LogEnvelopeSourceImpl(EnvelopeMetadataSource envelopeMetadataSource, EnvelopeResourceSource envelopeResourceSource, LogPayloadSource logPayloadSource) {
        zq3.h(envelopeMetadataSource, "metadataSource");
        zq3.h(envelopeResourceSource, "resourceSource");
        zq3.h(logPayloadSource, "logPayloadSource");
        this.metadataSource = envelopeMetadataSource;
        this.resourceSource = envelopeResourceSource;
        this.logPayloadSource = logPayloadSource;
    }

    private final Envelope<LogPayload> getLogEnvelope(LogPayload logPayload) {
        return new Envelope<>(this.resourceSource.getEnvelopeResource(), this.metadataSource.getEnvelopeMetadata(), "0.1.0", "logs", logPayload);
    }

    @Override // io.embrace.android.embracesdk.capture.envelope.log.LogEnvelopeSource
    public Envelope<LogPayload> getBatchedLogEnvelope() {
        return getLogEnvelope(this.logPayloadSource.getBatchedLogPayload());
    }

    @Override // io.embrace.android.embracesdk.capture.envelope.log.LogEnvelopeSource
    public List<Envelope<LogPayload>> getNonbatchedEnvelope() {
        List<LogPayload> nonbatchedLogPayloads = this.logPayloadSource.getNonbatchedLogPayloads();
        if (nonbatchedLogPayloads.isEmpty()) {
            return i.l();
        }
        List<LogPayload> list = nonbatchedLogPayloads;
        ArrayList arrayList = new ArrayList(i.w(list, 10));
        Iterator<T> it2 = list.iterator();
        while (it2.hasNext()) {
            arrayList.add(getLogEnvelope((LogPayload) it2.next()));
        }
        return arrayList;
    }
}
