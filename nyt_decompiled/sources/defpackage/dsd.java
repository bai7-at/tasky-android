package defpackage;

import java.util.Iterator;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public final class dsd implements fqd {
    private final JSONObject a;

    public dsd(JSONObject jSONObject) {
        this.a = jSONObject;
    }

    @Override // defpackage.fqd
    public final /* bridge */ /* synthetic */ void a(Object obj) {
        try {
            JSONObject f = t6b.f((JSONObject) obj, "content_info");
            JSONObject jSONObject = this.a;
            Iterator<String> keys = jSONObject.keys();
            while (keys.hasNext()) {
                String next = keys.next();
                f.put(next, jSONObject.get(next));
            }
        } catch (JSONException unused) {
            pzc.k("Failed putting app indexing json.");
        }
    }
}
