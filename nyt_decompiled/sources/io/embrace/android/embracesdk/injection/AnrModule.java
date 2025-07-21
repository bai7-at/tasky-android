package io.embrace.android.embracesdk.injection;

import io.embrace.android.embracesdk.anr.AnrOtelMapper;
import io.embrace.android.embracesdk.anr.AnrService;
import io.embrace.android.embracesdk.anr.sigquit.GoogleAnrTimestampRepository;
import io.embrace.android.embracesdk.capture.monitor.ResponsivenessMonitorService;

/* loaded from: classes5.dex */
public interface AnrModule {
    AnrOtelMapper getAnrOtelMapper();

    AnrService getAnrService();

    GoogleAnrTimestampRepository getGoogleAnrTimestampRepository();

    ResponsivenessMonitorService getResponsivenessMonitorService();
}
