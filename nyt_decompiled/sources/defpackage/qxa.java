package defpackage;

import java.util.Map;

/* loaded from: classes3.dex */
final class qxa implements uxa {
    qxa() {
    }

    @Override // defpackage.uxa
    public final /* bridge */ /* synthetic */ void a(Object obj, Map map) {
        wlb wlbVar = (wlb) obj;
        String str = (String) map.get("action");
        if ("pause".equals(str)) {
            wlbVar.O();
        } else if ("resume".equals(str)) {
            wlbVar.s0();
        }
    }
}
