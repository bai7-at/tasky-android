package com.appsflyer.internal;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.os.Build;
import android.support.annotation.NonNull;
import android.view.ViewConfiguration;
import com.appsflyer.AFLogger;
import com.appsflyer.AppsFlyerProperties;
import com.appsflyer.internal.components.network.http.ResponseNetwork;
import com.comscore.streaming.ContentType;
import java.lang.ref.WeakReference;
import java.text.SimpleDateFormat;
import java.util.Locale;
import java.util.Map;

/* loaded from: classes2.dex */
public final class AFd1vSDK extends AFd1uSDK {
    private static int onAttributionFailureNative = 1;
    private static int onInstallConversionFailureNative;
    private final String afWarnLog;
    private final AFb1fSDK init;
    private static char[] getLevel = {349, 365, 348, 361, 351};
    private static boolean onAppOpenAttributionNative = true;
    private static boolean onInstallConversionDataLoadedNative = true;
    private static int AFVersionDeclaration = 251;

    public AFd1vSDK(@NonNull String str, @NonNull AFc1xSDK aFc1xSDK) {
        super(new AFd1jSDK(aFc1xSDK.init().AFKeystoreWrapper), aFc1xSDK, str);
        this.init = aFc1xSDK.init();
        this.afWarnLog = str;
    }

    private void afWarnLog() {
        int i = onInstallConversionFailureNative + 101;
        onAttributionFailureNative = i % 128;
        int i2 = i % 2;
        ((AFd1uSDK) this).AFLogger$LogLevel.AFInAppEventParameterName("sentRegisterRequestToAF", true);
        AFLogger.afDebugLog("[register] Successfully registered for Uninstall Tracking");
        onInstallConversionFailureNative = (onAttributionFailureNative + 43) % 128;
    }

    @Override // com.appsflyer.internal.AFd1uSDK
    protected final void AFInAppEventType(AFa1qSDK aFa1qSDK) {
        super.AFInAppEventType(aFa1qSDK);
        Context context = this.init.AFKeystoreWrapper;
        AFa1aSDK values = AFa1aSDK.values();
        if (context == null) {
            throw new IllegalStateException("Context is not provided, can't send register request");
        }
        if (values.AFKeystoreWrapper()) {
            AFLogger.afInfoLog("CustomerUserId not set, Tracking is disabled", true);
            throw new IllegalStateException("CustomerUserId not set, register is not sent");
        }
        PackageManager packageManager = context.getPackageManager();
        try {
            PackageInfo packageInfo = packageManager.getPackageInfo(context.getPackageName(), 0);
            aFa1qSDK.values("app_version_code", Integer.toString(packageInfo.versionCode));
            aFa1qSDK.values("app_version_name", packageInfo.versionName);
            aFa1qSDK.values("app_name", packageManager.getApplicationLabel(packageInfo.applicationInfo).toString());
            aFa1qSDK.values("installDate", AFa1aSDK.AFInAppEventType(new SimpleDateFormat("yyyy-MM-dd_HHmmssZ", Locale.US), packageInfo.firstInstallTime));
            onAttributionFailureNative = (onInstallConversionFailureNative + 35) % 128;
        } catch (Throwable th) {
            AFLogger.afErrorLog("Exception while collecting application version info.", th);
        }
        AFa1aSDK.AFInAppEventParameterName(context, (Map<String, ? super String>) aFa1qSDK.valueOf());
        String AFInAppEventType = AFa1aSDK.AFInAppEventType();
        if (AFInAppEventType != null) {
            aFa1qSDK.values("appUserId", AFInAppEventType);
        }
        try {
            aFa1qSDK.values("model", Build.MODEL);
            aFa1qSDK.values(values("\u0085\u0084\u0083\u0082\u0081", null, null, 127 - (ViewConfiguration.getDoubleTapTimeout() >> 16)).intern(), Build.BRAND);
        } catch (Throwable th2) {
            AFLogger.afErrorLog("Exception while collecting device brand and model.", th2);
        }
        if (AppsFlyerProperties.getInstance().getBoolean(AppsFlyerProperties.DEVICE_TRACKING_DISABLED, false)) {
            aFa1qSDK.values(AppsFlyerProperties.DEVICE_TRACKING_DISABLED, "true");
        }
        AFa1rSDK valueOf = AFb1ySDK.valueOf(context.getContentResolver());
        if (valueOf != null) {
            onAttributionFailureNative = (onInstallConversionFailureNative + 91) % 128;
            aFa1qSDK.values("amazon_aid", valueOf.AFKeystoreWrapper);
            aFa1qSDK.values("amazon_aid_limit", String.valueOf(valueOf.valueOf));
            onInstallConversionFailureNative = (onAttributionFailureNative + 67) % 128;
        }
        String string = AppsFlyerProperties.getInstance().getString("advertiserId");
        if (string != null) {
            aFa1qSDK.values("advertiserId", string);
            onInstallConversionFailureNative = (onAttributionFailureNative + 99) % 128;
        }
        aFa1qSDK.values("devkey", ((AFc1hSDK) this).AFLogger.AFInAppEventType);
        aFa1qSDK.values("uid", AFb1rSDK.AFInAppEventParameterName(new WeakReference(context)));
        aFa1qSDK.values("af_gcm_token", this.afWarnLog);
        aFa1qSDK.values("launch_counter", Integer.toString(((AFd1uSDK) this).AFLogger$LogLevel.values("appsFlyerCount")));
        aFa1qSDK.values("sdk", Integer.toString(Build.VERSION.SDK_INT));
        String values2 = values.values(context);
        if (values2 != null) {
            onAttributionFailureNative = (onInstallConversionFailureNative + 67) % 128;
            aFa1qSDK.values(AppsFlyerProperties.CHANNEL, values2);
        }
        int i = onAttributionFailureNative + 115;
        onInstallConversionFailureNative = i % 128;
        if (i % 2 != 0) {
            throw null;
        }
    }

    @Override // com.appsflyer.internal.AFd1uSDK, com.appsflyer.internal.AFc1hSDK
    protected final boolean afInfoLog() {
        int i = onAttributionFailureNative + ContentType.USER_GENERATED_LIVE;
        onInstallConversionFailureNative = i % 128;
        return i % 2 != 0;
    }

    @Override // com.appsflyer.internal.AFc1hSDK, com.appsflyer.internal.AFc1nSDK
    public final void values() {
        super.values();
        ResponseNetwork responseNetwork = this.afInfoLog;
        if (responseNetwork != null) {
            int i = onInstallConversionFailureNative + 75;
            onAttributionFailureNative = i % 128;
            if (i % 2 == 0) {
                responseNetwork.isSuccessful();
                throw null;
            }
            if (responseNetwork.isSuccessful()) {
                int i2 = onAttributionFailureNative + 35;
                onInstallConversionFailureNative = i2 % 128;
                int i3 = i2 % 2;
                afWarnLog();
                if (i3 != 0) {
                    throw null;
                }
            }
        }
    }

    private static String values(String str, String str2, int[] iArr, int i) {
        char[] cArr = str2;
        if (str2 != null) {
            cArr = str2.toCharArray();
        }
        char[] cArr2 = cArr;
        byte[] bArr = str;
        if (str != null) {
            bArr = str.getBytes("ISO-8859-1");
        }
        byte[] bArr2 = bArr;
        synchronized (AFf1tSDK.AFInAppEventType) {
            try {
                char[] cArr3 = getLevel;
                int i2 = AFVersionDeclaration;
                if (onInstallConversionDataLoadedNative) {
                    int length = bArr2.length;
                    AFf1tSDK.AFInAppEventParameterName = length;
                    char[] cArr4 = new char[length];
                    AFf1tSDK.valueOf = 0;
                    while (AFf1tSDK.valueOf < AFf1tSDK.AFInAppEventParameterName) {
                        int i3 = AFf1tSDK.valueOf;
                        int i4 = AFf1tSDK.AFInAppEventParameterName - 1;
                        int i5 = AFf1tSDK.valueOf;
                        cArr4[i3] = (char) (cArr3[bArr2[i4 - i5] + i] - i2);
                        AFf1tSDK.valueOf = i5 + 1;
                    }
                    return new String(cArr4);
                }
                if (onAppOpenAttributionNative) {
                    int length2 = cArr2.length;
                    AFf1tSDK.AFInAppEventParameterName = length2;
                    char[] cArr5 = new char[length2];
                    AFf1tSDK.valueOf = 0;
                    while (AFf1tSDK.valueOf < AFf1tSDK.AFInAppEventParameterName) {
                        int i6 = AFf1tSDK.valueOf;
                        int i7 = AFf1tSDK.AFInAppEventParameterName - 1;
                        int i8 = AFf1tSDK.valueOf;
                        cArr5[i6] = (char) (cArr3[cArr2[i7 - i8] - i] - i2);
                        AFf1tSDK.valueOf = i8 + 1;
                    }
                    return new String(cArr5);
                }
                int length3 = iArr.length;
                AFf1tSDK.AFInAppEventParameterName = length3;
                char[] cArr6 = new char[length3];
                AFf1tSDK.valueOf = 0;
                while (AFf1tSDK.valueOf < AFf1tSDK.AFInAppEventParameterName) {
                    int i9 = AFf1tSDK.valueOf;
                    int i10 = AFf1tSDK.AFInAppEventParameterName - 1;
                    int i11 = AFf1tSDK.valueOf;
                    cArr6[i9] = (char) (cArr3[iArr[i10 - i11] - i] - i2);
                    AFf1tSDK.valueOf = i11 + 1;
                }
                return new String(cArr6);
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
