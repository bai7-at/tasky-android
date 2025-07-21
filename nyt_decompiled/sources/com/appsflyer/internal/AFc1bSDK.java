package com.appsflyer.internal;

import android.net.Uri;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.text.TextUtils;
import com.appsflyer.AFLogger;
import com.appsflyer.attribution.AppsFlyerRequestListener;
import com.appsflyer.internal.components.network.http.ResponseNetwork;
import com.appsflyer.internal.components.network.http.exceptions.ParsingException;
import java.util.Arrays;
import java.util.Map;
import java.util.UUID;

/* loaded from: classes2.dex */
public final class AFc1bSDK extends AFc1hSDK<Map<String, String>> {
    private final boolean AFLogger$LogLevel;
    private String AFVersionDeclaration;

    @Nullable
    public AFa1vSDK afRDLog;
    private String afWarnLog;
    private final AFc1ySDK getLevel;
    private String init;
    private final UUID onAttributionFailureNative;

    public interface AFa1vSDK {
        void AFKeystoreWrapper(String str);

        void values(Map<String, String> map);
    }

    public AFc1bSDK(@NonNull AFc1xSDK aFc1xSDK, @NonNull UUID uuid, @NonNull Uri uri) {
        super(AFc1jSDK.ONELINK, new AFc1jSDK[]{AFc1jSDK.RC_CDN}, aFc1xSDK, uuid.toString());
        this.getLevel = aFc1xSDK.AFKeystoreWrapper();
        this.onAttributionFailureNative = uuid;
        boolean z = false;
        int i = 0;
        z = false;
        z = false;
        if (!TextUtils.isEmpty(uri.getHost()) && !TextUtils.isEmpty(uri.getPath())) {
            String[] strArr = {"onelink.me", "onelnk.com", "app.aflink.com"};
            int i2 = 0;
            boolean z2 = false;
            while (i2 < 3) {
                if (uri.getHost().contains(strArr[i2])) {
                    z2 = true;
                }
                i2++;
                z2 = z2;
            }
            boolean z3 = z2;
            if (AFa1tSDK.AFInAppEventType != null) {
                StringBuilder sb = new StringBuilder("Validate if link ");
                sb.append(uri);
                sb.append(" belongs to custom domains: ");
                sb.append(Arrays.asList(AFa1tSDK.AFInAppEventType));
                AFLogger.afRDLog(sb.toString());
                String[] strArr2 = AFa1tSDK.AFInAppEventType;
                int length = strArr2.length;
                boolean z4 = z2 ? 1 : 0;
                boolean z5 = false;
                while (i < length) {
                    String str = strArr2[i];
                    if (uri.getHost().contains(str) && !TextUtils.isEmpty(str)) {
                        AFLogger.afDebugLog("Link matches custom domain: ".concat(String.valueOf(str)));
                        z5 = true;
                        z4 = true;
                    }
                    i++;
                    z4 = z4;
                }
                z = z5;
                z3 = z4 ? 1 : 0;
            }
            String[] split = uri.getPath().split("/");
            if (z3 && split.length == 3) {
                this.AFVersionDeclaration = split[1];
                this.afWarnLog = split[2];
                this.init = uri.toString();
            }
        }
        this.AFLogger$LogLevel = z;
    }

    @Override // com.appsflyer.internal.AFc1hSDK
    protected final AFb1bSDK<Map<String, String>> AFInAppEventParameterName(@NonNull String str) {
        return this.getLevel.valueOf(this.AFVersionDeclaration, this.afWarnLog, this.onAttributionFailureNative, str);
    }

    @Override // com.appsflyer.internal.AFc1hSDK, com.appsflyer.internal.AFc1nSDK
    public final long AFKeystoreWrapper() {
        return 3000L;
    }

    public final boolean AFVersionDeclaration() {
        return (TextUtils.isEmpty(this.AFVersionDeclaration) || TextUtils.isEmpty(this.afWarnLog) || this.AFVersionDeclaration.equals("app")) ? false : true;
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

    public final boolean init() {
        return this.AFLogger$LogLevel;
    }

    @Override // com.appsflyer.internal.AFc1hSDK, com.appsflyer.internal.AFc1nSDK
    public final void values() {
        ResponseNetwork responseNetwork;
        super.values();
        AFa1vSDK aFa1vSDK = this.afRDLog;
        if (aFa1vSDK != null) {
            if (this.AFInAppEventType == AFc1rSDK.SUCCESS && (responseNetwork = this.afInfoLog) != null) {
                aFa1vSDK.values((Map) responseNetwork.getBody());
                return;
            }
            Throwable afDebugLog = afDebugLog();
            if (!(afDebugLog instanceof ParsingException)) {
                String str = this.init;
                aFa1vSDK.AFKeystoreWrapper(str != null ? str : "Can't get OneLink data");
            } else if (((ParsingException) afDebugLog).getRawResponse().isSuccessful()) {
                aFa1vSDK.AFKeystoreWrapper("Can't parse one link data");
            } else {
                String str2 = this.init;
                aFa1vSDK.AFKeystoreWrapper(str2 != null ? str2 : "Can't get OneLink data");
            }
        }
    }
}
