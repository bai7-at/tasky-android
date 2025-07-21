package defpackage;

import com.amazonaws.services.s3.internal.Constants;
import com.google.android.gms.ads.internal.client.zze;
import com.google.android.gms.ads.internal.client.zzu;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public final class i8 {
    private final zzu a;
    private final c6 b;

    private i8(zzu zzuVar) {
        this.a = zzuVar;
        zze zzeVar = zzuVar.zzc;
        this.b = zzeVar == null ? null : zzeVar.t0();
    }

    public static i8 e(zzu zzuVar) {
        if (zzuVar != null) {
            return new i8(zzuVar);
        }
        return null;
    }

    public String a() {
        return this.a.zzf;
    }

    public String b() {
        return this.a.zzh;
    }

    public String c() {
        return this.a.zzg;
    }

    public String d() {
        return this.a.zze;
    }

    public final JSONObject f() {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("Adapter", this.a.zza);
        jSONObject.put("Latency", this.a.zzb);
        String d = d();
        if (d == null) {
            jSONObject.put("Ad Source Name", Constants.NULL_VERSION_ID);
        } else {
            jSONObject.put("Ad Source Name", d);
        }
        String a = a();
        if (a == null) {
            jSONObject.put("Ad Source ID", Constants.NULL_VERSION_ID);
        } else {
            jSONObject.put("Ad Source ID", a);
        }
        String c = c();
        if (c == null) {
            jSONObject.put("Ad Source Instance Name", Constants.NULL_VERSION_ID);
        } else {
            jSONObject.put("Ad Source Instance Name", c);
        }
        String b = b();
        if (b == null) {
            jSONObject.put("Ad Source Instance ID", Constants.NULL_VERSION_ID);
        } else {
            jSONObject.put("Ad Source Instance ID", b);
        }
        JSONObject jSONObject2 = new JSONObject();
        for (String str : this.a.zzd.keySet()) {
            jSONObject2.put(str, this.a.zzd.get(str));
        }
        jSONObject.put("Credentials", jSONObject2);
        c6 c6Var = this.b;
        if (c6Var == null) {
            jSONObject.put("Ad Error", Constants.NULL_VERSION_ID);
        } else {
            jSONObject.put("Ad Error", c6Var.e());
        }
        return jSONObject;
    }

    public String toString() {
        try {
            return f().toString(2);
        } catch (JSONException unused) {
            return "Error forming toString output.";
        }
    }
}
