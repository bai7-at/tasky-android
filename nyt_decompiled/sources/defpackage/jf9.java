package defpackage;

import android.graphics.Bitmap;
import android.net.Uri;
import android.webkit.WebResourceError;
import android.webkit.WebResourceRequest;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import io.embrace.android.embracesdk.WebViewClientSwazzledHooks;

/* loaded from: classes4.dex */
public final class jf9 extends WebViewClient {
    private final qs2 a;
    private final ss2 b;
    private final qs2 c;
    private final qs2 d;
    private final gt2 e;

    public jf9(qs2 qs2Var, ss2 ss2Var, qs2 qs2Var2, qs2 qs2Var3, gt2 gt2Var) {
        zq3.h(qs2Var, "isNetworkConnected");
        zq3.h(ss2Var, "updateProgress");
        zq3.h(qs2Var2, "onNoNetwork");
        zq3.h(qs2Var3, "onPageStarted");
        this.a = qs2Var;
        this.b = ss2Var;
        this.c = qs2Var2;
        this.d = qs2Var3;
        this.e = gt2Var;
    }

    @Override // android.webkit.WebViewClient
    public void onPageFinished(WebView webView, String str) {
        zq3.h(webView, "view");
        zq3.h(str, "url");
        this.b.invoke(Boolean.FALSE);
        super.onPageFinished(webView, str);
        gt2 gt2Var = this.e;
        if (gt2Var != null) {
            gt2Var.invoke(webView, str);
        }
    }

    @Override // android.webkit.WebViewClient
    public void onPageStarted(WebView webView, String str, Bitmap bitmap) {
        WebViewClientSwazzledHooks._preOnPageStarted(webView, str, bitmap);
        zq3.h(webView, "view");
        zq3.h(str, "url");
        this.b.invoke(Boolean.TRUE);
        this.d.mo865invoke();
        super.onPageStarted(webView, str, bitmap);
    }

    @Override // android.webkit.WebViewClient
    public void onReceivedError(WebView webView, WebResourceRequest webResourceRequest, WebResourceError webResourceError) {
        Uri url;
        super.onReceivedError(webView, webResourceRequest, webResourceError);
        gt2 gt2Var = this.e;
        if (gt2Var != null) {
            gt2Var.invoke(webView, (webResourceRequest == null || (url = webResourceRequest.getUrl()) == null) ? null : url.toString());
        }
    }

    @Override // android.webkit.WebViewClient
    public boolean shouldOverrideUrlLoading(WebView webView, WebResourceRequest webResourceRequest) {
        zq3.h(webView, "view");
        zq3.h(webResourceRequest, "request");
        if (((Boolean) this.a.mo865invoke()).booleanValue()) {
            return super.shouldOverrideUrlLoading(webView, webResourceRequest);
        }
        this.c.mo865invoke();
        return true;
    }
}
