package defpackage;

import android.text.TextUtils;
import java.util.Map;

/* loaded from: classes3.dex */
public final class qvb implements oub {
    private final eyc a;

    qvb(eyc eycVar) {
        this.a = eycVar;
    }

    @Override // defpackage.oub
    public final void a(Map map) {
        String str = (String) map.get("test_mode_enabled");
        if (TextUtils.isEmpty(str)) {
            return;
        }
        this.a.n(str.equals("true"));
    }
}
