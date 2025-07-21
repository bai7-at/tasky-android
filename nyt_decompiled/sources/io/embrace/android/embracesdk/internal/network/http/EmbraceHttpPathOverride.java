package io.embrace.android.embracesdk.internal.network.http;

import io.embrace.android.embracesdk.Embrace;
import io.embrace.android.embracesdk.annotation.InternalApi;
import java.nio.charset.StandardCharsets;
import java.util.Locale;
import java.util.regex.Pattern;

@InternalApi
/* loaded from: classes5.dex */
public class EmbraceHttpPathOverride {
    protected static final String PATH_OVERRIDE = "x-emb-path";
    private static final Integer RELATIVE_PATH_MAX_LENGTH = 1024;
    private static final Pattern RELATIVE_PATH_PATTERN = Pattern.compile("[A-Za-z0-9-._~:/\\[\\]@!$&'()*+,;=]+");

    public static String getURLString(HttpPathOverrideRequest httpPathOverrideRequest) {
        return getURLString(httpPathOverrideRequest, httpPathOverrideRequest.getHeaderByName(PATH_OVERRIDE));
    }

    private static void logError(String str) {
        Embrace.getInstance().getInternalInterface().logError(str, null, null, false);
    }

    private static Boolean validatePathOverride(String str) {
        if (str == null) {
            logError("URL relative path cannot be null");
            return Boolean.FALSE;
        }
        if (str.isEmpty()) {
            logError("Relative path must have non-zero length");
            return Boolean.FALSE;
        }
        int length = str.length();
        Integer num = RELATIVE_PATH_MAX_LENGTH;
        if (length > num.intValue()) {
            logError(String.format(Locale.US, "Relative path %s is greater than the maximum allowed length of %d. It will be ignored", str, num));
            return Boolean.FALSE;
        }
        if (!StandardCharsets.US_ASCII.newEncoder().canEncode(str)) {
            logError("Relative path must not contain unicode characters. Relative path " + str + " will be ignored.");
            return Boolean.FALSE;
        }
        if (!str.startsWith("/")) {
            logError("Relative path must start with a /");
            return Boolean.FALSE;
        }
        if (RELATIVE_PATH_PATTERN.matcher(str).matches()) {
            return Boolean.TRUE;
        }
        logError("Relative path contains invalid chars. Relative path " + str + " will be ignored.");
        return Boolean.FALSE;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v0, types: [io.embrace.android.embracesdk.internal.network.http.HttpPathOverrideRequest] */
    /* JADX WARN: Type inference failed for: r1v2, types: [io.embrace.android.embracesdk.internal.network.http.HttpPathOverrideRequest] */
    /* JADX WARN: Type inference failed for: r1v4, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r1v6 */
    /* JADX WARN: Type inference failed for: r1v7 */
    @InternalApi
    public static String getURLString(HttpPathOverrideRequest httpPathOverrideRequest, String str) {
        if (str != null) {
            try {
                if (validatePathOverride(str).booleanValue()) {
                    httpPathOverrideRequest = httpPathOverrideRequest.getOverriddenURL(str);
                    return httpPathOverrideRequest;
                }
            } catch (Exception unused) {
                return httpPathOverrideRequest.getURLString();
            }
        }
        httpPathOverrideRequest = httpPathOverrideRequest.getURLString();
        return httpPathOverrideRequest;
    }
}
