package io.embrace.android.embracesdk.network.logging;

import io.embrace.android.embracesdk.arch.datasource.DataSource;
import io.embrace.android.embracesdk.arch.destination.LogWriter;
import io.embrace.android.embracesdk.payload.NetworkCapturedCall;

/* loaded from: classes5.dex */
public interface NetworkCaptureDataSource extends DataSource<LogWriter> {
    void logNetworkCapturedCall(NetworkCapturedCall networkCapturedCall);
}
