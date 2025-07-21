package defpackage;

import android.text.TextUtils;
import java.util.HashMap;
import java.util.Map;
import java.util.UUID;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public final class jya implements uxa {
    private final Object a = new Object();
    private final Map b = new HashMap();

    @Override // defpackage.uxa
    public final void a(Object obj, Map map) {
        String str = (String) map.get("id");
        String str2 = (String) map.get("fail");
        String str3 = (String) map.get("fail_reason");
        String str4 = (String) map.get("fail_stack");
        String str5 = (String) map.get("result");
        if (true == TextUtils.isEmpty(str4)) {
            str3 = "Unknown Fail Reason.";
        }
        String concat = TextUtils.isEmpty(str4) ? "" : "\n".concat(String.valueOf(str4));
        synchronized (this.a) {
            try {
                iya iyaVar = (iya) this.b.remove(str);
                if (iyaVar == null) {
                    fgb.g("Received result for unexpected method invocation: " + str);
                    return;
                }
                if (!TextUtils.isEmpty(str2)) {
                    iyaVar.a(str3 + concat);
                    return;
                }
                if (str5 == null) {
                    iyaVar.b(null);
                    return;
                }
                try {
                    JSONObject jSONObject = new JSONObject(str5);
                    if (pzc.m()) {
                        pzc.k("Result GMSG: " + jSONObject.toString(2));
                    }
                    iyaVar.b(jSONObject);
                } catch (JSONException e) {
                    iyaVar.a(e.getMessage());
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final j64 b(q0b q0bVar, String str, JSONObject jSONObject) {
        ugb ugbVar = new ugb();
        dyf.r();
        String uuid = UUID.randomUUID().toString();
        c(uuid, new hya(this, ugbVar));
        try {
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("id", uuid);
            jSONObject2.put("args", jSONObject);
            q0bVar.M0(str, jSONObject2);
        } catch (Exception e) {
            ugbVar.d(e);
        }
        return ugbVar;
    }

    public final void c(String str, iya iyaVar) {
        synchronized (this.a) {
            this.b.put(str, iyaVar);
        }
    }
}
