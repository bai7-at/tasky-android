package com.google.ads.interactivemedia.v3.api;

import com.google.android.gms.common.annotation.KeepForSdk;
import java.util.Map;

/* loaded from: classes2.dex */
public interface StreamRequest extends BaseRequest {

    public enum StreamFormat {
        DASH,
        HLS
    }

    Map<String, String> getAdTagParameters();

    String getAdTagUrl();

    String getApiKey();

    String getAssetKey();

    String getAuthToken();

    String getContentSourceId();

    String getContentSourceUrl();

    String getCustomAssetKey();

    @KeepForSdk
    boolean getEnableNonce();

    StreamFormat getFormat();

    @KeepForSdk
    String getLiveStreamEventId();

    String getManifestSuffix();

    String getNetworkCode();

    @KeepForSdk
    String getOAuthToken();

    @KeepForSdk
    String getProjectNumber();

    @KeepForSdk
    String getRegion();

    @KeepForSdk
    String getStreamActivityMonitorId();

    @KeepForSdk
    Boolean getUseQAStreamBaseUrl();

    String getVideoId();

    void setAdTagParameters(Map<String, String> map);

    void setAuthToken(String str);

    @KeepForSdk
    void setEnableNonce(boolean z);

    void setFormat(StreamFormat streamFormat);

    void setManifestSuffix(String str);

    void setStreamActivityMonitorId(String str);

    @KeepForSdk
    void setUseQAStreamBaseUrl(Boolean bool);
}
