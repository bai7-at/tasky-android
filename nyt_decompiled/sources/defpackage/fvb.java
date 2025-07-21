package defpackage;

import android.text.TextUtils;
import java.util.Map;

/* loaded from: classes3.dex */
final class fvb implements oub {
    fvb() {
    }

    @Override // defpackage.oub
    public final void a(Map map) {
        if (!((Boolean) pla.c().a(mpa.U9)).booleanValue() || map.isEmpty()) {
            return;
        }
        String str = (String) map.get("is_topics_ad_personalization_allowed");
        if (TextUtils.isEmpty(str)) {
            return;
        }
        dyf.q().i().p(Boolean.parseBoolean(str));
    }
}
