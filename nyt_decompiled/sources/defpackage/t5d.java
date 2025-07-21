package defpackage;

import android.text.TextUtils;
import java.util.Map;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public final class t5d {
    private final dab a;

    t5d(dab dabVar) {
        this.a = dabVar;
    }

    public static void a(Map map, JSONObject jSONObject) {
        if (jSONObject == null) {
            return;
        }
        JSONObject optJSONObject = jSONObject.optJSONObject("pii");
        if (optJSONObject == null) {
            pzc.k("DSID signal does not exist.");
            return;
        }
        if (!TextUtils.isEmpty(optJSONObject.optString("doritos", ""))) {
            map.put("x-afma-drt-cookie", optJSONObject.optString("doritos", ""));
        }
        if (TextUtils.isEmpty(optJSONObject.optString("doritos_v2", ""))) {
            return;
        }
        map.put("x-afma-drt-v2-cookie", optJSONObject.optString("doritos_v2", ""));
    }

    public final void b() {
        sgb.a(this.a.a(), "persistFlags");
    }
}
