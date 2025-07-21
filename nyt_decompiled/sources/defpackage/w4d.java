package defpackage;

import org.json.JSONObject;

/* loaded from: classes3.dex */
final class w4d implements x1b {
    w4d() {
    }

    @Override // defpackage.x1b
    public final /* bridge */ /* synthetic */ JSONObject zzb(Object obj) {
        x4d x4dVar = (x4d) obj;
        JSONObject jSONObject = new JSONObject();
        JSONObject jSONObject2 = new JSONObject();
        JSONObject jSONObject3 = new JSONObject();
        if (((Boolean) pla.c().a(mpa.g9)).booleanValue()) {
            jSONObject2.put("ad_request_url", x4dVar.c.e());
            jSONObject2.put("ad_request_post_body", x4dVar.c.d());
        }
        jSONObject2.put("base_url", x4dVar.c.b());
        jSONObject2.put("signals", x4dVar.b);
        jSONObject3.put("body", x4dVar.a.c);
        jSONObject3.put("headers", kia.b().k(x4dVar.a.b));
        jSONObject3.put("response_code", x4dVar.a.a);
        jSONObject3.put("latency", x4dVar.a.d);
        jSONObject.put("request", jSONObject2);
        jSONObject.put("response", jSONObject3);
        jSONObject.put("flags", x4dVar.c.g());
        return jSONObject;
    }
}
