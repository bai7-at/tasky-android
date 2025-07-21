package defpackage;

import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public final class evd implements fqd {
    private final Map a;

    public evd(Map map) {
        this.a = map;
    }

    @Override // defpackage.fqd
    public final /* bridge */ /* synthetic */ void a(Object obj) {
        try {
            ((JSONObject) obj).put("video_decoders", kia.b().k(this.a));
        } catch (JSONException e) {
            pzc.k("Could not encode video decoder properties: ".concat(String.valueOf(e.getMessage())));
        }
    }
}
