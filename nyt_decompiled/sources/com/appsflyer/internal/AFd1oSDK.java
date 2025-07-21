package com.appsflyer.internal;

import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.ViewConfiguration;
import com.comscore.streaming.ContentType;

/* loaded from: classes2.dex */
public final class AFd1oSDK {
    private static int AFInAppEventType = 0;
    private static int afErrorLog = 1;
    private static char[] AFKeystoreWrapper = {127, 131, 130, 133, '~', 128, 129, 132, '|', 144, '}', 141, 145};
    private static boolean AFInAppEventParameterName = true;
    private static boolean values = true;
    private static int valueOf = 76;

    @NonNull
    private static AFb1qSDK AFKeystoreWrapper(@NonNull AFb1vSDK aFb1vSDK, @Nullable String str, @NonNull String str2, @NonNull String str3) {
        String str4;
        if (str == null) {
            return new AFb1qSDK(aFb1vSDK.AFInAppEventType == AFe1qSDK.DEFAULT, AFe1rSDK.NA);
        }
        String intern = values("\u008c\u0085\u0081\u0086\u0087\u0085\u008c\u0082\u008b\u0085\u0082\u0082\u0082\u0081\u0086\u0082\u0086\u0081\u008b\u0082\u008c\u0087\u008d\u0083\u0082\u0087\u008c\u0083\u0086\u0087\u0083\u0083\u008b\u0087\u0081\u0083\u008a\u0086\u0089\u0086\u0088\u0086\u0084\u0085\u0087\u0086\u0083\u0085\u0085\u0086\u0086\u0085\u0084\u0082\u0084\u0081\u0083\u0082\u0083\u0081\u0081\u0082\u0081\u0081", null, null, (ViewConfiguration.getMaximumDrawingCacheSize() >> 24) + 127).intern();
        if (aFb1vSDK.AFInAppEventType == AFe1qSDK.CUSTOM) {
            str4 = new StringBuilder(str2).reverse().toString();
        } else {
            str4 = "";
            str3 = intern;
        }
        boolean equals = AFInAppEventParameterName(new StringBuilder(str3).reverse().toString(), aFb1vSDK.AFInAppEventParameterName, "android", "v1", str4).equals(str);
        return new AFb1qSDK(equals, equals ? AFe1rSDK.SUCCESS : AFe1rSDK.FAILURE);
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
                char[] cArr3 = AFKeystoreWrapper;
                int i2 = valueOf;
                if (values) {
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
                if (AFInAppEventParameterName) {
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

    @NonNull
    public final AFb1qSDK AFInAppEventParameterName(@NonNull AFb1vSDK aFb1vSDK, @Nullable String str, @NonNull String str2, @NonNull String str3) {
        if (aFb1vSDK != null && str2 != null) {
            int i = AFInAppEventType + ContentType.USER_GENERATED_LIVE;
            afErrorLog = i % 128;
            if (i % 2 == 0) {
                throw null;
            }
            if (str3 != null) {
                return AFKeystoreWrapper(aFb1vSDK, str, str2, str3);
            }
        }
        AFInAppEventType = (afErrorLog + 125) % 128;
        AFb1qSDK aFb1qSDK = new AFb1qSDK(false, AFe1rSDK.INTERNAL_ERROR);
        afErrorLog = (AFInAppEventType + 23) % 128;
        return aFb1qSDK;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x004d, code lost:
    
        r7 = r7 + 25;
        com.appsflyer.internal.AFd1oSDK.afErrorLog = r7 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x0054, code lost:
    
        if ((r7 % 2) != 0) goto L14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0056, code lost:
    
        r6 = 72 / 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0059, code lost:
    
        return r5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x005b, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0040, code lost:
    
        if (r5.length() < 12) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:4:0x002d, code lost:
    
        if (r5.length() < 31) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:6:0x0060, code lost:
    
        return r5.substring(0, 12);
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0042, code lost:
    
        r6 = com.appsflyer.internal.AFd1oSDK.afErrorLog + 73;
        r7 = r6 % 128;
        com.appsflyer.internal.AFd1oSDK.AFInAppEventType = r7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x004b, code lost:
    
        if ((r6 % 2) != 0) goto L15;
     */
    @android.support.annotation.VisibleForTesting
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static java.lang.String AFInAppEventParameterName(java.lang.String r5, java.lang.String r6, java.lang.String r7, java.lang.String r8, java.lang.String r9) {
        /*
            int r0 = com.appsflyer.internal.AFd1oSDK.AFInAppEventType
            int r0 = r0 + 27
            int r1 = r0 % 128
            com.appsflyer.internal.AFd1oSDK.afErrorLog = r1
            r1 = 2
            int r0 = r0 % r1
            r2 = 12
            java.lang.String r3 = ""
            r4 = 0
            if (r0 != 0) goto L30
            r0 = 4
            java.lang.String[] r0 = new java.lang.String[r0]
            r0[r4] = r6
            r0[r4] = r7
            r6 = 3
            r0[r6] = r8
            r0[r6] = r9
            r0[r1] = r3
            java.lang.String r6 = com.appsflyer.internal.AFb1sSDK.AFInAppEventParameterName(r0)
            java.lang.String r5 = com.appsflyer.internal.AFb1sSDK.AFInAppEventType(r6, r5)
            int r6 = r5.length()
            r7 = 31
            if (r6 >= r7) goto L5c
            goto L42
        L30:
            java.lang.String[] r6 = new java.lang.String[]{r6, r7, r8, r9, r3}
            java.lang.String r6 = com.appsflyer.internal.AFb1sSDK.AFInAppEventParameterName(r6)
            java.lang.String r5 = com.appsflyer.internal.AFb1sSDK.AFInAppEventType(r6, r5)
            int r6 = r5.length()
            if (r6 >= r2) goto L5c
        L42:
            int r6 = com.appsflyer.internal.AFd1oSDK.afErrorLog
            int r6 = r6 + 73
            int r7 = r6 % 128
            com.appsflyer.internal.AFd1oSDK.AFInAppEventType = r7
            int r6 = r6 % r1
            if (r6 != 0) goto L5a
            int r7 = r7 + 25
            int r6 = r7 % 128
            com.appsflyer.internal.AFd1oSDK.afErrorLog = r6
            int r7 = r7 % r1
            if (r7 != 0) goto L59
            r6 = 72
            int r6 = r6 / r4
        L59:
            return r5
        L5a:
            r5 = 0
            throw r5
        L5c:
            java.lang.String r5 = r5.substring(r4, r2)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.appsflyer.internal.AFd1oSDK.AFInAppEventParameterName(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String):java.lang.String");
    }
}
