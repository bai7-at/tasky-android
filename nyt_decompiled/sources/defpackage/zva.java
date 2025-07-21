package defpackage;

import android.os.Bundle;
import com.facebook.AuthenticationTokenClaims;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public final class zva implements uxa {
    private final awa a;

    public zva(awa awaVar) {
        this.a = awaVar;
    }

    @Override // defpackage.uxa
    public final void a(Object obj, Map map) {
        if (this.a == null) {
            return;
        }
        String str = (String) map.get(AuthenticationTokenClaims.JSON_KEY_NAME);
        if (str == null) {
            fgb.f("Ad metadata with no name parameter.");
            str = "";
        }
        Bundle bundle = null;
        if (map.containsKey("info")) {
            try {
                bundle = t6b.a(new JSONObject((String) map.get("info")));
            } catch (JSONException e) {
                fgb.e("Failed to convert ad metadata to JSON.", e);
            }
        }
        if (bundle == null) {
            fgb.d("Failed to convert ad metadata to Bundle.");
        } else {
            this.a.i0(str, bundle);
        }
    }
}
