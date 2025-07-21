package defpackage;

import android.graphics.Bitmap;
import android.util.Log;
import android.webkit.RenderProcessGoneDetail;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import io.embrace.android.embracesdk.WebViewClientSwazzledHooks;

/* loaded from: classes3.dex */
final class m9e extends WebViewClient {
    final String a = "OMID NativeBridge WebViewClient";
    final /* synthetic */ o9e b;

    m9e(o9e o9eVar) {
        this.b = o9eVar;
    }

    @Override // android.webkit.WebViewClient
    public void onPageStarted(WebView webView, String str, Bitmap bitmap) {
        WebViewClientSwazzledHooks._preOnPageStarted(webView, str, bitmap);
        super.onPageStarted(webView, str, bitmap);
    }

    @Override // android.webkit.WebViewClient
    public final boolean onRenderProcessGone(WebView webView, RenderProcessGoneDetail renderProcessGoneDetail) {
        Log.w(this.a, "WebView renderer gone: ".concat(String.valueOf(renderProcessGoneDetail.toString())));
        if (this.b.a() != webView) {
            return super.onRenderProcessGone(webView, renderProcessGoneDetail);
        }
        Log.w(this.a, "Deallocating the Native bridge as it is unusable. No further events will be generated for this session.");
        this.b.j(null);
        webView.destroy();
        return true;
    }
}
