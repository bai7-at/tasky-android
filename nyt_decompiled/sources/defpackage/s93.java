package defpackage;

import android.app.Application;
import com.nytimes.android.abra.AbraManager;
import com.nytimes.android.eventtracker.pagetracker.scope.ET2Scope;
import com.nytimes.android.features.home.ui.HomeFragment;
import com.nytimes.android.features.home.ui.HomeWebViewClient;
import com.nytimes.android.libs.messagingarchitecture.core.MessageStateFactory;
import com.nytimes.android.utils.AppPreferences;
import com.nytimes.android.utils.NetworkStatus;
import com.nytimes.android.utils.TimeStampUtil;
import com.nytimes.android.utils.snackbar.SnackbarUtil;

/* loaded from: classes4.dex */
public abstract class s93 implements op4 {
    public static void a(HomeFragment homeFragment, AbraManager abraManager) {
        homeFragment.abraManager = abraManager;
    }

    public static void b(HomeFragment homeFragment, lm lmVar) {
        homeFragment.appLaunchPerformanceTracker = lmVar;
    }

    public static void c(HomeFragment homeFragment, AppPreferences appPreferences) {
        homeFragment.appPreferences = appPreferences;
    }

    public static void d(HomeFragment homeFragment, Application application) {
        homeFragment.application = application;
    }

    public static void e(HomeFragment homeFragment, oc0 oc0Var) {
        homeFragment.bridgeCommandsFactory = oc0Var;
    }

    public static void f(HomeFragment homeFragment, ld1 ld1Var) {
        homeFragment.deepLinkUtils = ld1Var;
    }

    public static void g(HomeFragment homeFragment, ET2Scope eT2Scope) {
        homeFragment.et2Scope = eT2Scope;
    }

    public static void h(HomeFragment homeFragment, q93 q93Var) {
        homeFragment.eventTracker = q93Var;
    }

    public static void i(HomeFragment homeFragment, cb2 cb2Var) {
        homeFragment.featureFlagUtil = cb2Var;
    }

    public static void j(HomeFragment homeFragment, kb3 kb3Var) {
        homeFragment.hybridAdManager = kb3Var;
    }

    public static void k(HomeFragment homeFragment, hd3 hd3Var) {
        homeFragment.hybridPerformanceTracker = hd3Var;
    }

    public static void l(HomeFragment homeFragment, bs3 bs3Var) {
        homeFragment.iterateSurveyReporter = bs3Var;
    }

    public static void m(HomeFragment homeFragment, td4 td4Var) {
        homeFragment.mainActivityNavigator = td4Var;
    }

    public static void n(HomeFragment homeFragment, MessageStateFactory messageStateFactory) {
        homeFragment.messageStateFactory = messageStateFactory;
    }

    public static void o(HomeFragment homeFragment, NetworkStatus networkStatus) {
        homeFragment.networkStatus = networkStatus;
    }

    public static void p(HomeFragment homeFragment, ku6 ku6Var) {
        homeFragment.regibundleOfferController = ku6Var;
    }

    public static void q(HomeFragment homeFragment, lu6 lu6Var) {
        homeFragment.regibundleOfferEventSender = lu6Var;
    }

    public static void r(HomeFragment homeFragment, qv6 qv6Var) {
        homeFragment.remoteConfig = qv6Var;
    }

    public static void s(HomeFragment homeFragment, mn7 mn7Var) {
        homeFragment.settingsMenuManager = mn7Var;
    }

    public static void t(HomeFragment homeFragment, SnackbarUtil snackbarUtil) {
        homeFragment.snackbarUtil = snackbarUtil;
    }

    public static void u(HomeFragment homeFragment, TimeStampUtil timeStampUtil) {
        homeFragment.timeStampUtil = timeStampUtil;
    }

    public static void v(HomeFragment homeFragment, ls2 ls2Var) {
        homeFragment.webChromeClient = ls2Var;
    }

    public static void w(HomeFragment homeFragment, HomeWebViewClient homeWebViewClient) {
        homeFragment.webViewClient = homeWebViewClient;
    }
}
