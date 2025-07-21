package com.nytimes.android.hybrid;

import android.content.Context;
import android.graphics.Bitmap;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import com.nytimes.android.hybrid.a;
import defpackage.by0;
import defpackage.cl6;
import defpackage.gt2;
import defpackage.it2;
import defpackage.ju;
import defpackage.mc7;
import defpackage.ne9;
import defpackage.ww8;
import defpackage.zq3;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes4.dex */
public abstract class HybridWebView extends WebView implements ju {
    private final a a;
    private final mc7 b;
    private final ne9 c;

    public /* synthetic */ HybridWebView(Context context, a aVar, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i & 2) != 0 ? new AsyncEvaluatorImpl() : aVar);
    }

    static /* synthetic */ Object c(HybridWebView hybridWebView, String str, by0 by0Var) {
        return a.C0329a.a(hybridWebView.a, hybridWebView, str, null, by0Var, 4, null);
    }

    @Override // defpackage.ju
    public Object a(String str, by0 by0Var) {
        return c(this, str, by0Var);
    }

    public final mc7 getScriptInjector() {
        return this.b;
    }

    @Override // android.webkit.WebView
    public void setWebViewClient(WebViewClient webViewClient) {
        zq3.h(webViewClient, "client");
        this.c.b(webViewClient);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HybridWebView(Context context, a aVar) {
        super(context);
        zq3.h(context, "context");
        zq3.h(aVar, "asyncEvaluator");
        this.a = aVar;
        this.b = new mc7();
        ne9 ne9Var = new ne9(new WebViewClient(), new it2() { // from class: com.nytimes.android.hybrid.HybridWebView$clientProxy$1
            {
                super(3);
            }

            public final void b(WebView webView, String str, Bitmap bitmap) {
                a aVar2;
                aVar2 = HybridWebView.this.a;
                aVar2.a(webView);
            }

            @Override // defpackage.it2
            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
                b((WebView) obj, (String) obj2, (Bitmap) obj3);
                return ww8.a;
            }
        }, new gt2() { // from class: com.nytimes.android.hybrid.HybridWebView$clientProxy$2
            {
                super(2);
            }

            public final void b(WebView webView, String str) {
                a aVar2;
                HybridWebView.this.getScriptInjector().a(webView);
                aVar2 = HybridWebView.this.a;
                aVar2.c(webView);
            }

            @Override // defpackage.gt2
            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                b((WebView) obj, (String) obj2);
                return ww8.a;
            }
        }, null, 8, null);
        this.c = ne9Var;
        super.setWebViewClient(ne9Var);
        WebSettings settings = getSettings();
        settings.setJavaScriptEnabled(true);
        settings.setLoadsImagesAutomatically(true);
        settings.setJavaScriptCanOpenWindowsAutomatically(false);
        settings.setDomStorageEnabled(true);
        settings.setAllowFileAccessFromFileURLs(true);
        settings.setAllowUniversalAccessFromFileURLs(true);
        settings.setUserAgentString(WebSettings.getDefaultUserAgent(context) + " nyt_android/" + context.getResources().getString(cl6.hybrid_version));
    }
}
