package defpackage;

import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public final class ssd implements fqd {
    private final JSONObject a;

    public ssd(JSONObject jSONObject) {
        this.a = jSONObject;
    }

    @Override // defpackage.fqd
    public final /* bridge */ /* synthetic */ void a(Object obj) {
        try {
            ((JSONObject) obj).put("cache_state", this.a);
        } catch (JSONException unused) {
            pzc.k("Unable to get cache_state");
        }
    }
}
