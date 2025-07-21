package defpackage;

import android.os.Bundle;
import com.facebook.AuthenticationTokenClaims;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public class fc0 implements yc, hc0 {
    private gc0 a;

    private static String b(String str, Bundle bundle) {
        JSONObject jSONObject = new JSONObject();
        JSONObject jSONObject2 = new JSONObject();
        for (String str2 : bundle.keySet()) {
            jSONObject2.put(str2, bundle.get(str2));
        }
        jSONObject.put(AuthenticationTokenClaims.JSON_KEY_NAME, str);
        jSONObject.put("parameters", jSONObject2);
        return jSONObject.toString();
    }

    @Override // defpackage.hc0
    public void a(gc0 gc0Var) {
        this.a = gc0Var;
        m94.f().b("Registered Firebase Analytics event receiver for breadcrumbs");
    }

    @Override // defpackage.yc
    public void r0(String str, Bundle bundle) {
        gc0 gc0Var = this.a;
        if (gc0Var != null) {
            try {
                gc0Var.a("$A$:" + b(str, bundle));
            } catch (JSONException unused) {
                m94.f().k("Unable to serialize Firebase Analytics event to breadcrumb.");
            }
        }
    }
}
