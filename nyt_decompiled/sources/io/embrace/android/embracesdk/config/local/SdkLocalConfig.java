package io.embrace.android.embracesdk.config.local;

import com.amazonaws.event.ProgressEvent;
import com.amazonaws.services.s3.internal.crypto.JceEncryptionConstants;
import defpackage.bt3;
import defpackage.et3;
import kotlin.jvm.internal.DefaultConstructorMarker;
import okhttp3.internal.http2.Http2;

@et3(generateAdapter = true)
/* loaded from: classes5.dex */
public final class SdkLocalConfig {
    private final AnrLocalConfig anr;
    private final AppLocalConfig app;
    private final AppExitInfoLocalConfig appExitInfoConfig;
    private final AutomaticDataCaptureLocalConfig automaticDataCaptureConfig;
    private final BackgroundActivityLocalConfig backgroundActivityConfig;
    private final BaseUrlLocalConfig baseUrls;
    private final Boolean betaFeaturesEnabled;
    private final Boolean captureFcmPiiData;
    private final String capturePublicKey;
    private final ComposeLocalConfig composeConfig;
    private final CrashHandlerLocalConfig crashHandler;
    private final NetworkLocalConfig networking;
    private final SessionLocalConfig sessionConfig;
    private final Boolean sigHandlerDetection;
    private final StartupMomentLocalConfig startupMoment;
    private final TapsLocalConfig taps;
    private final ViewLocalConfig viewConfig;
    private final WebViewLocalConfig webViewConfig;

    public SdkLocalConfig() {
        this(null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, 262143, null);
    }

    public final AnrLocalConfig getAnr() {
        return this.anr;
    }

    public final AppLocalConfig getApp() {
        return this.app;
    }

    public final AppExitInfoLocalConfig getAppExitInfoConfig() {
        return this.appExitInfoConfig;
    }

    public final AutomaticDataCaptureLocalConfig getAutomaticDataCaptureConfig() {
        return this.automaticDataCaptureConfig;
    }

    public final BackgroundActivityLocalConfig getBackgroundActivityConfig() {
        return this.backgroundActivityConfig;
    }

    public final BaseUrlLocalConfig getBaseUrls() {
        return this.baseUrls;
    }

    public final Boolean getBetaFeaturesEnabled() {
        return this.betaFeaturesEnabled;
    }

    public final Boolean getCaptureFcmPiiData() {
        return this.captureFcmPiiData;
    }

    public final String getCapturePublicKey() {
        return this.capturePublicKey;
    }

    public final ComposeLocalConfig getComposeConfig() {
        return this.composeConfig;
    }

    public final CrashHandlerLocalConfig getCrashHandler() {
        return this.crashHandler;
    }

    public final NetworkLocalConfig getNetworking() {
        return this.networking;
    }

    public final SessionLocalConfig getSessionConfig() {
        return this.sessionConfig;
    }

    public final Boolean getSigHandlerDetection() {
        return this.sigHandlerDetection;
    }

    public final StartupMomentLocalConfig getStartupMoment() {
        return this.startupMoment;
    }

    public final TapsLocalConfig getTaps() {
        return this.taps;
    }

    public final ViewLocalConfig getViewConfig() {
        return this.viewConfig;
    }

    public final WebViewLocalConfig getWebViewConfig() {
        return this.webViewConfig;
    }

    public SdkLocalConfig(@bt3(name = "automatic_data_capture") AutomaticDataCaptureLocalConfig automaticDataCaptureLocalConfig, @bt3(name = "taps") TapsLocalConfig tapsLocalConfig, @bt3(name = "view_config") ViewLocalConfig viewLocalConfig, @bt3(name = "webview") WebViewLocalConfig webViewLocalConfig, @bt3(name = "beta_features_enabled") Boolean bool, @bt3(name = "crash_handler") CrashHandlerLocalConfig crashHandlerLocalConfig, @bt3(name = "compose") ComposeLocalConfig composeLocalConfig, @bt3(name = "capture_fcm_pii_data") Boolean bool2, @bt3(name = "networking") NetworkLocalConfig networkLocalConfig, @bt3(name = "capture_public_key") String str, @bt3(name = "anr") AnrLocalConfig anrLocalConfig, @bt3(name = "app") AppLocalConfig appLocalConfig, @bt3(name = "background_activity") BackgroundActivityLocalConfig backgroundActivityLocalConfig, @bt3(name = "base_urls") BaseUrlLocalConfig baseUrlLocalConfig, @bt3(name = "startup_moment") StartupMomentLocalConfig startupMomentLocalConfig, @bt3(name = "session") SessionLocalConfig sessionLocalConfig, @bt3(name = "sig_handler_detection") Boolean bool3, @bt3(name = "app_exit_info") AppExitInfoLocalConfig appExitInfoLocalConfig) {
        this.automaticDataCaptureConfig = automaticDataCaptureLocalConfig;
        this.taps = tapsLocalConfig;
        this.viewConfig = viewLocalConfig;
        this.webViewConfig = webViewLocalConfig;
        this.betaFeaturesEnabled = bool;
        this.crashHandler = crashHandlerLocalConfig;
        this.composeConfig = composeLocalConfig;
        this.captureFcmPiiData = bool2;
        this.networking = networkLocalConfig;
        this.capturePublicKey = str;
        this.anr = anrLocalConfig;
        this.app = appLocalConfig;
        this.backgroundActivityConfig = backgroundActivityLocalConfig;
        this.baseUrls = baseUrlLocalConfig;
        this.startupMoment = startupMomentLocalConfig;
        this.sessionConfig = sessionLocalConfig;
        this.sigHandlerDetection = bool3;
        this.appExitInfoConfig = appExitInfoLocalConfig;
    }

    public /* synthetic */ SdkLocalConfig(AutomaticDataCaptureLocalConfig automaticDataCaptureLocalConfig, TapsLocalConfig tapsLocalConfig, ViewLocalConfig viewLocalConfig, WebViewLocalConfig webViewLocalConfig, Boolean bool, CrashHandlerLocalConfig crashHandlerLocalConfig, ComposeLocalConfig composeLocalConfig, Boolean bool2, NetworkLocalConfig networkLocalConfig, String str, AnrLocalConfig anrLocalConfig, AppLocalConfig appLocalConfig, BackgroundActivityLocalConfig backgroundActivityLocalConfig, BaseUrlLocalConfig baseUrlLocalConfig, StartupMomentLocalConfig startupMomentLocalConfig, SessionLocalConfig sessionLocalConfig, Boolean bool3, AppExitInfoLocalConfig appExitInfoLocalConfig, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : automaticDataCaptureLocalConfig, (i & 2) != 0 ? null : tapsLocalConfig, (i & 4) != 0 ? null : viewLocalConfig, (i & 8) != 0 ? null : webViewLocalConfig, (i & 16) != 0 ? null : bool, (i & 32) != 0 ? null : crashHandlerLocalConfig, (i & 64) != 0 ? null : composeLocalConfig, (i & 128) != 0 ? null : bool2, (i & JceEncryptionConstants.SYMMETRIC_KEY_LENGTH) != 0 ? null : networkLocalConfig, (i & 512) != 0 ? null : str, (i & 1024) != 0 ? null : anrLocalConfig, (i & ProgressEvent.PART_COMPLETED_EVENT_CODE) != 0 ? null : appLocalConfig, (i & ProgressEvent.PART_FAILED_EVENT_CODE) != 0 ? null : backgroundActivityLocalConfig, (i & 8192) != 0 ? null : baseUrlLocalConfig, (i & Http2.INITIAL_MAX_FRAME_SIZE) != 0 ? null : startupMomentLocalConfig, (i & 32768) != 0 ? null : sessionLocalConfig, (i & 65536) != 0 ? null : bool3, (i & 131072) != 0 ? null : appExitInfoLocalConfig);
    }
}
