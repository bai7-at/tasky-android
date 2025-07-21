package defpackage;

import java.util.Map;
import org.json.JSONObject;

/* loaded from: classes3.dex */
final class vwa implements uxa {
    vwa() {
    }

    @Override // defpackage.uxa
    public final /* bridge */ /* synthetic */ void a(Object obj, Map map) {
        JSONObject zzb;
        wlb wlbVar = (wlb) obj;
        bta a0 = wlbVar.a0();
        if (a0 == null || (zzb = a0.zzb()) == null) {
            wlbVar.k("nativeClickMetaReady", new JSONObject());
        } else {
            wlbVar.k("nativeClickMetaReady", zzb);
        }
    }
}
