package defpackage;

import java.util.Locale;
import java.util.Map;

/* loaded from: classes.dex */
class kn9 {
    private final boolean a;
    private final Map b;

    kn9(boolean z, Map map) {
        this.a = z;
        this.b = map;
    }

    String a() {
        return String.format(Locale.getDefault(), "{\"auth\":\"%s\", \"info\":\"%s\"}", Boolean.valueOf(this.a), this.b);
    }
}
