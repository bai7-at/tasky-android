package defpackage;

import android.net.Uri;
import java.util.Map;

/* loaded from: classes3.dex */
public final class x6e {
    private final String a = (String) kra.b.e();

    public final String a(Map map) {
        Uri.Builder buildUpon = Uri.parse(this.a).buildUpon();
        for (Map.Entry entry : map.entrySet()) {
            buildUpon.appendQueryParameter((String) entry.getKey(), (String) entry.getValue());
        }
        return buildUpon.build().toString();
    }
}
