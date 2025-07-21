package defpackage;

import com.nytimes.android.dailyfive.analytics.DailyFiveAnalytics;
import com.nytimes.android.dailyfive.ui.DailyFiveFragment;
import com.nytimes.android.dailyfive.ui.b;
import com.nytimes.android.dailyfive.ui.items.DailyFiveViewItemProvider;

/* loaded from: classes4.dex */
public abstract class z71 implements op4 {
    public static void a(DailyFiveFragment dailyFiveFragment, DailyFiveAnalytics dailyFiveAnalytics) {
        dailyFiveFragment.analytics = dailyFiveAnalytics;
    }

    public static void b(DailyFiveFragment dailyFiveFragment, b bVar) {
        dailyFiveFragment.eventsManager = bVar;
    }

    public static void c(DailyFiveFragment dailyFiveFragment, cb2 cb2Var) {
        dailyFiveFragment.featureFlagUtil = cb2Var;
    }

    public static void d(DailyFiveFragment dailyFiveFragment, vb2 vb2Var) {
        dailyFiveFragment.feedPerformanceTracker = vb2Var;
    }

    public static void e(DailyFiveFragment dailyFiveFragment, td4 td4Var) {
        dailyFiveFragment.mainActivityNavigator = td4Var;
    }

    public static void f(DailyFiveFragment dailyFiveFragment, b35 b35Var) {
        dailyFiveFragment.navigationStateHolder = b35Var;
    }

    public static void g(DailyFiveFragment dailyFiveFragment, j81 j81Var) {
        dailyFiveFragment.navigator = j81Var;
    }

    public static void h(DailyFiveFragment dailyFiveFragment, mn7 mn7Var) {
        dailyFiveFragment.settingsMenuManager = mn7Var;
    }

    public static void i(DailyFiveFragment dailyFiveFragment, DailyFiveViewItemProvider dailyFiveViewItemProvider) {
        dailyFiveFragment.viewItemProvider = dailyFiveViewItemProvider;
    }
}
