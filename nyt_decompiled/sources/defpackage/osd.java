package defpackage;

import android.text.TextUtils;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public final class osd implements fqd {
    private final String a;

    public osd(String str) {
        this.a = str;
    }

    @Override // defpackage.fqd
    public final /* bridge */ /* synthetic */ void a(Object obj) {
        try {
            JSONObject f = t6b.f((JSONObject) obj, "pii");
            if (TextUtils.isEmpty(this.a)) {
                return;
            }
            f.put("attok", this.a);
        } catch (JSONException e) {
            pzc.l("Failed putting attestation token.", e);
        }
    }
}
