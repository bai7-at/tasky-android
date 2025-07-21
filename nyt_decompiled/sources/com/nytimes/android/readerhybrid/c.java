package com.nytimes.android.readerhybrid;

import android.graphics.Bitmap;
import android.webkit.WebView;
import com.nytimes.android.performancetrackerclientphoenix.event.base.HybridType;
import defpackage.lw0;
import defpackage.xt6;
import defpackage.zq3;
import io.embrace.android.embracesdk.WebViewClientSwazzledHooks;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlinx.coroutines.CoroutineScope;

/* loaded from: classes4.dex */
public final class c extends MainWebViewClient {
    private lw0 i;
    private final AtomicBoolean j = new AtomicBoolean(false);

    @Override // com.nytimes.android.readerhybrid.MainWebViewClient, android.webkit.WebViewClient
    public void onPageFinished(WebView webView, String str) {
        zq3.h(webView, "view");
        zq3.h(str, "url");
        super.onPageFinished(webView, str);
        this.j.set(true);
        lw0 lw0Var = this.i;
        if (lw0Var != null) {
            lw0Var.I0();
        }
    }

    @Override // com.nytimes.android.readerhybrid.MainWebViewClient, android.webkit.WebViewClient
    public void onPageStarted(WebView webView, String str, Bitmap bitmap) {
        WebViewClientSwazzledHooks._preOnPageStarted(webView, str, bitmap);
        super.onPageStarted(webView, str, bitmap);
    }

    public final void t(lw0 lw0Var, xt6 xt6Var, CoroutineScope coroutineScope, HybridType hybridType) {
        zq3.h(xt6Var, "linkExtrasProvider");
        zq3.h(coroutineScope, "scope");
        zq3.h(hybridType, "hybridType");
        l(coroutineScope);
        this.i = lw0Var;
        s(xt6Var);
        r(hybridType);
    }
}
