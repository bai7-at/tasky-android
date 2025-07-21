package defpackage;

import android.os.Bundle;
import com.google.firebase.remoteconfig.internal.b;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public class ks5 {
    private final q76 a;
    private final Map b = Collections.synchronizedMap(new HashMap());

    public ks5(q76 q76Var) {
        this.a = q76Var;
    }

    public void a(String str, b bVar) {
        JSONObject optJSONObject;
        oc ocVar = (oc) this.a.get();
        if (ocVar == null) {
            return;
        }
        JSONObject f = bVar.f();
        if (f.length() < 1) {
            return;
        }
        JSONObject d = bVar.d();
        if (d.length() >= 1 && (optJSONObject = f.optJSONObject(str)) != null) {
            String optString = optJSONObject.optString("choiceId");
            if (optString.isEmpty()) {
                return;
            }
            synchronized (this.b) {
                try {
                    if (optString.equals(this.b.get(str))) {
                        return;
                    }
                    this.b.put(str, optString);
                    Bundle bundle = new Bundle();
                    bundle.putString("arm_key", str);
                    bundle.putString("arm_value", d.optString(str));
                    bundle.putString("personalization_id", optJSONObject.optString("personalizationId"));
                    bundle.putInt("arm_index", optJSONObject.optInt("armIndex", -1));
                    bundle.putString("group", optJSONObject.optString("group"));
                    ocVar.b("fp", "personalization_assignment", bundle);
                    Bundle bundle2 = new Bundle();
                    bundle2.putString("_fpid", optString);
                    ocVar.b("fp", "_fpc", bundle2);
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }
}
