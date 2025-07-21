package com.appsflyer.internal;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import com.amazonaws.http.HttpHeader;
import com.appsflyer.AFLogger;
import com.appsflyer.attribution.AppsFlyerRequestListener;

/* loaded from: classes2.dex */
public final class AFc1eSDK extends AFc1hSDK<String> {

    @NonNull
    private final String afRDLog;

    @Nullable
    private final AFb1nSDK getLevel;

    public AFc1eSDK(@NonNull AFc1xSDK aFc1xSDK, @NonNull String str, @Nullable AFb1nSDK aFb1nSDK) {
        super(AFc1jSDK.IMPRESSIONS, new AFc1jSDK[]{AFc1jSDK.RC_CDN}, aFc1xSDK, str);
        this.afRDLog = str;
        this.getLevel = aFb1nSDK;
    }

    @Override // com.appsflyer.internal.AFc1hSDK
    protected final AFb1bSDK<String> AFInAppEventParameterName(@NonNull String str) {
        return ((AFc1hSDK) this).afDebugLog.AFInAppEventType(this.afRDLog);
    }

    @Override // com.appsflyer.internal.AFc1hSDK
    @Nullable
    protected final AppsFlyerRequestListener afErrorLog() {
        return null;
    }

    @Override // com.appsflyer.internal.AFc1hSDK
    protected final boolean afInfoLog() {
        return false;
    }

    @Override // com.appsflyer.internal.AFc1hSDK, com.appsflyer.internal.AFc1nSDK
    public final void values() {
        super.values();
        AFc1oSDK<Result> aFc1oSDK = this.afInfoLog;
        if (aFc1oSDK != 0) {
            int statusCode = aFc1oSDK.getStatusCode();
            if (statusCode == 200) {
                StringBuilder sb = new StringBuilder("Cross promotion impressions success: ");
                sb.append(this.afRDLog);
                AFLogger.afInfoLog(sb.toString(), false);
                return;
            }
            if (statusCode != 301 && statusCode != 302) {
                StringBuilder sb2 = new StringBuilder("call to ");
                sb2.append(this.afRDLog);
                sb2.append(" failed: ");
                sb2.append(statusCode);
                AFLogger.afInfoLog(sb2.toString());
                return;
            }
            StringBuilder sb3 = new StringBuilder("Cross promotion redirection success: ");
            sb3.append(this.afRDLog);
            AFLogger.afInfoLog(sb3.toString(), false);
            String AFInAppEventType = aFc1oSDK.AFInAppEventType(HttpHeader.LOCATION);
            AFb1nSDK aFb1nSDK = this.getLevel;
            if (aFb1nSDK == null || AFInAppEventType == null) {
                return;
            }
            aFb1nSDK.valueOf = AFInAppEventType;
            Context context = aFb1nSDK.AFKeystoreWrapper.get();
            if (context != null) {
                try {
                    if (aFb1nSDK.valueOf != null) {
                        context.startActivity(new Intent("android.intent.action.VIEW", Uri.parse(aFb1nSDK.valueOf)).setFlags(268435456));
                    }
                } catch (Exception e) {
                    AFLogger.afErrorLog("Failed to open cross promotion url, does OS have browser installed?".concat(String.valueOf(e)), e);
                }
            }
        }
    }
}
