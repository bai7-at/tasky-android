package defpackage;

import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes3.dex */
final class hwc {
    private Long a;
    private final String b;
    private String c;
    private Integer d;
    private String e;
    private Integer f;

    /* synthetic */ hwc(String str, gwc gwcVar) {
        this.b = str;
    }

    static /* bridge */ /* synthetic */ String a(hwc hwcVar) {
        String str = (String) pla.c().a(mpa.I9);
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.putOpt("objectId", hwcVar.a);
            jSONObject.put("eventCategory", hwcVar.b);
            jSONObject.putOpt("event", hwcVar.c);
            jSONObject.putOpt("errorCode", hwcVar.d);
            jSONObject.putOpt("rewardType", hwcVar.e);
            jSONObject.putOpt("rewardAmount", hwcVar.f);
        } catch (JSONException unused) {
            fgb.g("Could not convert parameters to JSON.");
        }
        return str + "(\"h5adsEvent\"," + jSONObject.toString() + ");";
    }
}
