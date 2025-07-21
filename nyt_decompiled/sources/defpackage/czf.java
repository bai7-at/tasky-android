package defpackage;

import android.content.Context;
import android.webkit.CookieManager;
import android.webkit.WebResourceResponse;
import java.io.InputStream;
import java.util.Map;

/* loaded from: classes2.dex */
public abstract class czf extends ss9 {
    public czf() {
        super(null);
    }

    @Override // defpackage.ss9
    public final CookieManager a(Context context) {
        dyf.r();
        if (wxf.e()) {
            return null;
        }
        try {
            return CookieManager.getInstance();
        } catch (Throwable th) {
            fgb.e("Failed to obtain CookieManager.", th);
            dyf.q().v(th, "ApiLevelUtil.getCookieManager");
            return null;
        }
    }

    @Override // defpackage.ss9
    public final WebResourceResponse b(String str, String str2, int i, String str3, Map map, InputStream inputStream) {
        return new WebResourceResponse(str, str2, i, str3, map, inputStream);
    }

    @Override // defpackage.ss9
    public final emb c(wlb wlbVar, ina inaVar, boolean z, l8d l8dVar) {
        return new fnb(wlbVar, inaVar, z, l8dVar);
    }
}
