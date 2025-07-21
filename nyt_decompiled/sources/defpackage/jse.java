package defpackage;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes3.dex */
public final class jse {
    final Map a = new HashMap();
    final Map b = new HashMap();

    /* synthetic */ jse(ise iseVar) {
    }

    public final jse a(Enum r2, Object obj) {
        this.a.put(r2, obj);
        this.b.put(obj, r2);
        return this;
    }

    public final nse b() {
        return new nse(Collections.unmodifiableMap(this.a), Collections.unmodifiableMap(this.b), null);
    }
}
