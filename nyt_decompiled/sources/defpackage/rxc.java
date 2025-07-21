package defpackage;

import android.os.IBinder;
import android.text.TextUtils;
import com.amazonaws.mobileconnectors.s3.transferutility.TransferTable;
import com.google.android.gms.ads.internal.client.zze;
import com.google.android.gms.ads.internal.client.zzu;
import com.google.android.gms.internal.ads.zzbze;
import com.google.android.gms.internal.ads.zzdyq;
import io.embrace.android.embracesdk.gating.SessionGatingKeys;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public final class rxc implements c7c, cac, v8c {
    private final eyc a;
    private final String b;
    private final String c;
    private p6c f;
    private zze g;
    private JSONObject k;
    private boolean l;
    private boolean m;
    private boolean n;
    private String h = "";
    private String i = "";
    private String j = "";
    private int d = 0;
    private zzdyq e = zzdyq.AD_REQUESTED;

    rxc(eyc eycVar, s1e s1eVar, String str) {
        this.a = eycVar;
        this.c = str;
        this.b = s1eVar.f;
    }

    private static JSONObject f(zze zzeVar) {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("errorDomain", zzeVar.zzc);
        jSONObject.put("errorCode", zzeVar.zza);
        jSONObject.put("errorDescription", zzeVar.zzb);
        zze zzeVar2 = zzeVar.zzd;
        jSONObject.put("underlyingError", zzeVar2 == null ? null : f(zzeVar2));
        return jSONObject;
    }

    private final JSONObject g(p6c p6cVar) {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("winningAdapterClassName", p6cVar.zzg());
        jSONObject.put("responseSecsSinceEpoch", p6cVar.zzc());
        jSONObject.put("responseId", p6cVar.zzi());
        if (((Boolean) pla.c().a(mpa.e9)).booleanValue()) {
            String zzd = p6cVar.zzd();
            if (!TextUtils.isEmpty(zzd)) {
                fgb.b("Bidding data: ".concat(String.valueOf(zzd)));
                jSONObject.put("biddingData", new JSONObject(zzd));
            }
        }
        if (!TextUtils.isEmpty(this.h)) {
            jSONObject.put("adRequestUrl", this.h);
        }
        if (!TextUtils.isEmpty(this.i)) {
            jSONObject.put("postBody", this.i);
        }
        if (!TextUtils.isEmpty(this.j)) {
            jSONObject.put("adResponseBody", this.j);
        }
        Object obj = this.k;
        if (obj != null) {
            jSONObject.put("adResponseHeaders", obj);
        }
        if (((Boolean) pla.c().a(mpa.h9)).booleanValue()) {
            jSONObject.put("hasExceededMemoryLimit", this.n);
        }
        JSONArray jSONArray = new JSONArray();
        for (zzu zzuVar : p6cVar.zzj()) {
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("adapterClassName", zzuVar.zza);
            jSONObject2.put("latencyMillis", zzuVar.zzb);
            if (((Boolean) pla.c().a(mpa.f9)).booleanValue()) {
                jSONObject2.put("credentials", kia.b().j(zzuVar.zzd));
            }
            zze zzeVar = zzuVar.zzc;
            jSONObject2.put("error", zzeVar == null ? null : f(zzeVar));
            jSONArray.put(jSONObject2);
        }
        jSONObject.put("adNetworks", jSONArray);
        return jSONObject;
    }

    @Override // defpackage.v8c
    public final void E(u0c u0cVar) {
        if (this.a.p()) {
            this.f = u0cVar.c();
            this.e = zzdyq.AD_LOADED;
            if (((Boolean) pla.c().a(mpa.l9)).booleanValue()) {
                this.a.f(this.b, this);
            }
        }
    }

    @Override // defpackage.cac
    public final void F(zzbze zzbzeVar) {
        if (((Boolean) pla.c().a(mpa.l9)).booleanValue() || !this.a.p()) {
            return;
        }
        this.a.f(this.b, this);
    }

    public final String a() {
        return this.c;
    }

    public final JSONObject b() {
        JSONObject jSONObject;
        IBinder iBinder;
        JSONObject jSONObject2 = new JSONObject();
        jSONObject2.put(TransferTable.COLUMN_STATE, this.e);
        jSONObject2.put("format", v0e.a(this.d));
        if (((Boolean) pla.c().a(mpa.l9)).booleanValue()) {
            jSONObject2.put("isOutOfContext", this.l);
            if (this.l) {
                jSONObject2.put("shown", this.m);
            }
        }
        p6c p6cVar = this.f;
        if (p6cVar != null) {
            jSONObject = g(p6cVar);
        } else {
            zze zzeVar = this.g;
            JSONObject jSONObject3 = null;
            if (zzeVar != null && (iBinder = zzeVar.zze) != null) {
                p6c p6cVar2 = (p6c) iBinder;
                jSONObject3 = g(p6cVar2);
                if (p6cVar2.zzj().isEmpty()) {
                    JSONArray jSONArray = new JSONArray();
                    jSONArray.put(f(this.g));
                    jSONObject3.put(SessionGatingKeys.FULL_SESSION_ERROR_LOGS, jSONArray);
                }
            }
            jSONObject = jSONObject3;
        }
        jSONObject2.put("responseInfo", jSONObject);
        return jSONObject2;
    }

    public final void c() {
        this.l = true;
    }

    public final void d() {
        this.m = true;
    }

    public final boolean e() {
        return this.e != zzdyq.AD_REQUESTED;
    }

    @Override // defpackage.c7c
    public final void n(zze zzeVar) {
        if (this.a.p()) {
            this.e = zzdyq.AD_LOAD_FAILED;
            this.g = zzeVar;
            if (((Boolean) pla.c().a(mpa.l9)).booleanValue()) {
                this.a.f(this.b, this);
            }
        }
    }

    @Override // defpackage.cac
    public final void y0(g1e g1eVar) {
        if (this.a.p()) {
            if (!g1eVar.b.a.isEmpty()) {
                this.d = ((v0e) g1eVar.b.a.get(0)).b;
            }
            if (!TextUtils.isEmpty(g1eVar.b.b.k)) {
                this.h = g1eVar.b.b.k;
            }
            if (!TextUtils.isEmpty(g1eVar.b.b.l)) {
                this.i = g1eVar.b.b.l;
            }
            if (((Boolean) pla.c().a(mpa.h9)).booleanValue()) {
                if (!this.a.r()) {
                    this.n = true;
                    return;
                }
                if (!TextUtils.isEmpty(g1eVar.b.b.m)) {
                    this.j = g1eVar.b.b.m;
                }
                if (g1eVar.b.b.n.length() > 0) {
                    this.k = g1eVar.b.b.n;
                }
                eyc eycVar = this.a;
                JSONObject jSONObject = this.k;
                int length = jSONObject != null ? jSONObject.toString().length() : 0;
                if (!TextUtils.isEmpty(this.j)) {
                    length += this.j.length();
                }
                eycVar.j(length);
            }
        }
    }
}
