package com.appsflyer.internal;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.util.Base64;
import android.util.DisplayMetrics;
import android.view.WindowManager;
import com.appsflyer.AFLogger;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* loaded from: classes2.dex */
public final class AFa1fSDK {
    private byte[] AFInAppEventParameterName;
    String AFInAppEventType;
    public String AFKeystoreWrapper;
    public String valueOf;

    @Nullable
    public AFc1jSDK values;

    AFa1fSDK() {
    }

    static Map<String, String> AFInAppEventParameterName(@NonNull Context context) {
        HashMap hashMap = new HashMap();
        try {
            DisplayMetrics displayMetrics = new DisplayMetrics();
            ((WindowManager) context.getSystemService("window")).getDefaultDisplay().getMetrics(displayMetrics);
            int i = context.getResources().getConfiguration().screenLayout & 15;
            hashMap.put("x_px", String.valueOf(displayMetrics.widthPixels));
            hashMap.put("y_px", String.valueOf(displayMetrics.heightPixels));
            hashMap.put("d_dpi", String.valueOf(displayMetrics.densityDpi));
            hashMap.put("size", String.valueOf(i));
            hashMap.put("xdp", String.valueOf(displayMetrics.xdpi));
            hashMap.put("ydp", String.valueOf(displayMetrics.ydpi));
        } catch (Throwable th) {
            AFLogger.afErrorLog("Couldn't aggregate screen stats: ", th);
        }
        return hashMap;
    }

    public final byte[] AFInAppEventType() {
        return this.AFInAppEventParameterName;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && AFa1fSDK.class == obj.getClass()) {
            AFa1fSDK aFa1fSDK = (AFa1fSDK) obj;
            String str = this.AFInAppEventType;
            if (str == null ? aFa1fSDK.AFInAppEventType != null : !str.equals(aFa1fSDK.AFInAppEventType)) {
                return false;
            }
            if (!Arrays.equals(this.AFInAppEventParameterName, aFa1fSDK.AFInAppEventParameterName)) {
                return false;
            }
            String str2 = this.valueOf;
            if (str2 == null ? aFa1fSDK.valueOf != null : !str2.equals(aFa1fSDK.valueOf)) {
                return false;
            }
            String str3 = this.AFKeystoreWrapper;
            if (str3 == null ? aFa1fSDK.AFKeystoreWrapper != null : !str3.equals(aFa1fSDK.AFKeystoreWrapper)) {
                return false;
            }
            if (this.values == aFa1fSDK.values) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        String str = this.AFInAppEventType;
        int hashCode = (((str != null ? str.hashCode() : 0) * 31) + Arrays.hashCode(this.AFInAppEventParameterName)) * 31;
        String str2 = this.valueOf;
        int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.AFKeystoreWrapper;
        int hashCode3 = (hashCode2 + (str3 != null ? str3.hashCode() : 0)) * 31;
        AFc1jSDK aFc1jSDK = this.values;
        return hashCode3 + (aFc1jSDK != null ? aFc1jSDK.hashCode() : 0);
    }

    public AFa1fSDK(String str, byte[] bArr, String str2, AFc1jSDK aFc1jSDK) {
        this.valueOf = str;
        this.AFInAppEventParameterName = bArr;
        this.AFInAppEventType = str2;
        this.values = aFc1jSDK;
    }

    public AFa1fSDK(char[] cArr) {
        Scanner scanner = new Scanner(new String(cArr));
        int i = 0;
        int i2 = 0;
        while (scanner.hasNextLine()) {
            String nextLine = scanner.nextLine();
            if (nextLine.startsWith("url=")) {
                this.valueOf = nextLine.substring(4).trim();
            } else if (nextLine.startsWith("version=")) {
                this.AFInAppEventType = nextLine.substring(8).trim();
                Matcher matcher = Pattern.compile("^(0|[1-9]\\d*)\\.(0|[1-9]\\d*)\\.(0|[1-9]\\d*)(?:-((?:0|[1-9]\\d*|\\d*[a-zA-Z-][0-9a-zA-Z-]*)(?:\\.(?:0|[1-9]\\d*|\\d*[a-zA-Z-][0-9a-zA-Z-]*))*))?(?:\\+([0-9a-zA-Z-]+(?:\\.[0-9a-zA-Z-]+)*))?$").matcher(this.AFInAppEventType);
                if (matcher.matches()) {
                    i = Integer.parseInt(matcher.group(1));
                    i2 = Integer.parseInt(matcher.group(2));
                }
            } else if (nextLine.startsWith("data=")) {
                String trim = nextLine.substring(5).trim();
                this.AFInAppEventParameterName = (i > 4 || i2 >= 11) ? Base64.decode(trim, 2) : trim.getBytes();
            } else if (nextLine.startsWith("type=")) {
                String trim2 = nextLine.substring(5).trim();
                try {
                    this.values = AFc1jSDK.valueOf(trim2);
                } catch (Exception e) {
                    AFLogger.afErrorLog("CACHE: Unknown task type: ".concat(String.valueOf(trim2)), e);
                }
            }
        }
        scanner.close();
    }
}
