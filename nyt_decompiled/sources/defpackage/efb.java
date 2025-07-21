package defpackage;

import android.text.TextUtils;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public final class efb {
    private String d;
    private String e;
    private long f;
    private JSONObject g;
    private boolean h;
    private boolean j;
    private final List a = new ArrayList();
    private final List b = new ArrayList();
    private final Map c = new HashMap();
    private final List i = new ArrayList();

    public efb(String str, long j) {
        JSONObject optJSONObject;
        JSONObject optJSONObject2;
        JSONArray optJSONArray;
        JSONObject optJSONObject3;
        this.d = "";
        this.h = false;
        this.j = false;
        this.e = str;
        this.f = j;
        if (TextUtils.isEmpty(str)) {
            return;
        }
        try {
            this.g = new JSONObject(str);
            if (((Boolean) pla.c().a(mpa.db)).booleanValue() && j()) {
                return;
            }
            if (this.g.optInt("status", -1) != 1) {
                this.h = false;
                fgb.g("App settings could not be fetched successfully.");
                return;
            }
            this.h = true;
            this.d = this.g.optString("app_id");
            JSONArray optJSONArray2 = this.g.optJSONArray("ad_unit_id_settings");
            if (optJSONArray2 != null) {
                for (int i = 0; i < optJSONArray2.length(); i++) {
                    JSONObject jSONObject = optJSONArray2.getJSONObject(i);
                    String optString = jSONObject.optString("format");
                    String optString2 = jSONObject.optString("ad_unit_id");
                    if (!TextUtils.isEmpty(optString) && !TextUtils.isEmpty(optString2)) {
                        if ("interstitial".equalsIgnoreCase(optString)) {
                            this.b.add(optString2);
                        } else if (("rewarded".equalsIgnoreCase(optString) || "rewarded_interstitial".equals(optString)) && (optJSONObject3 = jSONObject.optJSONObject("mediation_config")) != null) {
                            this.c.put(optString2, new b3b(optJSONObject3));
                        }
                    }
                }
            }
            JSONArray optJSONArray3 = this.g.optJSONArray("persistable_banner_ad_unit_ids");
            if (optJSONArray3 != null) {
                for (int i2 = 0; i2 < optJSONArray3.length(); i2++) {
                    this.a.add(optJSONArray3.optString(i2));
                }
            }
            if (((Boolean) pla.c().a(mpa.U6)).booleanValue() && (optJSONObject2 = this.g.optJSONObject("common_settings")) != null && (optJSONArray = optJSONObject2.optJSONArray("loeid")) != null) {
                for (int i3 = 0; i3 < optJSONArray.length(); i3++) {
                    this.i.add(optJSONArray.get(i3).toString());
                }
            }
            if (!((Boolean) pla.c().a(mpa.p6)).booleanValue() || (optJSONObject = this.g.optJSONObject("common_settings")) == null) {
                return;
            }
            this.j = optJSONObject.optBoolean("is_prefetching_enabled", false);
        } catch (JSONException e) {
            fgb.h("Exception occurred while processing app setting json", e);
            dyf.q().w(e, "AppSettings.parseAppSettingsJson");
        }
    }

    public final long a() {
        return this.f;
    }

    public final String b() {
        return this.d;
    }

    public final String c() {
        return this.e;
    }

    public final List d() {
        return this.i;
    }

    public final Map e() {
        return this.c;
    }

    public final JSONObject f() {
        return this.g;
    }

    public final void g(long j) {
        this.f = j;
    }

    public final boolean h() {
        return this.j;
    }

    public final boolean i() {
        return this.h;
    }

    public final boolean j() {
        if (!TextUtils.isEmpty(this.e) && this.g != null) {
            zoa zoaVar = mpa.gb;
            long longValue = ((Long) pla.c().a(zoaVar)).longValue();
            if (((Boolean) pla.c().a(mpa.fb)).booleanValue() && !TextUtils.isEmpty(this.e)) {
                longValue = this.g.optLong("cache_ttl_sec", ((Long) pla.c().a(zoaVar)).longValue());
            }
            long currentTimeMillis = dyf.b().currentTimeMillis();
            if (longValue >= 0) {
                long j = this.f;
                if (j > currentTimeMillis || TimeUnit.MILLISECONDS.toSeconds(currentTimeMillis - j) > longValue) {
                    this.a.clear();
                    this.b.clear();
                    this.c.clear();
                    this.d = "";
                    this.e = "";
                    this.g = null;
                    this.h = false;
                    this.i.clear();
                    this.j = false;
                    return true;
                }
            }
        }
        return false;
    }
}
