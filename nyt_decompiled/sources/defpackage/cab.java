package defpackage;

import android.content.Context;
import android.content.SharedPreferences;
import com.google.android.gms.common.GooglePlayServicesUtilLight;
import com.google.android.gms.dynamite.DynamiteModule;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.ads.dynamite.ModuleDescriptor;
import com.google.android.gms.internal.ads.zb;
import com.google.android.gms.internal.ads.zzcei;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public final class cab extends dab {
    private final Object a = new Object();
    private final Context b;
    private SharedPreferences c;
    private final u1b d;

    public cab(Context context, u1b u1bVar) {
        this.b = context.getApplicationContext();
        this.d = u1bVar;
    }

    public static JSONObject c(Context context) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("js", zzcei.t0().zza);
            jSONObject.put("mf", vra.a.e());
            jSONObject.put("cl", "610756093");
            jSONObject.put("rapid_rc", "dev");
            jSONObject.put("rapid_rollup", "HEAD");
            jSONObject.put("admob_module_version", GooglePlayServicesUtilLight.GOOGLE_PLAY_SERVICES_VERSION_CODE);
            jSONObject.put("dynamite_local_version", ModuleDescriptor.MODULE_VERSION);
            jSONObject.put("dynamite_version", DynamiteModule.c(context, ModuleDescriptor.MODULE_ID));
            jSONObject.put("container_version", GooglePlayServicesUtilLight.GOOGLE_PLAY_SERVICES_VERSION_CODE);
        } catch (JSONException unused) {
        }
        return jSONObject;
    }

    @Override // defpackage.dab
    public final j64 a() {
        synchronized (this.a) {
            try {
                if (this.c == null) {
                    this.c = this.b.getSharedPreferences("google_ads_flags_meta", 0);
                }
            } finally {
            }
        }
        if (dyf.b().currentTimeMillis() - this.c.getLong("js_last_update", 0L) < ((Long) vra.b.e()).longValue()) {
            return zb.h(null);
        }
        return zb.m(this.d.zzb(c(this.b)), new gge() { // from class: bab
            @Override // defpackage.gge
            public final Object apply(Object obj) {
                cab.this.b((JSONObject) obj);
                return null;
            }
        }, pgb.f);
    }

    final /* synthetic */ Void b(JSONObject jSONObject) {
        zoa zoaVar = mpa.a;
        pla.b();
        SharedPreferences.Editor edit = bpa.a(this.b).edit();
        pla.a();
        cra craVar = hra.a;
        pla.a().e(edit, 1, jSONObject);
        pla.b();
        edit.commit();
        this.c.edit().putLong("js_last_update", dyf.b().currentTimeMillis()).apply();
        return null;
    }
}
