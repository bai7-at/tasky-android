package defpackage;

import java.util.LinkedHashMap;
import java.util.Map;

/* loaded from: classes.dex */
public final class uu1 {
    private final Map a = new LinkedHashMap();

    public final void a(Object obj, float f) {
        this.a.put(obj, Float.valueOf(f));
    }

    public final Map b() {
        return this.a;
    }
}
