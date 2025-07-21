package kotlin.collections;

import defpackage.zq3;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Pair;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes5.dex */
public abstract class w extends v {
    public static Map i() {
        EmptyMap emptyMap = EmptyMap.a;
        zq3.f(emptyMap, "null cannot be cast to non-null type kotlin.collections.Map<K of kotlin.collections.MapsKt__MapsKt.emptyMap, V of kotlin.collections.MapsKt__MapsKt.emptyMap>");
        return emptyMap;
    }

    public static Object j(Map map, Object obj) {
        zq3.h(map, "<this>");
        return u.a(map, obj);
    }

    public static HashMap k(Pair... pairArr) {
        zq3.h(pairArr, "pairs");
        HashMap hashMap = new HashMap(t.e(pairArr.length));
        s(hashMap, pairArr);
        return hashMap;
    }

    public static LinkedHashMap l(Pair... pairArr) {
        zq3.h(pairArr, "pairs");
        return (LinkedHashMap) t.w(pairArr, new LinkedHashMap(t.e(pairArr.length)));
    }

    public static Map m(Pair... pairArr) {
        zq3.h(pairArr, "pairs");
        return pairArr.length > 0 ? t.w(pairArr, new LinkedHashMap(t.e(pairArr.length))) : t.i();
    }

    public static Map n(Pair... pairArr) {
        zq3.h(pairArr, "pairs");
        LinkedHashMap linkedHashMap = new LinkedHashMap(t.e(pairArr.length));
        s(linkedHashMap, pairArr);
        return linkedHashMap;
    }

    public static final Map o(Map map) {
        zq3.h(map, "<this>");
        int size = map.size();
        return size != 0 ? size != 1 ? map : v.g(map) : t.i();
    }

    public static Map p(Map map, Map map2) {
        zq3.h(map, "<this>");
        zq3.h(map2, "map");
        LinkedHashMap linkedHashMap = new LinkedHashMap(map);
        linkedHashMap.putAll(map2);
        return linkedHashMap;
    }

    public static Map q(Map map, Pair pair) {
        zq3.h(map, "<this>");
        zq3.h(pair, "pair");
        if (map.isEmpty()) {
            return t.f(pair);
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(map);
        linkedHashMap.put(pair.c(), pair.d());
        return linkedHashMap;
    }

    public static final void r(Map map, Iterable iterable) {
        zq3.h(map, "<this>");
        zq3.h(iterable, "pairs");
        Iterator it2 = iterable.iterator();
        while (it2.hasNext()) {
            Pair pair = (Pair) it2.next();
            map.put(pair.a(), pair.b());
        }
    }

    public static final void s(Map map, Pair[] pairArr) {
        zq3.h(map, "<this>");
        zq3.h(pairArr, "pairs");
        for (Pair pair : pairArr) {
            map.put(pair.a(), pair.b());
        }
    }

    public static Map t(Iterable iterable) {
        zq3.h(iterable, "<this>");
        if (!(iterable instanceof Collection)) {
            return o(t.u(iterable, new LinkedHashMap()));
        }
        Collection collection = (Collection) iterable;
        int size = collection.size();
        if (size == 0) {
            return t.i();
        }
        if (size != 1) {
            return t.u(iterable, new LinkedHashMap(t.e(collection.size())));
        }
        return t.f((Pair) (iterable instanceof List ? ((List) iterable).get(0) : iterable.iterator().next()));
    }

    public static Map u(Iterable iterable, Map map) {
        zq3.h(iterable, "<this>");
        zq3.h(map, "destination");
        r(map, iterable);
        return map;
    }

    public static Map v(Map map) {
        zq3.h(map, "<this>");
        int size = map.size();
        return size != 0 ? size != 1 ? t.x(map) : v.g(map) : t.i();
    }

    public static Map w(Pair[] pairArr, Map map) {
        zq3.h(pairArr, "<this>");
        zq3.h(map, "destination");
        s(map, pairArr);
        return map;
    }

    public static Map x(Map map) {
        zq3.h(map, "<this>");
        return new LinkedHashMap(map);
    }
}
