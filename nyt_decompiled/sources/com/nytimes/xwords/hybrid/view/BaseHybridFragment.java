package com.nytimes.xwords.hybrid.view;

import android.app.Application;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Message;
import android.view.KeyEvent;
import android.view.View;
import android.webkit.CookieManager;
import android.webkit.WebChromeClient;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.FrameLayout;
import androidx.activity.OnBackPressedDispatcher;
import androidx.fragment.app.f;
import androidx.preference.g;
import com.chartbeat.androidsdk.QueryKeys;
import com.nytimes.android.abra.AbraManager;
import com.nytimes.android.eventtracker.context.PageContext;
import com.nytimes.android.eventtracker.context.PageContextDelegate;
import com.nytimes.android.hybrid.HybridUserInfo;
import com.nytimes.xwords.hybrid.HybridWebViewClient;
import com.nytimes.xwords.hybrid.WebViewInitializer;
import com.nytimes.xwords.hybrid.analytics.HybridGamesReferringSourceData;
import com.nytimes.xwords.hybrid.bridgecommands.AuthenticateUserCommand;
import com.nytimes.xwords.hybrid.bridgecommands.GetUserDetailsCommand;
import com.nytimes.xwords.hybrid.bridgecommands.SendEmailCommand;
import com.nytimes.xwords.hybrid.config.Environments;
import com.nytimes.xwords.hybrid.rest.Page;
import com.nytimes.xwords.hybrid.rest.PageService;
import com.nytimes.xwords.hybrid.utils.ErrorType;
import com.nytimes.xwords.hybrid.view.BaseHybridFragment;
import com.squareup.moshi.i;
import defpackage.ac3;
import defpackage.av2;
import defpackage.ay2;
import defpackage.bc3;
import defpackage.c04;
import defpackage.c05;
import defpackage.c54;
import defpackage.ce5;
import defpackage.du8;
import defpackage.dz1;
import defpackage.ec3;
import defpackage.ee5;
import defpackage.el;
import defpackage.g55;
import defpackage.id3;
import defpackage.kb3;
import defpackage.kd3;
import defpackage.kg0;
import defpackage.ku8;
import defpackage.lc3;
import defpackage.le0;
import defpackage.m30;
import defpackage.nj7;
import defpackage.ny2;
import defpackage.od3;
import defpackage.p96;
import defpackage.qs2;
import defpackage.sb3;
import defpackage.sp7;
import defpackage.ss2;
import defpackage.sv2;
import defpackage.sx6;
import defpackage.ul8;
import defpackage.vk8;
import defpackage.wu2;
import defpackage.ww8;
import defpackage.yt2;
import defpackage.z38;
import defpackage.zq3;
import defpackage.zu2;
import java.io.Serializable;
import java.net.UnknownHostException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.NoSuchElementException;
import kotlin.Result;
import kotlin.collections.t;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.text.h;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CompletableDeferred;
import kotlinx.coroutines.CompletableDeferredKt;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.ExperimentalCoroutinesApi;
import okhttp3.HttpUrl;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;

@ExperimentalCoroutinesApi
/* loaded from: classes4.dex */
public abstract class BaseHybridFragment extends com.nytimes.xwords.hybrid.view.b implements View.OnKeyListener, c54, vk8 {
    public static final a B = new a(null);
    public static final int H = 8;
    public AbraManager abraManager;
    public el appConfig;
    public lc3.a appVersionName;
    public sb3 authEventPublisher;
    public dz1 emailEventHandler;
    public kb3 hybridAdManager;
    public bc3 hybridConfigInstaller;
    public ec3 hybridDependencies;
    public id3 hybridPreferences;
    public kd3 hybridPurrInfoProvider;
    protected od3 k;
    protected FrameLayout l;
    private final CoroutineDispatcher m;
    public i moshi;
    protected PageContext n;
    public g55 networkStatus;
    public c05 nytCookieProvider;
    public PageService pageService;
    public SharedPreferences preferences;
    protected HybridGamesReferringSourceData r;
    public Retrofit retrofit;
    protected PageEventReporter s;
    private final CookieManager t;
    private CompletableDeferred u;
    private Theme w;
    private final c04 x;
    private final c04 y;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    public interface b {
        void a(String str);
    }

    public static final class c implements Callback {
        c() {
        }

        @Override // retrofit2.Callback
        public void onFailure(Call call, Throwable th) {
            zq3.h(call, "call");
            zq3.h(th, QueryKeys.TOKEN);
            ul8.a.e(th);
            if (th instanceof UnknownHostException) {
                BaseHybridFragment.this.Q1(ErrorType.OFFLINE);
            } else {
                BaseHybridFragment.R1(BaseHybridFragment.this, null, 1, null);
            }
        }

        @Override // retrofit2.Callback
        public void onResponse(Call call, Response response) {
            zq3.h(call, "call");
            zq3.h(response, "response");
            ul8.b bVar = ul8.a;
            bVar.a("WebView UserAgent: " + BaseHybridFragment.this.N1().getSettings().getUserAgentString(), new Object[0]);
            if (response.code() != 200) {
                bVar.d(String.valueOf(response.errorBody()), new Object[0]);
                BaseHybridFragment.R1(BaseHybridFragment.this, null, 1, null);
                return;
            }
            Iterator<String> it2 = response.headers().values("set-cookie").iterator();
            while (it2.hasNext()) {
                BaseHybridFragment.this.T1(it2.next());
            }
            Page page = (Page) response.body();
            if (page != null) {
                BaseHybridFragment.this.N1().g(page.getContent());
            }
        }
    }

    public static final class d implements b {
        d() {
        }

        @Override // com.nytimes.xwords.hybrid.view.BaseHybridFragment.b
        public void a(String str) {
            zq3.h(str, "errorMsg");
            ul8.a.d("onWebViewError: " + str, new Object[0]);
        }
    }

    public static final class e extends WebChromeClient {
        e() {
        }

        @Override // android.webkit.WebChromeClient
        public boolean onCreateWindow(WebView webView, boolean z, boolean z2, Message message) {
            zq3.h(webView, "view");
            Message obtainMessage = BaseHybridFragment.this.N1().getHandler().obtainMessage();
            BaseHybridFragment.this.N1().requestFocusNodeHref(obtainMessage);
            String string = obtainMessage.getData().getString("url");
            if (string != null) {
                BaseHybridFragment.this.N1().getContext().startActivity(new Intent("android.intent.action.VIEW", Uri.parse(string)));
                return true;
            }
            od3 N1 = BaseHybridFragment.this.N1();
            WebView webView2 = new WebView(BaseHybridFragment.this.N1().getContext());
            Object obj = message != null ? message.obj : null;
            WebView.WebViewTransport webViewTransport = obj instanceof WebView.WebViewTransport ? (WebView.WebViewTransport) obj : null;
            if (webViewTransport != null) {
                webViewTransport.setWebView(webView2);
            }
            N1.addView(webView2);
            if (message != null) {
                message.sendToTarget();
            }
            return true;
        }
    }

    public BaseHybridFragment(int i) {
        super(i);
        this.m = Dispatchers.getMain();
        this.t = CookieManager.getInstance();
        this.u = CompletableDeferredKt.CompletableDeferred$default(null, 1, null);
        this.w = Theme.LIGHT;
        this.x = kotlin.c.a(new qs2() { // from class: com.nytimes.xwords.hybrid.view.BaseHybridFragment$abraOverrides$2
            {
                super(0);
            }

            @Override // defpackage.qs2
            /* renamed from: invoke */
            public final Map mo865invoke() {
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                String string = g.b(BaseHybridFragment.this.requireActivity().getApplicationContext()).getString("SPELLING_BEE_ABRA_VARIANT_KEY", null);
                if (string != null) {
                    List F0 = h.F0(string, new String[]{","}, false, 0, 6, null);
                    ArrayList<List> arrayList = new ArrayList(kotlin.collections.i.w(F0, 10));
                    Iterator it2 = F0.iterator();
                    while (it2.hasNext()) {
                        arrayList.add(h.F0((String) it2.next(), new String[]{"="}, false, 0, 6, null));
                    }
                    ArrayList arrayList2 = new ArrayList(kotlin.collections.i.w(arrayList, 10));
                    for (List list : arrayList) {
                        arrayList2.add(du8.a(kotlin.collections.i.k0(list), kotlin.collections.i.w0(list)));
                    }
                    Map t = t.t(arrayList2);
                    zq3.f(t, "null cannot be cast to non-null type kotlin.collections.MutableMap<kotlin.String, kotlin.String?>");
                    linkedHashMap.putAll(ku8.d(t));
                }
                return linkedHashMap;
            }
        });
        this.y = kotlin.c.a(new qs2() { // from class: com.nytimes.xwords.hybrid.view.BaseHybridFragment$environment$2
            {
                super(0);
            }

            @Override // defpackage.qs2
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public final Environments mo865invoke() {
                String string = g.b(BaseHybridFragment.this.requireActivity().getApplicationContext()).getString("GAMES_ENV_KEY", Environments.PROD.getBaseUrl());
                zq3.e(string);
                for (Environments environments : Environments.values()) {
                    if (h.P(string, environments.getBaseUrl(), false, 2, null)) {
                        return environments;
                    }
                }
                throw new NoSuchElementException("Array contains no element matching the predicate.");
            }
        });
    }

    private final void L1() {
        Serializable serializable;
        Bundle extras = requireActivity().getIntent().getExtras();
        HybridGamesReferringSourceData hybridGamesReferringSourceData = null;
        if (Build.VERSION.SDK_INT < 33) {
            Object obj = extras != null ? extras.get(H1()) : null;
            if (obj instanceof HybridGamesReferringSourceData) {
                hybridGamesReferringSourceData = (HybridGamesReferringSourceData) obj;
            }
        } else if (extras != null) {
            serializable = extras.getSerializable(H1(), HybridGamesReferringSourceData.class);
            hybridGamesReferringSourceData = (HybridGamesReferringSourceData) serializable;
        }
        if (hybridGamesReferringSourceData == null) {
            hybridGamesReferringSourceData = new HybridGamesReferringSourceData("", "", "");
        }
        a2(hybridGamesReferringSourceData);
    }

    private final void O1() {
        f requireActivity = requireActivity();
        zq3.f(requireActivity, "null cannot be cast to non-null type com.nytimes.xwords.hybrid.view.BaseGamesHybridHostActivity");
        OnBackPressedDispatcher onBackPressedDispatcher = ((BaseGamesHybridHostActivity) requireActivity).getOnBackPressedDispatcher();
        zq3.g(onBackPressedDispatcher, "getOnBackPressedDispatcher(...)");
        ee5.a(onBackPressedDispatcher, this, true, new ss2() { // from class: com.nytimes.xwords.hybrid.view.BaseHybridFragment$handleBackPressed$1
            {
                super(1);
            }

            public final void b(ce5 ce5Var) {
                zq3.h(ce5Var, "$this$addCallback");
                BaseHybridFragment.this.S1();
            }

            @Override // defpackage.ss2
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                b((ce5) obj);
                return ww8.a;
            }
        });
    }

    public static /* synthetic */ void R1(BaseHybridFragment baseHybridFragment, ErrorType errorType, int i, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: launchErrorView");
        }
        if ((i & 1) != 0) {
            errorType = ErrorType.GENERIC;
        }
        baseHybridFragment.Q1(errorType);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void S1() {
        if (N1().getVisibility() == 0 && M1()) {
            BuildersKt__Builders_commonKt.launch$default(this, null, null, new BaseHybridFragment$navigateBack$1(this, null), 3, null);
            return;
        }
        f requireActivity = requireActivity();
        zq3.f(requireActivity, "null cannot be cast to non-null type com.nytimes.xwords.hybrid.view.BaseGamesHybridHostActivity");
        ((BaseGamesHybridHostActivity) requireActivity).L();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void T1(String str) {
        CookieManager cookieManager = this.t;
        if (str != null) {
            ul8.a.a("Cookie Set: " + str, new Object[0]);
            cookieManager.setCookie("https://nytimes.com", str);
        }
    }

    private final void U1(Theme theme) {
        Object b2;
        this.w = theme;
        try {
            Result.a aVar = Result.a;
            requireActivity().getSupportFragmentManager().x1("hybrid_theme_result", le0.a(du8.a("hybrid_theme", theme)));
            b2 = Result.b(ww8.a);
        } catch (Throwable th) {
            Result.a aVar2 = Result.a;
            b2 = Result.b(kotlin.f.a(th));
        }
        Throwable e2 = Result.e(b2);
        if (e2 != null) {
            ul8.a.e(e2);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object W1(defpackage.by0 r5) {
        /*
            r4 = this;
            boolean r0 = r5 instanceof com.nytimes.xwords.hybrid.view.BaseHybridFragment$setNytCookies$1
            if (r0 == 0) goto L13
            r0 = r5
            com.nytimes.xwords.hybrid.view.BaseHybridFragment$setNytCookies$1 r0 = (com.nytimes.xwords.hybrid.view.BaseHybridFragment$setNytCookies$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            com.nytimes.xwords.hybrid.view.BaseHybridFragment$setNytCookies$1 r0 = new com.nytimes.xwords.hybrid.view.BaseHybridFragment$setNytCookies$1
            r0.<init>(r4, r5)
        L18:
            java.lang.Object r5 = r0.result
            java.lang.Object r1 = kotlin.coroutines.intrinsics.a.h()
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L35
            if (r2 != r3) goto L2d
            java.lang.Object r4 = r0.L$0
            com.nytimes.xwords.hybrid.view.BaseHybridFragment r4 = (com.nytimes.xwords.hybrid.view.BaseHybridFragment) r4
            kotlin.f.b(r5)
            goto L49
        L2d:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L35:
            kotlin.f.b(r5)
            c05 r5 = r4.E1()
            r0.L$0 = r4
            r0.label = r3
            java.lang.String r2 = ".nytimes.com"
            java.lang.Object r5 = r5.c(r2, r0)
            if (r5 != r1) goto L49
            return r1
        L49:
            java.lang.String r5 = r4.s1()
            r4.T1(r5)
            ww8 r4 = defpackage.ww8.a
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.nytimes.xwords.hybrid.view.BaseHybridFragment.W1(by0):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void k1(BaseHybridFragment baseHybridFragment, Theme theme) {
        zq3.h(baseHybridFragment, "this$0");
        zq3.h(theme, "$theme");
        baseHybridFragment.U1(theme);
    }

    private final Map m1() {
        return (Map) this.x.getValue();
    }

    public final id3 A1() {
        id3 id3Var = this.hybridPreferences;
        if (id3Var != null) {
            return id3Var;
        }
        zq3.z("hybridPreferences");
        return null;
    }

    public final kd3 B1() {
        kd3 kd3Var = this.hybridPurrInfoProvider;
        if (kd3Var != null) {
            return kd3Var;
        }
        zq3.z("hybridPurrInfoProvider");
        return null;
    }

    public final i C1() {
        i iVar = this.moshi;
        if (iVar != null) {
            return iVar;
        }
        zq3.z("moshi");
        return null;
    }

    public final g55 D1() {
        g55 g55Var = this.networkStatus;
        if (g55Var != null) {
            return g55Var;
        }
        zq3.z("networkStatus");
        return null;
    }

    public final c05 E1() {
        c05 c05Var = this.nytCookieProvider;
        if (c05Var != null) {
            return c05Var;
        }
        zq3.z("nytCookieProvider");
        return null;
    }

    protected final PageContext F1() {
        PageContext pageContext = this.n;
        if (pageContext != null) {
            return pageContext;
        }
        zq3.z("pageContext");
        return null;
    }

    protected final PageEventReporter G1() {
        PageEventReporter pageEventReporter = this.s;
        if (pageEventReporter != null) {
            return pageEventReporter;
        }
        zq3.z("pageEventReporter");
        return null;
    }

    public abstract String H1();

    public final PageService I1() {
        PageService pageService = this.pageService;
        if (pageService != null) {
            return pageService;
        }
        zq3.z("pageService");
        return null;
    }

    public final SharedPreferences J1() {
        SharedPreferences sharedPreferences = this.preferences;
        if (sharedPreferences != null) {
            return sharedPreferences;
        }
        zq3.z("preferences");
        return null;
    }

    protected final HybridGamesReferringSourceData K1() {
        HybridGamesReferringSourceData hybridGamesReferringSourceData = this.r;
        if (hybridGamesReferringSourceData != null) {
            return hybridGamesReferringSourceData;
        }
        zq3.z("referringSource");
        return null;
    }

    public abstract boolean M1();

    protected final od3 N1() {
        od3 od3Var = this.k;
        if (od3Var != null) {
            return od3Var;
        }
        zq3.z("webView");
        return null;
    }

    public void P1(Bundle bundle, zu2 zu2Var, wu2 wu2Var, String str) {
        zq3.h(zu2Var, "userConfig");
        zq3.h(wu2Var, "hybridConfig");
        zq3.h(str, "hybridGameUrl");
        el n1 = n1();
        Application application = requireActivity().getApplication();
        zq3.g(application, "getApplication(...)");
        g55 D1 = D1();
        id3 A1 = A1();
        HybridUserInfo a2 = av2.a(zu2Var);
        kd3 B1 = B1();
        Map p = t.p(wu2Var.a(), m1());
        Map b2 = wu2Var.b();
        du8.a("page_view_id", F1().g());
        ww8 ww8Var = ww8.a;
        WebViewInitializer webViewInitializer = new WebViewInitializer(str, w1(), new ac3(n1, application, D1, A1, a2, B1, p, b2), Dispatchers.getIO(), Dispatchers.getMain(), d1(), C1());
        N1().setWebViewClient(new HybridWebViewClient(this, getCoroutineContext(), new d()));
        N1().setWebChromeClient(new e());
        od3 N1 = N1();
        ec3 y1 = y1();
        Context requireContext = requireContext();
        zq3.g(requireContext, "requireContext(...)");
        String d2 = y1.d(requireContext);
        f requireActivity = requireActivity();
        zq3.f(requireActivity, "null cannot be cast to non-null type com.nytimes.xwords.hybrid.view.BaseGamesHybridHostActivity");
        m30 m30Var = new m30((BaseGamesHybridHostActivity) requireActivity);
        GetUserDetailsCommand getUserDetailsCommand = new GetUserDetailsCommand();
        kg0 kg0Var = new kg0();
        SendEmailCommand sendEmailCommand = new SendEmailCommand(p1());
        nj7 nj7Var = new nj7(F1());
        sx6 sx6Var = new sx6(F1(), getAbraManager());
        yt2 yt2Var = new yt2(bundle != null ? bundle.getBoolean("IS_LOADED_KEY", false) : false);
        AuthenticateUserCommand authenticateUserCommand = new AuthenticateUserCommand(new BaseHybridFragment$initWebView$3(this, null), new BaseHybridFragment$initWebView$4(this, null), new ss2() { // from class: com.nytimes.xwords.hybrid.view.BaseHybridFragment$initWebView$5
            {
                super(1);
            }

            @Override // defpackage.ss2
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke((String) obj);
                return ww8.a;
            }

            public final void invoke(String str2) {
                zq3.h(str2, "it");
                BaseHybridFragment.this.X1(str2);
            }
        });
        f requireActivity2 = requireActivity();
        zq3.g(requireActivity2, "requireActivity(...)");
        N1.f(webViewInitializer, d2, m30Var, getUserDetailsCommand, kg0Var, sendEmailCommand, nj7Var, sx6Var, yt2Var, authenticateUserCommand, new sp7(requireActivity2), new sv2(this), new ny2(F1()), new ay2(F1()));
        v1().a(N1());
    }

    public final void Q1(ErrorType errorType) {
        zq3.h(errorType, "errorType");
        com.nytimes.xwords.hybrid.utils.a.d(this, errorType, u1());
    }

    protected final void V1(FrameLayout frameLayout) {
        zq3.h(frameLayout, "<set-?>");
        this.l = frameLayout;
    }

    protected final void X1(String str) {
        T1(t1(str));
    }

    protected final void Y1(PageContext pageContext) {
        zq3.h(pageContext, "<set-?>");
        this.n = pageContext;
    }

    protected final void Z1(PageEventReporter pageEventReporter) {
        zq3.h(pageEventReporter, "<set-?>");
        this.s = pageEventReporter;
    }

    protected final void a2(HybridGamesReferringSourceData hybridGamesReferringSourceData) {
        zq3.h(hybridGamesReferringSourceData, "<set-?>");
        this.r = hybridGamesReferringSourceData;
    }

    protected final void b2(od3 od3Var) {
        zq3.h(od3Var, "<set-?>");
        this.k = od3Var;
    }

    @Override // com.nytimes.xwords.hybrid.view.a
    public CoroutineDispatcher c1() {
        return this.m;
    }

    public final AbraManager getAbraManager() {
        AbraManager abraManager = this.abraManager;
        if (abraManager != null) {
            return abraManager;
        }
        zq3.z("abraManager");
        return null;
    }

    @Override // defpackage.c54
    public void j(String str, Map map) {
        zq3.h(str, "url");
        zq3.h(map, "extras");
        com.nytimes.xwords.hybrid.utils.a.b(this, str);
    }

    protected final void j1() {
        WebView.setWebContentsDebuggingEnabled(J1().getBoolean("HYBRID_CHROME_DEBUGGING_ENABLED", false));
    }

    protected final void l1(String str) {
        zq3.h(str, "url");
        try {
            PageService I1 = I1();
            String cookie = this.t.getCookie(str);
            if (cookie == null) {
                cookie = "";
            }
            I1.get(cookie, HttpUrl.Companion.get(str)).enqueue(new c());
        } catch (UnknownHostException e2) {
            ul8.a.e(e2);
            Q1(ErrorType.OFFLINE);
        } catch (Exception e3) {
            ul8.a.e(e3);
            R1(this, null, 1, null);
        }
    }

    public final el n1() {
        el elVar = this.appConfig;
        if (elVar != null) {
            return elVar;
        }
        zq3.z("appConfig");
        return null;
    }

    @Override // defpackage.vk8
    public void o(final Theme theme) {
        zq3.h(theme, "theme");
        requireActivity().runOnUiThread(new Runnable() { // from class: l50
            @Override // java.lang.Runnable
            public final void run() {
                BaseHybridFragment.k1(BaseHybridFragment.this, theme);
            }
        });
    }

    public final sb3 o1() {
        sb3 sb3Var = this.authEventPublisher;
        if (sb3Var != null) {
            return sb3Var;
        }
        zq3.z("authEventPublisher");
        return null;
    }

    @Override // com.nytimes.xwords.hybrid.view.b, com.nytimes.xwords.hybrid.view.c, androidx.fragment.app.Fragment
    public void onAttach(Context context) {
        zq3.h(context, "context");
        ul8.b bVar = ul8.a;
        if (bVar.A() == 0) {
            bVar.y(new ul8.c[0]);
        }
        super.onAttach(context);
    }

    @Override // androidx.fragment.app.Fragment
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Y1(PageContextDelegate.a.b(this));
        L1();
    }

    @Override // com.nytimes.xwords.hybrid.view.a, androidx.fragment.app.Fragment
    public void onDestroy() {
        N1().destroy();
        N1().setWebViewClient(new WebViewClient());
        super.onDestroy();
    }

    @Override // android.view.View.OnKeyListener
    public boolean onKey(View view, int i, KeyEvent keyEvent) {
        zq3.h(keyEvent, "keyEvent");
        if (keyEvent.getAction() != 0 || i != 4) {
            return false;
        }
        S1();
        return true;
    }

    @Override // androidx.fragment.app.Fragment
    public void onSaveInstanceState(Bundle bundle) {
        zq3.h(bundle, "outState");
        super.onSaveInstanceState(bundle);
        bundle.putBoolean("IS_LOADED_KEY", true);
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle bundle) {
        zq3.h(view, "view");
        super.onViewCreated(view, bundle);
        O1();
        Context requireContext = requireContext();
        zq3.g(requireContext, "requireContext(...)");
        b2(new od3(requireContext));
        BuildersKt__Builders_commonKt.launch$default(this, null, null, new BaseHybridFragment$onViewCreated$1(this, bundle, view, null), 3, null);
    }

    public final dz1 p1() {
        dz1 dz1Var = this.emailEventHandler;
        if (dz1Var != null) {
            return dz1Var;
        }
        zq3.z("emailEventHandler");
        return null;
    }

    protected final Environments q1() {
        return (Environments) this.y.getValue();
    }

    protected final String r1(String str, String str2) {
        zq3.h(str, "cookieName");
        if (str2 == null) {
            return null;
        }
        z38 z38Var = z38.a;
        String format = String.format(Locale.getDefault(), "%s=%s; Domain=%s; Path=/", Arrays.copyOf(new Object[]{str, str2, p96.NYT_DOMAIN}, 3));
        zq3.g(format, "format(...)");
        return format;
    }

    protected final String s1() {
        return r1("fides_disable_banner", "true");
    }

    protected final String t1(String str) {
        return r1("NYT-S", str);
    }

    public abstract String u1();

    public final kb3 v1() {
        kb3 kb3Var = this.hybridAdManager;
        if (kb3Var != null) {
            return kb3Var;
        }
        zq3.z("hybridAdManager");
        return null;
    }

    public final bc3 w1() {
        bc3 bc3Var = this.hybridConfigInstaller;
        if (bc3Var != null) {
            return bc3Var;
        }
        zq3.z("hybridConfigInstaller");
        return null;
    }

    protected final FrameLayout x1() {
        FrameLayout frameLayout = this.l;
        if (frameLayout != null) {
            return frameLayout;
        }
        zq3.z("hybridContainer");
        return null;
    }

    public final ec3 y1() {
        ec3 ec3Var = this.hybridDependencies;
        if (ec3Var != null) {
            return ec3Var;
        }
        zq3.z("hybridDependencies");
        return null;
    }

    public abstract String z1();
}
