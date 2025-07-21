package defpackage;

import android.util.JsonReader;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public final class z0e {
    public final String a;
    public final String b;
    public final JSONObject c;
    public final JSONObject d;

    z0e(JsonReader jsonReader) {
        JSONObject h = t6b.h(jsonReader);
        this.d = h;
        this.a = h.optString("ad_html", null);
        this.b = h.optString("ad_base_url", null);
        this.c = h.optJSONObject("ad_json");
    }
}
