package defpackage;

import android.os.RemoteException;
import com.google.ads.mediation.admob.AdMobAdapter;
import com.google.android.gms.internal.ads.zzbvk;
import com.google.android.gms.internal.ads.zzfho;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public final class msc {
    private final q2e a;
    private final hsc b;

    msc(q2e q2eVar, hsc hscVar) {
        this.a = q2eVar;
        this.b = hscVar;
    }

    final h3b a() {
        h3b b = this.a.b();
        if (b != null) {
            return b;
        }
        fgb.g("Unexpected call to adapter creator.");
        throw new RemoteException();
    }

    public final o5b b(String str) {
        o5b s = a().s(str);
        this.b.e(str, s);
        return s;
    }

    public final s2e c(String str, JSONObject jSONObject) {
        k3b f;
        try {
            if ("com.google.ads.mediation.admob.AdMobAdapter".equals(str)) {
                f = new m4b(new AdMobAdapter());
            } else if ("com.google.ads.mediation.admob.AdMobCustomTabsAdapter".equals(str)) {
                f = new m4b(new zzbvk());
            } else {
                h3b a = a();
                if ("com.google.android.gms.ads.mediation.customevent.CustomEventAdapter".equals(str) || "com.google.ads.mediation.customevent.CustomEventAdapter".equals(str)) {
                    try {
                        String string = jSONObject.getString("class_name");
                        f = a.b(string) ? a.f("com.google.android.gms.ads.mediation.customevent.CustomEventAdapter") : a.I(string) ? a.f(string) : a.f("com.google.ads.mediation.customevent.CustomEventAdapter");
                    } catch (JSONException e) {
                        fgb.e("Invalid custom event.", e);
                    }
                }
                f = a.f(str);
            }
            s2e s2eVar = new s2e(f);
            this.b.d(str, s2eVar);
            return s2eVar;
        } catch (Throwable th) {
            if (((Boolean) pla.c().a(mpa.k9)).booleanValue()) {
                this.b.d(str, null);
            }
            throw new zzfho(th);
        }
    }

    public final boolean d() {
        return this.a.b() != null;
    }
}
