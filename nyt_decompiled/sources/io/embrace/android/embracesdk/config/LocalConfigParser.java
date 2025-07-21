package io.embrace.android.embracesdk.config;

import android.util.Base64;
import defpackage.yj0;
import defpackage.zq3;
import io.embrace.android.embracesdk.config.local.LocalConfig;
import io.embrace.android.embracesdk.config.local.SdkLocalConfig;
import io.embrace.android.embracesdk.internal.AndroidResourcesService;
import io.embrace.android.embracesdk.internal.ApkToolsConfig;
import io.embrace.android.embracesdk.internal.serialization.EmbraceSerializer;
import io.embrace.android.embracesdk.logging.InternalEmbraceLogger;

/* loaded from: classes5.dex */
public final class LocalConfigParser {
    public static final String BUILD_INFO_APP_ID = "emb_app_id";
    public static final String BUILD_INFO_NDK_ENABLED = "emb_ndk_enabled";
    private static final String BUILD_INFO_SDK_CONFIG = "emb_sdk_config";
    public static final LocalConfigParser INSTANCE = new LocalConfigParser();
    public static final boolean NDK_ENABLED_DEFAULT = false;

    private LocalConfigParser() {
    }

    public static final LocalConfig fromResources(AndroidResourcesService androidResourcesService, String str, String str2, EmbraceSerializer embraceSerializer, InternalEmbraceLogger internalEmbraceLogger) {
        String str3;
        zq3.h(androidResourcesService, "resources");
        zq3.h(str, "packageName");
        zq3.h(embraceSerializer, "serializer");
        zq3.h(internalEmbraceLogger, "logger");
        if (str2 == null) {
            try {
                str2 = androidResourcesService.getString(androidResourcesService.getIdentifier(BUILD_INFO_APP_ID, "string", str));
            } catch (Exception e) {
                throw new IllegalStateException("Failed to load local config from resources.", e);
            }
        }
        String str4 = str2;
        int identifier = androidResourcesService.getIdentifier(BUILD_INFO_NDK_ENABLED, "string", str);
        boolean z = (identifier != 0 ? Boolean.parseBoolean(androidResourcesService.getString(identifier)) : false) && !ApkToolsConfig.IS_NDK_DISABLED;
        int identifier2 = androidResourcesService.getIdentifier(BUILD_INFO_SDK_CONFIG, "string", str);
        if (identifier2 != 0) {
            byte[] decode = Base64.decode(androidResourcesService.getString(identifier2), 0);
            zq3.g(decode, "Base64.decode(encodedConfig, Base64.DEFAULT)");
            str3 = new String(decode, yj0.b);
        } else {
            str3 = null;
        }
        return INSTANCE.buildConfig(str4, z, str3, embraceSerializer, internalEmbraceLogger);
    }

    public final LocalConfig buildConfig(String str, boolean z, String str2, EmbraceSerializer embraceSerializer, InternalEmbraceLogger internalEmbraceLogger) {
        zq3.h(embraceSerializer, "serializer");
        zq3.h(internalEmbraceLogger, "logger");
        if (str == null || str.length() == 0) {
            throw new IllegalArgumentException("Embrace AppId cannot be null or empty.");
        }
        SdkLocalConfig sdkLocalConfig = null;
        internalEmbraceLogger.log("Native crash capture is " + (z ? "enabled" : "disabled"), InternalEmbraceLogger.Severity.INFO, null, true);
        if (str2 != null && str2.length() != 0) {
            try {
                sdkLocalConfig = (SdkLocalConfig) embraceSerializer.fromJson(str2, SdkLocalConfig.class);
            } catch (Exception e) {
                internalEmbraceLogger.log("Failed to parse Embrace config from config json file.", InternalEmbraceLogger.Severity.ERROR, e, false);
            }
        }
        if (sdkLocalConfig == null) {
            sdkLocalConfig = new SdkLocalConfig(null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, 262143, null);
        }
        return new LocalConfig(str, z, sdkLocalConfig);
    }
}
