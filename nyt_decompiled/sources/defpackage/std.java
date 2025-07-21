package defpackage;

import android.content.Context;
import com.google.android.gms.internal.ads.zb;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes3.dex */
final class std implements gqd {
    private final JSONObject a;

    std(Context context) {
        this.a = cab.c(context);
    }

    final /* synthetic */ void a(JSONObject jSONObject) {
        try {
            jSONObject.put("gms_sdk_env", this.a);
        } catch (JSONException unused) {
            pzc.k("Failed putting version constants.");
        }
    }

    @Override // defpackage.gqd
    public final int zza() {
        return 46;
    }

    @Override // defpackage.gqd
    public final j64 zzb() {
        return ((Boolean) pla.c().a(mpa.ob)).booleanValue() ? zb.h(new fqd() { // from class: usd
            @Override // defpackage.fqd
            public final void a(Object obj) {
            }
        }) : zb.h(new fqd() { // from class: rtd
            @Override // defpackage.fqd
            public final void a(Object obj) {
                std.this.a((JSONObject) obj);
            }
        });
    }
}
