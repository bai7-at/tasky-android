package com.appsflyer.internal;

import android.support.annotation.Nullable;
import android.util.Base64;
import com.amazonaws.services.s3.internal.Constants;
import com.appsflyer.AFLogger;
import java.nio.charset.Charset;

/* loaded from: classes2.dex */
public final class AFd1rSDK {
    public static final Charset AFInAppEventType = Charset.forName(Constants.DEFAULT_ENCODING);
    public long AFInAppEventParameterName;
    public final AFd1pSDK AFKeystoreWrapper;
    public long valueOf;
    public AFb1vSDK values = valueOf();

    public AFd1rSDK(AFd1pSDK aFd1pSDK) {
        this.AFKeystoreWrapper = aFd1pSDK;
        this.AFInAppEventParameterName = aFd1pSDK.AFInAppEventParameterName("af_rc_timestamp");
        this.valueOf = aFd1pSDK.AFInAppEventParameterName("af_rc_max_age");
    }

    @Nullable
    private AFb1vSDK valueOf() {
        String valueOf = this.AFKeystoreWrapper.valueOf("af_remote_config", null);
        if (valueOf == null) {
            AFLogger.afDebugLog("CFG: No configuration found in cache");
            return null;
        }
        try {
            return new AFb1vSDK(new String(Base64.decode(valueOf, 2), AFInAppEventType));
        } catch (Exception e) {
            AFLogger.afErrorLog("CFG: Error reading malformed configuration from cache, requires fetching from remote again", e, true);
            return null;
        }
    }
}
