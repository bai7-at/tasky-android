package defpackage;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Looper;
import android.security.NetworkSecurityPolicy;
import android.text.TextUtils;
import com.comscore.android.util.AndroidTcfDataLoader;
import com.google.android.gms.common.util.PlatformVersion;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public final class c9f implements hie {
    private boolean b;
    private j64 d;
    private SharedPreferences f;
    private SharedPreferences.Editor g;
    private String i;
    private String j;
    private final Object a = new Object();
    private final List c = new ArrayList();
    private bka e = null;
    private boolean h = true;
    private boolean k = true;
    private String l = "-1";
    private String m = "-1";
    private String n = "-1";
    private int o = -1;
    private efb p = new efb("", 0);
    private long q = 0;
    private long r = 0;
    private int s = -1;
    private int t = 0;
    private Set u = Collections.emptySet();
    private JSONObject v = new JSONObject();
    private boolean w = true;
    private boolean x = true;
    private String y = null;
    private String z = "";
    private boolean A = false;
    private String B = "";
    private int C = -1;
    private int D = -1;
    private long E = 0;

    private final void y() {
        j64 j64Var = this.d;
        if (j64Var == null || j64Var.isDone()) {
            return;
        }
        try {
            this.d.get(1L, TimeUnit.SECONDS);
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
            fgb.h("Interrupted while waiting for preferences loaded.", e);
        } catch (CancellationException | ExecutionException | TimeoutException e2) {
            fgb.e("Fail to initialize AdSharedPreferenceManager.", e2);
        }
    }

    private final void z() {
        pgb.a.execute(new Runnable() { // from class: z0f
            @Override // java.lang.Runnable
            public final void run() {
                c9f.this.zzg();
            }
        });
    }

    @Override // defpackage.hie
    public final boolean B() {
        y();
        synchronized (this.a) {
            try {
                SharedPreferences sharedPreferences = this.f;
                boolean z = false;
                if (sharedPreferences == null) {
                    return false;
                }
                if (sharedPreferences.getLong("topics_consent_expiry_time_ms", 0L) < System.currentTimeMillis()) {
                    return false;
                }
                if (this.f.getBoolean("is_topics_ad_personalization_allowed", false) && !this.k) {
                    z = true;
                }
                return z;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // defpackage.hie
    public final String C(String str) {
        char c;
        y();
        synchronized (this.a) {
            try {
                int hashCode = str.hashCode();
                if (hashCode == -2004976699) {
                    if (str.equals(AndroidTcfDataLoader.IABTCF_PURPOSE_CONSENTS)) {
                        c = 2;
                    }
                    c = 65535;
                } else if (hashCode != 83641339) {
                    if (hashCode == 1218895378 && str.equals("IABTCF_TCString")) {
                        c = 1;
                    }
                    c = 65535;
                } else {
                    if (str.equals(AndroidTcfDataLoader.IABTCF_GDPR_APPLIES)) {
                        c = 0;
                    }
                    c = 65535;
                }
                if (c == 0) {
                    return this.l;
                }
                if (c == 1) {
                    return this.m;
                }
                if (c != 2) {
                    return null;
                }
                return this.n;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // defpackage.hie
    public final void a(Runnable runnable) {
        this.c.add(runnable);
    }

    @Override // defpackage.hie
    public final void b(boolean z) {
        if (((Boolean) pla.c().a(mpa.c9)).booleanValue()) {
            y();
            synchronized (this.a) {
                try {
                    if (this.A == z) {
                        return;
                    }
                    this.A = z;
                    SharedPreferences.Editor editor = this.g;
                    if (editor != null) {
                        editor.putBoolean("linked_device", z);
                        this.g.apply();
                    }
                    z();
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    @Override // defpackage.hie
    public final void c(int i) {
        y();
        synchronized (this.a) {
            try {
                if (this.t == i) {
                    return;
                }
                this.t = i;
                SharedPreferences.Editor editor = this.g;
                if (editor != null) {
                    editor.putInt("version_code", i);
                    this.g.apply();
                }
                z();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // defpackage.hie
    public final void d(long j) {
        y();
        synchronized (this.a) {
            try {
                if (this.q == j) {
                    return;
                }
                this.q = j;
                SharedPreferences.Editor editor = this.g;
                if (editor != null) {
                    editor.putLong("app_last_background_time_ms", j);
                    this.g.apply();
                }
                z();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // defpackage.hie
    public final void e(String str, String str2) {
        char c;
        y();
        synchronized (this.a) {
            try {
                int hashCode = str.hashCode();
                if (hashCode == -2004976699) {
                    if (str.equals(AndroidTcfDataLoader.IABTCF_PURPOSE_CONSENTS)) {
                        c = 2;
                    }
                    c = 65535;
                } else if (hashCode != 83641339) {
                    if (hashCode == 1218895378 && str.equals("IABTCF_TCString")) {
                        c = 1;
                    }
                    c = 65535;
                } else {
                    if (str.equals(AndroidTcfDataLoader.IABTCF_GDPR_APPLIES)) {
                        c = 0;
                    }
                    c = 65535;
                }
                if (c == 0) {
                    this.l = str2;
                } else if (c == 1) {
                    this.m = str2;
                } else if (c != 2) {
                    return;
                } else {
                    this.n = str2;
                }
                if (this.g != null) {
                    if (str2.equals("-1")) {
                        this.g.remove(str);
                    } else {
                        this.g.putString(str, str2);
                    }
                    this.g.apply();
                }
                z();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // defpackage.hie
    public final void f(long j) {
        y();
        synchronized (this.a) {
            try {
                if (this.r == j) {
                    return;
                }
                this.r = j;
                SharedPreferences.Editor editor = this.g;
                if (editor != null) {
                    editor.putLong("first_ad_req_time_ms", j);
                    this.g.apply();
                }
                z();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // defpackage.hie
    public final boolean g() {
        boolean z;
        if (!((Boolean) pla.c().a(mpa.u0)).booleanValue()) {
            return false;
        }
        y();
        synchronized (this.a) {
            z = this.k;
        }
        return z;
    }

    @Override // defpackage.hie
    public final void h(boolean z) {
        y();
        synchronized (this.a) {
            try {
                if (this.w == z) {
                    return;
                }
                this.w = z;
                SharedPreferences.Editor editor = this.g;
                if (editor != null) {
                    editor.putBoolean("content_url_opted_out", z);
                    this.g.apply();
                }
                z();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // defpackage.hie
    public final void i(String str) {
        if (((Boolean) pla.c().a(mpa.c9)).booleanValue()) {
            y();
            synchronized (this.a) {
                try {
                    if (this.B.equals(str)) {
                        return;
                    }
                    this.B = str;
                    SharedPreferences.Editor editor = this.g;
                    if (editor != null) {
                        editor.putString("linked_ad_unit", str);
                        this.g.apply();
                    }
                    z();
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    @Override // defpackage.hie
    public final boolean j() {
        boolean z;
        y();
        synchronized (this.a) {
            z = this.A;
        }
        return z;
    }

    @Override // defpackage.hie
    public final void k(int i) {
        y();
        synchronized (this.a) {
            try {
                if (this.s == i) {
                    return;
                }
                this.s = i;
                SharedPreferences.Editor editor = this.g;
                if (editor != null) {
                    editor.putInt("request_in_session_count", i);
                    this.g.apply();
                }
                z();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // defpackage.hie
    public final void l(int i) {
        y();
        synchronized (this.a) {
            try {
                if (this.D == i) {
                    return;
                }
                this.D = i;
                SharedPreferences.Editor editor = this.g;
                if (editor != null) {
                    editor.putInt("sd_app_measure_npa", i);
                    this.g.apply();
                }
                z();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // defpackage.hie
    public final void m(boolean z) {
        y();
        synchronized (this.a) {
            try {
                if (z == this.k) {
                    return;
                }
                this.k = z;
                SharedPreferences.Editor editor = this.g;
                if (editor != null) {
                    editor.putBoolean("gad_idless", z);
                    this.g.apply();
                }
                z();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // defpackage.hie
    public final void n(String str) {
        y();
        synchronized (this.a) {
            try {
                if (TextUtils.equals(this.y, str)) {
                    return;
                }
                this.y = str;
                SharedPreferences.Editor editor = this.g;
                if (editor != null) {
                    editor.putString("display_cutout", str);
                    this.g.apply();
                }
                z();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // defpackage.hie
    public final void o(String str) {
        y();
        synchronized (this.a) {
            try {
                if (str.equals(this.i)) {
                    return;
                }
                this.i = str;
                SharedPreferences.Editor editor = this.g;
                if (editor != null) {
                    editor.putString("content_url_hashes", str);
                    this.g.apply();
                }
                z();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // defpackage.hie
    public final void p(boolean z) {
        y();
        synchronized (this.a) {
            try {
                long currentTimeMillis = System.currentTimeMillis() + ((Long) pla.c().a(mpa.W9)).longValue();
                SharedPreferences.Editor editor = this.g;
                if (editor != null) {
                    editor.putBoolean("is_topics_ad_personalization_allowed", z);
                    this.g.putLong("topics_consent_expiry_time_ms", currentTimeMillis);
                    this.g.apply();
                }
                z();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // defpackage.hie
    public final void q(String str) {
        y();
        synchronized (this.a) {
            try {
                long currentTimeMillis = dyf.b().currentTimeMillis();
                if (str != null && !str.equals(this.p.c())) {
                    this.p = new efb(str, currentTimeMillis);
                    SharedPreferences.Editor editor = this.g;
                    if (editor != null) {
                        editor.putString("app_settings_json", str);
                        this.g.putLong("app_settings_last_update_ms", currentTimeMillis);
                        this.g.apply();
                    }
                    z();
                    Iterator it2 = this.c.iterator();
                    while (it2.hasNext()) {
                        ((Runnable) it2.next()).run();
                    }
                    return;
                }
                this.p.g(currentTimeMillis);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // defpackage.hie
    public final void r(final Context context) {
        synchronized (this.a) {
            try {
                if (this.f != null) {
                    return;
                }
                final String str = "admob";
                this.d = pgb.a.l(new Runnable(context, str) { // from class: q6f
                    public final /* synthetic */ Context b;
                    public final /* synthetic */ String c = "admob";

                    @Override // java.lang.Runnable
                    public final void run() {
                        c9f.this.w(this.b, this.c);
                    }
                });
                this.b = true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // defpackage.hie
    public final void s(String str) {
        y();
        synchronized (this.a) {
            try {
                if (str.equals(this.j)) {
                    return;
                }
                this.j = str;
                SharedPreferences.Editor editor = this.g;
                if (editor != null) {
                    editor.putString("content_vertical_hashes", str);
                    this.g.apply();
                }
                z();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // defpackage.hie
    public final void t(long j) {
        y();
        synchronized (this.a) {
            try {
                if (this.E == j) {
                    return;
                }
                this.E = j;
                SharedPreferences.Editor editor = this.g;
                if (editor != null) {
                    editor.putLong("sd_app_measure_npa_ts", j);
                    this.g.apply();
                }
                z();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // defpackage.hie
    public final void u(String str) {
        if (((Boolean) pla.c().a(mpa.N8)).booleanValue()) {
            y();
            synchronized (this.a) {
                try {
                    if (this.z.equals(str)) {
                        return;
                    }
                    this.z = str;
                    SharedPreferences.Editor editor = this.g;
                    if (editor != null) {
                        editor.putString("inspector_info", str);
                        this.g.apply();
                    }
                    z();
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    @Override // defpackage.hie
    public final void v(String str, String str2, boolean z) {
        y();
        synchronized (this.a) {
            try {
                JSONArray optJSONArray = this.v.optJSONArray(str);
                if (optJSONArray == null) {
                    optJSONArray = new JSONArray();
                }
                int length = optJSONArray.length();
                for (int i = 0; i < optJSONArray.length(); i++) {
                    JSONObject optJSONObject = optJSONArray.optJSONObject(i);
                    if (optJSONObject == null) {
                        return;
                    }
                    if (str2.equals(optJSONObject.optString("template_id"))) {
                        if (z && optJSONObject.optBoolean("uses_media_view", false)) {
                            return;
                        } else {
                            length = i;
                        }
                    }
                }
                try {
                    JSONObject jSONObject = new JSONObject();
                    jSONObject.put("template_id", str2);
                    jSONObject.put("uses_media_view", z);
                    jSONObject.put("timestamp_ms", dyf.b().currentTimeMillis());
                    optJSONArray.put(length, jSONObject);
                    this.v.put(str, optJSONArray);
                } catch (JSONException e) {
                    fgb.h("Could not update native advanced settings", e);
                }
                SharedPreferences.Editor editor = this.g;
                if (editor != null) {
                    editor.putString("native_advanced_settings", this.v.toString());
                    this.g.apply();
                }
                z();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    final /* synthetic */ void w(Context context, String str) {
        SharedPreferences sharedPreferences = context.getSharedPreferences("admob", 0);
        SharedPreferences.Editor edit = sharedPreferences.edit();
        synchronized (this.a) {
            try {
                this.f = sharedPreferences;
                this.g = edit;
                if (PlatformVersion.isAtLeastM()) {
                    NetworkSecurityPolicy.getInstance().isCleartextTrafficPermitted();
                }
                this.h = this.f.getBoolean("use_https", this.h);
                this.w = this.f.getBoolean("content_url_opted_out", this.w);
                this.i = this.f.getString("content_url_hashes", this.i);
                this.k = this.f.getBoolean("gad_idless", this.k);
                this.x = this.f.getBoolean("content_vertical_opted_out", this.x);
                this.j = this.f.getString("content_vertical_hashes", this.j);
                this.t = this.f.getInt("version_code", this.t);
                this.p = new efb(this.f.getString("app_settings_json", this.p.c()), this.f.getLong("app_settings_last_update_ms", this.p.a()));
                this.q = this.f.getLong("app_last_background_time_ms", this.q);
                this.s = this.f.getInt("request_in_session_count", this.s);
                this.r = this.f.getLong("first_ad_req_time_ms", this.r);
                this.u = this.f.getStringSet("never_pool_slots", this.u);
                this.y = this.f.getString("display_cutout", this.y);
                this.C = this.f.getInt("app_measurement_npa", this.C);
                this.D = this.f.getInt("sd_app_measure_npa", this.D);
                this.E = this.f.getLong("sd_app_measure_npa_ts", this.E);
                this.z = this.f.getString("inspector_info", this.z);
                this.A = this.f.getBoolean("linked_device", this.A);
                this.B = this.f.getString("linked_ad_unit", this.B);
                this.l = this.f.getString(AndroidTcfDataLoader.IABTCF_GDPR_APPLIES, this.l);
                this.n = this.f.getString(AndroidTcfDataLoader.IABTCF_PURPOSE_CONSENTS, this.n);
                this.m = this.f.getString("IABTCF_TCString", this.m);
                this.o = this.f.getInt("gad_has_consent_for_cookies", this.o);
                try {
                    this.v = new JSONObject(this.f.getString("native_advanced_settings", "{}"));
                } catch (JSONException e) {
                    fgb.h("Could not convert native advanced settings to json object", e);
                }
                z();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // defpackage.hie
    public final void x(boolean z) {
        y();
        synchronized (this.a) {
            try {
                if (this.x == z) {
                    return;
                }
                this.x = z;
                SharedPreferences.Editor editor = this.g;
                if (editor != null) {
                    editor.putBoolean("content_vertical_opted_out", z);
                    this.g.apply();
                }
                z();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // defpackage.hie
    public final void zzE(int i) {
        y();
        synchronized (this.a) {
            try {
                this.o = i;
                SharedPreferences.Editor editor = this.g;
                if (editor != null) {
                    if (i == -1) {
                        editor.remove("gad_has_consent_for_cookies");
                    } else {
                        editor.putInt("gad_has_consent_for_cookies", i);
                    }
                    this.g.apply();
                }
                z();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // defpackage.hie
    public final boolean zzN() {
        boolean z;
        y();
        synchronized (this.a) {
            z = this.w;
        }
        return z;
    }

    @Override // defpackage.hie
    public final boolean zzO() {
        boolean z;
        y();
        synchronized (this.a) {
            z = this.x;
        }
        return z;
    }

    @Override // defpackage.hie
    public final int zza() {
        int i;
        y();
        synchronized (this.a) {
            i = this.t;
        }
        return i;
    }

    @Override // defpackage.hie
    public final int zzb() {
        int i;
        y();
        synchronized (this.a) {
            i = this.o;
        }
        return i;
    }

    @Override // defpackage.hie
    public final int zzc() {
        int i;
        y();
        synchronized (this.a) {
            i = this.s;
        }
        return i;
    }

    @Override // defpackage.hie
    public final long zzd() {
        long j;
        y();
        synchronized (this.a) {
            j = this.q;
        }
        return j;
    }

    @Override // defpackage.hie
    public final long zze() {
        long j;
        y();
        synchronized (this.a) {
            j = this.r;
        }
        return j;
    }

    @Override // defpackage.hie
    public final long zzf() {
        long j;
        y();
        synchronized (this.a) {
            j = this.E;
        }
        return j;
    }

    @Override // defpackage.hie
    public final bka zzg() {
        if (!this.b) {
            return null;
        }
        if ((zzN() && zzO()) || !((Boolean) ira.b.e()).booleanValue()) {
            return null;
        }
        synchronized (this.a) {
            try {
                if (Looper.getMainLooper() == null) {
                    return null;
                }
                if (this.e == null) {
                    this.e = new bka();
                }
                this.e.e();
                fgb.f("start fetching content...");
                return this.e;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // defpackage.hie
    public final efb zzh() {
        efb efbVar;
        y();
        synchronized (this.a) {
            try {
                if (((Boolean) pla.c().a(mpa.eb)).booleanValue() && this.p.j()) {
                    Iterator it2 = this.c.iterator();
                    while (it2.hasNext()) {
                        ((Runnable) it2.next()).run();
                    }
                }
                efbVar = this.p;
            } catch (Throwable th) {
                throw th;
            }
        }
        return efbVar;
    }

    @Override // defpackage.hie
    public final efb zzi() {
        efb efbVar;
        synchronized (this.a) {
            efbVar = this.p;
        }
        return efbVar;
    }

    @Override // defpackage.hie
    public final String zzj() {
        String str;
        y();
        synchronized (this.a) {
            str = this.i;
        }
        return str;
    }

    @Override // defpackage.hie
    public final String zzk() {
        String str;
        y();
        synchronized (this.a) {
            str = this.j;
        }
        return str;
    }

    @Override // defpackage.hie
    public final String zzl() {
        String str;
        y();
        synchronized (this.a) {
            str = this.B;
        }
        return str;
    }

    @Override // defpackage.hie
    public final String zzm() {
        String str;
        y();
        synchronized (this.a) {
            str = this.y;
        }
        return str;
    }

    @Override // defpackage.hie
    public final String zzo() {
        String str;
        y();
        synchronized (this.a) {
            str = this.z;
        }
        return str;
    }

    @Override // defpackage.hie
    public final JSONObject zzp() {
        JSONObject jSONObject;
        y();
        synchronized (this.a) {
            jSONObject = this.v;
        }
        return jSONObject;
    }

    @Override // defpackage.hie
    public final void zzs() {
        y();
        synchronized (this.a) {
            try {
                this.v = new JSONObject();
                SharedPreferences.Editor editor = this.g;
                if (editor != null) {
                    editor.remove("native_advanced_settings");
                    this.g.apply();
                }
                z();
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
