package defpackage;

import org.json.JSONObject;

/* loaded from: classes3.dex */
public final class q7b {
    public final boolean a;
    public final String b;

    public q7b(boolean z, String str) {
        this.a = z;
        this.b = str;
    }

    public static q7b a(JSONObject jSONObject) {
        return new q7b(jSONObject.optBoolean("enable_prewarming", false), jSONObject.optString("prefetch_url", ""));
    }
}
