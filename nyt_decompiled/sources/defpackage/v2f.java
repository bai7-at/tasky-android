package defpackage;

import android.net.Uri;
import java.util.Map;

/* loaded from: classes3.dex */
public final class v2f {
    private final Map a;

    v2f(Map map) {
        this.a = map;
    }

    public final String a(Uri uri, String str, String str2, String str3) {
        if (uri == null) {
            return null;
        }
        Map map = (Map) this.a.get(uri.toString());
        if (map == null) {
            return null;
        }
        return (String) map.get("".concat(String.valueOf(str3)));
    }
}
