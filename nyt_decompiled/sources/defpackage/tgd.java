package defpackage;

import android.os.RemoteException;
import com.facebook.AuthenticationTokenClaims;
import com.google.android.gms.ads.internal.client.zze;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public final class tgd extends q5b {
    private final String a;
    private final o5b b;
    private final ugb c;
    private final JSONObject d;
    private final long e;
    private boolean f;

    public tgd(String str, o5b o5bVar, ugb ugbVar, long j) {
        JSONObject jSONObject = new JSONObject();
        this.d = jSONObject;
        this.f = false;
        this.c = ugbVar;
        this.a = str;
        this.b = o5bVar;
        this.e = j;
        try {
            jSONObject.put("adapter_version", o5bVar.zzf().toString());
            jSONObject.put("sdk_version", o5bVar.zzg().toString());
            jSONObject.put(AuthenticationTokenClaims.JSON_KEY_NAME, str);
        } catch (RemoteException | NullPointerException | JSONException unused) {
        }
    }

    public static synchronized void w6(String str, ugb ugbVar) {
        synchronized (tgd.class) {
            try {
                JSONObject jSONObject = new JSONObject();
                try {
                    jSONObject.put(AuthenticationTokenClaims.JSON_KEY_NAME, str);
                    jSONObject.put("signal_error", "Adapter failed to instantiate");
                    if (((Boolean) pla.c().a(mpa.A1)).booleanValue()) {
                        jSONObject.put("signal_error_code", 1);
                    }
                    ugbVar.c(jSONObject);
                } catch (JSONException unused) {
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    private final synchronized void x6(String str, int i) {
        try {
            if (this.f) {
                return;
            }
            try {
                this.d.put("signal_error", str);
                if (((Boolean) pla.c().a(mpa.B1)).booleanValue()) {
                    this.d.put("latency", dyf.b().elapsedRealtime() - this.e);
                }
                if (((Boolean) pla.c().a(mpa.A1)).booleanValue()) {
                    this.d.put("signal_error_code", i);
                }
            } catch (JSONException unused) {
            }
            this.c.c(this.d);
            this.f = true;
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // defpackage.r5b
    public final synchronized void C0(zze zzeVar) {
        x6(zzeVar.zzb, 2);
    }

    @Override // defpackage.r5b
    public final synchronized void b(String str) {
        if (this.f) {
            return;
        }
        if (str == null) {
            n("Adapter returned null signals");
            return;
        }
        try {
            this.d.put("signals", str);
            if (((Boolean) pla.c().a(mpa.B1)).booleanValue()) {
                this.d.put("latency", dyf.b().elapsedRealtime() - this.e);
            }
            if (((Boolean) pla.c().a(mpa.A1)).booleanValue()) {
                this.d.put("signal_error_code", 0);
            }
        } catch (JSONException unused) {
        }
        this.c.c(this.d);
        this.f = true;
    }

    @Override // defpackage.r5b
    public final synchronized void n(String str) {
        x6(str, 2);
    }

    public final synchronized void zzc() {
        x6("Signal collection timeout.", 3);
    }

    public final synchronized void zzd() {
        if (this.f) {
            return;
        }
        try {
            if (((Boolean) pla.c().a(mpa.A1)).booleanValue()) {
                this.d.put("signal_error_code", 0);
            }
        } catch (JSONException unused) {
        }
        this.c.c(this.d);
        this.f = true;
    }
}
