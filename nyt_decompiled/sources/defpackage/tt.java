package defpackage;

import java.util.Iterator;
import java.util.List;
import org.threeten.bp.Instant;

/* loaded from: classes.dex */
public abstract class tt {
    private final vt h(st stVar, long j) {
        String d = stVar.d();
        Instant now = Instant.now();
        zq3.g(now, "now(...)");
        return new vt(0L, j, d, now, stVar.b(), stVar.c(), stVar.a(), stVar.e(), 1, null);
    }

    public abstract void a(long j, String str);

    public abstract void b();

    public abstract void c(String str, long j);

    public abstract void d(Instant instant);

    protected abstract List e(vt... vtVarArr);

    public void f(long j, List list) {
        vt a;
        zq3.h(list, "assetSources");
        Iterator it2 = list.iterator();
        while (it2.hasNext()) {
            st stVar = (st) it2.next();
            vt g = g(j, stVar.d(), stVar.c(), stVar.a(), stVar.e());
            if (g == null) {
                e(h(stVar, j));
            } else if (g.e() != null && (stVar.b() == null || stVar.b().compareTo(g.e()) > 0)) {
                a = g.a((r22 & 1) != 0 ? g.a : 0L, (r22 & 2) != 0 ? g.b : 0L, (r22 & 4) != 0 ? g.c : null, (r22 & 8) != 0 ? g.d : null, (r22 & 16) != 0 ? g.e : stVar.b(), (r22 & 32) != 0 ? g.f : null, (r22 & 64) != 0 ? g.g : null, (r22 & 128) != 0 ? g.h : null);
                i(a);
            }
        }
    }

    public abstract vt g(long j, String str, Long l, String str2, String str3);

    protected abstract void i(vt vtVar);
}
