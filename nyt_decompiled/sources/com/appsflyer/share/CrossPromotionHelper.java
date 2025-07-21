package com.appsflyer.share;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import com.appsflyer.AFLogger;
import com.appsflyer.AppsFlyerLib;
import com.appsflyer.AppsFlyerProperties;
import com.appsflyer.internal.AFa1aSDK;
import com.appsflyer.internal.AFb1nSDK;
import com.appsflyer.internal.AFc1eSDK;
import com.appsflyer.internal.AFc1lSDK;
import com.appsflyer.internal.AFc1lSDK.AnonymousClass4;
import com.appsflyer.internal.AFc1xSDK;
import com.appsflyer.internal.AFe1hSDK;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes2.dex */
public class CrossPromotionHelper {
    private static String AFInAppEventType = "https://%simpression.%s";

    @NonNull
    private static LinkGenerator AFInAppEventParameterName(@NonNull Context context, String str, String str2, Map<String, String> map, String str3) {
        LinkGenerator linkGenerator = new LinkGenerator("af_cross_promotion");
        linkGenerator.AFInAppEventParameterName = str3;
        linkGenerator.AFInAppEventType = str;
        linkGenerator.addParameter("af_siteid", context.getPackageName());
        if (str2 != null) {
            linkGenerator.setCampaign(str2);
        }
        if (map != null) {
            linkGenerator.addParameters(map);
        }
        String string = AppsFlyerProperties.getInstance().getString("advertiserId");
        if (string != null) {
            linkGenerator.addParameter("advertising_id", string);
        }
        return linkGenerator;
    }

    private static void AFInAppEventType(@NonNull String str, @NonNull Context context, @Nullable AFb1nSDK aFb1nSDK) {
        AFa1aSDK values = AFa1aSDK.values();
        values.AFInAppEventParameterName(context);
        AFc1xSDK AFInAppEventParameterName = values.AFInAppEventParameterName();
        AFc1eSDK aFc1eSDK = new AFc1eSDK(AFInAppEventParameterName, str, aFb1nSDK);
        AFc1lSDK afRDLog = AFInAppEventParameterName.afRDLog();
        afRDLog.AFKeystoreWrapper.execute(afRDLog.new AnonymousClass4(aFc1eSDK));
    }

    public static void logAndOpenStore(@NonNull Context context, String str, String str2) {
        logAndOpenStore(context, str, str2, null);
    }

    public static void logCrossPromoteImpression(@NonNull Context context, String str, String str2) {
        logCrossPromoteImpression(context, str, str2, null);
    }

    public static void setUrl(Map<String, String> map) {
        char c;
        for (Map.Entry<String, String> entry : map.entrySet()) {
            String value = entry.getValue();
            String key = entry.getKey();
            int hashCode = key.hashCode();
            if (hashCode != 96801) {
                if (hashCode == 120623625 && key.equals("impression")) {
                    c = 1;
                }
                c = 65535;
            } else {
                if (key.equals("app")) {
                    c = 0;
                }
                c = 65535;
            }
            if (c == 0) {
                AFe1hSDK.AFInAppEventParameterName = value;
            } else if (c == 1) {
                AFInAppEventType = value;
            }
        }
    }

    public static void logAndOpenStore(@NonNull Context context, String str, String str2, Map<String, String> map) {
        LinkGenerator AFInAppEventParameterName = AFInAppEventParameterName(context, str, str2, map, String.format(AFe1hSDK.AFInAppEventParameterName, AppsFlyerLib.getInstance().getHostPrefix(), AFa1aSDK.values().getHostName()));
        if (AppsFlyerProperties.getInstance().getBoolean(AppsFlyerProperties.AF_WAITFOR_CUSTOMERID, false)) {
            AFLogger.afInfoLog("CustomerUserId not set, track And Open Store is disabled", true);
            return;
        }
        if (AppsFlyerLib.getInstance().isStopped()) {
            AFLogger.afInfoLog("SDK is stopped, track And Open Store is disabled", true);
            return;
        }
        if (map == null) {
            map = new HashMap<>();
        }
        map.put("af_campaign", str2);
        AppsFlyerLib.getInstance().logEvent(context, "af_cross_promotion", map);
        AFInAppEventType(AFInAppEventParameterName.generateLink(), context, new AFb1nSDK(context));
    }

    public static void logCrossPromoteImpression(@NonNull Context context, String str, String str2, Map<String, String> map) {
        if (AppsFlyerProperties.getInstance().getBoolean(AppsFlyerProperties.AF_WAITFOR_CUSTOMERID, false)) {
            AFLogger.afInfoLog("CustomerUserId not set, Promote Impression is disabled", true);
        } else if (AppsFlyerLib.getInstance().isStopped()) {
            AFLogger.afInfoLog("SDK is stopped, Promote Impression is disabled", true);
        } else {
            AFInAppEventType(AFInAppEventParameterName(context, str, str2, map, String.format(AFInAppEventType, AppsFlyerLib.getInstance().getHostPrefix(), AFa1aSDK.values().getHostName())).generateLink(), context, null);
        }
    }
}
