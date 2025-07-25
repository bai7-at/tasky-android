package com.google.android.gms.common.util;

import android.util.Base64;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.errorprone.annotations.ResultIgnorabilityUnspecified;

@KeepForSdk
/* loaded from: classes2.dex */
public final class Base64Utils {
    @KeepForSdk
    public static byte[] decode(String str) {
        if (str == null) {
            return null;
        }
        return Base64.decode(str, 0);
    }

    @KeepForSdk
    public static byte[] decodeUrlSafe(String str) {
        if (str == null) {
            return null;
        }
        return Base64.decode(str, 10);
    }

    @ResultIgnorabilityUnspecified
    @KeepForSdk
    public static byte[] decodeUrlSafeNoPadding(String str) {
        if (str == null) {
            return null;
        }
        return Base64.decode(str, 11);
    }

    @KeepForSdk
    public static String encode(byte[] bArr) {
        if (bArr == null) {
            return null;
        }
        return Base64.encodeToString(bArr, 0);
    }

    @KeepForSdk
    public static String encodeUrlSafe(byte[] bArr) {
        if (bArr == null) {
            return null;
        }
        return Base64.encodeToString(bArr, 10);
    }

    @KeepForSdk
    public static String encodeUrlSafeNoPadding(byte[] bArr) {
        if (bArr == null) {
            return null;
        }
        return Base64.encodeToString(bArr, 11);
    }
}
