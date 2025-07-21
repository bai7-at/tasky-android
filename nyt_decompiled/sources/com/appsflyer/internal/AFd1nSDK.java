package com.appsflyer.internal;

import com.appsflyer.AFLogger;
import java.util.concurrent.TimeUnit;

/* loaded from: classes2.dex */
public final class AFd1nSDK {
    private static final long values = TimeUnit.HOURS.toSeconds(24);
    private final AFd1rSDK AFKeystoreWrapper;
    private final AFb1dSDK valueOf;

    public AFd1nSDK(AFb1dSDK aFb1dSDK, AFd1rSDK aFd1rSDK) {
        this.valueOf = aFb1dSDK;
        this.AFKeystoreWrapper = aFd1rSDK;
    }

    public final boolean AFInAppEventParameterName() {
        return Boolean.parseBoolean(this.valueOf.AFKeystoreWrapper("com.appsflyer.rc.sandbox"));
    }

    public final boolean AFInAppEventType() {
        if (this.AFKeystoreWrapper.values == null) {
            AFLogger.afInfoLog("CFG: active config is missing - fetching from CDN");
            return true;
        }
        long currentTimeMillis = System.currentTimeMillis();
        AFd1rSDK aFd1rSDK = this.AFKeystoreWrapper;
        return currentTimeMillis - aFd1rSDK.AFInAppEventParameterName > TimeUnit.SECONDS.toMillis(aFd1rSDK.valueOf);
    }

    public final long values() {
        String AFKeystoreWrapper = this.valueOf.AFKeystoreWrapper("com.appsflyer.rc.cache.max-age-fallback");
        if (AFKeystoreWrapper == null) {
            return values;
        }
        try {
            return Long.parseLong(AFKeystoreWrapper);
        } catch (NumberFormatException e) {
            StringBuilder sb = new StringBuilder("Can't read maxAgeFallback from Manifest: ");
            sb.append(e.getMessage());
            AFLogger.afErrorLog(sb.toString(), e);
            return values;
        }
    }
}
