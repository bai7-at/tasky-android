package defpackage;

import android.content.SharedPreferences;
import android.preference.PreferenceManager;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;

/* loaded from: classes3.dex */
final class fxa implements uxa {
    fxa() {
    }

    @Override // defpackage.uxa
    public final /* bridge */ /* synthetic */ void a(Object obj, Map map) {
        wlb wlbVar = (wlb) obj;
        try {
            JSONArray jSONArray = new JSONArray((String) map.get("args"));
            SharedPreferences.Editor edit = PreferenceManager.getDefaultSharedPreferences(wlbVar.getContext()).edit();
            for (int i = 0; i < jSONArray.length(); i++) {
                edit.remove(jSONArray.getString(i));
            }
            edit.apply();
        } catch (JSONException e) {
            dyf.q().w(e, "GMSG clear local storage keys handler");
        }
    }
}
