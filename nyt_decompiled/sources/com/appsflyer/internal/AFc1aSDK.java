package com.appsflyer.internal;

import android.support.annotation.NonNull;
import com.appsflyer.AFLogger;
import com.appsflyer.internal.AFc1lSDK.AnonymousClass4;

/* loaded from: classes2.dex */
public final class AFc1aSDK extends AFc1nSDK<Boolean> {
    private static volatile boolean AFLogger;
    private final AFc1lSDK afDebugLog;
    private final AFc1xSDK afErrorLog;
    private final AFa1pSDK afInfoLog;

    public AFc1aSDK(@NonNull AFc1xSDK aFc1xSDK) {
        super(AFc1jSDK.LOAD_CACHE, new AFc1jSDK[0], "LoadCachedRequests");
        this.afInfoLog = aFc1xSDK.getLevel();
        this.afDebugLog = aFc1xSDK.afRDLog();
        this.afErrorLog = aFc1xSDK;
    }

    public static boolean afInfoLog() {
        return AFLogger;
    }

    @Override // com.appsflyer.internal.AFc1nSDK
    @NonNull
    public final AFc1rSDK AFInAppEventParameterName() throws Exception {
        for (AFa1fSDK aFa1fSDK : this.afInfoLog.AFKeystoreWrapper()) {
            StringBuilder sb = new StringBuilder("CACHE: resending request: ");
            sb.append(aFa1fSDK.valueOf);
            AFLogger.afInfoLog(sb.toString());
            try {
                long currentTimeMillis = System.currentTimeMillis();
                long parseLong = Long.parseLong(aFa1fSDK.AFKeystoreWrapper, 10);
                StringBuilder sb2 = new StringBuilder();
                sb2.append(aFa1fSDK.valueOf);
                sb2.append("&isCachedRequest=true&timeincache=");
                sb2.append((currentTimeMillis - parseLong) / 1000);
                AFe1wSDK aFe1wSDK = new AFe1wSDK(sb2.toString(), aFa1fSDK.AFInAppEventType(), aFa1fSDK.AFKeystoreWrapper, aFa1fSDK.values);
                AFc1lSDK aFc1lSDK = this.afDebugLog;
                aFc1lSDK.AFKeystoreWrapper.execute(aFc1lSDK.new AnonymousClass4(new AFd1wSDK(aFe1wSDK, this.afErrorLog)));
            } catch (Exception e) {
                AFLogger.afErrorLog("QUEUE: Failed to resend cached request", e);
            }
        }
        AFLogger = true;
        return AFc1rSDK.SUCCESS;
    }

    @Override // com.appsflyer.internal.AFc1nSDK
    public final boolean AFInAppEventType() {
        return false;
    }

    @Override // com.appsflyer.internal.AFc1nSDK
    public final long AFKeystoreWrapper() {
        return 30000L;
    }
}
