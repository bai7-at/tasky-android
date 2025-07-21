package defpackage;

import android.graphics.Bitmap;
import android.webkit.WebResourceRequest;
import android.webkit.WebResourceResponse;
import android.webkit.WebView;
import io.embrace.android.embracesdk.WebViewClientSwazzledHooks;

/* loaded from: classes3.dex */
public final class fnb extends enb {
    public fnb(wlb wlbVar, ina inaVar, boolean z, l8d l8dVar) {
        super(wlbVar, inaVar, z, l8dVar);
    }

    @Override // defpackage.enb, defpackage.emb, android.webkit.WebViewClient
    public void onPageStarted(WebView webView, String str, Bitmap bitmap) {
        WebViewClientSwazzledHooks._preOnPageStarted(webView, str, bitmap);
        super.onPageStarted(webView, str, bitmap);
    }

    @Override // android.webkit.WebViewClient
    public final WebResourceResponse shouldInterceptRequest(WebView webView, WebResourceRequest webResourceRequest) {
        if (webResourceRequest == null || webResourceRequest.getUrl() == null) {
            return null;
        }
        return Q0(webView, webResourceRequest.getUrl().toString(), webResourceRequest.getRequestHeaders());
    }
}
