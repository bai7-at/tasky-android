package io.embrace.android.embracesdk.payload;

import defpackage.bt3;
import defpackage.et3;
import defpackage.zq3;
import java.util.Map;

@et3(generateAdapter = true)
/* loaded from: classes5.dex */
public final class NativeCrashMetadata {
    private final AppInfo appInfo;
    private final DeviceInfo deviceInfo;
    private final Map<String, String> sessionProperties;
    private final UserInfo userInfo;

    public NativeCrashMetadata(@bt3(name = "a") AppInfo appInfo, @bt3(name = "d") DeviceInfo deviceInfo, @bt3(name = "u") UserInfo userInfo, @bt3(name = "sp") Map<String, String> map) {
        zq3.h(appInfo, "appInfo");
        zq3.h(deviceInfo, "deviceInfo");
        zq3.h(userInfo, "userInfo");
        this.appInfo = appInfo;
        this.deviceInfo = deviceInfo;
        this.userInfo = userInfo;
        this.sessionProperties = map;
    }

    public final AppInfo getAppInfo() {
        return this.appInfo;
    }

    public final DeviceInfo getDeviceInfo() {
        return this.deviceInfo;
    }

    public final Map<String, String> getSessionProperties() {
        return this.sessionProperties;
    }

    public final UserInfo getUserInfo() {
        return this.userInfo;
    }
}
