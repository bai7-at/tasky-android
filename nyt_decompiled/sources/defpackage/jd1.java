package defpackage;

import android.net.Uri;
import kotlin.text.h;

/* loaded from: classes4.dex */
public abstract class jd1 {
    private static final boolean a(String str, String str2) {
        return zq3.c(h.F(str, "/", "", false, 4, null), h.F(str2, "/", "", false, 4, null));
    }

    public static final boolean b(Uri uri, String str) {
        String host;
        zq3.h(uri, "<this>");
        zq3.h(str, "prefix");
        String path = uri.getPath();
        if (path == null) {
            path = "";
        }
        return h.P(path, str, false, 2, null) || ((host = uri.getHost()) != null && a(str, host));
    }
}
