package com.amazonaws.mobileconnectors.cognito.internal.util;

import com.amazonaws.services.s3.internal.Constants;
import java.nio.charset.Charset;

@Deprecated
/* loaded from: classes.dex */
public final class StringUtils {
    private static final Charset UTF_8 = Charset.forName(Constants.DEFAULT_ENCODING);

    public static boolean equals(String str, String str2) {
        return str == null ? str2 == null : str.equals(str2);
    }

    public static boolean isEmpty(String str) {
        return str == null || str.trim().isEmpty();
    }

    public static long utf8ByteLength(String str) {
        if (str == null) {
            return 0L;
        }
        return str.getBytes(UTF_8).length;
    }
}
