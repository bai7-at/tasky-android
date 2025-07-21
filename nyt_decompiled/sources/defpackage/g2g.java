package defpackage;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Callable;

/* loaded from: classes3.dex */
public final class g2g extends l1a {
    private final b9f c;
    final Map d;

    public g2g(b9f b9fVar) {
        super("require");
        this.d = new HashMap();
        this.c = b9fVar;
    }

    @Override // defpackage.l1a
    public final caa b(xhe xheVar, List list) {
        caa caaVar;
        s0f.h("require", 1, list);
        String zzi = xheVar.b((caa) list.get(0)).zzi();
        if (this.d.containsKey(zzi)) {
            return (caa) this.d.get(zzi);
        }
        b9f b9fVar = this.c;
        if (b9fVar.a.containsKey(zzi)) {
            try {
                caaVar = (caa) ((Callable) b9fVar.a.get(zzi)).call();
            } catch (Exception unused) {
                throw new IllegalStateException("Failed to create API implementation: ".concat(String.valueOf(zzi)));
            }
        } else {
            caaVar = caa.T;
        }
        if (caaVar instanceof l1a) {
            this.d.put(zzi, (l1a) caaVar);
        }
        return caaVar;
    }
}
