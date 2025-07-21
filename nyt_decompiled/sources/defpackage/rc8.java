package defpackage;

import android.content.ContentResolver;
import android.database.Cursor;
import android.net.Uri;
import java.util.List;

/* loaded from: classes.dex */
public final class rc8 {
    public static final rc8 a = new rc8();

    private rc8() {
    }

    public static final List a(Cursor cursor) {
        zq3.h(cursor, "cursor");
        List<Uri> notificationUris = cursor.getNotificationUris();
        zq3.e(notificationUris);
        return notificationUris;
    }

    public static final void b(Cursor cursor, ContentResolver contentResolver, List list) {
        zq3.h(cursor, "cursor");
        zq3.h(contentResolver, "cr");
        zq3.h(list, "uris");
        cursor.setNotificationUris(contentResolver, list);
    }
}
