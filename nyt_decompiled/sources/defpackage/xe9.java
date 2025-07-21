package defpackage;

import com.nytimes.android.fragment.WebViewFragment;
import com.nytimes.android.fragment.article.WebViewClientFactory;
import com.nytimes.android.fragment.gateway.HasGateway;
import com.nytimes.android.menu.MenuManager;
import com.nytimes.android.side.effects.SideEffectOnScrollObserver;

/* loaded from: classes4.dex */
public abstract class xe9 implements op4 {
    public static void a(WebViewFragment webViewFragment, oc0 oc0Var) {
        webViewFragment.bridgeCommandsFactory = oc0Var;
    }

    public static void b(WebViewFragment webViewFragment, ld1 ld1Var) {
        webViewFragment.deepLinkUtils = ld1Var;
    }

    public static void c(WebViewFragment webViewFragment, cb2 cb2Var) {
        webViewFragment.featureFlagUtil = cb2Var;
    }

    public static void d(WebViewFragment webViewFragment, HasGateway hasGateway) {
        webViewFragment.hasPaywall = hasGateway;
    }

    public static void e(WebViewFragment webViewFragment, oa3 oa3Var) {
        webViewFragment.htmlContentLoaderFactory = oa3Var;
    }

    public static void f(WebViewFragment webViewFragment, b04 b04Var) {
        webViewFragment.hybridEventManager = b04Var;
    }

    public static void g(WebViewFragment webViewFragment, hd3 hd3Var) {
        webViewFragment.hybridPerformanceTracker = hd3Var;
    }

    public static void h(WebViewFragment webViewFragment, MenuManager menuManager) {
        webViewFragment.menuManager = menuManager;
    }

    public static void i(WebViewFragment webViewFragment, String str) {
        webViewFragment.pageViewId = str;
    }

    public static void j(WebViewFragment webViewFragment, SideEffectOnScrollObserver sideEffectOnScrollObserver) {
        webViewFragment.sideEffectOnScrollObserver = sideEffectOnScrollObserver;
    }

    public static void k(WebViewFragment webViewFragment, WebViewClientFactory webViewClientFactory) {
        webViewFragment.webViewClientFactory = webViewClientFactory;
    }
}
