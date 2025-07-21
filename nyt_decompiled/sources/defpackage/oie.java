package defpackage;

import android.content.SharedPreferences;
import android.os.Bundle;
import org.json.JSONObject;

/* loaded from: classes3.dex */
final class oie extends xie {
    oie(int i, String str, String str2) {
        super(1, str, str2, null);
    }

    @Override // defpackage.xie
    public final /* bridge */ /* synthetic */ Object a(JSONObject jSONObject) {
        return jSONObject.optString(l(), (String) k());
    }

    @Override // defpackage.xie
    public final /* bridge */ /* synthetic */ Object b(Bundle bundle) {
        return bundle.containsKey("com.google.android.gms.ads.flag.".concat(l())) ? bundle.getString("com.google.android.gms.ads.flag.".concat(l())) : (String) k();
    }

    @Override // defpackage.xie
    public final /* bridge */ /* synthetic */ Object c(SharedPreferences sharedPreferences) {
        return sharedPreferences.getString(l(), (String) k());
    }
}
