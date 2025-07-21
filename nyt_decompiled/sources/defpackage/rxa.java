package defpackage;

import java.util.Map;

/* loaded from: classes3.dex */
final class rxa implements uxa {
    rxa() {
    }

    @Override // defpackage.uxa
    public final /* bridge */ /* synthetic */ void a(Object obj, Map map) {
        wlb wlbVar = (wlb) obj;
        if (map.keySet().contains("start")) {
            wlbVar.zzN().zzl();
        } else if (map.keySet().contains("stop")) {
            wlbVar.zzN().zzm();
        } else if (map.keySet().contains("cancel")) {
            wlbVar.zzN().zzk();
        }
    }
}
