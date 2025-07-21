package defpackage;

import android.net.Uri;
import android.text.TextUtils;
import android.view.View;
import android.webkit.JavascriptInterface;

/* loaded from: classes3.dex */
public final class cnb {
    private final dnb a;
    private final bnb b;

    public cnb(dnb dnbVar, bnb bnbVar) {
        this.b = bnbVar;
        this.a = dnbVar;
    }

    final /* synthetic */ void a(String str) {
        Uri parse = Uri.parse(str);
        emb O0 = ((vmb) this.b.a).O0();
        if (O0 == null) {
            fgb.d("Unable to pass GMSG, no AdWebViewClient for AdWebView!");
        } else {
            O0.H0(parse);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [dnb, jnb] */
    @JavascriptInterface
    public String getClickSignals(String str) {
        if (TextUtils.isEmpty(str)) {
            pzc.k("Click string is empty, not proceeding.");
            return "";
        }
        ?? r0 = this.a;
        gfa r = r0.r();
        if (r == null) {
            pzc.k("Signal utils is empty, ignoring.");
            return "";
        }
        cfa c = r.c();
        if (r0.getContext() == null) {
            pzc.k("Context is null, ignoring.");
            return "";
        }
        dnb dnbVar = this.a;
        return c.e(dnbVar.getContext(), str, (View) dnbVar, dnbVar.zzi());
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0, types: [dnb, jnb] */
    @JavascriptInterface
    public String getViewSignals() {
        ?? r0 = this.a;
        gfa r = r0.r();
        if (r == null) {
            pzc.k("Signal utils is empty, ignoring.");
            return "";
        }
        cfa c = r.c();
        if (r0.getContext() == null) {
            pzc.k("Context is null, ignoring.");
            return "";
        }
        dnb dnbVar = this.a;
        return c.zzh(dnbVar.getContext(), (View) dnbVar, dnbVar.zzi());
    }

    @JavascriptInterface
    public void notify(final String str) {
        if (TextUtils.isEmpty(str)) {
            fgb.g("URL is empty, ignoring message");
        } else {
            wxf.l.post(new Runnable() { // from class: anb
                @Override // java.lang.Runnable
                public final void run() {
                    cnb.this.a(str);
                }
            });
        }
    }
}
