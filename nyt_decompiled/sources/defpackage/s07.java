package defpackage;

import com.apollographql.apollo.api.json.JsonReader;
import com.apollographql.apollo.api.json.a;
import defpackage.ii5;
import defpackage.yj;
import io.embrace.android.embracesdk.gating.SessionGatingKeys;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.UUID;

/* loaded from: classes2.dex */
public final class s07 {
    public static final s07 a = new s07();

    private s07() {
    }

    public final yj a(JsonReader jsonReader, ii5 ii5Var, UUID uuid, w41 w41Var, Set set) {
        zq3.h(jsonReader, "jsonReader");
        zq3.h(ii5Var, "operation");
        zq3.h(w41Var, "customScalarAdapters");
        jsonReader.beginObject();
        ii5.a aVar = null;
        List list = null;
        Map map = null;
        while (jsonReader.hasNext()) {
            String nextName = jsonReader.nextName();
            int hashCode = nextName.hashCode();
            if (hashCode != -1809421292) {
                if (hashCode != -1294635157) {
                    if (hashCode == 3076010 && nextName.equals("data")) {
                        aVar = (ii5.a) k62.b(ii5Var, jsonReader, w41Var, k62.a(ii5Var, w41Var), set, list);
                    }
                    jsonReader.skipValue();
                } else if (nextName.equals(SessionGatingKeys.FULL_SESSION_ERROR_LOGS)) {
                    list = t07.d(jsonReader);
                } else {
                    jsonReader.skipValue();
                }
            } else if (nextName.equals("extensions")) {
                Object d = a.d(jsonReader);
                map = d instanceof Map ? (Map) d : null;
            } else {
                jsonReader.skipValue();
            }
        }
        jsonReader.endObject();
        if (uuid == null) {
            uuid = UUID.randomUUID();
            zq3.g(uuid, "randomUUID(...)");
        }
        return new yj.a(ii5Var, uuid).d(list).c(aVar).f(map).b();
    }
}
