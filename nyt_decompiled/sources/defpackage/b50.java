package defpackage;

import com.nytimes.android.articlefront.BaseArticleActivity;
import com.nytimes.android.eventtracker.pagetracker.scope.ET2Scope;
import com.nytimes.android.menu.MenuManager;

/* loaded from: classes3.dex */
public abstract class b50 implements op4 {
    public static void a(BaseArticleActivity baseArticleActivity, i4 i4Var) {
        baseArticleActivity.activityAnalytics = i4Var;
    }

    public static void b(BaseArticleActivity baseArticleActivity, jc jcVar) {
        baseArticleActivity.analyticsClient = jcVar;
    }

    public static void c(BaseArticleActivity baseArticleActivity, zs1 zs1Var) {
        baseArticleActivity.dockDeepLinkHandler = zs1Var;
    }

    public static void d(BaseArticleActivity baseArticleActivity, ET2Scope eT2Scope) {
        baseArticleActivity.et2Scope = eT2Scope;
    }

    public static void e(BaseArticleActivity baseArticleActivity, cb2 cb2Var) {
        baseArticleActivity.featureFlagUtil = cb2Var;
    }

    public static void f(BaseArticleActivity baseArticleActivity, MenuManager menuManager) {
        baseArticleActivity.menuManager = menuManager;
    }
}
