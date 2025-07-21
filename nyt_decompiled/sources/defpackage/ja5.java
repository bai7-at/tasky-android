package defpackage;

import android.content.SharedPreferences;
import com.nytimes.android.features.settings.SettingsPageEventSender;
import com.nytimes.android.features.settings.push.NotificationsFragment;
import com.nytimes.android.utils.snackbar.SnackbarUtil;

/* loaded from: classes4.dex */
public abstract class ja5 implements op4 {
    public static void a(NotificationsFragment notificationsFragment, la5 la5Var) {
        notificationsFragment.notificationsHelper = la5Var;
    }

    public static void b(NotificationsFragment notificationsFragment, SettingsPageEventSender settingsPageEventSender) {
        notificationsFragment.settingsPageEventSender = settingsPageEventSender;
    }

    public static void c(NotificationsFragment notificationsFragment, SharedPreferences sharedPreferences) {
        notificationsFragment.sharedPreferences = sharedPreferences;
    }

    public static void d(NotificationsFragment notificationsFragment, SnackbarUtil snackbarUtil) {
        notificationsFragment.snackbarUtil = snackbarUtil;
    }
}
