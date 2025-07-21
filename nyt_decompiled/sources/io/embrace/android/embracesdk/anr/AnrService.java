package io.embrace.android.embracesdk.anr;

import io.embrace.android.embracesdk.arch.DataCaptureService;
import io.embrace.android.embracesdk.config.ConfigService;
import io.embrace.android.embracesdk.payload.AnrInterval;
import java.io.Closeable;
import java.util.List;

/* loaded from: classes5.dex */
public interface AnrService extends DataCaptureService<List<? extends AnrInterval>>, Closeable {
    void addBlockedThreadListener(BlockedThreadListener blockedThreadListener);

    void finishInitialization(ConfigService configService);

    void forceAnrTrackingStopOnCrash();
}
