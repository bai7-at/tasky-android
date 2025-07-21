package defpackage;

import android.content.SharedPreferences;
import android.os.Bundle;
import org.json.JSONObject;

/* loaded from: classes3.dex */
final class woa extends zoa {
    woa(int i, String str, Float f) {
        super(1, str, f, null);
    }

    @Override // defpackage.zoa
    public final /* bridge */ /* synthetic */ Object a(JSONObject jSONObject) {
        return Float.valueOf((float) jSONObject.optDouble(n(), ((Float) m()).floatValue()));
    }

    @Override // defpackage.zoa
    public final /* bridge */ /* synthetic */ Object b(Bundle bundle) {
        return bundle.containsKey("com.google.android.gms.ads.flag.".concat(n())) ? Float.valueOf(bundle.getFloat("com.google.android.gms.ads.flag.".concat(n()))) : (Float) m();
    }

    @Override // defpackage.zoa
    public final /* bridge */ /* synthetic */ Object c(SharedPreferences sharedPreferences) {
        return Float.valueOf(sharedPreferences.getFloat(n(), ((Float) m()).floatValue()));
    }

    @Override // defpackage.zoa
    public final /* bridge */ /* synthetic */ void d(SharedPreferences.Editor editor, Object obj) {
        editor.putFloat(n(), ((Float) obj).floatValue());
    }
}
