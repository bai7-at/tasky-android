package defpackage;

import com.nytimes.android.features.settings.push.NotificationsSettingsFragment;
import com.nytimes.android.utils.AppPreferences;

/* loaded from: classes4.dex */
public abstract class ta5 implements op4 {
    public static void a(NotificationsSettingsFragment notificationsSettingsFragment, AppPreferences appPreferences) {
        notificationsSettingsFragment.appPreferences = appPreferences;
    }

    public static void b(NotificationsSettingsFragment notificationsSettingsFragment, tm tmVar) {
        notificationsSettingsFragment.appPreferencesManager = tmVar;
    }
}
