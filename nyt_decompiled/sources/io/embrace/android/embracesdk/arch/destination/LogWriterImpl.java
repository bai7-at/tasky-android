package io.embrace.android.embracesdk.arch.destination;

import defpackage.dv;
import defpackage.n94;
import defpackage.r84;
import defpackage.ss2;
import defpackage.zq3;
import io.embrace.android.embracesdk.capture.metadata.MetadataService;
import io.embrace.android.embracesdk.internal.spans.EmbraceExtensionsKt;
import io.embrace.android.embracesdk.internal.utils.Uuid;
import io.embrace.android.embracesdk.opentelemetry.EmbraceAttributeKeysKt;
import io.embrace.android.embracesdk.opentelemetry.OpenTelemetryAttributeKeysKt;
import io.embrace.android.embracesdk.session.id.SessionIdTracker;
import java.util.Map;

/* loaded from: classes5.dex */
public final class LogWriterImpl implements LogWriter {
    private final n94 logger;
    private final MetadataService metadataService;
    private final SessionIdTracker sessionIdTracker;

    public LogWriterImpl(n94 n94Var, SessionIdTracker sessionIdTracker, MetadataService metadataService) {
        zq3.h(n94Var, "logger");
        zq3.h(sessionIdTracker, "sessionIdTracker");
        zq3.h(metadataService, "metadataService");
        this.logger = n94Var;
        this.sessionIdTracker = sessionIdTracker;
        this.metadataService = metadataService;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // io.embrace.android.embracesdk.arch.destination.LogWriter
    public <T> void addLog(T t, ss2 ss2Var) {
        LogEventData logEventData;
        if (t instanceof LogEventData) {
            logEventData = (LogEventData) t;
        } else if (ss2Var == null) {
            return;
        } else {
            logEventData = (LogEventData) ss2Var.invoke(t);
        }
        r84 g = this.logger.a().h(logEventData.getMessage()).f(EmbraceExtensionsKt.toOtelSeverity(logEventData.getSeverity())).g(logEventData.getSeverity().name());
        g.d(OpenTelemetryAttributeKeysKt.getLogRecordUid(), Uuid.getEmbUuid$default(null, 1, null));
        String activeSessionId = this.sessionIdTracker.getActiveSessionId();
        if (activeSessionId != null) {
            g.d(EmbraceAttributeKeysKt.getEmbSessionId().getAttributeKey(), activeSessionId);
        }
        String appState = this.metadataService.getAppState();
        if (appState != null) {
            g.d(EmbraceAttributeKeysKt.getEmbState().getAttributeKey(), appState);
        }
        for (Map.Entry<String, String> entry : logEventData.getSchemaType().attributes().entrySet()) {
            g.d(dv.a(entry.getKey()), entry.getValue());
        }
        g.e();
    }
}
