package io.embrace.android.embracesdk.config;

import io.embrace.android.embracesdk.config.behavior.AnrBehavior;
import io.embrace.android.embracesdk.config.behavior.AppExitInfoBehavior;
import io.embrace.android.embracesdk.config.behavior.AutoDataCaptureBehavior;
import io.embrace.android.embracesdk.config.behavior.BackgroundActivityBehavior;
import io.embrace.android.embracesdk.config.behavior.BreadcrumbBehavior;
import io.embrace.android.embracesdk.config.behavior.DataCaptureEventBehavior;
import io.embrace.android.embracesdk.config.behavior.LogMessageBehavior;
import io.embrace.android.embracesdk.config.behavior.NetworkBehavior;
import io.embrace.android.embracesdk.config.behavior.NetworkSpanForwardingBehavior;
import io.embrace.android.embracesdk.config.behavior.OTelBehavior;
import io.embrace.android.embracesdk.config.behavior.SdkEndpointBehavior;
import io.embrace.android.embracesdk.config.behavior.SdkModeBehavior;
import io.embrace.android.embracesdk.config.behavior.SessionBehavior;
import io.embrace.android.embracesdk.config.behavior.StartupBehavior;
import io.embrace.android.embracesdk.config.behavior.WebViewVitalsBehavior;
import java.io.Closeable;

/* loaded from: classes5.dex */
public interface ConfigService extends Closeable {
    void addListener(ConfigListener configListener);

    AnrBehavior getAnrBehavior();

    AppExitInfoBehavior getAppExitInfoBehavior();

    AutoDataCaptureBehavior getAutoDataCaptureBehavior();

    BackgroundActivityBehavior getBackgroundActivityBehavior();

    BreadcrumbBehavior getBreadcrumbBehavior();

    DataCaptureEventBehavior getDataCaptureEventBehavior();

    LogMessageBehavior getLogMessageBehavior();

    NetworkBehavior getNetworkBehavior();

    NetworkSpanForwardingBehavior getNetworkSpanForwardingBehavior();

    OTelBehavior getOTelBehavior();

    SdkEndpointBehavior getSdkEndpointBehavior();

    SdkModeBehavior getSdkModeBehavior();

    SessionBehavior getSessionBehavior();

    StartupBehavior getStartupBehavior();

    WebViewVitalsBehavior getWebViewVitalsBehavior();

    boolean hasValidRemoteConfig();

    boolean isAppExitInfoCaptureEnabled();

    boolean isBackgroundActivityCaptureEnabled();

    boolean isSdkDisabled();
}
