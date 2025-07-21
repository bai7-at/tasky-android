package defpackage;

import android.content.SharedPreferences;
import com.nytimes.android.AbraLoginObserver;
import com.nytimes.android.ForegroundStateObserver;
import com.nytimes.android.NYTApplication;
import com.nytimes.android.ads.analytics.AdEventTracker;
import com.nytimes.android.analytics.eventtracker.EventTrackerInitializer;
import com.nytimes.android.entitlements.purr.PurrLoginManager;
import com.nytimes.android.gateway.AnalyticsSubauthHelper;
import com.nytimes.android.latestfeed.feed.FeedStore;
import com.nytimes.android.libs.iterate.IterateInitializer;
import com.nytimes.android.logging.remote.stream.LoggingRemoteStreamManager;
import com.nytimes.android.performancetrackerclientphoenix.event.MainThreadTracker;
import com.nytimes.android.performancetrackerclientphoenix.event.MetricsTracker;
import com.nytimes.android.performancetrackerclientphoenix.tracing.a;
import com.nytimes.android.push.NotificationChannelHelper;
import com.nytimes.android.push.PushMessageHandler;
import com.nytimes.android.recentlyviewed.RecentlyViewedManager;
import com.nytimes.android.saved.synchronization.SavedListFlyWeight;
import com.nytimes.android.utils.LegacyFileUtils;
import com.nytimes.android.utils.NetworkStatus;
import com.nytimes.android.utils.TrackingIdInitializer;
import kotlinx.coroutines.CoroutineScope;

/* loaded from: classes2.dex */
public abstract class a05 implements op4 {
    public static void A(NYTApplication nYTApplication, i65 i65Var) {
        nYTApplication.nightModeInstaller = i65Var;
    }

    public static void B(NYTApplication nYTApplication, k65 k65Var) {
        nYTApplication.nightModeRuntimeApplier = k65Var;
    }

    public static void C(NYTApplication nYTApplication, NotificationChannelHelper notificationChannelHelper) {
        nYTApplication.notificationChannelHelper = notificationChannelHelper;
    }

    public static void D(NYTApplication nYTApplication, b04 b04Var) {
        nYTApplication.okHttpClient = b04Var;
    }

    public static void E(NYTApplication nYTApplication, b97 b97Var) {
        nYTApplication.otSync = b97Var;
    }

    public static void F(NYTApplication nYTApplication, cr5 cr5Var) {
        nYTApplication.performanceTrackerClient = cr5Var;
    }

    public static void G(NYTApplication nYTApplication, PurrLoginManager purrLoginManager) {
        nYTApplication.purrLoginManager = purrLoginManager;
    }

    public static void H(NYTApplication nYTApplication, PushMessageHandler pushMessageHandler) {
        nYTApplication.pushMessageHandler = pushMessageHandler;
    }

    public static void I(NYTApplication nYTApplication, RecentlyViewedManager recentlyViewedManager) {
        nYTApplication.recentlyViewedManager = recentlyViewedManager;
    }

    public static void J(NYTApplication nYTApplication, b04 b04Var) {
        nYTApplication.resourceRetriever = b04Var;
    }

    public static void K(NYTApplication nYTApplication, SavedListFlyWeight savedListFlyWeight) {
        nYTApplication.savedListFlyWeight = savedListFlyWeight;
    }

    public static void L(NYTApplication nYTApplication, b04 b04Var) {
        nYTApplication.savedManager = b04Var;
    }

    public static void M(NYTApplication nYTApplication, SharedPreferences sharedPreferences) {
        nYTApplication.sharedPreferences = sharedPreferences;
    }

    public static void N(NYTApplication nYTApplication, kn knVar) {
        nYTApplication.snackbarAttacher = knVar;
    }

    public static void O(NYTApplication nYTApplication, z58 z58Var) {
        nYTApplication.subauthClient = z58Var;
    }

    public static void P(NYTApplication nYTApplication, rj8 rj8Var) {
        nYTApplication.textResizeApplier = rj8Var;
    }

    public static void Q(NYTApplication nYTApplication, a aVar) {
        nYTApplication.tracingMetadata = aVar;
    }

    public static void R(NYTApplication nYTApplication, TrackingIdInitializer trackingIdInitializer) {
        nYTApplication.trackingIdInitializer = trackingIdInitializer;
    }

    public static void S(NYTApplication nYTApplication, yx8 yx8Var) {
        nYTApplication.updateWorkerScheduler = yx8Var;
    }

    public static void a(NYTApplication nYTApplication, AbraLoginObserver abraLoginObserver) {
        nYTApplication.abraLoginObserver = abraLoginObserver;
    }

    public static void b(NYTApplication nYTApplication, com.nytimes.abtests.a aVar) {
        nYTApplication.activityReporter = aVar;
    }

    public static void c(NYTApplication nYTApplication, AdEventTracker adEventTracker) {
        nYTApplication.adEventTracker = adEventTracker;
    }

    public static void d(NYTApplication nYTApplication, AnalyticsSubauthHelper analyticsSubauthHelper) {
        nYTApplication.analyticsSubauthHelper = analyticsSubauthHelper;
    }

    public static void e(NYTApplication nYTApplication, lm lmVar) {
        nYTApplication.appLaunchPerformanceTracker = lmVar;
    }

    public static void f(NYTApplication nYTApplication, xm xmVar) {
        nYTApplication.appShortcutManager = xmVar;
    }

    public static void g(NYTApplication nYTApplication, CoroutineScope coroutineScope) {
        nYTApplication.applicationScope = coroutineScope;
    }

    public static void h(NYTApplication nYTApplication, bp0 bp0Var) {
        nYTApplication.comScoreWrapper = bp0Var;
    }

    public static void i(NYTApplication nYTApplication, com.nytimes.android.entitlements.a aVar) {
        nYTApplication.eCommClient = aVar;
    }

    public static void j(NYTApplication nYTApplication, hx1 hx1Var) {
        nYTApplication.eCommPerformanceTracker = hx1Var;
    }

    public static void k(NYTApplication nYTApplication, qz1 qz1Var) {
        nYTApplication.embraceInitializer = qz1Var;
    }

    public static void l(NYTApplication nYTApplication, wc wcVar) {
        nYTApplication.eventManager = wcVar;
    }

    public static void m(NYTApplication nYTApplication, EventTrackerInitializer eventTrackerInitializer) {
        nYTApplication.eventTrackerInitializer = eventTrackerInitializer;
    }

    public static void n(NYTApplication nYTApplication, d92 d92Var) {
        nYTApplication.facebookLoggerLifecycleCallbacks = d92Var;
    }

    public static void o(NYTApplication nYTApplication, cb2 cb2Var) {
        nYTApplication.featureFlagUtil = cb2Var;
    }

    public static void p(NYTApplication nYTApplication, FeedStore feedStore) {
        nYTApplication.feedStore = feedStore;
    }

    public static void q(NYTApplication nYTApplication, le2 le2Var) {
        nYTApplication.fileLog = le2Var;
    }

    public static void r(NYTApplication nYTApplication, ForegroundStateObserver foregroundStateObserver) {
        nYTApplication.foregroundStateObserver = foregroundStateObserver;
    }

    public static void s(NYTApplication nYTApplication, IterateInitializer iterateInitializer) {
        nYTApplication.iterateInitializer = iterateInitializer;
    }

    public static void t(NYTApplication nYTApplication, LegacyFileUtils legacyFileUtils) {
        nYTApplication.legacyFileUtils = legacyFileUtils;
    }

    public static void u(NYTApplication nYTApplication, y74 y74Var) {
        nYTApplication.lockerCallbacks = y74Var;
    }

    public static void v(NYTApplication nYTApplication, LoggingRemoteStreamManager loggingRemoteStreamManager) {
        nYTApplication.loggingRemoteStreamManager = loggingRemoteStreamManager;
    }

    public static void w(NYTApplication nYTApplication, MainThreadTracker mainThreadTracker) {
        nYTApplication.mainThreadTracker = mainThreadTracker;
    }

    public static void x(NYTApplication nYTApplication, b04 b04Var) {
        nYTApplication.memoryUsageMonitor = b04Var;
    }

    public static void y(NYTApplication nYTApplication, MetricsTracker metricsTracker) {
        nYTApplication.metricsTracker = metricsTracker;
    }

    public static void z(NYTApplication nYTApplication, NetworkStatus networkStatus) {
        nYTApplication.networkStatus = networkStatus;
    }
}
