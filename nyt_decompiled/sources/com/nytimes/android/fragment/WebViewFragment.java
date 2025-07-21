package com.nytimes.android.fragment;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.ValueCallback;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentViewModelLazyKt;
import androidx.fragment.app.f;
import androidx.lifecycle.d;
import androidx.lifecycle.t;
import androidx.lifecycle.u;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;
import com.nytimes.android.SingleArticleActivity;
import com.nytimes.android.api.cms.Asset;
import com.nytimes.android.extensions.ViewExtensions;
import com.nytimes.android.fragment.WebViewFragment;
import com.nytimes.android.fragment.article.HybridEventManager;
import com.nytimes.android.fragment.article.WebViewClientFactory;
import com.nytimes.android.fragment.b;
import com.nytimes.android.fragment.gateway.HasGateway;
import com.nytimes.android.gateway.GatewayType;
import com.nytimes.android.hybrid.bridge.SetPTREnabledCommand;
import com.nytimes.android.menu.MenuManager;
import com.nytimes.android.performancetrackerclientphoenix.event.base.HybridType;
import com.nytimes.android.readerhybrid.HybridWebView;
import com.nytimes.android.readerhybrid.MainWebViewClient;
import com.nytimes.android.readerhybrid.WebViewType;
import com.nytimes.android.side.effects.SideEffectOnScrollObserver;
import defpackage.b04;
import defpackage.c04;
import defpackage.cb2;
import defpackage.ci5;
import defpackage.d44;
import defpackage.d83;
import defpackage.e44;
import defpackage.ei6;
import defpackage.eq7;
import defpackage.fc;
import defpackage.fq7;
import defpackage.gw2;
import defpackage.hd3;
import defpackage.j35;
import defpackage.ld1;
import defpackage.lw0;
import defpackage.mf9;
import defpackage.mx0;
import defpackage.na3;
import defpackage.ng6;
import defpackage.oa3;
import defpackage.oc0;
import defpackage.qd6;
import defpackage.qs2;
import defpackage.sa9;
import defpackage.ss2;
import defpackage.t21;
import defpackage.wp7;
import defpackage.ww8;
import defpackage.zq3;
import defpackage.zt6;
import kotlin.LazyThreadSafetyMode;
import kotlin.collections.b0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.text.Regex;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.StateFlow;
import kotlinx.coroutines.flow.StateFlowKt;
import kotlinx.coroutines.rx2.RxConvertKt;

/* loaded from: classes4.dex */
public final class WebViewFragment extends com.nytimes.android.fragment.a implements fc, lw0, gw2 {
    public static final a Companion = new a(null);
    public static final int m = 8;
    public oc0 bridgeCommandsFactory;
    public ld1 deepLinkUtils;
    private final c04 f = kotlin.c.a(new qs2() { // from class: com.nytimes.android.fragment.WebViewFragment$htmlContentLoader$2
        {
            super(0);
        }

        @Override // defpackage.qs2
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final na3 mo865invoke() {
            return WebViewFragment.this.n1().a(WebViewFragment.this.v1().g());
        }
    });
    public cb2 featureFlagUtil;
    private final c04 g;
    private final d83 h;
    public HasGateway hasPaywall;
    public oa3 htmlContentLoaderFactory;
    public b04 hybridEventManager;
    public hd3 hybridPerformanceTracker;
    private SwipeRefreshLayout i;
    private final MutableStateFlow j;
    private final StateFlow k;
    public HybridWebView l;
    public MenuManager menuManager;
    public String pageViewId;
    public SideEffectOnScrollObserver sideEffectOnScrollObserver;
    public WebViewClientFactory webViewClientFactory;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final WebViewFragment a(AssetArgs assetArgs) {
            zq3.h(assetArgs, "assetArgs");
            WebViewFragment webViewFragment = new WebViewFragment();
            webViewFragment.setArguments(assetArgs.l());
            return webViewFragment;
        }

        private a() {
        }
    }

    public static final class b implements Runnable {
        final /* synthetic */ int b;

        public b(int i) {
            this.b = i;
        }

        @Override // java.lang.Runnable
        public final void run() {
            HybridWebView hybridWebView = WebViewFragment.this.l;
            if (hybridWebView != null) {
                hybridWebView.scrollBy(0, this.b);
            }
        }
    }

    public WebViewFragment() {
        final qs2 qs2Var = new qs2() { // from class: com.nytimes.android.fragment.WebViewFragment$special$$inlined$viewModels$default$1
            {
                super(0);
            }

            @Override // defpackage.qs2
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public final Fragment mo865invoke() {
                return Fragment.this;
            }
        };
        final c04 b2 = kotlin.c.b(LazyThreadSafetyMode.NONE, new qs2() { // from class: com.nytimes.android.fragment.WebViewFragment$special$$inlined$viewModels$default$2
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
        this.g = FragmentViewModelLazyKt.b(this, zt6.b(AssetViewModel.class), new qs2() { // from class: com.nytimes.android.fragment.WebViewFragment$special$$inlined$viewModels$default$3
            {
                super(0);
            }

            @Override // defpackage.qs2
            /* renamed from: invoke */
            public final u mo865invoke() {
                sa9 c;
                c = FragmentViewModelLazyKt.c(c04.this);
                return c.getViewModelStore();
            }
        }, new qs2() { // from class: com.nytimes.android.fragment.WebViewFragment$special$$inlined$viewModels$default$4
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // defpackage.qs2
            /* renamed from: invoke */
            public final t21 mo865invoke() {
                sa9 c;
                t21 t21Var;
                qs2 qs2Var3 = qs2.this;
                if (qs2Var3 != null && (t21Var = (t21) qs2Var3.mo865invoke()) != null) {
                    return t21Var;
                }
                c = FragmentViewModelLazyKt.c(b2);
                d dVar = c instanceof d ? (d) c : null;
                return dVar != null ? dVar.getDefaultViewModelCreationExtras() : t21.a.b;
            }
        }, new qs2() { // from class: com.nytimes.android.fragment.WebViewFragment$special$$inlined$viewModels$default$5
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // defpackage.qs2
            /* renamed from: invoke */
            public final t.b mo865invoke() {
                sa9 c;
                t.b defaultViewModelProviderFactory;
                c = FragmentViewModelLazyKt.c(b2);
                d dVar = c instanceof d ? (d) c : null;
                if (dVar != null && (defaultViewModelProviderFactory = dVar.getDefaultViewModelProviderFactory()) != null) {
                    return defaultViewModelProviderFactory;
                }
                t.b defaultViewModelProviderFactory2 = Fragment.this.getDefaultViewModelProviderFactory();
                zq3.g(defaultViewModelProviderFactory2, "defaultViewModelProviderFactory");
                return defaultViewModelProviderFactory2;
            }
        });
        this.h = d83.a;
        MutableStateFlow MutableStateFlow = StateFlowKt.MutableStateFlow(new b.d(0, 0));
        this.j = MutableStateFlow;
        this.k = FlowKt.asStateFlow(MutableStateFlow);
    }

    private final void A1() {
        int savedScrollPosition;
        HybridWebView hybridWebView;
        HybridWebView hybridWebView2 = this.l;
        if (hybridWebView2 == null || (savedScrollPosition = hybridWebView2.getSavedScrollPosition()) <= 0 || (hybridWebView = this.l) == null) {
            return;
        }
        hybridWebView.postDelayed(new b(savedScrollPosition), 250L);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void i1(ss2 ss2Var, Asset asset, String str) {
        zq3.h(ss2Var, "$block");
        zq3.h(asset, "$asset");
        zq3.e(str);
        String e = new Regex("^\"|\"$").e(str, "");
        if (e.length() > 0) {
            ss2Var.invoke(new fq7(wp7.Companion.a(asset, e)));
        }
    }

    private final na3 m1() {
        return (na3) this.f.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void x1(WebViewFragment webViewFragment) {
        zq3.h(webViewFragment, "this$0");
        webViewFragment.m1().a();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean y1(WebViewFragment webViewFragment, View view, MotionEvent motionEvent) {
        zq3.h(webViewFragment, "this$0");
        zq3.h(motionEvent, "event");
        if (motionEvent.getAction() != 0) {
            return false;
        }
        webViewFragment.v1().l();
        return false;
    }

    @Override // defpackage.lw0
    public void I0() {
        f activity = getActivity();
        if (activity instanceof SingleArticleActivity) {
            ((SingleArticleActivity) activity).W0();
        }
        HybridWebView hybridWebView = this.l;
        if (hybridWebView != null) {
            mf9.c(this, "com.nytimes.android.extra.ASSET_URL", hybridWebView);
        }
        if (v1().g().c()) {
            return;
        }
        A1();
    }

    @Override // defpackage.gw2
    public void R0() {
        Intent intent;
        f activity = getActivity();
        if (activity == null || (intent = activity.getIntent()) == null) {
            return;
        }
        v1().i(intent);
    }

    public final cb2 getFeatureFlagUtil() {
        cb2 cb2Var = this.featureFlagUtil;
        if (cb2Var != null) {
            return cb2Var;
        }
        zq3.z("featureFlagUtil");
        return null;
    }

    public final void h1(WebView webView, final Asset asset, final ss2 ss2Var) {
        zq3.h(webView, "<this>");
        zq3.h(asset, "asset");
        zq3.h(ss2Var, "block");
        webView.evaluateJavascript("(function(){return window.getSelection().toString()})()", new ValueCallback() { // from class: ve9
            @Override // android.webkit.ValueCallback
            public final void onReceiveValue(Object obj) {
                WebViewFragment.i1(ss2.this, asset, (String) obj);
            }
        });
    }

    public final oc0 j1() {
        oc0 oc0Var = this.bridgeCommandsFactory;
        if (oc0Var != null) {
            return oc0Var;
        }
        zq3.z("bridgeCommandsFactory");
        return null;
    }

    public final ld1 k1() {
        ld1 ld1Var = this.deepLinkUtils;
        if (ld1Var != null) {
            return ld1Var;
        }
        zq3.z("deepLinkUtils");
        return null;
    }

    public final HasGateway l1() {
        HasGateway hasGateway = this.hasPaywall;
        if (hasGateway != null) {
            return hasGateway;
        }
        zq3.z("hasPaywall");
        return null;
    }

    @Override // defpackage.fc
    public void n() {
        Intent intent;
        f activity = getActivity();
        if (activity == null || (intent = activity.getIntent()) == null) {
            return;
        }
        v1().j(intent);
    }

    public final oa3 n1() {
        oa3 oa3Var = this.htmlContentLoaderFactory;
        if (oa3Var != null) {
            return oa3Var;
        }
        zq3.z("htmlContentLoaderFactory");
        return null;
    }

    public final b04 o1() {
        b04 b04Var = this.hybridEventManager;
        if (b04Var != null) {
            return b04Var;
        }
        zq3.z("hybridEventManager");
        return null;
    }

    @Override // androidx.fragment.app.Fragment
    public void onActivityCreated(Bundle bundle) {
        super.onActivityCreated(bundle);
        q1().q(v1().g().f());
        requireActivity().getLifecycle().a(l1());
        AssetViewModel v1 = v1();
        int g = l1().g();
        GatewayType gatewayType = (GatewayType) l1().f().getValue();
        String r1 = r1();
        String t1 = t1();
        Intent intent = requireActivity().getIntent();
        zq3.g(intent, "getIntent(...)");
        v1.m(g, gatewayType, r1, t1, null, intent);
        if (getFeatureFlagUtil().r()) {
            FlowKt.launchIn(FlowKt.m911catch(FlowKt.onEach(FlowKt.flowOn(RxConvertKt.asFlow(this.h.a(eq7.class)), Dispatchers.getIO()), new WebViewFragment$onActivityCreated$1(this, null)), new WebViewFragment$onActivityCreated$2(null)), e44.a(this));
        }
        HybridWebView hybridWebView = this.l;
        if (hybridWebView != null) {
            BuildersKt__Builders_commonKt.launch$default(e44.a(this), null, null, new WebViewFragment$onActivityCreated$3$1(hybridWebView, this, null), 3, null);
            if (v1().g().c()) {
                ((HybridEventManager) o1().get()).b(hybridWebView, v1().g().h(), v1().g().i(), new ss2() { // from class: com.nytimes.android.fragment.WebViewFragment$onActivityCreated$3$2
                    {
                        super(1);
                    }

                    @Override // defpackage.ss2
                    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                        invoke(((Boolean) obj).booleanValue());
                        return ww8.a;
                    }

                    public final void invoke(boolean z) {
                        SwipeRefreshLayout u1 = WebViewFragment.this.u1();
                        if (u1 == null) {
                            return;
                        }
                        u1.setRefreshing(z);
                    }
                }, e44.a(this));
            }
        }
        if (!v1().g().c()) {
            l1().j(true);
        }
        SwipeRefreshLayout swipeRefreshLayout = this.i;
        if (swipeRefreshLayout != null) {
            swipeRefreshLayout.setOnRefreshListener(new SwipeRefreshLayout.j() { // from class: ue9
                @Override // androidx.swiperefreshlayout.widget.SwipeRefreshLayout.j
                public final void a() {
                    WebViewFragment.x1(WebViewFragment.this);
                }
            });
        }
        m1().a();
        f activity = getActivity();
        if (activity != null) {
            activity.invalidateOptionsMenu();
        }
    }

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        MainWebViewClient a2;
        zq3.h(layoutInflater, "inflater");
        setHasOptionsMenu(true);
        View inflate = layoutInflater.inflate(ei6.fragment_hybrid, viewGroup, false);
        SwipeRefreshLayout swipeRefreshLayout = (SwipeRefreshLayout) inflate.findViewById(ng6.webViewRefreshLayout);
        swipeRefreshLayout.setEnabled(!v1().g().c());
        this.i = swipeRefreshLayout;
        HybridWebView hybridWebView = (HybridWebView) inflate.findViewById(ng6.webView);
        SetPTREnabledCommand setPTREnabledCommand = new SetPTREnabledCommand(null, new WebViewFragment$onCreateView$2$setPTREEnabledCommand$1(this), 1, null);
        AssetArgs g = v1().g();
        d44 viewLifecycleOwner = getViewLifecycleOwner();
        zq3.g(viewLifecycleOwner, "getViewLifecycleOwner(...)");
        hybridWebView.j(e44.a(viewLifecycleOwner), g.c() ? WebViewType.HYBRID : WebViewType.WEB, b0.n(j1().a(), setPTREnabledCommand));
        hybridWebView.setOnTouchListener(new View.OnTouchListener() { // from class: te9
            @Override // android.view.View.OnTouchListener
            public final boolean onTouch(View view, MotionEvent motionEvent) {
                boolean y1;
                y1 = WebViewFragment.y1(WebViewFragment.this, view, motionEvent);
                return y1;
            }
        });
        ld1 k1 = k1();
        zq3.e(hybridWebView);
        k1.a(hybridWebView);
        a2 = w1().a(this, new ss2() { // from class: com.nytimes.android.fragment.WebViewFragment$onCreateView$2$2
            {
                super(1);
            }

            @Override // defpackage.ss2
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke((String) obj);
                return ww8.a;
            }

            public final void invoke(String str) {
                zq3.h(str, "it");
                WebViewFragment.this.z1();
            }
        }, (r21 & 4) != 0 ? false : false, g.c(), g.b(), false, e44.a(this), new ss2() { // from class: com.nytimes.android.fragment.WebViewFragment$onCreateView$2$3
            {
                super(1);
            }

            @Override // defpackage.ss2
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke(((Boolean) obj).booleanValue());
                return ww8.a;
            }

            public final void invoke(boolean z) {
                SwipeRefreshLayout u1 = WebViewFragment.this.u1();
                if (u1 == null) {
                    return;
                }
                u1.setRefreshing(z);
            }
        }, HybridType.Interactive);
        hybridWebView.setWebViewClient(a2);
        hybridWebView.setWebChromeClient(w1().c(g.c()));
        if (g.c()) {
            hybridWebView.setNestedScrollingDelegate(new j35(hybridWebView));
            hybridWebView.setBackgroundColor(mx0.c(requireContext(), qd6.ds_times_white));
        }
        d44 viewLifecycleOwner2 = getViewLifecycleOwner();
        zq3.g(viewLifecycleOwner2, "getViewLifecycleOwner(...)");
        ViewExtensions.b(hybridWebView, viewLifecycleOwner2, VerticalScrollStateKt.c(new ss2() { // from class: com.nytimes.android.fragment.WebViewFragment$onCreateView$2$4
            {
                super(1);
            }

            public final void b(b bVar) {
                MutableStateFlow mutableStateFlow;
                zq3.h(bVar, "it");
                mutableStateFlow = WebViewFragment.this.j;
                mutableStateFlow.setValue(bVar);
            }

            @Override // defpackage.ss2
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                b((b) obj);
                return ww8.a;
            }
        }));
        this.l = hybridWebView;
        return inflate;
    }

    @Override // androidx.fragment.app.Fragment
    public void onDestroyView() {
        HybridWebView hybridWebView = this.l;
        if (hybridWebView != null) {
            SwipeRefreshLayout swipeRefreshLayout = this.i;
            if (swipeRefreshLayout != null) {
                swipeRefreshLayout.removeView(hybridWebView);
            }
            hybridWebView.destroy();
            hybridWebView.setWebViewClient(new WebViewClient());
            hybridWebView.freeMemory();
            this.l = null;
        }
        super.onDestroyView();
    }

    @Override // androidx.fragment.app.Fragment
    public boolean onOptionsItemSelected(MenuItem menuItem) {
        String url;
        zq3.h(menuItem, "item");
        int itemId = menuItem.getItemId();
        if (itemId == 16908332) {
            requireActivity().finish();
            return true;
        }
        if (itemId == ng6.webRefresh) {
            m1().a();
            return true;
        }
        if (itemId != ng6.action_open_in_chrome) {
            return super.onOptionsItemSelected(menuItem);
        }
        HybridWebView hybridWebView = this.l;
        if (hybridWebView == null || (url = hybridWebView.getUrl()) == null) {
            return true;
        }
        f requireActivity = requireActivity();
        zq3.g(requireActivity, "requireActivity(...)");
        ci5.a(requireActivity, url);
        return true;
    }

    @Override // androidx.fragment.app.Fragment
    public void onPause() {
        HybridWebView hybridWebView = this.l;
        if (hybridWebView != null) {
            hybridWebView.onPause();
        }
        super.onPause();
    }

    @Override // androidx.fragment.app.Fragment
    public void onResume() {
        super.onResume();
        HybridWebView hybridWebView = this.l;
        if (hybridWebView != null) {
            hybridWebView.onResume();
            s1().a(hybridWebView, v1().g().c());
        }
        BuildersKt__Builders_commonKt.launch$default(e44.a(this), null, null, new WebViewFragment$onResume$2(this, null), 3, null);
        if (v1().g().c()) {
            ((HybridEventManager) o1().get()).d();
        }
    }

    public final hd3 p1() {
        hd3 hd3Var = this.hybridPerformanceTracker;
        if (hd3Var != null) {
            return hd3Var;
        }
        zq3.z("hybridPerformanceTracker");
        return null;
    }

    public final MenuManager q1() {
        MenuManager menuManager = this.menuManager;
        if (menuManager != null) {
            return menuManager;
        }
        zq3.z("menuManager");
        return null;
    }

    public final String r1() {
        String str = this.pageViewId;
        if (str != null) {
            return str;
        }
        zq3.z("pageViewId");
        return null;
    }

    public final SideEffectOnScrollObserver s1() {
        SideEffectOnScrollObserver sideEffectOnScrollObserver = this.sideEffectOnScrollObserver;
        if (sideEffectOnScrollObserver != null) {
            return sideEffectOnScrollObserver;
        }
        zq3.z("sideEffectOnScrollObserver");
        return null;
    }

    public final String t1() {
        return v1().g().i();
    }

    public final SwipeRefreshLayout u1() {
        return this.i;
    }

    public final AssetViewModel v1() {
        return (AssetViewModel) this.g.getValue();
    }

    public final WebViewClientFactory w1() {
        WebViewClientFactory webViewClientFactory = this.webViewClientFactory;
        if (webViewClientFactory != null) {
            return webViewClientFactory;
        }
        zq3.z("webViewClientFactory");
        return null;
    }

    public final void z1() {
        if (requireActivity().getIntent().getBooleanExtra("com.nytimes.android.extra.DEEPLINK", false)) {
            v1().k();
        }
    }
}
