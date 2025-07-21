package io.embrace.android.embracesdk.network.logging;

import defpackage.zq3;
import io.embrace.android.embracesdk.Severity;
import io.embrace.android.embracesdk.arch.datasource.DataSourceImpl;
import io.embrace.android.embracesdk.arch.destination.LogEventData;
import io.embrace.android.embracesdk.arch.destination.LogEventMapper;
import io.embrace.android.embracesdk.arch.destination.LogWriter;
import io.embrace.android.embracesdk.arch.limits.NoopLimitStrategy;
import io.embrace.android.embracesdk.arch.schema.SchemaType;
import io.embrace.android.embracesdk.logging.InternalEmbraceLogger;
import io.embrace.android.embracesdk.payload.NetworkCapturedCall;

/* loaded from: classes5.dex */
public final class NetworkCaptureDataSourceImpl extends DataSourceImpl<LogWriter> implements NetworkCaptureDataSource, LogEventMapper<NetworkCapturedCall> {
    private final LogWriter logWriter;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NetworkCaptureDataSourceImpl(LogWriter logWriter, InternalEmbraceLogger internalEmbraceLogger) {
        super(logWriter, internalEmbraceLogger, NoopLimitStrategy.INSTANCE);
        zq3.h(logWriter, "logWriter");
        zq3.h(internalEmbraceLogger, "logger");
        this.logWriter = logWriter;
    }

    @Override // io.embrace.android.embracesdk.network.logging.NetworkCaptureDataSource
    public void logNetworkCapturedCall(NetworkCapturedCall networkCapturedCall) {
        zq3.h(networkCapturedCall, "networkCapturedCall");
        this.logWriter.addLog(networkCapturedCall, new NetworkCaptureDataSourceImpl$logNetworkCapturedCall$1(this));
    }

    @Override // io.embrace.android.embracesdk.arch.destination.LogEventMapper
    public LogEventData toLogEventData(NetworkCapturedCall networkCapturedCall) {
        zq3.h(networkCapturedCall, "obj");
        return new LogEventData(new SchemaType.NetworkCapturedRequest(networkCapturedCall), Severity.INFO, networkCapturedCall.getNetworkId());
    }
}
