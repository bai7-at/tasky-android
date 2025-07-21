package kotlin.collections;

import defpackage.zq3;
import java.util.Collections;
import java.util.Map;
import java.util.SortedMap;
import java.util.TreeMap;
import kotlin.Pair;
import kotlin.collections.builders.MapBuilder;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes5.dex */
public abstract class v extends u {
    public static Map b(Map map) {
        zq3.h(map, "builder");
        return ((MapBuilder) map).o();
    }

    public static Map c() {
        return new MapBuilder();
    }

    public static Map d(int i) {
        return new MapBuilder(i);
    }

    public static int e(int i) {
        if (i < 0) {
            return i;
        }
        if (i < 3) {
            return i + 1;
        }
        if (i < 1073741824) {
            return (int) ((i / 0.75f) + 1.0f);
        }
        return Integer.MAX_VALUE;
    }

    public static Map f(Pair pair) {
        zq3.h(pair, "pair");
        Map singletonMap = Collections.singletonMap(pair.c(), pair.d());
        zq3.g(singletonMap, "singletonMap(...)");
        return singletonMap;
    }

    public static final Map g(Map map) {
        zq3.h(map, "<this>");
        Map.Entry entry = (Map.Entry) map.entrySet().iterator().next();
        Map singletonMap = Collections.singletonMap(entry.getKey(), entry.getValue());
        zq3.g(singletonMap, "with(...)");
        return singletonMap;
    }

    public static SortedMap h(Map map) {
        zq3.h(map, "<this>");
        return new TreeMap(map);
    }
}
