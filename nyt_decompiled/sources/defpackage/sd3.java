package defpackage;

import android.webkit.WebSettings;
import android.webkit.WebView;
import com.nytimes.android.readerhybrid.WebViewType;

/* loaded from: classes4.dex */
public final class sd3 {
    private final tm a;

    public sd3(tm tmVar) {
        zq3.h(tmVar, "preferences");
        this.a = tmVar;
    }

    private final void a(WebView webView) {
        webView.getSettings().setJavaScriptEnabled(true);
        webView.getSettings().setLoadsImagesAutomatically(true);
        webView.getSettings().setJavaScriptCanOpenWindowsAutomatically(false);
        webView.setVerticalScrollBarEnabled(true);
        webView.getSettings().setDomStorageEnabled(true);
        webView.getSettings().setLoadWithOverviewMode(true);
        webView.getSettings().setUseWideViewPort(true);
        webView.getSettings().setSupportZoom(true);
        webView.getSettings().setBuiltInZoomControls(true);
        webView.getSettings().setDisplayZoomControls(false);
    }

    private final void c(WebView webView, boolean z) {
        WebSettings settings = webView.getSettings();
        settings.setJavaScriptEnabled(true);
        settings.setLoadsImagesAutomatically(true);
        settings.setJavaScriptCanOpenWindowsAutomatically(false);
        settings.setDomStorageEnabled(true);
        settings.setLoadWithOverviewMode(true);
        settings.setUseWideViewPort(true);
        settings.setSupportZoom(true);
        settings.setBuiltInZoomControls(true);
        settings.setDisplayZoomControls(false);
        settings.setAllowFileAccessFromFileURLs(true);
        settings.setAllowUniversalAccessFromFileURLs(true);
        settings.setSupportMultipleWindows(true);
        settings.setMediaPlaybackRequiresUserGesture(true ^ z);
    }

    public final void b(WebView webView, WebViewType webViewType) {
        zq3.h(webView, "webView");
        zq3.h(webViewType, "webViewType");
        if (webViewType == WebViewType.HYBRID || webViewType == WebViewType.EMBEDDED) {
            c(webView, this.a.g());
        } else {
            a(webView);
        }
    }
}
