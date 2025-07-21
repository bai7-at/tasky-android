package io.embrace.android.embracesdk.injection;

import io.embrace.android.embracesdk.event.LogMessageService;
import io.embrace.android.embracesdk.internal.logs.LogOrchestrator;
import io.embrace.android.embracesdk.network.logging.NetworkCaptureDataSource;
import io.embrace.android.embracesdk.network.logging.NetworkCaptureService;
import io.embrace.android.embracesdk.network.logging.NetworkLoggingService;

/* loaded from: classes5.dex */
public interface CustomerLogModule {
    LogMessageService getLogMessageService();

    LogOrchestrator getLogOrchestrator();

    NetworkCaptureDataSource getNetworkCaptureDataSource();

    NetworkCaptureService getNetworkCaptureService();

    NetworkLoggingService getNetworkLoggingService();
}
