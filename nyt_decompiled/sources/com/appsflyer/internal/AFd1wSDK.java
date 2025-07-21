package com.appsflyer.internal;

import android.support.annotation.Nullable;
import android.util.Base64;
import com.appsflyer.AFLogger;
import com.appsflyer.attribution.AppsFlyerRequestListener;
import java.net.MalformedURLException;
import java.net.URL;

/* loaded from: classes2.dex */
public final class AFd1wSDK extends AFc1hSDK<String> {
    private final AFe1wSDK afRDLog;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public AFd1wSDK(@android.support.annotation.NonNull com.appsflyer.internal.AFe1wSDK r8, @android.support.annotation.NonNull com.appsflyer.internal.AFc1xSDK r9) {
        /*
            r7 = this;
            com.appsflyer.internal.AFc1jSDK r0 = r8.AFLogger$LogLevel
            if (r0 == 0) goto L6
        L4:
            r2 = r0
            goto L9
        L6:
            com.appsflyer.internal.AFc1jSDK r0 = com.appsflyer.internal.AFc1jSDK.CACHED_EVENT
            goto L4
        L9:
            com.appsflyer.internal.AFc1jSDK r0 = com.appsflyer.internal.AFc1jSDK.RC_CDN
            com.appsflyer.internal.AFc1jSDK[] r3 = new com.appsflyer.internal.AFc1jSDK[]{r0}
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = r8.AFLogger
            r0.append(r1)
            java.lang.String r1 = "-"
            r0.append(r1)
            java.lang.String r1 = values(r8)
            r0.append(r1)
            java.lang.String r5 = r0.toString()
            java.lang.String r6 = r8.AFLogger
            r1 = r7
            r4 = r9
            r1.<init>(r2, r3, r4, r5, r6)
            r7.afRDLog = r8
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.appsflyer.internal.AFd1wSDK.<init>(com.appsflyer.internal.AFe1wSDK, com.appsflyer.internal.AFc1xSDK):void");
    }

    private static String values(AFe1wSDK aFe1wSDK) {
        try {
            return new URL(aFe1wSDK.afErrorLog).getHost();
        } catch (MalformedURLException unused) {
            return "";
        }
    }

    @Override // com.appsflyer.internal.AFc1hSDK
    protected final AFb1bSDK<String> AFInAppEventParameterName(String str) {
        String encodeToString = Base64.encodeToString(this.afRDLog.values(), 2);
        AFLogger.afInfoLog("cached data: ".concat(String.valueOf(encodeToString)));
        ((AFc1hSDK) this).afErrorLog.values(this.afRDLog.afErrorLog, encodeToString);
        return ((AFc1hSDK) this).afDebugLog.AFInAppEventParameterName(this.afRDLog);
    }

    @Override // com.appsflyer.internal.AFc1hSDK
    @Nullable
    protected final AppsFlyerRequestListener afErrorLog() {
        return this.afRDLog.valueOf;
    }

    @Override // com.appsflyer.internal.AFc1hSDK
    protected final boolean afInfoLog() {
        return false;
    }
}
