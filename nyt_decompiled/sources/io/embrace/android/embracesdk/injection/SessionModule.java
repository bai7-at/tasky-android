package io.embrace.android.embracesdk.injection;

import io.embrace.android.embracesdk.arch.DataCaptureOrchestrator;
import io.embrace.android.embracesdk.session.caching.PeriodicBackgroundActivityCacher;
import io.embrace.android.embracesdk.session.caching.PeriodicSessionCacher;
import io.embrace.android.embracesdk.session.message.PayloadFactory;
import io.embrace.android.embracesdk.session.message.V1PayloadMessageCollator;
import io.embrace.android.embracesdk.session.message.V2PayloadMessageCollator;
import io.embrace.android.embracesdk.session.orchestrator.SessionOrchestrator;
import io.embrace.android.embracesdk.session.properties.SessionPropertiesService;

/* loaded from: classes5.dex */
public interface SessionModule {
    DataCaptureOrchestrator getDataCaptureOrchestrator();

    PayloadFactory getPayloadFactory();

    PeriodicBackgroundActivityCacher getPeriodicBackgroundActivityCacher();

    PeriodicSessionCacher getPeriodicSessionCacher();

    SessionOrchestrator getSessionOrchestrator();

    SessionPropertiesService getSessionPropertiesService();

    V1PayloadMessageCollator getV1PayloadMessageCollator();

    V2PayloadMessageCollator getV2PayloadMessageCollator();
}
