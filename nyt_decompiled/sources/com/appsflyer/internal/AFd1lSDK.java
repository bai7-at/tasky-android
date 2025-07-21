package com.appsflyer.internal;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.annotation.VisibleForTesting;
import com.appsflyer.AFLogger;
import com.appsflyer.AppsFlyerLib;
import com.appsflyer.AppsFlyerProperties;
import com.appsflyer.FirebaseMessagingServiceListener;
import com.appsflyer.internal.AFc1lSDK.AnonymousClass4;
import com.google.firebase.messaging.FirebaseMessagingService;

/* loaded from: classes2.dex */
public final class AFd1lSDK {

    @VisibleForTesting
    public static String AFKeystoreWrapper;
    public final AFd1pSDK AFInAppEventType;

    static {
        StringBuilder sb = new StringBuilder("https://%sregister.%s/api/v");
        sb.append(AFa1aSDK.values);
        AFKeystoreWrapper = sb.toString();
    }

    public AFd1lSDK(@NonNull Context context) {
        this.AFInAppEventType = AFa1aSDK.values().valueOf(context);
    }

    public static void AFInAppEventType(String str) {
        AFc1xSDK AFInAppEventParameterName = AFa1aSDK.values().AFInAppEventParameterName();
        AFd1vSDK aFd1vSDK = new AFd1vSDK(str, AFInAppEventParameterName);
        AFc1lSDK afRDLog = AFInAppEventParameterName.afRDLog();
        afRDLog.AFKeystoreWrapper.execute(afRDLog.new AnonymousClass4(aFd1vSDK));
    }

    public static boolean valueOf(Context context) {
        if (AppsFlyerLib.getInstance().isStopped()) {
            return false;
        }
        try {
            String str = FirebaseMessagingService.ACTION_DIRECT_BOOT_REMOTE_INTENT;
        } catch (ClassNotFoundException unused) {
        } catch (Throwable th) {
            AFLogger.afErrorLog("An error occurred while trying to verify manifest declarations: ", th);
        }
        return AFb1wSDK.AFInAppEventParameterName(context, new Intent("com.google.firebase.MESSAGING_EVENT", null, context, FirebaseMessagingServiceListener.class));
    }

    @Nullable
    public final AFb1tSDK AFInAppEventParameterName() {
        String string;
        String string2;
        String valueOf = this.AFInAppEventType.valueOf("afUninstallToken", null);
        long AFInAppEventParameterName = this.AFInAppEventType.AFInAppEventParameterName("afUninstallToken_received_time");
        boolean valueOf2 = this.AFInAppEventType.valueOf("afUninstallToken_queued");
        this.AFInAppEventType.AFInAppEventParameterName("afUninstallToken_queued", false);
        if (valueOf == null && (string2 = AppsFlyerProperties.getInstance().getString("afUninstallToken")) != null) {
            valueOf = string2.split(",")[r0.length - 1];
        }
        if (AFInAppEventParameterName == 0 && (string = AppsFlyerProperties.getInstance().getString("afUninstallToken")) != null) {
            String[] split = string.split(",");
            if (split.length >= 2) {
                try {
                    AFInAppEventParameterName = Long.parseLong(split[split.length - 2]);
                } catch (NumberFormatException unused) {
                }
            }
        }
        if (valueOf != null) {
            return new AFb1tSDK(valueOf, AFInAppEventParameterName, valueOf2);
        }
        return null;
    }

    public static boolean valueOf(@NonNull SharedPreferences sharedPreferences) {
        return sharedPreferences.getBoolean("sentRegisterRequestToAF", false);
    }
}
