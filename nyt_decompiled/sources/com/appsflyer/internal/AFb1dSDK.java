package com.appsflyer.internal;

import android.content.pm.PackageItemInfo;
import android.os.Bundle;
import android.support.annotation.Nullable;
import com.appsflyer.AFLogger;
import com.appsflyer.AppsFlyerProperties;

/* loaded from: classes2.dex */
public final class AFb1dSDK {
    private static String AFKeystoreWrapper = "207";
    private Bundle AFInAppEventParameterName = null;
    public final AFb1fSDK AFInAppEventType;
    public final AFd1pSDK valueOf;

    public AFb1dSDK(AFb1fSDK aFb1fSDK, AFd1pSDK aFd1pSDK) {
        this.AFInAppEventType = aFb1fSDK;
        this.valueOf = aFd1pSDK;
    }

    @Nullable
    public static String AFInAppEventType() {
        StringBuilder sb = new StringBuilder("version: 6.8.2 (build ");
        sb.append(AFKeystoreWrapper);
        sb.append(")");
        return sb.toString();
    }

    public static String valueOf() {
        return AppsFlyerProperties.getInstance().getString(AppsFlyerProperties.APP_USER_ID);
    }

    @Nullable
    public final String AFKeystoreWrapper(String str) {
        Object obj;
        try {
            if (this.AFInAppEventParameterName == null) {
                this.AFInAppEventParameterName = ((PackageItemInfo) this.AFInAppEventType.AFKeystoreWrapper.getPackageManager().getApplicationInfo(this.AFInAppEventType.AFKeystoreWrapper.getPackageName(), 128)).metaData;
            }
            Bundle bundle = this.AFInAppEventParameterName;
            if (bundle == null || (obj = bundle.get(str)) == null) {
                return null;
            }
            return obj.toString();
        } catch (Throwable th) {
            StringBuilder sb = new StringBuilder("Could not load manifest metadata!");
            sb.append(th.getMessage());
            AFLogger.afErrorLog(sb.toString(), th);
            return null;
        }
    }

    public final String values() {
        String string = AppsFlyerProperties.getInstance().getString(AppsFlyerProperties.CHANNEL);
        if (string == null) {
            string = AFKeystoreWrapper("CHANNEL");
        }
        if (string == null || !string.equals("")) {
            return string;
        }
        return null;
    }
}
