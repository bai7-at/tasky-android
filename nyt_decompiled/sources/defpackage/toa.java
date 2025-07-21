package defpackage;

import android.content.SharedPreferences;
import android.os.Bundle;
import org.json.JSONObject;

/* loaded from: classes3.dex */
final class toa extends zoa {
    toa(int i, String str, Boolean bool) {
        super(i, str, bool, null);
    }

    @Override // defpackage.zoa
    public final /* bridge */ /* synthetic */ Object a(JSONObject jSONObject) {
        return Boolean.valueOf(jSONObject.optBoolean(n(), ((Boolean) m()).booleanValue()));
    }

    @Override // defpackage.zoa
    public final /* bridge */ /* synthetic */ Object b(Bundle bundle) {
        return bundle.containsKey("com.google.android.gms.ads.flag.".concat(n())) ? Boolean.valueOf(bundle.getBoolean("com.google.android.gms.ads.flag.".concat(n()))) : (Boolean) m();
    }

    @Override // defpackage.zoa
    public final /* bridge */ /* synthetic */ Object c(SharedPreferences sharedPreferences) {
        return Boolean.valueOf(sharedPreferences.getBoolean(n(), ((Boolean) m()).booleanValue()));
    }

    @Override // defpackage.zoa
    public final /* bridge */ /* synthetic */ void d(SharedPreferences.Editor editor, Object obj) {
        editor.putBoolean(n(), ((Boolean) obj).booleanValue());
    }
}
