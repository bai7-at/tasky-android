package com.appsflyer.internal;

import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import com.appsflyer.AppsFlyerProperties;
import com.appsflyer.CreateOneLinkHttpTask;
import com.appsflyer.attribution.AppsFlyerRequestListener;
import com.appsflyer.internal.components.network.http.ResponseNetwork;
import com.appsflyer.internal.components.network.http.exceptions.ParsingException;
import com.appsflyer.share.LinkGenerator;
import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

/* loaded from: classes2.dex */
public final class AFc1fSDK extends AFc1hSDK<String> {
    private final Map<String, String> AFLogger$LogLevel;

    @Nullable
    private final CreateOneLinkHttpTask.ResponseListener AFVersionDeclaration;
    private final AFb1dSDK afRDLog;

    @Nullable
    private final String afWarnLog;
    private final String getLevel;
    private final UUID init;

    public AFc1fSDK(@NonNull AFc1xSDK aFc1xSDK, @NonNull UUID uuid, @NonNull String str, @NonNull Map<String, String> map, @Nullable String str2, @Nullable CreateOneLinkHttpTask.ResponseListener responseListener) {
        super(AFc1jSDK.ONELINK, new AFc1jSDK[]{AFc1jSDK.RC_CDN}, aFc1xSDK, uuid.toString());
        this.afRDLog = aFc1xSDK.values();
        this.init = uuid;
        this.getLevel = str;
        this.AFLogger$LogLevel = new HashMap(map);
        this.AFVersionDeclaration = responseListener;
        this.afWarnLog = str2;
    }

    private String init() {
        String string = AppsFlyerProperties.getInstance().getString(AppsFlyerProperties.ONELINK_DOMAIN);
        String packageName = this.afRDLog.AFInAppEventType.AFKeystoreWrapper.getPackageName();
        LinkGenerator addParameters = new LinkGenerator("af_app_invites").setBaseURL(this.getLevel, string, packageName).addParameter("af_siteid", packageName).addParameters(this.AFLogger$LogLevel);
        AFa1aSDK.values();
        String AFInAppEventType = AFa1aSDK.AFInAppEventType();
        if (AFInAppEventType != null) {
            addParameters.setReferrerCustomerId(AFInAppEventType);
        }
        return addParameters.generateLink();
    }

    @Override // com.appsflyer.internal.AFc1hSDK
    protected final AFb1bSDK<String> AFInAppEventParameterName(@NonNull String str) {
        return ((AFc1hSDK) this).afDebugLog.valueOf(this.getLevel, this.AFLogger$LogLevel, this.afWarnLog, this.init, str);
    }

    @Override // com.appsflyer.internal.AFc1hSDK, com.appsflyer.internal.AFc1nSDK
    public final long AFKeystoreWrapper() {
        return 3000L;
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

    @Override // com.appsflyer.internal.AFc1hSDK
    protected final boolean getLevel() {
        return false;
    }

    @Override // com.appsflyer.internal.AFc1hSDK, com.appsflyer.internal.AFc1nSDK
    public final void values() {
        ResponseNetwork responseNetwork;
        super.values();
        CreateOneLinkHttpTask.ResponseListener responseListener = this.AFVersionDeclaration;
        if (responseListener != null) {
            if (this.AFInAppEventType == AFc1rSDK.SUCCESS && (responseNetwork = this.afInfoLog) != null) {
                responseListener.onResponse((String) responseNetwork.getBody());
                return;
            }
            Throwable afDebugLog = afDebugLog();
            if (!(afDebugLog instanceof ParsingException)) {
                responseListener.onResponse(init());
            } else if (((ParsingException) afDebugLog).getRawResponse().isSuccessful()) {
                responseListener.onResponseError("Can't parse one link data");
            } else {
                responseListener.onResponse(init());
            }
        }
    }
}
