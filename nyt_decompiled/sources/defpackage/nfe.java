package defpackage;

import android.content.SharedPreferences;
import android.os.Bundle;
import org.json.JSONObject;

/* loaded from: classes3.dex */
final class nfe extends xie {
    nfe(int i, String str, Boolean bool) {
        super(i, str, bool, null);
    }

    @Override // defpackage.xie
    public final /* bridge */ /* synthetic */ Object a(JSONObject jSONObject) {
        return Boolean.valueOf(jSONObject.optBoolean(l(), ((Boolean) k()).booleanValue()));
    }

    @Override // defpackage.xie
    public final /* bridge */ /* synthetic */ Object b(Bundle bundle) {
        return bundle.containsKey("com.google.android.gms.ads.flag.".concat(l())) ? Boolean.valueOf(bundle.getBoolean("com.google.android.gms.ads.flag.".concat(l()))) : (Boolean) k();
    }

    @Override // defpackage.xie
    public final /* bridge */ /* synthetic */ Object c(SharedPreferences sharedPreferences) {
        return Boolean.valueOf(sharedPreferences.getBoolean(l(), ((Boolean) k()).booleanValue()));
    }
}
