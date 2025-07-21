package io.embrace.android.embracesdk.config.behavior;

import defpackage.qs2;
import defpackage.zq3;
import io.embrace.android.embracesdk.config.local.SdkLocalConfig;
import io.embrace.android.embracesdk.config.local.TapsLocalConfig;
import io.embrace.android.embracesdk.config.local.ViewLocalConfig;
import io.embrace.android.embracesdk.config.local.WebViewLocalConfig;
import io.embrace.android.embracesdk.config.remote.RemoteConfig;
import io.embrace.android.embracesdk.config.remote.UiRemoteConfig;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes5.dex */
public final class BreadcrumbBehavior extends MergedConfigBehavior<SdkLocalConfig, RemoteConfig> {
    public static final boolean CAPTURE_TAP_COORDINATES_DEFAULT = true;
    public static final Companion Companion = new Companion(null);
    public static final int DEFAULT_BREADCRUMB_LIMIT = 100;
    public static final boolean ENABLE_AUTOMATIC_ACTIVITY_CAPTURE_DEFAULT = true;
    public static final boolean WEB_VIEW_CAPTURE_DEFAULT = true;
    public static final boolean WEB_VIEW_QUERY_PARAMS_CAPTURE_DEFAULT = true;

    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BreadcrumbBehavior(BehaviorThresholdCheck behaviorThresholdCheck, qs2 qs2Var, qs2 qs2Var2) {
        super(behaviorThresholdCheck, qs2Var, qs2Var2);
        zq3.h(behaviorThresholdCheck, "thresholdCheck");
        zq3.h(qs2Var, "localSupplier");
        zq3.h(qs2Var2, "remoteSupplier");
    }

    public final int getCustomBreadcrumbLimit() {
        UiRemoteConfig uiConfig;
        Integer breadcrumbs;
        RemoteConfig remote = getRemote();
        if (remote == null || (uiConfig = remote.getUiConfig()) == null || (breadcrumbs = uiConfig.getBreadcrumbs()) == null) {
            return 100;
        }
        return breadcrumbs.intValue();
    }

    public final int getFragmentBreadcrumbLimit() {
        UiRemoteConfig uiConfig;
        Integer fragments;
        RemoteConfig remote = getRemote();
        if (remote == null || (uiConfig = remote.getUiConfig()) == null || (fragments = uiConfig.getFragments()) == null) {
            return 100;
        }
        return fragments.intValue();
    }

    public final int getTapBreadcrumbLimit() {
        UiRemoteConfig uiConfig;
        Integer taps;
        RemoteConfig remote = getRemote();
        if (remote == null || (uiConfig = remote.getUiConfig()) == null || (taps = uiConfig.getTaps()) == null) {
            return 100;
        }
        return taps.intValue();
    }

    public final int getViewBreadcrumbLimit() {
        UiRemoteConfig uiConfig;
        Integer views;
        RemoteConfig remote = getRemote();
        if (remote == null || (uiConfig = remote.getUiConfig()) == null || (views = uiConfig.getViews()) == null) {
            return 100;
        }
        return views.intValue();
    }

    public final int getWebViewBreadcrumbLimit() {
        UiRemoteConfig uiConfig;
        Integer webViews;
        RemoteConfig remote = getRemote();
        if (remote == null || (uiConfig = remote.getUiConfig()) == null || (webViews = uiConfig.getWebViews()) == null) {
            return 100;
        }
        return webViews.intValue();
    }

    public final boolean isActivityBreadcrumbCaptureEnabled() {
        ViewLocalConfig viewConfig;
        Boolean enableAutomaticActivityCapture;
        SdkLocalConfig local = getLocal();
        if (local == null || (viewConfig = local.getViewConfig()) == null || (enableAutomaticActivityCapture = viewConfig.getEnableAutomaticActivityCapture()) == null) {
            return true;
        }
        return enableAutomaticActivityCapture.booleanValue();
    }

    public final boolean isCaptureFcmPiiDataEnabled() {
        Boolean captureFcmPiiData;
        try {
            SdkLocalConfig local = getLocal();
            if (local == null || (captureFcmPiiData = local.getCaptureFcmPiiData()) == null) {
                return false;
            }
            return captureFcmPiiData.booleanValue();
        } catch (Exception unused) {
            return false;
        }
    }

    public final boolean isQueryParamCaptureEnabled() {
        WebViewLocalConfig webViewConfig;
        Boolean captureQueryParams;
        SdkLocalConfig local = getLocal();
        if (local == null || (webViewConfig = local.getWebViewConfig()) == null || (captureQueryParams = webViewConfig.getCaptureQueryParams()) == null) {
            return true;
        }
        return captureQueryParams.booleanValue();
    }

    public final boolean isTapCoordinateCaptureEnabled() {
        TapsLocalConfig taps;
        Boolean captureCoordinates;
        SdkLocalConfig local = getLocal();
        if (local == null || (taps = local.getTaps()) == null || (captureCoordinates = taps.getCaptureCoordinates()) == null) {
            return true;
        }
        return captureCoordinates.booleanValue();
    }

    public final boolean isWebViewBreadcrumbCaptureEnabled() {
        WebViewLocalConfig webViewConfig;
        Boolean captureWebViews;
        SdkLocalConfig local = getLocal();
        if (local == null || (webViewConfig = local.getWebViewConfig()) == null || (captureWebViews = webViewConfig.getCaptureWebViews()) == null) {
            return true;
        }
        return captureWebViews.booleanValue();
    }
}
