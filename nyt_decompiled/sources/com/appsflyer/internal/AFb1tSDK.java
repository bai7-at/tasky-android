package com.appsflyer.internal;

import android.support.annotation.VisibleForTesting;
import com.appsflyer.AFLogger;

/* loaded from: classes2.dex */
public final class AFb1tSDK {

    @VisibleForTesting
    private static String AFInAppEventParameterName;

    @VisibleForTesting
    private static String AFKeystoreWrapper;
    private final boolean AFInAppEventType;
    final long valueOf;
    final String values;

    public AFb1tSDK() {
    }

    public static void AFInAppEventType(String str) {
        if (AFInAppEventParameterName == null) {
            valueOf(AFa1aSDK.values().AFInAppEventParameterName().AFLogger$LogLevel().AFInAppEventType);
        }
        String str2 = AFInAppEventParameterName;
        if (str2 != null) {
            AFLogger.afInfoLog(str.replace(str2, AFKeystoreWrapper));
        }
    }

    static void valueOf(String str) {
        AFInAppEventParameterName = str;
        if (str == null) {
            return;
        }
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < str.length(); i++) {
            if (i == 0 || i == str.length() - 1) {
                sb.append(str.charAt(i));
            } else {
                sb.append("*");
            }
        }
        AFKeystoreWrapper = sb.toString();
    }

    public final boolean AFInAppEventParameterName() {
        return this.AFInAppEventType;
    }

    public AFb1tSDK(String str, long j, boolean z) {
        this.values = str;
        this.valueOf = j;
        this.AFInAppEventType = z;
    }
}
