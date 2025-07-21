package defpackage;

import android.content.Context;
import android.text.TextUtils;
import android.webkit.CookieManager;
import co.datadome.sdk.ChallengeActivity;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* loaded from: classes3.dex */
public final class ovb implements oub {
    private final CookieManager a;

    public ovb(Context context) {
        this.a = dyf.s().a(context);
    }

    @Override // defpackage.oub
    public final void a(Map map) {
        if (this.a == null) {
            return;
        }
        if (((String) map.get("clear")) == null) {
            String str = (String) map.get(ChallengeActivity.ARG_COOKIE);
            if (TextUtils.isEmpty(str)) {
                return;
            }
            this.a.setCookie((String) pla.c().a(mpa.N0), str);
            return;
        }
        String str2 = (String) pla.c().a(mpa.N0);
        String cookie = this.a.getCookie(str2);
        if (cookie != null) {
            List f = dhe.c(dge.b(';')).f(cookie);
            for (int i = 0; i < f.size(); i++) {
                CookieManager cookieManager = this.a;
                Iterator it2 = dhe.c(dge.b('=')).d((String) f.get(i)).iterator();
                it2.getClass();
                if (!it2.hasNext()) {
                    throw new IndexOutOfBoundsException("position (0) must be less than the number of elements that remained (0)");
                }
                cookieManager.setCookie(str2, String.valueOf((String) it2.next()).concat(String.valueOf((String) pla.c().a(mpa.x0))));
            }
        }
    }
}
