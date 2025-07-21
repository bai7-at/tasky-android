package defpackage;

import com.nytimes.android.abra.AbraManager;
import com.nytimes.android.entitlements.a;
import com.nytimes.android.features.settings.AccountSettingsPresenter;
import com.nytimes.android.features.settings.SettingsFragment;
import com.nytimes.android.latestfeed.feed.FeedStore;
import com.nytimes.android.messaging.postloginregioffers.PostLoginRegiOfferManager;
import com.nytimes.android.utils.AppPreferences;
import com.nytimes.android.utils.NetworkStatus;
import com.nytimes.android.utils.snackbar.SnackbarUtil;

/* loaded from: classes4.dex */
public abstract class jn7 implements op4 {
    public static void a(SettingsFragment settingsFragment, AbraManager abraManager) {
        settingsFragment.abraManager = abraManager;
    }

    public static void b(SettingsFragment settingsFragment, AccountSettingsPresenter accountSettingsPresenter) {
        settingsFragment.accountSettingsPresenter = accountSettingsPresenter;
    }

    public static void c(SettingsFragment settingsFragment, jc jcVar) {
        settingsFragment.analyticsClient = jcVar;
    }

    public static void d(SettingsFragment settingsFragment, AppPreferences appPreferences) {
        settingsFragment.appPreferences = appPreferences;
    }

    public static void e(SettingsFragment settingsFragment, tm tmVar) {
        settingsFragment.appPreferencesManager = tmVar;
    }

    public static void f(SettingsFragment settingsFragment, rn1 rn1Var) {
        settingsFragment.betaSettingActivityNavigator = rn1Var;
    }

    public static void g(SettingsFragment settingsFragment, a aVar) {
        settingsFragment.eCommClient = aVar;
    }

    public static void h(SettingsFragment settingsFragment, cb2 cb2Var) {
        settingsFragment.featureFlagUtil = cb2Var;
    }

    public static void i(SettingsFragment settingsFragment, FeedStore feedStore) {
        settingsFragment.feedStore = feedStore;
    }

    public static void j(SettingsFragment settingsFragment, yc2 yc2Var) {
        settingsFragment.feedback = yc2Var;
    }

    public static void k(SettingsFragment settingsFragment, uy3 uy3Var) {
        settingsFragment.launchPlpHelper = uy3Var;
    }

    public static void l(SettingsFragment settingsFragment, NetworkStatus networkStatus) {
        settingsFragment.networkStatus = networkStatus;
    }

    public static void m(SettingsFragment settingsFragment, i65 i65Var) {
        settingsFragment.nightModeInstaller = i65Var;
    }

    public static void n(SettingsFragment settingsFragment, PostLoginRegiOfferManager postLoginRegiOfferManager) {
        settingsFragment.postLoginRegiManager = postLoginRegiOfferManager;
    }

    public static void o(SettingsFragment settingsFragment, s96 s96Var) {
        settingsFragment.purrUIClientApi = s96Var;
    }

    public static void p(SettingsFragment settingsFragment, fp6 fp6Var) {
        settingsFragment.reAuthLauncher = fp6Var;
    }

    public static void q(SettingsFragment settingsFragment, SnackbarUtil snackbarUtil) {
        settingsFragment.snackbarUtil = snackbarUtil;
    }

    public static void r(SettingsFragment settingsFragment, id9 id9Var) {
        settingsFragment.webActivityNavigator = id9Var;
    }
}
