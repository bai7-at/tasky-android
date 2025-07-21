package com.appsflyer.internal;

/* loaded from: classes2.dex */
public final class AFf1wSDK {
    public static final Object AFInAppEventType = new Object();
    public static int AFKeystoreWrapper;
    public static int valueOf;
    public static int values;

    public static void AFInAppEventParameterName(int[] iArr) {
        for (int i = 0; i < iArr.length / 2; i++) {
            int i2 = iArr[i];
            iArr[i] = iArr[(iArr.length - i) - 1];
            iArr[(iArr.length - i) - 1] = i2;
        }
    }

    public static int values(int i) {
        int[][] iArr = AFe1gSDK.AFInAppEventParameterName.AFInAppEventType;
        return ((iArr[0][i >>> 24] + iArr[1][(i >>> 16) & 255]) ^ iArr[2][(i >>> 8) & 255]) + iArr[3][i & 255];
    }
}
