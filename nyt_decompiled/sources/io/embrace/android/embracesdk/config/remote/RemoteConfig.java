package io.embrace.android.embracesdk.config.remote;

import com.amazonaws.event.ProgressEvent;
import com.amazonaws.services.s3.internal.Constants;
import com.amazonaws.services.s3.internal.crypto.JceEncryptionConstants;
import defpackage.bt3;
import defpackage.et3;
import defpackage.zq3;
import java.util.Map;
import java.util.Set;
import kotlin.jvm.internal.DefaultConstructorMarker;
import okhttp3.internal.http2.Http2;

@et3(generateAdapter = true)
/* loaded from: classes5.dex */
public final class RemoteConfig {
    private final AnrRemoteConfig anrConfig;
    private final AppExitInfoConfig appExitInfoConfig;
    private final BackgroundActivityRemoteConfig backgroundActivityConfig;
    private final DataRemoteConfig dataConfig;
    private final Set<String> disabledEventAndLogPatterns;
    private final Set<String> disabledUrlPatterns;
    private final Map<String, Long> eventLimits;
    private final Boolean internalExceptionCaptureEnabled;
    private final KillSwitchRemoteConfig killSwitchConfig;
    private final LogRemoteConfig logConfig;
    private final Integer maxSessionProperties;
    private final Set<NetworkCaptureRuleRemoteConfig> networkCaptureRules;
    private final NetworkRemoteConfig networkConfig;
    private final NetworkSpanForwardingRemoteConfig networkSpanForwardingRemoteConfig;
    private final OTelRemoteConfig oTelConfig;
    private final Integer offset;
    private final Float pctBetaFeaturesEnabled;
    private final Float pctDeferServiceInitEnabled;
    private final SessionRemoteConfig sessionConfig;
    private final Integer threshold;
    private final UiRemoteConfig uiConfig;
    private final WebViewVitals webViewVitals;

    public RemoteConfig() {
        this(null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, 4194303, null);
    }

    public final Integer component1() {
        return this.threshold;
    }

    public final LogRemoteConfig component10() {
        return this.logConfig;
    }

    public final AnrRemoteConfig component11() {
        return this.anrConfig;
    }

    public final DataRemoteConfig component12() {
        return this.dataConfig;
    }

    public final KillSwitchRemoteConfig component13() {
        return this.killSwitchConfig;
    }

    public final Boolean component14() {
        return this.internalExceptionCaptureEnabled;
    }

    public final Float component15() {
        return this.pctBetaFeaturesEnabled;
    }

    public final AppExitInfoConfig component16() {
        return this.appExitInfoConfig;
    }

    public final BackgroundActivityRemoteConfig component17() {
        return this.backgroundActivityConfig;
    }

    public final Integer component18() {
        return this.maxSessionProperties;
    }

    public final NetworkSpanForwardingRemoteConfig component19() {
        return this.networkSpanForwardingRemoteConfig;
    }

    public final Integer component2() {
        return this.offset;
    }

    public final WebViewVitals component20() {
        return this.webViewVitals;
    }

    public final Float component21() {
        return this.pctDeferServiceInitEnabled;
    }

    public final OTelRemoteConfig component22() {
        return this.oTelConfig;
    }

    public final Map<String, Long> component3() {
        return this.eventLimits;
    }

    public final Set<String> component4() {
        return this.disabledEventAndLogPatterns;
    }

    public final Set<String> component5() {
        return this.disabledUrlPatterns;
    }

    public final Set<NetworkCaptureRuleRemoteConfig> component6() {
        return this.networkCaptureRules;
    }

    public final UiRemoteConfig component7() {
        return this.uiConfig;
    }

    public final NetworkRemoteConfig component8() {
        return this.networkConfig;
    }

    public final SessionRemoteConfig component9() {
        return this.sessionConfig;
    }

    public final RemoteConfig copy(@bt3(name = "threshold") Integer num, @bt3(name = "offset") Integer num2, @bt3(name = "event_limits") Map<String, Long> map, @bt3(name = "disabled_event_and_log_patterns") Set<String> set, @bt3(name = "disabled_url_patterns") Set<String> set2, @bt3(name = "network_capture") Set<NetworkCaptureRuleRemoteConfig> set3, @bt3(name = "ui") UiRemoteConfig uiRemoteConfig, @bt3(name = "network") NetworkRemoteConfig networkRemoteConfig, @bt3(name = "session_control") SessionRemoteConfig sessionRemoteConfig, @bt3(name = "logs") LogRemoteConfig logRemoteConfig, @bt3(name = "anr") AnrRemoteConfig anrRemoteConfig, @bt3(name = "data") DataRemoteConfig dataRemoteConfig, @bt3(name = "killswitch") KillSwitchRemoteConfig killSwitchRemoteConfig, @bt3(name = "internal_exception_capture_enabled") Boolean bool, @bt3(name = "pct_beta_features_enabled") Float f, @bt3(name = "app_exit_info") AppExitInfoConfig appExitInfoConfig, @bt3(name = "background") BackgroundActivityRemoteConfig backgroundActivityRemoteConfig, @bt3(name = "max_session_properties") Integer num3, @bt3(name = "network_span_forwarding") NetworkSpanForwardingRemoteConfig networkSpanForwardingRemoteConfig, @bt3(name = "webview_vitals_beta") WebViewVitals webViewVitals, @bt3(name = "pct_defer_service_init") Float f2, @bt3(name = "otel_config") OTelRemoteConfig oTelRemoteConfig) {
        return new RemoteConfig(num, num2, map, set, set2, set3, uiRemoteConfig, networkRemoteConfig, sessionRemoteConfig, logRemoteConfig, anrRemoteConfig, dataRemoteConfig, killSwitchRemoteConfig, bool, f, appExitInfoConfig, backgroundActivityRemoteConfig, num3, networkSpanForwardingRemoteConfig, webViewVitals, f2, oTelRemoteConfig);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof RemoteConfig)) {
            return false;
        }
        RemoteConfig remoteConfig = (RemoteConfig) obj;
        return zq3.c(this.threshold, remoteConfig.threshold) && zq3.c(this.offset, remoteConfig.offset) && zq3.c(this.eventLimits, remoteConfig.eventLimits) && zq3.c(this.disabledEventAndLogPatterns, remoteConfig.disabledEventAndLogPatterns) && zq3.c(this.disabledUrlPatterns, remoteConfig.disabledUrlPatterns) && zq3.c(this.networkCaptureRules, remoteConfig.networkCaptureRules) && zq3.c(this.uiConfig, remoteConfig.uiConfig) && zq3.c(this.networkConfig, remoteConfig.networkConfig) && zq3.c(this.sessionConfig, remoteConfig.sessionConfig) && zq3.c(this.logConfig, remoteConfig.logConfig) && zq3.c(this.anrConfig, remoteConfig.anrConfig) && zq3.c(this.dataConfig, remoteConfig.dataConfig) && zq3.c(this.killSwitchConfig, remoteConfig.killSwitchConfig) && zq3.c(this.internalExceptionCaptureEnabled, remoteConfig.internalExceptionCaptureEnabled) && zq3.c(this.pctBetaFeaturesEnabled, remoteConfig.pctBetaFeaturesEnabled) && zq3.c(this.appExitInfoConfig, remoteConfig.appExitInfoConfig) && zq3.c(this.backgroundActivityConfig, remoteConfig.backgroundActivityConfig) && zq3.c(this.maxSessionProperties, remoteConfig.maxSessionProperties) && zq3.c(this.networkSpanForwardingRemoteConfig, remoteConfig.networkSpanForwardingRemoteConfig) && zq3.c(this.webViewVitals, remoteConfig.webViewVitals) && zq3.c(this.pctDeferServiceInitEnabled, remoteConfig.pctDeferServiceInitEnabled) && zq3.c(this.oTelConfig, remoteConfig.oTelConfig);
    }

    public final AnrRemoteConfig getAnrConfig() {
        return this.anrConfig;
    }

    public final AppExitInfoConfig getAppExitInfoConfig() {
        return this.appExitInfoConfig;
    }

    public final BackgroundActivityRemoteConfig getBackgroundActivityConfig() {
        return this.backgroundActivityConfig;
    }

    public final DataRemoteConfig getDataConfig() {
        return this.dataConfig;
    }

    public final Set<String> getDisabledEventAndLogPatterns() {
        return this.disabledEventAndLogPatterns;
    }

    public final Set<String> getDisabledUrlPatterns() {
        return this.disabledUrlPatterns;
    }

    public final Map<String, Long> getEventLimits() {
        return this.eventLimits;
    }

    public final Boolean getInternalExceptionCaptureEnabled() {
        return this.internalExceptionCaptureEnabled;
    }

    public final KillSwitchRemoteConfig getKillSwitchConfig() {
        return this.killSwitchConfig;
    }

    public final LogRemoteConfig getLogConfig() {
        return this.logConfig;
    }

    public final Integer getMaxSessionProperties() {
        return this.maxSessionProperties;
    }

    public final Set<NetworkCaptureRuleRemoteConfig> getNetworkCaptureRules() {
        return this.networkCaptureRules;
    }

    public final NetworkRemoteConfig getNetworkConfig() {
        return this.networkConfig;
    }

    public final NetworkSpanForwardingRemoteConfig getNetworkSpanForwardingRemoteConfig() {
        return this.networkSpanForwardingRemoteConfig;
    }

    public final OTelRemoteConfig getOTelConfig() {
        return this.oTelConfig;
    }

    public final Integer getOffset() {
        return this.offset;
    }

    public final Float getPctBetaFeaturesEnabled() {
        return this.pctBetaFeaturesEnabled;
    }

    public final Float getPctDeferServiceInitEnabled() {
        return this.pctDeferServiceInitEnabled;
    }

    public final SessionRemoteConfig getSessionConfig() {
        return this.sessionConfig;
    }

    public final Integer getThreshold() {
        return this.threshold;
    }

    public final UiRemoteConfig getUiConfig() {
        return this.uiConfig;
    }

    public final WebViewVitals getWebViewVitals() {
        return this.webViewVitals;
    }

    public int hashCode() {
        Integer num = this.threshold;
        int hashCode = (num != null ? num.hashCode() : 0) * 31;
        Integer num2 = this.offset;
        int hashCode2 = (hashCode + (num2 != null ? num2.hashCode() : 0)) * 31;
        Map<String, Long> map = this.eventLimits;
        int hashCode3 = (hashCode2 + (map != null ? map.hashCode() : 0)) * 31;
        Set<String> set = this.disabledEventAndLogPatterns;
        int hashCode4 = (hashCode3 + (set != null ? set.hashCode() : 0)) * 31;
        Set<String> set2 = this.disabledUrlPatterns;
        int hashCode5 = (hashCode4 + (set2 != null ? set2.hashCode() : 0)) * 31;
        Set<NetworkCaptureRuleRemoteConfig> set3 = this.networkCaptureRules;
        int hashCode6 = (hashCode5 + (set3 != null ? set3.hashCode() : 0)) * 31;
        UiRemoteConfig uiRemoteConfig = this.uiConfig;
        int hashCode7 = (hashCode6 + (uiRemoteConfig != null ? uiRemoteConfig.hashCode() : 0)) * 31;
        NetworkRemoteConfig networkRemoteConfig = this.networkConfig;
        int hashCode8 = (hashCode7 + (networkRemoteConfig != null ? networkRemoteConfig.hashCode() : 0)) * 31;
        SessionRemoteConfig sessionRemoteConfig = this.sessionConfig;
        int hashCode9 = (hashCode8 + (sessionRemoteConfig != null ? sessionRemoteConfig.hashCode() : 0)) * 31;
        LogRemoteConfig logRemoteConfig = this.logConfig;
        int hashCode10 = (hashCode9 + (logRemoteConfig != null ? logRemoteConfig.hashCode() : 0)) * 31;
        AnrRemoteConfig anrRemoteConfig = this.anrConfig;
        int hashCode11 = (hashCode10 + (anrRemoteConfig != null ? anrRemoteConfig.hashCode() : 0)) * 31;
        DataRemoteConfig dataRemoteConfig = this.dataConfig;
        int hashCode12 = (hashCode11 + (dataRemoteConfig != null ? dataRemoteConfig.hashCode() : 0)) * 31;
        KillSwitchRemoteConfig killSwitchRemoteConfig = this.killSwitchConfig;
        int hashCode13 = (hashCode12 + (killSwitchRemoteConfig != null ? killSwitchRemoteConfig.hashCode() : 0)) * 31;
        Boolean bool = this.internalExceptionCaptureEnabled;
        int hashCode14 = (hashCode13 + (bool != null ? bool.hashCode() : 0)) * 31;
        Float f = this.pctBetaFeaturesEnabled;
        int hashCode15 = (hashCode14 + (f != null ? f.hashCode() : 0)) * 31;
        AppExitInfoConfig appExitInfoConfig = this.appExitInfoConfig;
        int hashCode16 = (hashCode15 + (appExitInfoConfig != null ? appExitInfoConfig.hashCode() : 0)) * 31;
        BackgroundActivityRemoteConfig backgroundActivityRemoteConfig = this.backgroundActivityConfig;
        int hashCode17 = (hashCode16 + (backgroundActivityRemoteConfig != null ? backgroundActivityRemoteConfig.hashCode() : 0)) * 31;
        Integer num3 = this.maxSessionProperties;
        int hashCode18 = (hashCode17 + (num3 != null ? num3.hashCode() : 0)) * 31;
        NetworkSpanForwardingRemoteConfig networkSpanForwardingRemoteConfig = this.networkSpanForwardingRemoteConfig;
        int hashCode19 = (hashCode18 + (networkSpanForwardingRemoteConfig != null ? networkSpanForwardingRemoteConfig.hashCode() : 0)) * 31;
        WebViewVitals webViewVitals = this.webViewVitals;
        int hashCode20 = (hashCode19 + (webViewVitals != null ? webViewVitals.hashCode() : 0)) * 31;
        Float f2 = this.pctDeferServiceInitEnabled;
        int hashCode21 = (hashCode20 + (f2 != null ? f2.hashCode() : 0)) * 31;
        OTelRemoteConfig oTelRemoteConfig = this.oTelConfig;
        return hashCode21 + (oTelRemoteConfig != null ? oTelRemoteConfig.hashCode() : 0);
    }

    public String toString() {
        return "RemoteConfig(threshold=" + this.threshold + ", offset=" + this.offset + ", eventLimits=" + this.eventLimits + ", disabledEventAndLogPatterns=" + this.disabledEventAndLogPatterns + ", disabledUrlPatterns=" + this.disabledUrlPatterns + ", networkCaptureRules=" + this.networkCaptureRules + ", uiConfig=" + this.uiConfig + ", networkConfig=" + this.networkConfig + ", sessionConfig=" + this.sessionConfig + ", logConfig=" + this.logConfig + ", anrConfig=" + this.anrConfig + ", dataConfig=" + this.dataConfig + ", killSwitchConfig=" + this.killSwitchConfig + ", internalExceptionCaptureEnabled=" + this.internalExceptionCaptureEnabled + ", pctBetaFeaturesEnabled=" + this.pctBetaFeaturesEnabled + ", appExitInfoConfig=" + this.appExitInfoConfig + ", backgroundActivityConfig=" + this.backgroundActivityConfig + ", maxSessionProperties=" + this.maxSessionProperties + ", networkSpanForwardingRemoteConfig=" + this.networkSpanForwardingRemoteConfig + ", webViewVitals=" + this.webViewVitals + ", pctDeferServiceInitEnabled=" + this.pctDeferServiceInitEnabled + ", oTelConfig=" + this.oTelConfig + ")";
    }

    public RemoteConfig(@bt3(name = "threshold") Integer num, @bt3(name = "offset") Integer num2, @bt3(name = "event_limits") Map<String, Long> map, @bt3(name = "disabled_event_and_log_patterns") Set<String> set, @bt3(name = "disabled_url_patterns") Set<String> set2, @bt3(name = "network_capture") Set<NetworkCaptureRuleRemoteConfig> set3, @bt3(name = "ui") UiRemoteConfig uiRemoteConfig, @bt3(name = "network") NetworkRemoteConfig networkRemoteConfig, @bt3(name = "session_control") SessionRemoteConfig sessionRemoteConfig, @bt3(name = "logs") LogRemoteConfig logRemoteConfig, @bt3(name = "anr") AnrRemoteConfig anrRemoteConfig, @bt3(name = "data") DataRemoteConfig dataRemoteConfig, @bt3(name = "killswitch") KillSwitchRemoteConfig killSwitchRemoteConfig, @bt3(name = "internal_exception_capture_enabled") Boolean bool, @bt3(name = "pct_beta_features_enabled") Float f, @bt3(name = "app_exit_info") AppExitInfoConfig appExitInfoConfig, @bt3(name = "background") BackgroundActivityRemoteConfig backgroundActivityRemoteConfig, @bt3(name = "max_session_properties") Integer num3, @bt3(name = "network_span_forwarding") NetworkSpanForwardingRemoteConfig networkSpanForwardingRemoteConfig, @bt3(name = "webview_vitals_beta") WebViewVitals webViewVitals, @bt3(name = "pct_defer_service_init") Float f2, @bt3(name = "otel_config") OTelRemoteConfig oTelRemoteConfig) {
        this.threshold = num;
        this.offset = num2;
        this.eventLimits = map;
        this.disabledEventAndLogPatterns = set;
        this.disabledUrlPatterns = set2;
        this.networkCaptureRules = set3;
        this.uiConfig = uiRemoteConfig;
        this.networkConfig = networkRemoteConfig;
        this.sessionConfig = sessionRemoteConfig;
        this.logConfig = logRemoteConfig;
        this.anrConfig = anrRemoteConfig;
        this.dataConfig = dataRemoteConfig;
        this.killSwitchConfig = killSwitchRemoteConfig;
        this.internalExceptionCaptureEnabled = bool;
        this.pctBetaFeaturesEnabled = f;
        this.appExitInfoConfig = appExitInfoConfig;
        this.backgroundActivityConfig = backgroundActivityRemoteConfig;
        this.maxSessionProperties = num3;
        this.networkSpanForwardingRemoteConfig = networkSpanForwardingRemoteConfig;
        this.webViewVitals = webViewVitals;
        this.pctDeferServiceInitEnabled = f2;
        this.oTelConfig = oTelRemoteConfig;
    }

    public /* synthetic */ RemoteConfig(Integer num, Integer num2, Map map, Set set, Set set2, Set set3, UiRemoteConfig uiRemoteConfig, NetworkRemoteConfig networkRemoteConfig, SessionRemoteConfig sessionRemoteConfig, LogRemoteConfig logRemoteConfig, AnrRemoteConfig anrRemoteConfig, DataRemoteConfig dataRemoteConfig, KillSwitchRemoteConfig killSwitchRemoteConfig, Boolean bool, Float f, AppExitInfoConfig appExitInfoConfig, BackgroundActivityRemoteConfig backgroundActivityRemoteConfig, Integer num3, NetworkSpanForwardingRemoteConfig networkSpanForwardingRemoteConfig, WebViewVitals webViewVitals, Float f2, OTelRemoteConfig oTelRemoteConfig, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : num, (i & 2) != 0 ? null : num2, (i & 4) != 0 ? null : map, (i & 8) != 0 ? null : set, (i & 16) != 0 ? null : set2, (i & 32) != 0 ? null : set3, (i & 64) != 0 ? null : uiRemoteConfig, (i & 128) != 0 ? null : networkRemoteConfig, (i & JceEncryptionConstants.SYMMETRIC_KEY_LENGTH) != 0 ? null : sessionRemoteConfig, (i & 512) != 0 ? null : logRemoteConfig, (i & 1024) != 0 ? null : anrRemoteConfig, (i & ProgressEvent.PART_COMPLETED_EVENT_CODE) != 0 ? null : dataRemoteConfig, (i & ProgressEvent.PART_FAILED_EVENT_CODE) != 0 ? null : killSwitchRemoteConfig, (i & 8192) != 0 ? null : bool, (i & Http2.INITIAL_MAX_FRAME_SIZE) != 0 ? null : f, (i & 32768) != 0 ? null : appExitInfoConfig, (i & 65536) != 0 ? null : backgroundActivityRemoteConfig, (i & 131072) != 0 ? null : num3, (i & 262144) != 0 ? null : networkSpanForwardingRemoteConfig, (i & 524288) != 0 ? null : webViewVitals, (i & Constants.MB) != 0 ? null : f2, (i & 2097152) != 0 ? null : oTelRemoteConfig);
    }
}
