package defpackage;

import com.apollographql.apollo.api.json.JsonReader;
import defpackage.j62;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* loaded from: classes2.dex */
public abstract class k62 {
    public static final Set a(j62 j62Var, w41 w41Var) {
        zq3.h(j62Var, "<this>");
        zq3.h(w41Var, "customScalarAdapters");
        Map a = c(j62Var, w41Var, true).a();
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Map.Entry entry : a.entrySet()) {
            if (zq3.c(entry.getValue(), Boolean.FALSE)) {
                linkedHashMap.put(entry.getKey(), entry.getValue());
            }
        }
        return linkedHashMap.keySet();
    }

    public static final j62.a b(j62 j62Var, JsonReader jsonReader, w41 w41Var, Set set, Set set2, List list) {
        zq3.h(j62Var, "<this>");
        zq3.h(jsonReader, "jsonReader");
        zq3.h(w41Var, "customScalarAdapters");
        return (j62.a) j8.b(j62Var.a()).fromJson(jsonReader, w41Var.g().g(set).e(set2).f(list).c());
    }

    public static final j62.b c(j62 j62Var, w41 w41Var, boolean z) {
        zq3.h(j62Var, "<this>");
        zq3.h(w41Var, "customScalarAdapters");
        qe4 qe4Var = new qe4();
        qe4Var.beginObject();
        j62Var.c(qe4Var, w41Var, z);
        qe4Var.endObject();
        Object d = qe4Var.d();
        zq3.f(d, "null cannot be cast to non-null type kotlin.collections.Map<kotlin.String, kotlin.Any?>");
        return new j62.b((Map) d);
    }
}
