package com.appsflyer.internal;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.Network;
import android.net.NetworkInfo;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.telephony.TelephonyManager;
import com.amazonaws.mobileconnectors.cognito.internal.util.DatasetUtils;
import com.appsflyer.AFLogger;

/* loaded from: classes2.dex */
final class AFa1gSDK {

    static final class AFa1xSDK {
        static final AFa1gSDK AFInAppEventType = new AFa1gSDK();
    }

    static final class AFa1zSDK {
        final String AFInAppEventType;
        final String valueOf;
        final String values;

        AFa1zSDK(@NonNull String str, @Nullable String str2, @Nullable String str3) {
            this.valueOf = str;
            this.values = str2;
            this.AFInAppEventType = str3;
        }
    }

    AFa1gSDK() {
    }

    static AFa1zSDK AFInAppEventParameterName(@NonNull Context context) {
        String str;
        String str2;
        TelephonyManager telephonyManager;
        String str3 = DatasetUtils.UNKNOWN_IDENTITY_ID;
        String str4 = null;
        try {
            ConnectivityManager connectivityManager = (ConnectivityManager) context.getSystemService("connectivity");
            if (connectivityManager != null) {
                Network[] allNetworks = connectivityManager.getAllNetworks();
                int length = allNetworks.length;
                int i = 0;
                while (true) {
                    if (i >= length) {
                        break;
                    }
                    NetworkInfo networkInfo = connectivityManager.getNetworkInfo(allNetworks[i]);
                    if (!AFKeystoreWrapper(networkInfo)) {
                        i++;
                    } else if (1 == networkInfo.getType()) {
                        str3 = "WIFI";
                    } else if (networkInfo.getType() == 0) {
                        str3 = "MOBILE";
                    }
                }
            }
            telephonyManager = (TelephonyManager) context.getSystemService("phone");
            str2 = telephonyManager.getSimOperatorName();
            try {
                str4 = telephonyManager.getNetworkOperatorName();
            } catch (Throwable th) {
                th = th;
                str = str4;
                str4 = str2;
                AFLogger.afErrorLog("Exception while collecting network info. ", th);
                String str5 = str;
                str2 = str4;
                str4 = str5;
                return new AFa1zSDK(str3, str4, str2);
            }
        } catch (Throwable th2) {
            th = th2;
            str = null;
        }
        if (str4 != null) {
            if (str4.isEmpty()) {
            }
            return new AFa1zSDK(str3, str4, str2);
        }
        if (2 == telephonyManager.getPhoneType()) {
            str4 = "CDMA";
        }
        return new AFa1zSDK(str3, str4, str2);
    }

    private static boolean AFKeystoreWrapper(NetworkInfo networkInfo) {
        return networkInfo != null && networkInfo.isConnectedOrConnecting();
    }
}
