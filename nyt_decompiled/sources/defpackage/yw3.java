package defpackage;

import com.google.firebase.crashlytics.internal.common.CommonUtils;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes3.dex */
class yw3 {
    private final Map a = new HashMap();
    private final int b;
    private final int c;

    public yw3(int i, int i2) {
        this.b = i;
        this.c = i2;
    }

    private String b(String str) {
        if (str != null) {
            return c(str, this.c);
        }
        throw new IllegalArgumentException("Custom attribute key must not be null.");
    }

    public static String c(String str, int i) {
        if (str == null) {
            return str;
        }
        String trim = str.trim();
        return trim.length() > i ? trim.substring(0, i) : trim;
    }

    public synchronized Map a() {
        return Collections.unmodifiableMap(new HashMap(this.a));
    }

    public synchronized boolean d(String str, String str2) {
        String b = b(str);
        if (this.a.size() >= this.b && !this.a.containsKey(b)) {
            m94.f().k("Ignored entry \"" + str + "\" when adding custom keys. Maximum allowable: " + this.b);
            return false;
        }
        String c = c(str2, this.c);
        if (CommonUtils.A((String) this.a.get(b), c)) {
            return false;
        }
        Map map = this.a;
        if (str2 == null) {
            c = "";
        }
        map.put(b, c);
        return true;
    }

    public synchronized void e(Map map) {
        try {
            int i = 0;
            for (Map.Entry entry : map.entrySet()) {
                String b = b((String) entry.getKey());
                if (this.a.size() >= this.b && !this.a.containsKey(b)) {
                    i++;
                }
                String str = (String) entry.getValue();
                this.a.put(b, str == null ? "" : c(str, this.c));
            }
            if (i > 0) {
                m94.f().k("Ignored " + i + " entries when adding custom keys. Maximum allowable: " + this.b);
            }
        } catch (Throwable th) {
            throw th;
        }
    }
}
