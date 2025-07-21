package co.datadome.sdk;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.app.FragmentManager;
import android.content.Context;
import android.graphics.Bitmap;
import android.net.http.SslError;
import android.os.Message;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.View;
import android.webkit.ClientCertRequest;
import android.webkit.CookieManager;
import android.webkit.HttpAuthHandler;
import android.webkit.RenderProcessGoneDetail;
import android.webkit.SafeBrowsingResponse;
import android.webkit.SslErrorHandler;
import android.webkit.ValueCallback;
import android.webkit.WebResourceError;
import android.webkit.WebResourceRequest;
import android.webkit.WebResourceResponse;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import com.chartbeat.androidsdk.QueryKeys;
import defpackage.zq3;
import io.embrace.android.embracesdk.WebViewClientSwazzledHooks;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import kotlin.TypeCastException;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.text.Regex;

@SuppressLint({"SetJavaScriptEnabled"})
/* loaded from: classes.dex */
public class DataDomeWebView extends WebView {
    private HashMap _$_findViewCache;
    private final List<FragmentManager.k> androidXFragmentLifecycleCallbacks;
    private final Regex domainAttrPattern;
    private boolean fromShouldOverrideUrlLoading;
    private String initialUrl;
    private final List<FragmentManager.OnBackStackChangedListener> legacyBackStackListeners;
    private final List<FragmentManager.FragmentLifecycleCallbacks> legacyFragmentLifecycleCallbacks;
    private WebViewClient userWebViewClient;

    private final class a extends WebViewClient {
        public a() {
        }

        @Override // android.webkit.WebViewClient
        public void doUpdateVisitedHistory(WebView webView, String str, boolean z) {
            super.doUpdateVisitedHistory(webView, str, z);
            WebViewClient webViewClient = DataDomeWebView.this.userWebViewClient;
            if (webViewClient != null) {
                webViewClient.doUpdateVisitedHistory(webView, str, z);
            }
        }

        @Override // android.webkit.WebViewClient
        public void onFormResubmission(WebView webView, Message message, Message message2) {
            super.onFormResubmission(webView, message, message2);
            WebViewClient webViewClient = DataDomeWebView.this.userWebViewClient;
            if (webViewClient != null) {
                webViewClient.onFormResubmission(webView, message, message2);
            }
        }

        @Override // android.webkit.WebViewClient
        public void onLoadResource(WebView webView, String str) {
            super.onLoadResource(webView, str);
            WebViewClient webViewClient = DataDomeWebView.this.userWebViewClient;
            if (webViewClient != null) {
                webViewClient.onLoadResource(webView, str);
            }
        }

        @Override // android.webkit.WebViewClient
        public void onPageCommitVisible(WebView webView, String str) {
            super.onPageCommitVisible(webView, str);
            WebViewClient webViewClient = DataDomeWebView.this.userWebViewClient;
            if (webViewClient != null) {
                webViewClient.onPageCommitVisible(webView, str);
            }
        }

        @Override // android.webkit.WebViewClient
        public void onPageFinished(WebView webView, String str) {
            zq3.i(str, "url");
            super.onPageFinished(webView, str);
            WebViewClient webViewClient = DataDomeWebView.this.userWebViewClient;
            if (webViewClient != null) {
                webViewClient.onPageFinished(webView, str);
            }
            DataDomeWebView.this.syncCookieFromWebView(str);
            DataDomeWebView.this.fromShouldOverrideUrlLoading = false;
        }

        @Override // android.webkit.WebViewClient
        public void onPageStarted(WebView webView, String str, Bitmap bitmap) {
            WebViewClientSwazzledHooks._preOnPageStarted(webView, str, bitmap);
            zq3.i(str, "url");
            super.onPageStarted(webView, str, bitmap);
            WebViewClient webViewClient = DataDomeWebView.this.userWebViewClient;
            if (webViewClient != null) {
                webViewClient.onPageStarted(webView, str, bitmap);
            }
        }

        @Override // android.webkit.WebViewClient
        public void onReceivedClientCertRequest(WebView webView, ClientCertRequest clientCertRequest) {
            super.onReceivedClientCertRequest(webView, clientCertRequest);
            WebViewClient webViewClient = DataDomeWebView.this.userWebViewClient;
            if (webViewClient != null) {
                webViewClient.onReceivedClientCertRequest(webView, clientCertRequest);
            }
        }

        @Override // android.webkit.WebViewClient
        public void onReceivedError(WebView webView, int i, String str, String str2) {
            super.onReceivedError(webView, i, str, str2);
            WebViewClient webViewClient = DataDomeWebView.this.userWebViewClient;
            if (webViewClient != null) {
                webViewClient.onReceivedError(webView, i, str, str2);
            }
        }

        @Override // android.webkit.WebViewClient
        public void onReceivedHttpAuthRequest(WebView webView, HttpAuthHandler httpAuthHandler, String str, String str2) {
            super.onReceivedHttpAuthRequest(webView, httpAuthHandler, str, str2);
            WebViewClient webViewClient = DataDomeWebView.this.userWebViewClient;
            if (webViewClient != null) {
                webViewClient.onReceivedHttpAuthRequest(webView, httpAuthHandler, str, str2);
            }
        }

        @Override // android.webkit.WebViewClient
        public void onReceivedHttpError(WebView webView, WebResourceRequest webResourceRequest, WebResourceResponse webResourceResponse) {
            super.onReceivedHttpError(webView, webResourceRequest, webResourceResponse);
            WebViewClient webViewClient = DataDomeWebView.this.userWebViewClient;
            if (webViewClient != null) {
                webViewClient.onReceivedHttpError(webView, webResourceRequest, webResourceResponse);
            }
        }

        @Override // android.webkit.WebViewClient
        public void onReceivedLoginRequest(WebView webView, String str, String str2, String str3) {
            super.onReceivedLoginRequest(webView, str, str2, str3);
            WebViewClient webViewClient = DataDomeWebView.this.userWebViewClient;
            if (webViewClient != null) {
                webViewClient.onReceivedLoginRequest(webView, str, str2, str3);
            }
        }

        @Override // android.webkit.WebViewClient
        public void onReceivedSslError(WebView webView, SslErrorHandler sslErrorHandler, SslError sslError) {
            super.onReceivedSslError(webView, sslErrorHandler, sslError);
            WebViewClient webViewClient = DataDomeWebView.this.userWebViewClient;
            if (webViewClient != null) {
                webViewClient.onReceivedSslError(webView, sslErrorHandler, sslError);
            }
        }

        @Override // android.webkit.WebViewClient
        public boolean onRenderProcessGone(WebView webView, RenderProcessGoneDetail renderProcessGoneDetail) {
            WebViewClient webViewClient = DataDomeWebView.this.userWebViewClient;
            return webViewClient != null ? webViewClient.onRenderProcessGone(webView, renderProcessGoneDetail) : super.onRenderProcessGone(webView, renderProcessGoneDetail);
        }

        @Override // android.webkit.WebViewClient
        public void onSafeBrowsingHit(WebView webView, WebResourceRequest webResourceRequest, int i, SafeBrowsingResponse safeBrowsingResponse) {
            super.onSafeBrowsingHit(webView, webResourceRequest, i, safeBrowsingResponse);
            WebViewClient webViewClient = DataDomeWebView.this.userWebViewClient;
            if (webViewClient != null) {
                webViewClient.onSafeBrowsingHit(webView, webResourceRequest, i, safeBrowsingResponse);
            }
        }

        @Override // android.webkit.WebViewClient
        public void onScaleChanged(WebView webView, float f, float f2) {
            super.onScaleChanged(webView, f, f2);
            WebViewClient webViewClient = DataDomeWebView.this.userWebViewClient;
            if (webViewClient != null) {
                webViewClient.onScaleChanged(webView, f, f2);
            }
        }

        @Override // android.webkit.WebViewClient
        public void onTooManyRedirects(WebView webView, Message message, Message message2) {
            super.onTooManyRedirects(webView, message, message2);
            WebViewClient webViewClient = DataDomeWebView.this.userWebViewClient;
            if (webViewClient != null) {
                webViewClient.onTooManyRedirects(webView, message, message2);
            }
        }

        @Override // android.webkit.WebViewClient
        public void onUnhandledKeyEvent(WebView webView, KeyEvent keyEvent) {
            super.onUnhandledKeyEvent(webView, keyEvent);
            WebViewClient webViewClient = DataDomeWebView.this.userWebViewClient;
            if (webViewClient != null) {
                webViewClient.onUnhandledKeyEvent(webView, keyEvent);
            }
        }

        @Override // android.webkit.WebViewClient
        public WebResourceResponse shouldInterceptRequest(WebView webView, WebResourceRequest webResourceRequest) {
            WebResourceResponse shouldInterceptRequest;
            WebViewClient webViewClient = DataDomeWebView.this.userWebViewClient;
            return (webViewClient == null || (shouldInterceptRequest = webViewClient.shouldInterceptRequest(webView, webResourceRequest)) == null) ? super.shouldInterceptRequest(webView, webResourceRequest) : shouldInterceptRequest;
        }

        @Override // android.webkit.WebViewClient
        public boolean shouldOverrideKeyEvent(WebView webView, KeyEvent keyEvent) {
            WebViewClient webViewClient = DataDomeWebView.this.userWebViewClient;
            return webViewClient != null ? webViewClient.shouldOverrideKeyEvent(webView, keyEvent) : super.shouldOverrideKeyEvent(webView, keyEvent);
        }

        @Override // android.webkit.WebViewClient
        public boolean shouldOverrideUrlLoading(WebView webView, WebResourceRequest webResourceRequest) {
            DataDomeWebView.this.fromShouldOverrideUrlLoading = true;
            WebViewClient webViewClient = DataDomeWebView.this.userWebViewClient;
            return webViewClient != null ? webViewClient.shouldOverrideUrlLoading(webView, webResourceRequest) : super.shouldOverrideUrlLoading(webView, webResourceRequest);
        }

        @Override // android.webkit.WebViewClient
        public void onReceivedError(WebView webView, WebResourceRequest webResourceRequest, WebResourceError webResourceError) {
            super.onReceivedError(webView, webResourceRequest, webResourceError);
            WebViewClient webViewClient = DataDomeWebView.this.userWebViewClient;
            if (webViewClient != null) {
                webViewClient.onReceivedError(webView, webResourceRequest, webResourceError);
            }
        }

        @Override // android.webkit.WebViewClient
        public WebResourceResponse shouldInterceptRequest(WebView webView, String str) {
            WebResourceResponse shouldInterceptRequest;
            WebViewClient webViewClient = DataDomeWebView.this.userWebViewClient;
            return (webViewClient == null || (shouldInterceptRequest = webViewClient.shouldInterceptRequest(webView, str)) == null) ? super.shouldInterceptRequest(webView, str) : shouldInterceptRequest;
        }

        @Override // android.webkit.WebViewClient
        public boolean shouldOverrideUrlLoading(WebView webView, String str) {
            DataDomeWebView.this.fromShouldOverrideUrlLoading = true;
            WebViewClient webViewClient = DataDomeWebView.this.userWebViewClient;
            return webViewClient != null ? webViewClient.shouldOverrideUrlLoading(webView, str) : super.shouldOverrideUrlLoading(webView, str);
        }
    }

    static final class b implements ValueCallback {
        final /* synthetic */ String b;
        final /* synthetic */ String c;
        final /* synthetic */ String d;
        final /* synthetic */ String e;
        final /* synthetic */ String f;

        b(String str, String str2, String str3, String str4, String str5) {
            this.b = str;
            this.c = str2;
            this.d = str3;
            this.e = str4;
            this.f = str5;
        }

        @Override // android.webkit.ValueCallback
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final void onReceiveValue(Boolean bool) {
            DataDomeWebView.super.loadDataWithBaseURL(this.b, this.c, this.d, this.e, this.f);
        }
    }

    static final class c implements ValueCallback {
        final /* synthetic */ String b;

        c(String str) {
            this.b = str;
        }

        @Override // android.webkit.ValueCallback
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final void onReceiveValue(Boolean bool) {
            DataDomeWebView.super.loadUrl(this.b);
        }
    }

    static final class d implements ValueCallback {
        final /* synthetic */ String b;
        final /* synthetic */ Map c;

        d(String str, Map map) {
            this.b = str;
            this.c = map;
        }

        @Override // android.webkit.ValueCallback
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final void onReceiveValue(Boolean bool) {
            DataDomeWebView.super.loadUrl(this.b, this.c);
        }
    }

    static final class e implements ValueCallback {
        final /* synthetic */ String b;
        final /* synthetic */ byte[] c;

        e(String str, byte[] bArr) {
            this.b = str;
            this.c = bArr;
        }

        @Override // android.webkit.ValueCallback
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final void onReceiveValue(Boolean bool) {
            DataDomeWebView.super.postUrl(this.b, this.c);
        }
    }

    public static final class f extends FragmentManager.k {
        f() {
        }

        @Override // androidx.fragment.app.FragmentManager.k
        public void i(androidx.fragment.app.FragmentManager fragmentManager, Fragment fragment) {
            zq3.i(fragmentManager, "fm");
            zq3.i(fragment, QueryKeys.VISIT_FREQUENCY);
            super.i(fragmentManager, fragment);
            DataDomeWebView dataDomeWebView = DataDomeWebView.this;
            String str = dataDomeWebView.initialUrl;
            if (str == null) {
                zq3.t();
            }
            dataDomeWebView.syncCookieFromWebView(str);
        }

        @Override // androidx.fragment.app.FragmentManager.k
        public void l(androidx.fragment.app.FragmentManager fragmentManager, Fragment fragment) {
            zq3.i(fragmentManager, "fm");
            zq3.i(fragment, QueryKeys.VISIT_FREQUENCY);
            super.l(fragmentManager, fragment);
            DataDomeWebView dataDomeWebView = DataDomeWebView.this;
            String str = dataDomeWebView.initialUrl;
            if (str == null) {
                zq3.t();
            }
            dataDomeWebView.syncCookieFromWebView(str);
        }
    }

    public static final class g extends FragmentManager.FragmentLifecycleCallbacks {
        g() {
        }

        @Override // android.app.FragmentManager.FragmentLifecycleCallbacks
        public void onFragmentPaused(android.app.FragmentManager fragmentManager, android.app.Fragment fragment) {
            super.onFragmentPaused(fragmentManager, fragment);
            DataDomeWebView dataDomeWebView = DataDomeWebView.this;
            String str = dataDomeWebView.initialUrl;
            if (str == null) {
                zq3.t();
            }
            dataDomeWebView.syncCookieFromWebView(str);
        }

        @Override // android.app.FragmentManager.FragmentLifecycleCallbacks
        public void onFragmentResumed(android.app.FragmentManager fragmentManager, android.app.Fragment fragment) {
            super.onFragmentResumed(fragmentManager, fragment);
            DataDomeWebView dataDomeWebView = DataDomeWebView.this;
            String str = dataDomeWebView.initialUrl;
            if (str == null) {
                zq3.t();
            }
            dataDomeWebView.syncCookieFromWebView(str);
        }
    }

    public DataDomeWebView(Context context) {
        this(context, null, 0, 6, null);
    }

    private static /* synthetic */ void legacyFragmentLifecycleCallbacks$annotations() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v6, types: [androidx.fragment.app.FragmentManager] */
    /* JADX WARN: Type inference failed for: r3v6, types: [androidx.fragment.app.FragmentManager$k, co.datadome.sdk.DataDomeWebView$f] */
    private final void setupUrlFragmentLifecycleCallback(String str) {
        List list;
        g gVar;
        this.initialUrl = str;
        Context context = getContext();
        if (context instanceof androidx.fragment.app.f) {
            ?? fVar = new f();
            Context context2 = getContext();
            if (context2 == null) {
                throw new TypeCastException("null cannot be cast to non-null type androidx.fragment.app.FragmentActivity");
            }
            ((androidx.fragment.app.f) context2).getSupportFragmentManager().m1(fVar, true);
            list = this.androidXFragmentLifecycleCallbacks;
            gVar = fVar;
        } else {
            if (!(context instanceof Activity)) {
                return;
            }
            g gVar2 = new g();
            Context context3 = getContext();
            if (context3 == null) {
                throw new TypeCastException("null cannot be cast to non-null type android.app.Activity");
            }
            ((Activity) context3).getFragmentManager().registerFragmentLifecycleCallbacks(gVar2, true);
            list = this.legacyFragmentLifecycleCallbacks;
            gVar = gVar2;
        }
        list.add(gVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void syncCookieFromWebView(String str) {
        String cookie = CookieManager.getInstance().getCookie(str);
        if (cookie != null) {
            String extractDatadomeCookie = DataDomeUtils.extractDatadomeCookie(cookie);
            h d2 = h.d(getContext(), co.datadome.sdk.c.t);
            if (zq3.c(d2.h(), extractDatadomeCookie)) {
                return;
            }
            d2.g(extractDatadomeCookie);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:15:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final void syncCookieToWebView(java.lang.String r3, android.webkit.ValueCallback<java.lang.Boolean> r4) {
        /*
            r2 = this;
            boolean r0 = r2.fromShouldOverrideUrlLoading
            if (r0 == 0) goto Lc
            if (r4 == 0) goto L48
            java.lang.Boolean r2 = java.lang.Boolean.FALSE
            r4.onReceiveValue(r2)
            goto L48
        Lc:
            android.content.Context r0 = r2.getContext()
            java.lang.String r1 = co.datadome.sdk.c.t
            co.datadome.sdk.h r0 = co.datadome.sdk.h.d(r0, r1)
            java.lang.String r0 = r0.h()
            if (r0 == 0) goto L3f
            kotlin.text.Regex r2 = r2.domainAttrPattern
            java.lang.String r1 = "cookie"
            defpackage.zq3.d(r0, r1)
            boolean r2 = r2.a(r0)
            if (r2 == 0) goto L33
            java.util.List r2 = kotlin.collections.i.e(r0)
            co.datadome.sdk.DataDomeUtils.setCookiesSequentially(r3, r2, r4)
        L30:
            ww8 r2 = defpackage.ww8.a
            goto L3c
        L33:
            if (r4 == 0) goto L3b
            java.lang.Boolean r2 = java.lang.Boolean.FALSE
            r4.onReceiveValue(r2)
            goto L30
        L3b:
            r2 = 0
        L3c:
            if (r2 == 0) goto L3f
            goto L48
        L3f:
            if (r4 == 0) goto L48
            java.lang.Boolean r2 = java.lang.Boolean.FALSE
            r4.onReceiveValue(r2)
            ww8 r2 = defpackage.ww8.a
        L48:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: co.datadome.sdk.DataDomeWebView.syncCookieToWebView(java.lang.String, android.webkit.ValueCallback):void");
    }

    public void _$_clearFindViewByIdCache() {
        HashMap hashMap = this._$_findViewCache;
        if (hashMap != null) {
            hashMap.clear();
        }
    }

    public View _$_findCachedViewById(int i) {
        if (this._$_findViewCache == null) {
            this._$_findViewCache = new HashMap();
        }
        View view = (View) this._$_findViewCache.get(Integer.valueOf(i));
        if (view != null) {
            return view;
        }
        View findViewById = findViewById(i);
        this._$_findViewCache.put(Integer.valueOf(i), findViewById);
        return findViewById;
    }

    @Override // android.webkit.WebView
    public void loadDataWithBaseURL(String str, String str2, String str3, String str4, String str5) {
        zq3.i(str2, "data");
        if (str == null) {
            super.loadDataWithBaseURL(str, str2, str3, str4, str5);
        } else {
            setupUrlFragmentLifecycleCallback(str);
            syncCookieToWebView(str, new b(str, str2, str3, str4, str5));
        }
    }

    @Override // android.webkit.WebView
    public void loadUrl(String str) {
        zq3.i(str, "url");
        setupUrlFragmentLifecycleCallback(str);
        syncCookieToWebView(str, new c(str));
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        String str = this.initialUrl;
        if (str != null) {
            syncCookieFromWebView(str);
        }
        Context context = getContext();
        if (context instanceof androidx.fragment.app.f) {
            for (FragmentManager.k kVar : this.androidXFragmentLifecycleCallbacks) {
                Context context2 = getContext();
                if (context2 == null) {
                    throw new TypeCastException("null cannot be cast to non-null type androidx.fragment.app.FragmentActivity");
                }
                ((androidx.fragment.app.f) context2).getSupportFragmentManager().E1(kVar);
            }
            return;
        }
        if (context instanceof Activity) {
            for (FragmentManager.FragmentLifecycleCallbacks fragmentLifecycleCallbacks : this.legacyFragmentLifecycleCallbacks) {
                Context context3 = getContext();
                if (context3 == null) {
                    throw new TypeCastException("null cannot be cast to non-null type android.app.Activity");
                }
                ((Activity) context3).getFragmentManager().unregisterFragmentLifecycleCallbacks(fragmentLifecycleCallbacks);
            }
        }
    }

    @Override // android.webkit.WebView
    public void postUrl(String str, byte[] bArr) {
        zq3.i(str, "url");
        zq3.i(bArr, "postData");
        setupUrlFragmentLifecycleCallback(str);
        syncCookieToWebView(str, new e(str, bArr));
    }

    @Override // android.webkit.WebView
    public void setWebViewClient(WebViewClient webViewClient) {
        zq3.i(webViewClient, "client");
        this.userWebViewClient = webViewClient;
    }

    public DataDomeWebView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
    }

    @Override // android.webkit.WebView
    public void loadUrl(String str, Map<String, String> map) {
        zq3.i(str, "url");
        zq3.i(map, "additionalHttpHeaders");
        setupUrlFragmentLifecycleCallback(str);
        syncCookieToWebView(str, new d(str, map));
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DataDomeWebView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        zq3.i(context, "context");
        this.domainAttrPattern = new Regex("(?i)\\bDomain\\b\\s*=\\s*[^;]+");
        this.androidXFragmentLifecycleCallbacks = new ArrayList();
        this.legacyFragmentLifecycleCallbacks = new ArrayList();
        this.legacyBackStackListeners = new ArrayList();
        super.setWebViewClient(new a());
        CookieManager.getInstance().setAcceptCookie(true);
        getSettings().setJavaScriptEnabled(true);
        setFocusable(true);
        setFocusableInTouchMode(true);
    }

    public /* synthetic */ DataDomeWebView(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }
}
