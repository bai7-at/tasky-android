package defpackage;

import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import com.nytimes.android.notification.NotificationTrampolineActivity;

/* loaded from: classes4.dex */
public abstract class v95 {
    public static final PendingIntent a(Context context, String str, String str2, String str3, String str4) {
        zq3.h(context, "<this>");
        zq3.h(str, "action");
        PendingIntent o = ug8.j(context).c(new Intent(context.getApplicationContext(), (Class<?>) NotificationTrampolineActivity.class).setAction(str).putExtra("com.nytimes.android.notification.URI", str2).putExtra("com.nytimes.android.notification.URL", str3).putExtra("com.nytimes.android.notification.TITLE", str4)).o(0, 201326592);
        if (o != null) {
            return o;
        }
        throw new IllegalStateException("The obtained PendingIntent. May return null only if PendingIntent.FLAG_NO_CREATE has been supplied.");
    }
}
