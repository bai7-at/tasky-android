package defpackage;

import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public final class wtd implements fqd {
    private final String a;
    private final String b;

    public wtd(String str, String str2) {
        this.a = str;
        this.b = str2;
    }

    @Override // defpackage.fqd
    public final /* bridge */ /* synthetic */ void a(Object obj) {
        try {
            JSONObject f = t6b.f((JSONObject) obj, "pii");
            f.put("doritos", this.a);
            f.put("doritos_v2", this.b);
        } catch (JSONException unused) {
            pzc.k("Failed putting doritos string.");
        }
    }
}
