package defpackage;

import com.google.android.gms.internal.ads.zzcag;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public final class b3b {
    public final List a;
    public final List b;
    public final List c;
    public final List d;
    public final List e;
    public final List f;
    public final String g;
    public final String h;

    public b3b(JSONObject jSONObject) {
        if (fgb.j(2)) {
            pzc.k("Mediation Response JSON: ".concat(String.valueOf(jSONObject.toString(2))));
        }
        JSONArray jSONArray = jSONObject.getJSONArray("ad_networks");
        ArrayList arrayList = new ArrayList(jSONArray.length());
        int i = -1;
        for (int i2 = 0; i2 < jSONArray.length(); i2++) {
            try {
                a3b a3bVar = new a3b(jSONArray.getJSONObject(i2));
                "banner".equalsIgnoreCase(a3bVar.v);
                arrayList.add(a3bVar);
                if (i < 0) {
                    Iterator it2 = a3bVar.c.iterator();
                    while (true) {
                        if (it2.hasNext()) {
                            if (((String) it2.next()).equals("com.google.ads.mediation.admob.AdMobAdapter")) {
                                i = i2;
                                break;
                            }
                        } else {
                            break;
                        }
                    }
                }
            } catch (JSONException unused) {
            }
        }
        jSONArray.length();
        this.a = Collections.unmodifiableList(arrayList);
        this.g = jSONObject.optString("qdata");
        jSONObject.optInt("fs_model_type", -1);
        jSONObject.optLong("timeout_ms", -1L);
        JSONObject optJSONObject = jSONObject.optJSONObject("settings");
        if (optJSONObject == null) {
            this.b = null;
            this.c = null;
            this.d = null;
            this.e = null;
            this.f = null;
            this.h = null;
            return;
        }
        optJSONObject.optLong("ad_network_timeout_millis", -1L);
        dyf.i();
        this.b = c3b.a(optJSONObject, "click_urls");
        dyf.i();
        this.c = c3b.a(optJSONObject, "imp_urls");
        dyf.i();
        this.d = c3b.a(optJSONObject, "downloaded_imp_urls");
        dyf.i();
        this.e = c3b.a(optJSONObject, "nofill_urls");
        dyf.i();
        this.f = c3b.a(optJSONObject, "remote_ping_urls");
        optJSONObject.optBoolean("render_in_browser", false);
        optJSONObject.optLong("refresh", -1L);
        zzcag t0 = zzcag.t0(optJSONObject.optJSONArray("rewards"));
        if (t0 == null) {
            this.h = null;
        } else {
            this.h = t0.zza;
        }
        optJSONObject.optBoolean("use_displayed_impression", false);
        optJSONObject.optBoolean("allow_pub_rendered_attribution", false);
        optJSONObject.optBoolean("allow_pub_owned_ad_view", false);
        optJSONObject.optBoolean("allow_custom_click_gesture", false);
    }
}
