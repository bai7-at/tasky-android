package defpackage;

import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public final class vkc extends wkc {
    private final JSONObject b;
    private final boolean c;
    private final boolean d;
    private final boolean e;
    private final boolean f;
    private final String g;
    private final JSONObject h;

    public vkc(v0e v0eVar, JSONObject jSONObject) {
        super(v0eVar);
        this.b = t6b.g(jSONObject, "tracking_urls_and_actions", "active_view");
        this.c = t6b.k(false, jSONObject, "allow_pub_owned_ad_view");
        this.d = t6b.k(false, jSONObject, "attribution", "allow_pub_rendering");
        this.e = t6b.k(false, jSONObject, "enable_omid");
        this.g = t6b.b("", jSONObject, "watermark_overlay_png_base64");
        this.f = jSONObject.optJSONObject("overlay") != null;
        this.h = ((Boolean) pla.c().a(mpa.Y4)).booleanValue() ? jSONObject.optJSONObject("omid_settings") : null;
    }

    @Override // defpackage.wkc
    public final v1e a() {
        JSONObject jSONObject = this.h;
        return jSONObject != null ? new v1e(jSONObject) : this.a.W;
    }

    @Override // defpackage.wkc
    public final String b() {
        return this.g;
    }

    @Override // defpackage.wkc
    public final JSONObject c() {
        JSONObject jSONObject = this.b;
        if (jSONObject != null) {
            return jSONObject;
        }
        try {
            return new JSONObject(this.a.A);
        } catch (JSONException unused) {
            return null;
        }
    }

    @Override // defpackage.wkc
    public final boolean d() {
        return this.e;
    }

    @Override // defpackage.wkc
    public final boolean e() {
        return this.c;
    }

    @Override // defpackage.wkc
    public final boolean f() {
        return this.d;
    }

    @Override // defpackage.wkc
    public final boolean g() {
        return this.f;
    }
}
