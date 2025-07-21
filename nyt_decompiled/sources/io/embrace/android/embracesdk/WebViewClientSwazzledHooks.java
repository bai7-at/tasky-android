package io.embrace.android.embracesdk;

import android.graphics.Bitmap;
import android.webkit.WebView;
import io.embrace.android.embracesdk.annotation.InternalApi;

@InternalApi
/* loaded from: classes5.dex */
public final class WebViewClientSwazzledHooks {
    private WebViewClientSwazzledHooks() {
    }

    public static void _preOnPageStarted(WebView webView, String str, Bitmap bitmap) {
        Embrace.getImpl().logWebView(str);
    }
}
