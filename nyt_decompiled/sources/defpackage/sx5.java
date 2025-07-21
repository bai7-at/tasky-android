package defpackage;

import com.comscore.streaming.ContentMediaFormat;
import io.embrace.android.embracesdk.config.behavior.NetworkBehavior;

/* loaded from: classes.dex */
public abstract class sx5 {
    private static final px5 a = new eg(NetworkBehavior.DEFAULT_NETWORK_CALL_LIMIT);
    private static final px5 b = new eg(ContentMediaFormat.PREVIEW_GENERIC);
    private static final px5 c = new eg(ContentMediaFormat.PREVIEW_EPISODE);
    private static final px5 d = new eg(ContentMediaFormat.FULL_CONTENT_EPISODE);

    public static final px5 a(int i) {
        return new eg(i);
    }

    public static final px5 b() {
        return b;
    }

    public static final px5 c() {
        return a;
    }

    public static final px5 d() {
        return d;
    }

    public static final px5 e() {
        return c;
    }
}
