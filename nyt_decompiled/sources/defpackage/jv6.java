package defpackage;

import android.net.Uri;
import kotlin.text.Regex;

/* loaded from: classes3.dex */
public final class jv6 {
    public static final jv6 a = new jv6();
    private static final Regex b = new Regex("/(games|puzzles)/.*");
    public static final int c = 8;

    private jv6() {
    }

    public final boolean a(String str) {
        zq3.h(str, "url");
        Regex regex = b;
        String path = Uri.parse(str).getPath();
        if (path == null) {
            path = "";
        }
        return regex.d(path);
    }
}
