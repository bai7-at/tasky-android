package defpackage;

import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public abstract /* synthetic */ class e0b {
    public static void a(f0b f0bVar, String str, Map map) {
        try {
            f0bVar.k(str, kia.b().k(map));
        } catch (JSONException unused) {
            fgb.g("Could not convert parameters to JSON.");
        }
    }

    public static void b(f0b f0bVar, String str, JSONObject jSONObject) {
        String jSONObject2 = jSONObject.toString();
        StringBuilder sb = new StringBuilder();
        sb.append("(window.AFMA_ReceiveMessage || function() {})('");
        sb.append(str);
        sb.append("',");
        sb.append(jSONObject2);
        sb.append(");");
        fgb.b("Dispatching AFMA event: ".concat(sb.toString()));
        f0bVar.a(sb.toString());
    }

    public static void c(f0b f0bVar, String str, String str2) {
        f0bVar.a(str + "(" + str2 + ");");
    }

    public static void d(f0b f0bVar, String str, JSONObject jSONObject) {
        f0bVar.zzb(str, jSONObject.toString());
    }
}
