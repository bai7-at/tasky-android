package defpackage;

import android.text.TextUtils;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public final class avd implements fqd {
    private final String a;

    public avd(String str) {
        this.a = str;
    }

    @Override // defpackage.fqd
    public final /* bridge */ /* synthetic */ void a(Object obj) {
        JSONObject jSONObject = (JSONObject) obj;
        try {
            if (TextUtils.isEmpty(this.a)) {
                return;
            }
            t6b.f(jSONObject, "pii").put("adsid", this.a);
        } catch (JSONException e) {
            fgb.h("Failed putting trustless token.", e);
        }
    }
}
