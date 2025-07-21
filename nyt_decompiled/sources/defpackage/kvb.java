package defpackage;

import android.text.TextUtils;
import java.util.Map;

/* loaded from: classes3.dex */
public final class kvb implements oub {
    private final u0e a;

    public kvb(u0e u0eVar) {
        this.a = u0eVar;
    }

    @Override // defpackage.oub
    public final void a(Map map) {
        String str = (String) map.get("render_in_browser");
        if (TextUtils.isEmpty(str)) {
            return;
        }
        try {
            this.a.b(Boolean.parseBoolean(str));
        } catch (Exception e) {
            throw new IllegalStateException("Invalid render_in_browser state", e);
        }
    }
}
