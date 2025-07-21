package kotlin.collections;

import defpackage.zq3;
import java.util.Map;
import java.util.NoSuchElementException;

/* loaded from: classes5.dex */
abstract class u {
    public static final Object a(Map map, Object obj) {
        zq3.h(map, "<this>");
        if (map instanceof s) {
            return ((s) map).k(obj);
        }
        Object obj2 = map.get(obj);
        if (obj2 != null || map.containsKey(obj)) {
            return obj2;
        }
        throw new NoSuchElementException("Key " + obj + " is missing in the map.");
    }
}
