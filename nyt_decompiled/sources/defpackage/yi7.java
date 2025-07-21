package defpackage;

import java.util.HashMap;
import java.util.Map;

/* loaded from: classes4.dex */
public class yi7 {
    private final Map a = new HashMap();

    private Map a(String str) {
        Map map = (Map) this.a.get(str);
        if (map != null) {
            return map;
        }
        HashMap hashMap = new HashMap();
        this.a.put(str, hashMap);
        return hashMap;
    }

    public boolean b(String str, long j) {
        Boolean bool = (Boolean) a(str).get(Long.valueOf(j));
        if (bool == null) {
            return false;
        }
        return bool.booleanValue();
    }
}
