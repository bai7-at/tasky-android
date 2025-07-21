package defpackage;

import android.content.SharedPreferences;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import kotlin.collections.i;
import kotlin.collections.t;

/* loaded from: classes.dex */
public final class rq7 {
    private final SharedPreferences a;
    private final Set b;

    public rq7(SharedPreferences sharedPreferences, Set set) {
        zq3.h(sharedPreferences, "prefs");
        this.a = sharedPreferences;
        this.b = set;
    }

    public final Map a() {
        Map<String, ?> all = this.a.getAll();
        zq3.g(all, "prefs.all");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Map.Entry<String, ?> entry : all.entrySet()) {
            String key = entry.getKey();
            Set set = this.b;
            if (set == null ? true : set.contains(key)) {
                linkedHashMap.put(entry.getKey(), entry.getValue());
            }
        }
        LinkedHashMap linkedHashMap2 = new LinkedHashMap(t.e(linkedHashMap.size()));
        for (Map.Entry entry2 : linkedHashMap.entrySet()) {
            Object key2 = entry2.getKey();
            Object value = entry2.getValue();
            if (value instanceof Set) {
                value = i.c1((Iterable) value);
            }
            linkedHashMap2.put(key2, value);
        }
        return linkedHashMap2;
    }
}
