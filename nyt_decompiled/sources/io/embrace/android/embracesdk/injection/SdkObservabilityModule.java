package io.embrace.android.embracesdk.injection;

import io.embrace.android.embracesdk.logging.InternalErrorService;
import io.embrace.android.embracesdk.logging.ReportingLoggerAction;

/* loaded from: classes5.dex */
public interface SdkObservabilityModule {
    InternalErrorService getInternalErrorService();

    ReportingLoggerAction getReportingLoggerAction();
}
