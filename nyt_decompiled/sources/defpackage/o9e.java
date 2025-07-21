package defpackage;

import android.os.Handler;
import android.webkit.WebView;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public final class o9e extends k9e {
    private WebView d;
    private Long e = null;
    private final Map f;

    public o9e(Map map, String str) {
        this.f = map;
    }

    @Override // defpackage.k9e
    public final void c() {
        super.c();
        new Handler().postDelayed(new n9e(this), Math.max(4000 - (this.e == null ? 4000L : TimeUnit.MILLISECONDS.convert(System.nanoTime() - this.e.longValue(), TimeUnit.NANOSECONDS)), 2000L));
        this.d = null;
    }

    @Override // defpackage.k9e
    public final void g(n8e n8eVar, m8e m8eVar) {
        JSONObject jSONObject = new JSONObject();
        Map i = m8eVar.i();
        Iterator it2 = i.keySet().iterator();
        if (it2.hasNext()) {
            lh4.a(i.get((String) it2.next()));
            throw null;
        }
        h(n8eVar, m8eVar, jSONObject);
    }

    @Override // defpackage.k9e
    public final void k() {
        WebView webView = new WebView(z8e.b().a());
        this.d = webView;
        webView.getSettings().setJavaScriptEnabled(true);
        this.d.getSettings().setAllowContentAccess(false);
        this.d.getSettings().setAllowFileAccess(false);
        this.d.setWebViewClient(new m9e(this));
        j(this.d);
        d9e.i(this.d, null);
        Iterator it2 = this.f.keySet().iterator();
        if (!it2.hasNext()) {
            this.e = Long.valueOf(System.nanoTime());
        } else {
            lh4.a(this.f.get((String) it2.next()));
            throw null;
        }
    }
}
