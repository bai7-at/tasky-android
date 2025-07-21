package io.embrace.android.embracesdk.injection;

import io.embrace.android.embracesdk.capture.PerformanceInfoService;
import io.embrace.android.embracesdk.event.EventService;

/* loaded from: classes5.dex */
public interface DataContainerModule {
    EventService getEventService();

    PerformanceInfoService getPerformanceInfoService();
}
