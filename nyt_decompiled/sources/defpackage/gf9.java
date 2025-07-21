package defpackage;

import android.webkit.WebView;
import android.webkit.WebViewRenderProcess;
import android.webkit.WebViewRenderProcessClient;

/* loaded from: classes.dex */
public class gf9 extends WebViewRenderProcessClient {
    private ef9 a;

    public gf9(ef9 ef9Var) {
        this.a = ef9Var;
    }

    @Override // android.webkit.WebViewRenderProcessClient
    public void onRenderProcessResponsive(WebView webView, WebViewRenderProcess webViewRenderProcess) {
        this.a.a(webView, hf9.a(webViewRenderProcess));
    }

    @Override // android.webkit.WebViewRenderProcessClient
    public void onRenderProcessUnresponsive(WebView webView, WebViewRenderProcess webViewRenderProcess) {
        this.a.b(webView, hf9.a(webViewRenderProcess));
    }
}
