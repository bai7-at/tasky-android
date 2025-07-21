package com.chartbeat.androidsdk;

import android.content.Context;

/* loaded from: classes2.dex */
final class AppInfo {
    private static final int ANDROID_SDK_VERSION_BASE = 2000;
    private static final String TAG = "AppInfo";
    private static int deviceScreenWidth = -1;
    private static String packageName;
    private String accountID;
    private String domain;

    AppInfo(Context context, String str, String str2) {
        if (str == null) {
            throw new NullPointerException("Account ID cannot be null");
        }
        this.accountID = str;
        try {
            if (packageName == null) {
                packageName = context.getPackageName();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        if (str2 == null) {
            throw new NullPointerException("Domain cannot be null");
        }
        this.domain = str2;
        try {
            if (deviceScreenWidth == -1) {
                deviceScreenWidth = SystemUtils.getScreenSize(context).x;
            }
        } catch (Exception e2) {
            e2.printStackTrace();
        }
    }

    String getAccountID() {
        return this.accountID;
    }

    String getDeviceScreenWidth() {
        return String.valueOf(deviceScreenWidth);
    }

    String getDomain() {
        return this.domain;
    }

    String getPackageName() {
        return packageName;
    }

    String getSdkVersion() {
        return String.valueOf(2012);
    }

    public String toString() {
        return "Chartbeat tracking SDK (" + getSdkVersion() + "): " + getAccountID() + "|" + getPackageName() + "|" + getDomain();
    }
}
