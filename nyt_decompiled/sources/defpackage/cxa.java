package defpackage;

import java.io.IOException;
import java.util.Map;

/* loaded from: classes3.dex */
final class cxa implements uxa {
    cxa() {
    }

    @Override // defpackage.uxa
    public final /* bridge */ /* synthetic */ void a(Object obj, Map map) {
        wlb wlbVar = (wlb) obj;
        try {
            String str = (String) map.get("enabled");
            if (!yfe.c("true", str) && !yfe.c("false", str)) {
                return;
            }
            qde.j(wlbVar.getContext()).n(Boolean.parseBoolean(str));
        } catch (IOException e) {
            dyf.q().w(e, "DefaultGmsgHandlers.SetPaidv2PersonalizationEnabled");
        }
    }
}
