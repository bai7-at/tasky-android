package defpackage;

import android.content.SharedPreferences;
import com.nytimes.android.share.ShareAnalyticsReporter;
import com.nytimes.android.share.ShareBroadcastReceiver;

/* loaded from: classes4.dex */
public abstract class pp7 implements op4 {
    public static void a(ShareBroadcastReceiver shareBroadcastReceiver, m17 m17Var) {
        shareBroadcastReceiver.reviewStorage = m17Var;
    }

    public static void b(ShareBroadcastReceiver shareBroadcastReceiver, ShareAnalyticsReporter shareAnalyticsReporter) {
        shareBroadcastReceiver.shareAnalyticsReporter = shareAnalyticsReporter;
    }

    public static void c(ShareBroadcastReceiver shareBroadcastReceiver, SharedPreferences sharedPreferences) {
        shareBroadcastReceiver.sharedPreferences = sharedPreferences;
    }
}
