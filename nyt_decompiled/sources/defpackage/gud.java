package defpackage;

import android.os.Bundle;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public final class gud implements fqd {
    private final Bundle a;

    public gud(Bundle bundle) {
        this.a = bundle;
    }

    @Override // defpackage.fqd
    public final /* bridge */ /* synthetic */ void a(Object obj) {
        JSONObject jSONObject = (JSONObject) obj;
        if (this.a != null) {
            try {
                t6b.f(t6b.f(jSONObject, "device"), "play_store").put("parental_controls", kia.b().j(this.a));
            } catch (JSONException unused) {
                pzc.k("Failed putting parental controls bundle.");
            }
        }
    }
}
