package io.embrace.android.embracesdk.network.http;

import java.util.Locale;

/* loaded from: classes5.dex */
public enum HttpMethod {
    GET,
    HEAD,
    POST,
    PUT,
    DELETE,
    CONNECT,
    OPTIONS,
    TRACE,
    PATCH;

    public static HttpMethod fromInt(Integer num) {
        if (num == null) {
            return null;
        }
        int intValue = num.intValue();
        if (intValue == 1) {
            return GET;
        }
        if (intValue == 2) {
            return POST;
        }
        if (intValue == 3) {
            return PUT;
        }
        if (intValue == 4) {
            return DELETE;
        }
        if (intValue != 5) {
            return null;
        }
        return PATCH;
    }

    public static HttpMethod fromString(String str) {
        if (str == null) {
            return null;
        }
        String upperCase = str.toUpperCase(Locale.US);
        upperCase.hashCode();
        switch (upperCase) {
        }
        return null;
    }
}
