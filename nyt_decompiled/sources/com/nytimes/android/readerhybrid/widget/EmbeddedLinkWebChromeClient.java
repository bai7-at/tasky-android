package com.nytimes.android.readerhybrid.widget;

import android.os.Message;
import android.view.View;
import android.webkit.WebChromeClient;
import android.webkit.WebView;
import androidx.fragment.app.f;
import com.nytimes.android.utils.snackbar.SnackbarUtil;
import defpackage.e44;
import defpackage.ic3;
import defpackage.ld1;
import defpackage.ls2;
import defpackage.rb5;
import defpackage.xt6;
import defpackage.zq3;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;

/* loaded from: classes4.dex */
public final class EmbeddedLinkWebChromeClient extends WebChromeClient {
    private final f a;
    private final ld1 b;
    private final SnackbarUtil c;
    private final ic3 d;
    private final xt6 e;
    private final ls2 f;

    public EmbeddedLinkWebChromeClient(f fVar, ld1 ld1Var, SnackbarUtil snackbarUtil, ic3 ic3Var, xt6 xt6Var, ls2 ls2Var) {
        zq3.h(fVar, "context");
        zq3.h(ld1Var, "deepLinkUtils");
        zq3.h(snackbarUtil, "snackbarUtil");
        zq3.h(ic3Var, "hybridLinkHandler");
        zq3.h(xt6Var, "linkExtrasProvider");
        zq3.h(ls2Var, "delegate");
        this.a = fVar;
        this.b = ld1Var;
        this.c = snackbarUtil;
        this.d = ic3Var;
        this.e = xt6Var;
        this.f = ls2Var;
    }

    @Override // android.webkit.WebChromeClient
    public boolean onCreateWindow(WebView webView, boolean z, boolean z2, Message message) {
        zq3.h(webView, "webView");
        zq3.h(message, "resultMsg");
        Message obtainMessage = webView.getHandler().obtainMessage();
        webView.requestFocusNodeHref(obtainMessage);
        String string = obtainMessage.getData().getString("url");
        if (string == null) {
            WebView webView2 = new WebView(webView.getContext());
            webView2.setWebViewClient(webView.getWebViewClient());
            Object obj = message.obj;
            zq3.f(obj, "null cannot be cast to non-null type android.webkit.WebView.WebViewTransport");
            ((WebView.WebViewTransport) obj).setWebView(webView2);
            webView.addView(webView2);
            message.sendToTarget();
            return true;
        }
        if (rb5.l(string)) {
            BuildersKt__Builders_commonKt.launch$default(e44.a(this.a), null, null, new EmbeddedLinkWebChromeClient$onCreateWindow$2(this, string, null), 3, null);
        } else if (rb5.f(string)) {
            this.d.b(this.a, rb5.a.a(string));
        } else if (!this.b.e()) {
            SnackbarUtil.p(this.c, false, 1, null);
        } else if (!this.b.b(this.a, string)) {
            webView.loadUrl(string);
            return true;
        }
        return false;
    }

    @Override // android.webkit.WebChromeClient
    public void onHideCustomView() {
        this.f.onHideCustomView();
    }

    @Override // android.webkit.WebChromeClient
    public void onShowCustomView(View view, WebChromeClient.CustomViewCallback customViewCallback) {
        this.f.onShowCustomView(view, customViewCallback);
    }
}
