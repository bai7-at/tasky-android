package defpackage;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.text.TextUtils;
import com.google.android.gms.common.wrappers.Wrappers;
import com.google.android.gms.internal.ads.zb;
import com.google.android.gms.internal.ads.zzcei;
import io.embrace.android.embracesdk.config.behavior.BackgroundActivityBehavior;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public final class ozc {
    private Context a;
    private long b = 0;

    public final void a(Context context, zzcei zzceiVar, String str, Runnable runnable, v7e v7eVar) {
        b(context, zzceiVar, true, null, str, null, runnable, v7eVar);
    }

    final void b(Context context, zzcei zzceiVar, boolean z, efb efbVar, String str, String str2, Runnable runnable, final v7e v7eVar) {
        PackageInfo packageInfo;
        if (dyf.b().elapsedRealtime() - this.b < BackgroundActivityBehavior.MIN_BACKGROUND_ACTIVITY_DURATION_DEFAULT) {
            fgb.g("Not retrying to fetch app settings");
            return;
        }
        this.b = dyf.b().elapsedRealtime();
        if (efbVar != null && !TextUtils.isEmpty(efbVar.c())) {
            if (dyf.b().currentTimeMillis() - efbVar.a() <= ((Long) pla.c().a(mpa.Y3)).longValue() && efbVar.i()) {
                return;
            }
        }
        if (context == null) {
            fgb.g("Context not provided to fetch application settings");
            return;
        }
        if (TextUtils.isEmpty(str) && TextUtils.isEmpty(str2)) {
            fgb.g("App settings could not be fetched. Required parameters missing");
            return;
        }
        Context applicationContext = context.getApplicationContext();
        if (applicationContext == null) {
            applicationContext = context;
        }
        this.a = applicationContext;
        final f7e a = e7e.a(context, 4);
        a.zzh();
        e2b a2 = dyf.h().a(this.a, zzceiVar, v7eVar);
        y1b y1bVar = b2b.b;
        u1b a3 = a2.a("google.afma.config.fetchAppSettings", y1bVar, y1bVar);
        try {
            JSONObject jSONObject = new JSONObject();
            if (!TextUtils.isEmpty(str)) {
                jSONObject.put("app_id", str);
            } else if (!TextUtils.isEmpty(str2)) {
                jSONObject.put("ad_unit_id", str2);
            }
            jSONObject.put("is_init", z);
            jSONObject.put("pn", context.getPackageName());
            zoa zoaVar = mpa.a;
            jSONObject.put("experiment_ids", TextUtils.join(",", pla.a().a()));
            jSONObject.put("js", zzceiVar.zza);
            try {
                ApplicationInfo applicationInfo = this.a.getApplicationInfo();
                if (applicationInfo != null && (packageInfo = Wrappers.packageManager(context).getPackageInfo(applicationInfo.packageName, 0)) != null) {
                    jSONObject.put("version", packageInfo.versionCode);
                }
            } catch (PackageManager.NameNotFoundException unused) {
                pzc.k("Error fetching PackageInfo.");
            }
            j64 zzb = a3.zzb(jSONObject);
            ake akeVar = new ake() { // from class: o5c
                @Override // defpackage.ake
                public final j64 zza(Object obj) {
                    JSONObject jSONObject2 = (JSONObject) obj;
                    boolean optBoolean = jSONObject2.optBoolean("isSuccessful", false);
                    if (optBoolean) {
                        dyf.q().i().q(jSONObject2.getString("appSettingsJson"));
                    }
                    f7e f7eVar = a;
                    v7e v7eVar2 = v7e.this;
                    f7eVar.S(optBoolean);
                    v7eVar2.b(f7eVar.zzl());
                    return zb.h(null);
                }
            };
            kke kkeVar = pgb.f;
            j64 n = zb.n(zzb, akeVar, kkeVar);
            if (runnable != null) {
                zzb.a(runnable, kkeVar);
            }
            sgb.a(n, "ConfigLoader.maybeFetchNewAppSettings");
        } catch (Exception e) {
            fgb.e("Error requesting application settings", e);
            a.d(e);
            a.S(false);
            v7eVar.b(a.zzl());
        }
    }

    public final void c(Context context, zzcei zzceiVar, String str, efb efbVar, v7e v7eVar) {
        b(context, zzceiVar, false, efbVar, efbVar != null ? efbVar.b() : null, str, null, v7eVar);
    }
}
