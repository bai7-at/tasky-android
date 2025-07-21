package defpackage;

import java.util.Map;

/* loaded from: classes2.dex */
public abstract class tb {
    public static final boolean a(Map map) {
        if (map != null) {
            return map.containsKey("als_test_clientside");
        }
        return false;
    }

    public static final boolean b(Map map) {
        Object obj;
        String obj2;
        return map == null || (obj = map.get("bt")) == null || (obj2 = obj.toString()) == null || obj2.length() == 0;
    }

    public static final boolean c(Map map) {
        return (map != null ? map.get("bt") : null) == null;
    }
}
