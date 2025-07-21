package defpackage;

import com.nytimes.android.WebActivity;
import com.nytimes.android.eventtracker.pagetracker.scope.ET2Scope;
import com.nytimes.android.menu.MenuManager;

/* loaded from: classes2.dex */
public abstract class kd9 implements op4 {
    public static void a(WebActivity webActivity, i4 i4Var) {
        webActivity.activityAnalytics = i4Var;
    }

    public static void b(WebActivity webActivity, jc jcVar) {
        webActivity.analyticsClient = jcVar;
    }

    public static void c(WebActivity webActivity, zs1 zs1Var) {
        webActivity.dockDeepLinkHandler = zs1Var;
    }

    public static void d(WebActivity webActivity, ET2Scope eT2Scope) {
        webActivity.et2Scope = eT2Scope;
    }

    public static void e(WebActivity webActivity, cb2 cb2Var) {
        webActivity.featureFlagUtil = cb2Var;
    }

    public static void f(WebActivity webActivity, uy3 uy3Var) {
        webActivity.launchProductLandingHelper = uy3Var;
    }

    public static void g(WebActivity webActivity, MenuManager menuManager) {
        webActivity.menuManager = menuManager;
    }

    public static void h(WebActivity webActivity, qv6 qv6Var) {
        webActivity.remoteConfig = qv6Var;
    }
}
