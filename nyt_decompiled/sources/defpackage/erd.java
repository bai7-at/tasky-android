package defpackage;

import android.text.TextUtils;
import com.google.android.gms.ads.identifier.AdvertisingIdClient;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public final class erd implements fqd {
    private final AdvertisingIdClient.Info a;
    private final String b;
    private final mde c;

    public erd(AdvertisingIdClient.Info info, String str, mde mdeVar) {
        this.a = info;
        this.b = str;
        this.c = mdeVar;
    }

    @Override // defpackage.fqd
    public final /* bridge */ /* synthetic */ void a(Object obj) {
        try {
            JSONObject f = t6b.f((JSONObject) obj, "pii");
            AdvertisingIdClient.Info info = this.a;
            if (info == null || TextUtils.isEmpty(info.getId())) {
                String str = this.b;
                if (str != null) {
                    f.put("pdid", str);
                    f.put("pdidtype", "ssaid");
                    return;
                }
                return;
            }
            f.put("rdid", this.a.getId());
            f.put("is_lat", this.a.isLimitAdTrackingEnabled());
            f.put("idtype", "adid");
            mde mdeVar = this.c;
            if (mdeVar.c()) {
                f.put("paidv1_id_android_3p", mdeVar.b());
                f.put("paidv1_creation_time_android_3p", this.c.a());
            }
        } catch (JSONException e) {
            pzc.l("Failed putting Ad ID.", e);
        }
    }
}
