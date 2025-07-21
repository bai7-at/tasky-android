package defpackage;

import com.nytimes.android.abra.AbraManager;
import com.nytimes.android.features.settings.AboutFragment;
import com.nytimes.android.features.settings.SettingsPageEventSender;
import com.nytimes.android.utils.snackbar.SnackbarUtil;
import kotlinx.coroutines.flow.Flow;

/* loaded from: classes4.dex */
public abstract class l0 implements op4 {
    public static void a(AboutFragment aboutFragment, AbraManager abraManager) {
        aboutFragment.abraManager = abraManager;
    }

    public static void b(AboutFragment aboutFragment, ae0 ae0Var) {
        aboutFragment.buildInfo = ae0Var;
    }

    public static void c(AboutFragment aboutFragment, cb2 cb2Var) {
        aboutFragment.featureFlagUtil = cb2Var;
    }

    public static void d(AboutFragment aboutFragment, yc2 yc2Var) {
        aboutFragment.feedback = yc2Var;
    }

    public static void e(AboutFragment aboutFragment, yc2 yc2Var) {
        aboutFragment.feedbackHelper = yc2Var;
    }

    public static void f(AboutFragment aboutFragment, Flow flow) {
        aboutFragment.firebaseInstanceIdFlow = flow;
    }

    public static void g(AboutFragment aboutFragment, d96 d96Var) {
        aboutFragment.purrManagerClient = d96Var;
    }

    public static void h(AboutFragment aboutFragment, qv6 qv6Var) {
        aboutFragment.remoteConfig = qv6Var;
    }

    public static void i(AboutFragment aboutFragment, SettingsPageEventSender settingsPageEventSender) {
        aboutFragment.settingsPageEventSender = settingsPageEventSender;
    }

    public static void j(AboutFragment aboutFragment, SnackbarUtil snackbarUtil) {
        aboutFragment.snackbarUtil = snackbarUtil;
    }

    public static void k(AboutFragment aboutFragment, id9 id9Var) {
        aboutFragment.webActivityNavigator = id9Var;
    }
}
