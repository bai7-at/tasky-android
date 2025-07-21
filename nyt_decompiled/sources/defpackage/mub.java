package defpackage;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public final class mub {
    private final Map a;
    private final Map b;

    mub(Map map, Map map2) {
        this.a = map;
        this.b = map2;
    }

    public final void a(g1e g1eVar) {
        for (e1e e1eVar : g1eVar.b.c) {
            if (this.a.containsKey(e1eVar.a)) {
                ((pub) this.a.get(e1eVar.a)).a(e1eVar.b);
            } else if (this.b.containsKey(e1eVar.a)) {
                oub oubVar = (oub) this.b.get(e1eVar.a);
                JSONObject jSONObject = e1eVar.b;
                HashMap hashMap = new HashMap();
                Iterator<String> keys = jSONObject.keys();
                while (keys.hasNext()) {
                    String next = keys.next();
                    String optString = jSONObject.optString(next);
                    if (optString != null) {
                        hashMap.put(next, optString);
                    }
                }
                oubVar.a(hashMap);
            }
        }
    }
}
