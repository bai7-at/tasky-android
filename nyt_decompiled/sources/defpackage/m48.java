package defpackage;

import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.i;
import com.squareup.moshi.j;
import java.lang.reflect.ParameterizedType;
import java.util.Set;

/* loaded from: classes4.dex */
public final class m48 {
    private final ParameterizedType a;
    private final JsonAdapter b;

    public m48() {
        ParameterizedType j = j.j(Set.class, String.class);
        zq3.g(j, "newParameterizedType(...)");
        this.a = j;
        JsonAdapter d = new i.b().d().d(j);
        zq3.g(d, "adapter(...)");
        this.b = d;
    }

    public final String a(Set set) {
        zq3.h(set, "stringSet");
        String json = this.b.toJson(set);
        zq3.g(json, "toJson(...)");
        return json;
    }

    public final Set b(String str) {
        zq3.h(str, "jsonString");
        return (Set) this.b.fromJson(str);
    }
}
