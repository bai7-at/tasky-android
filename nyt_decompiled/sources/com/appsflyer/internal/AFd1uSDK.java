package com.appsflyer.internal;

import android.support.annotation.CallSuper;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import com.appsflyer.AFLogger;
import com.appsflyer.attribution.AppsFlyerRequestListener;
import com.appsflyer.internal.AFa1xSDK;
import java.util.Map;
import java.util.Set;

/* loaded from: classes2.dex */
public class AFd1uSDK extends AFc1hSDK<String> {
    private static final AFc1jSDK[] getLevel = {AFc1jSDK.DLSDK, AFc1jSDK.ONELINK, AFc1jSDK.MONITORSDK, AFc1jSDK.REGISTER};
    protected final AFd1pSDK AFLogger$LogLevel;
    public final AFa1qSDK afRDLog;

    public AFd1uSDK(@NonNull AFa1qSDK aFa1qSDK, @NonNull AFc1xSDK aFc1xSDK) {
        this(aFa1qSDK, aFc1xSDK, null);
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x00b1  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x00b7  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x00aa  */
    @Override // com.appsflyer.internal.AFc1hSDK
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    protected final com.appsflyer.internal.AFb1bSDK<java.lang.String> AFInAppEventParameterName(java.lang.String r14) {
        /*
            Method dump skipped, instructions count: 221
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.appsflyer.internal.AFd1uSDK.AFInAppEventParameterName(java.lang.String):com.appsflyer.internal.AFb1bSDK");
    }

    @CallSuper
    protected void AFInAppEventType(AFa1qSDK aFa1qSDK) {
        if (aFa1qSDK.afDebugLog()) {
            aFa1qSDK.AFInAppEventType(new AFa1xSDK.AFa1wSDK(aFa1qSDK.valueOf(), ((AFc1hSDK) this).AFLogger.valueOf.AFKeystoreWrapper));
        }
        if (aFa1qSDK.AFLogger()) {
            aFa1qSDK.AFInAppEventType((Map<String, ?>) ((AFc1hSDK) this).AFLogger.valueOf());
        }
        Set<AFc1jSDK> set = this.valueOf;
        boolean z = set.contains(AFc1jSDK.LAUNCH) || set.contains(AFc1jSDK.CONVERSION);
        if (afRDLog() && z) {
            aFa1qSDK.valueOf(this.AFLogger$LogLevel.values("appsFlyerCount"));
        }
        try {
            if (aFa1qSDK.valueOf().containsKey("appsflyerKey") && aFa1qSDK.afDebugLog()) {
                new AFb1sSDK();
                aFa1qSDK.values("af_v", AFb1sSDK.AFInAppEventType(aFa1qSDK.valueOf()));
                new AFb1sSDK();
                aFa1qSDK.values("af_v2", AFb1sSDK.AFInAppEventParameterName(aFa1qSDK.valueOf()));
            }
        } catch (Throwable th) {
            AFLogger.afErrorLog("QUEUE: failed to update the event, is missing DevKey? Error: ".concat(String.valueOf(th)), th);
        }
    }

    @Override // com.appsflyer.internal.AFc1hSDK
    @Nullable
    protected final AppsFlyerRequestListener afErrorLog() {
        return this.afRDLog.valueOf;
    }

    @Override // com.appsflyer.internal.AFc1hSDK
    protected boolean afInfoLog() {
        return true;
    }

    public AFd1uSDK(@NonNull AFa1qSDK aFa1qSDK, @NonNull AFc1xSDK aFc1xSDK, String str) {
        super(aFa1qSDK.AFInAppEventParameterName(), new AFc1jSDK[]{AFc1jSDK.RC_CDN}, aFc1xSDK, str);
        this.afRDLog = aFa1qSDK;
        this.AFLogger$LogLevel = aFc1xSDK.afErrorLog();
        for (AFc1jSDK aFc1jSDK : getLevel) {
            if (this.AFInAppEventParameterName == aFc1jSDK) {
                return;
            }
        }
        int i = this.afRDLog.afRDLog;
        AFc1jSDK aFc1jSDK2 = this.AFInAppEventParameterName;
        if (i > 0) {
            this.values.add(AFc1jSDK.CONVERSION);
        } else {
            AFc1jSDK aFc1jSDK3 = AFc1jSDK.CONVERSION;
            if (aFc1jSDK2 != aFc1jSDK3) {
                this.valueOf.add(aFc1jSDK3);
            }
        }
    }
}
