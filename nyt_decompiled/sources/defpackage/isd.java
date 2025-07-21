package defpackage;

import android.text.TextUtils;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public final class isd implements fqd {
    final String a;
    final int b;

    public isd(String str, int i) {
        this.a = str;
        this.b = i;
    }

    @Override // defpackage.fqd
    public final /* bridge */ /* synthetic */ void a(Object obj) {
        JSONObject jSONObject = (JSONObject) obj;
        if (TextUtils.isEmpty(this.a) || this.b == -1) {
            return;
        }
        try {
            JSONObject f = t6b.f(jSONObject, "pii");
            f.put("pvid", this.a);
            f.put("pvid_s", this.b);
        } catch (JSONException e) {
            pzc.l("Failed putting gms core app set ID info.", e);
        }
    }
}
