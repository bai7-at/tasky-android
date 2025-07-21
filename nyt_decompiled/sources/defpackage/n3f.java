package defpackage;

import java.util.Collections;
import java.util.Map;

/* loaded from: classes3.dex */
abstract class n3f implements v3f {
    private final Map a;

    n3f(Map map) {
        this.a = Collections.unmodifiableMap(map);
    }

    final Map a() {
        return this.a;
    }
}
