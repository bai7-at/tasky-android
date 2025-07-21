package defpackage;

import com.nytimes.android.entitlements.a;
import com.nytimes.android.features.settings.LogOutDialog;
import com.nytimes.android.latestfeed.feed.FeedStore;

/* loaded from: classes4.dex */
public abstract class q84 implements op4 {
    public static void a(LogOutDialog logOutDialog, a aVar) {
        logOutDialog.ecommClient = aVar;
    }

    public static void b(LogOutDialog logOutDialog, FeedStore feedStore) {
        logOutDialog.feedStore = feedStore;
    }
}
