package defpackage;

import io.opentelemetry.sdk.metrics.InstrumentType;
import io.opentelemetry.sdk.metrics.internal.debug.a;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.logging.Logger;

/* loaded from: classes5.dex */
public final class hb9 {
    static final d99 c;
    static final zu6 d;
    private static final Logger e;
    private final Map a = new HashMap();
    private final List b;

    static {
        d99 a = d99.a().a();
        c = a;
        d = zu6.a(fm3.a().b("*").a(), a, g85.a, 2000, a.a());
        e = Logger.getLogger(hb9.class.getName());
    }

    hb9(sd1 sd1Var, gi0 gi0Var, List list) {
        for (InstrumentType instrumentType : InstrumentType.values()) {
            this.a.put(instrumentType, zu6.a(fm3.a().b("*").a(), d99.a().b(sd1Var.a(instrumentType)).a(), jv.a(), gi0Var.a(instrumentType), a.a()));
        }
        this.b = list;
    }

    public static hb9 a(sd1 sd1Var, gi0 gi0Var, List list) {
        return new hb9(sd1Var, gi0Var, new ArrayList(list));
    }
}
