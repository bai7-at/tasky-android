package defpackage;

import java.util.List;
import java.util.Map;

/* loaded from: classes3.dex */
final class qic implements x0c {
    private final Map a;
    private final Map b;
    private final Map c;
    private final l4f d;
    private final clc e;

    qic(Map map, Map map2, Map map3, l4f l4fVar, clc clcVar) {
        this.a = map;
        this.b = map2;
        this.c = map3;
        this.d = l4fVar;
        this.e = clcVar;
    }

    @Override // defpackage.x0c
    public final g9d a(int i, String str) {
        g9d a;
        g9d g9dVar = (g9d) this.a.get(str);
        if (g9dVar != null) {
            return g9dVar;
        }
        if (i != 1) {
            if (i != 4) {
                return null;
            }
            gcd gcdVar = (gcd) this.c.get(str);
            if (gcdVar != null) {
                return new h9d(gcdVar, new gge() { // from class: z0c
                    @Override // defpackage.gge
                    public final Object apply(Object obj) {
                        return new c1c((List) obj);
                    }
                });
            }
            a = (g9d) this.b.get(str);
            if (a == null) {
                return null;
            }
        } else if (this.e.e() == null || (a = ((x0c) this.d.zzb()).a(i, str)) == null) {
            return null;
        }
        return new h9d(a, new gge() { // from class: a1c
            @Override // defpackage.gge
            public final Object apply(Object obj) {
                return new c1c((u0c) obj);
            }
        });
    }
}
