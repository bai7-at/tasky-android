package defpackage;

import java.util.Collections;
import java.util.Map;

/* loaded from: classes4.dex */
public final class oe4 {
    private final Map a;

    private oe4(int i) {
        this.a = i61.b(i);
    }

    public static oe4 b(int i) {
        return new oe4(i);
    }

    public Map a() {
        return this.a.isEmpty() ? Collections.emptyMap() : Collections.unmodifiableMap(this.a);
    }

    public oe4 c(Object obj, Object obj2) {
        this.a.put(obj, obj2);
        return this;
    }
}
