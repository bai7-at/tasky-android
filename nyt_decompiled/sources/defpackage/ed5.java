package defpackage;

import android.content.res.Resources;
import com.nytimes.android.entitlements.a;
import com.nytimes.android.messaging.OfflineCard;
import com.nytimes.android.saved.SavedManager;
import com.nytimes.android.utils.AppPreferences;

/* loaded from: classes4.dex */
public abstract class ed5 implements op4 {
    public static void a(OfflineCard offlineCard, AppPreferences appPreferences) {
        offlineCard.appPreferences = appPreferences;
    }

    public static void b(OfflineCard offlineCard, a aVar) {
        offlineCard.ecommClient = aVar;
    }

    public static void c(OfflineCard offlineCard, qv6 qv6Var) {
        offlineCard.remoteConfig = qv6Var;
    }

    public static void d(OfflineCard offlineCard, Resources resources) {
        offlineCard.resources = resources;
    }

    public static void e(OfflineCard offlineCard, SavedManager savedManager) {
        offlineCard.savedManager = savedManager;
    }
}
