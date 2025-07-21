package defpackage;

import android.webkit.WebSettings;
import android.webkit.WebView;

/* loaded from: classes4.dex */
public final class rd3 {
    public static final rd3 a = new rd3();

    private rd3() {
    }

    public final void a(WebView webView, boolean z, String str) {
        zq3.h(webView, "webView");
        zq3.h(str, "userAgent");
        WebSettings settings = webView.getSettings();
        settings.setJavaScriptEnabled(true);
        settings.setLoadsImagesAutomatically(true);
        settings.setJavaScriptCanOpenWindowsAutomatically(false);
        settings.setDomStorageEnabled(true);
        settings.setCacheMode(-1);
        settings.setSupportZoom(true);
        settings.setBuiltInZoomControls(true);
        settings.setDisplayZoomControls(false);
        settings.setAllowFileAccessFromFileURLs(true);
        settings.setAllowUniversalAccessFromFileURLs(true);
        settings.setSupportMultipleWindows(true);
        settings.setMediaPlaybackRequiresUserGesture(true ^ z);
        settings.setUserAgentString(str);
    }
}
