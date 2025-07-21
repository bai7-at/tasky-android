package io.embrace.android.embracesdk.injection;

import io.embrace.android.embracesdk.capture.crumbs.BreadcrumbService;
import io.embrace.android.embracesdk.capture.crumbs.PushNotificationCaptureService;
import io.embrace.android.embracesdk.capture.memory.ComponentCallbackService;
import io.embrace.android.embracesdk.capture.memory.MemoryService;
import io.embrace.android.embracesdk.capture.startup.AppStartupTraceEmitter;
import io.embrace.android.embracesdk.capture.startup.StartupService;
import io.embrace.android.embracesdk.capture.startup.StartupTracker;
import io.embrace.android.embracesdk.capture.thermalstate.ThermalStatusService;
import io.embrace.android.embracesdk.capture.webview.WebViewService;

/* loaded from: classes5.dex */
public interface DataCaptureServiceModule {
    AppStartupTraceEmitter getAppStartupTraceEmitter();

    BreadcrumbService getBreadcrumbService();

    ComponentCallbackService getComponentCallbackService();

    MemoryService getMemoryService();

    PushNotificationCaptureService getPushNotificationService();

    StartupService getStartupService();

    StartupTracker getStartupTracker();

    ThermalStatusService getThermalStatusService();

    WebViewService getWebviewService();
}
