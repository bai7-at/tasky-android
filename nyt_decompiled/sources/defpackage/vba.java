package defpackage;

import android.webkit.WebView;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes2.dex */
final class vba extends jb6 {
    final /* synthetic */ String a;
    final /* synthetic */ yf8 b;

    vba(yf8 yf8Var, String str) {
        this.a = str;
        this.b = yf8Var;
    }

    @Override // defpackage.jb6
    public final void a(String str) {
        WebView webView;
        fgb.g("Failed to generate query info for the tagging library, error: ".concat(String.valueOf(str)));
        String format = String.format("window.postMessage({'paw_id': '%1$s', 'error': '%2$s'}, '*');", this.a, str);
        webView = this.b.b;
        webView.evaluateJavascript(format, null);
    }

    @Override // defpackage.jb6
    public final void b(ib6 ib6Var) {
        String format;
        WebView webView;
        String b = ib6Var.b();
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("paw_id", this.a);
            jSONObject.put("signal", b);
            format = String.format("window.postMessage(%1$s, '*');", jSONObject);
        } catch (JSONException unused) {
            format = String.format("window.postMessage({'paw_id': '%1$s', 'signal': '%2$s'}, '*');", this.a, ib6Var.b());
        }
        webView = this.b.b;
        webView.evaluateJavascript(format, null);
    }
}
