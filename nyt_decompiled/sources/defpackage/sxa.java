package defpackage;

import java.util.Map;

/* loaded from: classes3.dex */
final class sxa implements uxa {
    sxa() {
    }

    @Override // defpackage.uxa
    public final /* bridge */ /* synthetic */ void a(Object obj, Map map) {
        wlb wlbVar = (wlb) obj;
        if (map.keySet().contains("start")) {
            wlbVar.C(true);
        }
        if (map.keySet().contains("stop")) {
            wlbVar.C(false);
        }
    }
}
