package defpackage;

import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public final class krd implements fqd {
    private final String a;

    public krd(String str) {
        this.a = str;
    }

    @Override // defpackage.fqd
    public final /* bridge */ /* synthetic */ void a(Object obj) {
        try {
            ((JSONObject) obj).put("ms", this.a);
        } catch (JSONException e) {
            pzc.l("Failed putting Ad ID.", e);
        }
    }
}
