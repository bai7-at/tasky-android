package defpackage;

import java.io.IOException;
import java.util.Map;

/* loaded from: classes3.dex */
final class bxa implements uxa {
    bxa() {
    }

    @Override // defpackage.uxa
    public final /* bridge */ /* synthetic */ void a(Object obj, Map map) {
        wlb wlbVar = (wlb) obj;
        try {
            pde.k(wlbVar.getContext()).l();
            qde.j(wlbVar.getContext()).k();
        } catch (IOException e) {
            dyf.q().w(e, "DefaultGmsgHandlers.ResetPaid");
        }
    }
}
