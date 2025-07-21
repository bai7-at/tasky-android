package com.appsflyer.share;

import android.content.Context;
import com.appsflyer.AFInAppEventParameterName;
import com.appsflyer.AFLogger;
import com.appsflyer.AppsFlyerLib;
import com.appsflyer.AppsFlyerProperties;
import com.appsflyer.CreateOneLinkHttpTask;
import com.appsflyer.internal.AFa1aSDK;
import com.appsflyer.internal.AFb1vSDK;
import com.appsflyer.internal.AFc1fSDK;
import com.appsflyer.internal.AFc1lSDK;
import com.appsflyer.internal.AFc1lSDK.AnonymousClass4;
import com.appsflyer.internal.AFc1xSDK;
import com.appsflyer.internal.AFe1hSDK;
import com.chartbeat.androidsdk.QueryKeys;
import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

/* loaded from: classes2.dex */
public class LinkGenerator {
    String AFInAppEventParameterName;
    String AFInAppEventType;
    private String AFKeystoreWrapper;
    private String AFLogger;
    private String AFLogger$LogLevel;
    private String afDebugLog;
    private String afErrorLog;
    private String afInfoLog;
    private String afRDLog;
    private String afWarnLog;
    private final Map<String, String> init = new HashMap();
    private final String valueOf;
    private String values;

    public LinkGenerator(String str) {
        this.valueOf = str;
    }

    private Map<String, String> AFInAppEventParameterName() {
        HashMap hashMap = new HashMap();
        hashMap.put("pid", this.valueOf);
        String str = this.AFLogger;
        if (str != null) {
            hashMap.put("af_referrer_uid", str);
        }
        String str2 = this.values;
        if (str2 != null) {
            hashMap.put(AFInAppEventParameterName.AF_CHANNEL, str2);
        }
        String str3 = this.afInfoLog;
        if (str3 != null) {
            hashMap.put("af_referrer_customer_id", str3);
        }
        String str4 = this.AFKeystoreWrapper;
        if (str4 != null) {
            hashMap.put(QueryKeys.TIME_ON_VIEW_IN_MINUTES, str4);
        }
        String str5 = this.afDebugLog;
        if (str5 != null) {
            hashMap.put("af_referrer_name", str5);
        }
        String str6 = this.afErrorLog;
        if (str6 != null) {
            hashMap.put("af_referrer_image_url", str6);
        }
        if (this.AFLogger$LogLevel != null) {
            StringBuilder sb = new StringBuilder();
            sb.append(this.AFLogger$LogLevel);
            String str7 = this.afRDLog;
            if (str7 != null) {
                this.afRDLog = str7.replaceFirst("^[/]", "");
                sb.append(this.AFLogger$LogLevel.endsWith("/") ? "" : "/");
                sb.append(this.afRDLog);
            }
            hashMap.put("af_dp", sb.toString());
        }
        for (Map.Entry<String, String> entry : this.init.entrySet()) {
            hashMap.put(entry.getKey(), entry.getValue());
        }
        return AFb1vSDK.AFInAppEventParameterName(hashMap);
    }

    public LinkGenerator addParameter(String str, String str2) {
        this.init.put(str, str2);
        return this;
    }

    public LinkGenerator addParameters(Map<String, String> map) {
        if (map != null) {
            this.init.putAll(map);
        }
        return this;
    }

    public String generateLink() {
        StringBuilder sb = new StringBuilder();
        String str = this.AFInAppEventParameterName;
        if (str == null || !str.startsWith("http")) {
            sb.append(String.format(AFe1hSDK.AFInAppEventParameterName, AppsFlyerLib.getInstance().getHostPrefix(), AFa1aSDK.values().getHostName()));
        } else {
            sb.append(this.AFInAppEventParameterName);
        }
        if (this.AFInAppEventType != null) {
            sb.append('/');
            sb.append(this.AFInAppEventType);
        }
        sb.append(AFInAppEventParameterName(AFInAppEventParameterName()));
        return sb.toString();
    }

    public String getBrandDomain() {
        return this.afWarnLog;
    }

    public String getCampaign() {
        return this.AFKeystoreWrapper;
    }

    public String getChannel() {
        return this.values;
    }

    public String getMediaSource() {
        return this.valueOf;
    }

    public Map<String, String> getUserParams() {
        return new HashMap(this.init);
    }

    public LinkGenerator setBaseDeeplink(String str) {
        this.AFLogger$LogLevel = str;
        return this;
    }

    public LinkGenerator setBaseURL(String str, String str2, String str3) {
        if (str == null || str.length() <= 0) {
            this.AFInAppEventParameterName = String.format("https://%s/%s", String.format("%sapp.%s", AppsFlyerLib.getInstance().getHostPrefix(), AFa1aSDK.values().getHostName()), str3);
        } else {
            if (str2 == null || str2.length() < 5) {
                str2 = "go.onelink.me";
            }
            this.AFInAppEventParameterName = String.format("https://%s/%s", str2, str);
        }
        return this;
    }

    public LinkGenerator setBrandDomain(String str) {
        this.afWarnLog = str;
        return this;
    }

    public LinkGenerator setCampaign(String str) {
        this.AFKeystoreWrapper = str;
        return this;
    }

    public LinkGenerator setChannel(String str) {
        this.values = str;
        return this;
    }

    public LinkGenerator setDeeplinkPath(String str) {
        this.afRDLog = str;
        return this;
    }

    public LinkGenerator setReferrerCustomerId(String str) {
        this.afInfoLog = str;
        return this;
    }

    public LinkGenerator setReferrerImageURL(String str) {
        this.afErrorLog = str;
        return this;
    }

    public LinkGenerator setReferrerName(String str) {
        this.afDebugLog = str;
        return this;
    }

    public LinkGenerator setReferrerUID(String str) {
        this.AFLogger = str;
        return this;
    }

    public void generateLink(Context context, CreateOneLinkHttpTask.ResponseListener responseListener) {
        String string = AppsFlyerProperties.getInstance().getString(AppsFlyerProperties.ONELINK_ID);
        String str = this.afWarnLog;
        Map<String, String> AFInAppEventParameterName = AFInAppEventParameterName();
        if (AppsFlyerProperties.getInstance().getBoolean(AppsFlyerProperties.AF_WAITFOR_CUSTOMERID, false)) {
            AFLogger.afInfoLog("CustomerUserId not set, generate User Invite Link is disabled", true);
            return;
        }
        AFa1aSDK.values().AFInAppEventParameterName(context);
        AFc1xSDK AFInAppEventParameterName2 = AFa1aSDK.values().AFInAppEventParameterName();
        AFc1fSDK aFc1fSDK = new AFc1fSDK(AFInAppEventParameterName2, UUID.randomUUID(), string, AFInAppEventParameterName, str, responseListener);
        AFc1lSDK afRDLog = AFInAppEventParameterName2.afRDLog();
        afRDLog.AFKeystoreWrapper.execute(afRDLog.new AnonymousClass4(aFc1fSDK));
    }

    private static String AFInAppEventParameterName(Map<String, String> map) {
        StringBuilder sb = new StringBuilder();
        for (Map.Entry<String, String> entry : map.entrySet()) {
            if (sb.length() == 0) {
                sb.append('?');
            } else {
                sb.append('&');
            }
            sb.append(entry.getKey());
            sb.append('=');
            sb.append(entry.getValue());
        }
        return sb.toString();
    }
}
