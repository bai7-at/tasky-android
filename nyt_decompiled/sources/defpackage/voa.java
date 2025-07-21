package defpackage;

import android.content.SharedPreferences;
import android.os.Bundle;
import org.json.JSONObject;

/* loaded from: classes3.dex */
final class voa extends zoa {
    voa(int i, String str, Long l) {
        super(1, str, l, null);
    }

    @Override // defpackage.zoa
    public final /* bridge */ /* synthetic */ Object a(JSONObject jSONObject) {
        return Long.valueOf(jSONObject.optLong(n(), ((Long) m()).longValue()));
    }

    @Override // defpackage.zoa
    public final /* bridge */ /* synthetic */ Object b(Bundle bundle) {
        return bundle.containsKey("com.google.android.gms.ads.flag.".concat(n())) ? Long.valueOf(bundle.getLong("com.google.android.gms.ads.flag.".concat(n()))) : (Long) m();
    }

    @Override // defpackage.zoa
    public final /* bridge */ /* synthetic */ Object c(SharedPreferences sharedPreferences) {
        return Long.valueOf(sharedPreferences.getLong(n(), ((Long) m()).longValue()));
    }

    @Override // defpackage.zoa
    public final /* bridge */ /* synthetic */ void d(SharedPreferences.Editor editor, Object obj) {
        editor.putLong(n(), ((Long) obj).longValue());
    }
}
