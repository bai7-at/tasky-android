package defpackage;

import android.graphics.Bitmap;
import android.webkit.WebResourceError;
import android.webkit.WebResourceRequest;
import android.webkit.WebView;
import com.nytimes.android.performancetrackerclientphoenix.event.base.HybridType;
import com.nytimes.android.readerhybrid.MainWebViewClient;
import io.embrace.android.embracesdk.WebViewClientSwazzledHooks;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.StateFlowKt;

/* loaded from: classes4.dex */
public final class le9 extends MainWebViewClient {
    private final MutableStateFlow i = StateFlowKt.MutableStateFlow(Boolean.TRUE);
    private ss2 j;
    private lw0 k;

    @Override // com.nytimes.android.readerhybrid.MainWebViewClient, android.webkit.WebViewClient
    public void onPageFinished(WebView webView, String str) {
        zq3.h(webView, "view");
        zq3.h(str, "url");
        this.i.setValue(Boolean.FALSE);
        lw0 lw0Var = this.k;
        if (lw0Var == null) {
            zq3.z("contentLoadedListener");
            lw0Var = null;
        }
        lw0Var.I0();
    }

    @Override // com.nytimes.android.readerhybrid.MainWebViewClient, android.webkit.WebViewClient
    public void onPageStarted(WebView webView, String str, Bitmap bitmap) {
        WebViewClientSwazzledHooks._preOnPageStarted(webView, str, bitmap);
        zq3.h(webView, "view");
        zq3.h(str, "url");
        this.i.setValue(Boolean.TRUE);
        ss2 ss2Var = this.j;
        if (ss2Var == null) {
            zq3.z("deepLinkAnalyticsReporter");
            ss2Var = null;
        }
        ss2Var.invoke(str);
    }

    @Override // com.nytimes.android.readerhybrid.MainWebViewClient, android.webkit.WebViewClient
    public void onReceivedError(WebView webView, WebResourceRequest webResourceRequest, WebResourceError webResourceError) {
        zq3.h(webView, "view");
        zq3.h(webResourceRequest, "request");
        zq3.h(webResourceError, "error");
        super.onReceivedError(webView, webResourceRequest, webResourceError);
        if (webResourceRequest.isForMainFrame()) {
            this.i.setValue(Boolean.FALSE);
        }
    }

    public final void t(ss2 ss2Var, boolean z, boolean z2, boolean z3, lw0 lw0Var, ss2 ss2Var2, CoroutineScope coroutineScope, HybridType hybridType) {
        zq3.h(ss2Var, "deepLinkAnalyticsReporter");
        zq3.h(lw0Var, "contentLoadedListener");
        zq3.h(coroutineScope, "scope");
        zq3.h(hybridType, "hybridType");
        l(coroutineScope);
        this.j = ss2Var;
        o(ss2Var2);
        this.k = lw0Var;
        q(z);
        p(z2);
        n(z3);
        r(hybridType);
    }

    public final Flow u() {
        return this.i;
    }
}
