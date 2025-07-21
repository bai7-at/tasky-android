package defpackage;

import java.security.GeneralSecurityException;
import java.util.Map;

/* loaded from: classes3.dex */
public final class nse {
    private final Map a;
    private final Map b;

    /* synthetic */ nse(Map map, Map map2, kse kseVar) {
        this.a = map;
        this.b = map2;
    }

    public static jse a() {
        return new jse(null);
    }

    public final Enum b(Object obj) {
        Enum r1 = (Enum) this.b.get(obj);
        if (r1 != null) {
            return r1;
        }
        throw new GeneralSecurityException("Unable to convert object enum: ".concat(String.valueOf(obj)));
    }

    public final Object c(Enum r2) {
        Object obj = this.a.get(r2);
        if (obj != null) {
            return obj;
        }
        throw new GeneralSecurityException("Unable to convert proto enum: ".concat(String.valueOf(r2)));
    }
}
