package co.datadome.sdk;

import android.annotation.SuppressLint;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.graphics.Bitmap;
import android.graphics.drawable.ColorDrawable;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import android.view.View;
import android.webkit.CookieManager;
import android.webkit.ValueCallback;
import android.webkit.WebChromeClient;
import android.webkit.WebResourceError;
import android.webkit.WebResourceRequest;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.ProgressBar;
import androidx.constraintlayout.widget.ConstraintLayout;
import co.datadome.sdk.DataDomeSDK;
import co.datadome.sdk.JavascriptInterfaceDataDomeListener;
import com.amazonaws.services.s3.util.Mimetypes;
import defpackage.b74;
import defpackage.be5;
import defpackage.ch9;
import defpackage.dn9;
import defpackage.du8;
import defpackage.gn9;
import defpackage.iv3;
import defpackage.jk;
import defpackage.jl3;
import defpackage.k99;
import defpackage.lp6;
import defpackage.sc5;
import defpackage.tl1;
import defpackage.zq3;
import defpackage.zt6;
import io.embrace.android.embracesdk.WebViewClientSwazzledHooks;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import kotlin.TypeCastException;
import kotlin.collections.t;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.MutablePropertyReference1Impl;
import zendesk.core.Constants;

/* loaded from: classes.dex */
public final class ChallengeActivity extends jk {
    public static final String ARG_CAPTCHA_RESULT = "captcha_result";
    public static final String ARG_COOKIE = "cookie";
    public static final String ARG_URL = "captcha_url";
    public static final String ARG_VISIBILITY = "responsePageVisibility";
    public static final String BACK_BEHAVIOUR = "backBehaviour";
    public static final String BLOCKED_RESPONSE_COOKIE = "blockedResponseCookie";
    public static final String BROADCAST_ACTION = "co.datadome.sdk.CAPTCHA_RESULT";
    public static final String REQUEST_URL = "request_url";
    public static final String RESPONSE_PAGE_LANGUAGE = "responsePageLanguage";
    public static final String RESPONSE_TYPE_IS_HARD_BLOCK = "is_response_type_hard_block";
    public static final String RESPONSE_TYPE_IS_HTML = "is_response_type_HTML";
    public static final int RESULT_CANCELED = 0;
    public static final int RESULT_LOADED = 1;
    public static final int RESULT_OK = -1;
    public static final String SFCC_REDIRECTION = "isSfcc";
    private HashMap _$_findViewCache;
    private DataDomeSDK.BackBehaviour backBehaviour = DataDomeSDK.BackBehaviour.GO_BACKGROUND;
    private dn9 binding;
    private String captchaUrl;
    private final lp6 isChallengeVisible$delegate;
    private boolean isHTMLresponse;
    private final lp6 isLoading$delegate;
    private boolean isResponseTypeHardBlock;
    private boolean isSFCC;
    private final BroadcastReceiver networkChangeReceiver;
    private String requestUrl;
    static final /* synthetic */ iv3[] $$delegatedProperties = {zt6.f(new MutablePropertyReference1Impl(zt6.b(ChallengeActivity.class), "isLoading", "isLoading()Z")), zt6.f(new MutablePropertyReference1Impl(zt6.b(ChallengeActivity.class), "isChallengeVisible", "isChallengeVisible()Z"))};
    public static final c Companion = new c(null);
    private static final Map<Integer, String> webviewConnectionErrors = t.m(du8.a(-2, "ERROR_HOST_LOOKUP"), du8.a(-6, "ERROR_CONNECT"), du8.a(-8, "ERROR_TIMEOUT"), du8.a(-11, "ERROR_FAILED_SSL_HANDSHAKE"));

    public static final class a extends sc5 {
        final /* synthetic */ ChallengeActivity b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(Object obj, Object obj2, ChallengeActivity challengeActivity) {
            super(obj2);
            this.b = challengeActivity;
        }

        @Override // defpackage.sc5
        protected void b(iv3 iv3Var, Object obj, Object obj2) {
            zq3.h(iv3Var, "property");
            boolean booleanValue = ((Boolean) obj2).booleanValue();
            ((Boolean) obj).booleanValue();
            ProgressBar progressBar = ChallengeActivity.access$getBinding$p(this.b).b;
            zq3.d(progressBar, "binding.progressBar");
            progressBar.setVisibility(this.b.isChallengeVisible() & booleanValue ? 0 : 8);
        }
    }

    public static final class b extends sc5 {
        final /* synthetic */ ChallengeActivity b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(Object obj, Object obj2, ChallengeActivity challengeActivity) {
            super(obj2);
            this.b = challengeActivity;
        }

        @Override // defpackage.sc5
        protected void b(iv3 iv3Var, Object obj, Object obj2) {
            zq3.h(iv3Var, "property");
            boolean booleanValue = ((Boolean) obj2).booleanValue();
            ((Boolean) obj).booleanValue();
            this.b.makeTranslucent(!booleanValue);
        }
    }

    public static final class c {
        private c() {
        }

        public /* synthetic */ c(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    static final class d implements Runnable {
        final /* synthetic */ boolean b;

        d(boolean z) {
            this.b = z;
        }

        @Override // java.lang.Runnable
        public final void run() {
            if (this.b) {
                ChallengeActivity.this.overridePendingTransition(0, 0);
            }
            ConstraintLayout root = ChallengeActivity.access$getBinding$p(ChallengeActivity.this).getRoot();
            zq3.d(root, "binding.root");
            root.setAlpha(this.b ? 0.0f : 1.0f);
            ChallengeActivity.this.getWindow().setBackgroundDrawable(new ColorDrawable(this.b ? 0 : -1));
        }
    }

    public static final class e extends BroadcastReceiver {
        e() {
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            String str;
            zq3.i(context, "context");
            zq3.i(intent, "intent");
            boolean isNetworkAvailable = ChallengeActivity.this.isNetworkAvailable();
            WebView webView = ChallengeActivity.access$getBinding$p(ChallengeActivity.this).c;
            if (isNetworkAvailable) {
                webView.setNetworkAvailable(true);
                str = "Network is connected in challenge page";
            } else {
                webView.setNetworkAvailable(false);
                str = "Network is disconnected in challenge page";
            }
            co.datadome.sdk.d.a(str);
        }
    }

    static final class f implements ValueCallback {
        final /* synthetic */ ArrayList b;

        static final class a implements ValueCallback {
            a() {
            }

            @Override // android.webkit.ValueCallback
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final void onReceiveValue(Boolean bool) {
                ChallengeActivity.this.displayChallenge();
            }
        }

        static final class b implements ValueCallback {
            b() {
            }

            @Override // android.webkit.ValueCallback
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final void onReceiveValue(Boolean bool) {
                ChallengeActivity.this.displayChallenge();
            }
        }

        f(ArrayList arrayList) {
            this.b = arrayList;
        }

        @Override // android.webkit.ValueCallback
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final void onReceiveValue(Boolean bool) {
            String str;
            ArrayList arrayList;
            ValueCallback bVar;
            if (ChallengeActivity.this.isHTMLresponse) {
                str = ChallengeActivity.this.requestUrl;
                arrayList = this.b;
                bVar = new a();
            } else {
                str = ChallengeActivity.this.captchaUrl;
                arrayList = this.b;
                bVar = new b();
            }
            DataDomeUtils.setCookiesSequentially(str, arrayList, bVar);
        }
    }

    public static final class g extends WebViewClient {
        g(String str) {
        }

        @Override // android.webkit.WebViewClient
        public void onPageFinished(WebView webView, String str) {
            super.onPageFinished(webView, str);
            ChallengeActivity.this.setLoading(false);
            Intent intent = new Intent();
            intent.setAction(ChallengeActivity.BROADCAST_ACTION);
            if (ChallengeActivity.this.isSFCC) {
                return;
            }
            intent.putExtra(ChallengeActivity.ARG_CAPTCHA_RESULT, 1);
            b74.b(ChallengeActivity.this).d(intent);
        }

        @Override // android.webkit.WebViewClient
        public void onPageStarted(WebView webView, String str, Bitmap bitmap) {
            WebViewClientSwazzledHooks._preOnPageStarted(webView, str, bitmap);
            super.onPageStarted(webView, str, bitmap);
            ChallengeActivity.this.setLoading(true);
        }

        @Override // android.webkit.WebViewClient
        public void onReceivedError(WebView webView, int i, String str, String str2) {
            super.onReceivedError(webView, i, str, str2);
        }

        @Override // android.webkit.WebViewClient
        public void onReceivedError(WebView webView, WebResourceRequest webResourceRequest, WebResourceError webResourceError) {
            super.onReceivedError(webView, webResourceRequest, webResourceError);
            if (webResourceError != null) {
                ChallengeActivity.this.handleWebviewError(webResourceError.getErrorCode());
            }
        }
    }

    public static final class h implements JavascriptInterfaceDataDomeListener.DataDomeJavascriptInterfaceListener {
        final /* synthetic */ String b;

        h(String str) {
            this.b = str;
        }

        @Override // co.datadome.sdk.JavascriptInterfaceDataDomeListener.DataDomeJavascriptInterfaceListener
        public void onAdditionalChallengeRedirection(int i) {
            co.datadome.sdk.d.a("onAdditionalChallengeRedirection with xddb: " + i);
            ChallengeActivity.this.setChallengeVisible(co.datadome.sdk.c.w(i).booleanValue() ^ true);
        }

        @Override // co.datadome.sdk.JavascriptInterfaceDataDomeListener.DataDomeJavascriptInterfaceListener
        public void onCaptchaSuccess(String str) {
            co.datadome.sdk.d.a("Captcha challenge resolved and got cookie: " + str);
            if (TextUtils.isEmpty(str) || zq3.c(this.b, str)) {
                return;
            }
            if (str == null) {
                zq3.t();
            }
            if (kotlin.text.h.K(str, co.datadome.sdk.c.DATADOME_COOKIE_PREFIX, false, 2, null)) {
                CookieManager.getInstance().setCookie(ChallengeActivity.this.requestUrl, str);
                Intent intent = new Intent();
                intent.setAction(ChallengeActivity.BROADCAST_ACTION);
                intent.putExtra(ChallengeActivity.ARG_CAPTCHA_RESULT, -1);
                intent.putExtra(ChallengeActivity.ARG_COOKIE, str);
                intent.putExtra(ChallengeActivity.ARG_URL, ChallengeActivity.this.captchaUrl);
                b74.b(ChallengeActivity.this).d(intent);
                ChallengeActivity.this.finish();
            }
        }
    }

    static final class i implements be5 {
        public static final i a = new i();

        i() {
        }

        @Override // defpackage.be5
        public final ch9 a(View view, ch9 ch9Var) {
            jl3 f = ch9Var.f(ch9.l.b() | ch9.l.h());
            zq3.d(f, "windowsInsets.getInsets(…Compat.Type.systemBars())");
            view.setPadding(f.a, f.b, f.c, f.d);
            return ch9.b;
        }
    }

    public ChallengeActivity() {
        tl1 tl1Var = tl1.a;
        Boolean bool = Boolean.TRUE;
        this.isLoading$delegate = new a(bool, bool, this);
        this.isChallengeVisible$delegate = new b(bool, bool, this);
        this.networkChangeReceiver = new e();
    }

    public static final /* synthetic */ dn9 access$getBinding$p(ChallengeActivity challengeActivity) {
        dn9 dn9Var = challengeActivity.binding;
        if (dn9Var == null) {
            zq3.z("binding");
        }
        return dn9Var;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void displayChallenge() {
        HashMap hashMap = new HashMap();
        String stringExtra = getIntent().getStringExtra(RESPONSE_PAGE_LANGUAGE);
        if (!DataDomeUtils.isNullOrEmpty(stringExtra).booleanValue()) {
            hashMap.put(Constants.ACCEPT_LANGUAGE, stringExtra);
        }
        String str = this.captchaUrl;
        if (str != null) {
            if (this.isHTMLresponse) {
                dn9 dn9Var = this.binding;
                if (dn9Var == null) {
                    zq3.z("binding");
                }
                dn9Var.c.loadDataWithBaseURL(this.requestUrl, str, Mimetypes.MIMETYPE_HTML, com.amazonaws.services.s3.internal.Constants.DEFAULT_ENCODING, null);
            } else {
                dn9 dn9Var2 = this.binding;
                if (dn9Var2 == null) {
                    zq3.z("binding");
                }
                dn9Var2.c.loadUrl(str, hashMap);
            }
            co.datadome.sdk.d.a("Loading challenge: " + str);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void handleWebviewError(int i2) {
        String str = webviewConnectionErrors.get(Integer.valueOf(i2));
        if (str != null) {
            Log.e("DataDome", "Get Webview error (" + i2 + "): " + str + ". Dismiss challenge");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean isChallengeVisible() {
        return ((Boolean) this.isChallengeVisible$delegate.getValue(this, $$delegatedProperties[1])).booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean isLoading() {
        return ((Boolean) this.isLoading$delegate.getValue(this, $$delegatedProperties[0])).booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean isNetworkAvailable() {
        Object systemService = getApplication().getSystemService("connectivity");
        if (systemService == null) {
            throw new TypeCastException("null cannot be cast to non-null type android.net.ConnectivityManager");
        }
        NetworkInfo activeNetworkInfo = ((ConnectivityManager) systemService).getActiveNetworkInfo();
        return activeNetworkInfo != null && activeNetworkInfo.isConnectedOrConnecting();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void makeTranslucent(boolean z) {
        runOnUiThread(new d(z));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void setChallengeVisible(boolean z) {
        this.isChallengeVisible$delegate.a(this, $$delegatedProperties[1], Boolean.valueOf(z));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void setLoading(boolean z) {
        this.isLoading$delegate.a(this, $$delegatedProperties[0], Boolean.valueOf(z));
    }

    private final void setupCookies() {
        DataDomeUtils.removeCookiesSequentially(new f(getIntent().getStringArrayListExtra(BLOCKED_RESPONSE_COOKIE)));
    }

    @SuppressLint({"SetJavaScriptEnabled", "AddJavascriptInterface"})
    private final void setupWebview() {
        CookieManager.getInstance().setAcceptCookie(true);
        String stringExtra = getIntent().getStringExtra(ARG_COOKIE);
        dn9 dn9Var = this.binding;
        if (dn9Var == null) {
            zq3.z("binding");
        }
        dn9Var.c.setWebViewClient(new g(stringExtra));
        WebView webView = dn9Var.c;
        zq3.d(webView, "webview");
        webView.setWebChromeClient(new WebChromeClient());
        WebView webView2 = dn9Var.c;
        zq3.d(webView2, "webview");
        WebSettings settings = webView2.getSettings();
        settings.setJavaScriptEnabled(true);
        settings.setAllowFileAccessFromFileURLs(false);
        dn9Var.c.addJavascriptInterface(new JavascriptInterfaceDataDomeListener(new h(stringExtra)), "android");
    }

    private final void setupWindow() {
        dn9 dn9Var = this.binding;
        if (dn9Var == null) {
            zq3.z("binding");
        }
        k99.A0(dn9Var.getRoot(), i.a);
    }

    public void _$_clearFindViewByIdCache() {
        HashMap hashMap = this._$_findViewCache;
        if (hashMap != null) {
            hashMap.clear();
        }
    }

    public View _$_findCachedViewById(int i2) {
        if (this._$_findViewCache == null) {
            this._$_findViewCache = new HashMap();
        }
        View view = (View) this._$_findViewCache.get(Integer.valueOf(i2));
        if (view != null) {
            return view;
        }
        View findViewById = findViewById(i2);
        this._$_findViewCache.put(Integer.valueOf(i2), findViewById);
        return findViewById;
    }

    @Override // android.app.Activity
    public void finish() {
        super.finish();
        if (isChallengeVisible()) {
            return;
        }
        overridePendingTransition(0, 0);
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public void onBackPressed() {
        int i2 = gn9.a[this.backBehaviour.ordinal()];
        if (i2 != 2) {
            if (i2 != 3) {
                return;
            }
            try {
                dn9 dn9Var = this.binding;
                if (dn9Var == null) {
                    zq3.z("binding");
                }
                dn9Var.c.stopLoading();
            } catch (Exception unused) {
            } catch (Throwable th) {
                finish();
                throw th;
            }
            finish();
        }
        if (isFinishing() || !this.isResponseTypeHardBlock) {
            moveTaskToBack(true);
            return;
        }
        finish();
    }

    @Override // androidx.fragment.app.f, androidx.activity.ComponentActivity, defpackage.sq0, android.app.Activity
    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        dn9 a2 = dn9.a(getLayoutInflater());
        zq3.d(a2, "ActivityChallengeBinding.inflate(layoutInflater)");
        this.binding = a2;
        setupWindow();
        Intent intent = getIntent();
        setChallengeVisible(intent.getBooleanExtra(ARG_VISIBILITY, true));
        this.isSFCC = intent.getBooleanExtra(SFCC_REDIRECTION, false);
        this.captchaUrl = intent.getStringExtra(ARG_URL);
        DataDomeSDK.BackBehaviour backBehaviour = (DataDomeSDK.BackBehaviour) intent.getSerializableExtra(BACK_BEHAVIOUR);
        if (backBehaviour == null) {
            backBehaviour = DataDomeSDK.BackBehaviour.GO_BACKGROUND;
        }
        this.backBehaviour = backBehaviour;
        this.isResponseTypeHardBlock = intent.getBooleanExtra(RESPONSE_TYPE_IS_HARD_BLOCK, false);
        this.isHTMLresponse = getIntent().getBooleanExtra(RESPONSE_TYPE_IS_HTML, false);
        this.requestUrl = getIntent().getStringExtra(REQUEST_URL);
        dn9 dn9Var = this.binding;
        if (dn9Var == null) {
            zq3.z("binding");
        }
        setContentView(dn9Var.getRoot());
        setupCookies();
        setupWebview();
    }

    @Override // defpackage.jk, androidx.fragment.app.f, android.app.Activity
    protected void onDestroy() {
        dn9 dn9Var = this.binding;
        if (dn9Var == null) {
            zq3.z("binding");
        }
        dn9Var.c.destroy();
        co.datadome.sdk.c.resetHandlingResponseInProgress();
        Intent intent = new Intent();
        intent.setAction(BROADCAST_ACTION);
        intent.putExtra(ARG_CAPTCHA_RESULT, 0);
        intent.putExtra(ARG_URL, this.captchaUrl);
        b74.b(this).d(intent);
        super.onDestroy();
    }

    @Override // androidx.fragment.app.f, android.app.Activity
    protected void onPause() {
        super.onPause();
        unregisterReceiver(this.networkChangeReceiver);
    }

    @Override // androidx.fragment.app.f, android.app.Activity
    protected void onResume() {
        super.onResume();
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("android.net.conn.CONNECTIVITY_CHANGE");
        registerReceiver(this.networkChangeReceiver, intentFilter);
    }
}
