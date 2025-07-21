package defpackage;

import android.net.Uri;
import com.nytimes.android.api.cms.AssetConstants;

/* loaded from: classes2.dex */
public abstract class uo4 {
    public static boolean a(Uri uri) {
        return b(uri) && !e(uri);
    }

    public static boolean b(Uri uri) {
        return uri != null && "content".equals(uri.getScheme()) && "media".equals(uri.getAuthority());
    }

    public static boolean c(Uri uri) {
        return b(uri) && e(uri);
    }

    public static boolean d(int i, int i2) {
        return i != Integer.MIN_VALUE && i2 != Integer.MIN_VALUE && i <= 512 && i2 <= 384;
    }

    private static boolean e(Uri uri) {
        return uri.getPathSegments().contains(AssetConstants.VIDEO_TYPE);
    }
}
