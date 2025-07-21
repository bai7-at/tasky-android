package defpackage;

import java.util.HashMap;
import java.util.List;

/* loaded from: classes3.dex */
public final class abf extends l1a {
    private final vs9 c;

    public abf(vs9 vs9Var) {
        super("internal.eventLogger");
        this.c = vs9Var;
    }

    @Override // defpackage.l1a
    public final caa b(xhe xheVar, List list) {
        s0f.h(this.a, 3, list);
        String zzi = xheVar.b((caa) list.get(0)).zzi();
        long a = (long) s0f.a(xheVar.b((caa) list.get(1)).zzh().doubleValue());
        caa b = xheVar.b((caa) list.get(2));
        this.c.e(zzi, a, b instanceof m6a ? s0f.g((m6a) b) : new HashMap());
        return caa.T;
    }
}
