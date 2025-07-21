package defpackage;

import java.util.Map;
import org.json.JSONObject;

/* loaded from: classes3.dex */
final class uwa implements uxa {
    uwa() {
    }

    @Override // defpackage.uxa
    public final /* bridge */ /* synthetic */ void a(Object obj, Map map) {
        JSONObject zza;
        wlb wlbVar = (wlb) obj;
        bta a0 = wlbVar.a0();
        if (a0 == null || (zza = a0.zza()) == null) {
            wlbVar.k("nativeAdViewSignalsReady", new JSONObject());
        } else {
            wlbVar.k("nativeAdViewSignalsReady", zza);
        }
    }
}
