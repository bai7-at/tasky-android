package defpackage;

import org.json.JSONObject;

/* loaded from: classes3.dex */
public final class v1e {
    private final JSONObject a;

    public v1e(JSONObject jSONObject) {
        this.a = jSONObject;
    }

    public final String a() {
        if (b() - 1 != 1) {
            return "javascript";
        }
        return null;
    }

    public final int b() {
        int optInt = this.a.optInt("media_type", -1);
        if (optInt != 0) {
            return optInt != 1 ? 3 : 1;
        }
        return 2;
    }
}
