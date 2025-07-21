package defpackage;

import com.google.android.gms.common.GooglePlayServicesUtilLight;
import com.google.android.gms.internal.ads.zb;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public final /* synthetic */ class pud implements gqd {
    public static final /* synthetic */ pud a = new pud();

    private /* synthetic */ pud() {
    }

    @Override // defpackage.gqd
    public final /* synthetic */ int zza() {
        return 0;
    }

    @Override // defpackage.gqd
    public final j64 zzb() {
        return zb.h(new fqd() { // from class: qud
            @Override // defpackage.fqd
            public final void a(Object obj) {
                try {
                    ((JSONObject) obj).getJSONObject("sdk_env").put("container_version", GooglePlayServicesUtilLight.GOOGLE_PLAY_SERVICES_VERSION_CODE);
                } catch (JSONException unused) {
                }
            }
        });
    }
}
