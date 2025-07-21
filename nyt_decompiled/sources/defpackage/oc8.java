package defpackage;

import android.app.ActivityManager;
import android.database.Cursor;
import android.net.Uri;

/* loaded from: classes.dex */
public final class oc8 {
    public static final oc8 a = new oc8();

    private oc8() {
    }

    public static final Uri a(Cursor cursor) {
        zq3.h(cursor, "cursor");
        Uri notificationUri = cursor.getNotificationUri();
        zq3.g(notificationUri, "cursor.notificationUri");
        return notificationUri;
    }

    public static final boolean b(ActivityManager activityManager) {
        zq3.h(activityManager, "activityManager");
        return activityManager.isLowRamDevice();
    }
}
