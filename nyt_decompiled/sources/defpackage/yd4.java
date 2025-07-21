package defpackage;

import com.nytimes.android.ForegroundStateObserver;
import com.nytimes.android.MainActivity;
import com.nytimes.android.mainactivity.MainBottomNavUi;
import com.nytimes.android.media.audio.AudioDeepLinkHandler;
import com.nytimes.android.notification.SaveIntentHandler;
import com.nytimes.android.subauth.core.auth.util.OneTapLifecycleObserver;
import com.nytimes.android.subauth.core.auth.util.SmartLockLifecycleObserver;
import com.nytimes.android.utils.OnboardingActivityManager;
import com.nytimes.android.widget.ForcedLogoutAlert;

/* loaded from: classes2.dex */
public abstract class yd4 implements op4 {
    public static void a(MainActivity mainActivity, b04 b04Var) {
        mainActivity.analyticsClient = b04Var;
    }

    public static void b(MainActivity mainActivity, gm gmVar) {
        mainActivity.appExpirationChecker = gmVar;
    }

    public static void c(MainActivity mainActivity, AudioDeepLinkHandler audioDeepLinkHandler) {
        mainActivity.audioDeepLinkHandler = audioDeepLinkHandler;
    }

    public static void d(MainActivity mainActivity, ln1 ln1Var) {
        mainActivity.destinationDeeplinkHandler = ln1Var;
    }

    public static void e(MainActivity mainActivity, wc wcVar) {
        mainActivity.eventManager = wcVar;
    }

    public static void f(MainActivity mainActivity, cb2 cb2Var) {
        mainActivity.featureFlagUtil = cb2Var;
    }

    public static void g(MainActivity mainActivity, ForcedLogoutAlert forcedLogoutAlert) {
        mainActivity.forcedLogoutAlert = forcedLogoutAlert;
    }

    public static void h(MainActivity mainActivity, ForegroundStateObserver foregroundStateObserver) {
        mainActivity.foregroundStateObserver = foregroundStateObserver;
    }

    public static void i(MainActivity mainActivity, lm lmVar) {
        mainActivity.launchPerformanceTracker = lmVar;
    }

    public static void j(MainActivity mainActivity, la5 la5Var) {
        mainActivity.notificationsHelper = la5Var;
    }

    public static void k(MainActivity mainActivity, OnboardingActivityManager onboardingActivityManager) {
        mainActivity.onboardingActivityManager = onboardingActivityManager;
    }

    public static void l(MainActivity mainActivity, OneTapLifecycleObserver oneTapLifecycleObserver) {
        mainActivity.oneTapLifecycleObserver = oneTapLifecycleObserver;
    }

    public static void m(MainActivity mainActivity, s96 s96Var) {
        mainActivity.purrUI = s96Var;
    }

    public static void n(MainActivity mainActivity, mo6 mo6Var) {
        mainActivity.raceConditionLogger = mo6Var;
    }

    public static void o(MainActivity mainActivity, SaveIntentHandler saveIntentHandler) {
        mainActivity.saveIntentHandler = saveIntentHandler;
    }

    public static void p(MainActivity mainActivity, SmartLockLifecycleObserver smartLockLifecycleObserver) {
        mainActivity.smartLockLifecycleObserver = smartLockLifecycleObserver;
    }

    public static void q(MainActivity mainActivity, z58 z58Var) {
        mainActivity.subauthClient = z58Var;
    }

    public static void r(MainActivity mainActivity, if8 if8Var) {
        mainActivity.tabFragmentProxy = if8Var;
    }

    public static void s(MainActivity mainActivity, MainBottomNavUi mainBottomNavUi) {
        mainActivity.ui = mainBottomNavUi;
    }
}
