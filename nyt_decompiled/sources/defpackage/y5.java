package defpackage;

import com.nytimes.android.ads.models.CommonAdKeys;
import com.nytimes.android.ads.models.CoreAdKeys;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import kotlin.collections.i;
import kotlin.text.Regex;
import kotlin.text.h;

/* loaded from: classes2.dex */
public abstract class y5 {
    private static final List a = i.o(CommonAdKeys.AD_POSITION.getKey(), CoreAdKeys.APP_VERSION.getKey(), CoreAdKeys.PROPERTY.getKey(), CoreAdKeys.PLATFORM.getKey(), CoreAdKeys.VIEWPORT_SIZE.getKey());
    private static final List b = i.e(CoreAdKeys.USER_ACCESS_POINT.getKey());
    private static final List c = i.e(CoreAdKeys.CORRELATOR.getKey());

    public static final Map a(Map map) {
        zq3.h(map, "<this>");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Map.Entry entry : map.entrySet()) {
            if (!b.contains(entry.getKey())) {
                linkedHashMap.put(entry.getKey(), entry.getValue());
            }
        }
        return linkedHashMap;
    }

    public static final String b(int i) {
        return i < 728 ? "small" : (728 > i || i >= 970) ? "large" : "medium";
    }

    public static final boolean c(Map map) {
        zq3.h(map, "<this>");
        return map.keySet().containsAll(a);
    }

    public static final Map d(Map map) {
        zq3.h(map, "<this>");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Map.Entry entry : map.entrySet()) {
            if (!c.contains(entry.getKey())) {
                linkedHashMap.put(entry.getKey(), entry.getValue());
            }
        }
        return linkedHashMap;
    }

    public static final Map e(Map map) {
        String g;
        zq3.h(map, "<this>");
        HashMap hashMap = new HashMap();
        for (Map.Entry entry : map.entrySet()) {
            String f = f((String) entry.getKey());
            if (f != null && f.length() != 0 && (g = g((String) entry.getValue())) != null) {
                hashMap.put(f, g);
            }
        }
        return hashMap;
    }

    public static final String f(String str) {
        zq3.h(str, "<this>");
        if (str.length() == 0 || Character.isDigit(str.charAt(0))) {
            return null;
        }
        return h.F(str, " ", "", false, 4, null);
    }

    public static final String g(String str) {
        zq3.h(str, "<this>");
        if (str.length() == 0) {
            return null;
        }
        Regex regex = new Regex("[\"'=!+#*~;^()<>\\[\\]& ]");
        String lowerCase = str.toLowerCase(Locale.ROOT);
        zq3.g(lowerCase, "toLowerCase(...)");
        String e = regex.e(lowerCase, "");
        if (e.length() == 0) {
            return null;
        }
        return e;
    }
}
