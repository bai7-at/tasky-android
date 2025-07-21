package defpackage;

import com.nytimes.android.ArticlePageEventSender;
import com.nytimes.android.SingleArticleActivity;
import com.nytimes.android.abra.AbraManager;
import com.nytimes.android.fragment.gateway.HasGateway;
import com.nytimes.android.hybrid.HybridEventListener;
import com.nytimes.android.menu.SaveMenuHelper;
import com.nytimes.android.menu.item.MenuTooltipManager;
import com.nytimes.android.menu.item.SubscriberLinkSharingMenuPreparer;
import com.nytimes.android.share.ShareAnalyticsReporter;
import com.nytimes.android.subauth.core.auth.util.OneTapLifecycleObserver;
import com.nytimes.android.utils.AppPreferences;

/* loaded from: classes2.dex */
public abstract class ct7 implements op4 {
    public static void a(SingleArticleActivity singleArticleActivity, AbraManager abraManager) {
        singleArticleActivity.abraManager = abraManager;
    }

    public static void b(SingleArticleActivity singleArticleActivity, AppPreferences appPreferences) {
        singleArticleActivity.appPreferences = appPreferences;
    }

    public static void c(SingleArticleActivity singleArticleActivity, rq rqVar) {
        singleArticleActivity.articleFragmentFactory = rqVar;
    }

    public static void d(SingleArticleActivity singleArticleActivity, ArticlePageEventSender articlePageEventSender) {
        singleArticleActivity.articlePageEventSender = articlePageEventSender;
    }

    public static void e(SingleArticleActivity singleArticleActivity, dk0 dk0Var) {
        singleArticleActivity.chartbeatAnalyticsReporter = dk0Var;
    }

    public static void f(SingleArticleActivity singleArticleActivity, qq qqVar) {
        singleArticleActivity.chooser = qqVar;
    }

    public static void g(SingleArticleActivity singleArticleActivity, HasGateway hasGateway) {
        singleArticleActivity.hasGateway = hasGateway;
    }

    public static void h(SingleArticleActivity singleArticleActivity, HybridEventListener hybridEventListener) {
        singleArticleActivity.hybridEventListener = hybridEventListener;
    }

    public static void i(SingleArticleActivity singleArticleActivity, md3 md3Var) {
        singleArticleActivity.hybridScrollEventManager = md3Var;
    }

    public static void j(SingleArticleActivity singleArticleActivity, ti3 ti3Var) {
        singleArticleActivity.inAppReviewHandler = ti3Var;
    }

    public static void k(SingleArticleActivity singleArticleActivity, SubscriberLinkSharingMenuPreparer subscriberLinkSharingMenuPreparer) {
        singleArticleActivity.menuPreparer = subscriberLinkSharingMenuPreparer;
    }

    public static void l(SingleArticleActivity singleArticleActivity, MenuTooltipManager menuTooltipManager) {
        singleArticleActivity.menuTooltipManager = menuTooltipManager;
    }

    public static void m(SingleArticleActivity singleArticleActivity, OneTapLifecycleObserver oneTapLifecycleObserver) {
        singleArticleActivity.oneTapLifecycleObserver = oneTapLifecycleObserver;
    }

    public static void n(SingleArticleActivity singleArticleActivity, s96 s96Var) {
        singleArticleActivity.purrUI = s96Var;
    }

    public static void o(SingleArticleActivity singleArticleActivity, SaveMenuHelper saveMenuHelper) {
        singleArticleActivity.saveMenuHelper = saveMenuHelper;
    }

    public static void p(SingleArticleActivity singleArticleActivity, ShareAnalyticsReporter shareAnalyticsReporter) {
        singleArticleActivity.shareAnalyticsReporter = shareAnalyticsReporter;
    }

    public static void q(SingleArticleActivity singleArticleActivity, uq7 uq7Var) {
        singleArticleActivity.sharingManager = uq7Var;
    }

    public static void r(SingleArticleActivity singleArticleActivity, dr7 dr7Var) {
        singleArticleActivity.showReviewClass = dr7Var;
    }

    public static void s(SingleArticleActivity singleArticleActivity, gt7 gt7Var) {
        singleArticleActivity.singleAssetPresenter = gt7Var;
    }

    public static void t(SingleArticleActivity singleArticleActivity, vn8 vn8Var) {
        singleArticleActivity.tooltipManager = vn8Var;
    }
}
