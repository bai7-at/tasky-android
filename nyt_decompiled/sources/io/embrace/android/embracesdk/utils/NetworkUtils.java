package io.embrace.android.embracesdk.utils;

import defpackage.uo6;
import defpackage.zq3;
import java.net.MalformedURLException;
import java.net.URL;
import java.nio.charset.Charset;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import kotlin.text.h;

/* loaded from: classes5.dex */
public final class NetworkUtils {
    private static final String DNS_PATTERN = "([a-zA-Z0-9]([a-zA-Z0-9\\-]{0,63}[a-zA-Z0-9])?)(\\.[a-zA-Z]{1,63})(\\.[a-zA-Z]{1,2})?$";
    private static final String IPV4_PATTERN = "^((25[0-5]|2[0-4][0-9]|[01]?[0-9][0-9]?)\\.){3}(25[0-5]|2[0-4][0-9]|[01]?[0-9][0-9]?)$";
    private static final String IPV6_PATTERN = "(([a-fA-F0-9]{1,4}|):){1,7}([a-fA-F0-9]{1,4}|:)";
    private static final int TRACE_ID_MAXIMUM_ALLOWED_LENGTH = 64;
    public static final NetworkUtils INSTANCE = new NetworkUtils();
    private static final Pattern IpAddrPattern = Pattern.compile("^((25[0-5]|2[0-4][0-9]|[01]?[0-9][0-9]?)\\.){3}(25[0-5]|2[0-4][0-9]|[01]?[0-9][0-9]?)$|(([a-fA-F0-9]{1,4}|):){1,7}([a-fA-F0-9]{1,4}|:)");
    private static final Pattern DomainPattern = Pattern.compile("([a-zA-Z0-9]([a-zA-Z0-9\\-]{0,63}[a-zA-Z0-9])?)(\\.[a-zA-Z]{1,63})(\\.[a-zA-Z]{1,2})?$|^((25[0-5]|2[0-4][0-9]|[01]?[0-9][0-9]?)\\.){3}(25[0-5]|2[0-4][0-9]|[01]?[0-9][0-9]?)$|(([a-fA-F0-9]{1,4}|):){1,7}([a-fA-F0-9]{1,4}|:)");

    private NetworkUtils() {
    }

    public static final String getDomain(String str) {
        Matcher matcher;
        zq3.h(str, "originalUrl");
        if (!h.K(str, "http", false, 2, null)) {
            str = "http://" + str;
        }
        try {
            matcher = DomainPattern.matcher(new URL(str).getHost());
        } catch (MalformedURLException unused) {
            matcher = DomainPattern.matcher(str);
        }
        if (matcher.find()) {
            return matcher.group(0);
        }
        return null;
    }

    public static final String getUrlPath(String str) {
        try {
            return new URL(str).getPath();
        } catch (Exception unused) {
            return "";
        }
    }

    public static final String getValidTraceId(String str) {
        if (str == null || !Charset.forName("US-ASCII").newEncoder().canEncode(str)) {
            return null;
        }
        if (str.length() <= 64) {
            return str;
        }
        String substring = str.substring(0, 64);
        zq3.g(substring, "(this as java.lang.Strin…ing(startIndex, endIndex)");
        return substring;
    }

    public static final boolean isIpAddress(String str) {
        if (str == null) {
            return false;
        }
        return IpAddrPattern.matcher(str).find();
    }

    public static final String stripUrl(String str) {
        String substring;
        zq3.h(str, "url");
        int g0 = h.g0(str, '/', 0, false, 6, null);
        if (g0 < 0) {
            substring = str;
        } else {
            substring = str.substring(g0);
            zq3.g(substring, "(this as java.lang.String).substring(startIndex)");
        }
        String str2 = substring;
        int a0 = h.a0(str2, '?', 0, false, 6, null);
        int a02 = h.a0(str2, '#', 0, false, 6, null);
        if (a0 < 0) {
            a0 = Integer.MAX_VALUE;
        }
        if (a02 < 0) {
            a02 = Integer.MAX_VALUE;
        }
        int i = uo6.i(a0, a02);
        if (g0 < 0) {
            g0 = 0;
        }
        String substring2 = str.substring(0, g0 + uo6.i(substring.length(), i));
        zq3.g(substring2, "(this as java.lang.Strin…ing(startIndex, endIndex)");
        return substring2;
    }
}
