package io.embrace.android.embracesdk.config.local;

import defpackage.bt3;
import defpackage.et3;
import defpackage.zq3;

@et3(generateAdapter = true)
/* loaded from: classes5.dex */
public final class LocalConfig {
    private final String appId;
    private final boolean ndkEnabled;
    private final SdkLocalConfig sdkConfig;

    public LocalConfig(String str, @bt3(name = "ndk_enabled") boolean z, SdkLocalConfig sdkLocalConfig) {
        zq3.h(str, "appId");
        zq3.h(sdkLocalConfig, "sdkConfig");
        this.appId = str;
        this.ndkEnabled = z;
        this.sdkConfig = sdkLocalConfig;
    }

    public final String getAppId() {
        return this.appId;
    }

    public final boolean getNdkEnabled() {
        return this.ndkEnabled;
    }

    public final SdkLocalConfig getSdkConfig() {
        return this.sdkConfig;
    }
}
