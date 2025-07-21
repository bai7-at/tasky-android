package io.embrace.android.embracesdk.comms.api;

import android.os.Build;
import defpackage.c04;
import defpackage.zq3;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes5.dex */
public final class EmbraceApiUrlBuilder implements ApiUrlBuilder {
    private static final int CONFIG_API_VERSION = 2;
    public static final Companion Companion = new Companion(null);
    private final String appId;
    private final String configBaseUrl;
    private final String coreBaseUrl;
    private final c04 lazyAppVersionName;
    private final c04 lazyDeviceId;

    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public EmbraceApiUrlBuilder(String str, String str2, String str3, c04 c04Var, c04 c04Var2) {
        zq3.h(str, "coreBaseUrl");
        zq3.h(str2, "configBaseUrl");
        zq3.h(str3, "appId");
        zq3.h(c04Var, "lazyDeviceId");
        zq3.h(c04Var2, "lazyAppVersionName");
        this.coreBaseUrl = str;
        this.configBaseUrl = str2;
        this.appId = str3;
        this.lazyDeviceId = c04Var;
        this.lazyAppVersionName = c04Var2;
    }

    private final String getConfigBaseUrl() {
        return this.configBaseUrl + "/v2/config";
    }

    private final String getOperatingSystemCode() {
        return String.valueOf(Build.VERSION.SDK_INT) + ".0.0";
    }

    @Override // io.embrace.android.embracesdk.comms.api.ApiUrlBuilder
    public String getConfigUrl() {
        return getConfigBaseUrl() + "?appId=" + this.appId + "&osVersion=" + getOperatingSystemCode() + "&appVersion=" + ((String) this.lazyAppVersionName.getValue()) + "&deviceId=" + ((String) this.lazyDeviceId.getValue());
    }

    @Override // io.embrace.android.embracesdk.comms.api.ApiUrlBuilder
    public String getEmbraceUrlWithSuffix(String str, String str2) {
        zq3.h(str, "apiVersion");
        zq3.h(str2, "suffix");
        if (zq3.c(str, "v1")) {
            str2 = "log/" + str2;
        }
        return this.coreBaseUrl + '/' + str + '/' + str2;
    }
}
