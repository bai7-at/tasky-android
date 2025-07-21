package defpackage;

import android.text.TextUtils;
import java.util.Map;

/* loaded from: classes3.dex */
final class xwa implements uxa {
    xwa() {
    }

    @Override // defpackage.uxa
    public final /* bridge */ /* synthetic */ void a(Object obj, Map map) {
        wlb wlbVar = (wlb) obj;
        if (TextUtils.isEmpty((CharSequence) map.get("appId"))) {
            pzc.k("Missing App Id, cannot show LMD Overlay without it");
            return;
        }
        zee l = afe.l();
        l.b((String) map.get("appId"));
        l.h(wlbVar.getWidth());
        l.g(wlbVar.h().getWindowToken());
        if (map.containsKey("gravityX") && map.containsKey("gravityY")) {
            l.d(Integer.parseInt((String) map.get("gravityX")) | Integer.parseInt((String) map.get("gravityY")));
        } else {
            l.d(81);
        }
        if (map.containsKey("verticalMargin")) {
            l.e(Float.parseFloat((String) map.get("verticalMargin")));
        } else {
            l.e(0.02f);
        }
        if (map.containsKey("enifd")) {
            l.a((String) map.get("enifd"));
        }
        try {
            dyf.l().j(wlbVar, l.i());
        } catch (NullPointerException e) {
            dyf.q().w(e, "DefaultGmsgHandlers.ShowLMDOverlay");
            pzc.k("Missing parameters for LMD Overlay show request");
        }
    }
}
