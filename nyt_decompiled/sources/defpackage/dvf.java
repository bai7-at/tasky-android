package defpackage;

import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Bundle;
import com.google.ads.mediation.admob.AdMobAdapter;
import com.google.android.gms.ads.internal.client.zzl;
import com.google.android.gms.common.wrappers.Wrappers;
import com.google.android.gms.internal.ads.zzcei;
import java.util.Map;
import java.util.TreeMap;

/* loaded from: classes2.dex */
final class dvf {
    private final Context a;
    private final String b;
    private final Map c = new TreeMap();
    private String d;
    private String e;
    private final String f;

    public dvf(Context context, String str) {
        String concat;
        this.a = context.getApplicationContext();
        this.b = str;
        String packageName = context.getPackageName();
        try {
            concat = packageName + "-" + Wrappers.packageManager(context).getPackageInfo(context.getPackageName(), 0).versionName;
        } catch (PackageManager.NameNotFoundException e) {
            fgb.e("Unable to get package version name for reporting", e);
            concat = String.valueOf(packageName).concat("-missing");
        }
        this.f = concat;
    }

    public final String a() {
        return this.f;
    }

    public final String b() {
        return this.e;
    }

    public final String c() {
        return this.b;
    }

    public final String d() {
        return this.d;
    }

    public final Map e() {
        return this.c;
    }

    public final void f(zzl zzlVar, zzcei zzceiVar) {
        this.d = zzlVar.zzj.zza;
        Bundle bundle = zzlVar.zzm;
        Bundle bundle2 = bundle != null ? bundle.getBundle(AdMobAdapter.class.getName()) : null;
        if (bundle2 == null) {
            return;
        }
        String str = (String) era.c.e();
        for (String str2 : bundle2.keySet()) {
            if (str.equals(str2)) {
                this.e = bundle2.getString(str2);
            } else if (str2.startsWith("csa_")) {
                this.c.put(str2.substring(4), bundle2.getString(str2));
            }
        }
        this.c.put("SDKVersion", zzceiVar.zza);
        if (((Boolean) era.a.e()).booleanValue()) {
            Bundle b = wv9.b(this.a, (String) era.b.e());
            for (String str3 : b.keySet()) {
                this.c.put(str3, b.get(str3).toString());
            }
        }
    }
}
