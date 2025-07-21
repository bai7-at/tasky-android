package com.chartbeat.androidsdk;

import android.util.Base64;
import java.security.SecureRandom;

/* loaded from: classes2.dex */
final class SecurityUtils {
    private static SecureRandom random = new SecureRandom();

    private SecurityUtils() {
    }

    static synchronized String randomChars(int i) {
        String substring;
        synchronized (SecurityUtils.class) {
            try {
                if (i <= 0) {
                    throw new RuntimeException("need at least one character");
                }
                byte[] bArr = new byte[((i % 3 != 0 ? (i - (i % 3)) + 3 : i) * 4) / 3];
                random.nextBytes(bArr);
                String encodeToString = Base64.encodeToString(bArr, 3);
                if (encodeToString.length() < i) {
                    throw new RuntimeException();
                }
                if (encodeToString.contains("=")) {
                    throw new RuntimeException();
                }
                substring = encodeToString.replaceAll("\\/", "-").replaceAll("\\+", QueryKeys.END_MARKER).substring(0, i);
            } catch (Throwable th) {
                throw th;
            }
        }
        return substring;
    }
}
