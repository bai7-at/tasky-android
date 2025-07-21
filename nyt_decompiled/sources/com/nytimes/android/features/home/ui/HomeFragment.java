package com.nytimes.android.features.home.ui;

import android.app.Application;
import android.content.Context;
import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView;
import android.widget.FrameLayout;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentViewModelLazyKt;
import androidx.lifecycle.Transformations;
import androidx.lifecycle.d;
import androidx.lifecycle.t;
import androidx.lifecycle.u;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;
import com.nytimes.abtests.GrowthUIRegibundleVariants;
import com.nytimes.android.abra.AbraManager;
import com.nytimes.android.ads.model.ContentType;
import com.nytimes.android.designsystem.uiview.ProgressTextView;
import com.nytimes.android.eventtracker.context.PageContext;
import com.nytimes.android.eventtracker.pagetracker.scope.ET2PageScope;
import com.nytimes.android.eventtracker.pagetracker.scope.ET2Scope;
import com.nytimes.android.extensions.ViewExtensions;
import com.nytimes.android.features.home.ui.HomeFragment;
import com.nytimes.android.features.home.ui.b;
import com.nytimes.android.growthui.regibundle.RegibundleDialogFragment;
import com.nytimes.android.libs.messagingarchitecture.core.MessageStateFactory;
import com.nytimes.android.messaging.regibundle.RegibundleFragment;
import com.nytimes.android.performancetrackerclientphoenix.utils.AppLaunchHomeConstants;
import com.nytimes.android.readerhybrid.HybridWebView;
import com.nytimes.android.readerhybrid.WebViewType;
import com.nytimes.android.utils.AppPreferences;
import com.nytimes.android.utils.NetworkStatus;
import com.nytimes.android.utils.TimeStampUtil;
import com.nytimes.android.utils.snackbar.SnackbarUtil;
import defpackage.bs3;
import defpackage.c04;
import defpackage.cb2;
import defpackage.d44;
import defpackage.du8;
import defpackage.e44;
import defpackage.e52;
import defpackage.ee4;
import defpackage.fe4;
import defpackage.gd6;
import defpackage.hd3;
import defpackage.il6;
import defpackage.j35;
import defpackage.kb3;
import defpackage.ku6;
import defpackage.ld1;
import defpackage.lm;
import defpackage.ls2;
import defpackage.lt2;
import defpackage.lu6;
import defpackage.lw0;
import defpackage.mn7;
import defpackage.mt2;
import defpackage.o93;
import defpackage.oc0;
import defpackage.of9;
import defpackage.ot7;
import defpackage.q93;
import defpackage.qs2;
import defpackage.qv6;
import defpackage.rc7;
import defpackage.s42;
import defpackage.sa9;
import defpackage.ss2;
import defpackage.st2;
import defpackage.t21;
import defpackage.tb1;
import defpackage.td4;
import defpackage.tx1;
import defpackage.u32;
import defpackage.uy3;
import defpackage.vc5;
import defpackage.ww8;
import defpackage.wy3;
import defpackage.y32;
import defpackage.yn8;
import defpackage.z93;
import defpackage.zq3;
import defpackage.zr0;
import defpackage.zt6;
import kotlin.LazyThreadSafetyMode;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Ref$BooleanRef;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;

/* loaded from: classes4.dex */
public final class HomeFragment extends com.nytimes.android.features.home.ui.a implements rc7, ee4, lw0, yn8 {
    public static final a Companion = new a(null);
    public static final int j = 8;
    public AbraManager abraManager;
    public lm appLaunchPerformanceTracker;
    public AppPreferences appPreferences;
    public Application application;
    public oc0 bridgeCommandsFactory;
    public ld1 deepLinkUtils;
    public ET2Scope et2Scope;
    public q93 eventTracker;
    public fe4 f;
    public cb2 featureFlagUtil;
    private o93 g;
    private final c04 h;
    public kb3 hybridAdManager;
    public hd3 hybridPerformanceTracker;
    private qs2 i;
    public bs3 iterateSurveyReporter;
    public td4 mainActivityNavigator;
    public MessageStateFactory messageStateFactory;
    public NetworkStatus networkStatus;
    public ku6 regibundleOfferController;
    public lu6 regibundleOfferEventSender;
    public qv6 remoteConfig;
    public mn7 settingsMenuManager;
    public SnackbarUtil snackbarUtil;
    public TimeStampUtil timeStampUtil;
    public ls2 webChromeClient;
    public HomeWebViewClient webViewClient;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    public static final class b implements Runnable {
        @Override // java.lang.Runnable
        public final void run() {
        }
    }

    static final class c implements vc5, st2 {
        private final /* synthetic */ ss2 a;

        c(ss2 ss2Var) {
            zq3.h(ss2Var, "function");
            this.a = ss2Var;
        }

        @Override // defpackage.vc5
        public final /* synthetic */ void a(Object obj) {
            this.a.invoke(obj);
        }

        @Override // defpackage.st2
        public final lt2 b() {
            return this.a;
        }

        public final boolean equals(Object obj) {
            if ((obj instanceof vc5) && (obj instanceof st2)) {
                return zq3.c(b(), ((st2) obj).b());
            }
            return false;
        }

        public final int hashCode() {
            return b().hashCode();
        }
    }

    public HomeFragment() {
        final qs2 qs2Var = new qs2() { // from class: com.nytimes.android.features.home.ui.HomeFragment$special$$inlined$viewModels$default$1
            {
                super(0);
            }

            @Override // defpackage.qs2
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public final Fragment mo865invoke() {
                return Fragment.this;
            }
        };
        final c04 b2 = kotlin.c.b(LazyThreadSafetyMode.NONE, new qs2() { // from class: com.nytimes.android.features.home.ui.HomeFragment$special$$inlined$viewModels$default$2
            {
                super(0);
            }

            @Override // defpackage.qs2
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public final sa9 mo865invoke() {
                return (sa9) qs2.this.mo865invoke();
            }
        });
        final qs2 qs2Var2 = null;
        this.h = FragmentViewModelLazyKt.b(this, zt6.b(HomeViewModel.class), new qs2() { // from class: com.nytimes.android.features.home.ui.HomeFragment$special$$inlined$viewModels$default$3
            {
                super(0);
            }

            @Override // defpackage.qs2
            /* renamed from: invoke */
            public final u mo865invoke() {
                sa9 c2;
                c2 = FragmentViewModelLazyKt.c(c04.this);
                return c2.getViewModelStore();
            }
        }, new qs2() { // from class: com.nytimes.android.features.home.ui.HomeFragment$special$$inlined$viewModels$default$4
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // defpackage.qs2
            /* renamed from: invoke */
            public final t21 mo865invoke() {
                sa9 c2;
                t21 t21Var;
                qs2 qs2Var3 = qs2.this;
                if (qs2Var3 != null && (t21Var = (t21) qs2Var3.mo865invoke()) != null) {
                    return t21Var;
                }
                c2 = FragmentViewModelLazyKt.c(b2);
                d dVar = c2 instanceof d ? (d) c2 : null;
                return dVar != null ? dVar.getDefaultViewModelCreationExtras() : t21.a.b;
            }
        }, new qs2() { // from class: com.nytimes.android.features.home.ui.HomeFragment$special$$inlined$viewModels$default$5
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // defpackage.qs2
            /* renamed from: invoke */
            public final t.b mo865invoke() {
                sa9 c2;
                t.b defaultViewModelProviderFactory;
                c2 = FragmentViewModelLazyKt.c(b2);
                d dVar = c2 instanceof d ? (d) c2 : null;
                if (dVar != null && (defaultViewModelProviderFactory = dVar.getDefaultViewModelProviderFactory()) != null) {
                    return defaultViewModelProviderFactory;
                }
                t.b defaultViewModelProviderFactory2 = Fragment.this.getDefaultViewModelProviderFactory();
                zq3.g(defaultViewModelProviderFactory2, "defaultViewModelProviderFactory");
                return defaultViewModelProviderFactory2;
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final HomeViewModel A1() {
        return (HomeViewModel) this.h.getValue();
    }

    private final void D1(o93 o93Var, boolean z) {
        if (z) {
            o93Var.b.setContent(zr0.c(-1339950991, true, new HomeFragment$initToolbar$1(this, o93Var)));
        }
    }

    private final void E1(o93 o93Var) {
        final HybridWebView hybridWebView = o93Var.e;
        hybridWebView.setBackgroundColor(Color.argb(1, 0, 0, 0));
        hybridWebView.setWebViewClient(C1());
        d44 viewLifecycleOwner = getViewLifecycleOwner();
        zq3.g(viewLifecycleOwner, "getViewLifecycleOwner(...)");
        hybridWebView.j(e44.a(viewLifecycleOwner), WebViewType.WEB, m1().a());
        ld1 n1 = n1();
        zq3.e(hybridWebView);
        n1.a(hybridWebView);
        hybridWebView.setWebChromeClient(B1());
        BuildersKt__Builders_commonKt.launch$default(e44.a(this), null, null, new HomeFragment$initWebView$1$1(hybridWebView, this, null), 3, null);
        hybridWebView.setNestedScrollingDelegate(new j35(hybridWebView));
        F1(hybridWebView);
        ViewExtensions.a(hybridWebView, new mt2() { // from class: com.nytimes.android.features.home.ui.HomeFragment$initWebView$1$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(5);
            }

            public final void b(View view, int i, int i2, int i3, int i4) {
                zq3.h(view, "<anonymous parameter 0>");
                HomeFragment.this.v1().i(hybridWebView.getScrollPercentage());
            }

            @Override // defpackage.mt2
            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
                b((View) obj, ((Number) obj2).intValue(), ((Number) obj3).intValue(), ((Number) obj4).intValue(), ((Number) obj5).intValue());
                return ww8.a;
            }
        });
        if (getFeatureFlagUtil().w()) {
            L1(hybridWebView);
        }
        q1().a(hybridWebView);
        kb3.a.a(q1(), ContentType.SECTION_HOMEPAGE.getValue(), "https://www.nytimes.com/pages/index.html", null, 4, null);
    }

    private final void F1(final WebView webView) {
        webView.setOnTouchListener(new View.OnTouchListener() { // from class: n93
            @Override // android.view.View.OnTouchListener
            public final boolean onTouch(View view, MotionEvent motionEvent) {
                boolean G1;
                G1 = HomeFragment.G1(HomeFragment.this, webView, view, motionEvent);
                return G1;
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean G1(HomeFragment homeFragment, WebView webView, View view, MotionEvent motionEvent) {
        PageContext pageContext;
        zq3.h(homeFragment, "this$0");
        zq3.h(webView, "$webview");
        if (motionEvent.getAction() != 0 || !homeFragment.w1().a(webView.getScrollY())) {
            return false;
        }
        tx1 c2 = homeFragment.o1().c();
        if (c2 == null || (pageContext = c2.i()) == null) {
            pageContext = new PageContext(null, null, null, null, 0, 31, null);
        }
        homeFragment.getAbraManager().exposeTest(GrowthUIRegibundleVariants.Companion.a().getTestName(), kotlin.collections.t.f(du8.a("pageContext", pageContext)));
        if (!homeFragment.getFeatureFlagUtil().i()) {
            new RegibundleFragment().show(homeFragment.getParentFragmentManager(), "SubscriptionMessagingFragment");
            return false;
        }
        RegibundleDialogFragment.a aVar = RegibundleDialogFragment.Companion;
        FragmentManager parentFragmentManager = homeFragment.getParentFragmentManager();
        zq3.g(parentFragmentManager, "getParentFragmentManager(...)");
        aVar.a(parentFragmentManager);
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void I1(HomeFragment homeFragment) {
        zq3.h(homeFragment, "this$0");
        homeFragment.J1();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void J1() {
        if (!getNetworkStatus().g()) {
            o93 o93Var = this.g;
            SwipeRefreshLayout swipeRefreshLayout = o93Var != null ? o93Var.f : null;
            if (swipeRefreshLayout != null) {
                swipeRefreshLayout.setRefreshing(false);
            }
            P1();
            return;
        }
        qs2 qs2Var = this.i;
        if (qs2Var != null) {
            qs2Var.mo865invoke();
        }
        p1().b();
        A1().g();
        if (this.g != null) {
            kb3.a.a(q1(), ContentType.SECTION_HOMEPAGE.getValue(), "https://www.nytimes.com/pages/index.html", null, 4, null);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void K1() {
        uy3 a2;
        M1();
        Context context = getContext();
        Intent g = (context == null || (a2 = wy3.a(context)) == null) ? null : a2.g();
        Context context2 = getContext();
        if (context2 != null) {
            context2.startActivity(g);
        }
    }

    private final void L1(final HybridWebView hybridWebView) {
        final int s = x1().s();
        final boolean n = getAppPreferences().n("isToolTipShownOnHome", false);
        final long k = getAppPreferences().k(l1().getString(il6.ITERATE_HOME_SCROLL_EVENT), 0L);
        final Ref$BooleanRef ref$BooleanRef = new Ref$BooleanRef();
        ViewExtensions.a(hybridWebView, new mt2() { // from class: com.nytimes.android.features.home.ui.HomeFragment$sendHomeScrollIterateSurvey$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(5);
            }

            public final void b(View view, int i, int i2, int i3, int i4) {
                zq3.h(view, "<anonymous parameter 0>");
                if (HybridWebView.this.getScrollPercentage() < s || ref$BooleanRef.element || n || tb1.c(k)) {
                    return;
                }
                bs3 s1 = this.s1();
                FragmentManager parentFragmentManager = this.getParentFragmentManager();
                zq3.g(parentFragmentManager, "getParentFragmentManager(...)");
                s1.d(parentFragmentManager);
                ref$BooleanRef.element = true;
            }

            @Override // defpackage.mt2
            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
                b((View) obj, ((Number) obj2).intValue(), ((Number) obj3).intValue(), ((Number) obj4).intValue(), ((Number) obj5).intValue());
                return ww8.a;
            }
        });
    }

    private final void M1() {
        ET2PageScope.DefaultImpls.a(o1(), new e52.e(), new s42("bar one", "static subscribe", null, null, null, null, null, new y32(null, null, null, "button", null, null, 55, null), null, 380, null), new u32(null, "bar one cta", "tap", 1, null), null, 8, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void N1() {
        ET2PageScope.DefaultImpls.a(o1(), new e52.d(), new s42("bar one", "static subscribe", null, null, null, null, null, null, "Gain access to all of the Times", 252, null), new u32(null, "bar one cta", null, 5, null), null, 8, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void P1() {
        SnackbarUtil snackbarUtil = getSnackbarUtil();
        z93 z93Var = (z93) A1().k().f();
        this.i = snackbarUtil.r((z93Var != null ? z93Var.c() : null) == null, new qs2() { // from class: com.nytimes.android.features.home.ui.HomeFragment$showNetworkError$1
            {
                super(0);
            }

            @Override // defpackage.qs2
            /* renamed from: invoke */
            public /* bridge */ /* synthetic */ Object mo865invoke() {
                m411invoke();
                return ww8.a;
            }

            /* renamed from: invoke, reason: collision with other method in class */
            public final void m411invoke() {
                HomeFragment.this.J1();
            }
        });
    }

    public final ls2 B1() {
        ls2 ls2Var = this.webChromeClient;
        if (ls2Var != null) {
            return ls2Var;
        }
        zq3.z("webChromeClient");
        return null;
    }

    public final HomeWebViewClient C1() {
        HomeWebViewClient homeWebViewClient = this.webViewClient;
        if (homeWebViewClient != null) {
            return homeWebViewClient;
        }
        zq3.z("webViewClient");
        return null;
    }

    @Override // androidx.fragment.app.Fragment
    /* renamed from: H1, reason: merged with bridge method [inline-methods] */
    public FrameLayout onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        zq3.h(layoutInflater, "inflater");
        final o93 c2 = o93.c(layoutInflater, viewGroup, false);
        this.g = c2;
        SwipeRefreshLayout swipeRefreshLayout = c2.f;
        swipeRefreshLayout.setColorSchemeResources(gd6.content_primary_alwayslight);
        swipeRefreshLayout.setProgressBackgroundColorSchemeResource(gd6.background_primary_alwayslight);
        swipeRefreshLayout.setOnRefreshListener(new SwipeRefreshLayout.j() { // from class: m93
            @Override // androidx.swiperefreshlayout.widget.SwipeRefreshLayout.j
            public final void a() {
                HomeFragment.I1(HomeFragment.this);
            }
        });
        swipeRefreshLayout.setProgressViewOffset(false, 0, (int) Math.ceil(72 * getResources().getDisplayMetrics().density));
        zq3.e(c2);
        D1(c2, true);
        E1(c2);
        A1().k().j(getViewLifecycleOwner(), new c(new ss2() { // from class: com.nytimes.android.features.home.ui.HomeFragment$onCreateView$1$2
            {
                super(1);
            }

            public final void b(z93 z93Var) {
                o93 o93Var = o93.this;
                ProgressTextView progressTextView = o93Var.d;
                SwipeRefreshLayout swipeRefreshLayout2 = o93Var.f;
                zq3.g(swipeRefreshLayout2, "webViewRefreshLayout");
                progressTextView.A(swipeRefreshLayout2, z93Var.e());
            }

            @Override // defpackage.ss2
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                b((z93) obj);
                return ww8.a;
            }
        }));
        Ref$BooleanRef ref$BooleanRef = new Ref$BooleanRef();
        ref$BooleanRef.element = true;
        Transformations.a(Transformations.b(A1().k(), new ss2() { // from class: com.nytimes.android.features.home.ui.HomeFragment$onCreateView$1$3
            @Override // defpackage.ss2
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public final String invoke(z93 z93Var) {
                return z93Var.d();
            }
        })).j(getViewLifecycleOwner(), new c(new HomeFragment$onCreateView$1$4(ref$BooleanRef, c2)));
        ot7 i = A1().i();
        d44 viewLifecycleOwner = getViewLifecycleOwner();
        zq3.g(viewLifecycleOwner, "getViewLifecycleOwner(...)");
        i.j(viewLifecycleOwner, new c(new ss2() { // from class: com.nytimes.android.features.home.ui.HomeFragment$onCreateView$1$5
            {
                super(1);
            }

            public final void b(b bVar) {
                zq3.h(bVar, "event");
                if (bVar instanceof b.a) {
                    HomeFragment homeFragment = HomeFragment.this;
                    homeFragment.i = SnackbarUtil.z(homeFragment.getSnackbarUtil(), HomeFragment.this.z1().s(((b.a) bVar).a()), 0, false, 6, null);
                } else if (zq3.c(bVar, b.C0286b.a)) {
                    if (!HomeFragment.this.getNetworkStatus().g()) {
                        HomeFragment.this.P1();
                        return;
                    }
                    HomeFragment homeFragment2 = HomeFragment.this;
                    SnackbarUtil snackbarUtil = homeFragment2.getSnackbarUtil();
                    final HomeFragment homeFragment3 = HomeFragment.this;
                    homeFragment2.i = snackbarUtil.m(new qs2() { // from class: com.nytimes.android.features.home.ui.HomeFragment$onCreateView$1$5.1
                        {
                            super(0);
                        }

                        @Override // defpackage.qs2
                        /* renamed from: invoke */
                        public /* bridge */ /* synthetic */ Object mo865invoke() {
                            m410invoke();
                            return ww8.a;
                        }

                        /* renamed from: invoke, reason: collision with other method in class */
                        public final void m410invoke() {
                            HomeViewModel A1;
                            A1 = HomeFragment.this.A1();
                            A1.m();
                        }
                    });
                }
            }

            @Override // defpackage.ss2
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                b((b) obj);
                return ww8.a;
            }
        }));
        FrameLayout root = c2.getRoot();
        zq3.g(root, "getRoot(...)");
        return root;
    }

    @Override // defpackage.lw0
    public void I0() {
        o93 o93Var = this.g;
        if (o93Var == null) {
            return;
        }
        if (o93Var.e.getSavedScrollPosition() > 0) {
            HybridWebView hybridWebView = o93Var.e;
            zq3.g(hybridWebView, "webView");
            hybridWebView.postDelayed(new b(), 250L);
        }
        k1().p(AppLaunchHomeConstants.ONE_WEBVIEW_HOME);
    }

    public final void O1(fe4 fe4Var) {
        zq3.h(fe4Var, "<set-?>");
        this.f = fe4Var;
    }

    public final AbraManager getAbraManager() {
        AbraManager abraManager = this.abraManager;
        if (abraManager != null) {
            return abraManager;
        }
        zq3.z("abraManager");
        return null;
    }

    public final AppPreferences getAppPreferences() {
        AppPreferences appPreferences = this.appPreferences;
        if (appPreferences != null) {
            return appPreferences;
        }
        zq3.z("appPreferences");
        return null;
    }

    public final cb2 getFeatureFlagUtil() {
        cb2 cb2Var = this.featureFlagUtil;
        if (cb2Var != null) {
            return cb2Var;
        }
        zq3.z("featureFlagUtil");
        return null;
    }

    public final NetworkStatus getNetworkStatus() {
        NetworkStatus networkStatus = this.networkStatus;
        if (networkStatus != null) {
            return networkStatus;
        }
        zq3.z("networkStatus");
        return null;
    }

    public final SnackbarUtil getSnackbarUtil() {
        SnackbarUtil snackbarUtil = this.snackbarUtil;
        if (snackbarUtil != null) {
            return snackbarUtil;
        }
        zq3.z("snackbarUtil");
        return null;
    }

    public final lm k1() {
        lm lmVar = this.appLaunchPerformanceTracker;
        if (lmVar != null) {
            return lmVar;
        }
        zq3.z("appLaunchPerformanceTracker");
        return null;
    }

    public final Application l1() {
        Application application = this.application;
        if (application != null) {
            return application;
        }
        zq3.z("application");
        return null;
    }

    public final oc0 m1() {
        oc0 oc0Var = this.bridgeCommandsFactory;
        if (oc0Var != null) {
            return oc0Var;
        }
        zq3.z("bridgeCommandsFactory");
        return null;
    }

    @Override // defpackage.rc7
    public void n0(boolean z) {
        HybridWebView hybridWebView;
        o93 o93Var = this.g;
        if (o93Var == null || (hybridWebView = o93Var.e) == null) {
            return;
        }
        of9.b(hybridWebView, 0, 1, null);
    }

    public final ld1 n1() {
        ld1 ld1Var = this.deepLinkUtils;
        if (ld1Var != null) {
            return ld1Var;
        }
        zq3.z("deepLinkUtils");
        return null;
    }

    public final ET2Scope o1() {
        ET2Scope eT2Scope = this.et2Scope;
        if (eT2Scope != null) {
            return eT2Scope;
        }
        zq3.z("et2Scope");
        return null;
    }

    @Override // androidx.fragment.app.Fragment
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setHasOptionsMenu(true);
    }

    @Override // androidx.fragment.app.Fragment
    public void onCreateOptionsMenu(Menu menu, MenuInflater menuInflater) {
        zq3.h(menu, "menu");
        zq3.h(menuInflater, "inflater");
        y1().b(menu, new qs2() { // from class: com.nytimes.android.features.home.ui.HomeFragment$onCreateOptionsMenu$1
            {
                super(0);
            }

            @Override // defpackage.qs2
            /* renamed from: invoke */
            public /* bridge */ /* synthetic */ Object mo865invoke() {
                m409invoke();
                return ww8.a;
            }

            /* renamed from: invoke, reason: collision with other method in class */
            public final void m409invoke() {
                HomeFragment.this.p1().a();
            }
        });
        super.onCreateOptionsMenu(menu, menuInflater);
    }

    @Override // androidx.fragment.app.Fragment
    public void onDestroyView() {
        this.g = null;
        super.onDestroyView();
    }

    @Override // androidx.fragment.app.Fragment
    public void onResume() {
        PageContext i;
        super.onResume();
        A1().onResume();
        if (this.g != null) {
            kb3 q1 = q1();
            tx1 c2 = o1().c();
            String g = (c2 == null || (i = c2.i()) == null) ? null : i.g();
            if (g == null) {
                g = "";
            }
            q1.c(g);
        }
    }

    public final q93 p1() {
        q93 q93Var = this.eventTracker;
        if (q93Var != null) {
            return q93Var;
        }
        zq3.z("eventTracker");
        return null;
    }

    public final kb3 q1() {
        kb3 kb3Var = this.hybridAdManager;
        if (kb3Var != null) {
            return kb3Var;
        }
        zq3.z("hybridAdManager");
        return null;
    }

    public final hd3 r1() {
        hd3 hd3Var = this.hybridPerformanceTracker;
        if (hd3Var != null) {
            return hd3Var;
        }
        zq3.z("hybridPerformanceTracker");
        return null;
    }

    public final bs3 s1() {
        bs3 bs3Var = this.iterateSurveyReporter;
        if (bs3Var != null) {
            return bs3Var;
        }
        zq3.z("iterateSurveyReporter");
        return null;
    }

    public final td4 t1() {
        td4 td4Var = this.mainActivityNavigator;
        if (td4Var != null) {
            return td4Var;
        }
        zq3.z("mainActivityNavigator");
        return null;
    }

    public final fe4 u1() {
        fe4 fe4Var = this.f;
        if (fe4Var != null) {
            return fe4Var;
        }
        zq3.z("mainTabState");
        return null;
    }

    public final MessageStateFactory v1() {
        MessageStateFactory messageStateFactory = this.messageStateFactory;
        if (messageStateFactory != null) {
            return messageStateFactory;
        }
        zq3.z("messageStateFactory");
        return null;
    }

    public final ku6 w1() {
        ku6 ku6Var = this.regibundleOfferController;
        if (ku6Var != null) {
            return ku6Var;
        }
        zq3.z("regibundleOfferController");
        return null;
    }

    public final qv6 x1() {
        qv6 qv6Var = this.remoteConfig;
        if (qv6Var != null) {
            return qv6Var;
        }
        zq3.z("remoteConfig");
        return null;
    }

    public final mn7 y1() {
        mn7 mn7Var = this.settingsMenuManager;
        if (mn7Var != null) {
            return mn7Var;
        }
        zq3.z("settingsMenuManager");
        return null;
    }

    public final TimeStampUtil z1() {
        TimeStampUtil timeStampUtil = this.timeStampUtil;
        if (timeStampUtil != null) {
            return timeStampUtil;
        }
        zq3.z("timeStampUtil");
        return null;
    }
}
