package defpackage;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public final class a3b {
    public final String a;
    public final String b;
    public final List c;
    public final String d;
    public final String e;
    public final List f;
    public final List g;
    public final List h;
    public final List i;
    public final List j;
    public final String k;
    public final List l;
    public final List m;
    public final List n;
    public final String o;
    public final String p;
    public final String q;
    public final String r;
    public final String s;
    public final List t;
    public final String u;
    public final String v;

    public a3b(JSONObject jSONObject) {
        List list;
        this.b = jSONObject.optString("id");
        JSONArray jSONArray = jSONObject.getJSONArray("adapters");
        ArrayList arrayList = new ArrayList(jSONArray.length());
        for (int i = 0; i < jSONArray.length(); i++) {
            arrayList.add(jSONArray.getString(i));
        }
        this.c = Collections.unmodifiableList(arrayList);
        this.d = jSONObject.optString("allocation_id", null);
        dyf.i();
        this.f = c3b.a(jSONObject, "clickurl");
        dyf.i();
        this.g = c3b.a(jSONObject, "imp_urls");
        dyf.i();
        this.h = c3b.a(jSONObject, "downloaded_imp_urls");
        dyf.i();
        this.j = c3b.a(jSONObject, "fill_urls");
        dyf.i();
        this.l = c3b.a(jSONObject, "video_start_urls");
        dyf.i();
        this.n = c3b.a(jSONObject, "video_complete_urls");
        dyf.i();
        this.m = c3b.a(jSONObject, "video_reward_urls");
        this.o = jSONObject.optString("transaction_id");
        this.p = jSONObject.optString("valid_from_timestamp");
        JSONObject optJSONObject = jSONObject.optJSONObject("ad");
        if (optJSONObject != null) {
            dyf.i();
            list = c3b.a(optJSONObject, "manual_impression_urls");
        } else {
            list = null;
        }
        this.i = list;
        this.a = optJSONObject != null ? optJSONObject.toString() : null;
        JSONObject optJSONObject2 = jSONObject.optJSONObject("data");
        this.k = optJSONObject2 != null ? optJSONObject2.toString() : null;
        this.e = optJSONObject2 != null ? optJSONObject2.optString("class_name") : null;
        this.q = jSONObject.optString("html_template", null);
        this.r = jSONObject.optString("ad_base_url", null);
        JSONObject optJSONObject3 = jSONObject.optJSONObject("assets");
        this.s = optJSONObject3 != null ? optJSONObject3.toString() : null;
        dyf.i();
        this.t = c3b.a(jSONObject, "template_ids");
        JSONObject optJSONObject4 = jSONObject.optJSONObject("ad_loader_options");
        this.u = optJSONObject4 != null ? optJSONObject4.toString() : null;
        this.v = jSONObject.optString("response_type", null);
        jSONObject.optLong("ad_network_timeout_millis", -1L);
    }
}
