package defpackage;

import android.webkit.WebView;

/* loaded from: classes3.dex */
public final class l9e extends k9e {
    public l9e(WebView webView) {
        if (!webView.getSettings().getJavaScriptEnabled()) {
            webView.getSettings().setJavaScriptEnabled(true);
        }
        j(webView);
    }
}
