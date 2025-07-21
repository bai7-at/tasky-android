package io.embrace.android.embracesdk.config.local;

import defpackage.bt3;
import defpackage.et3;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;

@et3(generateAdapter = true)
/* loaded from: classes5.dex */
public final class NetworkLocalConfig {
    private final Boolean captureRequestContentLength;
    private final Integer defaultCaptureLimit;
    private final List<String> disabledUrlPatterns;
    private final List<DomainLocalConfig> domains;
    private final Boolean enableNativeMonitoring;
    private final String traceIdHeader;

    public NetworkLocalConfig() {
        this(null, null, null, null, null, null, 63, null);
    }

    public final Boolean getCaptureRequestContentLength() {
        return this.captureRequestContentLength;
    }

    public final Integer getDefaultCaptureLimit() {
        return this.defaultCaptureLimit;
    }

    public final List<String> getDisabledUrlPatterns() {
        return this.disabledUrlPatterns;
    }

    public final List<DomainLocalConfig> getDomains() {
        return this.domains;
    }

    public final Boolean getEnableNativeMonitoring() {
        return this.enableNativeMonitoring;
    }

    public final String getTraceIdHeader() {
        return this.traceIdHeader;
    }

    public NetworkLocalConfig(@bt3(name = "trace_id_header") String str, @bt3(name = "default_capture_limit") Integer num, @bt3(name = "domains") List<DomainLocalConfig> list, @bt3(name = "capture_request_content_length") Boolean bool, @bt3(name = "disabled_url_patterns") List<String> list2, @bt3(name = "enable_native_monitoring") Boolean bool2) {
        this.traceIdHeader = str;
        this.defaultCaptureLimit = num;
        this.domains = list;
        this.captureRequestContentLength = bool;
        this.disabledUrlPatterns = list2;
        this.enableNativeMonitoring = bool2;
    }

    public /* synthetic */ NetworkLocalConfig(String str, Integer num, List list, Boolean bool, List list2, Boolean bool2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : num, (i & 4) != 0 ? null : list, (i & 8) != 0 ? null : bool, (i & 16) != 0 ? null : list2, (i & 32) != 0 ? null : bool2);
    }
}
