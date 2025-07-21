package defpackage;

import android.content.Context;
import com.amazonaws.mobileconnectors.cognito.internal.util.DatasetUtils;
import com.google.android.gms.internal.ads.zb;
import com.google.android.gms.internal.ads.zzcei;
import java.io.StringReader;
import java.util.concurrent.Executor;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public final class n1d {
    private final aob a;
    private final Context b;
    private final zzcei c;
    private final s1e d;
    private final Executor e;
    private final String f;
    private final q7e g;
    private final g2e h;
    private final uuc i;

    public n1d(aob aobVar, Context context, zzcei zzceiVar, s1e s1eVar, Executor executor, String str, q7e q7eVar, uuc uucVar) {
        this.a = aobVar;
        this.b = context;
        this.c = zzceiVar;
        this.d = s1eVar;
        this.e = executor;
        this.f = str;
        this.g = q7eVar;
        this.h = aobVar.A();
        this.i = uucVar;
    }

    private final j64 c(final String str, final String str2) {
        f7e a = e7e.a(this.b, 11);
        a.zzh();
        e2b a2 = dyf.h().a(this.b, this.c, this.a.D());
        y1b y1bVar = b2b.b;
        final u1b a3 = a2.a("google.afma.response.normalize", y1bVar, y1bVar);
        j64 n = zb.n(zb.n(zb.n(zb.h(""), new ake() { // from class: k1d
            @Override // defpackage.ake
            public final j64 zza(Object obj) {
                JSONObject jSONObject = new JSONObject();
                JSONObject jSONObject2 = new JSONObject();
                JSONObject jSONObject3 = new JSONObject();
                String str3 = str;
                String str4 = str2;
                try {
                    jSONObject3.put("headers", new JSONObject());
                    jSONObject3.put("body", str3);
                    jSONObject2.put("base_url", "");
                    jSONObject2.put("signals", new JSONObject(str4));
                    jSONObject.put("request", jSONObject2);
                    jSONObject.put("response", jSONObject3);
                    jSONObject.put("flags", new JSONObject());
                    return zb.h(jSONObject);
                } catch (JSONException e) {
                    throw new JSONException("Preloaded loader: ".concat(String.valueOf(e.getCause())));
                }
            }
        }, this.e), new ake() { // from class: l1d
            @Override // defpackage.ake
            public final j64 zza(Object obj) {
                return u1b.this.zzb((JSONObject) obj);
            }
        }, this.e), new ake() { // from class: m1d
            @Override // defpackage.ake
            public final j64 zza(Object obj) {
                return n1d.this.b((JSONObject) obj);
            }
        }, this.e);
        p7e.a(n, this.g, a);
        return n;
    }

    private final String d(String str) {
        try {
            JSONObject jSONObject = new JSONObject(str);
            JSONArray jSONArray = jSONObject.getJSONArray("ad_types");
            if (jSONArray != null && DatasetUtils.UNKNOWN_IDENTITY_ID.equals(jSONArray.getString(0))) {
                jSONObject.put("ad_types", new JSONArray().put(this.f));
            }
            return jSONObject.toString();
        } catch (JSONException e) {
            fgb.g("Failed to update the ad types for rendering. ".concat(e.toString()));
            return str;
        }
    }

    private static final String e(String str) {
        try {
            return new JSONObject(str).optString("request_id", "");
        } catch (JSONException unused) {
            return "";
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x00a3  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final defpackage.j64 a() {
        /*
            Method dump skipped, instructions count: 387
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.n1d.a():j64");
    }

    final /* synthetic */ j64 b(JSONObject jSONObject) {
        return zb.h(new g1e(new d1e(this.d), f1e.a(new StringReader(jSONObject.toString()))));
    }
}
