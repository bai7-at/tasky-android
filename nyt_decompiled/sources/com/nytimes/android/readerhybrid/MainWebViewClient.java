package com.nytimes.android.readerhybrid;

import android.app.Activity;
import android.graphics.Bitmap;
import android.webkit.WebResourceError;
import android.webkit.WebResourceRequest;
import android.webkit.WebResourceResponse;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import androidx.fragment.app.f;
import com.nytimes.android.coroutinesutils.FlatMapFirstKt;
import com.nytimes.android.hybrid.AsyncEvaluatorImpl;
import com.nytimes.android.hybrid.a;
import com.nytimes.android.performancetrackerclientphoenix.event.base.HybridType;
import com.nytimes.android.utils.snackbar.SnackbarUtil;
import defpackage.by0;
import defpackage.fz8;
import defpackage.hd3;
import defpackage.ic3;
import defpackage.if9;
import defpackage.ld1;
import defpackage.pe9;
import defpackage.rb5;
import defpackage.ss2;
import defpackage.uy3;
import defpackage.ww8;
import defpackage.xt6;
import defpackage.zq3;
import io.embrace.android.embracesdk.WebViewClientSwazzledHooks;
import io.reactivex.ObservableSource;
import io.reactivex.subjects.PublishSubject;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import kotlin.text.h;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.rx2.RxConvertKt;

/* loaded from: classes4.dex */
public abstract class MainWebViewClient extends WebViewClient {
    private ss2 a;
    private final com.nytimes.android.hybrid.a b = new AsyncEvaluatorImpl();
    private final PublishSubject c;
    public Activity context;
    private boolean d;
    public ld1 deepLinkUtils;
    private boolean e;
    private boolean f;
    private xt6 g;
    private HybridType h;
    public ic3 hybridLinkHandler;
    public hd3 hybridPerformanceTracker;
    public uy3 launchProductLandingHelper;
    public SnackbarUtil snackbarUtil;
    public pe9 webViewCustomHeaders;
    public if9 webViewRequestInterceptor;

    public MainWebViewClient() {
        PublishSubject create = PublishSubject.create();
        zq3.g(create, "create(...)");
        this.c = create;
        this.h = HybridType.Unknown;
    }

    static /* synthetic */ Object k(MainWebViewClient mainWebViewClient, fz8 fz8Var, by0 by0Var) {
        String a;
        String a2;
        if (mainWebViewClient.c().e() || mainWebViewClient.f) {
            String a3 = fz8Var.a();
            ss2 ss2Var = mainWebViewClient.a;
            if (ss2Var == null || !((Boolean) ss2Var.invoke(a3)).booleanValue()) {
                if (rb5.j(a3)) {
                    mainWebViewClient.b().startActivity(mainWebViewClient.f().a());
                } else if (rb5.g(a3)) {
                    mainWebViewClient.b().startActivity(mainWebViewClient.f().g());
                } else {
                    if (!mainWebViewClient.e && (mainWebViewClient.d || rb5.k(a3) || h.K(a3, "file://", false, 2, null))) {
                        Object withContext = BuildersKt.withContext(Dispatchers.getMain(), new MainWebViewClient$handleURL$2(mainWebViewClient, fz8Var, a3, null), by0Var);
                        return withContext == kotlin.coroutines.intrinsics.a.h() ? withContext : ww8.a;
                    }
                    String str = "";
                    if (rb5.r(a3)) {
                        ic3 d = mainWebViewClient.d();
                        Activity b = mainWebViewClient.b();
                        zq3.f(b, "null cannot be cast to non-null type androidx.fragment.app.FragmentActivity");
                        f fVar = (f) b;
                        String b2 = rb5.a.b(a3);
                        xt6 xt6Var = mainWebViewClient.g;
                        if (xt6Var != null && (a2 = xt6Var.a()) != null) {
                            str = a2;
                        }
                        Object a4 = d.a(fVar, b2, str, by0Var);
                        return a4 == kotlin.coroutines.intrinsics.a.h() ? a4 : ww8.a;
                    }
                    if (rb5.f(a3)) {
                        mainWebViewClient.d().b(mainWebViewClient.b(), rb5.a.a(a3));
                    } else if (!mainWebViewClient.c().b(mainWebViewClient.b(), a3)) {
                        if (!rb5.s(a3)) {
                            ic3 d2 = mainWebViewClient.d();
                            Activity b3 = mainWebViewClient.b();
                            zq3.f(b3, "null cannot be cast to non-null type androidx.fragment.app.FragmentActivity");
                            f fVar2 = (f) b3;
                            xt6 xt6Var2 = mainWebViewClient.g;
                            if (xt6Var2 != null && (a = xt6Var2.a()) != null) {
                                str = a;
                            }
                            Object a5 = d2.a(fVar2, a3, str, by0Var);
                            return a5 == kotlin.coroutines.intrinsics.a.h() ? a5 : ww8.a;
                        }
                        mainWebViewClient.c().c(mainWebViewClient.b(), a3);
                    }
                }
            }
        } else {
            SnackbarUtil.p(mainWebViewClient.g(), false, 1, null);
        }
        return ww8.a;
    }

    private final boolean m(WebView webView, String str, boolean z) {
        if (z) {
            return false;
        }
        this.c.onNext(new fz8(str, webView));
        return true;
    }

    public final Object a(WebView webView, String str, by0 by0Var) {
        return a.C0329a.a(this.b, webView, str, null, by0Var, 4, null);
    }

    public final Activity b() {
        Activity activity = this.context;
        if (activity != null) {
            return activity;
        }
        zq3.z("context");
        return null;
    }

    public final ld1 c() {
        ld1 ld1Var = this.deepLinkUtils;
        if (ld1Var != null) {
            return ld1Var;
        }
        zq3.z("deepLinkUtils");
        return null;
    }

    public final ic3 d() {
        ic3 ic3Var = this.hybridLinkHandler;
        if (ic3Var != null) {
            return ic3Var;
        }
        zq3.z("hybridLinkHandler");
        return null;
    }

    public final hd3 e() {
        hd3 hd3Var = this.hybridPerformanceTracker;
        if (hd3Var != null) {
            return hd3Var;
        }
        zq3.z("hybridPerformanceTracker");
        return null;
    }

    public final uy3 f() {
        uy3 uy3Var = this.launchProductLandingHelper;
        if (uy3Var != null) {
            return uy3Var;
        }
        zq3.z("launchProductLandingHelper");
        return null;
    }

    public final SnackbarUtil g() {
        SnackbarUtil snackbarUtil = this.snackbarUtil;
        if (snackbarUtil != null) {
            return snackbarUtil;
        }
        zq3.z("snackbarUtil");
        return null;
    }

    public final pe9 h() {
        pe9 pe9Var = this.webViewCustomHeaders;
        if (pe9Var != null) {
            return pe9Var;
        }
        zq3.z("webViewCustomHeaders");
        return null;
    }

    public final if9 i() {
        if9 if9Var = this.webViewRequestInterceptor;
        if (if9Var != null) {
            return if9Var;
        }
        zq3.z("webViewRequestInterceptor");
        return null;
    }

    public Object j(fz8 fz8Var, by0 by0Var) {
        return k(this, fz8Var, by0Var);
    }

    protected final void l(CoroutineScope coroutineScope) {
        zq3.h(coroutineScope, "scope");
        ObservableSource throttleFirst = this.c.throttleFirst(200L, TimeUnit.MILLISECONDS);
        zq3.g(throttleFirst, "throttleFirst(...)");
        FlowKt.launchIn(FlowKt.m911catch(FlatMapFirstKt.a(RxConvertKt.asFlow(throttleFirst), new MainWebViewClient$init$1(this, null)), new MainWebViewClient$init$2(null)), coroutineScope);
    }

    protected final void n(boolean z) {
        this.f = z;
    }

    protected final void o(ss2 ss2Var) {
        this.a = ss2Var;
    }

    @Override // android.webkit.WebViewClient
    public void onPageFinished(WebView webView, String str) {
        zq3.h(webView, "view");
        zq3.h(str, "url");
        super.onPageFinished(webView, str);
        this.b.c(webView);
        hd3.u(e(), webView, null, this.h, 2, null);
    }

    @Override // android.webkit.WebViewClient
    public void onPageStarted(WebView webView, String str, Bitmap bitmap) {
        WebViewClientSwazzledHooks._preOnPageStarted(webView, str, bitmap);
        zq3.h(webView, "view");
        zq3.h(str, "url");
        super.onPageStarted(webView, str, bitmap);
        this.b.a(webView);
        e().p();
    }

    @Override // android.webkit.WebViewClient
    public void onReceivedError(WebView webView, WebResourceRequest webResourceRequest, WebResourceError webResourceError) {
        zq3.h(webView, "view");
        zq3.h(webResourceRequest, "request");
        zq3.h(webResourceError, "error");
        super.onReceivedError(webView, webResourceRequest, webResourceError);
        if (webResourceRequest.isForMainFrame()) {
            e().o(new RuntimeException(webResourceError.getDescription().toString()), c.class.getName(), webResourceRequest.getUrl(), this.h);
        }
    }

    protected final void p(boolean z) {
        this.e = z;
    }

    protected final void q(boolean z) {
        this.d = z;
    }

    protected final void r(HybridType hybridType) {
        zq3.h(hybridType, "<set-?>");
        this.h = hybridType;
    }

    protected final void s(xt6 xt6Var) {
        this.g = xt6Var;
    }

    @Override // android.webkit.WebViewClient
    public WebResourceResponse shouldInterceptRequest(WebView webView, WebResourceRequest webResourceRequest) {
        zq3.h(webView, "view");
        zq3.h(webResourceRequest, "request");
        if9 i = i();
        String uri = webResourceRequest.getUrl().toString();
        zq3.g(uri, "toString(...)");
        Map<String, String> requestHeaders = webResourceRequest.getRequestHeaders();
        zq3.g(requestHeaders, "getRequestHeaders(...)");
        WebResourceResponse a = i.a(uri, requestHeaders);
        return a == null ? super.shouldInterceptRequest(webView, webResourceRequest) : a;
    }

    @Override // android.webkit.WebViewClient
    public boolean shouldOverrideUrlLoading(WebView webView, WebResourceRequest webResourceRequest) {
        zq3.h(webView, "view");
        zq3.h(webResourceRequest, "request");
        String uri = webResourceRequest.getUrl().toString();
        zq3.g(uri, "toString(...)");
        return m(webView, uri, webResourceRequest.isRedirect());
    }

    @Override // android.webkit.WebViewClient
    public boolean shouldOverrideUrlLoading(WebView webView, String str) {
        zq3.h(webView, "view");
        zq3.h(str, "url");
        return m(webView, str, false);
    }
}
