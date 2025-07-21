package defpackage;

import com.amazonaws.services.s3.internal.Constants;
import com.google.android.gms.ads.internal.client.zze;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public class c6 {
    private final int a;
    private final String b;
    private final String c;
    private final c6 d;

    public c6(int i, String str, String str2, c6 c6Var) {
        this.a = i;
        this.b = str;
        this.c = str2;
        this.d = c6Var;
    }

    public int a() {
        return this.a;
    }

    public String b() {
        return this.c;
    }

    public String c() {
        return this.b;
    }

    public final zze d() {
        zze zzeVar;
        c6 c6Var = this.d;
        if (c6Var == null) {
            zzeVar = null;
        } else {
            String str = c6Var.c;
            zzeVar = new zze(c6Var.a, c6Var.b, str, null, null);
        }
        return new zze(this.a, this.b, this.c, zzeVar, null);
    }

    public JSONObject e() {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("Code", this.a);
        jSONObject.put("Message", this.b);
        jSONObject.put("Domain", this.c);
        c6 c6Var = this.d;
        if (c6Var == null) {
            jSONObject.put("Cause", Constants.NULL_VERSION_ID);
        } else {
            jSONObject.put("Cause", c6Var.e());
        }
        return jSONObject;
    }

    public String toString() {
        try {
            return e().toString(2);
        } catch (JSONException unused) {
            return "Error forming toString output.";
        }
    }

    public c6(int i, String str, String str2) {
        this(i, str, str2, null);
    }
}
