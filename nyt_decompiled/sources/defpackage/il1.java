package defpackage;

import com.apollographql.apollo.api.json.a;
import com.apollographql.apollo.api.json.b;
import io.embrace.android.embracesdk.gating.SessionGatingKeys;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.collections.i;
import kotlin.collections.t;

/* loaded from: classes2.dex */
public final class il1 {
    private final Map a;
    private final Map b;
    private final Set c;
    private final Set d;
    private boolean e;
    private boolean f;

    public il1() {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        this.a = linkedHashMap;
        this.b = linkedHashMap;
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        this.c = linkedHashSet;
        this.d = linkedHashSet;
        this.e = true;
    }

    private final void a(Map map, Map map2) {
        for (Map.Entry entry : map2.entrySet()) {
            String str = (String) entry.getKey();
            Object value = entry.getValue();
            if (map.containsKey(str) && ku8.n(map.get(str))) {
                Object obj = map.get(str);
                zq3.f(obj, "null cannot be cast to non-null type kotlin.collections.MutableMap<kotlin.String, kotlin.Any?>");
                Map d = ku8.d(obj);
                Map map3 = value instanceof Map ? (Map) value : null;
                if (map3 == null) {
                    throw new IllegalStateException(("'" + str + "' is an object in destination but not in map").toString());
                }
                a(d, map3);
            } else {
                map.put(str, value);
            }
        }
    }

    private final Map e(sd0 sd0Var) {
        Object d = a.d(new b(sd0Var));
        zq3.f(d, "null cannot be cast to non-null type kotlin.collections.Map<kotlin.String, kotlin.Any?>");
        return (Map) d;
    }

    private final void h(Map map) {
        Map map2 = (Map) map.get("data");
        Object obj = map.get("path");
        zq3.f(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any>");
        List list = (List) obj;
        Object obj2 = this.b.get("data");
        zq3.f(obj2, "null cannot be cast to non-null type kotlin.collections.Map<kotlin.String, kotlin.Any?>");
        Map map3 = (Map) obj2;
        if (map2 != null) {
            Object i = i(map3, list);
            zq3.f(i, "null cannot be cast to non-null type kotlin.collections.MutableMap<kotlin.String, kotlin.Any?>");
            a(ku8.d(i), map2);
            this.c.add(new hl1(list, (String) map.get("label")));
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v0, types: [java.util.Map] */
    /* JADX WARN: Type inference failed for: r2v1, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v3, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v4 */
    /* JADX WARN: Type inference failed for: r2v6, types: [java.lang.Object] */
    private final Object i(Map map, List list) {
        for (Object obj : list) {
            if (map instanceof List) {
                zq3.f(obj, "null cannot be cast to non-null type kotlin.Int");
                map = ((List) map).get(((Integer) obj).intValue());
            } else {
                zq3.f(map, "null cannot be cast to non-null type kotlin.collections.Map<kotlin.String, kotlin.Any?>");
                map = ((Map) map).get(obj);
            }
        }
        return map;
    }

    public final boolean b() {
        return this.e;
    }

    public final Set c() {
        return this.d;
    }

    public final boolean d() {
        return this.f;
    }

    public final Map f(sd0 sd0Var) {
        zq3.h(sd0Var, "payload");
        return g(e(sd0Var));
    }

    public final Map g(Map map) {
        zq3.h(map, "payload");
        if (this.b.isEmpty()) {
            this.a.putAll(map);
            return this.b;
        }
        Object obj = map.get("incremental");
        List<Map> list = obj instanceof List ? (List) obj : null;
        if (list == null) {
            this.f = true;
        } else {
            this.f = false;
            ArrayList arrayList = new ArrayList();
            ArrayList arrayList2 = new ArrayList();
            for (Map map2 : list) {
                h(map2);
                Object obj2 = map2.get(SessionGatingKeys.FULL_SESSION_ERROR_LOGS);
                List list2 = obj2 instanceof List ? (List) obj2 : null;
                if (list2 != null) {
                    i.B(arrayList, list2);
                }
                Object obj3 = map2.get("extensions");
                Map map3 = obj3 instanceof Map ? (Map) obj3 : null;
                if (map3 != null) {
                    arrayList2.add(map3);
                }
            }
            if (arrayList.isEmpty()) {
                this.a.remove(SessionGatingKeys.FULL_SESSION_ERROR_LOGS);
            } else {
                this.a.put(SessionGatingKeys.FULL_SESSION_ERROR_LOGS, arrayList);
            }
            if (arrayList2.isEmpty()) {
                this.a.remove("extensions");
            } else {
                this.a.put("extensions", t.f(du8.a("incremental", arrayList2)));
            }
        }
        Boolean bool = (Boolean) map.get("hasNext");
        this.e = bool != null ? bool.booleanValue() : false;
        return this.b;
    }

    public final void j() {
        this.a.clear();
        this.c.clear();
        this.e = true;
        this.f = false;
    }
}
