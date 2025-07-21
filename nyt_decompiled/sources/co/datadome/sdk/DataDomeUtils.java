package co.datadome.sdk;

import android.text.TextUtils;
import android.webkit.CookieManager;
import android.webkit.ValueCallback;
import androidx.annotation.Keep;
import co.datadome.sdk.DataDomeUtils;
import java.util.List;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

@Keep
/* loaded from: classes.dex */
public class DataDomeUtils {
    DataDomeUtils() {
        throw new IllegalStateException("Utility class");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void a(ValueCallback valueCallback, Boolean bool) {
        valueCallback.onReceiveValue(Boolean.TRUE);
    }

    private static String cleanCookie(String str) {
        String[] split = str.split("; ");
        StringBuilder sb = new StringBuilder();
        for (String str2 : split) {
            if (!str2.startsWith(c.DATADOME_COOKIE_PREFIX)) {
                sb.append("; ");
                sb.append(str2);
            }
        }
        return sb.toString();
    }

    static String extractDatadomeCookie(String str) {
        Matcher matcher = Pattern.compile("datadome=([^;]*)").matcher(str);
        String str2 = "";
        while (matcher.find()) {
            str2 = "datadome=" + matcher.group(1);
        }
        return str2;
    }

    static String getCookieValueName(String str) {
        return str.split(";")[0];
    }

    static String isHeaderPresent(Map<String, String> map, String str) {
        for (String str2 : map.keySet()) {
            if (str2.equalsIgnoreCase(str)) {
                return map.get(str2);
            }
        }
        return null;
    }

    public static Boolean isNullOrEmpty(String str) {
        return str == null ? Boolean.TRUE : Boolean.valueOf(str.isEmpty());
    }

    public static Boolean isValidCookie(String str) {
        if (str != null && str.startsWith(c.DATADOME_COOKIE_PREFIX)) {
            return Boolean.valueOf(!isNullOrEmpty(parseCookieValue(str)).booleanValue());
        }
        return Boolean.FALSE;
    }

    public static Boolean isValidParameter(String str) {
        return Boolean.valueOf((str == null || str.trim().isEmpty()) ? false : true);
    }

    public static String mergeCookie(String str, String str2) {
        if (str2 == null) {
            return str;
        }
        return str + cleanCookie(str2);
    }

    static String parseCookieValue(String str) {
        String[] split = str.split("=");
        return split.length > 1 ? split[1].contains(";") ? split[1].split(";")[0] : split[1] : "";
    }

    static void removeCookiesSequentially(final ValueCallback<Boolean> valueCallback) {
        CookieManager.getInstance().removeAllCookies(new ValueCallback() { // from class: g91
            @Override // android.webkit.ValueCallback
            public final void onReceiveValue(Object obj) {
                DataDomeUtils.a(valueCallback, (Boolean) obj);
            }
        });
    }

    private static void setCookieRecursively(final String str, final List<String> list, final int i, final ValueCallback<Boolean> valueCallback) {
        if (i >= list.size()) {
            valueCallback.onReceiveValue(Boolean.TRUE);
            return;
        }
        String str2 = list.get(i);
        if (TextUtils.isEmpty(str2)) {
            setCookieRecursively(str, list, i + 1, valueCallback);
        } else {
            CookieManager.getInstance().setCookie(str, str2, new ValueCallback() { // from class: h91
                @Override // android.webkit.ValueCallback
                public final void onReceiveValue(Object obj) {
                    DataDomeUtils.a(str, list, i, valueCallback, (Boolean) obj);
                }
            });
        }
    }

    static void setCookiesSequentially(String str, List<String> list, ValueCallback<Boolean> valueCallback) {
        if (list == null || list.isEmpty()) {
            valueCallback.onReceiveValue(Boolean.FALSE);
        } else {
            setCookieRecursively(str, list, 0, valueCallback);
        }
    }

    static String stringOrEmpty(Object obj) {
        return obj == null ? "" : obj instanceof String ? (String) obj : obj.toString();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void a(String str, List list, int i, ValueCallback valueCallback, Boolean bool) {
        setCookieRecursively(str, list, i + 1, valueCallback);
    }
}
