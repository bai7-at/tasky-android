package io.embrace.android.embracesdk.injection;

import io.embrace.android.embracesdk.arch.destination.LogWriter;
import io.embrace.android.embracesdk.capture.connectivity.NetworkConnectivityService;
import io.embrace.android.embracesdk.capture.cpu.CpuInfoDelegate;
import io.embrace.android.embracesdk.capture.metadata.HostedSdkVersionInfo;
import io.embrace.android.embracesdk.capture.metadata.MetadataService;
import io.embrace.android.embracesdk.capture.orientation.OrientationService;
import io.embrace.android.embracesdk.capture.user.UserService;
import io.embrace.android.embracesdk.comms.api.ApiClient;
import io.embrace.android.embracesdk.comms.api.ApiService;
import io.embrace.android.embracesdk.comms.api.ApiUrlBuilder;
import io.embrace.android.embracesdk.comms.delivery.PendingApiCallsSender;
import io.embrace.android.embracesdk.config.ConfigService;
import io.embrace.android.embracesdk.gating.GatingService;
import io.embrace.android.embracesdk.internal.DeviceArchitecture;
import io.embrace.android.embracesdk.internal.SharedObjectLoader;
import io.embrace.android.embracesdk.session.MemoryCleanerService;
import io.embrace.android.embracesdk.session.id.SessionIdTracker;
import io.embrace.android.embracesdk.session.lifecycle.ActivityTracker;
import io.embrace.android.embracesdk.session.lifecycle.ProcessStateService;
import io.embrace.android.embracesdk.session.properties.EmbraceSessionProperties;

/* loaded from: classes5.dex */
public interface EssentialServiceModule {
    ActivityTracker getActivityLifecycleTracker();

    ApiClient getApiClient();

    ApiService getApiService();

    ConfigService getConfigService();

    CpuInfoDelegate getCpuInfoDelegate();

    DeviceArchitecture getDeviceArchitecture();

    GatingService getGatingService();

    HostedSdkVersionInfo getHostedSdkVersionInfo();

    LogWriter getLogWriter();

    MemoryCleanerService getMemoryCleanerService();

    MetadataService getMetadataService();

    NetworkConnectivityService getNetworkConnectivityService();

    OrientationService getOrientationService();

    PendingApiCallsSender getPendingApiCallsSender();

    ProcessStateService getProcessStateService();

    SessionIdTracker getSessionIdTracker();

    EmbraceSessionProperties getSessionProperties();

    SharedObjectLoader getSharedObjectLoader();

    ApiUrlBuilder getUrlBuilder();

    UserService getUserService();
}
